package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum PayloadTypeBucketForExternalSubmissionControl {
    ALWAYS_SUBMIT(0),
    SDK_INFO(1),
    VEHICLE_CRASH_INFO(2),
    GENERAL_DETECTIONS(3);

    public final int value;

    PayloadTypeBucketForExternalSubmissionControl(int i) {
        this.value = i;
    }

    public static PayloadTypeBucketForExternalSubmissionControl findByValue(int i) {
        if (i == 0) {
            return ALWAYS_SUBMIT;
        }
        if (i == 1) {
            return SDK_INFO;
        }
        if (i == 2) {
            return VEHICLE_CRASH_INFO;
        }
        if (i != 3) {
            return null;
        }
        return GENERAL_DETECTIONS;
    }
}
