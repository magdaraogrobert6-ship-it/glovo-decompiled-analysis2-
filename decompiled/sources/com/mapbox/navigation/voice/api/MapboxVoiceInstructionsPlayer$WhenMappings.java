package com.mapbox.navigation.voice.api;

import com.mapbox.navigation.voice.model.AudioFocusOwner;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class MapboxVoiceInstructionsPlayer$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AudioFocusOwner.values().length];
        try {
            iArr[AudioFocusOwner.MediaPlayer.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioFocusOwner.TextToSpeech.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
