package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public interface Telemetry {
    void postOuterDeviceEvent(OuterDeviceAction outerDeviceAction);

    void postTelemetryCustomEvent(String str, String str2, String str3);

    void postUserFeedback(UserFeedbackMetadata userFeedbackMetadata, UserFeedback userFeedback, UserFeedbackCallback userFeedbackCallback);

    UserFeedbackHandle startBuildUserFeedbackMetadata();
}
