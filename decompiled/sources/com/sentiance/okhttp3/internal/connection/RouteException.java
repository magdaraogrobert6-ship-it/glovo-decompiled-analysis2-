package com.sentiance.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08;

/* JADX INFO: loaded from: classes3.dex */
public final class RouteException extends RuntimeException {
    private IOException firstException;
    private IOException lastException;

    public final IOException read() {
        return this.lastException;
    }

    public final void IconCompatParcelizer(IOException iOException) {
        IOException iOException2 = this.firstException;
        Method method = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (method != null) {
            try {
                method.invoke(iOException2, iOException);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.lastException = iOException;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    public final IOException write() {
        return this.firstException;
    }
}
