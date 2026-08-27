package com.sentiance.sdk.crashdetection.api;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class VehicleCrashDiagnostic {
    private final CrashDetectionState mCrashDetectionState;

    public CrashDetectionState getCrashDetectionState() {
        return this.mCrashDetectionState;
    }

    public String getCrashDetectionStateDescription() {
        return this.mCrashDetectionState.getDescription();
    }

    public VehicleCrashDiagnostic(CrashDetectionState crashDetectionState) {
        this.mCrashDetectionState = crashDetectionState;
    }

    public String toString() {
        return "VehicleCrashDiagnostic{mCrashDetectionState=" + this.mCrashDetectionState + '}';
    }
}
