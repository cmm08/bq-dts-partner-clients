/*
 * Copyright 2019 Google LLC
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

import static com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListDataSourceDefinitionsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class DataSourceServiceClientTest {
  private static MockDataSourceService mockDataSourceService;
  private static MockDataTransferService mockDataTransferService;
  private static MockServiceHelper serviceHelper;
  private DataSourceServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockDataSourceService = new MockDataSourceService();
    mockDataTransferService = new MockDataTransferService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(mockDataSourceService, mockDataTransferService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    DataSourceServiceSettings settings =
        DataSourceServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DataSourceServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void updateTransferRunTest() {
    String name = "name3373707";
    String destinationDatasetId = "destinationDatasetId1541564179";
    String dataSourceId = "dataSourceId-1015796374";
    long userId = 147132913L;
    String schedule = "schedule-697920873";
    String notificationPubsubTopic = "notificationPubsubTopic1794281191";
    String partnerToken = "partnerToken725173186";
    TransferRun expectedResponse =
        TransferRun.newBuilder()
            .setName(name)
            .setDestinationDatasetId(destinationDatasetId)
            .setDataSourceId(dataSourceId)
            .setUserId(userId)
            .setSchedule(schedule)
            .setNotificationPubsubTopic(notificationPubsubTopic)
            .setPartnerToken(partnerToken)
            .build();
    mockDataSourceService.addResponse(expectedResponse);

    TransferRun transferRun = TransferRun.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    TransferRun actualResponse = client.updateTransferRun(transferRun, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateTransferRunRequest actualRequest = (UpdateTransferRunRequest) actualRequests.get(0);

    Assert.assertEquals(transferRun, actualRequest.getTransferRun());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateTransferRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      TransferRun transferRun = TransferRun.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();

      client.updateTransferRun(transferRun, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void logTransferRunMessagesTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockDataSourceService.addResponse(expectedResponse);

    String formattedName =
        DataSourceServiceClient.formatRunName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
    List<TransferMessage> transferMessages = new ArrayList<>();

    client.logTransferRunMessages(formattedName, transferMessages);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    LogTransferRunMessagesRequest actualRequest =
        (LogTransferRunMessagesRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertEquals(transferMessages, actualRequest.getTransferMessagesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void logTransferRunMessagesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      String formattedName =
          DataSourceServiceClient.formatRunName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
      List<TransferMessage> transferMessages = new ArrayList<>();

      client.logTransferRunMessages(formattedName, transferMessages);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startBigQueryJobsTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockDataSourceService.addResponse(expectedResponse);

    String formattedName =
        DataSourceServiceClient.formatRunName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
    List<ImportedDataInfo> importedData = new ArrayList<>();
    ByteString userCredentials = ByteString.copyFromUtf8("-120");
    int maxParallelism = 1515657535;

    client.startBigQueryJobs(formattedName, importedData, userCredentials, maxParallelism);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartBigQueryJobsRequest actualRequest = (StartBigQueryJobsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertEquals(importedData, actualRequest.getImportedDataList());
    Assert.assertEquals(userCredentials, actualRequest.getUserCredentials());
    Assert.assertEquals(maxParallelism, actualRequest.getMaxParallelism());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void startBigQueryJobsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      String formattedName =
          DataSourceServiceClient.formatRunName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
      List<ImportedDataInfo> importedData = new ArrayList<>();
      ByteString userCredentials = ByteString.copyFromUtf8("-120");
      int maxParallelism = 1515657535;

      client.startBigQueryJobs(formattedName, importedData, userCredentials, maxParallelism);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void finishRunTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockDataSourceService.addResponse(expectedResponse);

    String formattedName =
        DataSourceServiceClient.formatRunName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");

    client.finishRun(formattedName);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    FinishRunRequest actualRequest = (FinishRunRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void finishRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      String formattedName =
          DataSourceServiceClient.formatRunName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");

      client.finishRun(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createDataSourceDefinitionTest() {
    String name = "name3373707";
    String transferRunPubsubTopic = "transferRunPubsubTopic-1740562661";
    String supportEmail = "supportEmail-648030420";
    String serviceAccount = "serviceAccount-1948028253";
    boolean disabled = true;
    String transferConfigPubsubTopic = "transferConfigPubsubTopic71465884";
    DataSourceDefinition expectedResponse =
        DataSourceDefinition.newBuilder()
            .setName(name)
            .setTransferRunPubsubTopic(transferRunPubsubTopic)
            .setSupportEmail(supportEmail)
            .setServiceAccount(serviceAccount)
            .setDisabled(disabled)
            .setTransferConfigPubsubTopic(transferConfigPubsubTopic)
            .build();
    mockDataSourceService.addResponse(expectedResponse);

    String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
    DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();

    DataSourceDefinition actualResponse =
        client.createDataSourceDefinition(formattedParent, dataSourceDefinition);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDataSourceDefinitionRequest actualRequest =
        (CreateDataSourceDefinitionRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertEquals(dataSourceDefinition, actualRequest.getDataSourceDefinition());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createDataSourceDefinitionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      String formattedParent =
          DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
      DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();

      client.createDataSourceDefinition(formattedParent, dataSourceDefinition);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateDataSourceDefinitionTest() {
    String name = "name3373707";
    String transferRunPubsubTopic = "transferRunPubsubTopic-1740562661";
    String supportEmail = "supportEmail-648030420";
    String serviceAccount = "serviceAccount-1948028253";
    boolean disabled = true;
    String transferConfigPubsubTopic = "transferConfigPubsubTopic71465884";
    DataSourceDefinition expectedResponse =
        DataSourceDefinition.newBuilder()
            .setName(name)
            .setTransferRunPubsubTopic(transferRunPubsubTopic)
            .setSupportEmail(supportEmail)
            .setServiceAccount(serviceAccount)
            .setDisabled(disabled)
            .setTransferConfigPubsubTopic(transferConfigPubsubTopic)
            .build();
    mockDataSourceService.addResponse(expectedResponse);

    DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    DataSourceDefinition actualResponse =
        client.updateDataSourceDefinition(dataSourceDefinition, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateDataSourceDefinitionRequest actualRequest =
        (UpdateDataSourceDefinitionRequest) actualRequests.get(0);

    Assert.assertEquals(dataSourceDefinition, actualRequest.getDataSourceDefinition());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateDataSourceDefinitionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      DataSourceDefinition dataSourceDefinition = DataSourceDefinition.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();

      client.updateDataSourceDefinition(dataSourceDefinition, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDataSourceDefinitionTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockDataSourceService.addResponse(expectedResponse);

    String formattedName =
        DataSourceServiceClient.formatDataSourceDefinitionName(
            "[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");

    client.deleteDataSourceDefinition(formattedName);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDataSourceDefinitionRequest actualRequest =
        (DeleteDataSourceDefinitionRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteDataSourceDefinitionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      String formattedName =
          DataSourceServiceClient.formatDataSourceDefinitionName(
              "[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");

      client.deleteDataSourceDefinition(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getDataSourceDefinitionTest() {
    String name2 = "name2-1052831874";
    String transferRunPubsubTopic = "transferRunPubsubTopic-1740562661";
    String supportEmail = "supportEmail-648030420";
    String serviceAccount = "serviceAccount-1948028253";
    boolean disabled = true;
    String transferConfigPubsubTopic = "transferConfigPubsubTopic71465884";
    DataSourceDefinition expectedResponse =
        DataSourceDefinition.newBuilder()
            .setName(name2)
            .setTransferRunPubsubTopic(transferRunPubsubTopic)
            .setSupportEmail(supportEmail)
            .setServiceAccount(serviceAccount)
            .setDisabled(disabled)
            .setTransferConfigPubsubTopic(transferConfigPubsubTopic)
            .build();
    mockDataSourceService.addResponse(expectedResponse);

    String formattedName =
        DataSourceServiceClient.formatDataSourceDefinitionName(
            "[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");

    DataSourceDefinition actualResponse = client.getDataSourceDefinition(formattedName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataSourceDefinitionRequest actualRequest =
        (GetDataSourceDefinitionRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getDataSourceDefinitionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      String formattedName =
          DataSourceServiceClient.formatDataSourceDefinitionName(
              "[PROJECT]", "[LOCATION]", "[DATA_SOURCE_DEFINITION]");

      client.getDataSourceDefinition(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listDataSourceDefinitionsTest() {
    String nextPageToken = "";
    DataSourceDefinition dataSourceDefinitionsElement = DataSourceDefinition.newBuilder().build();
    List<DataSourceDefinition> dataSourceDefinitions = Arrays.asList(dataSourceDefinitionsElement);
    ListDataSourceDefinitionsResponse expectedResponse =
        ListDataSourceDefinitionsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllDataSourceDefinitions(dataSourceDefinitions)
            .build();
    mockDataSourceService.addResponse(expectedResponse);

    String formattedParent = DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");

    ListDataSourceDefinitionsPagedResponse pagedListResponse =
        client.listDataSourceDefinitions(formattedParent);

    List<DataSourceDefinition> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDataSourceDefinitionsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDataSourceDefinitionsRequest actualRequest =
        (ListDataSourceDefinitionsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listDataSourceDefinitionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      String formattedParent =
          DataSourceServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");

      client.listDataSourceDefinitions(formattedParent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
