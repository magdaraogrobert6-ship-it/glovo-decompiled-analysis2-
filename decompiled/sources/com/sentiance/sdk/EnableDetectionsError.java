package com.sentiance.sdk;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class EnableDetectionsError {
    private final DetectionStatus mDetectionStatus;
    private final EnableDetectionsFailureReason mEnableDetectionsFailureReason;
    private final SdkStatus mSdkStatus;

    public DetectionStatus getDetectionStatus() {
        return this.mDetectionStatus;
    }

    public EnableDetectionsFailureReason getReason() {
        return this.mEnableDetectionsFailureReason;
    }

    public SdkStatus getSdkStatus() {
        return this.mSdkStatus;
    }

    public EnableDetectionsError(SdkStatus sdkStatus, EnableDetectionsFailureReason enableDetectionsFailureReason) {
        this.mSdkStatus = sdkStatus;
        this.mDetectionStatus = DetectionStatus.fromSdkStatus(sdkStatus.startStatus);
        this.mEnableDetectionsFailureReason = enableDetectionsFailureReason;
    }
}
