package com.sentiance.sdk.trip;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.SdkStatus;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface StopTripCallback {
    void onFailure(SdkStatus sdkStatus);

    void onSuccess();
}
