package o;

import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaFLEgXVYp2V5qdfLAhO3cyeghfA {
    private float IconCompatParcelizer;
    private float MediaBrowserCompatMediaItem;
    private float MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private CrashSeverityInternal MediaSessionCompatQueueItem = CrashSeverityInternal.INVALID;
    private float RatingCompat;
    private float RemoteActionCompatParcelizer;
    private float read;
    private float serializer;
    private float write;

    public final void IconCompatParcelizer(float f) {
        this.read = f;
    }

    public final void MediaBrowserCompatMediaItem(float f) {
        this.serializer = f;
    }

    public final void MediaDescriptionCompat(float f) {
        this.write = f;
    }

    public final void MediaMetadataCompat(float f) {
        this.MediaMetadataCompat = f;
    }

    public final void RatingCompat(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.RatingCompat = f;
    }

    public final void read(float f) {
        this.MediaBrowserCompatMediaItem = f;
    }

    public final void serializer(float f) {
        this.MediaDescriptionCompat = f;
    }

    public final void write(float f) {
        this.IconCompatParcelizer = f;
    }

    public final void write(CrashSeverityInternal crashSeverityInternal) {
        this.MediaSessionCompatQueueItem = crashSeverityInternal;
    }
}
