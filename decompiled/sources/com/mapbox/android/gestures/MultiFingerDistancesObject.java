package com.mapbox.android.gestures;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiFingerDistancesObject {
    public final float currFingersDiffX;
    public final float currFingersDiffXY;
    public final float currFingersDiffY;
    public final float prevFingersDiffX;
    public final float prevFingersDiffY;

    public final float getCurrFingersDiffX() {
        return this.currFingersDiffX;
    }

    public final float getCurrFingersDiffXY() {
        return this.currFingersDiffXY;
    }

    public final float getCurrFingersDiffY() {
        return this.currFingersDiffY;
    }

    public final float getPrevFingersDiffX() {
        return this.prevFingersDiffX;
    }

    public final float getPrevFingersDiffY() {
        return this.prevFingersDiffY;
    }

    public MultiFingerDistancesObject(float f, float f2, float f3, float f4) {
        this.prevFingersDiffX = f;
        this.prevFingersDiffY = f2;
        this.currFingersDiffX = f3;
        this.currFingersDiffY = f4;
        Math.sqrt((f2 * f2) + (f * f));
        this.currFingersDiffXY = (float) Math.sqrt((f4 * f4) + (f3 * f3));
    }
}
