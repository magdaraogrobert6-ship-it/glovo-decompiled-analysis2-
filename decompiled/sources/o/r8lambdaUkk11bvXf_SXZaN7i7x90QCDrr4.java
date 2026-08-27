package o;

import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaUkk11bvXf_SXZaN7i7x90QCDrr4 {
    private float IconCompatParcelizer;
    private float MediaBrowserCompatMediaItem;
    private CrashSeverityInternal MediaDescriptionCompat = CrashSeverityInternal.INVALID;
    private float MediaMetadataCompat;
    private float MediaSessionCompatQueueItem;
    private float RatingCompat;
    private float RemoteActionCompatParcelizer;
    private float read;
    private float serializer;
    private float write;

    public final void IconCompatParcelizer(float f) {
        this.serializer = f;
    }

    public final void MediaBrowserCompatMediaItem(float f) {
        this.read = f;
    }

    public final void MediaMetadataCompat(float f) {
        this.MediaBrowserCompatMediaItem = f;
    }

    public final void MediaSessionCompatQueueItem(float f) {
        this.IconCompatParcelizer = f;
    }

    public final void RatingCompat(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.RatingCompat = f;
    }

    public final void read(float f) {
        this.MediaMetadataCompat = f;
    }

    public final void serializer(float f) {
        this.write = f;
    }

    public final void write(float f) {
        this.MediaSessionCompatQueueItem = f;
    }

    public final void RemoteActionCompatParcelizer(CrashSeverityInternal crashSeverityInternal) {
        this.MediaDescriptionCompat = crashSeverityInternal;
    }
}
