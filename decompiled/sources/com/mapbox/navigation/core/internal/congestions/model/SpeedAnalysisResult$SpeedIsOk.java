package com.mapbox.navigation.core.internal.congestions.model;

import o.createNodeAt;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedAnalysisResult$SpeedIsOk extends createNodeAt {
    public final float expectedSpeed;
    public final float speed;

    public final int hashCode() {
        return Float.hashCode(this.expectedSpeed) + (Float.hashCode(this.speed) * 31);
    }

    public SpeedAnalysisResult$SpeedIsOk(float f, float f2) {
        this.speed = f;
        this.expectedSpeed = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedAnalysisResult$SpeedIsOk)) {
            return false;
        }
        SpeedAnalysisResult$SpeedIsOk speedAnalysisResult$SpeedIsOk = (SpeedAnalysisResult$SpeedIsOk) obj;
        return MetersPerSecond.m4783equalsimpl0(this.speed, speedAnalysisResult$SpeedIsOk.speed) && MetersPerSecond.m4783equalsimpl0(this.expectedSpeed, speedAnalysisResult$SpeedIsOk.expectedSpeed);
    }

    public final String toString() {
        return "SpeedIsOk(speed=" + ((Object) MetersPerSecond.m4784toStringimpl(this.speed)) + ", expectedSpeed=" + ((Object) MetersPerSecond.m4784toStringimpl(this.expectedSpeed)) + ')';
    }
}
