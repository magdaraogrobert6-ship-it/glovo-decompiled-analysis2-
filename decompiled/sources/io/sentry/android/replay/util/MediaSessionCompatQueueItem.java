package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class MediaSessionCompatQueueItem {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[MediaBrowserCompatMediaItem.values().length];
        try {
            iArr[MediaBrowserCompatMediaItem.SOC_MODEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MediaBrowserCompatMediaItem.SOC_MANUFACTURER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}
