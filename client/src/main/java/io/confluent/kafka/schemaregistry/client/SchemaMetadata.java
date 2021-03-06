/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License; you may not use this file
 * except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafka.schemaregistry.client;

public class SchemaMetadata {

  private int id;
  private int version;
  private String schema;

  public SchemaMetadata(int id, int version, String schema) {
    this.id = id;
    this.version = version;
    this.schema = schema;

  }

  public int getId() {
    return id;
  }

  public int getVersion() {
    return version;
  }

  public String getSchema() {
    return schema;
  }
}
