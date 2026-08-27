package com.sentiance.sdk.trip;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.SdkStatus;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class StopTripError {
    private final SdkStatus mSdkStatus;
    private final StopTripFailureReason mStopTripFailureReason;

    public StopTripFailureReason getReason() {
        return this.mStopTripFailureReason;
    }

    public SdkStatus getSdkStatus() {
        return this.mSdkStatus;
    }

    public StopTripError(StopTripFailureReason stopTripFailureReason, SdkStatus sdkStatus) {
        this.mStopTripFailureReason = stopTripFailureReason;
        this.mSdkStatus = sdkStatus;
    }
}
