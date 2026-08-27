package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessalljd {
    public final boolean RemoteActionCompatParcelizer;
    public final accessfoldInjd read;
    public final accessfoldInjd serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + ((this.read.hashCode() + (iHashCode * 31)) * 31);
    }

    public accessalljd(accessfoldInjd accessfoldinjd, accessfoldInjd accessfoldinjd2, boolean z) {
        this.serializer = accessfoldinjd;
        this.read = accessfoldinjd2;
        this.RemoteActionCompatParcelizer = z;
    }

    public static accessalljd RemoteActionCompatParcelizer(accessalljd accessalljdVar, accessfoldInjd accessfoldinjd, accessfoldInjd accessfoldinjd2, boolean z, int i) {
        if ((i & 1) != 0) {
            accessfoldinjd = accessalljdVar.serializer;
        }
        if ((i & 2) != 0) {
            accessfoldinjd2 = accessalljdVar.read;
        }
        accessalljdVar.getClass();
        return new accessalljd(accessfoldinjd, accessfoldinjd2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessalljd)) {
            return false;
        }
        accessalljd accessalljdVar = (accessalljd) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, accessalljdVar.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, accessalljdVar.read}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == accessalljdVar.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.serializer);
        sb.append(", end=");
        sb.append(this.read);
        sb.append(", handlesCrossed=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
