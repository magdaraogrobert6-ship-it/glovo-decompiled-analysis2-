package com.mapbox.maps.plugin.viewport;

import android.os.Handler;
import android.os.Looper;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.mapbox.maps.MapController;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.viewport.data.ViewportOptions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewportPluginImpl implements MapPlugin {
    public CameraAnimationsPlugin cameraPlugin;
    public final Handler handler = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArraySet registeredStatusObservers = new CopyOnWriteArraySet();
    public final ViewportPluginImpl$cameraAnimationsLifecycleListener$1 cameraAnimationsLifecycleListener = new CameraAnimationsLifecycleListener() { // from class: com.mapbox.maps.plugin.viewport.ViewportPluginImpl$cameraAnimationsLifecycleListener$1
        @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
        public final void onAnimatorCancelling(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator) {
            cameraAnimatorType.getClass();
        }

        @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
        public final void onAnimatorEnding(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator) {
            cameraAnimatorType.getClass();
        }

        @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
        public final void onAnimatorInterrupting(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator, CameraAnimator cameraAnimator2) {
            cameraAnimatorType.getClass();
        }

        @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
        public final void onAnimatorStarting(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator, String str) {
            cameraAnimatorType.getClass();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "VIEWPORT_CAMERA_OWNER"}, iWrite3)).booleanValue()) {
                int iWrite4 = getCieXyz.write();
                int iWrite5 = getCieXyz.write();
                int iWrite6 = getCieXyz.write();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str, "Maps-Gestures"}, iWrite6)).booleanValue()) {
                    ViewportPluginImpl viewportPluginImpl = this.this$0;
                    viewportPluginImpl.options.getClass();
                    ViewportStatus$Idle viewportStatus$Idle = viewportPluginImpl.status;
                    ViewportStatus$Idle viewportStatus$Idle2 = ViewportStatus$Idle.INSTANCE;
                    if (viewportStatus$Idle2 != viewportStatus$Idle) {
                        viewportPluginImpl.status = viewportStatus$Idle2;
                        Iterator it = viewportPluginImpl.registeredStatusObservers.iterator();
                        while (it.hasNext()) {
                            m1$$ExternalSyntheticOutline0.m(it.next());
                            viewportPluginImpl.handler.post(new ZM$$ExternalSyntheticLambda2(9, viewportStatus$Idle));
                        }
                    }
                }
            }
        }
    };
    public ViewportStatus$Idle status = ViewportStatus$Idle.INSTANCE;
    public final ViewportOptions options = new ViewportOptions();

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
        MapController mapController = (MapController) mapDelegateProviderImpl.mapPluginProviderDelegate;
        CameraAnimationsPlugin camera = CameraAnimationsUtils.getCamera(mapController);
        this.cameraPlugin = camera;
        ViewportPluginImpl$cameraAnimationsLifecycleListener$1 viewportPluginImpl$cameraAnimationsLifecycleListener$1 = this.cameraAnimationsLifecycleListener;
        viewportPluginImpl$cameraAnimationsLifecycleListener$1.getClass();
        ((CameraAnimationsPluginImpl) camera).lifecycleListeners.add(viewportPluginImpl$cameraAnimationsLifecycleListener$1);
        CameraAnimationsUtils.getCamera(mapController);
        CameraAnimationsUtils.getCamera(mapController);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraPlugin;
        if (cameraAnimationsPlugin == null) {
            removeNodeAtDepth.serializer("cameraPlugin");
            throw null;
        }
        ViewportPluginImpl$cameraAnimationsLifecycleListener$1 viewportPluginImpl$cameraAnimationsLifecycleListener$1 = this.cameraAnimationsLifecycleListener;
        viewportPluginImpl$cameraAnimationsLifecycleListener$1.getClass();
        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).lifecycleListeners.remove(viewportPluginImpl$cameraAnimationsLifecycleListener$1);
    }
}
