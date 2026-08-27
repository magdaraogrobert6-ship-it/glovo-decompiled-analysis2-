package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class accessgetReusedSlotIdp extends Drawable.ConstantState {
    public float IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public android.graphics.Rect MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public ColorStateList MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public float ParcelableVolumeInfo;
    public SubcomposeLayoutPausableCompositionException PlaybackStateCompat;
    public ColorStateList PlaybackStateCompatCustomAction;
    public final android.graphics.Paint.Style RatingCompat;
    public ColorStateList RemoteActionCompatParcelizer;
    public PorterDuff.Mode r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int read;
    public float serializer;
    public accessgetPausePausedcp write;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy(this);
        subcomposeSlotReusePolicy.onBackPressed = true;
        return subcomposeSlotReusePolicy;
    }

    public accessgetReusedSlotIdp(accessgetReusedSlotIdp accessgetreusedslotidp) {
        this.RemoteActionCompatParcelizer = null;
        this.PlaybackStateCompatCustomAction = null;
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = PorterDuff.Mode.SRC_IN;
        this.MediaDescriptionCompat = null;
        this.MediaMetadataCompat = 1.0f;
        this.IconCompatParcelizer = 1.0f;
        this.read = 255;
        this.MediaSessionCompatQueueItem = 0.0f;
        this.serializer = 0.0f;
        this.MediaSessionCompatToken = 0;
        this.MediaBrowserCompatMediaItem = 0;
        this.RatingCompat = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.PlaybackStateCompat = accessgetreusedslotidp.PlaybackStateCompat;
        this.write = accessgetreusedslotidp.write;
        this.ParcelableVolumeInfo = accessgetreusedslotidp.ParcelableVolumeInfo;
        this.RemoteActionCompatParcelizer = accessgetreusedslotidp.RemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = accessgetreusedslotidp.PlaybackStateCompatCustomAction;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = accessgetreusedslotidp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        this.MediaSessionCompatResultReceiverWrapper = accessgetreusedslotidp.MediaSessionCompatResultReceiverWrapper;
        this.read = accessgetreusedslotidp.read;
        this.MediaMetadataCompat = accessgetreusedslotidp.MediaMetadataCompat;
        this.MediaBrowserCompatMediaItem = accessgetreusedslotidp.MediaBrowserCompatMediaItem;
        this.IconCompatParcelizer = accessgetreusedslotidp.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = accessgetreusedslotidp.MediaSessionCompatQueueItem;
        this.serializer = accessgetreusedslotidp.serializer;
        this.MediaSessionCompatToken = accessgetreusedslotidp.MediaSessionCompatToken;
        this.RatingCompat = accessgetreusedslotidp.RatingCompat;
        android.graphics.Rect rect = accessgetreusedslotidp.MediaDescriptionCompat;
        if (rect != null) {
            this.MediaDescriptionCompat = new android.graphics.Rect(rect);
        }
    }

    public accessgetReusedSlotIdp(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        this.RemoteActionCompatParcelizer = null;
        this.PlaybackStateCompatCustomAction = null;
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = PorterDuff.Mode.SRC_IN;
        this.MediaDescriptionCompat = null;
        this.MediaMetadataCompat = 1.0f;
        this.IconCompatParcelizer = 1.0f;
        this.read = 255;
        this.MediaSessionCompatQueueItem = 0.0f;
        this.serializer = 0.0f;
        this.MediaSessionCompatToken = 0;
        this.MediaBrowserCompatMediaItem = 0;
        this.RatingCompat = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.PlaybackStateCompat = subcomposeLayoutPausableCompositionException;
        this.write = null;
    }
}
