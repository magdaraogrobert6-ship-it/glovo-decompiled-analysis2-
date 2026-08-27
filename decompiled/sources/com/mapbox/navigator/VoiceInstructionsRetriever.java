package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public interface VoiceInstructionsRetriever {
    void getRelevantVoiceInstructions(VoiceInstructionsCallback voiceInstructionsCallback);

    boolean isInstructionAvailable();

    void subscribe(VoiceInstructionsAvailabilityObserver voiceInstructionsAvailabilityObserver);

    void unsubscribe(VoiceInstructionsAvailabilityObserver voiceInstructionsAvailabilityObserver);
}
