/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.bigquerydatatransfer;

// [START bigquerydatatransfer_quickstart]
// Imports the Google Cloud client library

import com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition;
import com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient;
import com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceSettings;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest;
import com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListDataSourceDefinitionsPagedResponse;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest;

import com.google.cloud.bigquery.datatransfer.v1.TransferConfig;
import com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient;
import com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings;
import com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListTransferConfigsPagedResponse;
import com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest;

public class DataTransferServiceClientSample {
  /**
   * List available data sources for the BigQuery Data Transfer service.
   */
  public static void main(String... args) throws Exception {
    // Sets your Google Cloud Platform project ID.
    // String projectId = "YOUR_PROJECT_ID";
    String projectId = args[0];

    // Instantiate a client. If you don't specify credentials when constructing a client, the
    // client library will look for credentials in the environment, such as the
    // GOOGLE_APPLICATION_CREDENTIALS environment variable.
    DataTransferServiceSettings dataTransferServiceSettings =
          DataTransferServiceSettings.newBuilder().setEndpoint("bigquerydatatransfer.googleapis.com:443").build();
    try (DataTransferServiceClient client = DataTransferServiceClient.create(dataTransferServiceSettings)) {
      // Request the list of available data sources.
      String parent = String.format("projects/%s/locations/us", projectId);
      ListTransferConfigsRequest request =
          ListTransferConfigsRequest.newBuilder()
              .setParent(parent)
              .build();
      ListTransferConfigsPagedResponse response = client.listTransferConfigs(request);

      // Print the results.
      System.out.println("Transfer configs:");
      for (TransferConfig transferConfig : response.iterateAll()) {
        System.out.println(transferConfig.getDisplayName());
        System.out.printf("\tFull Name: %s\n", transferConfig.getName());
        System.out.printf("\tData Source ID: %s\n", transferConfig.getDataSourceId());
        System.out.printf("\tDestination: %s\n", transferConfig.getDestinationDatasetId());
        System.out.printf("\tSchedule: %s\n", transferConfig.getSchedule());
      }
    }

    DataSourceServiceSettings dataSourceServiceSettings =
          DataSourceServiceSettings.newBuilder().setEndpoint("bigquerydatatransfer.googleapis.com:443").build();
    try (DataSourceServiceClient client = DataSourceServiceClient.create(dataSourceServiceSettings)) {
      // Request the list of available data sources.
      String parent = String.format("projects/%s/locations/us", projectId);
      ListDataSourceDefinitionsRequest request =
          ListDataSourceDefinitionsRequest.newBuilder()
              .setParent(parent)
              .build();
      ListDataSourceDefinitionsPagedResponse response = client.listDataSourceDefinitions(request);

      // Print the results.
      System.out.println("Data Source Definitions:");
      for (DataSourceDefinition dataSource : response.iterateAll()) {
        // System.out.println(dataSource.getDisplayName());
        System.out.printf("\tName: %s\n", dataSource.getName());
      }
    }
  }
}
// [END bigquerydatatransfer_quickstart]
