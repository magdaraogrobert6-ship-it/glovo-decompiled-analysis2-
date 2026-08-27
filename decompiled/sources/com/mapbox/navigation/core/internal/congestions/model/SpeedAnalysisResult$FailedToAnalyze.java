package com.mapbox.navigation.core.internal.congestions.model;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.createNodeAt;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedAnalysisResult$FailedToAnalyze extends createNodeAt {
    public final String message;

    public final int hashCode() {
        return this.message.hashCode();
    }

    public SpeedAnalysisResult$FailedToAnalyze(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpeedAnalysisResult$FailedToAnalyze) && this.message.equals(((SpeedAnalysisResult$FailedToAnalyze) obj).message);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("FailedToAnalyze(message="), this.message, ')');
    }
}
