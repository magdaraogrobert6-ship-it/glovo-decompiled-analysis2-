package o;

/* JADX INFO: loaded from: classes.dex */
public final class createFromBoolean {
    public final Integer RemoteActionCompatParcelizer;
    public final Object read;

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        Object obj = this.read;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + (iHashCode2 * 31);
    }

    public createFromBoolean(Integer num, Object obj) {
        this.RemoteActionCompatParcelizer = num;
        this.read = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createFromBoolean)) {
            return false;
        }
        createFromBoolean createfromboolean = (createFromBoolean) obj;
        if (!this.RemoteActionCompatParcelizer.equals(createfromboolean.RemoteActionCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, createfromboolean.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", right=");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.read, ')');
    }
}
