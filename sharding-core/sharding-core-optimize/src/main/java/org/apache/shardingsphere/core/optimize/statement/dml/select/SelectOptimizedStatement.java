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

package org.apache.shardingsphere.core.optimize.statement.dml.select;

import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.core.optimize.statement.dml.DMLOptimizedStatement;
import org.apache.shardingsphere.core.optimize.statement.dml.condition.ShardingCondition;
import org.apache.shardingsphere.core.optimize.statement.dml.condition.ShardingConditions;
import org.apache.shardingsphere.core.optimize.statement.dml.select.pagination.Pagination;
import org.apache.shardingsphere.core.parse.sql.statement.SQLStatement;

import java.util.List;

/**
 * Optimized statement for select.
 *
 * @author zhangliang
 */
@Getter
@Setter
public final class SelectOptimizedStatement extends DMLOptimizedStatement {
    
    private Pagination pagination;
    
    public SelectOptimizedStatement(final SQLStatement sqlStatement, final List<ShardingCondition> shardingConditions) {
        super(sqlStatement, new ShardingConditions(shardingConditions));
    }
}
