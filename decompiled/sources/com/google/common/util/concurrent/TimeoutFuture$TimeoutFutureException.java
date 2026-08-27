package com.google.common.util.concurrent;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class TimeoutFuture$TimeoutFutureException extends TimeoutException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            setStackTrace(new StackTraceElement[0]);
        }
        return this;
    }
}
