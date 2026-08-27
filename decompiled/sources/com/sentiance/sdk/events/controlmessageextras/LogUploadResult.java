package com.sentiance.sdk.events.controlmessageextras;

/* JADX INFO: loaded from: classes3.dex */
public class LogUploadResult {
    private final ResultType IconCompatParcelizer;
    private final String read;

    public enum ResultType {
        SUCCESS,
        CANCELLED,
        FAILURE;

        public static ResultType fromBoolean(boolean z) {
            return z ? SUCCESS : FAILURE;
        }
    }

    public final String write() {
        return this.read;
    }

    public final boolean serializer() {
        return this.IconCompatParcelizer == ResultType.SUCCESS;
    }

    public LogUploadResult(String str, ResultType resultType) {
        this.read = str;
        this.IconCompatParcelizer = resultType;
    }
}
