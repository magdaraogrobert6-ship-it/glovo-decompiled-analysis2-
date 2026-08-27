package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetOverlaycp {
    public int RemoteActionCompatParcelizer;
    public int read;
    public Object serializer;
    public int write;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.read;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("c:");
        sb.append(this.write);
        sb.append(",p:");
        sb.append(this.serializer);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof accessgetOverlaycp)) {
                return false;
            }
            accessgetOverlaycp accessgetoverlaycp = (accessgetOverlaycp) obj;
            int i = this.read;
            if (i != accessgetoverlaycp.read) {
                return false;
            }
            if (i != 8 || Math.abs(this.write - this.RemoteActionCompatParcelizer) != 1 || this.write != accessgetoverlaycp.RemoteActionCompatParcelizer || this.RemoteActionCompatParcelizer != accessgetoverlaycp.write) {
                if (this.write != accessgetoverlaycp.write || this.RemoteActionCompatParcelizer != accessgetoverlaycp.RemoteActionCompatParcelizer) {
                    return false;
                }
                Object obj2 = this.serializer;
                Object obj3 = accessgetoverlaycp.serializer;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.read;
        return (((i * 31) + this.RemoteActionCompatParcelizer) * 31) + this.write;
    }
}
