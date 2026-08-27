package com.google.zxing;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReaderException extends Exception {
    public static final boolean serializer;
    public static final StackTraceElement[] write;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return null;
    }

    static {
        serializer = System.getProperty("surefire.test.class.path") != null;
        write = new StackTraceElement[0];
    }
}
