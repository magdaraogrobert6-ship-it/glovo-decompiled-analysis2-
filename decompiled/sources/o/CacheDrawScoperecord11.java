package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDrawScoperecord11 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ toSpkPz2Gy4 RemoteActionCompatParcelizer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope = (androidx.compose.ui.graphics.GraphicsLayerScope) obj;
        toSpkPz2Gy4 tospkpz2gy4 = this.RemoteActionCompatParcelizer;
        if (!Float.isNaN(tospkpz2gy4.IconCompatParcelizer) || !Float.isNaN(tospkpz2gy4.MediaBrowserCompatMediaItem)) {
            graphicsLayerScope.mo926setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(Float.isNaN(tospkpz2gy4.IconCompatParcelizer) ? 0.5f : tospkpz2gy4.IconCompatParcelizer, Float.isNaN(tospkpz2gy4.MediaBrowserCompatMediaItem) ? 0.5f : tospkpz2gy4.MediaBrowserCompatMediaItem));
        }
        if (!Float.isNaN(tospkpz2gy4.MediaMetadataCompat)) {
            graphicsLayerScope.setRotationX(tospkpz2gy4.MediaMetadataCompat);
        }
        if (!Float.isNaN(tospkpz2gy4.RatingCompat)) {
            graphicsLayerScope.setRotationY(tospkpz2gy4.RatingCompat);
        }
        if (!Float.isNaN(tospkpz2gy4.MediaDescriptionCompat)) {
            graphicsLayerScope.setRotationZ(tospkpz2gy4.MediaDescriptionCompat);
        }
        if (!Float.isNaN(tospkpz2gy4.ParcelableVolumeInfo)) {
            graphicsLayerScope.setTranslationX(tospkpz2gy4.ParcelableVolumeInfo);
        }
        if (!Float.isNaN(tospkpz2gy4.MediaSessionCompatToken)) {
            graphicsLayerScope.setTranslationY(tospkpz2gy4.MediaSessionCompatToken);
        }
        if (!Float.isNaN(tospkpz2gy4.ResultReceiver)) {
            graphicsLayerScope.setShadowElevation(tospkpz2gy4.ResultReceiver);
        }
        if (!Float.isNaN(tospkpz2gy4.PlaybackStateCompat) || !Float.isNaN(tospkpz2gy4.MediaSessionCompatResultReceiverWrapper)) {
            graphicsLayerScope.setScaleX(Float.isNaN(tospkpz2gy4.PlaybackStateCompat) ? 1.0f : tospkpz2gy4.PlaybackStateCompat);
            graphicsLayerScope.setScaleY(Float.isNaN(tospkpz2gy4.MediaSessionCompatResultReceiverWrapper) ? 1.0f : tospkpz2gy4.MediaSessionCompatResultReceiverWrapper);
        }
        if (!Float.isNaN(tospkpz2gy4.write)) {
            graphicsLayerScope.setAlpha(tospkpz2gy4.write);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScoperecord11(toSpkPz2Gy4 tospkpz2gy4) {
        super(1);
        this.RemoteActionCompatParcelizer = tospkpz2gy4;
    }
}
