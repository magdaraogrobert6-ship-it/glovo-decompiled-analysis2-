package com.data.error;

import com.roadrunner.common.data.api.UniqueHttpException;

/* JADX INFO: loaded from: classes2.dex */
public final class TooManyRequestsException extends Exception {
    public TooManyRequestsException(UniqueHttpException uniqueHttpException) {
        super(null, uniqueHttpException);
    }

    public TooManyRequestsException(String str, Throwable th) {
        super(str, th);
    }
}
