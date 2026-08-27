package com.sentiance.sdk;

import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface UserLinker {
    public static final UserLinker NO_OP = new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(18);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(String str) {
        return false;
    }

    boolean link(String str);
}
