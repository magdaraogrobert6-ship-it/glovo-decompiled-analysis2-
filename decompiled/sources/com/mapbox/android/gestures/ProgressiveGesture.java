package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProgressiveGesture extends MultiFingerGesture {
    public final Set handledTypes;
    public boolean interrupted;
    public boolean isInProgress;
    public VelocityTracker velocityTracker;
    public float velocityX;
    public float velocityY;

    public final void gestureStarted() {
        this.isInProgress = true;
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    public void gestureStopped() {
        this.isInProgress = false;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            this.velocityX = this.velocityTracker.getXVelocity();
            this.velocityY = this.velocityTracker.getYVelocity();
            this.velocityTracker.recycle();
            this.velocityTracker = null;
        }
        reset();
    }

    public abstract HashSet provideHandledTypes();

    public ProgressiveGesture(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.handledTypes = provideHandledTypes();
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3) {
            reset();
        }
        if (this.interrupted) {
            this.interrupted = false;
            reset();
            gestureStopped();
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(this.currentEvent);
        }
        boolean zAnalyzeEvent = super.analyzeEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 6) {
            if (this.pointerIdList.size() < getRequiredPointersCount() && this.isInProgress) {
                gestureStopped();
                return true;
            }
        } else if (actionMasked == 3 && this.isInProgress) {
            gestureStopped();
            return true;
        }
        return zAnalyzeEvent;
    }
}
