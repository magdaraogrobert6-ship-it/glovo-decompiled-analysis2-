package com.sentiance.sdk.events;

/* JADX INFO: loaded from: classes3.dex */
public class EventUploadResult {
    private final String RemoteActionCompatParcelizer;
    private final ResultType read;

    public enum ResultType {
        SUCCESS,
        CANCELLED,
        FAILURE_OTHER,
        FAILURE_QUOTA
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean write() {
        return this.read == ResultType.SUCCESS;
    }

    public EventUploadResult(String str, ResultType resultType) {
        this.RemoteActionCompatParcelizer = str;
        this.read = resultType;
    }
}
