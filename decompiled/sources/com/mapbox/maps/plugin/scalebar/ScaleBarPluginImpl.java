package com.mapbox.maps.plugin.scalebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Projection;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapSizePlugin;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.logo.generated.LogoAttributeParser$parseLogoSettings$1;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleBarPluginImpl implements ViewPlugin, MapSizePlugin {
    public Cancelable cancelable;
    public MapboxMap mapCameraManagerDelegate;
    public MapboxMap mapListenerDelegate;
    public ScaleBarImpl scaleBar;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM viewImplProvider = AnonymousClass1.INSTANCE;
    public ScaleBarSettings internalSettings = CustomRemoteModel.ScaleBarSettings(AnonymousClass1.INSTANCE$2);
    public final MapboxNavigation$$ExternalSyntheticLambda4 cameraChangedCoalescedCallback = new MapboxNavigation$$ExternalSyntheticLambda4(5, this);

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.scalebar.ScaleBarPluginImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public static final AnonymousClass1 INSTANCE;
        public static final AnonymousClass1 INSTANCE$1;
        public static final AnonymousClass1 INSTANCE$2;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, int i2) {
            super(i);
            this.$r8$classId = i2;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i == 0) {
                Context context = (Context) obj;
                context.getClass();
                return new ScaleBarImpl(context);
            }
            if (i != 1) {
                ((ScaleBarSettings.Builder) obj).getClass();
                return createfromparcel;
            }
            ((ScaleBarSettings.Builder) obj).getClass();
            return createfromparcel;
        }

        static {
            int i = 1;
            INSTANCE$1 = new AnonymousClass1(i, i);
            INSTANCE = new AnonymousClass1(i, 0);
            INSTANCE$2 = new AnonymousClass1(i, 2);
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
        this.mapCameraManagerDelegate = (MapboxMap) mapDelegateProviderImpl.mapCameraManagerDelegate;
        this.mapListenerDelegate = (MapboxMap) mapDelegateProviderImpl.mapListenerDelegate;
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final View bind(MapView mapView, AttributeSet attributeSet, float f) {
        mapView.getClass();
        Context context = mapView.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            ScaleBarSettings ScaleBarSettings = CustomRemoteModel.ScaleBarSettings(new LogoAttributeParser$parseLogoSettings$1(typedArrayObtainStyledAttributes, 1, f));
            typedArrayObtainStyledAttributes.recycle();
            this.internalSettings = ScaleBarSettings;
            Context context2 = mapView.getContext();
            context2.getClass();
            ScaleBarImpl scaleBarImpl = (ScaleBarImpl) this.viewImplProvider.invoke(context2);
            scaleBarImpl.getClass();
            scaleBarImpl.setPixelRatio(f);
            return scaleBarImpl;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final void onPluginView(View view) {
        view.getClass();
        ScaleBarImpl scaleBarImpl = view instanceof ScaleBarImpl ? (ScaleBarImpl) view : null;
        if (scaleBarImpl != null) {
            this.scaleBar = scaleBarImpl;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The provided view needs to implement ScaleBarContract.ScaleBarView");
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
        Cancelable cancelable = this.cancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    public final void invalidateScaleBar(CameraState cameraState) {
        double metersPerPixelAtLatitude = Projection.getMetersPerPixelAtLatitude(cameraState.getCenter().latitude(), cameraState.getZoom());
        ScaleBarImpl scaleBarImpl = this.scaleBar;
        if (scaleBarImpl == null) {
            removeNodeAtDepth.serializer("scaleBar");
            throw null;
        }
        if (scaleBarImpl != null) {
            scaleBarImpl.setDistancePerPixel((float) (metersPerPixelAtLatitude / ((double) scaleBarImpl.getPixelRatio())));
        } else {
            removeNodeAtDepth.serializer("scaleBar");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
        ScaleBarImpl scaleBarImpl = this.scaleBar;
        if (scaleBarImpl == null) {
            removeNodeAtDepth.serializer("scaleBar");
            throw null;
        }
        scaleBarImpl.setSettings(this.internalSettings);
        MapboxMap mapboxMap = this.mapCameraManagerDelegate;
        if (mapboxMap == null) {
            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
            throw null;
        }
        invalidateScaleBar(mapboxMap.getCameraState());
        MapboxMap mapboxMap2 = this.mapListenerDelegate;
        if (mapboxMap2 != null) {
            this.cancelable = mapboxMap2.subscribeCameraChangedCoalesced(this.cameraChangedCoalescedCallback);
        } else {
            removeNodeAtDepth.serializer("mapListenerDelegate");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public final void onSizeChanged(int i, int i2) {
        ScaleBarImpl scaleBarImpl = this.scaleBar;
        if (scaleBarImpl == null) {
            removeNodeAtDepth.serializer("scaleBar");
            throw null;
        }
        scaleBarImpl.setMapViewWidth(i);
        if (this.internalSettings.enabled) {
            MapboxMap mapboxMap = this.mapCameraManagerDelegate;
            if (mapboxMap != null) {
                invalidateScaleBar(mapboxMap.getCameraState());
            } else {
                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                throw null;
            }
        }
    }
}
