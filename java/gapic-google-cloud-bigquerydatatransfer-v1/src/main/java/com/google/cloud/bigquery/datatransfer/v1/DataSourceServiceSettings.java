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

import static com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListDataSourceDefinitionsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.auth.Credentials;
import com.google.cloud.bigquery.datatransfer.v1.stub.DataSourceServiceStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link DataSourceServiceClient}.
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
 * DataSourceServiceSettings.Builder dataSourceServiceSettingsBuilder =
 *     DataSourceServiceSettings.newBuilder();
 * dataSourceServiceSettingsBuilder.updateTransferRunSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * DataSourceServiceSettings dataSourceServiceSettings = dataSourceServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class DataSourceServiceSettings extends ClientSettings<DataSourceServiceSettings> {
  /** Returns the object with the settings used for calls to updateTransferRun. */
  public UnaryCallSettings<UpdateTransferRunRequest, TransferRun> updateTransferRunSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).updateTransferRunSettings();
  }

  /** Returns the object with the settings used for calls to logTransferRunMessages. */
  public UnaryCallSettings<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).logTransferRunMessagesSettings();
  }

  /** Returns the object with the settings used for calls to startBigQueryJobs. */
  public UnaryCallSettings<StartBigQueryJobsRequest, Empty> startBigQueryJobsSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).startBigQueryJobsSettings();
  }

  /** Returns the object with the settings used for calls to getCredentials. */
  public UnaryCallSettings<
          GetCredentialsRequest, com.google.cloud.bigquery.datatransfer.v1.Credentials>
      getCredentialsSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).getCredentialsSettings();
  }

  /** Returns the object with the settings used for calls to finishRun. */
  public UnaryCallSettings<FinishRunRequest, Empty> finishRunSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).finishRunSettings();
  }

  /** Returns the object with the settings used for calls to createDataSourceDefinition. */
  public UnaryCallSettings<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).createDataSourceDefinitionSettings();
  }

  /** Returns the object with the settings used for calls to updateDataSourceDefinition. */
  public UnaryCallSettings<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).updateDataSourceDefinitionSettings();
  }

  /** Returns the object with the settings used for calls to deleteDataSourceDefinition. */
  public UnaryCallSettings<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).deleteDataSourceDefinitionSettings();
  }

  /** Returns the object with the settings used for calls to getDataSourceDefinition. */
  public UnaryCallSettings<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).getDataSourceDefinitionSettings();
  }

  /** Returns the object with the settings used for calls to listDataSourceDefinitions. */
  public PagedCallSettings<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
          ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsSettings() {
    return ((DataSourceServiceStubSettings) getStubSettings()).listDataSourceDefinitionsSettings();
  }

  public static final DataSourceServiceSettings create(DataSourceServiceStubSettings stub)
      throws IOException {
    return new DataSourceServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return DataSourceServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return DataSourceServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DataSourceServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return DataSourceServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return DataSourceServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return DataSourceServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return DataSourceServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected DataSourceServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for DataSourceServiceSettings. */
  public static class Builder extends ClientSettings.Builder<DataSourceServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(DataSourceServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(DataSourceServiceStubSettings.newBuilder());
    }

    protected Builder(DataSourceServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(DataSourceServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public DataSourceServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((DataSourceServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to updateTransferRun. */
    public UnaryCallSettings.Builder<UpdateTransferRunRequest, TransferRun>
        updateTransferRunSettings() {
      return getStubSettingsBuilder().updateTransferRunSettings();
    }

    /** Returns the builder for the settings used for calls to logTransferRunMessages. */
    public UnaryCallSettings.Builder<LogTransferRunMessagesRequest, Empty>
        logTransferRunMessagesSettings() {
      return getStubSettingsBuilder().logTransferRunMessagesSettings();
    }

    /** Returns the builder for the settings used for calls to startBigQueryJobs. */
    public UnaryCallSettings.Builder<StartBigQueryJobsRequest, Empty> startBigQueryJobsSettings() {
      return getStubSettingsBuilder().startBigQueryJobsSettings();
    }

    /** Returns the builder for the settings used for calls to getCredentials. */
    public UnaryCallSettings.Builder<
            GetCredentialsRequest, com.google.cloud.bigquery.datatransfer.v1.Credentials>
        getCredentialsSettings() {
      return getStubSettingsBuilder().getCredentialsSettings();
    }

    /** Returns the builder for the settings used for calls to finishRun. */
    public UnaryCallSettings.Builder<FinishRunRequest, Empty> finishRunSettings() {
      return getStubSettingsBuilder().finishRunSettings();
    }

    /** Returns the builder for the settings used for calls to createDataSourceDefinition. */
    public UnaryCallSettings.Builder<CreateDataSourceDefinitionRequest, DataSourceDefinition>
        createDataSourceDefinitionSettings() {
      return getStubSettingsBuilder().createDataSourceDefinitionSettings();
    }

    /** Returns the builder for the settings used for calls to updateDataSourceDefinition. */
    public UnaryCallSettings.Builder<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
        updateDataSourceDefinitionSettings() {
      return getStubSettingsBuilder().updateDataSourceDefinitionSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDataSourceDefinition. */
    public UnaryCallSettings.Builder<DeleteDataSourceDefinitionRequest, Empty>
        deleteDataSourceDefinitionSettings() {
      return getStubSettingsBuilder().deleteDataSourceDefinitionSettings();
    }

    /** Returns the builder for the settings used for calls to getDataSourceDefinition. */
    public UnaryCallSettings.Builder<GetDataSourceDefinitionRequest, DataSourceDefinition>
        getDataSourceDefinitionSettings() {
      return getStubSettingsBuilder().getDataSourceDefinitionSettings();
    }

    /** Returns the builder for the settings used for calls to listDataSourceDefinitions. */
    public PagedCallSettings.Builder<
            ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse,
            ListDataSourceDefinitionsPagedResponse>
        listDataSourceDefinitionsSettings() {
      return getStubSettingsBuilder().listDataSourceDefinitionsSettings();
    }

    @Override
    public DataSourceServiceSettings build() throws IOException {
      return new DataSourceServiceSettings(this);
    }
  }
}
