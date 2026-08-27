package com.sentiance.sdk;

import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface UserLinkerAsync {
    public static final UserLinkerAsync NO_OP = new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(19);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(String str, UserLinkerCallback userLinkerCallback) {
    }

    void link(String str, UserLinkerCallback userLinkerCallback);
}
