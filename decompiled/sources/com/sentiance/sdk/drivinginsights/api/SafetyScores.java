package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class SafetyScores {
    private final Float attentionScore;
    private final Float callWhileMovingScore;
    private final Float focusScore;
    private final Float harshAccelerationScore;
    private final Float harshBrakingScore;
    private final Float harshTurningScore;
    private final Float legalScore;
    private final Float overallScore;
    private final Float smoothScore;
    private final Float wrongWayDrivingScore;

    /* JADX INFO: loaded from: classes4.dex */
    @DontObfuscate
    public static class Builder {
        private Float smoothScore = null;
        private Float focusScore = null;
        private Float callWhileMovingScore = null;
        private Float legalScore = null;
        private Float overallScore = null;
        private Float harshBrakingScore = null;
        private Float harshTurningScore = null;
        private Float harshAccelerationScore = null;
        private Float wrongWayDrivingScore = null;
        private Float attentionScore = null;

        public Builder setAttentionScore(Float f) {
            this.attentionScore = f;
            return this;
        }

        public Builder setCallWhileMovingScore(Float f) {
            this.callWhileMovingScore = f;
            return this;
        }

        public Builder setFocusScore(Float f) {
            this.focusScore = f;
            return this;
        }

        public Builder setHarshAccelerationScore(Float f) {
            this.harshAccelerationScore = f;
            return this;
        }

        public Builder setHarshBrakingScore(Float f) {
            this.harshBrakingScore = f;
            return this;
        }

        public Builder setHarshTurningScore(Float f) {
            this.harshTurningScore = f;
            return this;
        }

        public Builder setLegalScore(Float f) {
            this.legalScore = f;
            return this;
        }

        public Builder setOverallScore(Float f) {
            this.overallScore = f;
            return this;
        }

        public Builder setSmoothScore(Float f) {
            this.smoothScore = f;
            return this;
        }

        public Builder setWrongWayDrivingScore(Float f) {
            this.wrongWayDrivingScore = f;
            return this;
        }

        public SafetyScores createSafetyScores() {
            return new SafetyScores(this.smoothScore, this.focusScore, this.callWhileMovingScore, this.legalScore, this.overallScore, this.harshBrakingScore, this.harshTurningScore, this.harshAccelerationScore, this.wrongWayDrivingScore, this.attentionScore);
        }
    }

    public Float getAttentionScore() {
        return this.attentionScore;
    }

    public Float getCallWhileMovingScore() {
        return this.callWhileMovingScore;
    }

    public Float getFocusScore() {
        return this.focusScore;
    }

    public Float getHarshAccelerationScore() {
        return this.harshAccelerationScore;
    }

    public Float getHarshBrakingScore() {
        return this.harshBrakingScore;
    }

    public Float getHarshTurningScore() {
        return this.harshTurningScore;
    }

    public Float getLegalScore() {
        return this.legalScore;
    }

    public Float getOverallScore() {
        return this.overallScore;
    }

    public Float getSmoothScore() {
        return this.smoothScore;
    }

    public Float getWrongWayDrivingScore() {
        return this.wrongWayDrivingScore;
    }

    public int hashCode() {
        return Objects.hash(this.smoothScore, this.focusScore, this.callWhileMovingScore, this.legalScore, this.overallScore, this.harshBrakingScore, this.harshTurningScore, this.harshAccelerationScore, this.wrongWayDrivingScore);
    }

    private SafetyScores(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10) {
        this.smoothScore = f;
        this.focusScore = f2;
        this.callWhileMovingScore = f3;
        this.legalScore = f4;
        this.overallScore = f5;
        this.harshBrakingScore = f6;
        this.harshTurningScore = f7;
        this.harshAccelerationScore = f8;
        this.wrongWayDrivingScore = f9;
        this.attentionScore = f10;
    }

    public String toString() {
        return "SafetyScores{smoothScore=" + this.smoothScore + ", focusScore=" + this.focusScore + ", callWhileMovingScore=" + this.callWhileMovingScore + ", legalScore=" + this.legalScore + ", overallScore=" + this.overallScore + ", harshBrakingScore=" + this.harshBrakingScore + ", harshTurningScore=" + this.harshTurningScore + ", harshAccelerationScore=" + this.harshAccelerationScore + ", wrongWayDrivingScore=" + this.wrongWayDrivingScore + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SafetyScores safetyScores = (SafetyScores) obj;
        return Objects.equals(this.smoothScore, safetyScores.smoothScore) && Objects.equals(this.focusScore, safetyScores.focusScore) && Objects.equals(this.callWhileMovingScore, safetyScores.callWhileMovingScore) && Objects.equals(this.legalScore, safetyScores.legalScore) && Objects.equals(this.overallScore, safetyScores.overallScore) && Objects.equals(this.harshBrakingScore, safetyScores.harshBrakingScore) && Objects.equals(this.harshTurningScore, safetyScores.harshTurningScore) && Objects.equals(this.harshAccelerationScore, safetyScores.harshAccelerationScore) && Objects.equals(this.wrongWayDrivingScore, safetyScores.wrongWayDrivingScore);
    }

    @Deprecated
    public SafetyScores(Float f, Float f2) {
        this(f, f2, null, null, null, null, null, null, null, null);
    }
}
