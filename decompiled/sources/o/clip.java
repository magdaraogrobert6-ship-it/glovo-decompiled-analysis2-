package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class clip {
    public final int RemoteActionCompatParcelizer;
    public final onBuildCache read;
    public final Object write;

    public final int hashCode() {
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.write.hashCode() * 31, 31);
    }

    public clip(Object obj, int i, onBuildCache onbuildcache) {
        this.write = obj;
        this.RemoteActionCompatParcelizer = i;
        this.read = onbuildcache;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clip)) {
            return false;
        }
        clip clipVar = (clip) obj;
        return this.write.equals(clipVar.write) && this.RemoteActionCompatParcelizer == clipVar.RemoteActionCompatParcelizer && this.read.equals(clipVar.read);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.write + ", index=" + this.RemoteActionCompatParcelizer + ", reference=" + this.read + ')';
    }
}
