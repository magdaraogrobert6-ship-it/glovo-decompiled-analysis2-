package o;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetLabcp extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Map MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.layout.ContentScale MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ StrokeJoinCompanion MediaSessionCompatQueueItem;
    public final /* synthetic */ androidx.compose.ui.Modifier PlaybackStateCompat;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Alignment RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ColorModel.read(this.MediaSessionCompatQueueItem, this.PlaybackStateCompat, this.MediaMetadataCompat, this.RatingCompat, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer | 1), ContentType_androidKt.RemoteActionCompatParcelizer(this.serializer), ContentType_androidKt.RemoteActionCompatParcelizer(this.read), this.write);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetLabcp(StrokeJoinCompanion strokeJoinCompanion, androidx.compose.ui.Modifier modifier, int i, getComposeTileModeDecal3opZhB0 getcomposetilemodedecal3opzhb0, boolean z, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, Map map, getMiterLxFBmk8 getmiterlxfbmk8, int i2, int i3, int i4, int i5) {
        super(2);
        this.MediaSessionCompatQueueItem = strokeJoinCompanion;
        this.PlaybackStateCompat = modifier;
        this.MediaMetadataCompat = i;
        this.RatingCompat = z;
        this.RemoteActionCompatParcelizer = alignment;
        this.MediaDescriptionCompat = contentScale;
        this.MediaBrowserCompatMediaItem = map;
        this.IconCompatParcelizer = i2;
        this.serializer = i3;
        this.read = i4;
        this.write = i5;
    }
}
