package com.mapbox.navigation.core.internal.congestions.model;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.createNodeAt;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedAnalysisResult$SkippedAnalysis extends createNodeAt {
    public final String message;

    public final int hashCode() {
        return this.message.hashCode();
    }

    public SpeedAnalysisResult$SkippedAnalysis(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpeedAnalysisResult$SkippedAnalysis) && this.message.equals(((SpeedAnalysisResult$SkippedAnalysis) obj).message);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("SkippedAnalysis(message="), this.message, ')');
    }
}
