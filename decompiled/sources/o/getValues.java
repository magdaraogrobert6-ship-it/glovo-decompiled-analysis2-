package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable$2;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getValues extends Drawable implements android.graphics.drawable.Animatable {
    public static final LinearInterpolator RemoteActionCompatParcelizer = new LinearInterpolator();
    public static final restore read = new restore(0);
    public static final int[] write = {-16777216};
    public boolean IconCompatParcelizer;
    public final ColorMatrixKt MediaBrowserCompatMediaItem;
    public final Resources MediaDescriptionCompat;
    public float MediaSessionCompatQueueItem;
    public float RatingCompat;
    public final ValueAnimator serializer;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.serializer.isRunning();
    }

    public final void serializer(float f, float f2, float f3, float f4) {
        float f5 = this.MediaDescriptionCompat.getDisplayMetrics().density;
        float f6 = f2 * f5;
        ColorMatrixKt colorMatrixKt = this.MediaBrowserCompatMediaItem;
        colorMatrixKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = f6;
        colorMatrixKt.PlaybackStateCompatCustomAction.setStrokeWidth(f6);
        colorMatrixKt.MediaSessionCompatResultReceiverWrapper = f * f5;
        colorMatrixKt.read(0);
        colorMatrixKt.MediaSessionCompatQueueItem = (int) (f3 * f5);
        colorMatrixKt.read = (int) (f4 * f5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.MediaBrowserCompatMediaItem.PlaybackStateCompatCustomAction.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.serializer;
        valueAnimator.cancel();
        ColorMatrixKt colorMatrixKt = this.MediaBrowserCompatMediaItem;
        float f = colorMatrixKt.ResultReceiver;
        colorMatrixKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = f;
        float f2 = colorMatrixKt.MediaSessionCompatToken;
        colorMatrixKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = f2;
        colorMatrixKt.ComponentActivity = colorMatrixKt.ParcelableVolumeInfo;
        if (f2 != f) {
            this.IconCompatParcelizer = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        colorMatrixKt.read(0);
        colorMatrixKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0.0f;
        colorMatrixKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0.0f;
        colorMatrixKt.ComponentActivity = 0.0f;
        colorMatrixKt.ResultReceiver = 0.0f;
        colorMatrixKt.MediaSessionCompatToken = 0.0f;
        colorMatrixKt.ParcelableVolumeInfo = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.serializer.cancel();
        this.RatingCompat = 0.0f;
        ColorMatrixKt colorMatrixKt = this.MediaBrowserCompatMediaItem;
        if (colorMatrixKt.PlaybackStateCompat) {
            colorMatrixKt.PlaybackStateCompat = false;
        }
        colorMatrixKt.read(0);
        colorMatrixKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0.0f;
        colorMatrixKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0.0f;
        colorMatrixKt.ComponentActivity = 0.0f;
        colorMatrixKt.ResultReceiver = 0.0f;
        colorMatrixKt.MediaSessionCompatToken = 0.0f;
        colorMatrixKt.ParcelableVolumeInfo = 0.0f;
        invalidateSelf();
    }

    public getValues(Context context) {
        context.getClass();
        this.MediaDescriptionCompat = context.getResources();
        ColorMatrixKt colorMatrixKt = new ColorMatrixKt();
        this.MediaBrowserCompatMediaItem = colorMatrixKt;
        colorMatrixKt.MediaBrowserCompatMediaItem = write;
        colorMatrixKt.read(0);
        colorMatrixKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 2.5f;
        colorMatrixKt.PlaybackStateCompatCustomAction.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new obtainColorMatrixp10uLo(this, 0, colorMatrixKt));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(RemoteActionCompatParcelizer);
        valueAnimatorOfFloat.addListener(new CircularProgressDrawable$2(this, colorMatrixKt));
        this.serializer = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.RatingCompat, bounds.exactCenterX(), bounds.exactCenterY());
        ColorMatrixKt colorMatrixKt = this.MediaBrowserCompatMediaItem;
        android.graphics.Paint paint = colorMatrixKt.PlaybackStateCompatCustomAction;
        RectF rectF = colorMatrixKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        float f = colorMatrixKt.MediaSessionCompatResultReceiverWrapper;
        float fMin = (colorMatrixKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((colorMatrixKt.MediaSessionCompatQueueItem * colorMatrixKt.serializer) / 2.0f, colorMatrixKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = colorMatrixKt.ResultReceiver;
        float f3 = colorMatrixKt.ParcelableVolumeInfo;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((colorMatrixKt.MediaSessionCompatToken + f3) * 360.0f) - f4;
        paint.setColor(colorMatrixKt.RatingCompat);
        paint.setAlpha(colorMatrixKt.RemoteActionCompatParcelizer);
        float f6 = colorMatrixKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, colorMatrixKt.MediaDescriptionCompat);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        android.graphics.Paint paint2 = colorMatrixKt.IconCompatParcelizer;
        if (colorMatrixKt.PlaybackStateCompat) {
            android.graphics.Path path = colorMatrixKt.write;
            if (path == null) {
                android.graphics.Path path2 = new android.graphics.Path();
                colorMatrixKt.write = path2;
                path2.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (colorMatrixKt.MediaSessionCompatQueueItem * colorMatrixKt.serializer) / 2.0f;
            colorMatrixKt.write.moveTo(0.0f, 0.0f);
            colorMatrixKt.write.lineTo(colorMatrixKt.MediaSessionCompatQueueItem * colorMatrixKt.serializer, 0.0f);
            android.graphics.Path path3 = colorMatrixKt.write;
            float f9 = colorMatrixKt.MediaSessionCompatQueueItem;
            float f10 = colorMatrixKt.serializer;
            path3.lineTo((f9 * f10) / 2.0f, colorMatrixKt.read * f10);
            colorMatrixKt.write.offset((rectF.centerX() + fMin2) - f8, (colorMatrixKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY / 2.0f) + rectF.centerY());
            colorMatrixKt.write.close();
            paint2.setColor(colorMatrixKt.RatingCompat);
            paint2.setAlpha(colorMatrixKt.RemoteActionCompatParcelizer);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(colorMatrixKt.write, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void serializer(float f, ColorMatrixKt colorMatrixKt, boolean z) {
        float interpolation;
        if (this.IconCompatParcelizer) {
            write(f, colorMatrixKt);
            float fFloor = (float) (Math.floor(colorMatrixKt.ComponentActivity / 0.8f) + 1.0d);
            float f2 = colorMatrixKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            float f3 = colorMatrixKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            colorMatrixKt.ResultReceiver = (((f3 - 0.01f) - f2) * f) + f2;
            colorMatrixKt.MediaSessionCompatToken = f3;
            float f4 = colorMatrixKt.ComponentActivity;
            colorMatrixKt.ParcelableVolumeInfo = c8$$ExternalSyntheticOutline0.m(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = colorMatrixKt.ComponentActivity;
            float interpolation2 = colorMatrixKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            restore restoreVar = read;
            if (f < 0.5f) {
                interpolation = (restoreVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - restoreVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = this.MediaSessionCompatQueueItem;
            colorMatrixKt.ResultReceiver = interpolation2;
            colorMatrixKt.MediaSessionCompatToken = interpolation;
            colorMatrixKt.ParcelableVolumeInfo = (0.20999998f * f) + f5;
            this.RatingCompat = (f + f7) * 216.0f;
        }
    }

    public static void write(float f, ColorMatrixKt colorMatrixKt) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = colorMatrixKt.MediaBrowserCompatMediaItem;
            int i = colorMatrixKt.MediaMetadataCompat;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            int i4 = (i2 >> 24) & 255;
            int i5 = (i2 >> 16) & 255;
            int i6 = (i2 >> 8) & 255;
            int i7 = i2 & 255;
            colorMatrixKt.RatingCompat = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
            return;
        }
        colorMatrixKt.RatingCompat = colorMatrixKt.MediaBrowserCompatMediaItem[colorMatrixKt.MediaMetadataCompat];
    }

    public final void IconCompatParcelizer(int i) {
        if (i == 0) {
            serializer(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            serializer(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }
}
