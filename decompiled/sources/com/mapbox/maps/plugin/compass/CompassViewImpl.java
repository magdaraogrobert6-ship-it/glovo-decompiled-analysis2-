package com.mapbox.maps.plugin.compass;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class CompassViewImpl extends AppCompatImageView {
    public CompassViewPlugin presenter;

    public float getCompassRotation() {
        return getRotation();
    }

    public void setCompassAlpha(float f) {
        setAlpha(f);
    }

    public void setCompassRotation(float f) {
        setRotation(f);
    }

    public void setCompassImage(Drawable drawable) {
        drawable.getClass();
        setImageDrawable(drawable);
    }

    public int getCompassGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    public Drawable getCompassImage() {
        Drawable drawable = getDrawable();
        drawable.getClass();
        return drawable;
    }

    public void setCompassGravity(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).gravity = i;
    }

    public void setCompassEnabled(boolean z) {
        if (isEnabled() != z) {
            setEnabled(z);
        }
    }

    public void setCompassVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public CompassViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
