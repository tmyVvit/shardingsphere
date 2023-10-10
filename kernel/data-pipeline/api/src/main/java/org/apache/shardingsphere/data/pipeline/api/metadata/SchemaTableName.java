/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.data.pipeline.api.metadata;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Schema name and table name.
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class SchemaTableName {
    
    @NonNull
    private final SchemaName schemaName;
    
    @NonNull
    private final TableName tableName;
    
    public SchemaTableName(final String schemaName, final String tableName) {
        this.schemaName = new SchemaName(schemaName);
        this.tableName = new TableName(tableName);
    }
    
    /**
     * Marshal to text.
     *
     * @return text
     */
    public String marshal() {
        String schemaName = this.schemaName.getOriginal();
        return null == schemaName ? tableName.getOriginal() : schemaName + "." + tableName.getOriginal();
    }
}
