/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to BigQuery Data Transfer API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>========================= DataTransferServiceClient =========================
 *
 * <p>Service Description: The Google BigQuery Data Transfer Service API enables BigQuery users to
 * configure the transfer of their data from other Google Products into BigQuery. This service
 * contains methods that are end user exposed. It backs up the frontend.
 *
 * <p>Sample for DataTransferServiceClient:
 *
 * <pre>
 * <code>
 * try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
 *   String formattedName = DataTransferServiceClient.formatDataSourceName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE]");
 *   DataSource response = dataTransferServiceClient.getDataSource(formattedName);
 * }
 * </code>
 * </pre>
 *
 * ======================= DataSourceServiceClient =======================
 *
 * <p>Service Description: The Google BigQuery Data Transfer API allows BigQuery users to configure
 * transfer of their data from other Google Products into BigQuery. This service exposes methods
 * that should be used by data source backend.
 *
 * <p>Sample for DataSourceServiceClient:
 *
 * <pre>
 * <code>
 * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
 *   TransferRun transferRun = TransferRun.newBuilder().build();
 *   FieldMask updateMask = FieldMask.newBuilder().build();
 *   TransferRun response = dataSourceServiceClient.updateTransferRun(transferRun, updateMask);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.bigquery.datatransfer.v1;
