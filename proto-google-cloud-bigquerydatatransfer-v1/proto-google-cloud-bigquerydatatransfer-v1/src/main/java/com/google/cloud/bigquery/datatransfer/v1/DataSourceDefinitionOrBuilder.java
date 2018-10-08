// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface DataSourceDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.DataSourceDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the data source definition.
   * Data source definition names have the form
   * `projects/{project_id}/locations/{location}/dataSourceDefinitions/{data_source_id}`.
   * </pre>
   *
   * <code>string name = 21;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the data source definition.
   * Data source definition names have the form
   * `projects/{project_id}/locations/{location}/dataSourceDefinitions/{data_source_id}`.
   * </pre>
   *
   * <code>string name = 21;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Data source metadata.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource data_source = 1;</code>
   */
  boolean hasDataSource();
  /**
   * <pre>
   * Data source metadata.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource data_source = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSource getDataSource();
  /**
   * <pre>
   * Data source metadata.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource data_source = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceOrBuilder getDataSourceOrBuilder();

  /**
   * <pre>
   * Output only. The pubsub topic to be used for broadcasting a message when a
   * transfer run is created. The comments about "{region}" for
   * transfer_config_pubsub_topic apply here too.
   * </pre>
   *
   * <code>string transfer_run_pubsub_topic = 13;</code>
   */
  java.lang.String getTransferRunPubsubTopic();
  /**
   * <pre>
   * Output only. The pubsub topic to be used for broadcasting a message when a
   * transfer run is created. The comments about "{region}" for
   * transfer_config_pubsub_topic apply here too.
   * </pre>
   *
   * <code>string transfer_run_pubsub_topic = 13;</code>
   */
  com.google.protobuf.ByteString
      getTransferRunPubsubTopicBytes();

  /**
   * <pre>
   * Duration which should be added to schedule_time to calculate
   * run_time when job is scheduled. Only applicable for automatically
   * scheduled transfer runs. Used to start a run early on a data source that
   * supports continuous data refresh to compensate for unknown timezone
   * offsets. Use a negative number to start a run late for data sources not
   * supporting continuous data refresh.
   * </pre>
   *
   * <code>.google.protobuf.Duration run_time_offset = 16;</code>
   */
  boolean hasRunTimeOffset();
  /**
   * <pre>
   * Duration which should be added to schedule_time to calculate
   * run_time when job is scheduled. Only applicable for automatically
   * scheduled transfer runs. Used to start a run early on a data source that
   * supports continuous data refresh to compensate for unknown timezone
   * offsets. Use a negative number to start a run late for data sources not
   * supporting continuous data refresh.
   * </pre>
   *
   * <code>.google.protobuf.Duration run_time_offset = 16;</code>
   */
  com.google.protobuf.Duration getRunTimeOffset();
  /**
   * <pre>
   * Duration which should be added to schedule_time to calculate
   * run_time when job is scheduled. Only applicable for automatically
   * scheduled transfer runs. Used to start a run early on a data source that
   * supports continuous data refresh to compensate for unknown timezone
   * offsets. Use a negative number to start a run late for data sources not
   * supporting continuous data refresh.
   * </pre>
   *
   * <code>.google.protobuf.Duration run_time_offset = 16;</code>
   */
  com.google.protobuf.DurationOrBuilder getRunTimeOffsetOrBuilder();

  /**
   * <pre>
   * Support e-mail address of the OAuth client's Brand, which contains the
   * consent screen data.
   * </pre>
   *
   * <code>string support_email = 22;</code>
   */
  java.lang.String getSupportEmail();
  /**
   * <pre>
   * Support e-mail address of the OAuth client's Brand, which contains the
   * consent screen data.
   * </pre>
   *
   * <code>string support_email = 22;</code>
   */
  com.google.protobuf.ByteString
      getSupportEmailBytes();

  /**
   * <pre>
   * Is data source disabled? If true, data_source is not visible.
   * API will also stop returning any data transfer configs and/or runs
   * associated with the data source. This setting has higher priority
   * than whitelisted_project_ids.
   * </pre>
   *
   * <code>bool disabled = 5;</code>
   */
  boolean getDisabled();

  /**
   * <pre>
   * Output only. The pub sub topic to use for broadcasting a message for
   * transfer config. If empty, a message will not be broadcasted.
   * If "{region}" is found in the value, then that means, data source wants
   * to handle message separately for datasets in different regions. We will
   * replace {region} with the actual region of dataset (of type
   * cloud.helix.CloudRegion), as the actual topic name. For example,
   * projects/connector/topics/scheduler-{region} could become
   * projects/connector/topics/scheduler-JURISDICTION_US.
   * If "{region}" is not found,  then we will use the input value as topic
   * name.
   * </pre>
   *
   * <code>string transfer_config_pubsub_topic = 12;</code>
   */
  java.lang.String getTransferConfigPubsubTopic();
  /**
   * <pre>
   * Output only. The pub sub topic to use for broadcasting a message for
   * transfer config. If empty, a message will not be broadcasted.
   * If "{region}" is found in the value, then that means, data source wants
   * to handle message separately for datasets in different regions. We will
   * replace {region} with the actual region of dataset (of type
   * cloud.helix.CloudRegion), as the actual topic name. For example,
   * projects/connector/topics/scheduler-{region} could become
   * projects/connector/topics/scheduler-JURISDICTION_US.
   * If "{region}" is not found,  then we will use the input value as topic
   * name.
   * </pre>
   *
   * <code>string transfer_config_pubsub_topic = 12;</code>
   */
  com.google.protobuf.ByteString
      getTransferConfigPubsubTopicBytes();

  /**
   * <pre>
   * Supported location_ids of the data source. The valid values are the
   * "location_id" field of the response of
   * `GET
   * https://bigquerydatatransfer.googleapis.com/v1/{name=projects/&#42;}/locations`
   * In addition, if the data source needs to support all available regions,
   * supported_location_ids can be set to "global" (a single string element).
   * When "global" is specified:
   * 1) the data source implementation is supposed to stage the data in proper
   * region of the destination dataset;
   * 2) Data source developer should be aware of the implications (e.g., network
   * traffic latency, potential charge associated with cross-region traffic,
   * etc.) of supporting the "global" region;
   * 3) when new regions are added in Data Transfer Service, the new
   * regions will be treated as "supported" automatically (that is, no need to
   * update the supported_location_ids field).
   * </pre>
   *
   * <code>repeated string supported_location_ids = 23;</code>
   */
  java.util.List<java.lang.String>
      getSupportedLocationIdsList();
  /**
   * <pre>
   * Supported location_ids of the data source. The valid values are the
   * "location_id" field of the response of
   * `GET
   * https://bigquerydatatransfer.googleapis.com/v1/{name=projects/&#42;}/locations`
   * In addition, if the data source needs to support all available regions,
   * supported_location_ids can be set to "global" (a single string element).
   * When "global" is specified:
   * 1) the data source implementation is supposed to stage the data in proper
   * region of the destination dataset;
   * 2) Data source developer should be aware of the implications (e.g., network
   * traffic latency, potential charge associated with cross-region traffic,
   * etc.) of supporting the "global" region;
   * 3) when new regions are added in Data Transfer Service, the new
   * regions will be treated as "supported" automatically (that is, no need to
   * update the supported_location_ids field).
   * </pre>
   *
   * <code>repeated string supported_location_ids = 23;</code>
   */
  int getSupportedLocationIdsCount();
  /**
   * <pre>
   * Supported location_ids of the data source. The valid values are the
   * "location_id" field of the response of
   * `GET
   * https://bigquerydatatransfer.googleapis.com/v1/{name=projects/&#42;}/locations`
   * In addition, if the data source needs to support all available regions,
   * supported_location_ids can be set to "global" (a single string element).
   * When "global" is specified:
   * 1) the data source implementation is supposed to stage the data in proper
   * region of the destination dataset;
   * 2) Data source developer should be aware of the implications (e.g., network
   * traffic latency, potential charge associated with cross-region traffic,
   * etc.) of supporting the "global" region;
   * 3) when new regions are added in Data Transfer Service, the new
   * regions will be treated as "supported" automatically (that is, no need to
   * update the supported_location_ids field).
   * </pre>
   *
   * <code>repeated string supported_location_ids = 23;</code>
   */
  java.lang.String getSupportedLocationIds(int index);
  /**
   * <pre>
   * Supported location_ids of the data source. The valid values are the
   * "location_id" field of the response of
   * `GET
   * https://bigquerydatatransfer.googleapis.com/v1/{name=projects/&#42;}/locations`
   * In addition, if the data source needs to support all available regions,
   * supported_location_ids can be set to "global" (a single string element).
   * When "global" is specified:
   * 1) the data source implementation is supposed to stage the data in proper
   * region of the destination dataset;
   * 2) Data source developer should be aware of the implications (e.g., network
   * traffic latency, potential charge associated with cross-region traffic,
   * etc.) of supporting the "global" region;
   * 3) when new regions are added in Data Transfer Service, the new
   * regions will be treated as "supported" automatically (that is, no need to
   * update the supported_location_ids field).
   * </pre>
   *
   * <code>repeated string supported_location_ids = 23;</code>
   */
  com.google.protobuf.ByteString
      getSupportedLocationIdsBytes(int index);
}
