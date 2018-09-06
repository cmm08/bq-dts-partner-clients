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
package com.google.cloud.bigquery.datatransfer.v1.stub;

import static com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListDataSourceDefinitionsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.Credentials;
import com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition;
import com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest;
import com.google.cloud.bigquery.datatransfer.v1.GetCredentialsRequest;
import com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse;
import com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest;
import com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest;
import com.google.cloud.bigquery.datatransfer.v1.TransferRun;
import com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for BigQuery Data Transfer API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class DataSourceServiceStub implements BackgroundResource {

  public UnaryCallable<UpdateTransferRunRequest, TransferRun> updateTransferRunCallable() {
    throw new UnsupportedOperationException("Not implemented: updateTransferRunCallable()");
  }

  public UnaryCallable<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesCallable() {
    throw new UnsupportedOperationException("Not implemented: logTransferRunMessagesCallable()");
  }

  public UnaryCallable<StartBigQueryJobsRequest, Empty> startBigQueryJobsCallable() {
    throw new UnsupportedOperationException("Not implemented: startBigQueryJobsCallable()");
  }

  public UnaryCallable<GetCredentialsRequest, Credentials> getCredentialsCallable() {
    throw new UnsupportedOperationException("Not implemented: getCredentialsCallable()");
  }

  public UnaryCallable<FinishRunRequest, Empty> finishRunCallable() {
    throw new UnsupportedOperationException("Not implemented: finishRunCallable()");
  }

  public UnaryCallable<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createDataSourceDefinitionCallable()");
  }

  public UnaryCallable<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateDataSourceDefinitionCallable()");
  }

  public UnaryCallable<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteDataSourceDefinitionCallable()");
  }

  public UnaryCallable<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionCallable() {
    throw new UnsupportedOperationException("Not implemented: getDataSourceDefinitionCallable()");
  }

  public UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listDataSourceDefinitionsPagedCallable()");
  }

  public UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDataSourceDefinitionsCallable()");
  }

  @Override
  public abstract void close();
}
