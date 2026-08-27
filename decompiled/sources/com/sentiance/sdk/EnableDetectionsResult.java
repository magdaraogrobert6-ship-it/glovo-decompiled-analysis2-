package com.sentiance.sdk;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class EnableDetectionsResult {
    private final DetectionStatus mDetectionStatus;
    private final SdkStatus mSdkStatus;

    public DetectionStatus getDetectionStatus() {
        return this.mDetectionStatus;
    }

    public SdkStatus getSdkStatus() {
        return this.mSdkStatus;
    }

    public EnableDetectionsResult(SdkStatus sdkStatus) {
        this.mSdkStatus = sdkStatus;
        this.mDetectionStatus = DetectionStatus.fromSdkStatus(sdkStatus.startStatus);
    }
}
