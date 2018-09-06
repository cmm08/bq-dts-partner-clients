# Getting Started with BigQuery Data Transfer API

<a href="https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/GoogleCloudPlatform/java-docs-samples&page=editor&open_in_editor=bigquery/datatransfer/cloud-client/README.md">
<img alt="Open in Cloud Shell" src ="http://gstatic.com/cloudssh/images/open-btn.png"></a>

[BigQuery Data Transfer Service][BigQuery Data Transfer] features an API that
allows developers to create transfer jobs from data sources to BigQuery.
These sample Java applications demonstrate how to access the BigQuery Data
Transfer API using the [BigQuery Data Transfer Service Client Library for
Java][bigquery-dts-client-java].

[BigQuery Data Transfer]: https://cloud.google.com/bigquery/docs/transfer-service-overview
[bigquery-dts-client-java]: https://github.com/cmm08/bq-dts-partner-clients

## Quickstart

Install [Maven](http://maven.apache.org/).

[Authenticate using a service account](https://cloud.google.com/docs/authentication/getting-started).
Create a service account, download a JSON key file, and set the `GOOGLE_APPLICATION_CREDENTIALS` environment variable.

Build your project with:

	mvn clean package -DskipTests

You can now the examples under partner-exmaples folder:

	cd partner-examples
	mvn exec:java -Dexec.classpathScope=compile \
           -Dexec.mainClass=com.example.bigquerydatatransfer.DataTransferServiceClientSample \
           -Dexec.args='<your_project_id>' -Dexec.cleanupDaemonThreads=false

For illustration purpose, the example calls the following two BigQuery Data Transfer API methods:
  * [ListTransferConfigs](https://cloud.google.com/bigquery/docs/reference/datatransfer/rest/v1/projects.locations.transferConfigs/list)

  * [ListDataSourceDefinitions](https://cloud.google.com/bigquery/docs/reference/data-transfer/partner/rest/v1/projects.locations.dataSourceDefinitions/list)

Note that the 2nd method is only visible to whitelisted partner projects. Plese contact
bq-connectors-eng@google.com for more information.

If you like, you can also use gradle to build the client library and example:
        ./gradlew build

