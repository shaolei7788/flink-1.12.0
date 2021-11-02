/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.api.java.typeutils.runtime;

import org.apache.flink.api.common.typeutils.SerializerTestBase;
import org.apache.flink.api.common.typeutils.TypeSerializer;

import java.util.UUID;

/**
 * Tests for the {@link WritableSerializer} with {@link WritableID}.
 */
public class WritableSerializerUUIDTest extends SerializerTestBase<WritableID> {
	@Override
	protected TypeSerializer<WritableID> createSerializer() {
		return new WritableSerializer<>(WritableID.class);
	}

	@Override
	protected int getLength() {
		return -1;
	}

	@Override
	protected Class<WritableID> getTypeClass() {
		return WritableID.class;
	}

	@Override
	protected WritableID[] getTestData() {
		return new WritableID[] {
			new WritableID(new UUID(0, 0)),
			new WritableID(new UUID(1, 0)),
			new WritableID(new UUID(1, 1))
		};
	}
}
