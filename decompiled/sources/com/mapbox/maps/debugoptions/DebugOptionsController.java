package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.widget.FrameLayout;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import o.ItemTouchHelperAdapter;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda4;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class DebugOptionsController {
    static final /* synthetic */ registerInAppMessageManagerlambda2[] $$delegatedProperties;
    private CameraDebugView cameraDebugView;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM cameraDebugViewProvider;
    private Cancelable cameraSubscriptionCancelable;
    private final FrameLayout mapView;
    private final MapboxMap mapboxMap;
    private Set<MapViewDebugOptions> options;
    private PaddingDebugView paddingDebugView;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM paddingDebugViewProvider;
    private final displayInAppMessagelambda4 started$delegate;

    public final Set<MapViewDebugOptions> getOptions() {
        return this.options;
    }

    private final void toggleMapViewDebugOptionsIfNeeded() {
        boolean zContains = this.options.contains(MapViewDebugOptions.CAMERA);
        CameraDebugView cameraDebugView = this.cameraDebugView;
        if (zContains) {
            if (cameraDebugView == null) {
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.cameraDebugViewProvider;
                Context context = this.mapView.getContext();
                context.getClass();
                CameraDebugView cameraDebugView2 = (CameraDebugView) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(context);
                this.mapView.addView(cameraDebugView2);
                cameraDebugView2.update(this.mapboxMap.getCameraState());
                this.cameraDebugView = cameraDebugView2;
            }
        } else if (cameraDebugView != null) {
            this.mapView.removeView(cameraDebugView);
            this.cameraDebugView = null;
        }
        boolean zContains2 = this.options.contains(MapViewDebugOptions.PADDING);
        PaddingDebugView paddingDebugView = this.paddingDebugView;
        if (!zContains2) {
            if (paddingDebugView != null) {
                this.mapView.removeView(paddingDebugView);
                this.paddingDebugView = null;
                return;
            }
            return;
        }
        if (paddingDebugView == null) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.paddingDebugViewProvider;
            Context context2 = this.mapView.getContext();
            context2.getClass();
            PaddingDebugView paddingDebugView2 = (PaddingDebugView) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(context2);
            this.mapView.addView(paddingDebugView2);
            EdgeInsets padding = this.mapboxMap.getCameraState().getPadding();
            padding.getClass();
            paddingDebugView2.update(padding);
            this.paddingDebugView = paddingDebugView2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCameraSubscriptionIfNeeded() {
        boolean z = this.options.contains(MapViewDebugOptions.CAMERA) || this.options.contains(MapViewDebugOptions.PADDING);
        if (getStarted() && z && this.cameraSubscriptionCancelable == null) {
            this.cameraSubscriptionCancelable = this.mapboxMap.subscribeCameraChangedCoalesced(new MapboxNavigation$$ExternalSyntheticLambda4(2, this));
            return;
        }
        Cancelable cancelable = this.cameraSubscriptionCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.cameraSubscriptionCancelable = null;
    }

    public final boolean getStarted() {
        return ((Boolean) this.started$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setStarted(boolean z) {
        this.started$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public DebugOptionsController(FrameLayout frameLayout, MapboxMap mapboxMap, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        frameLayout.getClass();
        mapboxMap.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        final Boolean bool = Boolean.FALSE;
        this.started$delegate = new ObservableProperty(bool) { // from class: com.mapbox.maps.debugoptions.DebugOptionsController$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Boolean bool2, Boolean bool3) {
                registerinappmessagemanagerlambda2.getClass();
                if (bool2.booleanValue() != bool3.booleanValue()) {
                    this.updateCameraSubscriptionIfNeeded();
                }
            }
        };
        this.options = ItemTouchHelperAdapter.serializer;
        this.mapView = frameLayout;
        this.mapboxMap = mapboxMap;
        this.cameraDebugViewProvider = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.paddingDebugViewProvider = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCameraSubscriptionIfNeeded$lambda$1(DebugOptionsController debugOptionsController, CameraChangedCoalesced cameraChangedCoalesced) {
        debugOptionsController.getClass();
        cameraChangedCoalesced.getClass();
        CameraDebugView cameraDebugView = debugOptionsController.cameraDebugView;
        if (cameraDebugView != null) {
            CameraState cameraState = cameraChangedCoalesced.getCameraState();
            cameraState.getClass();
            cameraDebugView.update(cameraState);
        }
        PaddingDebugView paddingDebugView = debugOptionsController.paddingDebugView;
        if (paddingDebugView != null) {
            EdgeInsets padding = cameraChangedCoalesced.getCameraState().getPadding();
            padding.getClass();
            paddingDebugView.update(padding);
        }
    }

    public final void setOptions(Set<MapViewDebugOptions> set) {
        set.getClass();
        this.options = set;
        this.mapboxMap.setDebugOptions$maps_sdk_release(MapViewDebugOptionsKt.getNativeDebugOptions(set));
        toggleMapViewDebugOptionsIfNeeded();
        updateCameraSubscriptionIfNeeded();
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DebugOptionsController.class, "started", "getStarted()Z", 0);
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        $$delegatedProperties = new registerInAppMessageManagerlambda2[]{mutablePropertyReference1Impl};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DebugOptionsController(FrameLayout frameLayout, MapboxMap mapboxMap) {
        this(frameLayout, mapboxMap, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.debugoptions.DebugOptionsController.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final CameraDebugView invoke(Context context) {
                context.getClass();
                return new CameraDebugView(context, null, 0, 6, null);
            }
        }, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.debugoptions.DebugOptionsController.2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final PaddingDebugView invoke(Context context) {
                context.getClass();
                return new PaddingDebugView(context, null, 0, 6, null);
            }
        });
        frameLayout.getClass();
        mapboxMap.getClass();
    }
}
