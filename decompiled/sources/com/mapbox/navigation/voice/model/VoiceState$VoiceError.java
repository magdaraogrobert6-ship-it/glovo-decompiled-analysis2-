package com.mapbox.navigation.voice.model;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.collapsePeerui;

/* JADX INFO: loaded from: classes2.dex */
public final class VoiceState$VoiceError extends collapsePeerui {
    public final String exception;

    public final int hashCode() {
        return this.exception.hashCode();
    }

    public VoiceState$VoiceError(String str) {
        this.exception = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VoiceState$VoiceError) && this.exception.equals(((VoiceState$VoiceError) obj).exception);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("VoiceError(exception="), this.exception, ')');
    }
}
