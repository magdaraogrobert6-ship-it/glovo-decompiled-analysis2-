package io.sentry.android.replay.util;

import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaMetadataCompat {
    public static String RemoteActionCompatParcelizer(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        String str;
        mediaBrowserCompatMediaItem.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i = MediaSessionCompatQueueItem.write[mediaBrowserCompatMediaItem.ordinal()];
        if (i == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            str = Build.SOC_MANUFACTURER;
        }
        str.getClass();
        return str;
    }
}
