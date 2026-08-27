package com.mapbox.android.gestures;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzbv;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import com.mapbox.maps.plugin.gestures.GestureState$Type;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.plugin.gestures.GesturesUtils$getGesturesManager$1;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import com.mapbox.maps.util.CoreGesturesHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.TuplesKt;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardScaleGestureDetector extends ProgressiveGesture {
    public static final HashSet handledTypes;
    public float currentSpan;
    public float currentSpanX;
    public float currentSpanY;
    public final GestureDetector innerGestureDetector;
    public boolean isScalingOut;
    public float previousSpan;
    public boolean quickScale;
    public PointF quickScaleFocalPoint;
    public float scaleFactor;
    public float spanDeltaSinceStart;
    public float spanSinceStartThreshold;
    public float startSpan;

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final HashSet provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final void reset() {
        this.startSpan = 0.0f;
        this.spanDeltaSinceStart = 0.0f;
        this.currentSpan = 0.0f;
        this.previousSpan = 0.0f;
        this.scaleFactor = 1.0f;
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0365  */
    /* JADX WARN: Code duplicated, block: B:176:0x037e  */
    /* JADX WARN: Code duplicated, block: B:177:0x038a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0392  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final boolean analyzeMovement() {
        float f;
        float f2;
        MapboxMap mapboxMap;
        Iterator it;
        boolean z = this.isInProgress;
        ArrayList arrayList = this.pointerIdList;
        boolean z2 = true;
        if (z && this.quickScale && arrayList.size() > 1) {
            gestureStopped();
            return false;
        }
        PointF pointF = this.quickScale ? this.quickScaleFocalPoint : this.focalPoint;
        this.currentSpanX = 0.0f;
        this.currentSpanY = 0.0f;
        int i = 0;
        while (true) {
            int size = arrayList.size();
            f = this.currentSpanX;
            if (i >= size) {
                break;
            }
            this.currentSpanX = Math.abs(this.currentEvent.getX(i) - pointF.x) + f;
            this.currentSpanY = Math.abs(this.currentEvent.getY(i) - pointF.y) + this.currentSpanY;
            i++;
        }
        float f3 = f * 2.0f;
        this.currentSpanX = f3;
        float f4 = this.currentSpanY * 2.0f;
        this.currentSpanY = f4;
        if (this.quickScale) {
            this.currentSpan = f4;
        } else {
            this.currentSpan = (float) Math.hypot(f3, f4);
        }
        if (this.startSpan == 0.0f) {
            this.startSpan = this.currentSpan;
        }
        this.spanDeltaSinceStart = Math.abs(this.startSpan - this.currentSpan);
        if (this.quickScale) {
            boolean z3 = (this.currentEvent.getY() < this.quickScaleFocalPoint.y && this.currentSpan < this.previousSpan) || (this.currentEvent.getY() > this.quickScaleFocalPoint.y && this.currentSpan > this.previousSpan);
            float fAbs = Math.abs(1.0f - (this.currentSpan / this.previousSpan)) * 0.5f;
            if (this.previousSpan <= 0.0f) {
                f2 = 1.0f;
            } else {
                f2 = z3 ? fAbs + 1.0f : 1.0f - fAbs;
            }
        } else {
            float f5 = this.previousSpan;
            if (f5 > 0.0f) {
                f2 = this.currentSpan / f5;
            } else {
                f2 = 1.0f;
            }
        }
        this.scaleFactor = f2;
        this.isScalingOut = f2 < 1.0f;
        if (!this.isInProgress || this.currentSpan <= 0.0f) {
            if (!canExecute(this.quickScale ? 15 : 1) || this.spanDeltaSinceStart < this.spanSinceStartThreshold) {
                z2 = false;
            } else {
                GesturesPluginImpl.ScaleGestureListener scaleGestureListener = (GesturesPluginImpl.ScaleGestureListener) this.listener;
                scaleGestureListener.getClass();
                GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
                boolean z4 = arrayList.size() == 1;
                gesturesPluginImpl.quickZoom = z4;
                GesturesSettings gesturesSettings = gesturesPluginImpl.internalSettings;
                if (!z4) {
                    if (gesturesSettings.pinchToZoomEnabled) {
                        float f6 = this.previousSpan;
                        if (f6 > 0.0f) {
                            float f7 = this.currentSpan;
                            double eventTime = this.currentEvent.getEventTime();
                            double eventTime2 = this.previousEvent.getEventTime();
                            if (eventTime != eventTime2) {
                                double dAbs = ((double) Math.abs(f7 - f6)) / (eventTime - eventTime2);
                                if (dAbs >= gesturesPluginImpl.minimumGestureSpeed) {
                                    AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
                                    if (androidGesturesManager == null) {
                                        removeNodeAtDepth.serializer("gesturesManager");
                                        throw null;
                                    }
                                    RotateGestureDetector rotateGestureDetector = androidGesturesManager.rotateGestureDetector;
                                    if (!rotateGestureDetector.isInProgress) {
                                        if (Math.abs(rotateGestureDetector.deltaSinceLast) <= 0.4d || dAbs >= gesturesPluginImpl.minimumAngledGestureSpeed) {
                                            if (!gesturesPluginImpl.internalSettings.simultaneousRotateAndPinchToZoomEnabled) {
                                                zzbv zzbvVar = gesturesPluginImpl.gestureState;
                                                if (zzbvVar == null) {
                                                    removeNodeAtDepth.serializer("gestureState");
                                                    throw null;
                                                }
                                                zzbvVar.saveAndDisable(GestureState$Type.Scale);
                                            }
                                        }
                                    }
                                    gesturesPluginImpl.screenHeight = gesturesPluginImpl.context.getResources().getDisplayMetrics().heightPixels;
                                    mapboxMap = gesturesPluginImpl.mapCameraManagerDelegate;
                                    if (mapboxMap != null) {
                                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                                        throw null;
                                    }
                                    gesturesPluginImpl.startZoom = mapboxMap.getCameraState().getZoom();
                                    gesturesPluginImpl.cancelTransitionsIfRequired();
                                    it = gesturesPluginImpl.onScaleListeners.iterator();
                                    if (!it.hasNext()) {
                                        m1$$ExternalSyntheticOutline0.m(it.next());
                                        throw null;
                                    }
                                    gesturesPluginImpl.spanSinceLast = Math.abs(this.currentSpan - this.previousSpan);
                                }
                            }
                        }
                    }
                    z2 = false;
                } else if (gesturesSettings.quickZoomEnabled) {
                    zzbv zzbvVar2 = gesturesPluginImpl.gestureState;
                    if (zzbvVar2 == null) {
                        removeNodeAtDepth.serializer("gestureState");
                        throw null;
                    }
                    zzbvVar2.saveAndDisable(GestureState$Type.ScaleQuickZoom);
                    gesturesPluginImpl.screenHeight = gesturesPluginImpl.context.getResources().getDisplayMetrics().heightPixels;
                    mapboxMap = gesturesPluginImpl.mapCameraManagerDelegate;
                    if (mapboxMap != null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    gesturesPluginImpl.startZoom = mapboxMap.getCameraState().getZoom();
                    gesturesPluginImpl.cancelTransitionsIfRequired();
                    it = gesturesPluginImpl.onScaleListeners.iterator();
                    if (!it.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it.next());
                        throw null;
                    }
                    gesturesPluginImpl.spanSinceLast = Math.abs(this.currentSpan - this.previousSpan);
                } else {
                    z2 = false;
                }
                if (z2) {
                    gestureStarted();
                }
            }
        } else {
            GesturesPluginImpl.ScaleGestureListener scaleGestureListener2 = (GesturesPluginImpl.ScaleGestureListener) this.listener;
            scaleGestureListener2.getClass();
            GesturesPluginImpl gesturesPluginImpl2 = GesturesPluginImpl.this;
            MapAnimationOptions mapAnimationOptions = GesturesPluginImpl.IMMEDIATE_ANIMATION_OPTIONS;
            ScreenCoordinate screenCoordinate = gesturesPluginImpl2.internalSettings.focalPoint;
            if (screenCoordinate == null) {
                if (gesturesPluginImpl2.quickZoom) {
                    screenCoordinate = gesturesPluginImpl2.doubleTapFocalPoint;
                } else {
                    PointF pointF2 = this.focalPoint;
                    screenCoordinate = new ScreenCoordinate(pointF2.x, pointF2.y);
                }
            }
            CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl2.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            gesturesPluginImpl2.scaleCachedAnchor = ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getAnchor();
            CoreGesturesHandler coreGesturesHandler = gesturesPluginImpl2.coreGesturesHandler;
            if (coreGesturesHandler == null) {
                removeNodeAtDepth.serializer("coreGesturesHandler");
                throw null;
            }
            coreGesturesHandler.notifyCoreGestureStarted();
            if (gesturesPluginImpl2.quickZoom) {
                double dAbs2 = Math.abs(((double) this.currentEvent.getY()) - gesturesPluginImpl2.doubleTapFocalPoint.getY());
                boolean z5 = ((double) this.currentEvent.getY()) < gesturesPluginImpl2.doubleTapFocalPoint.getY();
                double d = (((dAbs2 - 0.0d) / (gesturesPluginImpl2.screenHeight - 0.0d)) * 4.0d) + 0.0d;
                double d2 = gesturesPluginImpl2.startZoom;
                double d3 = z5 ? d2 - d : d2 + d;
                double d4 = gesturesPluginImpl2.internalSettings.zoomAnimationAmount;
                CameraAnimationsPlugin cameraAnimationsPlugin2 = gesturesPluginImpl2.cameraAnimationsPlugin;
                if (cameraAnimationsPlugin2 == null) {
                    removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                    throw null;
                }
                CameraOptions cameraOptionsBuild = new CameraOptions.Builder().zoom(Double.valueOf(d3 * d4)).anchor(screenCoordinate).build();
                cameraOptionsBuild.getClass();
                TuplesKt.easeTo$default(cameraAnimationsPlugin2, cameraOptionsBuild);
            } else {
                double dLog = Math.log(this.scaleFactor) / Math.log(1.5707963267948966d);
                GesturesSettings gesturesSettings2 = gesturesPluginImpl2.internalSettings;
                double d5 = dLog * 0.6499999761581421d * ((double) gesturesSettings2.zoomAnimationAmount);
                boolean z6 = gesturesSettings2.simultaneousRotateAndPinchToZoomEnabled;
                CameraAnimationsPlugin cameraAnimationsPlugin3 = gesturesPluginImpl2.cameraAnimationsPlugin;
                if (z6) {
                    if (cameraAnimationsPlugin3 == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    MapboxMap mapboxMap2 = gesturesPluginImpl2.mapCameraManagerDelegate;
                    if (mapboxMap2 == null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(new Double[]{Double.valueOf(mapboxMap2.getCameraState().getZoom() + d5)}, 1);
                    MapboxMap mapboxMap3 = gesturesPluginImpl2.mapCameraManagerDelegate;
                    if (mapboxMap3 == null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    CameraZoomAnimator cameraZoomAnimator = new CameraZoomAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), Double.valueOf(mapboxMap3.getCameraState().getZoom()), "Maps-Gestures"), GesturesUtils$getGesturesManager$1.INSTANCE$4);
                    if (gesturesPluginImpl2.cameraAnimationsPlugin == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1);
                    CameraAnchorAnimator cameraAnchorAnimator = new CameraAnchorAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), null, "Maps-Gestures"), GesturesUtils$getGesturesManager$1.INSTANCE$3);
                    CameraAnimationsPlugin cameraAnimationsPlugin4 = gesturesPluginImpl2.cameraAnimationsPlugin;
                    if (cameraAnimationsPlugin4 == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    ((CameraAnimationsPluginImpl) cameraAnimationsPlugin4).playAnimatorsTogether(cameraAnchorAnimator, cameraZoomAnimator);
                } else {
                    if (cameraAnimationsPlugin3 == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    CameraOptions.Builder builder = new CameraOptions.Builder();
                    MapboxMap mapboxMap4 = gesturesPluginImpl2.mapCameraManagerDelegate;
                    if (mapboxMap4 == null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    CameraOptions cameraOptionsBuild2 = builder.zoom(Double.valueOf(mapboxMap4.getCameraState().getZoom() + d5)).anchor(screenCoordinate).build();
                    cameraOptionsBuild2.getClass();
                    TuplesKt.easeTo$default(cameraAnimationsPlugin3, cameraOptionsBuild2);
                }
            }
            CameraAnimationsPlugin cameraAnimationsPlugin5 = gesturesPluginImpl2.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin5 == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin5).setAnchor(gesturesPluginImpl2.scaleCachedAnchor);
            Iterator it2 = gesturesPluginImpl2.onScaleListeners.iterator();
            if (it2.hasNext()) {
                m1$$ExternalSyntheticOutline0.m(it2.next());
                throw null;
            }
            gesturesPluginImpl2.spanSinceLast = Math.abs(this.currentSpan - this.previousSpan);
        }
        this.previousSpan = this.currentSpan;
        return z2;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final void gestureStopped() {
        super.gestureStopped();
        GesturesPluginImpl.ScaleGestureListener scaleGestureListener = (GesturesPluginImpl.ScaleGestureListener) this.listener;
        float f = this.velocityX;
        float f2 = this.velocityY;
        scaleGestureListener.getClass();
        GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
        zzbv zzbvVar = gesturesPluginImpl.gestureState;
        if (zzbvVar == null) {
            removeNodeAtDepth.serializer("gestureState");
            throw null;
        }
        zzbvVar.restore(gesturesPluginImpl.quickZoom ? GestureState$Type.ScaleQuickZoom : GestureState$Type.Scale);
        Iterator it = gesturesPluginImpl.onScaleListeners.iterator();
        if (it.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it.next());
            throw null;
        }
        float fAbs = Math.abs(f2) + Math.abs(f);
        if (gesturesPluginImpl.internalSettings.pinchToZoomDecelerationEnabled && fAbs >= gesturesPluginImpl.minimumVelocity && gesturesPluginImpl.spanSinceLast / fAbs >= gesturesPluginImpl.scaleVelocityRatioThreshold) {
            boolean z = this.isScalingOut;
            double d = ((double) fAbs) * 2.5d * 1.0E-4d;
            double d2 = 2.5d > d ? d : 2.5d;
            if (0.0d >= d2) {
                d2 = 0.0d;
            }
            double d3 = z ? -d2 : d2;
            MapboxMap mapboxMap = gesturesPluginImpl.mapCameraManagerDelegate;
            if (mapboxMap == null) {
                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                throw null;
            }
            double zoom = mapboxMap.getCameraState().getZoom();
            ScreenCoordinate screenCoordinate = gesturesPluginImpl.internalSettings.focalPoint;
            if (screenCoordinate == null) {
                if (gesturesPluginImpl.quickZoom) {
                    screenCoordinate = gesturesPluginImpl.doubleTapFocalPoint;
                } else {
                    PointF pointF = this.focalPoint;
                    screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
                }
            }
            ValueAnimator[] valueAnimatorArrCreateScaleAnimators = gesturesPluginImpl.createScaleAnimators(zoom, d3, screenCoordinate, (long) ((Math.log((1.0d / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(d3)) + 2.0d) * 150.0d));
            gesturesPluginImpl.scaleAnimators = valueAnimatorArrCreateScaleAnimators;
            gesturesPluginImpl.scheduleAnimators(valueAnimatorArrCreateScaleAnimators);
        }
        this.quickScale = false;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture, com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public final boolean analyzeEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.quickScale) {
            if (actionMasked == 5 || actionMasked == 3) {
                boolean z = this.isInProgress;
                if (!z) {
                    this.quickScale = false;
                } else if (z) {
                    this.interrupted = true;
                }
            } else if (!this.isInProgress && actionMasked == 1) {
                this.quickScale = false;
            }
        }
        return this.innerGestureDetector.onTouchEvent(motionEvent) | super.analyzeEvent(motionEvent);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final int getRequiredPointersCount() {
        return (!this.isInProgress || this.quickScale) ? 1 : 2;
    }

    public StandardScaleGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.innerGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.mapbox.android.gestures.StandardScaleGestureDetector.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    StandardScaleGestureDetector standardScaleGestureDetector = StandardScaleGestureDetector.this;
                    standardScaleGestureDetector.quickScale = true;
                    standardScaleGestureDetector.quickScaleFocalPoint = new PointF(motionEvent.getX(), motionEvent.getY());
                }
                return true;
            }
        });
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final boolean isSloppyGesture() {
        if (super.isSloppyGesture()) {
            return true;
        }
        return !this.quickScale && this.pointerIdList.size() < 2;
    }
}
