/*
 * UnsupportedFormatVersionException.java
 *
 * This source file is part of the FoundationDB open source project
 *
 * Copyright 2015-2018 Apple Inc. and the FoundationDB project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.apple.foundationdb.record.provider.foundationdb;

import com.apple.foundationdb.API;
import com.apple.foundationdb.record.RecordCoreException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Exception thrown when a record store has a format version in the database that is not supported by this codebase.
 *
 * @see FDBRecordStoreBase#getFormatVersion
 */
@SuppressWarnings("serial")
@API(API.Status.STABLE)
public class UnsupportedFormatVersionException extends RecordCoreException {
    public UnsupportedFormatVersionException(@Nonnull String msg, @Nullable Object ... keyValues) {
        super(msg, keyValues);
    }

    public UnsupportedFormatVersionException(Throwable cause) {
        super(cause);
    }

    public UnsupportedFormatVersionException(@Nonnull String msg, @Nullable Throwable cause) {
        super(msg, cause);
    }
}
