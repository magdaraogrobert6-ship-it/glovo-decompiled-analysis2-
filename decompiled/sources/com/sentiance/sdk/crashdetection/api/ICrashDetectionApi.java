package com.sentiance.sdk.crashdetection.api;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface ICrashDetectionApi {
    void invokeDummyVehicleCrash();

    boolean isVehicleCrashDetectionSupported();

    void setVehicleCrashDiagnosticListener(VehicleCrashDiagnosticListener vehicleCrashDiagnosticListener);

    void setVehicleCrashListener(VehicleCrashListener vehicleCrashListener);
}
