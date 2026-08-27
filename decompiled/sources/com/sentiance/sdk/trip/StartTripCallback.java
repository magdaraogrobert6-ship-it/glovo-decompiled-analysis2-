package com.sentiance.sdk.trip;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.SdkStatus;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public interface StartTripCallback {
    void onFailure(SdkStatus sdkStatus);

    void onSuccess();
}
