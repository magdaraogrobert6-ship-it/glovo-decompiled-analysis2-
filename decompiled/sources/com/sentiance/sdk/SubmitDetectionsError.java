package com.sentiance.sdk;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class SubmitDetectionsError {
    private final SubmitDetectionsFailureReason mSubmitDetectionsFailureReason;

    public SubmitDetectionsFailureReason getReason() {
        return this.mSubmitDetectionsFailureReason;
    }

    public SubmitDetectionsError(SubmitDetectionsFailureReason submitDetectionsFailureReason) {
        this.mSubmitDetectionsFailureReason = submitDetectionsFailureReason;
    }
}
