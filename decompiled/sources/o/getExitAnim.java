package o;

import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getExitAnim {
    private static int MediaMetadataCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public Long IconCompatParcelizer;
    public final AndroidUiDispatcherCompanioncurrentThread1 MediaBrowserCompatMediaItem;
    public Long MediaDescriptionCompat;
    public Long MediaSessionCompatQueueItem;
    public Long RatingCompat;
    public Long RemoteActionCompatParcelizer;
    public Long read;
    public Long serializer;
    public final Object write;

    public final RxDataStore RemoteActionCompatParcelizer() {
        synchronized (this.write) {
            try {
                Long l = this.MediaDescriptionCompat;
                if (l == null) {
                    Timber.RemoteActionCompatParcelizer.write(new Exception() { // from class: com.roadrunner.helpcenter.performance.HelpCenterLoadingPerformanceTracker$UserTapDoesNotExistError
                    });
                    IconCompatParcelizer();
                    return null;
                }
                long jLongValue = l.longValue();
                this.MediaBrowserCompatMediaItem.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l2 = this.MediaSessionCompatQueueItem;
                long jLongValue2 = l2 != null ? l2.longValue() : jLongValue;
                Long l3 = this.RatingCompat;
                long jLongValue3 = l3 != null ? l3.longValue() : jLongValue;
                Long l4 = this.RemoteActionCompatParcelizer;
                long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                Long l5 = this.serializer;
                long jLongValue5 = l5 != null ? l5.longValue() : 0L;
                Long l6 = this.IconCompatParcelizer;
                long jLongValue6 = l6 != null ? l6.longValue() : 0L;
                Long l7 = this.read;
                long jLongValue7 = l7 != null ? l7.longValue() : 0L;
                int iMax = (int) Math.max(0L, jCurrentTimeMillis - jLongValue);
                int iMax2 = (int) Math.max(0L, jLongValue2 - jLongValue);
                int iMax3 = (int) Math.max(0L, jCurrentTimeMillis - Math.max(jLongValue2, jLongValue));
                RxDataStore rxDataStore = new RxDataStore(new setDrawerViewOffset(iMax, new isPackable(iMax2, (iMax2 == 0 || this.RemoteActionCompatParcelizer == null || this.serializer == null) ? 0 : (int) Math.max(0L, jLongValue5 - Math.max(jLongValue4, jLongValue)), (iMax3 == 0 || this.IconCompatParcelizer == null || this.read == null) ? 0 : (int) Math.max(0L, jLongValue7 - Math.max(jLongValue6, jLongValue)), iMax3), new setDrawerListener(jLongValue, jLongValue2, jLongValue3, jCurrentTimeMillis)));
                IconCompatParcelizer();
                return rxDataStore;
            } catch (Throwable th) {
                IconCompatParcelizer();
                throw th;
            }
        }
    }

    public getExitAnim(AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1) {
        androidUiDispatcherCompanioncurrentThread1.getClass();
        this.MediaBrowserCompatMediaItem = androidUiDispatcherCompanioncurrentThread1;
        this.write = new Object();
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        this.MediaDescriptionCompat = null;
        this.MediaSessionCompatQueueItem = null;
        this.RatingCompat = null;
        this.RemoteActionCompatParcelizer = null;
        this.serializer = null;
        this.IconCompatParcelizer = null;
        this.read = null;
        int i5 = i3 + 91;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
