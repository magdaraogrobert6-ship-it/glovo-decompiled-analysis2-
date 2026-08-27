package com.mapbox.maps.plugin.gestures;

import android.content.Context;
import android.view.Choreographer;
import android.widget.OverScroller;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;

/* JADX INFO: loaded from: classes2.dex */
public final class OverScrollerFlingAnimator {
    public final Choreographer choreographer;
    public final OverScrollerFlingAnimator$frameCallback$1 frameCallback;
    public ScreenCoordinate fromPoint;
    public boolean isRunning;
    public boolean limitHorizontal;
    public boolean limitVertical;
    public final MapCameraManagerDelegate mapCameraManagerDelegate;
    public GesturesPluginImpl$onDelegateProvider$3$1 onAnimationEnd;
    public GesturesPluginImpl$onDelegateProvider$3$1 onAnimationStart;
    public final OverScroller overScroller;
    public int prevX;
    public int prevY;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.mapbox.maps.plugin.gestures.OverScrollerFlingAnimator$frameCallback$1] */
    public OverScrollerFlingAnimator(Context context, MapboxMap mapboxMap) {
        context.getClass();
        mapboxMap.getClass();
        this.mapCameraManagerDelegate = mapboxMap;
        this.overScroller = new OverScroller(context);
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.getClass();
        this.choreographer = choreographer;
        this.fromPoint = new ScreenCoordinate(0.0d, 0.0d);
        this.frameCallback = new Choreographer.FrameCallback() { // from class: com.mapbox.maps.plugin.gestures.OverScrollerFlingAnimator$frameCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                OverScrollerFlingAnimator overScrollerFlingAnimator = this.this$0;
                MapCameraManagerDelegate mapCameraManagerDelegate = overScrollerFlingAnimator.mapCameraManagerDelegate;
                Choreographer choreographer2 = overScrollerFlingAnimator.choreographer;
                OverScroller overScroller = overScrollerFlingAnimator.overScroller;
                if (!overScroller.computeScrollOffset()) {
                    if (overScrollerFlingAnimator.isRunning) {
                        choreographer2.removeFrameCallback(this);
                        overScrollerFlingAnimator.isRunning = false;
                        GesturesPluginImpl$onDelegateProvider$3$1 gesturesPluginImpl$onDelegateProvider$3$1 = overScrollerFlingAnimator.onAnimationEnd;
                        if (gesturesPluginImpl$onDelegateProvider$3$1 != null) {
                            gesturesPluginImpl$onDelegateProvider$3$1.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i = overScrollerFlingAnimator.limitHorizontal ? 0 : currX - overScrollerFlingAnimator.prevX;
                int i2 = overScrollerFlingAnimator.limitVertical ? 0 : currY - overScrollerFlingAnimator.prevY;
                overScrollerFlingAnimator.prevX = currX;
                overScrollerFlingAnimator.prevY = currY;
                if (i != 0 || i2 != 0) {
                    mapCameraManagerDelegate.setCamera(mapCameraManagerDelegate.cameraForDrag(overScrollerFlingAnimator.fromPoint, new ScreenCoordinate(overScrollerFlingAnimator.fromPoint.getX() + ((double) i), overScrollerFlingAnimator.fromPoint.getY() + ((double) i2))));
                }
                choreographer2.postFrameCallback(this);
            }
        };
    }

    public final void forceStop() {
        if (this.isRunning) {
            this.overScroller.forceFinished(true);
            this.choreographer.removeFrameCallback(this.frameCallback);
            this.isRunning = false;
            GesturesPluginImpl$onDelegateProvider$3$1 gesturesPluginImpl$onDelegateProvider$3$1 = this.onAnimationEnd;
            if (gesturesPluginImpl$onDelegateProvider$3$1 != null) {
                gesturesPluginImpl$onDelegateProvider$3$1.invoke();
            }
        }
    }
}
