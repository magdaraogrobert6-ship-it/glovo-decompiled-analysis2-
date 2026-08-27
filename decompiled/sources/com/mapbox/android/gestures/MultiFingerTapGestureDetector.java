package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiFingerTapGestureDetector extends MultiFingerGesture {
    public boolean invalidMovement;
    public int lastPointersDownCount;
    public float multiFingerTapMovementThreshold;
    public long multiFingerTapTimeThreshold;
    public boolean pointerLifted;

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final void reset() {
        this.lastPointersDownCount = 0;
        this.invalidMovement = false;
        this.pointerLifted = false;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public final boolean analyzeEvent(MotionEvent motionEvent) {
        super.analyzeEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        boolean z2 = true;
        if (actionMasked == 1) {
            if (canExecute(4)) {
                GesturesPluginImpl.TapGestureListener tapGestureListener = (GesturesPluginImpl.TapGestureListener) this.listener;
                int i = this.lastPointersDownCount;
                tapGestureListener.getClass();
                GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
                if (gesturesPluginImpl.internalSettings.doubleTouchToZoomOutEnabled && i == 2) {
                    CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
                    if (cameraAnimationsPlugin == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).cancelAllAnimators(onContentCardDismissed.PlaybackStateCompat(gesturesPluginImpl.protectedCameraAnimatorOwners));
                    ScreenCoordinate screenCoordinate = gesturesPluginImpl.internalSettings.focalPoint;
                    if (screenCoordinate != null) {
                        gesturesPluginImpl.handleZoomAnimation$plugin_gestures_release(false, screenCoordinate);
                    } else {
                        PointF pointF = this.focalPoint;
                        gesturesPluginImpl.handleZoomAnimation$plugin_gestures_release(false, new ScreenCoordinate(pointF.x, pointF.y));
                    }
                    z = true;
                }
            }
            reset();
            return z;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (this.pointerLifted) {
                    this.invalidMovement = true;
                }
                this.lastPointersDownCount = this.pointerIdList.size();
                return false;
            }
            if (actionMasked == 6) {
                this.pointerLifted = true;
                return false;
            }
        } else if (!this.invalidMovement) {
            for (MultiFingerDistancesObject multiFingerDistancesObject : this.pointersDistanceMap.values()) {
                float fAbs = Math.abs(multiFingerDistancesObject.getCurrFingersDiffX() - multiFingerDistancesObject.getPrevFingersDiffX());
                float fAbs2 = Math.abs(multiFingerDistancesObject.getCurrFingersDiffY() - multiFingerDistancesObject.getPrevFingersDiffY());
                float f = this.multiFingerTapMovementThreshold;
                boolean z3 = fAbs > f || fAbs2 > f;
                this.invalidMovement = z3;
                if (z3) {
                    this.invalidMovement = z2;
                    return false;
                }
            }
            z2 = false;
            this.invalidMovement = z2;
            return false;
        }
        return false;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public final boolean canExecute(int i) {
        return this.lastPointersDownCount > 1 && !this.invalidMovement && this.gestureDuration < this.multiFingerTapTimeThreshold && super.canExecute(4);
    }

    public MultiFingerTapGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
