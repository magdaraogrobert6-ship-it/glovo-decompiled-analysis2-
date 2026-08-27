package io.sentry.android.replay;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.File;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaDescriptionCompat {
    public final long RemoteActionCompatParcelizer;
    public final File read;
    public final String serializer;

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        String str = this.serializer;
        return iM + (str == null ? 0 : str.hashCode());
    }

    public MediaDescriptionCompat(File file, long j, String str) {
        this.read = file;
        this.RemoteActionCompatParcelizer = j;
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaDescriptionCompat)) {
            return false;
        }
        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) obj;
        if (!this.read.equals(mediaDescriptionCompat.read) || this.RemoteActionCompatParcelizer != mediaDescriptionCompat.RemoteActionCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, mediaDescriptionCompat.serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayFrame(screenshot=");
        sb.append(this.read);
        sb.append(", timestamp=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", screen=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, ')');
    }
}
