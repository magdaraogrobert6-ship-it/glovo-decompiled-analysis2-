package com.mapbox.maps.plugin.logo;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.logo.generated.LogoAttributeParser$parseLogoSettings$1;
import com.mapbox.maps.plugin.logo.generated.LogoSettings;
import com.mapbox.maps.plugin.logo.generated.LogoSettingsKt;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setLeft;

/* JADX INFO: loaded from: classes2.dex */
public final class LogoViewPlugin implements ViewPlugin {
    public LogoViewImpl logoView;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM viewImplProvider = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.maps.plugin.logo.LogoViewPlugin.1
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            Context context = (Context) obj;
            context.getClass();
            LogoViewImpl logoViewImpl = new LogoViewImpl(context, null);
            Resources resources = logoViewImpl.getResources();
            ThreadLocal threadLocal = setLeft.read;
            Drawable drawable = resources.getDrawable(2131232329, null);
            if (drawable != null) {
                logoViewImpl.setImageDrawable(drawable);
            }
            float f = logoViewImpl.getContext().getResources().getDisplayMetrics().density;
            logoViewImpl.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            logoViewImpl.setLogoGravity(8388691);
            int i = (int) (f * 4.0f);
            ViewGroup.LayoutParams layoutParams = logoViewImpl.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(i, i, i, i);
            layoutParams2.setMarginStart(i);
            layoutParams2.setMarginEnd(i);
            return logoViewImpl;
        }
    };
    public LogoSettings internalSettings = new LogoSettings(true, 8388691, 4.0f, 4.0f, 4.0f, 4.0f);

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final View bind(MapView mapView, AttributeSet attributeSet, float f) {
        mapView.getClass();
        Context context = mapView.getContext();
        context.getClass();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            LogoSettings LogoSettings = LogoSettingsKt.LogoSettings(new LogoAttributeParser$parseLogoSettings$1(typedArrayObtainStyledAttributes, i, f));
            typedArrayObtainStyledAttributes.recycle();
            this.internalSettings = LogoSettings;
            Context context2 = mapView.getContext();
            context2.getClass();
            Object objInvoke = this.viewImplProvider.invoke(context2);
            ((LogoViewImpl) objInvoke).getClass();
            return (View) objInvoke;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final void onPluginView(View view) {
        view.getClass();
        LogoViewImpl logoViewImpl = view instanceof LogoViewImpl ? (LogoViewImpl) view : null;
        if (logoViewImpl != null) {
            this.logoView = logoViewImpl;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The provided view needs to implement LogoContract.LogoView");
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
        LogoViewImpl logoViewImpl = this.logoView;
        if (logoViewImpl == null) {
            removeNodeAtDepth.serializer("logoView");
            throw null;
        }
        LogoSettings logoSettings = this.internalSettings;
        int i = (int) logoSettings.marginLeft;
        int i2 = (int) logoSettings.marginTop;
        int i3 = (int) logoSettings.marginRight;
        int i4 = (int) logoSettings.marginBottom;
        ViewGroup.LayoutParams layoutParams = logoViewImpl.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(i, i2, i3, i4);
        layoutParams2.setMarginStart(i);
        layoutParams2.setMarginEnd(i3);
        LogoViewImpl logoViewImpl2 = this.logoView;
        if (logoViewImpl2 == null) {
            removeNodeAtDepth.serializer("logoView");
            throw null;
        }
        logoViewImpl2.setLogoGravity(this.internalSettings.position);
        LogoViewImpl logoViewImpl3 = this.logoView;
        if (logoViewImpl3 == null) {
            removeNodeAtDepth.serializer("logoView");
            throw null;
        }
        logoViewImpl3.setLogoEnabled(this.internalSettings.enabled);
        LogoViewImpl logoViewImpl4 = this.logoView;
        if (logoViewImpl4 != null) {
            logoViewImpl4.requestLayout();
        } else {
            removeNodeAtDepth.serializer("logoView");
            throw null;
        }
    }
}
