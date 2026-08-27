package com.mapbox.maps.plugin.logo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.MapboxLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class LogoViewImpl extends AppCompatImageView {
    public boolean getLogoEnabled() {
        return getVisibility() == 0;
    }

    public int getLogoGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        return ((FrameLayout.LayoutParams) layoutParams).gravity;
    }

    public void setLogoEnabled(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            String string = getContext().getString(R.string.mapbox_warning_logo_disabled);
            string.getClass();
            MapboxLogger.logW("MbxLogo", string);
            i = 8;
        }
        setVisibility(i);
    }

    public void setLogoGravity(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).gravity = i;
    }

    public LogoViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
