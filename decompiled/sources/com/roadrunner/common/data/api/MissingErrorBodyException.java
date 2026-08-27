package com.roadrunner.common.data.api;

/* JADX INFO: loaded from: classes3.dex */
public final class MissingErrorBodyException extends Exception {
    public MissingErrorBodyException(UniqueHttpException uniqueHttpException) {
        super(null, uniqueHttpException);
    }

    public MissingErrorBodyException(String str, Throwable th) {
        super(str, th);
    }
}
