package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface IDrivingInsightsApi {
    Float getAverageOverallSafetyScore(SafetyScoreRequestParameters safetyScoreRequestParameters);

    List<CallEvent> getCallEvents(String str);

    @Deprecated(since = "6.20.0")
    List<CallWhileMovingEvent> getCallWhileMovingEvents(String str);

    DrivingInsights getDrivingInsights(String str);

    List<HarshDrivingEvent> getHarshDrivingEvents(String str);

    List<PhoneUsageEvent> getPhoneUsageEvents(String str);

    List<SpeedingEvent> getSpeedingEvents(String str);

    List<WrongWayDrivingEvent> getWrongWayDrivingEvents(String str);

    void setDrivingInsightsReadyListener(DrivingInsightsReadyListener drivingInsightsReadyListener);
}
