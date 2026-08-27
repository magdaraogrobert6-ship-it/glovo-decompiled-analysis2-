package com.mapbox.maps.plugin.attribution;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.MapboxLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributionViewImpl extends AppCompatImageView {
    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
    }

    public void setViewOnClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        setOnClickListener(onClickListener);
    }

    public void setEnable(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            String string = getContext().getString(R.string.mapbox_warning_attribution_disabled);
            string.getClass();
            MapboxLogger.logW("MbxAttribution", string);
            i = 8;
        }
        setVisibility(i);
    }

    public void setGravity(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).gravity = i;
    }

    public void setIconColor(int i) {
        setImageTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{i, i}));
    }

    public AttributionViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
