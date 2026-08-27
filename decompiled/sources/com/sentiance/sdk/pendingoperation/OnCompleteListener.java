package com.sentiance.sdk.pendingoperation;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface OnCompleteListener<Result, Error> {
    void onComplete(PendingOperation<Result, Error> pendingOperation);
}
