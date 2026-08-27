package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetMinNormalcp extends Drawable.ConstantState {
    public boolean IconCompatParcelizer;
    public PorterDuff.Mode MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public ColorStateList MediaMetadataCompat;
    public android.graphics.Paint MediaSessionCompatQueueItem;
    public PorterDuff.Mode ParcelableVolumeInfo;
    public accessgetMaxValuecp PlaybackStateCompatCustomAction;
    public ColorStateList RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public int read;
    public boolean serializer;
    public Bitmap write;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.MediaDescriptionCompat;
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaMetadataCompat = this.RatingCompat;
        this.MediaBrowserCompatMediaItem = this.ParcelableVolumeInfo;
        this.read = this.PlaybackStateCompatCustomAction.getRootAlpha();
        this.serializer = this.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new getNonefv9h1I(this);
    }

    public final boolean read(int[] iArr) {
        boolean zSerializer = this.PlaybackStateCompatCustomAction.PlaybackStateCompatCustomAction.serializer(iArr);
        this.RemoteActionCompatParcelizer |= zSerializer;
        return zSerializer;
    }

    public final void serializer(android.graphics.Canvas canvas, android.graphics.ColorFilter colorFilter, android.graphics.Rect rect) {
        android.graphics.Paint paint;
        if (this.PlaybackStateCompatCustomAction.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (this.MediaSessionCompatQueueItem == null) {
                android.graphics.Paint paint2 = new android.graphics.Paint();
                this.MediaSessionCompatQueueItem = paint2;
                paint2.setFilterBitmap(true);
            }
            this.MediaSessionCompatQueueItem.setAlpha(this.PlaybackStateCompatCustomAction.getRootAlpha());
            this.MediaSessionCompatQueueItem.setColorFilter(colorFilter);
            paint = this.MediaSessionCompatQueueItem;
        }
        canvas.drawBitmap(this.write, (android.graphics.Rect) null, rect, paint);
    }

    public final boolean serializer() {
        accessgetMaxValuecp accessgetmaxvaluecp = this.PlaybackStateCompatCustomAction;
        if (accessgetmaxvaluecp.RatingCompat == null) {
            accessgetmaxvaluecp.RatingCompat = Boolean.valueOf(accessgetmaxvaluecp.PlaybackStateCompatCustomAction.read());
        }
        return accessgetmaxvaluecp.RatingCompat.booleanValue();
    }

    public final void read(int i, int i2) {
        this.write.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(this.write);
        accessgetMaxValuecp accessgetmaxvaluecp = this.PlaybackStateCompatCustomAction;
        accessgetmaxvaluecp.write(accessgetmaxvaluecp.PlaybackStateCompatCustomAction, accessgetMaxValuecp.RemoteActionCompatParcelizer, canvas, i, i2);
    }

    public accessgetMinNormalcp(accessgetMinNormalcp accessgetminnormalcp) {
        this.RatingCompat = null;
        this.ParcelableVolumeInfo = getNonefv9h1I.IconCompatParcelizer;
        if (accessgetminnormalcp != null) {
            this.MediaDescriptionCompat = accessgetminnormalcp.MediaDescriptionCompat;
            accessgetMaxValuecp accessgetmaxvaluecp = new accessgetMaxValuecp(accessgetminnormalcp.PlaybackStateCompatCustomAction);
            this.PlaybackStateCompatCustomAction = accessgetmaxvaluecp;
            if (accessgetminnormalcp.PlaybackStateCompatCustomAction.serializer != null) {
                accessgetmaxvaluecp.serializer = new android.graphics.Paint(accessgetminnormalcp.PlaybackStateCompatCustomAction.serializer);
            }
            if (accessgetminnormalcp.PlaybackStateCompatCustomAction.MediaSessionCompatToken != null) {
                this.PlaybackStateCompatCustomAction.MediaSessionCompatToken = new android.graphics.Paint(accessgetminnormalcp.PlaybackStateCompatCustomAction.MediaSessionCompatToken);
            }
            this.RatingCompat = accessgetminnormalcp.RatingCompat;
            this.ParcelableVolumeInfo = accessgetminnormalcp.ParcelableVolumeInfo;
            this.IconCompatParcelizer = accessgetminnormalcp.IconCompatParcelizer;
        }
    }

    public final void write(int i, int i2) {
        Bitmap bitmap = this.write;
        if (bitmap != null && i == bitmap.getWidth() && i2 == this.write.getHeight()) {
            return;
        }
        this.write = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.RemoteActionCompatParcelizer = true;
    }

    public final boolean write() {
        return !this.RemoteActionCompatParcelizer && this.MediaMetadataCompat == this.RatingCompat && this.MediaBrowserCompatMediaItem == this.ParcelableVolumeInfo && this.serializer == this.IconCompatParcelizer && this.read == this.PlaybackStateCompatCustomAction.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new getNonefv9h1I(this);
    }

    public accessgetMinNormalcp() {
        this.RatingCompat = null;
        this.ParcelableVolumeInfo = getNonefv9h1I.IconCompatParcelizer;
        this.PlaybackStateCompatCustomAction = new accessgetMaxValuecp();
    }
}
