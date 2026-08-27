package com.mapbox.android.gestures;

/* JADX INFO: loaded from: classes2.dex */
public final class MoveDistancesObject {
    public float distanceXSinceStart;
    public float distanceYSinceStart;
    public final float initialX;
    public final float initialY;

    public final float getDistanceXSinceStart() {
        return this.distanceXSinceStart;
    }

    public final float getDistanceYSinceStart() {
        return this.distanceYSinceStart;
    }

    public MoveDistancesObject(float f, float f2) {
        this.initialX = f;
        this.initialY = f2;
    }

    public final void addNewPosition(float f, float f2) {
        this.distanceXSinceStart = this.initialX - f;
        this.distanceYSinceStart = this.initialY - f2;
    }
}
