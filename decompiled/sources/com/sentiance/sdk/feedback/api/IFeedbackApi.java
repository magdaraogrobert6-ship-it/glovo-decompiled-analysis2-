package com.sentiance.sdk.feedback.api;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes5.dex */
@DontObfuscate
public interface IFeedbackApi {
    OccupantRoleFeedbackResult submitOccupantRoleFeedback(String str, OccupantRoleFeedback occupantRoleFeedback);

    VehicleCrashDetectionFeedbackResult submitVehicleCrashDetectionFeedback(VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback);
}
