package com.mapbox.navigation.voice.api;

import android.media.AudioAttributes;
import com.mapbox.navigation.voice.model.AudioFocusOwner;
import com.mapbox.navigation.voice.options.VoiceInstructionsPlayerOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes {
    public final AudioAttributes.Builder builder;
    public final VoiceInstructionsPlayerOptions options;

    public final int hashCode() {
        return this.builder.hashCode() + (this.options.hashCode() * 31);
    }

    public VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes(VoiceInstructionsPlayerOptions voiceInstructionsPlayerOptions, AudioAttributes.Builder builder) {
        this.options = voiceInstructionsPlayerOptions;
        this.builder = builder;
    }

    public final AudioAttributes audioAttributes$voice_release(AudioFocusOwner audioFocusOwner) {
        audioFocusOwner.getClass();
        AudioAttributes audioAttributesBuild = this.builder.setUsage(12).setContentType(2).build();
        audioAttributesBuild.getClass();
        return audioAttributesBuild;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes)) {
            return false;
        }
        VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes voiceInstructionsPlayerAttributes$OreoAndLaterAttributes = (VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes) obj;
        return this.options.equals(voiceInstructionsPlayerAttributes$OreoAndLaterAttributes.options) && this.builder.equals(voiceInstructionsPlayerAttributes$OreoAndLaterAttributes.builder);
    }

    public final String toString() {
        return "OreoAndLaterAttributes(options=" + this.options + ", builder=" + this.builder + ')';
    }
}
