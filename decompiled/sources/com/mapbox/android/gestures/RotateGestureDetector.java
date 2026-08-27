package com.mapbox.android.gestures;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraBearingAnimator;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl$createScaleAnimators$$inlined$doOnEnd$1;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl$createScaleAnimators$zoomAnimator$2;
import com.mapbox.maps.plugin.gestures.GesturesUtils$getGesturesManager$1;
import com.mapbox.maps.util.CoreGesturesHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.TuplesKt;
import o.removeNodeAtDepth;
import o.restore;

/* JADX INFO: loaded from: classes2.dex */
public final class RotateGestureDetector extends ProgressiveGesture {
    public static final HashSet handledTypes;
    public float angleThreshold;
    public float deltaSinceLast;
    public float deltaSinceStart;

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final HashSet provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final void reset() {
        this.deltaSinceStart = 0.0f;
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(2);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final boolean analyzeMovement() {
        ArrayList arrayList = this.pointerIdList;
        MultiFingerDistancesObject multiFingerDistancesObject = (MultiFingerDistancesObject) this.pointersDistanceMap.get(new PointerDistancePair((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
        float degrees = (float) Math.toDegrees(Math.atan2(multiFingerDistancesObject.getPrevFingersDiffY(), multiFingerDistancesObject.getPrevFingersDiffX()) - Math.atan2(multiFingerDistancesObject.getCurrFingersDiffY(), multiFingerDistancesObject.getCurrFingersDiffX()));
        this.deltaSinceLast = degrees;
        this.deltaSinceStart += degrees;
        if (!this.isInProgress || degrees == 0.0f) {
            if (canExecute(2)) {
                GesturesPluginImpl.RotateGestureListener rotateGestureListener = (GesturesPluginImpl.RotateGestureListener) this.listener;
                rotateGestureListener.getClass();
                GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
                if (gesturesPluginImpl.internalSettings.rotateEnabled) {
                    float fAbs = Math.abs(this.deltaSinceLast);
                    double eventTime = this.currentEvent.getEventTime();
                    double eventTime2 = this.previousEvent.getEventTime();
                    if (eventTime != eventTime2) {
                        double d = ((double) fAbs) / (eventTime - eventTime2);
                        float fAbs2 = Math.abs(this.deltaSinceStart);
                        if (d >= 0.04d && ((d <= 0.07d || fAbs2 >= 5.0f) && ((d <= 0.15d || fAbs2 >= 7.0f) && (d <= 0.5d || fAbs2 >= 15.0f)))) {
                            AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
                            if (androidGesturesManager == null) {
                                removeNodeAtDepth.serializer("gesturesManager");
                                throw null;
                            }
                            StandardScaleGestureDetector standardScaleGestureDetector = androidGesturesManager.standardScaleGestureDetector;
                            boolean z = standardScaleGestureDetector.isInProgress;
                            if (!z || fAbs2 >= 16.0f) {
                                if (gesturesPluginImpl.internalSettings.increasePinchToZoomThresholdWhenRotating) {
                                    standardScaleGestureDetector.spanSinceStartThreshold = gesturesPluginImpl.minimumScaleSpanWhenRotating;
                                    if (z) {
                                        standardScaleGestureDetector.interrupted = true;
                                    }
                                }
                                gesturesPluginImpl.cancelTransitionsIfRequired();
                                Iterator it = gesturesPluginImpl.onRotateListeners.iterator();
                                if (it.hasNext()) {
                                    m1$$ExternalSyntheticOutline0.m(it.next());
                                    throw null;
                                }
                                gestureStarted();
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        GesturesPluginImpl.RotateGestureListener rotateGestureListener2 = (GesturesPluginImpl.RotateGestureListener) this.listener;
        rotateGestureListener2.getClass();
        GesturesPluginImpl gesturesPluginImpl2 = GesturesPluginImpl.this;
        MapboxMap mapboxMap = gesturesPluginImpl2.mapCameraManagerDelegate;
        if (mapboxMap == null) {
            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
            throw null;
        }
        double bearing = mapboxMap.getCameraState().getBearing();
        CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl2.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
            throw null;
        }
        gesturesPluginImpl2.rotateCachedAnchor = ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getAnchor();
        double d2 = bearing + ((double) degrees);
        ScreenCoordinate screenCoordinate = gesturesPluginImpl2.internalSettings.focalPoint;
        if (screenCoordinate == null) {
            PointF pointF = this.focalPoint;
            screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
        }
        CoreGesturesHandler coreGesturesHandler = gesturesPluginImpl2.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            removeNodeAtDepth.serializer("coreGesturesHandler");
            throw null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        boolean z2 = gesturesPluginImpl2.internalSettings.simultaneousRotateAndPinchToZoomEnabled;
        CameraAnimationsPlugin cameraAnimationsPlugin2 = gesturesPluginImpl2.cameraAnimationsPlugin;
        if (z2) {
            if (cameraAnimationsPlugin2 == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            Object[] objArrCopyOf = Arrays.copyOf(new Double[]{Double.valueOf(d2)}, 1);
            CameraBearingAnimator cameraBearingAnimatorCreateBearingAnimator$default = TuplesKt.createBearingAnimator$default(cameraAnimationsPlugin2, new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), null, "Maps-Gestures"), GesturesUtils$getGesturesManager$1.INSTANCE$2);
            if (gesturesPluginImpl2.cameraAnimationsPlugin == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1);
            CameraAnchorAnimator cameraAnchorAnimator = new CameraAnchorAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), null, "Maps-Gestures"), GesturesUtils$getGesturesManager$1.INSTANCE$1);
            CameraAnimationsPlugin cameraAnimationsPlugin3 = gesturesPluginImpl2.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin3 == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin3).playAnimatorsTogether(cameraAnchorAnimator, cameraBearingAnimatorCreateBearingAnimator$default);
        } else {
            if (cameraAnimationsPlugin2 == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(screenCoordinate).bearing(Double.valueOf(d2)).build();
            cameraOptionsBuild.getClass();
            MapAnimationOptions mapAnimationOptions = GesturesPluginImpl.IMMEDIATE_ANIMATION_OPTIONS;
            TuplesKt.easeTo$default(cameraAnimationsPlugin2, cameraOptionsBuild);
        }
        CameraAnimationsPlugin cameraAnimationsPlugin4 = gesturesPluginImpl2.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin4 == null) {
            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
            throw null;
        }
        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin4).setAnchor(gesturesPluginImpl2.rotateCachedAnchor);
        Iterator it2 = gesturesPluginImpl2.onRotateListeners.iterator();
        if (!it2.hasNext()) {
            return true;
        }
        m1$$ExternalSyntheticOutline0.m(it2.next());
        throw null;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public final boolean canExecute(int i) {
        return Math.abs(this.deltaSinceStart) >= this.angleThreshold && super.canExecute(2);
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final void gestureStopped() {
        super.gestureStopped();
        if (this.deltaSinceLast == 0.0f) {
            this.velocityX = 0.0f;
            this.velocityY = 0.0f;
        }
        float f = this.velocityX;
        float f2 = this.velocityY;
        PointF pointF = this.focalPoint;
        float f3 = pointF.x;
        float fAbs = Math.abs((float) (((double) ((pointF.y * f) + (f2 * f3))) / (Math.pow(this.focalPoint.y, 2.0d) + Math.pow(f3, 2.0d))));
        if (this.deltaSinceLast < 0.0f) {
            fAbs = -fAbs;
        }
        GesturesPluginImpl.RotateGestureListener rotateGestureListener = (GesturesPluginImpl.RotateGestureListener) this.listener;
        float f4 = this.velocityX;
        float f5 = this.velocityY;
        rotateGestureListener.getClass();
        GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
        if (gesturesPluginImpl.internalSettings.increasePinchToZoomThresholdWhenRotating) {
            AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
            if (androidGesturesManager == null) {
                removeNodeAtDepth.serializer("gesturesManager");
                throw null;
            }
            androidGesturesManager.standardScaleGestureDetector.spanSinceStartThreshold = gesturesPluginImpl.defaultSpanSinceStartThreshold;
        }
        Iterator it = gesturesPluginImpl.onRotateListeners.iterator();
        if (it.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it.next());
            throw null;
        }
        float f6 = fAbs * gesturesPluginImpl.angularVelocityMultiplier;
        if (30.0f <= f6) {
            f6 = 30.0f;
        }
        if (-30.0f >= f6) {
            f6 = -30.0f;
        }
        double dAbs = Math.abs(this.deltaSinceLast) / (Math.abs(f5) + Math.abs(f4));
        if (!gesturesPluginImpl.internalSettings.rotateDecelerationEnabled || Math.abs(f6) < gesturesPluginImpl.minimumAngularVelocity) {
            return;
        }
        AndroidGesturesManager androidGesturesManager2 = gesturesPluginImpl.gesturesManager;
        if (androidGesturesManager2 == null) {
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        if (!androidGesturesManager2.standardScaleGestureDetector.isInProgress || dAbs >= gesturesPluginImpl.rotateVelocityRatioThreshold) {
            long jLog = (long) ((Math.log((1.0d / Math.pow(2.718281828459045d, 2.0d)) + ((double) Math.abs(f6))) + 2.0d) * 150.0d);
            ScreenCoordinate screenCoordinate = gesturesPluginImpl.internalSettings.focalPoint;
            if (screenCoordinate == null) {
                PointF pointF2 = this.focalPoint;
                screenCoordinate = new ScreenCoordinate(pointF2.x, pointF2.y);
            }
            restore restoreVar = gesturesPluginImpl.gesturesInterpolator;
            long j = (jLog / 16) + 1;
            if (1 <= j) {
                float interpolation = f6;
                long j2 = 1;
                while (true) {
                    interpolation += (1.0f - restoreVar.getInterpolation(j2 / j)) * f6;
                    if (j2 == j) {
                        break;
                    } else {
                        j2++;
                    }
                }
                f6 = interpolation;
            }
            MapboxMap mapboxMap = gesturesPluginImpl.mapCameraManagerDelegate;
            if (mapboxMap == null) {
                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                throw null;
            }
            double bearing = mapboxMap.getCameraState().getBearing();
            double d = f6;
            CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            int i = 1;
            Object[] objArrCopyOf = Arrays.copyOf(new Double[]{Double.valueOf(d + bearing)}, 1);
            CameraBearingAnimator cameraBearingAnimatorCreateBearingAnimator$default = TuplesKt.createBearingAnimator$default(cameraAnimationsPlugin, new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), Double.valueOf(bearing), "Maps-Gestures"), new GesturesPluginImpl$createScaleAnimators$zoomAnimator$2(restoreVar, jLog, 2));
            CoreGesturesHandler coreGesturesHandler = gesturesPluginImpl.coreGesturesHandler;
            if (coreGesturesHandler == null) {
                removeNodeAtDepth.serializer("coreGesturesHandler");
                throw null;
            }
            cameraBearingAnimatorCreateBearingAnimator$default.addListener(coreGesturesHandler.getCoreGestureAnimatorHandler());
            ScreenCoordinate screenCoordinate2 = new ScreenCoordinate(screenCoordinate.getX(), screenCoordinate.getY());
            if (gesturesPluginImpl.cameraAnimationsPlugin == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate2}, 1);
            CameraAnchorAnimator cameraAnchorAnimator = new CameraAnchorAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), screenCoordinate2, "Maps-Gestures"), new GesturesPluginImpl$createScaleAnimators$zoomAnimator$2(restoreVar, jLog, 1));
            cameraAnchorAnimator.addListener(new GesturesPluginImpl$createScaleAnimators$$inlined$doOnEnd$1(gesturesPluginImpl, i));
            ValueAnimator[] valueAnimatorArr = {cameraBearingAnimatorCreateBearingAnimator$default, cameraAnchorAnimator};
            gesturesPluginImpl.rotateAnimators = valueAnimatorArr;
            gesturesPluginImpl.scheduleAnimators(valueAnimatorArr);
        }
    }

    public RotateGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
