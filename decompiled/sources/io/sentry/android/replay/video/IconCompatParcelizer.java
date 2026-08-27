package io.sentry.android.replay.video;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer {
    public final String IconCompatParcelizer = "video/avc";
    public final int MediaBrowserCompatMediaItem;
    public final File RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.read, af$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer.hashCode() * 31, 31), 31), 31), 31);
    }

    public IconCompatParcelizer(File file, int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer = file;
        this.MediaBrowserCompatMediaItem = i;
        this.write = i2;
        this.serializer = i3;
        this.read = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconCompatParcelizer)) {
            return false;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
        return this.RemoteActionCompatParcelizer.equals(iconCompatParcelizer.RemoteActionCompatParcelizer) && this.MediaBrowserCompatMediaItem == iconCompatParcelizer.MediaBrowserCompatMediaItem && this.write == iconCompatParcelizer.write && this.serializer == iconCompatParcelizer.serializer && this.read == iconCompatParcelizer.read && this.IconCompatParcelizer.equals(iconCompatParcelizer.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MuxerConfig(file=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", recordingWidth=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", recordingHeight=");
        sb.append(this.write);
        sb.append(", frameRate=");
        sb.append(this.serializer);
        sb.append(", bitRate=");
        sb.append(this.read);
        sb.append(", mimeType=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ')');
    }
}
