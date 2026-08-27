package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class SolidColor extends Drawable implements Drawable.Callback, android.graphics.drawable.Animatable {
    public final getBlurRadius MediaBrowserCompatMediaItem;
    public long MediaSessionCompatQueueItem;
    public int PlaybackStateCompat;
    public final boolean read;
    public final int serializer;
    public final ArrayList write = new ArrayList();
    public final int RatingCompat = read(null, null);
    public final int RemoteActionCompatParcelizer = read(null, null);
    public int MediaMetadataCompat = 255;
    public Drawable MediaDescriptionCompat = null;
    public final Drawable IconCompatParcelizer = null;

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.MediaMetadataCompat;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.RatingCompat;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.PlaybackStateCompat == 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void write() {
        this.PlaybackStateCompat = 2;
        this.MediaDescriptionCompat = null;
        ArrayList arrayList = this.write;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((onRemeasurementAvailable) arrayList.get(i)).read(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.MediaDescriptionCompat;
        int i = this.PlaybackStateCompat;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.MediaDescriptionCompat;
        android.graphics.drawable.Animatable animatable = obj instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.IconCompatParcelizer;
        android.graphics.drawable.Animatable animatable2 = obj2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.PlaybackStateCompat != 0) {
            return;
        }
        this.PlaybackStateCompat = 1;
        this.MediaSessionCompatQueueItem = SystemClock.uptimeMillis();
        ArrayList arrayList = this.write;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((onRemeasurementAvailable) arrayList.get(i)).IconCompatParcelizer(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.MediaDescriptionCompat;
        android.graphics.drawable.Animatable animatable = obj instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.IconCompatParcelizer;
        android.graphics.drawable.Animatable animatable2 = obj2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.PlaybackStateCompat != 2) {
            write();
        }
    }

    public SolidColor(getBlurRadius getblurradius, int i, boolean z) {
        this.MediaBrowserCompatMediaItem = getblurradius;
        this.serializer = i;
        this.read = z;
        if (i > 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("durationMillis must be > 0.");
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        Drawable drawable;
        int i = this.PlaybackStateCompat;
        if (i == 0) {
            Drawable drawable2 = this.MediaDescriptionCompat;
            if (drawable2 != null) {
                drawable2.setAlpha(this.MediaMetadataCompat);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.IconCompatParcelizer;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.MediaMetadataCompat);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.MediaSessionCompatQueueItem) / ((double) this.serializer);
        double d = RangesKt.read(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.MediaMetadataCompat;
        int i3 = (int) (d * ((double) i2));
        if (this.read) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.MediaDescriptionCompat) != null) {
            drawable.setAlpha(i2);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave3);
                throw th;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i3);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave4);
                throw th2;
            }
        }
        if (z) {
            write();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            serializer(drawable, rect);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            serializer(drawable2, rect);
        }
    }

    public final int read(Integer num, Integer num2) {
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (num2 != null && num2.intValue() == -1) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void serializer(Drawable drawable, android.graphics.Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dWrite = RangesKt.write(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.MediaBrowserCompatMediaItem, accessgetLayerBlockp.serializer);
        int iWrite = MathKt.write((((double) iWidth) - (((double) intrinsicWidth) * dWrite)) / 2.0d);
        int iWrite2 = MathKt.write((((double) iHeight) - (dWrite * ((double) intrinsicHeight))) / 2.0d);
        drawable.setBounds(rect.left + iWrite, rect.top + iWrite2, rect.right - iWrite, rect.bottom - iWrite2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(android.graphics.BlendMode blendMode) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.MediaDescriptionCompat;
        boolean z3 = drawable != null && drawable.setVisible(z, z2);
        Drawable drawable2 = this.IconCompatParcelizer;
        return visible || z3 || (drawable2 != null && drawable2.setVisible(z, z2));
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        android.graphics.ColorFilter colorFilter;
        int i = this.PlaybackStateCompat;
        if (i == 0) {
            Drawable drawable = this.MediaDescriptionCompat;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.MediaDescriptionCompat;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        Drawable drawable2 = this.IconCompatParcelizer;
        return drawable2 != null && drawable2.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.MediaDescriptionCompat;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.IconCompatParcelizer;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.MediaDescriptionCompat;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.IconCompatParcelizer;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i >= 0 && i < 256) {
            this.MediaMetadataCompat = i;
        } else {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Invalid alpha: "));
        }
    }
}
