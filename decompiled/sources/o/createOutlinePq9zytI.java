package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class createOutlinePq9zytI extends Drawable {
    public PorterDuffColorFilter MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public final android.graphics.Paint MediaMetadataCompat;
    public ColorStateList MediaSessionCompatQueueItem;
    public float RatingCompat;
    public final RectF RemoteActionCompatParcelizer;
    public ColorStateList read;
    public final android.graphics.Rect serializer;
    public boolean IconCompatParcelizer = false;
    public boolean write = true;
    public PorterDuff.Mode ParcelableVolumeInfo = PorterDuff.Mode.SRC_IN;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.MediaBrowserCompatMediaItem;
        android.graphics.Paint paint = this.MediaMetadataCompat;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.MediaBrowserCompatMediaItem);
            z = true;
        }
        RectF rectF = this.RemoteActionCompatParcelizer;
        float f = this.MediaDescriptionCompat;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.serializer, this.MediaDescriptionCompat);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.read;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        android.graphics.Paint paint = this.MediaMetadataCompat;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.MediaSessionCompatQueueItem;
        if (colorStateList2 == null || (mode = this.ParcelableVolumeInfo) == null) {
            return z;
        }
        this.MediaBrowserCompatMediaItem = write(colorStateList2, mode);
        return true;
    }

    public final void serializer(android.graphics.Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.RemoteActionCompatParcelizer;
        rectF.set(f, f2, f3, f4);
        android.graphics.Rect rect2 = this.serializer;
        rect2.set(rect);
        if (this.IconCompatParcelizer) {
            rect2.inset((int) Math.ceil(HoverableNodeonPointerEvent1.write(this.RatingCompat, this.MediaDescriptionCompat, this.write)), (int) Math.ceil(HoverableNodeonPointerEvent1.read(this.RatingCompat, this.MediaDescriptionCompat, this.write)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.MediaMetadataCompat.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.MediaMetadataCompat.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.MediaSessionCompatQueueItem = colorStateList;
        this.MediaBrowserCompatMediaItem = write(colorStateList, this.ParcelableVolumeInfo);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.ParcelableVolumeInfo = mode;
        this.MediaBrowserCompatMediaItem = write(this.MediaSessionCompatQueueItem, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        serializer(rect);
    }

    public createOutlinePq9zytI(ColorStateList colorStateList, float f) {
        this.MediaDescriptionCompat = f;
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.MediaMetadataCompat = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.read = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.read.getDefaultColor()));
        this.RemoteActionCompatParcelizer = new RectF();
        this.serializer = new android.graphics.Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.MediaSessionCompatQueueItem;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.read;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    public final PorterDuffColorFilter write(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
