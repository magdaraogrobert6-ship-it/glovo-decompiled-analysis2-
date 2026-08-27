package com.sentiance.sdk.logging;

/* JADX INFO: loaded from: classes3.dex */
public enum LogFilePurpose {
    LOGCAT("logcat"),
    EXCEPTION("exception"),
    SERVICES("services"),
    USAGE("usage"),
    TASKS("tasks"),
    INFERENCE("inference");

    private final String mFileName;

    public String getFileName() {
        return this.mFileName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mFileName;
    }

    LogFilePurpose(String str) {
        this.mFileName = str;
    }
}
