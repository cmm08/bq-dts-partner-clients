/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.bigquery.v2;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DataSourceDefinitionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}/dataSourceDefinitions/{data_source_definition}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String location;
  private final String dataSourceDefinition;

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getDataSourceDefinition() {
    return dataSourceDefinition;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DataSourceDefinitionName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    dataSourceDefinition = Preconditions.checkNotNull(builder.getDataSourceDefinition());
  }

  public static DataSourceDefinitionName of(String project, String location, String dataSourceDefinition) {
    return newBuilder()
      .setProject(project)
      .setLocation(location)
      .setDataSourceDefinition(dataSourceDefinition)
      .build();
  }

  public static String format(String project, String location, String dataSourceDefinition) {
    return newBuilder()
      .setProject(project)
      .setLocation(location)
      .setDataSourceDefinition(dataSourceDefinition)
      .build()
      .toString();
  }

  public static DataSourceDefinitionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DataSourceDefinitionName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("location"), matchMap.get("data_source_definition"));
  }

  public static List<DataSourceDefinitionName> parseList(List<String> formattedStrings) {
    List<DataSourceDefinitionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DataSourceDefinitionName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DataSourceDefinitionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("location", location);
          fieldMapBuilder.put("dataSourceDefinition", dataSourceDefinition);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "location", location, "data_source_definition", dataSourceDefinition);
  }

  /** Builder for DataSourceDefinitionName. */
  public static class Builder {

    private String project;
    private String location;
    private String dataSourceDefinition;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getDataSourceDefinition() {
      return dataSourceDefinition;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setDataSourceDefinition(String dataSourceDefinition) {
      this.dataSourceDefinition = dataSourceDefinition;
      return this;
    }

    private Builder() {
    }

    private Builder(DataSourceDefinitionName dataSourceDefinitionName) {
      project = dataSourceDefinitionName.project;
      location = dataSourceDefinitionName.location;
      dataSourceDefinition = dataSourceDefinitionName.dataSourceDefinition;
    }

    public DataSourceDefinitionName build() {
      return new DataSourceDefinitionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DataSourceDefinitionName) {
      DataSourceDefinitionName that = (DataSourceDefinitionName) o;
      return (this.project.equals(that.project))
          && (this.location.equals(that.location))
          && (this.dataSourceDefinition.equals(that.dataSourceDefinition));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= location.hashCode();
    h *= 1000003;
    h ^= dataSourceDefinition.hashCode();
    return h;
  }
}

