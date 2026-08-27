package o;

import android.annotation.SuppressLint;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class publishExceptionlambda0 {
    private Long IconCompatParcelizer;
    private int MediaBrowserCompatMediaItem;
    private int MediaMetadataCompat;
    private boolean RatingCompat;
    private long RemoteActionCompatParcelizer;
    private boolean read;
    private String serializer;
    private Long write;

    public final void IconCompatParcelizer() {
        this.RatingCompat = false;
    }

    public publishExceptionlambda0(accesssetEventPublishercp accessseteventpublishercp) {
        this.serializer = accessseteventpublishercp.IconCompatParcelizer;
        this.write = Long.valueOf(accessseteventpublishercp.serializer);
        this.RemoteActionCompatParcelizer = accessseteventpublishercp.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = accessseteventpublishercp.MediaDescriptionCompat;
        this.MediaMetadataCompat = accessseteventpublishercp.RatingCompat;
        this.RatingCompat = accessseteventpublishercp.MediaMetadataCompat;
        this.IconCompatParcelizer = Long.valueOf(accessseteventpublishercp.RemoteActionCompatParcelizer);
        this.read = accessseteventpublishercp.write;
    }

    @SuppressLint
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        if (this.serializer == null) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Task info has no tag set");
            return null;
        }
        boolean z = this.read;
        if (z && this.write == null) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Recurring task info has no interval set");
            return null;
        }
        if (z || this.IconCompatParcelizer != null) {
            return new accesssetEventPublishercp(this);
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Non-recurring task info has no delay set");
        return null;
    }

    public final void read(long j) {
        this.write = Long.valueOf(j);
    }

    public final void write(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.MediaMetadataCompat = i;
    }

    public final void write(String str) {
        this.serializer = str;
    }

    public final void IconCompatParcelizer(long j) {
        this.IconCompatParcelizer = Long.valueOf(j);
    }

    public final void write(boolean z) {
        this.read = z;
    }

    public final void write(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    public publishExceptionlambda0() {
        this.read = true;
        this.RemoteActionCompatParcelizer = 30000L;
    }
}
