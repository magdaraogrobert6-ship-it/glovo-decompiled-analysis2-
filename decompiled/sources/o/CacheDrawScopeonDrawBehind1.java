package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDrawScopeonDrawBehind1 {
    public final Object RemoteActionCompatParcelizer;
    public final int read;
    public final onBuildCache write;

    public final int hashCode() {
        return this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.read, this.RemoteActionCompatParcelizer.hashCode() * 31, 31);
    }

    public CacheDrawScopeonDrawBehind1(Object obj, int i, onBuildCache onbuildcache) {
        this.RemoteActionCompatParcelizer = obj;
        this.read = i;
        this.write = onbuildcache;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheDrawScopeonDrawBehind1)) {
            return false;
        }
        CacheDrawScopeonDrawBehind1 cacheDrawScopeonDrawBehind1 = (CacheDrawScopeonDrawBehind1) obj;
        return this.RemoteActionCompatParcelizer.equals(cacheDrawScopeonDrawBehind1.RemoteActionCompatParcelizer) && this.read == cacheDrawScopeonDrawBehind1.read && this.write.equals(cacheDrawScopeonDrawBehind1.write);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.RemoteActionCompatParcelizer + ", index=" + this.read + ", reference=" + this.write + ')';
    }
}
