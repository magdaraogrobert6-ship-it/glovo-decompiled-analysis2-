package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class SidewaysShoveGestureDetector extends ProgressiveGesture {
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
        hashSet.add(14);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final boolean analyzeMovement() {
        MotionEvent motionEvent = this.previousEvent;
        ArrayList arrayList = this.pointerIdList;
        float x = motionEvent.getX(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.previousEvent;
        float x2 = (motionEvent2.getX(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x) / 2.0f;
        MotionEvent motionEvent3 = this.currentEvent;
        float x3 = motionEvent3.getX(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.currentEvent;
        float x4 = ((motionEvent4.getX(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x3) / 2.0f) - x2;
        this.deltaPixelsSinceStart += x4;
        if (this.isInProgress && x4 != 0.0f) {
            m1$$ExternalSyntheticOutline0.m(this.listener);
            throw null;
        }
        if (!canExecute(14)) {
            return false;
        }
        m1$$ExternalSyntheticOutline0.m(this.listener);
        throw null;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public final boolean canExecute(int i) {
        return Math.abs(this.deltaPixelsSinceStart) >= this.pixelDeltaThreshold && super.canExecute(14);
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public final void gestureStopped() {
        super.gestureStopped();
        m1$$ExternalSyntheticOutline0.m(this.listener);
        throw null;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public final boolean isSloppyGesture() {
        if (!super.isSloppyGesture()) {
            ArrayList arrayList = this.pointerIdList;
            MultiFingerDistancesObject multiFingerDistancesObject = (MultiFingerDistancesObject) this.pointersDistanceMap.get(new PointerDistancePair((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            if (Math.abs(Math.toDegrees(Math.abs(Math.atan2(multiFingerDistancesObject.getCurrFingersDiffY(), multiFingerDistancesObject.getCurrFingersDiffX()))) - 90.0d) <= this.maxShoveAngle) {
                return false;
            }
        }
        return true;
    }

    public SidewaysShoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
