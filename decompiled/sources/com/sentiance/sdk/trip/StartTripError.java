package com.sentiance.sdk.trip;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.SdkStatus;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class StartTripError {
    private final SdkStatus mSdkStatus;
    private final StartTripFailureReason mStartTripFailureReason;

    public StartTripFailureReason getReason() {
        return this.mStartTripFailureReason;
    }

    public SdkStatus getSdkStatus() {
        return this.mSdkStatus;
    }

    public StartTripError(StartTripFailureReason startTripFailureReason, SdkStatus sdkStatus) {
        this.mStartTripFailureReason = startTripFailureReason;
        this.mSdkStatus = sdkStatus;
    }
}
