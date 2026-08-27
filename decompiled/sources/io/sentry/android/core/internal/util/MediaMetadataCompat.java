package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaMetadataCompat implements io.sentry.util.thread.IconCompatParcelizer {
    public static volatile long IconCompatParcelizer;
    public static final MediaMetadataCompat read;

    @Override // io.sentry.util.thread.IconCompatParcelizer
    public final long read() {
        return Process.myTid();
    }

    static {
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat();
        new Handler(Looper.getMainLooper()).post(new xr$$ExternalSyntheticLambda1(4));
        read = mediaMetadataCompat;
        IconCompatParcelizer = Process.myTid();
    }

    @Override // io.sentry.util.thread.IconCompatParcelizer
    public final boolean IconCompatParcelizer() {
        return serializer(Looper.getMainLooper().getThread()) == serializer(Thread.currentThread());
    }

    public static long serializer(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    @Override // io.sentry.util.thread.IconCompatParcelizer
    public final String serializer() {
        return IconCompatParcelizer() ? "main" : Thread.currentThread().getName();
    }
}
