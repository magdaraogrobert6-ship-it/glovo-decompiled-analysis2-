package com.sentiance.sdk.memory;

/* JADX INFO: loaded from: classes5.dex */
public enum MemoryDecisionReason {
    OK("OK"),
    INSUFFICIENT_HEAP_HEADROOM("Insufficient heap headroom"),
    SYSTEM_MEMORY_LOW("System memory is low");

    private final String description;

    public final String getDescription() {
        return this.description;
    }

    MemoryDecisionReason(String str) {
        this.description = str;
    }
}
