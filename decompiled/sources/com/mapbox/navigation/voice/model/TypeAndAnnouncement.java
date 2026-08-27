package com.mapbox.navigation.voice.model;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAndAnnouncement {
    public final String announcement;
    public final String type;

    public final int hashCode() {
        return this.announcement.hashCode() + (this.type.hashCode() * 31);
    }

    public TypeAndAnnouncement(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.announcement = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeAndAnnouncement)) {
            return false;
        }
        TypeAndAnnouncement typeAndAnnouncement = (TypeAndAnnouncement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, typeAndAnnouncement.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.announcement, typeAndAnnouncement.announcement}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAndAnnouncement(type=");
        sb.append(this.type);
        sb.append(", announcement=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.announcement, ')');
    }
}
