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

package com.google.cloud.bigquery.datatransfer.v1;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class CredentialName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}/dataSources/{data_source}/credentials/{credential}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String location;
  private final String dataSource;
  private final String credential;

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getDataSource() {
    return dataSource;
  }

  public String getCredential() {
    return credential;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CredentialName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    dataSource = Preconditions.checkNotNull(builder.getDataSource());
    credential = Preconditions.checkNotNull(builder.getCredential());
  }

  public static CredentialName of(String project, String location, String dataSource, String credential) {
    return newBuilder()
      .setProject(project)
      .setLocation(location)
      .setDataSource(dataSource)
      .setCredential(credential)
      .build();
  }

  public static String format(String project, String location, String dataSource, String credential) {
    return newBuilder()
      .setProject(project)
      .setLocation(location)
      .setDataSource(dataSource)
      .setCredential(credential)
      .build()
      .toString();
  }

  public static CredentialName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CredentialName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("location"), matchMap.get("data_source"), matchMap.get("credential"));
  }

  public static List<CredentialName> parseList(List<String> formattedStrings) {
    List<CredentialName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CredentialName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CredentialName value : values) {
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
          fieldMapBuilder.put("dataSource", dataSource);
          fieldMapBuilder.put("credential", credential);
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
    return PATH_TEMPLATE.instantiate("project", project, "location", location, "data_source", dataSource, "credential", credential);
  }

  /** Builder for CredentialName. */
  public static class Builder {

    private String project;
    private String location;
    private String dataSource;
    private String credential;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getDataSource() {
      return dataSource;
    }

    public String getCredential() {
      return credential;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setDataSource(String dataSource) {
      this.dataSource = dataSource;
      return this;
    }

    public Builder setCredential(String credential) {
      this.credential = credential;
      return this;
    }

    private Builder() {
    }

    private Builder(CredentialName credentialName) {
      project = credentialName.project;
      location = credentialName.location;
      dataSource = credentialName.dataSource;
      credential = credentialName.credential;
    }

    public CredentialName build() {
      return new CredentialName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CredentialName) {
      CredentialName that = (CredentialName) o;
      return (this.project.equals(that.project))
          && (this.location.equals(that.location))
          && (this.dataSource.equals(that.dataSource))
          && (this.credential.equals(that.credential));
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
    h ^= dataSource.hashCode();
    h *= 1000003;
    h ^= credential.hashCode();
    return h;
  }
}

