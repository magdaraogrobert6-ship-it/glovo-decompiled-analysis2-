package io.sentry.android.replay;

import bo.app.af$$ExternalSyntheticOutline0;
import java.io.File;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer {
    public final long IconCompatParcelizer;
    public final File read;
    public final int write;

    public final int hashCode() {
        return Long.hashCode(this.IconCompatParcelizer) + af$$ExternalSyntheticOutline0.m(this.write, this.read.hashCode() * 31, 31);
    }

    public IconCompatParcelizer(File file, int i, long j) {
        this.read = file;
        this.write = i;
        this.IconCompatParcelizer = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconCompatParcelizer)) {
            return false;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
        return this.read.equals(iconCompatParcelizer.read) && this.write == iconCompatParcelizer.write && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneratedVideo(video=");
        sb.append(this.read);
        sb.append(", frameCount=");
        sb.append(this.write);
        sb.append(", duration=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.IconCompatParcelizer, ')');
    }
}
