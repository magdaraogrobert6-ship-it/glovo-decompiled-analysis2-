package io.sentry.android.core;

import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
final class ApplicationNotResponding extends RuntimeException {
    public final Thread write;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        setNativeShader.read(thread, "Thread must be provided.");
        this.write = thread;
        setStackTrace(thread.getStackTrace());
    }
}
