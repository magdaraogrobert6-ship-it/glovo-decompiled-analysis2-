package com.mapbox.maps.plugin.lifecycle;

import android.view.View;
import androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapView;
import java.lang.ref.WeakReference;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewLifecycleOwner implements accessisRenderNodeCompatiblecp {
    public final ViewLifecycleOwner$attachStateChangeListener$1 attachStateChangeListener;
    public final SavedStateRegistryImpl$$ExternalSyntheticLambda0 hostingLifecycleObserver;
    public accessisRenderNodeCompatiblecp hostingLifecycleOwner;
    public boolean isAttached;
    public final accessregisterComponentCallback viewLifecycleRegistry;
    public final WeakReference viewWeakReference;

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        return this.viewLifecycleRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnAttachStateChangeListener, com.mapbox.maps.plugin.lifecycle.ViewLifecycleOwner$attachStateChangeListener$1] */
    public ViewLifecycleOwner(MapView mapView) {
        mapView.getClass();
        this.viewWeakReference = new WeakReference(mapView);
        this.viewLifecycleRegistry = new accessregisterComponentCallback(this, true);
        this.hostingLifecycleObserver = new SavedStateRegistryImpl$$ExternalSyntheticLambda0(1, this);
        ?? r0 = new View.OnAttachStateChangeListener() { // from class: com.mapbox.maps.plugin.lifecycle.ViewLifecycleOwner$attachStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                view.getClass();
                this.this$0.doOnAttached(view);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                view.getClass();
                ViewLifecycleOwner viewLifecycleOwner = this.this$0;
                if (viewLifecycleOwner.isAttached) {
                    viewLifecycleOwner.isAttached = false;
                    accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = viewLifecycleOwner.hostingLifecycleOwner;
                    if (accessisrendernodecompatiblecp == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
                        return;
                    }
                    toColorLong8_81llA tocolorlong8_81lla = ((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat;
                    toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.CREATED;
                    if (tocolorlong8_81lla.isAtLeast(tocolorlong8_81lla2)) {
                        viewLifecycleOwner.viewLifecycleRegistry.RemoteActionCompatParcelizer(tocolorlong8_81lla2);
                    }
                }
            }
        };
        this.attachStateChangeListener = r0;
        mapView.addOnAttachStateChangeListener(r0);
        if (mapView.isAttachedToWindow()) {
            doOnAttached(mapView);
        }
    }

    public final void doOnAttached(View view) {
        supportsColorMatrixQuery lifecycle;
        if (this.isAttached) {
            return;
        }
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.hostingLifecycleOwner;
        SavedStateRegistryImpl$$ExternalSyntheticLambda0 savedStateRegistryImpl$$ExternalSyntheticLambda0 = this.hostingLifecycleObserver;
        if (accessisrendernodecompatiblecp != null && (lifecycle = accessisrendernodecompatiblecp.getLifecycle()) != null) {
            lifecycle.read(savedStateRegistryImpl$$ExternalSyntheticLambda0);
        }
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2 = (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{view}, getCieXyz.write());
        if (accessisrendernodecompatiblecp2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Please ensure that the hosting activity/fragment is a valid LifecycleOwner");
            return;
        }
        this.viewLifecycleRegistry.RemoteActionCompatParcelizer(((accessregisterComponentCallback) accessisrendernodecompatiblecp2.getLifecycle()).RatingCompat);
        accessisrendernodecompatiblecp2.getLifecycle().IconCompatParcelizer(savedStateRegistryImpl$$ExternalSyntheticLambda0);
        this.hostingLifecycleOwner = accessisrendernodecompatiblecp2;
        this.isAttached = true;
    }
}
