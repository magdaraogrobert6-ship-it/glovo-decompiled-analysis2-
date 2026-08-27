package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class accessgetSubcomposeForceReusecp extends getOverflowIcon {
    public Drawable IconCompatParcelizer;
    public final android.graphics.Rect MediaMetadataCompat;
    public boolean RemoteActionCompatParcelizer;
    public final android.graphics.Rect read;
    public int serializer;
    public final boolean write;

    public accessgetSubcomposeForceReusecp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.MediaMetadataCompat = new android.graphics.Rect();
        this.read = new android.graphics.Rect();
        this.serializer = 119;
        this.write = true;
        this.RemoteActionCompatParcelizer = false;
        getDeactivateOutOfFrameNjRlDlw.read(context, attributeSet, 0, 0);
        int[] iArr = setMeasuredSizeozmzZPI.ForegroundLinearLayout;
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.serializer = typedArrayObtainStyledAttributes.getInt(1, this.serializer);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.write = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.IconCompatParcelizer;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.serializer;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            if (this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.write;
                android.graphics.Rect rect = this.MediaMetadataCompat;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.serializer;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                android.graphics.Rect rect2 = this.read;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.IconCompatParcelizer.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // o.getOverflowIcon, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.RemoteActionCompatParcelizer = z | this.RemoteActionCompatParcelizer;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.IconCompatParcelizer;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.IconCompatParcelizer;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.IconCompatParcelizer);
            }
            this.IconCompatParcelizer = drawable;
            this.RemoteActionCompatParcelizer = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.serializer == 119) {
                    drawable.getPadding(new android.graphics.Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.serializer != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.serializer = i;
            if (i == 119 && this.IconCompatParcelizer != null) {
                this.IconCompatParcelizer.getPadding(new android.graphics.Rect());
            }
            requestLayout();
        }
    }
}
