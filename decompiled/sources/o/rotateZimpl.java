package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class rotateZimpl {
    public final List ComponentActivity;
    public final long IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final List MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final accessgetAmbientShadowColor0d7_KjUjd ParcelableVolumeInfo;
    public final int PlaybackStateCompat;
    public final setTranslationX PlaybackStateCompatCustomAction;
    public final long RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int ResultReceiver;
    public final GraphicsLayerScope read;
    public final long serializer;
    public final toolingGraphicsLayer write;

    public final GraphicsLayerScopeDefaultImpls IconCompatParcelizer() {
        long j;
        long j2;
        List list = this.MediaSessionCompatResultReceiverWrapper;
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = !list.isEmpty() ? (accessgetAmbientShadowColor0d7_KjUjd) list.get(0) : accessgetAmbientShadowColor0d7_KjUjd.write;
        UUID uuidFromString = UUID.fromString(this.MediaSessionCompatQueueItem);
        uuidFromString.getClass();
        HashSet hashSet = new HashSet(this.ComponentActivity);
        long j3 = this.RatingCompat;
        setTranslationY settranslationy = j3 != 0 ? new setTranslationY(j3, this.serializer) : null;
        setTranslationX settranslationx = setTranslationX.ENQUEUED;
        int i = this.PlaybackStateCompat;
        long j4 = this.MediaDescriptionCompat;
        setTranslationX settranslationx2 = this.PlaybackStateCompatCustomAction;
        if (settranslationx2 == settranslationx) {
            String str = setFrom58bKbWc.RemoteActionCompatParcelizer;
            boolean z = settranslationx2 == settranslationx && i > 0;
            j = j4;
            j2 = pauseWebviewIfNecessarylambda10.read(z, i, this.read, this.IconCompatParcelizer, this.MediaMetadataCompat, this.MediaSessionCompatToken, j3 != 0, j, this.serializer, j3, this.MediaBrowserCompatMediaItem);
        } else {
            j = j4;
            j2 = Long.MAX_VALUE;
        }
        return new GraphicsLayerScopeDefaultImpls(uuidFromString, this.PlaybackStateCompatCustomAction, hashSet, this.ParcelableVolumeInfo, accessgetambientshadowcolor0d7_kjujd, i, this.RemoteActionCompatParcelizer, this.write, j, settranslationy, j2, this.ResultReceiver);
    }

    public final int hashCode() {
        int iHashCode = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode2 = this.PlaybackStateCompatCustomAction.hashCode();
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.ParcelableVolumeInfo.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31, 31, this.MediaDescriptionCompat), 31, this.RatingCompat), 31, this.serializer);
        int iM2 = af$$ExternalSyntheticOutline0.m(this.PlaybackStateCompat, (this.write.hashCode() + iM) * 31, 31);
        return this.MediaSessionCompatResultReceiverWrapper.hashCode() + c8$$ExternalSyntheticOutline0.m(this.ComponentActivity, af$$ExternalSyntheticOutline0.m(this.ResultReceiver, d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatToken, d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.read.hashCode() + iM2) * 31, 31, this.IconCompatParcelizer), 31, this.MediaMetadataCompat), 31), 31), 31, this.MediaBrowserCompatMediaItem), 31), 31);
    }

    public rotateZimpl(String str, setTranslationX settranslationx, accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd, long j, long j2, long j3, toolingGraphicsLayer toolinggraphicslayer, int i, GraphicsLayerScope graphicsLayerScope, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        settranslationx.getClass();
        accessgetambientshadowcolor0d7_kjujd.getClass();
        graphicsLayerScope.getClass();
        this.MediaSessionCompatQueueItem = str;
        this.PlaybackStateCompatCustomAction = settranslationx;
        this.ParcelableVolumeInfo = accessgetambientshadowcolor0d7_kjujd;
        this.MediaDescriptionCompat = j;
        this.RatingCompat = j2;
        this.serializer = j3;
        this.write = toolinggraphicslayer;
        this.PlaybackStateCompat = i;
        this.read = graphicsLayerScope;
        this.IconCompatParcelizer = j4;
        this.MediaMetadataCompat = j5;
        this.MediaSessionCompatToken = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.MediaBrowserCompatMediaItem = j6;
        this.ResultReceiver = i4;
        this.ComponentActivity = list;
        this.MediaSessionCompatResultReceiverWrapper = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rotateZimpl)) {
            return false;
        }
        rotateZimpl rotatezimpl = (rotateZimpl) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, rotatezimpl.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() || this.PlaybackStateCompatCustomAction != rotatezimpl.PlaybackStateCompatCustomAction) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ParcelableVolumeInfo, rotatezimpl.ParcelableVolumeInfo}, getCieXyz.write())).booleanValue() && this.MediaDescriptionCompat == rotatezimpl.MediaDescriptionCompat && this.RatingCompat == rotatezimpl.RatingCompat && this.serializer == rotatezimpl.serializer && this.write.equals(rotatezimpl.write) && this.PlaybackStateCompat == rotatezimpl.PlaybackStateCompat && this.read == rotatezimpl.read && this.IconCompatParcelizer == rotatezimpl.IconCompatParcelizer && this.MediaMetadataCompat == rotatezimpl.MediaMetadataCompat && this.MediaSessionCompatToken == rotatezimpl.MediaSessionCompatToken && this.RemoteActionCompatParcelizer == rotatezimpl.RemoteActionCompatParcelizer && this.MediaBrowserCompatMediaItem == rotatezimpl.MediaBrowserCompatMediaItem && this.ResultReceiver == rotatezimpl.ResultReceiver && this.ComponentActivity.equals(rotatezimpl.ComponentActivity) && this.MediaSessionCompatResultReceiverWrapper.equals(rotatezimpl.MediaSessionCompatResultReceiverWrapper);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", state=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", output=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", initialDelay=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", intervalDuration=");
        sb.append(this.RatingCompat);
        sb.append(", flexDuration=");
        sb.append(this.serializer);
        sb.append(", constraints=");
        sb.append(this.write);
        sb.append(", runAttemptCount=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", backoffPolicy=");
        sb.append(this.read);
        sb.append(", backoffDelayDuration=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", lastEnqueueTime=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", periodCount=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", generation=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", stopReason=");
        sb.append(this.ResultReceiver);
        sb.append(", tags=");
        sb.append(this.ComponentActivity);
        sb.append(", progress=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.MediaSessionCompatResultReceiverWrapper, ')');
    }
}
