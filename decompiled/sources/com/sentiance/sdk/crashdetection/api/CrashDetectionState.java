package com.sentiance.sdk.crashdetection.api;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public enum CrashDetectionState {
    CANDIDATE_DETECTED("crash candidate detected"),
    CANDIDATE_DISCARDED_WEAK_IMPACT("crash candidate discarded - impact is too weak"),
    CANDIDATE_DISCARDED_NON_VEHICLE_TRANSPORT_MODE("crash candidate discarded - transport mode is not a vehicle"),
    CANDIDATE_DISCARDED_PRE_IMPACT_NOISE("crash candidate discarded - pre-impact signal contains too much noise"),
    CANDIDATE_DISCARDED_LOW_SPEED_BEFORE_IMPACT("crash candidate discarded - speed before impact is too low"),
    CANDIDATE_DISCARDED_POST_IMPACT_NOISE("crash candidate discarded - post-impact signal contains too much noise"),
    CANDIDATE_DISCARDED_HIGH_SPEED_AFTER_IMPACT("crash candidate discarded - speed after impact is too high"),
    CANDIDATE_DISCARDED_BAD_LOCATION_ACCURACY_BEFORE_IMPACT("crash candidate discarded - accuracy before impact is too bad");

    private final String description;

    public String getDescription() {
        return this.description;
    }

    CrashDetectionState(String str) {
        this.description = str;
    }

    public static CrashDetectionState of(float f) {
        switch ((int) f) {
            case 0:
                return CANDIDATE_DETECTED;
            case 1:
                return CANDIDATE_DISCARDED_WEAK_IMPACT;
            case 2:
                return CANDIDATE_DISCARDED_NON_VEHICLE_TRANSPORT_MODE;
            case 3:
                return CANDIDATE_DISCARDED_PRE_IMPACT_NOISE;
            case 4:
                return CANDIDATE_DISCARDED_LOW_SPEED_BEFORE_IMPACT;
            case 5:
                return CANDIDATE_DISCARDED_POST_IMPACT_NOISE;
            case 6:
                return CANDIDATE_DISCARDED_HIGH_SPEED_AFTER_IMPACT;
            case 7:
                return CANDIDATE_DISCARDED_BAD_LOCATION_ACCURACY_BEFORE_IMPACT;
            default:
                return null;
        }
    }
}
