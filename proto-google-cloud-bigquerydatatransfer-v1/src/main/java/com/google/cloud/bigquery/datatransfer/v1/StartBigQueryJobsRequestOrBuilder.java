// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface StartBigQueryJobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the resource in the form:
   * "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource in the form:
   * "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Import jobs which should be started and monitored.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo imported_data = 2;</code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo> 
      getImportedDataList();
  /**
   * <pre>
   * Import jobs which should be started and monitored.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo imported_data = 2;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo getImportedData(int index);
  /**
   * <pre>
   * Import jobs which should be started and monitored.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo imported_data = 2;</code>
   */
  int getImportedDataCount();
  /**
   * <pre>
   * Import jobs which should be started and monitored.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo imported_data = 2;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.ImportedDataInfoOrBuilder> 
      getImportedDataOrBuilderList();
  /**
   * <pre>
   * Import jobs which should be started and monitored.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo imported_data = 2;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.ImportedDataInfoOrBuilder getImportedDataOrBuilder(
      int index);

  /**
   * <pre>
   * User credentials which should be used to start/monitor
   * BigQuery jobs. If not specified, then jobs
   * are started using data source service account credentials.
   * This may be OAuth token or JWT token.
   * </pre>
   *
   * <code>bytes user_credentials = 3;</code>
   */
  com.google.protobuf.ByteString getUserCredentials();

  /**
   * <pre>
   * The number of BQ Jobs that can run in parallel.
   * </pre>
   *
   * <code>int32 max_parallelism = 8;</code>
   */
  int getMaxParallelism();
}
