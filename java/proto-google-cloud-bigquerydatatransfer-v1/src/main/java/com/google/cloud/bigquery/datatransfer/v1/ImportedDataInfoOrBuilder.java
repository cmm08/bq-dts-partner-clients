// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface ImportedDataInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ImportedDataInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * SQL query to run. When empty, API checks that there is only one
   * table_def specified and loads this table. Only Standard SQL queries
   * are accepted. Legacy SQL is not allowed.
   * </pre>
   *
   * <code>string sql = 1;</code>
   */
  java.lang.String getSql();
  /**
   * <pre>
   * SQL query to run. When empty, API checks that there is only one
   * table_def specified and loads this table. Only Standard SQL queries
   * are accepted. Legacy SQL is not allowed.
   * </pre>
   *
   * <code>string sql = 1;</code>
   */
  com.google.protobuf.ByteString
      getSqlBytes();

  /**
   * <pre>
   * Table where results should be written.
   * </pre>
   *
   * <code>string destination_table_id = 2;</code>
   */
  java.lang.String getDestinationTableId();
  /**
   * <pre>
   * Table where results should be written.
   * </pre>
   *
   * <code>string destination_table_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getDestinationTableIdBytes();

  /**
   * <pre>
   * The description of a destination table. This can be several sentences
   * or paragraphs describing the table contents in detail.
   * </pre>
   *
   * <code>string destination_table_description = 10;</code>
   */
  java.lang.String getDestinationTableDescription();
  /**
   * <pre>
   * The description of a destination table. This can be several sentences
   * or paragraphs describing the table contents in detail.
   * </pre>
   *
   * <code>string destination_table_description = 10;</code>
   */
  com.google.protobuf.ByteString
      getDestinationTableDescriptionBytes();

  /**
   * <pre>
   * When used WITHOUT the "sql" parameter, describes the schema of the
   * destination table.
   * When used WITH the "sql" parameter, describes tables with data stored
   * outside of BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition table_defs = 3;</code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition> 
      getTableDefsList();
  /**
   * <pre>
   * When used WITHOUT the "sql" parameter, describes the schema of the
   * destination table.
   * When used WITH the "sql" parameter, describes tables with data stored
   * outside of BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition table_defs = 3;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition getTableDefs(int index);
  /**
   * <pre>
   * When used WITHOUT the "sql" parameter, describes the schema of the
   * destination table.
   * When used WITH the "sql" parameter, describes tables with data stored
   * outside of BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition table_defs = 3;</code>
   */
  int getTableDefsCount();
  /**
   * <pre>
   * When used WITHOUT the "sql" parameter, describes the schema of the
   * destination table.
   * When used WITH the "sql" parameter, describes tables with data stored
   * outside of BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition table_defs = 3;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinitionOrBuilder> 
      getTableDefsOrBuilderList();
  /**
   * <pre>
   * When used WITHOUT the "sql" parameter, describes the schema of the
   * destination table.
   * When used WITH the "sql" parameter, describes tables with data stored
   * outside of BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinition table_defs = 3;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.ImportedDataInfo.TableDefinitionOrBuilder getTableDefsOrBuilder(
      int index);

  /**
   * <pre>
   * Inline code for User-defined function resources.
   * Ignored when "sql" parameter is empty.
   * </pre>
   *
   * <code>repeated string user_defined_functions = 4;</code>
   */
  java.util.List<java.lang.String>
      getUserDefinedFunctionsList();
  /**
   * <pre>
   * Inline code for User-defined function resources.
   * Ignored when "sql" parameter is empty.
   * </pre>
   *
   * <code>repeated string user_defined_functions = 4;</code>
   */
  int getUserDefinedFunctionsCount();
  /**
   * <pre>
   * Inline code for User-defined function resources.
   * Ignored when "sql" parameter is empty.
   * </pre>
   *
   * <code>repeated string user_defined_functions = 4;</code>
   */
  java.lang.String getUserDefinedFunctions(int index);
  /**
   * <pre>
   * Inline code for User-defined function resources.
   * Ignored when "sql" parameter is empty.
   * </pre>
   *
   * <code>repeated string user_defined_functions = 4;</code>
   */
  com.google.protobuf.ByteString
      getUserDefinedFunctionsBytes(int index);
}
