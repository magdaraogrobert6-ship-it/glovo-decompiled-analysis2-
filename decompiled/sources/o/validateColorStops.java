package o;

import android.os.Bundle;
import bo.app.a5$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class validateColorStops {
    public final cubicTo IconCompatParcelizer;
    public toColorLong8_81llA MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final Bundle MediaMetadataCompat;
    public final Bundle MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final getWhite0d7_KjU PlaybackStateCompat;
    public final getInternalPath PlaybackStateCompatCustomAction;
    public final accessregisterComponentCallback RatingCompat;
    public final ActualImageBitmapx__hDU RemoteActionCompatParcelizer;
    public final String read;
    public final opN5in7k0 serializer;
    public toColorLong8_81llA write;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(displayInAppMessagelambda1.serializer(cubicTo.class).IconCompatParcelizer());
        sb.append("(" + this.read + ')');
        sb.append(" destination=");
        sb.append(this.serializer);
        return sb.toString();
    }

    public validateColorStops(cubicTo cubicto) {
        this.IconCompatParcelizer = cubicto;
        this.serializer = cubicto.IconCompatParcelizer;
        this.MediaMetadataCompat = cubicto.read;
        this.write = cubicto.RemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = cubicto.MediaMetadataCompat;
        this.read = cubicto.serializer;
        this.MediaSessionCompatQueueItem = cubicto.MediaDescriptionCompat;
        this.PlaybackStateCompat = new getWhite0d7_KjU(new getRed0d7_KjU(cubicto, new a5$$ExternalSyntheticLambda0(12, cubicto)));
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new RemoteActionCompatParcelizer(28));
        this.RatingCompat = new accessregisterComponentCallback(cubicto, true);
        this.MediaBrowserCompatMediaItem = toColorLong8_81llA.INITIALIZED;
        this.RemoteActionCompatParcelizer = (ActualImageBitmapx__hDU) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new RemoteActionCompatParcelizer(29));
    }

    public final void read() {
        if (!this.MediaSessionCompatResultReceiverWrapper) {
            getWhite0d7_KjU getwhite0d7_kju = this.PlaybackStateCompat;
            getwhite0d7_kju.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            this.MediaSessionCompatResultReceiverWrapper = true;
            if (this.PlaybackStateCompatCustomAction != null) {
                prepareToDraw.serializer((getTransparent0d7_KjU) this.IconCompatParcelizer);
            }
            getwhite0d7_kju.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
        int iOrdinal = this.write.ordinal();
        int iOrdinal2 = this.MediaBrowserCompatMediaItem.ordinal();
        accessregisterComponentCallback accessregistercomponentcallback = this.RatingCompat;
        if (iOrdinal < iOrdinal2) {
            accessregistercomponentcallback.RemoteActionCompatParcelizer(this.write);
        } else {
            accessregistercomponentcallback.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = this.MediaMetadataCompat;
        if (bundle == null) {
            return null;
        }
        Object[] objArr = {(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        Bundle bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
        bundle2.putAll(bundle);
        return bundle2;
    }
}
