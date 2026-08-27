package o;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class AdaptationCompanionCiecat021 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int ComponentActivity;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ boolean MediaBrowserCompatMediaItem;
    public final /* synthetic */ boolean MediaDescriptionCompat;
    public final /* synthetic */ boolean MediaMetadataCompat;
    public final /* synthetic */ getMiterLxFBmk8 MediaSessionCompatQueueItem;
    public final /* synthetic */ boolean MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaSessionCompatToken;
    public final /* synthetic */ Map ParcelableVolumeInfo;
    public final /* synthetic */ androidx.compose.ui.layout.ContentScale PlaybackStateCompat;
    public final /* synthetic */ boolean PlaybackStateCompatCustomAction;
    public final /* synthetic */ StrokeJoinCompanion RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean ResultReceiver;
    public final /* synthetic */ boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final /* synthetic */ getComposeTileModeDecal3opZhB0 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.ui.Alignment serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdaptationCompanionCiecat021(StrokeJoinCompanion strokeJoinCompanion, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, getComposeTileModeDecal3opZhB0 getcomposetilemodedecal3opzhb0, boolean z5, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, boolean z6, boolean z7, Map map, getMiterLxFBmk8 getmiterlxfbmk8, boolean z8, int i, int i2, int i3, int i4) {
        super(2);
        this.ComponentActivity = i4;
        this.RatingCompat = strokeJoinCompanion;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatToken = modifier;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z;
        this.IconCompatParcelizer = z2;
        this.MediaMetadataCompat = z3;
        this.PlaybackStateCompatCustomAction = z4;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getcomposetilemodedecal3opzhb0;
        this.MediaSessionCompatResultReceiverWrapper = z5;
        this.serializer = alignment;
        this.PlaybackStateCompat = contentScale;
        this.MediaDescriptionCompat = z6;
        this.MediaBrowserCompatMediaItem = z7;
        this.ParcelableVolumeInfo = map;
        this.MediaSessionCompatQueueItem = getmiterlxfbmk8;
        this.ResultReceiver = z8;
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.read = i3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.ComponentActivity;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.write;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            ((Number) obj2).intValue();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
            int i4 = this.read;
            ColorModel.RemoteActionCompatParcelizer(this.RatingCompat, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.MediaSessionCompatToken, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.IconCompatParcelizer, this.MediaMetadataCompat, this.PlaybackStateCompatCustomAction, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.MediaSessionCompatResultReceiverWrapper, this.serializer, this.PlaybackStateCompat, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.ParcelableVolumeInfo, this.MediaSessionCompatQueueItem, this.ResultReceiver, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i4);
            return createfromparcel;
        }
        ((Number) obj2).intValue();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
        int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
        int i5 = this.read;
        ColorModel.RemoteActionCompatParcelizer(this.RatingCompat, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.MediaSessionCompatToken, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.IconCompatParcelizer, this.MediaMetadataCompat, this.PlaybackStateCompatCustomAction, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.MediaSessionCompatResultReceiverWrapper, this.serializer, this.PlaybackStateCompat, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.ParcelableVolumeInfo, this.MediaSessionCompatQueueItem, this.ResultReceiver, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, i5);
        return createfromparcel;
    }
}
