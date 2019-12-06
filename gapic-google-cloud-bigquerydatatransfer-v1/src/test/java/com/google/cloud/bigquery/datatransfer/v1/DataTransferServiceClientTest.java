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

import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListDataSourcesPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListTransferConfigsPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListTransferLogsPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListTransferRunsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class DataTransferServiceClientTest {
  private static MockDataSourceService mockDataSourceService;
  private static MockDataTransferService mockDataTransferService;
  private static MockServiceHelper serviceHelper;
  private DataTransferServiceClient client;
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
    DataTransferServiceSettings settings =
        DataTransferServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DataTransferServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getDataSourceTest() {
    String name2 = "name2-1052831874";
    String dataSourceId = "dataSourceId-1015796374";
    String displayName = "displayName1615086568";
    String description = "description-1724546052";
    String clientId = "clientId-1904089585";
    boolean supportsMultipleTransfers = true;
    int updateDeadlineSeconds = 991471694;
    String defaultSchedule = "defaultSchedule-800168235";
    boolean supportsCustomSchedule = true;
    String helpUrl = "helpUrl-789431439";
    int defaultDataRefreshWindowDays = 1804935157;
    boolean manualRunsDisabled = true;
    String partnerLegalName = "partnerLegalName-1307326424";
    String redirectUrl = "redirectUrl951230092";
    DataSource expectedResponse =
        DataSource.newBuilder()
            .setName(name2)
            .setDataSourceId(dataSourceId)
            .setDisplayName(displayName)
            .setDescription(description)
            .setClientId(clientId)
            .setSupportsMultipleTransfers(supportsMultipleTransfers)
            .setUpdateDeadlineSeconds(updateDeadlineSeconds)
            .setDefaultSchedule(defaultSchedule)
            .setSupportsCustomSchedule(supportsCustomSchedule)
            .setHelpUrl(helpUrl)
            .setDefaultDataRefreshWindowDays(defaultDataRefreshWindowDays)
            .setManualRunsDisabled(manualRunsDisabled)
            .setPartnerLegalName(partnerLegalName)
            .setRedirectUrl(redirectUrl)
            .build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedName =
        DataTransferServiceClient.formatDataSourceName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE]");

    DataSource actualResponse = client.getDataSource(formattedName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataSourceRequest actualRequest = (GetDataSourceRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getDataSourceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedName =
          DataTransferServiceClient.formatDataSourceName(
              "[PROJECT]", "[LOCATION]", "[DATA_SOURCE]");

      client.getDataSource(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listDataSourcesTest() {
    String nextPageToken = "";
    DataSource dataSourcesElement = DataSource.newBuilder().build();
    List<DataSource> dataSources = Arrays.asList(dataSourcesElement);
    ListDataSourcesResponse expectedResponse =
        ListDataSourcesResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllDataSources(dataSources)
            .build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedParent =
        DataTransferServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");

    ListDataSourcesPagedResponse pagedListResponse = client.listDataSources(formattedParent);

    List<DataSource> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDataSourcesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDataSourcesRequest actualRequest = (ListDataSourcesRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listDataSourcesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedParent =
          DataTransferServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");

      client.listDataSources(formattedParent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTransferConfigTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedName =
        DataTransferServiceClient.formatTransferConfigName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");

    client.deleteTransferConfig(formattedName);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTransferConfigRequest actualRequest = (DeleteTransferConfigRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTransferConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedName =
          DataTransferServiceClient.formatTransferConfigName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");

      client.deleteTransferConfig(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTransferConfigTest() {
    String name2 = "name2-1052831874";
    String destinationDatasetId = "destinationDatasetId1541564179";
    String displayName = "displayName1615086568";
    String dataSourceId = "dataSourceId-1015796374";
    String schedule = "schedule-697920873";
    int dataRefreshWindowDays = 327632845;
    boolean disabled = true;
    long userId = 147132913L;
    String datasetRegion = "datasetRegion959248539";
    String notificationPubsubTopic = "notificationPubsubTopic1794281191";
    String partnerToken = "partnerToken725173186";
    TransferConfig expectedResponse =
        TransferConfig.newBuilder()
            .setName(name2)
            .setDestinationDatasetId(destinationDatasetId)
            .setDisplayName(displayName)
            .setDataSourceId(dataSourceId)
            .setSchedule(schedule)
            .setDataRefreshWindowDays(dataRefreshWindowDays)
            .setDisabled(disabled)
            .setUserId(userId)
            .setDatasetRegion(datasetRegion)
            .setNotificationPubsubTopic(notificationPubsubTopic)
            .setPartnerToken(partnerToken)
            .build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedName =
        DataTransferServiceClient.formatTransferConfigName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");

    TransferConfig actualResponse = client.getTransferConfig(formattedName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTransferConfigRequest actualRequest = (GetTransferConfigRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getTransferConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedName =
          DataTransferServiceClient.formatTransferConfigName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");

      client.getTransferConfig(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTransferConfigsTest() {
    String nextPageToken = "";
    TransferConfig transferConfigsElement = TransferConfig.newBuilder().build();
    List<TransferConfig> transferConfigs = Arrays.asList(transferConfigsElement);
    ListTransferConfigsResponse expectedResponse =
        ListTransferConfigsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllTransferConfigs(transferConfigs)
            .build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedParent =
        DataTransferServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
    List<String> dataSourceIds = new ArrayList<>();

    ListTransferConfigsPagedResponse pagedListResponse =
        client.listTransferConfigs(formattedParent, dataSourceIds);

    List<TransferConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTransferConfigsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTransferConfigsRequest actualRequest = (ListTransferConfigsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertEquals(dataSourceIds, actualRequest.getDataSourceIdsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listTransferConfigsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedParent =
          DataTransferServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");
      List<String> dataSourceIds = new ArrayList<>();

      client.listTransferConfigs(formattedParent, dataSourceIds);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void scheduleTransferRunsTest() {
    ScheduleTransferRunsResponse expectedResponse =
        ScheduleTransferRunsResponse.newBuilder().build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedParent =
        DataTransferServiceClient.formatTransferConfigName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");
    Map<String, String> labels = new HashMap<>();
    Timestamp startTime = Timestamp.newBuilder().build();
    Timestamp endTime = Timestamp.newBuilder().build();

    ScheduleTransferRunsResponse actualResponse =
        client.scheduleTransferRuns(formattedParent, labels, startTime, endTime);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ScheduleTransferRunsRequest actualRequest = (ScheduleTransferRunsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertEquals(labels, actualRequest.getLabelsMap());
    Assert.assertEquals(startTime, actualRequest.getStartTime());
    Assert.assertEquals(endTime, actualRequest.getEndTime());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void scheduleTransferRunsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedParent =
          DataTransferServiceClient.formatTransferConfigName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");
      Map<String, String> labels = new HashMap<>();
      Timestamp startTime = Timestamp.newBuilder().build();
      Timestamp endTime = Timestamp.newBuilder().build();

      client.scheduleTransferRuns(formattedParent, labels, startTime, endTime);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startManualTransferRunsTest() {
    StartManualTransferRunsResponse expectedResponse =
        StartManualTransferRunsResponse.newBuilder().build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedParent =
        DataTransferServiceClient.formatTransferConfigName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");
    Map<String, String> labels = new HashMap<>();

    StartManualTransferRunsResponse actualResponse =
        client.startManualTransferRuns(formattedParent, labels);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartManualTransferRunsRequest actualRequest =
        (StartManualTransferRunsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertEquals(labels, actualRequest.getLabelsMap());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void startManualTransferRunsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedParent =
          DataTransferServiceClient.formatTransferConfigName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");
      Map<String, String> labels = new HashMap<>();

      client.startManualTransferRuns(formattedParent, labels);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getTransferRunTest() {
    String name2 = "name2-1052831874";
    String destinationDatasetId = "destinationDatasetId1541564179";
    String dataSourceId = "dataSourceId-1015796374";
    long userId = 147132913L;
    String schedule = "schedule-697920873";
    String notificationPubsubTopic = "notificationPubsubTopic1794281191";
    String partnerToken = "partnerToken725173186";
    TransferRun expectedResponse =
        TransferRun.newBuilder()
            .setName(name2)
            .setDestinationDatasetId(destinationDatasetId)
            .setDataSourceId(dataSourceId)
            .setUserId(userId)
            .setSchedule(schedule)
            .setNotificationPubsubTopic(notificationPubsubTopic)
            .setPartnerToken(partnerToken)
            .build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedName =
        DataTransferServiceClient.formatRunName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");

    TransferRun actualResponse = client.getTransferRun(formattedName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTransferRunRequest actualRequest = (GetTransferRunRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getTransferRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedName =
          DataTransferServiceClient.formatRunName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");

      client.getTransferRun(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTransferRunTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedName =
        DataTransferServiceClient.formatRunName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");

    client.deleteTransferRun(formattedName);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTransferRunRequest actualRequest = (DeleteTransferRunRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteTransferRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedName =
          DataTransferServiceClient.formatRunName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");

      client.deleteTransferRun(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTransferRunsTest() {
    String nextPageToken = "";
    TransferRun transferRunsElement = TransferRun.newBuilder().build();
    List<TransferRun> transferRuns = Arrays.asList(transferRunsElement);
    ListTransferRunsResponse expectedResponse =
        ListTransferRunsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllTransferRuns(transferRuns)
            .build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedParent =
        DataTransferServiceClient.formatTransferConfigName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");
    List<TransferState> states = new ArrayList<>();
    ListTransferRunsRequest.RunAttempt runAttempt =
        ListTransferRunsRequest.RunAttempt.RUN_ATTEMPT_UNSPECIFIED;

    ListTransferRunsPagedResponse pagedListResponse =
        client.listTransferRuns(formattedParent, states, runAttempt);

    List<TransferRun> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTransferRunsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTransferRunsRequest actualRequest = (ListTransferRunsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertEquals(states, actualRequest.getStatesList());
    Assert.assertEquals(runAttempt, actualRequest.getRunAttempt());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listTransferRunsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedParent =
          DataTransferServiceClient.formatTransferConfigName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]");
      List<TransferState> states = new ArrayList<>();
      ListTransferRunsRequest.RunAttempt runAttempt =
          ListTransferRunsRequest.RunAttempt.RUN_ATTEMPT_UNSPECIFIED;

      client.listTransferRuns(formattedParent, states, runAttempt);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listTransferLogsTest() {
    String nextPageToken = "";
    TransferMessage transferMessagesElement = TransferMessage.newBuilder().build();
    List<TransferMessage> transferMessages = Arrays.asList(transferMessagesElement);
    ListTransferLogsResponse expectedResponse =
        ListTransferLogsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllTransferMessages(transferMessages)
            .build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedParent =
        DataTransferServiceClient.formatRunName(
            "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
    List<TransferMessage.MessageSeverity> messageTypes = new ArrayList<>();

    ListTransferLogsPagedResponse pagedListResponse =
        client.listTransferLogs(formattedParent, messageTypes);

    List<TransferMessage> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTransferMessagesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTransferLogsRequest actualRequest = (ListTransferLogsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertEquals(messageTypes, actualRequest.getMessageTypesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listTransferLogsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedParent =
          DataTransferServiceClient.formatRunName(
              "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]");
      List<TransferMessage.MessageSeverity> messageTypes = new ArrayList<>();

      client.listTransferLogs(formattedParent, messageTypes);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void checkValidCredsTest() {
    boolean hasValidCreds = false;
    CheckValidCredsResponse expectedResponse =
        CheckValidCredsResponse.newBuilder().setHasValidCreds(hasValidCreds).build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedName =
        DataTransferServiceClient.formatDataSourceName("[PROJECT]", "[LOCATION]", "[DATA_SOURCE]");

    CheckValidCredsResponse actualResponse = client.checkValidCreds(formattedName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CheckValidCredsRequest actualRequest = (CheckValidCredsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void checkValidCredsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedName =
          DataTransferServiceClient.formatDataSourceName(
              "[PROJECT]", "[LOCATION]", "[DATA_SOURCE]");

      client.checkValidCreds(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void enableDataTransferServiceTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedName = DataTransferServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");

    client.enableDataTransferService(formattedName);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    EnableDataTransferServiceRequest actualRequest =
        (EnableDataTransferServiceRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void enableDataTransferServiceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedName =
          DataTransferServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");

      client.enableDataTransferService(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void isDataTransferServiceEnabledTest() {
    boolean enabled = false;
    String reason = "reason-934964668";
    IsDataTransferServiceEnabledResponse expectedResponse =
        IsDataTransferServiceEnabledResponse.newBuilder()
            .setEnabled(enabled)
            .setReason(reason)
            .build();
    mockDataTransferService.addResponse(expectedResponse);

    String formattedName = DataTransferServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");

    IsDataTransferServiceEnabledResponse actualResponse =
        client.isDataTransferServiceEnabled(formattedName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataTransferService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    IsDataTransferServiceEnabledRequest actualRequest =
        (IsDataTransferServiceEnabledRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void isDataTransferServiceEnabledExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockDataTransferService.addException(exception);

    try {
      String formattedName =
          DataTransferServiceClient.formatLocationName("[PROJECT]", "[LOCATION]");

      client.isDataTransferServiceEnabled(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
