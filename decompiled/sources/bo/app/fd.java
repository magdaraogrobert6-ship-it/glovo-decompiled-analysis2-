package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class fd {
    public final gd a;
    public final String b;

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePath(pathType=" + this.a + ", remoteUrl=" + this.b + ")";
    }

    public fd(gd gdVar, String str) {
        gdVar.getClass();
        str.getClass();
        this.a = gdVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        if (this.a != fdVar.a) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, fdVar.b}, getCieXyz.write())).booleanValue();
    }
}
