package com.sentiance.sdk.reset;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.InitState;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class ResetResult {
    private final InitState mInitState;

    public InitState getInitState() {
        return this.mInitState;
    }

    public ResetResult(InitState initState) {
        this.mInitState = initState;
    }
}
