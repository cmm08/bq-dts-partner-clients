// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * Represents the request of the UpdateDataSourceDefinition method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest}
 */
public  final class UpdateDataSourceDefinitionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest)
    UpdateDataSourceDefinitionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDataSourceDefinitionRequest.newBuilder() to construct.
  private UpdateDataSourceDefinitionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDataSourceDefinitionRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateDataSourceDefinitionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder subBuilder = null;
            if (dataSourceDefinition_ != null) {
              subBuilder = dataSourceDefinition_.toBuilder();
            }
            dataSourceDefinition_ = input.readMessage(com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataSourceDefinition_);
              dataSourceDefinition_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.class, com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.Builder.class);
  }

  public static final int DATA_SOURCE_DEFINITION_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition dataSourceDefinition_;
  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
   */
  public boolean hasDataSourceDefinition() {
    return dataSourceDefinition_ != null;
  }
  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
   */
  public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition getDataSourceDefinition() {
    return dataSourceDefinition_ == null ? com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance() : dataSourceDefinition_;
  }
  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
   */
  public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder getDataSourceDefinitionOrBuilder() {
    return getDataSourceDefinition();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Update field mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Update field mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Update field mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (dataSourceDefinition_ != null) {
      output.writeMessage(1, getDataSourceDefinition());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataSourceDefinition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDataSourceDefinition());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest other = (com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest) obj;

    if (hasDataSourceDefinition() != other.hasDataSourceDefinition()) return false;
    if (hasDataSourceDefinition()) {
      if (!getDataSourceDefinition()
          .equals(other.getDataSourceDefinition())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDataSourceDefinition()) {
      hash = (37 * hash) + DATA_SOURCE_DEFINITION_FIELD_NUMBER;
      hash = (53 * hash) + getDataSourceDefinition().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents the request of the UpdateDataSourceDefinition method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest)
      com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.class, com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataSourceDefinitionBuilder_ == null) {
        dataSourceDefinition_ = null;
      } else {
        dataSourceDefinition_ = null;
        dataSourceDefinitionBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest build() {
      com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest result = new com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest(this);
      if (dataSourceDefinitionBuilder_ == null) {
        result.dataSourceDefinition_ = dataSourceDefinition_;
      } else {
        result.dataSourceDefinition_ = dataSourceDefinitionBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.getDefaultInstance()) return this;
      if (other.hasDataSourceDefinition()) {
        mergeDataSourceDefinition(other.getDataSourceDefinition());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition dataSourceDefinition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder> dataSourceDefinitionBuilder_;
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    public boolean hasDataSourceDefinition() {
      return dataSourceDefinitionBuilder_ != null || dataSourceDefinition_ != null;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition getDataSourceDefinition() {
      if (dataSourceDefinitionBuilder_ == null) {
        return dataSourceDefinition_ == null ? com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance() : dataSourceDefinition_;
      } else {
        return dataSourceDefinitionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    public Builder setDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition value) {
      if (dataSourceDefinitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataSourceDefinition_ = value;
        onChanged();
      } else {
        dataSourceDefinitionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    public Builder setDataSourceDefinition(
        com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder builderForValue) {
      if (dataSourceDefinitionBuilder_ == null) {
        dataSourceDefinition_ = builderForValue.build();
        onChanged();
      } else {
        dataSourceDefinitionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    public Builder mergeDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition value) {
      if (dataSourceDefinitionBuilder_ == null) {
        if (dataSourceDefinition_ != null) {
          dataSourceDefinition_ =
            com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.newBuilder(dataSourceDefinition_).mergeFrom(value).buildPartial();
        } else {
          dataSourceDefinition_ = value;
        }
        onChanged();
      } else {
        dataSourceDefinitionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    public Builder clearDataSourceDefinition() {
      if (dataSourceDefinitionBuilder_ == null) {
        dataSourceDefinition_ = null;
        onChanged();
      } else {
        dataSourceDefinition_ = null;
        dataSourceDefinitionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder getDataSourceDefinitionBuilder() {
      
      onChanged();
      return getDataSourceDefinitionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder getDataSourceDefinitionOrBuilder() {
      if (dataSourceDefinitionBuilder_ != null) {
        return dataSourceDefinitionBuilder_.getMessageOrBuilder();
      } else {
        return dataSourceDefinition_ == null ?
            com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance() : dataSourceDefinition_;
      }
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder> 
        getDataSourceDefinitionFieldBuilder() {
      if (dataSourceDefinitionBuilder_ == null) {
        dataSourceDefinitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder>(
                getDataSourceDefinition(),
                getParentForChildren(),
                isClean());
        dataSourceDefinition_ = null;
      }
      return dataSourceDefinitionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Update field mask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest)
  private static final com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDataSourceDefinitionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDataSourceDefinitionRequest>() {
    @java.lang.Override
    public UpdateDataSourceDefinitionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateDataSourceDefinitionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateDataSourceDefinitionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDataSourceDefinitionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

