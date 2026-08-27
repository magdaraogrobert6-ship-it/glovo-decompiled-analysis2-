package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzbv;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.gestures.GestureState$Type;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.util.CoreGesturesHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.TuplesKt;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ShoveGestureDetector extends ProgressiveGesture {
    public static final HashSet handledTypes;
    public float deltaPixelsSinceStart;
    public float maxShoveAngle;
    public float pixelDeltaThreshold;

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final HashSet provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final void reset() {
        this.deltaPixelsSinceStart = 0.0f;
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(3);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final boolean analyzeMovement() {
        MotionEvent motionEvent = this.previousEvent;
        ArrayList arrayList = this.pointerIdList;
        float y = motionEvent.getY(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.previousEvent;
        float y2 = (motionEvent2.getY(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + y) / 2.0f;
        MotionEvent motionEvent3 = this.currentEvent;
        float y3 = motionEvent3.getY(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.currentEvent;
        float y4 = ((motionEvent4.getY(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + y3) / 2.0f) - y2;
        this.deltaPixelsSinceStart += y4;
        if (!this.isInProgress || y4 == 0.0f) {
            if (canExecute(3)) {
                GesturesPluginImpl.ShoveGestureListener shoveGestureListener = (GesturesPluginImpl.ShoveGestureListener) this.listener;
                shoveGestureListener.getClass();
                GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
                if (gesturesPluginImpl.internalSettings.pitchEnabled) {
                    gesturesPluginImpl.cancelTransitionsIfRequired();
                    zzbv zzbvVar = gesturesPluginImpl.gestureState;
                    if (zzbvVar == null) {
                        removeNodeAtDepth.serializer("gestureState");
                        throw null;
                    }
                    zzbvVar.saveAndDisable(GestureState$Type.Shove);
                    Iterator it = gesturesPluginImpl.onShoveListeners.iterator();
                    if (it.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it.next());
                        throw null;
                    }
                    gestureStarted();
                    return true;
                }
            }
            return false;
        }
        GesturesPluginImpl.ShoveGestureListener shoveGestureListener2 = (GesturesPluginImpl.ShoveGestureListener) this.listener;
        shoveGestureListener2.getClass();
        GesturesPluginImpl gesturesPluginImpl2 = GesturesPluginImpl.this;
        MapboxMap mapboxMap = gesturesPluginImpl2.mapCameraManagerDelegate;
        if (mapboxMap == null) {
            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
            throw null;
        }
        double pitch = mapboxMap.getCameraState().getPitch() - ((double) (y4 * 0.1f));
        if (85.0d <= pitch) {
            pitch = 85.0d;
        }
        if (0.0d >= pitch) {
            pitch = 0.0d;
        }
        if (gesturesPluginImpl2.cameraPaddingChanged || gesturesPluginImpl2.sizeChanged) {
            MapboxMap mapboxMap2 = gesturesPluginImpl2.mapCameraManagerDelegate;
            if (mapboxMap2 == null) {
                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                throw null;
            }
            Point center = mapboxMap2.getCameraState().getCenter();
            center.getClass();
            gesturesPluginImpl2.cameraCenterScreenCoordinate = mapboxMap2.pixelForCoordinate(center);
            gesturesPluginImpl2.cameraPaddingChanged = false;
            gesturesPluginImpl2.sizeChanged = false;
        }
        CoreGesturesHandler coreGesturesHandler = gesturesPluginImpl2.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            removeNodeAtDepth.serializer("coreGesturesHandler");
            throw null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl2.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
            throw null;
        }
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(gesturesPluginImpl2.cameraCenterScreenCoordinate).pitch(Double.valueOf(pitch)).build();
        cameraOptionsBuild.getClass();
        MapAnimationOptions mapAnimationOptions = GesturesPluginImpl.IMMEDIATE_ANIMATION_OPTIONS;
        TuplesKt.easeTo$default(cameraAnimationsPlugin, cameraOptionsBuild);
        Iterator it2 = gesturesPluginImpl2.onShoveListeners.iterator();
        if (!it2.hasNext()) {
            return true;
        }
        m1$$ExternalSyntheticOutline0.m(it2.next());
        throw null;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public final boolean canExecute(int i) {
        return Math.abs(this.deltaPixelsSinceStart) >= this.pixelDeltaThreshold && super.canExecute(3);
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final void gestureStopped() {
        super.gestureStopped();
        GesturesPluginImpl.ShoveGestureListener shoveGestureListener = (GesturesPluginImpl.ShoveGestureListener) this.listener;
        shoveGestureListener.getClass();
        GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
        zzbv zzbvVar = gesturesPluginImpl.gestureState;
        if (zzbvVar == null) {
            removeNodeAtDepth.serializer("gestureState");
            throw null;
        }
        zzbvVar.restore(GestureState$Type.Shove);
        Iterator it = gesturesPluginImpl.onShoveListeners.iterator();
        if (it.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it.next());
            throw null;
        }
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final boolean isSloppyGesture() {
        if (!super.isSloppyGesture()) {
            ArrayList arrayList = this.pointerIdList;
            MultiFingerDistancesObject multiFingerDistancesObject = (MultiFingerDistancesObject) this.pointersDistanceMap.get(new PointerDistancePair((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            double degrees = Math.toDegrees(Math.abs(Math.atan2(multiFingerDistancesObject.getCurrFingersDiffY(), multiFingerDistancesObject.getCurrFingersDiffX())));
            double d = this.maxShoveAngle;
            if (degrees <= d || 180.0d - degrees <= d) {
                return false;
            }
        }
        return true;
    }

    public ShoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
