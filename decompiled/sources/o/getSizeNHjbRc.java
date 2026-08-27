package o;

/* JADX INFO: loaded from: classes.dex */
public final class getSizeNHjbRc {
    public final int IconCompatParcelizer;
    public final Integer write;

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.IconCompatParcelizer);
        Integer num = this.write;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public getSizeNHjbRc(Integer num, int i) {
        this.IconCompatParcelizer = i;
        this.write = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSizeNHjbRc)) {
            return false;
        }
        getSizeNHjbRc getsizenhjbrc = (getSizeNHjbRc) obj;
        if (this.IconCompatParcelizer != getsizenhjbrc.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getsizenhjbrc.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.IconCompatParcelizer + ", dataOffset=" + this.write + ')';
    }
}
