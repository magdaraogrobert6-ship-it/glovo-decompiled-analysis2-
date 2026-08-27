package com.mapbox.navigation.voice.model;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeechError {
    public final SpeechAnnouncement fallback;

    public SpeechError(String str, SpeechAnnouncement speechAnnouncement) {
        this.fallback = speechAnnouncement;
    }
}
