package o;

import android.animation.ValueAnimator;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getString extends Drawable {
    public final AndroidVectorResources IconCompatParcelizer = new AndroidVectorResources(0, this);
    public ValueAnimator MediaDescriptionCompat;
    public getNamedInt RemoteActionCompatParcelizer;
    public final android.graphics.Matrix read;
    public final android.graphics.Rect serializer;
    public final android.graphics.Paint write;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.serializer.set(0, 0, rect.width(), rect.height());
        IconCompatParcelizer();
        serializer();
    }

    public final void IconCompatParcelizer() {
        getNamedInt getnamedint;
        Shader radialGradient;
        android.graphics.Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (getnamedint = this.RemoteActionCompatParcelizer) == null) {
            return;
        }
        int iRound = getnamedint.RatingCompat;
        if (iRound <= 0) {
            iRound = Math.round(getnamedint.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus * iWidth);
        }
        getNamedInt getnamedint2 = this.RemoteActionCompatParcelizer;
        int iRound2 = getnamedint2.MediaSessionCompatQueueItem;
        if (iRound2 <= 0) {
            iRound2 = Math.round(getnamedint2.MediaSessionCompatToken * iHeight);
        }
        getNamedInt getnamedint3 = this.RemoteActionCompatParcelizer;
        boolean z = true;
        if (getnamedint3.ResultReceiver != 1) {
            int i = getnamedint3.MediaBrowserCompatMediaItem;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            getNamedInt getnamedint4 = this.RemoteActionCompatParcelizer;
            radialGradient = new android.graphics.LinearGradient(0.0f, 0.0f, iRound, iRound2, getnamedint4.MediaMetadataCompat, getnamedint4.PlaybackStateCompatCustomAction, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            getNamedInt getnamedint5 = this.RemoteActionCompatParcelizer;
            radialGradient = new android.graphics.RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, getnamedint5.MediaMetadataCompat, getnamedint5.PlaybackStateCompatCustomAction, Shader.TileMode.CLAMP);
        }
        this.write.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        float fM;
        float fM2;
        if (this.RemoteActionCompatParcelizer != null) {
            android.graphics.Paint paint = this.write;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.RemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
            android.graphics.Rect rect = this.serializer;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.MediaDescriptionCompat;
            float f = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
            if (i != 1) {
                if (i == 2) {
                    fM2 = c8$$ExternalSyntheticOutline0.m(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i != 3) {
                    float f2 = -fHeight;
                    fM2 = c8$$ExternalSyntheticOutline0.m(fHeight, f2, animatedFraction, f2);
                } else {
                    fM = c8$$ExternalSyntheticOutline0.m(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fM2;
                fM = 0.0f;
            } else {
                float f3 = -fWidth;
                fM = c8$$ExternalSyntheticOutline0.m(fWidth, f3, animatedFraction, f3);
            }
            android.graphics.Matrix matrix = this.read;
            matrix.reset();
            matrix.setRotate(this.RemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fM);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        getNamedInt getnamedint = this.RemoteActionCompatParcelizer;
        if (getnamedint != null) {
            return (getnamedint.IconCompatParcelizer || getnamedint.write) ? -3 : -1;
        }
        return -1;
    }

    public final void serializer() {
        getNamedInt getnamedint;
        ValueAnimator valueAnimator = this.MediaDescriptionCompat;
        if (valueAnimator == null || valueAnimator.isStarted() || (getnamedint = this.RemoteActionCompatParcelizer) == null || !getnamedint.read || getCallback() == null) {
            return;
        }
        this.MediaDescriptionCompat.start();
    }

    public getString() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.write = paint;
        this.serializer = new android.graphics.Rect();
        this.read = new android.graphics.Matrix();
        paint.setAntiAlias(true);
    }
}
