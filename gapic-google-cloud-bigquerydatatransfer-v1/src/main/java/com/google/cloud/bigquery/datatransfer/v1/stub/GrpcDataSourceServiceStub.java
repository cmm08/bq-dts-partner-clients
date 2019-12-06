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
package com.google.cloud.bigquery.datatransfer.v1.stub;

import static com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListDataSourceDefinitionsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition;
import com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest;
import com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse;
import com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest;
import com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest;
import com.google.cloud.bigquery.datatransfer.v1.TransferRun;
import com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for BigQuery Data Transfer API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcDataSourceServiceStub extends DataSourceServiceStub {

  private static final MethodDescriptor<UpdateTransferRunRequest, TransferRun>
      updateTransferRunMethodDescriptor =
          MethodDescriptor.<UpdateTransferRunRequest, TransferRun>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/UpdateTransferRun")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateTransferRunRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(TransferRun.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<LogTransferRunMessagesRequest, Empty>
      logTransferRunMessagesMethodDescriptor =
          MethodDescriptor.<LogTransferRunMessagesRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/LogTransferRunMessages")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(LogTransferRunMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<StartBigQueryJobsRequest, Empty>
      startBigQueryJobsMethodDescriptor =
          MethodDescriptor.<StartBigQueryJobsRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/StartBigQueryJobs")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(StartBigQueryJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<FinishRunRequest, Empty> finishRunMethodDescriptor =
      MethodDescriptor.<FinishRunRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.bigquery.datatransfer.v1.DataSourceService/FinishRun")
          .setRequestMarshaller(ProtoUtils.marshaller(FinishRunRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionMethodDescriptor =
          MethodDescriptor.<CreateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/CreateDataSourceDefinition")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DataSourceDefinition.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionMethodDescriptor =
          MethodDescriptor.<UpdateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/UpdateDataSourceDefinition")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DataSourceDefinition.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionMethodDescriptor =
          MethodDescriptor.<DeleteDataSourceDefinitionRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/DeleteDataSourceDefinition")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionMethodDescriptor =
          MethodDescriptor.<GetDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/GetDataSourceDefinition")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DataSourceDefinition.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsMethodDescriptor =
          MethodDescriptor
              .<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/ListDataSourceDefinitions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListDataSourceDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListDataSourceDefinitionsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<UpdateTransferRunRequest, TransferRun> updateTransferRunCallable;
  private final UnaryCallable<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesCallable;
  private final UnaryCallable<StartBigQueryJobsRequest, Empty> startBigQueryJobsCallable;
  private final UnaryCallable<FinishRunRequest, Empty> finishRunCallable;
  private final UnaryCallable<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionCallable;
  private final UnaryCallable<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionCallable;
  private final UnaryCallable<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionCallable;
  private final UnaryCallable<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionCallable;
  private final UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsCallable;
  private final UnaryCallable<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsPagedCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcDataSourceServiceStub create(DataSourceServiceStubSettings settings)
      throws IOException {
    return new GrpcDataSourceServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcDataSourceServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcDataSourceServiceStub(
        DataSourceServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcDataSourceServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcDataSourceServiceStub(
        DataSourceServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcDataSourceServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcDataSourceServiceStub(
      DataSourceServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcDataSourceServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcDataSourceServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcDataSourceServiceStub(
      DataSourceServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<UpdateTransferRunRequest, TransferRun> updateTransferRunTransportSettings =
        GrpcCallSettings.<UpdateTransferRunRequest, TransferRun>newBuilder()
            .setMethodDescriptor(updateTransferRunMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpdateTransferRunRequest>() {
                  @Override
                  public Map<String, String> extract(UpdateTransferRunRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put(
                        "transfer_run.name", String.valueOf(request.getTransferRun().getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesTransportSettings =
        GrpcCallSettings.<LogTransferRunMessagesRequest, Empty>newBuilder()
            .setMethodDescriptor(logTransferRunMessagesMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<LogTransferRunMessagesRequest>() {
                  @Override
                  public Map<String, String> extract(LogTransferRunMessagesRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<StartBigQueryJobsRequest, Empty> startBigQueryJobsTransportSettings =
        GrpcCallSettings.<StartBigQueryJobsRequest, Empty>newBuilder()
            .setMethodDescriptor(startBigQueryJobsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<StartBigQueryJobsRequest>() {
                  @Override
                  public Map<String, String> extract(StartBigQueryJobsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<FinishRunRequest, Empty> finishRunTransportSettings =
        GrpcCallSettings.<FinishRunRequest, Empty>newBuilder()
            .setMethodDescriptor(finishRunMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<FinishRunRequest>() {
                  @Override
                  public Map<String, String> extract(FinishRunRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateDataSourceDefinitionRequest, DataSourceDefinition>
        createDataSourceDefinitionTransportSettings =
            GrpcCallSettings.<CreateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(createDataSourceDefinitionMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<CreateDataSourceDefinitionRequest>() {
                      @Override
                      public Map<String, String> extract(
                          CreateDataSourceDefinitionRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
        updateDataSourceDefinitionTransportSettings =
            GrpcCallSettings.<UpdateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(updateDataSourceDefinitionMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<UpdateDataSourceDefinitionRequest>() {
                      @Override
                      public Map<String, String> extract(
                          UpdateDataSourceDefinitionRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put(
                            "data_source_definition.name",
                            String.valueOf(request.getDataSourceDefinition().getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<DeleteDataSourceDefinitionRequest, Empty>
        deleteDataSourceDefinitionTransportSettings =
            GrpcCallSettings.<DeleteDataSourceDefinitionRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteDataSourceDefinitionMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<DeleteDataSourceDefinitionRequest>() {
                      @Override
                      public Map<String, String> extract(
                          DeleteDataSourceDefinitionRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<GetDataSourceDefinitionRequest, DataSourceDefinition>
        getDataSourceDefinitionTransportSettings =
            GrpcCallSettings.<GetDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(getDataSourceDefinitionMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetDataSourceDefinitionRequest>() {
                      @Override
                      public Map<String, String> extract(GetDataSourceDefinitionRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
        listDataSourceDefinitionsTransportSettings =
            GrpcCallSettings
                .<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>newBuilder()
                .setMethodDescriptor(listDataSourceDefinitionsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListDataSourceDefinitionsRequest>() {
                      @Override
                      public Map<String, String> extract(ListDataSourceDefinitionsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();

    this.updateTransferRunCallable =
        callableFactory.createUnaryCallable(
            updateTransferRunTransportSettings,
            settings.updateTransferRunSettings(),
            clientContext);
    this.logTransferRunMessagesCallable =
        callableFactory.createUnaryCallable(
            logTransferRunMessagesTransportSettings,
            settings.logTransferRunMessagesSettings(),
            clientContext);
    this.startBigQueryJobsCallable =
        callableFactory.createUnaryCallable(
            startBigQueryJobsTransportSettings,
            settings.startBigQueryJobsSettings(),
            clientContext);
    this.finishRunCallable =
        callableFactory.createUnaryCallable(
            finishRunTransportSettings, settings.finishRunSettings(), clientContext);
    this.createDataSourceDefinitionCallable =
        callableFactory.createUnaryCallable(
            createDataSourceDefinitionTransportSettings,
            settings.createDataSourceDefinitionSettings(),
            clientContext);
    this.updateDataSourceDefinitionCallable =
        callableFactory.createUnaryCallable(
            updateDataSourceDefinitionTransportSettings,
            settings.updateDataSourceDefinitionSettings(),
            clientContext);
    this.deleteDataSourceDefinitionCallable =
        callableFactory.createUnaryCallable(
            deleteDataSourceDefinitionTransportSettings,
            settings.deleteDataSourceDefinitionSettings(),
            clientContext);
    this.getDataSourceDefinitionCallable =
        callableFactory.createUnaryCallable(
            getDataSourceDefinitionTransportSettings,
            settings.getDataSourceDefinitionSettings(),
            clientContext);
    this.listDataSourceDefinitionsCallable =
        callableFactory.createUnaryCallable(
            listDataSourceDefinitionsTransportSettings,
            settings.listDataSourceDefinitionsSettings(),
            clientContext);
    this.listDataSourceDefinitionsPagedCallable =
        callableFactory.createPagedCallable(
            listDataSourceDefinitionsTransportSettings,
            settings.listDataSourceDefinitionsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<UpdateTransferRunRequest, TransferRun> updateTransferRunCallable() {
    return updateTransferRunCallable;
  }

  public UnaryCallable<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesCallable() {
    return logTransferRunMessagesCallable;
  }

  public UnaryCallable<StartBigQueryJobsRequest, Empty> startBigQueryJobsCallable() {
    return startBigQueryJobsCallable;
  }

  public UnaryCallable<FinishRunRequest, Empty> finishRunCallable() {
    return finishRunCallable;
  }

  public UnaryCallable<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionCallable() {
    return createDataSourceDefinitionCallable;
  }

  public UnaryCallable<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionCallable() {
    return updateDataSourceDefinitionCallable;
  }

  public UnaryCallable<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionCallable() {
    return deleteDataSourceDefinitionCallable;
  }

  public UnaryCallable<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionCallable() {
    return getDataSourceDefinitionCallable;
  }

  public UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsPagedCallable() {
    return listDataSourceDefinitionsPagedCallable;
  }

  public UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsCallable() {
    return listDataSourceDefinitionsCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
