package io.sentry.exception;

import io.sentry.protocol.ParcelableVolumeInfo;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionMechanismException extends RuntimeException {
    public final ParcelableVolumeInfo IconCompatParcelizer;
    public final Throwable RemoteActionCompatParcelizer;
    public final boolean read;
    public final Thread serializer;

    public ExceptionMechanismException(ParcelableVolumeInfo parcelableVolumeInfo, Throwable th, Thread thread, boolean z) {
        this.IconCompatParcelizer = parcelableVolumeInfo;
        setNativeShader.read(th, "Throwable is required.");
        this.RemoteActionCompatParcelizer = th;
        setNativeShader.read(thread, "Thread is required.");
        this.serializer = thread;
        this.read = z;
    }
}
