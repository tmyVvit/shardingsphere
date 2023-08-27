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

package org.apache.shardingsphere.test.it.sql.parser.internal.asserts.segment.tablespace;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.sql.parser.sql.common.segment.ddl.tablespace.TablespaceSegment;
import org.apache.shardingsphere.test.it.sql.parser.internal.asserts.SQLCaseAssertContext;
import org.apache.shardingsphere.test.it.sql.parser.internal.asserts.segment.SQLSegmentAssert;
import org.apache.shardingsphere.test.it.sql.parser.internal.asserts.segment.identifier.IdentifierValueAssert;
import org.apache.shardingsphere.test.it.sql.parser.internal.cases.parser.jaxb.segment.impl.tablespace.ExpectedTablespace;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TablespaceAssert {
    
    /**
     * Assert actual tablespace segment is correct with expected tablespace.
     *
     * @param assertContext assert context
     * @param actual actual tablespace segment
     * @param expected expected tablespace
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final TablespaceSegment actual, final ExpectedTablespace expected) {
        assertNotNull(expected, assertContext.getText("Tablespace should exist."));
        IdentifierValueAssert.assertIs(assertContext, actual.getIdentifier(), expected, "Tablespace");
        SQLSegmentAssert.assertIs(assertContext, actual, expected);
    }
}
