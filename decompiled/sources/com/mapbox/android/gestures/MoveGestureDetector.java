package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.delegates.MapInteractionDelegate;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import java.util.HashMap;
import java.util.HashSet;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MoveGestureDetector extends ProgressiveGesture {
    public static final HashSet handledTypes;
    public final HashMap moveDistancesObjectMap;
    public PointF previousFocalPoint;
    public boolean resetFocal;

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final int getRequiredPointersCount() {
        return 1;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final HashSet provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final void reset() {
    }

    public final void resetMoveDistancesExcept(MotionEvent motionEvent, int i) {
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (pointerId != i) {
                HashMap map = this.moveDistancesObjectMap;
                if (map.containsKey(Integer.valueOf(pointerId))) {
                    map.put(Integer.valueOf(pointerId), new MoveDistancesObject(motionEvent.getX(i2), motionEvent.getY(i2)));
                }
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(13);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final boolean analyzeMovement() {
        for (Integer num : this.pointerIdList) {
            int iIntValue = num.intValue();
            MoveDistancesObject moveDistancesObject = (MoveDistancesObject) this.moveDistancesObjectMap.get(num);
            MotionEvent motionEvent = this.currentEvent;
            float x = motionEvent.getX(motionEvent.findPointerIndex(iIntValue));
            MotionEvent motionEvent2 = this.currentEvent;
            moveDistancesObject.addNewPosition(x, motionEvent2.getY(motionEvent2.findPointerIndex(iIntValue)));
        }
        if (this.isInProgress) {
            PointF pointF = this.focalPoint;
            PointF pointF2 = this.previousFocalPoint;
            float f = pointF2.x;
            float f2 = pointF.x;
            float f3 = pointF2.y;
            float f4 = pointF.y;
            this.previousFocalPoint = pointF;
            if (!this.resetFocal) {
                ((GesturesPluginImpl.MoveGestureListener) this.listener).onMove(this, f - f2, f3 - f4);
                return false;
            }
            this.resetFocal = false;
            ((GesturesPluginImpl.MoveGestureListener) this.listener).onMove(this, 0.0f, 0.0f);
            return false;
        }
        if (canExecute(13)) {
            GesturesPluginImpl.MoveGestureListener moveGestureListener = (GesturesPluginImpl.MoveGestureListener) this.listener;
            moveGestureListener.getClass();
            MoveGestureDetector moveGestureDetector = moveGestureListener.detector;
            if (moveGestureDetector == null) {
                moveGestureListener.detector = this;
            } else {
                if (moveGestureDetector == null) {
                    removeNodeAtDepth.serializer("detector");
                    throw null;
                }
                if (moveGestureDetector != this) {
                    moveGestureListener.detector = this;
                }
            }
            GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
            if (gesturesPluginImpl.internalSettings.scrollEnabled) {
                MapInteractionDelegate mapInteractionDelegate$plugin_gestures_release = gesturesPluginImpl.getMapInteractionDelegate$plugin_gestures_release();
                PlatformEventType platformEventType = PlatformEventType.DRAG_BEGIN;
                PointF pointF3 = this.focalPoint;
                mapInteractionDelegate$plugin_gestures_release.dispatch(new PlatformEventInfo(platformEventType, new ScreenCoordinate(pointF3.x, pointF3.y)));
                gestureStarted();
                this.previousFocalPoint = this.focalPoint;
                this.resetFocal = false;
                return true;
            }
        }
        return false;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public final boolean canExecute(int i) {
        if (!super.canExecute(13)) {
            return false;
        }
        this.pointerIdList.size();
        for (MoveDistancesObject moveDistancesObject : this.moveDistancesObjectMap.values()) {
            if (Math.abs(moveDistancesObject.getDistanceXSinceStart()) >= 0.0f || Math.abs(moveDistancesObject.getDistanceYSinceStart()) >= 0.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final void gestureStopped() {
        super.gestureStopped();
        GesturesPluginImpl.MoveGestureListener moveGestureListener = (GesturesPluginImpl.MoveGestureListener) this.listener;
        moveGestureListener.getClass();
        MapInteractionDelegate mapInteractionDelegate$plugin_gestures_release = GesturesPluginImpl.this.getMapInteractionDelegate$plugin_gestures_release();
        PlatformEventType platformEventType = PlatformEventType.DRAG_END;
        PointF pointF = this.focalPoint;
        mapInteractionDelegate$plugin_gestures_release.dispatch(new PlatformEventInfo(platformEventType, new ScreenCoordinate(pointF.x, pointF.y)));
    }

    public MoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.moveDistancesObjectMap = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // com.mapbox.android.gestures.ProgressiveGesture, com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public final boolean analyzeEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HashMap map = this.moveDistancesObjectMap;
        if (actionMasked == 0) {
            this.resetFocal = true;
            float x = motionEvent.getX(motionEvent.getActionIndex());
            float y = motionEvent.getY(motionEvent.getActionIndex());
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            map.put(Integer.valueOf(pointerId), new MoveDistancesObject(x, y));
            resetMoveDistancesExcept(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
        } else if (actionMasked == 1 || actionMasked == 3) {
            map.clear();
        } else if (actionMasked == 5) {
            this.resetFocal = true;
            float x2 = motionEvent.getX(motionEvent.getActionIndex());
            float y2 = motionEvent.getY(motionEvent.getActionIndex());
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            map.put(Integer.valueOf(pointerId2), new MoveDistancesObject(x2, y2));
            resetMoveDistancesExcept(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
        } else if (actionMasked == 6) {
            this.resetFocal = true;
            map.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            resetMoveDistancesExcept(motionEvent, -1);
        }
        return super.analyzeEvent(motionEvent);
    }
}
