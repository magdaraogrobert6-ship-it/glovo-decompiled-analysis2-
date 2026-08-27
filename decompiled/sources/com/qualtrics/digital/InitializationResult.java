package com.qualtrics.digital;

/* JADX INFO: loaded from: classes3.dex */
public class InitializationResult {
    private String mMessage;
    private Boolean mResult;

    public String getMessage() {
        return this.mMessage;
    }

    public boolean passed() {
        return this.mResult.booleanValue();
    }

    public InitializationResult(Boolean bool, String str) {
        this.mResult = bool;
        this.mMessage = str;
    }
}
