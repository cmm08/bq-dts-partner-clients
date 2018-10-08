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
package com.google.cloud.bigquery.datatransfer.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.bigquery.datatransfer.v1.stub.DataSourceServiceStub;
import com.google.cloud.bigquery.datatransfer.v1.stub.DataSourceServiceStubSettings;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The Google BigQuery Data Transfer API allows BigQuery users to configure
 * transfer of their data from other Google Products into BigQuery. This service exposes methods
 * that should be used by data source backend.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
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
 *
 * <p>Note: close() needs to be called on the dataSourceServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of DataSourceServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * DataSourceServiceSettings dataSourceServiceSettings =
 *     DataSourceServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DataSourceServiceClient dataSourceServiceClient =
 *     DataSourceServiceClient.create(dataSourceServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * DataSourceServiceSettings dataSourceServiceSettings =
 *     DataSourceServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DataSourceServiceClient dataSourceServiceClient =
 *     DataSourceServiceClient.create(dataSourceServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class DataSourceServiceClient implements BackgroundResource {
  private final DataSourceServiceSettings settings;
  private final DataSourceServiceStub stub;

  private static final PathTemplate LOCATION_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}");

  private static final PathTemplate DATA_SOURCE_DEFINITION_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/dataSourceDefinitions/{data_source_definition}");

  private static final PathTemplate RUN_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/transferConfigs/{transfer_config}/runs/{run}");

  /** Formats a string containing the fully-qualified path to represent a location resource. */
  public static final String formatLocationName(String project, String location) {
    return LOCATION_PATH_TEMPLATE.instantiate(
        "project", project,
        "location", location);
  }

  /**
   * Formats a string containing the fully-qualified path to represent a data_source_definition
   * resource.
   */
  public static final String formatDataSourceDefinitionName(
      String project, String location, String dataSourceDefinition) {
    return DATA_SOURCE_DEFINITION_PATH_TEMPLATE.instantiate(
        "project", project,
        "location", location,
        "data_source_definition", dataSourceDefinition);
  }

  /** Formats a string containing the fully-qualified path to represent a run resource. */
  public static final String formatRunName(
      String project, String location, String transferConfig, String run) {
    return RUN_PATH_TEMPLATE.instantiate(
        "project", project,
        "location", location,
        "transfer_config", transferConfig,
        "run", run);
  }

  /**
   * Parses the project from the given fully-qualified path which represents a location resource.
   */
  public static final String parseProjectFromLocationName(String locationName) {
    return LOCATION_PATH_TEMPLATE.parse(locationName).get("project");
  }

  /**
   * Parses the location from the given fully-qualified path which represents a location resource.
   */
  public static final String parseLocationFromLocationName(String locationName) {
    return LOCATION_PATH_TEMPLATE.parse(locationName).get("location");
  }

  /**
   * Parses the project from the given fully-qualified path which represents a
   * data_source_definition resource.
   */
  public static final String parseProjectFromDataSourceDefinitionName(
      String dataSourceDefinitionName) {
    return DATA_SOURCE_DEFINITION_PATH_TEMPLATE.parse(dataSourceDefinitionName).get("project");
  }

  /**
   * Parses the location from the given fully-qualified path which represents a
   * data_source_definition resource.
   */
  public static final String parseLocationFromDataSourceDefinitionName(
      String dataSourceDefinitionName) {
    return DATA_SOURCE_DEFINITION_PATH_TEMPLATE.parse(dataSourceDefinitionName).get("location");
  }

  /**
   * Parses the data_source_definition from the given fully-qualified path which represents a
   * data_source_definition resource.
   */
  public static final String parseDataSourceDefinitionFromDataSourceDefinitionName(
      String dataSourceDefinitionName) {
    return DATA_SOURCE_DEFINITION_PATH_TEMPLATE
        .parse(dataSourceDefinitionName)
        .get("data_source_definition");
  }

  /** Parses the project from the given fully-qualified path which represents a run resource. */
  public static final String parseProjectFromRunName(String runName) {
    return RUN_PATH_TEMPLATE.parse(runName).get("project");
  }

  /** Parses the location from the given fully-qualified path which represents a run resource. */
  public static final String parseLocationFromRunName(String runName) {
    return RUN_PATH_TEMPLATE.parse(runName).get("location");
  }

  /**
   * Parses the transfer_config from the given fully-qualified path which represents a run resource.
   */
  public static final String parseTransferConfigFromRunName(String runName) {
    return RUN_PATH_TEMPLATE.parse(runName).get("transfer_config");
  }

  /** Parses the run from the given fully-qualified path which represents a run resource. */
  public static final String parseRunFromRunName(String runName) {
    return RUN_PATH_TEMPLATE.parse(runName).get("run");
  }

  /** Constructs an instance of DataSourceServiceClient with default settings. */
  public static final DataSourceServiceClient create() throws IOException {
    return create(DataSourceServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DataSourceServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DataSourceServiceClient create(DataSourceServiceSettings settings)
      throws IOException {
    return new DataSourceServiceClient(settings);
  }

  /**
   * Constructs an instance of DataSourceServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use DataSourceServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final DataSourceServiceClient create(DataSourceServiceStub stub) {
    return new DataSourceServiceClient(stub);
  }

  /**
   * Constructs an instance of DataSourceServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected DataSourceServiceClient(DataSourceServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DataSourceServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected DataSourceServiceClient(DataSourceServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DataSourceServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DataSourceServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update a transfer run. If successful, resets data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   TransferRun transferRun = TransferRun.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   TransferRun response = dataSourceServiceClient.updateTransferRun(transferRun, updateMask);
   * }
   * </code></pre>
   *
   * @param transferRun Run name must be set and correspond to an already existing run. Only state,
   *     error_status, and data_version fields will be updated. All other fields will be ignored.
   * @param updateMask Required list of fields to be updated in this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TransferRun updateTransferRun(TransferRun transferRun, FieldMask updateMask) {

    UpdateTransferRunRequest request =
        UpdateTransferRunRequest.newBuilder()
            .setTransferRun(transferRun)
            .setUpdateMask(updateMask)
            .build();
    return updateTransferRun(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update a transfer run. If successful, resets data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   TransferRun transferRun = TransferRun.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateTransferRunRequest request = UpdateTransferRunRequest.newBuilder()
   *     .setTransferRun(transferRun)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   TransferRun response = dataSourceServiceClient.updateTransferRun(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TransferRun updateTransferRun(UpdateTransferRunRequest request) {
    return updateTransferRunCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update a transfer run. If successful, resets data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   TransferRun transferRun = TransferRun.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateTransferRunRequest request = UpdateTransferRunRequest.newBuilder()
   *     .setTransferRun(transferRun)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   ApiFuture&lt;TransferRun&gt; future = dataSourceServiceClient.updateTransferRunCallable().futureCall(request);
   *   // Do something
   *   TransferRun response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateTransferRunRequest, TransferRun> updateTransferRunCallable() {
    return stub.updateTransferRunCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Log messages for a transfer run. If successful (at least 1 message), resets
   * data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   List&lt;TransferMessage&gt; transferMessages = new ArrayList&lt;&gt;();
   *   dataSourceServiceClient.logTransferRunMessages(formattedName, transferMessages);
   * }
   * </code></pre>
   *
   * @param name Name of the resource in the form:
   *     "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * @param transferMessages Messages to append.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void logTransferRunMessages(String name, List<TransferMessage> transferMessages) {
    RUN_PATH_TEMPLATE.validate(name, "logTransferRunMessages");
    LogTransferRunMessagesRequest request =
        LogTransferRunMessagesRequest.newBuilder()
            .setName(name)
            .addAllTransferMessages(transferMessages)
            .build();
    logTransferRunMessages(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Log messages for a transfer run. If successful (at least 1 message), resets
   * data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   List&lt;TransferMessage&gt; transferMessages = new ArrayList&lt;&gt;();
   *   LogTransferRunMessagesRequest request = LogTransferRunMessagesRequest.newBuilder()
   *     .setName(formattedName)
   *     .addAllTransferMessages(transferMessages)
   *     .build();
   *   dataSourceServiceClient.logTransferRunMessages(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void logTransferRunMessages(LogTransferRunMessagesRequest request) {
    logTransferRunMessagesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Log messages for a transfer run. If successful (at least 1 message), resets
   * data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   List&lt;TransferMessage&gt; transferMessages = new ArrayList&lt;&gt;();
   *   LogTransferRunMessagesRequest request = LogTransferRunMessagesRequest.newBuilder()
   *     .setName(formattedName)
   *     .addAllTransferMessages(transferMessages)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = dataSourceServiceClient.logTransferRunMessagesCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<LogTransferRunMessagesRequest, Empty>
      logTransferRunMessagesCallable() {
    return stub.logTransferRunMessagesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Notify the Data Transfer Service that data is ready for loading. The Data Transfer Service will
   * start and monitor multiple BigQuery Load jobs for a transfer run. Monitored jobs will be
   * automatically retried and produce log messages when starting and finishing a job. Can be called
   * multiple times for the same transfer run.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   List&lt;ImportedDataInfo&gt; importedData = new ArrayList&lt;&gt;();
   *   ByteString userCredentials = ByteString.copyFromUtf8("");
   *   dataSourceServiceClient.startBigQueryJobs(formattedName, importedData, userCredentials);
   * }
   * </code></pre>
   *
   * @param name Name of the resource in the form:
   *     "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * @param importedData Import jobs which should be started and monitored.
   * @param userCredentials User credentials which should be used to start/monitor BigQuery jobs. If
   *     not specified, then jobs are started using data source service account credentials. This
   *     may be OAuth token or JWT token.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void startBigQueryJobs(
      String name, List<ImportedDataInfo> importedData, ByteString userCredentials) {
    RUN_PATH_TEMPLATE.validate(name, "startBigQueryJobs");
    StartBigQueryJobsRequest request =
        StartBigQueryJobsRequest.newBuilder()
            .setName(name)
            .addAllImportedData(importedData)
            .setUserCredentials(userCredentials)
            .build();
    startBigQueryJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Notify the Data Transfer Service that data is ready for loading. The Data Transfer Service will
   * start and monitor multiple BigQuery Load jobs for a transfer run. Monitored jobs will be
   * automatically retried and produce log messages when starting and finishing a job. Can be called
   * multiple times for the same transfer run.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   List&lt;ImportedDataInfo&gt; importedData = new ArrayList&lt;&gt;();
   *   ByteString userCredentials = ByteString.copyFromUtf8("");
   *   StartBigQueryJobsRequest request = StartBigQueryJobsRequest.newBuilder()
   *     .setName(formattedName)
   *     .addAllImportedData(importedData)
   *     .setUserCredentials(userCredentials)
   *     .build();
   *   dataSourceServiceClient.startBigQueryJobs(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void startBigQueryJobs(StartBigQueryJobsRequest request) {
    startBigQueryJobsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Notify the Data Transfer Service that data is ready for loading. The Data Transfer Service will
   * start and monitor multiple BigQuery Load jobs for a transfer run. Monitored jobs will be
   * automatically retried and produce log messages when starting and finishing a job. Can be called
   * multiple times for the same transfer run.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   List&lt;ImportedDataInfo&gt; importedData = new ArrayList&lt;&gt;();
   *   ByteString userCredentials = ByteString.copyFromUtf8("");
   *   StartBigQueryJobsRequest request = StartBigQueryJobsRequest.newBuilder()
   *     .setName(formattedName)
   *     .addAllImportedData(importedData)
   *     .setUserCredentials(userCredentials)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = dataSourceServiceClient.startBigQueryJobsCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<StartBigQueryJobsRequest, Empty> startBigQueryJobsCallable() {
    return stub.startBigQueryJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Notify the Data Transfer Service that the data source is done processing the run. No more
   * status updates or requests to start/monitor jobs will be accepted. The run will be finalized by
   * the Data Transfer Service when all monitored jobs are completed. Does not need to be called if
   * the run is set to FAILED.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   dataSourceServiceClient.finishRun(formattedName);
   * }
   * </code></pre>
   *
   * @param name Name of the resource in the form:
   *     "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void finishRun(String name) {
    RUN_PATH_TEMPLATE.validate(name, "finishRun");
    FinishRunRequest request = FinishRunRequest.newBuilder().setName(name).build();
    finishRun(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Notify the Data Transfer Service that the data source is done processing the run. No more
   * status updates or requests to start/monitor jobs will be accepted. The run will be finalized by
   * the Data Transfer Service when all monitored jobs are completed. Does not need to be called if
   * the run is set to FAILED.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   FinishRunRequest request = FinishRunRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   dataSourceServiceClient.finishRun(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void finishRun(FinishRunRequest request) {
    finishRunCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Notify the Data Transfer Service that the data source is done processing the run. No more
   * status updates or requests to start/monitor jobs will be accepted. The run will be finalized by
   * the Data Transfer Service when all monitored jobs are completed. Does not need to be called if
   * the run is set to FAILED.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatRunName("[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
   *   FinishRunRequest request = FinishRunRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = dataSourceServiceClient.finishRunCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<FinishRunRequest, Empty> finishRunCallable() {
    return stub.finishRunCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a data source definition. Calling this method will automatically use your credentials
   * to create the following Google Cloud resources in YOUR Google Cloud project. 1. OAuth client 2.
   * Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
   * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
   * The field data_source.client_id should be left empty in the input request, as the API will
   * create a new OAuth client on behalf of the caller. On the other hand data_source.scopes usually
   * need to be set when there are OAuth scopes that need to be granted by end users.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
   *   DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();
   *   DataSourceDefinition response = dataSourceServiceClient.createDataSourceDefinition(formattedParent, dataSourceDefinition);
   * }
   * </code></pre>
   *
   * @param parent The BigQuery project id for which data source definition is associated. Must be
   *     in the form: `projects/{project_id}/locations/{location_id}`
   * @param dataSourceDefinition Data source definition.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition createDataSourceDefinition(
      String parent, DataSourceDefinition dataSourceDefinition) {
    LOCATION_PATH_TEMPLATE.validate(parent, "createDataSourceDefinition");
    CreateDataSourceDefinitionRequest request =
        CreateDataSourceDefinitionRequest.newBuilder()
            .setParent(parent)
            .setDataSourceDefinition(dataSourceDefinition)
            .build();
    return createDataSourceDefinition(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a data source definition. Calling this method will automatically use your credentials
   * to create the following Google Cloud resources in YOUR Google Cloud project. 1. OAuth client 2.
   * Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
   * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
   * The field data_source.client_id should be left empty in the input request, as the API will
   * create a new OAuth client on behalf of the caller. On the other hand data_source.scopes usually
   * need to be set when there are OAuth scopes that need to be granted by end users.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
   *   DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();
   *   CreateDataSourceDefinitionRequest request = CreateDataSourceDefinitionRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .setDataSourceDefinition(dataSourceDefinition)
   *     .build();
   *   DataSourceDefinition response = dataSourceServiceClient.createDataSourceDefinition(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition createDataSourceDefinition(
      CreateDataSourceDefinitionRequest request) {
    return createDataSourceDefinitionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a data source definition. Calling this method will automatically use your credentials
   * to create the following Google Cloud resources in YOUR Google Cloud project. 1. OAuth client 2.
   * Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
   * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
   * The field data_source.client_id should be left empty in the input request, as the API will
   * create a new OAuth client on behalf of the caller. On the other hand data_source.scopes usually
   * need to be set when there are OAuth scopes that need to be granted by end users.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
   *   DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();
   *   CreateDataSourceDefinitionRequest request = CreateDataSourceDefinitionRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .setDataSourceDefinition(dataSourceDefinition)
   *     .build();
   *   ApiFuture&lt;DataSourceDefinition&gt; future = dataSourceServiceClient.createDataSourceDefinitionCallable().futureCall(request);
   *   // Do something
   *   DataSourceDefinition response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionCallable() {
    return stub.createDataSourceDefinitionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing data source definition. If changing supported_location_ids, triggers same
   * effects as mentioned in "Create a data source definition."
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   DataSourceDefinition response = dataSourceServiceClient.updateDataSourceDefinition(dataSourceDefinition, updateMask);
   * }
   * </code></pre>
   *
   * @param dataSourceDefinition Data source definition.
   * @param updateMask Update field mask.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition updateDataSourceDefinition(
      DataSourceDefinition dataSourceDefinition, FieldMask updateMask) {

    UpdateDataSourceDefinitionRequest request =
        UpdateDataSourceDefinitionRequest.newBuilder()
            .setDataSourceDefinition(dataSourceDefinition)
            .setUpdateMask(updateMask)
            .build();
    return updateDataSourceDefinition(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing data source definition. If changing supported_location_ids, triggers same
   * effects as mentioned in "Create a data source definition."
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateDataSourceDefinitionRequest request = UpdateDataSourceDefinitionRequest.newBuilder()
   *     .setDataSourceDefinition(dataSourceDefinition)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   DataSourceDefinition response = dataSourceServiceClient.updateDataSourceDefinition(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition updateDataSourceDefinition(
      UpdateDataSourceDefinitionRequest request) {
    return updateDataSourceDefinitionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an existing data source definition. If changing supported_location_ids, triggers same
   * effects as mentioned in "Create a data source definition."
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateDataSourceDefinitionRequest request = UpdateDataSourceDefinitionRequest.newBuilder()
   *     .setDataSourceDefinition(dataSourceDefinition)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   ApiFuture&lt;DataSourceDefinition&gt; future = dataSourceServiceClient.updateDataSourceDefinitionCallable().futureCall(request);
   *   // Do something
   *   DataSourceDefinition response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionCallable() {
    return stub.updateDataSourceDefinitionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a data source definition, all of the transfer configs associated with this data source
   * definition (if any) must be deleted first by the user in ALL regions, in order to delete the
   * data source definition. This method is primarily meant for deleting data sources created during
   * testing stage. If the data source is referenced by transfer configs in the region specified in
   * the request URL, the method will fail immediately. If in the current region (e.g., US) it's not
   * used by any transfer configs, but in another region (e.g., EU) it is, then although the method
   * will succeed in region US, but it will fail when the deletion operation is replicated to region
   * EU. And eventually, the system will replicate the data source definition back from EU to US, in
   * order to bring all regions to consistency. The final effect is that the data source appears to
   * be 'undeleted' in the US region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatDataSourceDefinitionName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");
   *   dataSourceServiceClient.deleteDataSourceDefinition(formattedName);
   * }
   * </code></pre>
   *
   * @param name The field will contain name of the resource requested, for example:
   *     `projects/{project_id}/locations/{location_id}/dataSourceDefinitions/{data_source_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteDataSourceDefinition(String name) {
    DATA_SOURCE_DEFINITION_PATH_TEMPLATE.validate(name, "deleteDataSourceDefinition");
    DeleteDataSourceDefinitionRequest request =
        DeleteDataSourceDefinitionRequest.newBuilder().setName(name).build();
    deleteDataSourceDefinition(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a data source definition, all of the transfer configs associated with this data source
   * definition (if any) must be deleted first by the user in ALL regions, in order to delete the
   * data source definition. This method is primarily meant for deleting data sources created during
   * testing stage. If the data source is referenced by transfer configs in the region specified in
   * the request URL, the method will fail immediately. If in the current region (e.g., US) it's not
   * used by any transfer configs, but in another region (e.g., EU) it is, then although the method
   * will succeed in region US, but it will fail when the deletion operation is replicated to region
   * EU. And eventually, the system will replicate the data source definition back from EU to US, in
   * order to bring all regions to consistency. The final effect is that the data source appears to
   * be 'undeleted' in the US region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatDataSourceDefinitionName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");
   *   DeleteDataSourceDefinitionRequest request = DeleteDataSourceDefinitionRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   dataSourceServiceClient.deleteDataSourceDefinition(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteDataSourceDefinition(DeleteDataSourceDefinitionRequest request) {
    deleteDataSourceDefinitionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a data source definition, all of the transfer configs associated with this data source
   * definition (if any) must be deleted first by the user in ALL regions, in order to delete the
   * data source definition. This method is primarily meant for deleting data sources created during
   * testing stage. If the data source is referenced by transfer configs in the region specified in
   * the request URL, the method will fail immediately. If in the current region (e.g., US) it's not
   * used by any transfer configs, but in another region (e.g., EU) it is, then although the method
   * will succeed in region US, but it will fail when the deletion operation is replicated to region
   * EU. And eventually, the system will replicate the data source definition back from EU to US, in
   * order to bring all regions to consistency. The final effect is that the data source appears to
   * be 'undeleted' in the US region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatDataSourceDefinitionName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");
   *   DeleteDataSourceDefinitionRequest request = DeleteDataSourceDefinitionRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = dataSourceServiceClient.deleteDataSourceDefinitionCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionCallable() {
    return stub.deleteDataSourceDefinitionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an existing data source definition.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatDataSourceDefinitionName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");
   *   DataSourceDefinition response = dataSourceServiceClient.getDataSourceDefinition(formattedName);
   * }
   * </code></pre>
   *
   * @param name The field will contain name of the resource requested.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition getDataSourceDefinition(String name) {
    DATA_SOURCE_DEFINITION_PATH_TEMPLATE.validate(name, "getDataSourceDefinition");
    GetDataSourceDefinitionRequest request =
        GetDataSourceDefinitionRequest.newBuilder().setName(name).build();
    return getDataSourceDefinition(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an existing data source definition.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatDataSourceDefinitionName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");
   *   GetDataSourceDefinitionRequest request = GetDataSourceDefinitionRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   DataSourceDefinition response = dataSourceServiceClient.getDataSourceDefinition(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition getDataSourceDefinition(
      GetDataSourceDefinitionRequest request) {
    return getDataSourceDefinitionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an existing data source definition.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedName = DataSourceServiceClient.formatDataSourceDefinitionName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");
   *   GetDataSourceDefinitionRequest request = GetDataSourceDefinitionRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   ApiFuture&lt;DataSourceDefinition&gt; future = dataSourceServiceClient.getDataSourceDefinitionCallable().futureCall(request);
   *   // Do something
   *   DataSourceDefinition response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionCallable() {
    return stub.getDataSourceDefinitionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists supported data source definitions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
   *   for (DataSourceDefinition element : dataSourceServiceClient.listDataSourceDefinitions(formattedParent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent The BigQuery project id for which data sources should be returned. Must be in the
   *     form: `projects/{project_id}/locations/{location_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDataSourceDefinitionsPagedResponse listDataSourceDefinitions(String parent) {
    LOCATION_PATH_TEMPLATE.validate(parent, "listDataSourceDefinitions");
    ListDataSourceDefinitionsRequest request =
        ListDataSourceDefinitionsRequest.newBuilder().setParent(parent).build();
    return listDataSourceDefinitions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists supported data source definitions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
   *   ListDataSourceDefinitionsRequest request = ListDataSourceDefinitionsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   for (DataSourceDefinition element : dataSourceServiceClient.listDataSourceDefinitions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDataSourceDefinitionsPagedResponse listDataSourceDefinitions(
      ListDataSourceDefinitionsRequest request) {
    return listDataSourceDefinitionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists supported data source definitions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
   *   ListDataSourceDefinitionsRequest request = ListDataSourceDefinitionsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   ApiFuture&lt;ListDataSourceDefinitionsPagedResponse&gt; future = dataSourceServiceClient.listDataSourceDefinitionsPagedCallable().futureCall(request);
   *   // Do something
   *   for (DataSourceDefinition element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsPagedCallable() {
    return stub.listDataSourceDefinitionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists supported data source definitions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
   *   ListDataSourceDefinitionsRequest request = ListDataSourceDefinitionsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   while (true) {
   *     ListDataSourceDefinitionsResponse response = dataSourceServiceClient.listDataSourceDefinitionsCallable().call(request);
   *     for (DataSourceDefinition element : response.getDataSourceDefinitionsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsCallable() {
    return stub.listDataSourceDefinitionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListDataSourceDefinitionsPagedResponse
      extends AbstractPagedListResponse<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse, DataSourceDefinition,
          ListDataSourceDefinitionsPage, ListDataSourceDefinitionsFixedSizeCollection> {

    public static ApiFuture<ListDataSourceDefinitionsPagedResponse> createAsync(
        PageContext<
                ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
                DataSourceDefinition>
            context,
        ApiFuture<ListDataSourceDefinitionsResponse> futureResponse) {
      ApiFuture<ListDataSourceDefinitionsPage> futurePage =
          ListDataSourceDefinitionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListDataSourceDefinitionsPage, ListDataSourceDefinitionsPagedResponse>() {
            @Override
            public ListDataSourceDefinitionsPagedResponse apply(
                ListDataSourceDefinitionsPage input) {
              return new ListDataSourceDefinitionsPagedResponse(input);
            }
          });
    }

    private ListDataSourceDefinitionsPagedResponse(ListDataSourceDefinitionsPage page) {
      super(page, ListDataSourceDefinitionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListDataSourceDefinitionsPage
      extends AbstractPage<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse, DataSourceDefinition,
          ListDataSourceDefinitionsPage> {

    private ListDataSourceDefinitionsPage(
        PageContext<
                ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
                DataSourceDefinition>
            context,
        ListDataSourceDefinitionsResponse response) {
      super(context, response);
    }

    private static ListDataSourceDefinitionsPage createEmptyPage() {
      return new ListDataSourceDefinitionsPage(null, null);
    }

    @Override
    protected ListDataSourceDefinitionsPage createPage(
        PageContext<
                ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
                DataSourceDefinition>
            context,
        ListDataSourceDefinitionsResponse response) {
      return new ListDataSourceDefinitionsPage(context, response);
    }

    @Override
    public ApiFuture<ListDataSourceDefinitionsPage> createPageAsync(
        PageContext<
                ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
                DataSourceDefinition>
            context,
        ApiFuture<ListDataSourceDefinitionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListDataSourceDefinitionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse, DataSourceDefinition,
          ListDataSourceDefinitionsPage, ListDataSourceDefinitionsFixedSizeCollection> {

    private ListDataSourceDefinitionsFixedSizeCollection(
        List<ListDataSourceDefinitionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDataSourceDefinitionsFixedSizeCollection createEmptyCollection() {
      return new ListDataSourceDefinitionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDataSourceDefinitionsFixedSizeCollection createCollection(
        List<ListDataSourceDefinitionsPage> pages, int collectionSize) {
      return new ListDataSourceDefinitionsFixedSizeCollection(pages, collectionSize);
    }
  }
}
