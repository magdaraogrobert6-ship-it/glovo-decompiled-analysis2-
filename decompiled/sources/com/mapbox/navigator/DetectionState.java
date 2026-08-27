package com.mapbox.navigator;

import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public final class DetectionState implements Serializable {
    private final boolean brakeOn;
    private final boolean highlight;
    private final boolean leftBlinkerOn;
    private final boolean rightBlinkerOn;
    private final boolean warning;

    public static final class Builder {
        private boolean brakeOn;
        private boolean highlight;
        private boolean leftBlinkerOn;
        private boolean rightBlinkerOn;
        private boolean warning;

        public final boolean getBrakeOn() {
            return this.brakeOn;
        }

        public final boolean getHighlight() {
            return this.highlight;
        }

        public final boolean getLeftBlinkerOn() {
            return this.leftBlinkerOn;
        }

        public final boolean getRightBlinkerOn() {
            return this.rightBlinkerOn;
        }

        public final boolean getWarning() {
            return this.warning;
        }

        /* JADX INFO: renamed from: setBrakeOn, reason: collision with other method in class */
        public final /* synthetic */ void m4804setBrakeOn(boolean z) {
            this.brakeOn = z;
        }

        /* JADX INFO: renamed from: setHighlight, reason: collision with other method in class */
        public final /* synthetic */ void m4805setHighlight(boolean z) {
            this.highlight = z;
        }

        /* JADX INFO: renamed from: setLeftBlinkerOn, reason: collision with other method in class */
        public final /* synthetic */ void m4806setLeftBlinkerOn(boolean z) {
            this.leftBlinkerOn = z;
        }

        /* JADX INFO: renamed from: setRightBlinkerOn, reason: collision with other method in class */
        public final /* synthetic */ void m4807setRightBlinkerOn(boolean z) {
            this.rightBlinkerOn = z;
        }

        /* JADX INFO: renamed from: setWarning, reason: collision with other method in class */
        public final /* synthetic */ void m4808setWarning(boolean z) {
            this.warning = z;
        }

        public final DetectionState build() {
            return new DetectionState(this.leftBlinkerOn, this.rightBlinkerOn, this.brakeOn, this.warning, this.highlight, null);
        }

        public final Builder setBrakeOn(boolean z) {
            this.brakeOn = z;
            return this;
        }

        public final Builder setHighlight(boolean z) {
            this.highlight = z;
            return this;
        }

        public final Builder setLeftBlinkerOn(boolean z) {
            this.leftBlinkerOn = z;
            return this;
        }

        public final Builder setRightBlinkerOn(boolean z) {
            this.rightBlinkerOn = z;
            return this;
        }

        public final Builder setWarning(boolean z) {
            this.warning = z;
            return this;
        }
    }

    public final boolean getBrakeOn() {
        return this.brakeOn;
    }

    public final boolean getHighlight() {
        return this.highlight;
    }

    public final boolean getLeftBlinkerOn() {
        return this.leftBlinkerOn;
    }

    public final boolean getRightBlinkerOn() {
        return this.rightBlinkerOn;
    }

    public final boolean getWarning() {
        return this.warning;
    }

    public final Builder toBuilder() {
        return new Builder().setLeftBlinkerOn(this.leftBlinkerOn).setRightBlinkerOn(this.rightBlinkerOn).setBrakeOn(this.brakeOn).setWarning(this.warning).setHighlight(this.highlight);
    }

    private DetectionState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.leftBlinkerOn = z;
        this.rightBlinkerOn = z2;
        this.brakeOn = z3;
        this.warning = z4;
        this.highlight = z5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DetectionState)) {
            return false;
        }
        DetectionState detectionState = (DetectionState) obj;
        return this.leftBlinkerOn == detectionState.leftBlinkerOn && this.rightBlinkerOn == detectionState.rightBlinkerOn && this.brakeOn == detectionState.brakeOn && this.warning == detectionState.warning && this.highlight == detectionState.highlight;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DetectionState(leftBlinkerOn=");
        sb.append(this.leftBlinkerOn);
        sb.append(", rightBlinkerOn=");
        sb.append(this.rightBlinkerOn);
        sb.append(", brakeOn=");
        sb.append(this.brakeOn);
        sb.append(", warning=");
        sb.append(this.warning);
        sb.append(", highlight=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.highlight, ')');
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.leftBlinkerOn), Boolean.valueOf(this.rightBlinkerOn), Boolean.valueOf(this.brakeOn), Boolean.valueOf(this.warning), Boolean.valueOf(this.highlight));
    }

    public /* synthetic */ DetectionState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, z5);
    }
}
