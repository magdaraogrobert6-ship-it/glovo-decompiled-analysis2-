package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetDefaultCapcp {
    public Class RemoteActionCompatParcelizer;
    public Class read;
    public Class write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.write.hashCode();
        Class cls = this.RemoteActionCompatParcelizer;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public accessgetDefaultCapcp(Class cls, Class cls2, Class cls3) {
        this.read = cls;
        this.write = cls2;
        this.RemoteActionCompatParcelizer = cls3;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.read + ", second=" + this.write + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || accessgetDefaultCapcp.class != obj.getClass()) {
            return false;
        }
        accessgetDefaultCapcp accessgetdefaultcapcp = (accessgetDefaultCapcp) obj;
        return this.read.equals(accessgetdefaultcapcp.read) && this.write.equals(accessgetdefaultcapcp.write) && Fill.IconCompatParcelizer(this.RemoteActionCompatParcelizer, accessgetdefaultcapcp.RemoteActionCompatParcelizer);
    }

    public accessgetDefaultCapcp() {
    }
}
