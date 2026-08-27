package com.sentiance.sdk.semantictime.api;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public enum SemanticTime {
    UNKNOWN("Unknown"),
    MORNING("Morning"),
    LATE_MORNING("LateMorning"),
    LUNCH("Lunch"),
    AFTERNOON("Afternoon"),
    EARLY_EVENING("EarlyEvening"),
    EVENING("Evening"),
    NIGHT("Night");

    String value;

    public String asString() {
        return this.value;
    }

    SemanticTime(String str) {
        this.value = str;
    }
}
