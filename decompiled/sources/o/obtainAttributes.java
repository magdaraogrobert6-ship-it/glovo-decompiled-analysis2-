package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class obtainAttributes extends FrameLayout {
    public final boolean RemoteActionCompatParcelizer;
    public final getString read;
    public final android.graphics.Paint write;

    public final void serializer(getNamedInt getnamedint) {
        boolean zIsStarted;
        getString getstring = this.read;
        getstring.RemoteActionCompatParcelizer = getnamedint;
        if (getnamedint != null) {
            getstring.write.setXfermode(new PorterDuffXfermode(getstring.RemoteActionCompatParcelizer.write ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        getstring.IconCompatParcelizer();
        if (getstring.RemoteActionCompatParcelizer != null) {
            ValueAnimator valueAnimator = getstring.MediaDescriptionCompat;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                getstring.MediaDescriptionCompat.cancel();
                getstring.MediaDescriptionCompat.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            getNamedInt getnamedint2 = getstring.RemoteActionCompatParcelizer;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (getnamedint2.ComponentActivity / getnamedint2.RemoteActionCompatParcelizer) + 1.0f);
            getstring.MediaDescriptionCompat = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(getstring.RemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
            getstring.MediaDescriptionCompat.setRepeatCount(getstring.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper);
            ValueAnimator valueAnimator2 = getstring.MediaDescriptionCompat;
            getNamedInt getnamedint3 = getstring.RemoteActionCompatParcelizer;
            valueAnimator2.setDuration(getnamedint3.RemoteActionCompatParcelizer + getnamedint3.ComponentActivity);
            getstring.MediaDescriptionCompat.addUpdateListener(getstring.IconCompatParcelizer);
            if (zIsStarted) {
                getstring.MediaDescriptionCompat.start();
            }
        }
        getstring.invalidateSelf();
        if (getnamedint == null || !getnamedint.IconCompatParcelizer) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.write);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.RemoteActionCompatParcelizer) {
            this.read.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.read.serializer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getString getstring = this.read;
        ValueAnimator valueAnimator = getstring.MediaDescriptionCompat;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        getstring.MediaDescriptionCompat.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.read.setBounds(0, 0, getWidth(), getHeight());
    }

    public obtainAttributes(Context context, AttributeSet attributeSet) {
        getNamedBoolean getnamedboolean;
        super(context, attributeSet);
        this.write = new android.graphics.Paint();
        getString getstring = new getString();
        this.read = getstring;
        this.RemoteActionCompatParcelizer = true;
        setWillNotDraw(false);
        getstring.setCallback(this);
        if (attributeSet == null) {
            serializer(new getNamedBoolean(0).RatingCompat());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getNamedComplexColor.ShimmerFrameLayout, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                getnamedboolean = new getNamedBoolean(1);
                ((getNamedInt) getnamedboolean.ComponentActivity).write = false;
            } else {
                getnamedboolean = new getNamedBoolean(0);
            }
            serializer(getnamedboolean.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes).RatingCompat());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.read;
    }
}
