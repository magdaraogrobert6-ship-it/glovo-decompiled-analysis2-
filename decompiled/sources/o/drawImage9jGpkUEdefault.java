package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final class drawImage9jGpkUEdefault extends Drawable implements android.graphics.drawable.Animatable {
    public boolean IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public android.graphics.Paint MediaSessionCompatQueueItem;
    public final drawLineNGM6Ib0default RatingCompat;
    public android.graphics.Rect RemoteActionCompatParcelizer;
    public boolean read;
    public boolean serializer;
    public boolean write;
    public boolean MediaBrowserCompatMediaItem = true;
    public final int MediaMetadataCompat = -1;

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.RatingCompat;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.serializer;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.write = true;
        this.MediaDescriptionCompat = 0;
        if (this.MediaBrowserCompatMediaItem) {
            write();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.write = false;
        this.serializer = false;
        ((com.bumptech.glide.load.resource.gif.GifFrameLoader) this.RatingCompat.write).RemoteActionCompatParcelizer(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((com.bumptech.glide.load.resource.gif.GifFrameLoader) this.RatingCompat.write).RemoteActionCompatParcelizer();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((com.bumptech.glide.load.resource.gif.GifFrameLoader) this.RatingCompat.write).MediaDescriptionCompat();
    }

    public drawImage9jGpkUEdefault(drawLineNGM6Ib0default drawlinengm6ib0default) {
        this.RatingCompat = drawlinengm6ib0default;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.read = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.IconCompatParcelizer) {
            return;
        }
        if (this.read) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            android.graphics.Rect bounds = getBounds();
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new android.graphics.Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.RemoteActionCompatParcelizer);
            this.read = false;
        }
        Bitmap bitmapWrite = ((com.bumptech.glide.load.resource.gif.GifFrameLoader) this.RatingCompat.write).write();
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new android.graphics.Rect();
        }
        android.graphics.Rect rect = this.RemoteActionCompatParcelizer;
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = new android.graphics.Paint(2);
        }
        canvas.drawBitmap(bitmapWrite, (android.graphics.Rect) null, rect, this.MediaSessionCompatQueueItem);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        UrlUtils.IconCompatParcelizer("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.IconCompatParcelizer);
        this.MediaBrowserCompatMediaItem = z;
        if (!z) {
            this.serializer = false;
            ((com.bumptech.glide.load.resource.gif.GifFrameLoader) this.RatingCompat.write).RemoteActionCompatParcelizer(this);
        } else if (this.write) {
            write();
        }
        return super.setVisible(z, z2);
    }

    public final void write() {
        UrlUtils.IconCompatParcelizer("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.IconCompatParcelizer);
        drawLineNGM6Ib0default drawlinengm6ib0default = this.RatingCompat;
        if (((com.bumptech.glide.load.resource.gif.GifFrameLoader) drawlinengm6ib0default.write).IconCompatParcelizer() == 1) {
            invalidateSelf();
        } else {
            if (this.serializer) {
                return;
            }
            this.serializer = true;
            ((com.bumptech.glide.load.resource.gif.GifFrameLoader) drawlinengm6ib0default.write).read(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = new android.graphics.Paint(2);
        }
        this.MediaSessionCompatQueueItem.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = new android.graphics.Paint(2);
        }
        this.MediaSessionCompatQueueItem.setColorFilter(colorFilter);
    }
}
