package org.apache.commons.compress;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class MemoryLimitException extends IOException {
    public MemoryLimitException(long j, int i) {
        super(j + " kb of memory would be needed; limit was " + i + " kb. If the file is not corrupt, consider increasing the memory limit.");
    }
}
