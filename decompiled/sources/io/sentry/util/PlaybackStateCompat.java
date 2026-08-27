package io.sentry.util;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompat {
    public final Object IconCompatParcelizer;
    public final WeakReference read;

    public PlaybackStateCompat(WeakReference weakReference, String str) {
        this.read = weakReference;
        this.IconCompatParcelizer = str;
    }
}
