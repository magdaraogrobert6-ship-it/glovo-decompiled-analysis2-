package o;

import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class minIntrinsicWidth_delegatelambda0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public Long IconCompatParcelizer;
    public Long MediaDescriptionCompat;
    public Long MediaMetadataCompat;
    public final processingInstruction MediaSessionCompatQueueItem;
    public Long RatingCompat;
    public Long RemoteActionCompatParcelizer;
    public final Object read;
    public Long serializer;
    public Long write;

    public final void IconCompatParcelizer() {
        synchronized (this.read) {
            this.MediaMetadataCompat = Long.valueOf(this.MediaSessionCompatQueueItem.write.millis());
        }
    }

    public final toLayoutLineBreakWordStylewPN0Rpw RemoteActionCompatParcelizer(boolean z) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long j;
        long jLongValue5;
        long jLongValue6;
        synchronized (this.read) {
            try {
                try {
                    Long l = this.MediaDescriptionCompat;
                    try {
                        if (l == null) {
                            Timber.RemoteActionCompatParcelizer.write(new Exception() { // from class: com.roadrunner.customerchat.selfservice.logger.ChatLoadingPerformanceTracker$UserTapDoesNotExistError
                            });
                            serializer();
                            return null;
                        }
                        long jLongValue7 = l.longValue();
                        long jMillis = this.MediaSessionCompatQueueItem.write.millis();
                        Long l2 = this.MediaMetadataCompat;
                        if (l2 != null) {
                            jLongValue = l2.longValue();
                        } else {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Contents were already rendered before webViewUrlLoadStart", new Object[0]);
                            jLongValue = jLongValue7;
                        }
                        Long l3 = this.RatingCompat;
                        if (l3 != null) {
                            jLongValue2 = l3.longValue();
                        } else {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Contents were already rendered before webViewUrlLoadEnd", new Object[0]);
                            jLongValue2 = jLongValue7;
                        }
                        Long l4 = this.RemoteActionCompatParcelizer;
                        if (l4 != null) {
                            jLongValue3 = l4.longValue();
                        } else {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Content were already rendered before fetchUrlStart", new Object[0]);
                            jLongValue3 = 0;
                        }
                        Long l5 = this.serializer;
                        if (l5 != null) {
                            jLongValue4 = l5.longValue();
                        } else {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Contents were already rendered before fetchUrlEnd", new Object[0]);
                            jLongValue4 = 0;
                        }
                        Long l6 = this.IconCompatParcelizer;
                        if (l6 != null) {
                            long j2 = jLongValue2;
                            jLongValue5 = l6.longValue();
                            j = j2;
                        } else {
                            j = jLongValue2;
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Contents were already rendered before bridgeHandshakeStart", new Object[0]);
                            jLongValue5 = 0;
                        }
                        Long l7 = this.write;
                        if (l7 != null) {
                            jLongValue6 = l7.longValue();
                        } else {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Contents were already rendered before bridgeHandshakeEnd", new Object[0]);
                            jLongValue6 = 0;
                        }
                        int i = (int) (jMillis - jLongValue7);
                        long j3 = jLongValue5;
                        int iMax = (int) Math.max(0L, jLongValue - jLongValue7);
                        int iMax2 = (int) Math.max(0L, jMillis - Math.max(jLongValue, jLongValue7));
                        toLayoutLineBreakWordStylewPN0Rpw tolayoutlinebreakwordstylewpn0rpw = new toLayoutLineBreakWordStylewPN0Rpw(new AndroidTextStyle_androidKt(i, z, new toLayoutBreakStrategyxImikfE(iMax, iMax == 0 ? 0 : (int) Math.max(0L, jLongValue4 - Math.max(jLongValue3, jLongValue7)), iMax2 == 0 ? 0 : (int) Math.max(0L, jLongValue6 - Math.max(j3, jLongValue7)), iMax2), new toLayoutTextGranularityduNsdkg(jLongValue7, jLongValue, j, jMillis)));
                        serializer();
                        return tolayoutlinebreakwordstylewpn0rpw;
                    } catch (Throwable th) {
                        th = th;
                        serializer();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.read) {
            this.RatingCompat = Long.valueOf(this.MediaSessionCompatQueueItem.write.millis());
        }
    }

    public final void read() {
        synchronized (this.read) {
            this.write = Long.valueOf(this.MediaSessionCompatQueueItem.write.millis());
        }
    }

    public final void write() {
        synchronized (this.read) {
            this.IconCompatParcelizer = Long.valueOf(this.MediaSessionCompatQueueItem.write.millis());
        }
    }

    public minIntrinsicWidth_delegatelambda0(processingInstruction processinginstruction) {
        processinginstruction.getClass();
        this.MediaSessionCompatQueueItem = processinginstruction;
        this.read = new Object();
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 107;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.MediaDescriptionCompat = null;
            this.MediaMetadataCompat = null;
            this.RatingCompat = null;
            this.RemoteActionCompatParcelizer = null;
            this.serializer = null;
            this.IconCompatParcelizer = null;
            this.write = null;
            return;
        }
        this.MediaDescriptionCompat = null;
        this.MediaMetadataCompat = null;
        this.RatingCompat = null;
        this.RemoteActionCompatParcelizer = null;
        this.serializer = null;
        this.IconCompatParcelizer = null;
        this.write = null;
        int i3 = 67 / 0;
    }
}
