package com.sentiance.sdk.pendingoperation;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface OnFailureListener<Error> {
    void onFailure(Error error);
}
