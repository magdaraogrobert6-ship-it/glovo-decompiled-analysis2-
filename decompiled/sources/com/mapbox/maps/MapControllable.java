package com.mapbox.maps;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;

/* JADX INFO: loaded from: classes2.dex */
public interface MapControllable extends MapboxLifecycleObserver {
    void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener);

    @MapboxExperimental
    void addWidget(Widget widget);

    /* JADX INFO: renamed from: getMapboxMap */
    MapboxMap getMapboxMapDeprecated();

    boolean onGenericMotionEvent(MotionEvent motionEvent);

    void onSizeChanged(int i, int i2);

    boolean onTouchEvent(MotionEvent motionEvent);

    void queueEvent(Runnable runnable, boolean z);

    void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener);

    @MapboxExperimental
    boolean removeWidget(Widget widget);

    void setMaximumFps(int i);

    void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener);

    @MapboxExperimental
    void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder);

    Bitmap snapshot();

    void snapshot(MapView.OnSnapshotReady onSnapshotReady);

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void onResume(MapControllable mapControllable) {
            MapboxLifecycleObserver.DefaultImpls.onResume(mapControllable);
        }

        public static /* synthetic */ void queueEvent$default(MapControllable mapControllable, Runnable runnable, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                mapControllable.queueEvent(runnable, z);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: queueEvent");
        }
    }
}
