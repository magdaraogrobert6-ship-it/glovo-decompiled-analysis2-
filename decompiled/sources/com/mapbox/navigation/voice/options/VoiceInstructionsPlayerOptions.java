package com.mapbox.navigation.voice.options;

import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class VoiceInstructionsPlayerOptions {
    public final String toString() {
        return "VoiceInstructionsPlayerOptions(focusGain=3, streamType=3, ttsStreamType=3, usage=12, contentType=2, useLegacyApi=false, checkIsLanguageAvailable=true, abandonFocusDelay=0)";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VoiceInstructionsPlayerOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(88758983, 31, false), 31, true);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class Builder {
        static {
            SQLite.read(1, 2, 3, 4);
        }
    }
}
