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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.auth.Credentials;
import com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest;
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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link DataSourceServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (bigquerydatatransfer.googleapis.com) and default port (443)
 *       are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of updateTransferRun to 30 seconds:
 *
 * <pre>
 * <code>
 * DataSourceServiceStubSettings.Builder dataSourceServiceSettingsBuilder =
 *     DataSourceServiceStubSettings.newBuilder();
 * dataSourceServiceSettingsBuilder.updateTransferRunSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * DataSourceServiceStubSettings dataSourceServiceSettings = dataSourceServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class DataSourceServiceStubSettings extends StubSettings<DataSourceServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/bigquery")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .build();

  private final UnaryCallSettings<UpdateTransferRunRequest, TransferRun> updateTransferRunSettings;
  private final UnaryCallSettings<LogTransferRunMessagesRequest, Empty>
      logTransferRunMessagesSettings;
  private final UnaryCallSettings<StartBigQueryJobsRequest, Empty> startBigQueryJobsSettings;
  private final UnaryCallSettings<
          GetCredentialsRequest, com.google.cloud.bigquery.datatransfer.v1.Credentials>
      getCredentialsSettings;
  private final UnaryCallSettings<FinishRunRequest, Empty> finishRunSettings;
  private final UnaryCallSettings<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionSettings;
  private final UnaryCallSettings<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionSettings;
  private final UnaryCallSettings<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionSettings;
  private final UnaryCallSettings<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionSettings;
  private final PagedCallSettings<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
          ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsSettings;

  /** Returns the object with the settings used for calls to updateTransferRun. */
  public UnaryCallSettings<UpdateTransferRunRequest, TransferRun> updateTransferRunSettings() {
    return updateTransferRunSettings;
  }

  /** Returns the object with the settings used for calls to logTransferRunMessages. */
  public UnaryCallSettings<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesSettings() {
    return logTransferRunMessagesSettings;
  }

  /** Returns the object with the settings used for calls to startBigQueryJobs. */
  public UnaryCallSettings<StartBigQueryJobsRequest, Empty> startBigQueryJobsSettings() {
    return startBigQueryJobsSettings;
  }

  /** Returns the object with the settings used for calls to getCredentials. */
  public UnaryCallSettings<
          GetCredentialsRequest, com.google.cloud.bigquery.datatransfer.v1.Credentials>
      getCredentialsSettings() {
    return getCredentialsSettings;
  }

  /** Returns the object with the settings used for calls to finishRun. */
  public UnaryCallSettings<FinishRunRequest, Empty> finishRunSettings() {
    return finishRunSettings;
  }

  /** Returns the object with the settings used for calls to createDataSourceDefinition. */
  public UnaryCallSettings<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionSettings() {
    return createDataSourceDefinitionSettings;
  }

  /** Returns the object with the settings used for calls to updateDataSourceDefinition. */
  public UnaryCallSettings<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionSettings() {
    return updateDataSourceDefinitionSettings;
  }

  /** Returns the object with the settings used for calls to deleteDataSourceDefinition. */
  public UnaryCallSettings<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionSettings() {
    return deleteDataSourceDefinitionSettings;
  }

  /** Returns the object with the settings used for calls to getDataSourceDefinition. */
  public UnaryCallSettings<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionSettings() {
    return getDataSourceDefinitionSettings;
  }

  /** Returns the object with the settings used for calls to listDataSourceDefinitions. */
  public PagedCallSettings<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
          ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsSettings() {
    return listDataSourceDefinitionsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DataSourceServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcDataSourceServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "bigquerydatatransfer.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(DataSourceServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected DataSourceServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    updateTransferRunSettings = settingsBuilder.updateTransferRunSettings().build();
    logTransferRunMessagesSettings = settingsBuilder.logTransferRunMessagesSettings().build();
    startBigQueryJobsSettings = settingsBuilder.startBigQueryJobsSettings().build();
    getCredentialsSettings = settingsBuilder.getCredentialsSettings().build();
    finishRunSettings = settingsBuilder.finishRunSettings().build();
    createDataSourceDefinitionSettings =
        settingsBuilder.createDataSourceDefinitionSettings().build();
    updateDataSourceDefinitionSettings =
        settingsBuilder.updateDataSourceDefinitionSettings().build();
    deleteDataSourceDefinitionSettings =
        settingsBuilder.deleteDataSourceDefinitionSettings().build();
    getDataSourceDefinitionSettings = settingsBuilder.getDataSourceDefinitionSettings().build();
    listDataSourceDefinitionsSettings = settingsBuilder.listDataSourceDefinitionsSettings().build();
  }

  private static final PagedListDescriptor<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse, DataSourceDefinition>
      LIST_DATA_SOURCE_DEFINITIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
              DataSourceDefinition>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDataSourceDefinitionsRequest injectToken(
                ListDataSourceDefinitionsRequest payload, String token) {
              return ListDataSourceDefinitionsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListDataSourceDefinitionsRequest injectPageSize(
                ListDataSourceDefinitionsRequest payload, int pageSize) {
              return ListDataSourceDefinitionsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListDataSourceDefinitionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDataSourceDefinitionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<DataSourceDefinition> extractResources(
                ListDataSourceDefinitionsResponse payload) {
              return payload.getDataSourceDefinitionsList();
            }
          };

  private static final PagedListResponseFactory<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
          ListDataSourceDefinitionsPagedResponse>
      LIST_DATA_SOURCE_DEFINITIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
              ListDataSourceDefinitionsPagedResponse>() {
            @Override
            public ApiFuture<ListDataSourceDefinitionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
                    callable,
                ListDataSourceDefinitionsRequest request,
                ApiCallContext context,
                ApiFuture<ListDataSourceDefinitionsResponse> futureResponse) {
              PageContext<
                      ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
                      DataSourceDefinition>
                  pageContext =
                      PageContext.create(
                          callable, LIST_DATA_SOURCE_DEFINITIONS_PAGE_STR_DESC, request, context);
              return ListDataSourceDefinitionsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Builder for DataSourceServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<DataSourceServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<UpdateTransferRunRequest, TransferRun>
        updateTransferRunSettings;
    private final UnaryCallSettings.Builder<LogTransferRunMessagesRequest, Empty>
        logTransferRunMessagesSettings;
    private final UnaryCallSettings.Builder<StartBigQueryJobsRequest, Empty>
        startBigQueryJobsSettings;
    private final UnaryCallSettings.Builder<
            GetCredentialsRequest, com.google.cloud.bigquery.datatransfer.v1.Credentials>
        getCredentialsSettings;
    private final UnaryCallSettings.Builder<FinishRunRequest, Empty> finishRunSettings;
    private final UnaryCallSettings.Builder<CreateDataSourceDefinitionRequest, DataSourceDefinition>
        createDataSourceDefinitionSettings;
    private final UnaryCallSettings.Builder<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
        updateDataSourceDefinitionSettings;
    private final UnaryCallSettings.Builder<DeleteDataSourceDefinitionRequest, Empty>
        deleteDataSourceDefinitionSettings;
    private final UnaryCallSettings.Builder<GetDataSourceDefinitionRequest, DataSourceDefinition>
        getDataSourceDefinitionSettings;
    private final PagedCallSettings.Builder<
            ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
            ListDataSourceDefinitionsPagedResponse>
        listDataSourceDefinitionsSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      updateTransferRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      logTransferRunMessagesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      startBigQueryJobsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getCredentialsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      finishRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createDataSourceDefinitionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateDataSourceDefinitionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteDataSourceDefinitionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getDataSourceDefinitionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listDataSourceDefinitionsSettings =
          PagedCallSettings.newBuilder(LIST_DATA_SOURCE_DEFINITIONS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              updateTransferRunSettings,
              logTransferRunMessagesSettings,
              startBigQueryJobsSettings,
              getCredentialsSettings,
              finishRunSettings,
              createDataSourceDefinitionSettings,
              updateDataSourceDefinitionSettings,
              deleteDataSourceDefinitionSettings,
              getDataSourceDefinitionSettings,
              listDataSourceDefinitionsSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .updateTransferRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .logTransferRunMessagesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .startBigQueryJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getCredentialsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .finishRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createDataSourceDefinitionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateDataSourceDefinitionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteDataSourceDefinitionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getDataSourceDefinitionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listDataSourceDefinitionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(DataSourceServiceStubSettings settings) {
      super(settings);

      updateTransferRunSettings = settings.updateTransferRunSettings.toBuilder();
      logTransferRunMessagesSettings = settings.logTransferRunMessagesSettings.toBuilder();
      startBigQueryJobsSettings = settings.startBigQueryJobsSettings.toBuilder();
      getCredentialsSettings = settings.getCredentialsSettings.toBuilder();
      finishRunSettings = settings.finishRunSettings.toBuilder();
      createDataSourceDefinitionSettings = settings.createDataSourceDefinitionSettings.toBuilder();
      updateDataSourceDefinitionSettings = settings.updateDataSourceDefinitionSettings.toBuilder();
      deleteDataSourceDefinitionSettings = settings.deleteDataSourceDefinitionSettings.toBuilder();
      getDataSourceDefinitionSettings = settings.getDataSourceDefinitionSettings.toBuilder();
      listDataSourceDefinitionsSettings = settings.listDataSourceDefinitionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              updateTransferRunSettings,
              logTransferRunMessagesSettings,
              startBigQueryJobsSettings,
              getCredentialsSettings,
              finishRunSettings,
              createDataSourceDefinitionSettings,
              updateDataSourceDefinitionSettings,
              deleteDataSourceDefinitionSettings,
              getDataSourceDefinitionSettings,
              listDataSourceDefinitionsSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to updateTransferRun. */
    public UnaryCallSettings.Builder<UpdateTransferRunRequest, TransferRun>
        updateTransferRunSettings() {
      return updateTransferRunSettings;
    }

    /** Returns the builder for the settings used for calls to logTransferRunMessages. */
    public UnaryCallSettings.Builder<LogTransferRunMessagesRequest, Empty>
        logTransferRunMessagesSettings() {
      return logTransferRunMessagesSettings;
    }

    /** Returns the builder for the settings used for calls to startBigQueryJobs. */
    public UnaryCallSettings.Builder<StartBigQueryJobsRequest, Empty> startBigQueryJobsSettings() {
      return startBigQueryJobsSettings;
    }

    /** Returns the builder for the settings used for calls to getCredentials. */
    public UnaryCallSettings.Builder<
            GetCredentialsRequest, com.google.cloud.bigquery.datatransfer.v1.Credentials>
        getCredentialsSettings() {
      return getCredentialsSettings;
    }

    /** Returns the builder for the settings used for calls to finishRun. */
    public UnaryCallSettings.Builder<FinishRunRequest, Empty> finishRunSettings() {
      return finishRunSettings;
    }

    /** Returns the builder for the settings used for calls to createDataSourceDefinition. */
    public UnaryCallSettings.Builder<CreateDataSourceDefinitionRequest, DataSourceDefinition>
        createDataSourceDefinitionSettings() {
      return createDataSourceDefinitionSettings;
    }

    /** Returns the builder for the settings used for calls to updateDataSourceDefinition. */
    public UnaryCallSettings.Builder<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
        updateDataSourceDefinitionSettings() {
      return updateDataSourceDefinitionSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDataSourceDefinition. */
    public UnaryCallSettings.Builder<DeleteDataSourceDefinitionRequest, Empty>
        deleteDataSourceDefinitionSettings() {
      return deleteDataSourceDefinitionSettings;
    }

    /** Returns the builder for the settings used for calls to getDataSourceDefinition. */
    public UnaryCallSettings.Builder<GetDataSourceDefinitionRequest, DataSourceDefinition>
        getDataSourceDefinitionSettings() {
      return getDataSourceDefinitionSettings;
    }

    /** Returns the builder for the settings used for calls to listDataSourceDefinitions. */
    public PagedCallSettings.Builder<
            ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
            ListDataSourceDefinitionsPagedResponse>
        listDataSourceDefinitionsSettings() {
      return listDataSourceDefinitionsSettings;
    }

    @Override
    public DataSourceServiceStubSettings build() throws IOException {
      return new DataSourceServiceStubSettings(this);
    }
  }
}
