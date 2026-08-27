package com.mapbox.navigation.voice.model;

import java.io.File;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeechAnnouncement {
    public final String announcement;
    public final File file;
    public final String ssmlAnnouncement;

    public final int hashCode() {
        int iHashCode = this.announcement.hashCode();
        String str = this.ssmlAnnouncement;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        File file = this.file;
        return (((iHashCode * 31) + iHashCode2) * 31) + (file != null ? file.hashCode() : 0);
    }

    public SpeechAnnouncement(File file, String str, String str2) {
        this.announcement = str;
        this.ssmlAnnouncement = str2;
        this.file = file;
    }

    public final String toString() {
        return "SpeechAnnouncement(announcement='" + this.announcement + "', ssmlAnnouncement='" + this.ssmlAnnouncement + "', file=" + this.file + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SpeechAnnouncement.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SpeechAnnouncement speechAnnouncement = (SpeechAnnouncement) obj;
        if (!this.announcement.equals(speechAnnouncement.announcement)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ssmlAnnouncement, speechAnnouncement.ssmlAnnouncement}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.file, speechAnnouncement.file}, getCieXyz.write())).booleanValue();
    }
}
