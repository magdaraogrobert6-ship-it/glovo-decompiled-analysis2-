package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ApiExceptionSessionExpired {
    public final String IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final Integer MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final Long MediaSessionCompatResultReceiverWrapper;
    public final Long MediaSessionCompatToken;
    public final Integer ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public final Long PlaybackStateCompatCustomAction;
    public final Integer RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final long ResultReceiver;
    public final long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final RecyclableBufferedInputStream read;
    public final ArrayList serializer;
    public final long write;

    public /* synthetic */ ApiExceptionSessionExpired(RecyclableBufferedInputStream recyclableBufferedInputStream, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, int i4) {
        this(recyclableBufferedInputStream, z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? -1L : j4, (i4 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? -1 : i2, (i4 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? -1 : i3, (i4 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? null : l, (i4 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? null : l2, (i4 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? null : l3, null, null, null);
    }

    public ApiExceptionSessionExpired(RecyclableBufferedInputStream recyclableBufferedInputStream, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        recyclableBufferedInputStream.getClass();
        str.getClass();
        this.read = recyclableBufferedInputStream;
        this.PlaybackStateCompat = z;
        this.IconCompatParcelizer = str;
        this.MediaMetadataCompat = j;
        this.write = j2;
        this.ResultReceiver = j3;
        this.RemoteActionCompatParcelizer = i;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = j4;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaSessionCompatQueueItem = i3;
        this.PlaybackStateCompatCustomAction = l;
        this.MediaSessionCompatResultReceiverWrapper = l2;
        this.MediaSessionCompatToken = l3;
        this.ParcelableVolumeInfo = num;
        this.MediaDescriptionCompat = num2;
        this.RatingCompat = num3;
        this.serializer = new ArrayList();
    }
}
