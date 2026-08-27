package com.mapbox.navigation.voice.api;

import com.mapbox.navigation.voice.model.SpeechAnnouncement;
import o.getCieXyz;
import o.mf;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayCallback {
    public final SpeechAnnouncement announcement;
    public final mf consumer;

    public final int hashCode() {
        return this.consumer.hashCode() + (this.announcement.hashCode() * 31);
    }

    public PlayCallback(SpeechAnnouncement speechAnnouncement, mf mfVar) {
        speechAnnouncement.getClass();
        this.announcement = speechAnnouncement;
        this.consumer = mfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayCallback) {
            PlayCallback playCallback = (PlayCallback) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.announcement, playCallback.announcement}, getCieXyz.write())).booleanValue() && this.consumer == playCallback.consumer;
        }
        return false;
    }

    public final String toString() {
        return "PlayCallback(announcement=" + this.announcement + ", consumer=" + this.consumer + ')';
    }
}
