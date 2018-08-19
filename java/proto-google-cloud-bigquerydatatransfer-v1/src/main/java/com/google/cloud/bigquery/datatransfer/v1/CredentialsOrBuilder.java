// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of this credentials object in the form
   * projects/-/locations/{location_id}/dataSources/{data_source_id}/credentials/{user_id}
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of this credentials object in the form
   * projects/-/locations/{location_id}/dataSources/{data_source_id}/credentials/{user_id}
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Auth token which can be used to perform requests on behalf of the user.
   * </pre>
   *
   * <code>string auth_token = 1;</code>
   */
  java.lang.String getAuthToken();
  /**
   * <pre>
   * Auth token which can be used to perform requests on behalf of the user.
   * </pre>
   *
   * <code>string auth_token = 1;</code>
   */
  com.google.protobuf.ByteString
      getAuthTokenBytes();
}
