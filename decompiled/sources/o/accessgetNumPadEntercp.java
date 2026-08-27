package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetNumPadEntercp {
    public final String IconCompatParcelizer;
    public final Object write;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (System.identityHashCode(this.write) * 31);
    }

    public final String serializer() {
        int iIdentityHashCode = System.identityHashCode(this.write);
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    public accessgetNumPadEntercp(Object obj, String str) {
        this.write = obj;
        this.IconCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetNumPadEntercp)) {
            return false;
        }
        accessgetNumPadEntercp accessgetnumpadentercp = (accessgetNumPadEntercp) obj;
        return this.write == accessgetnumpadentercp.write && this.IconCompatParcelizer.equals(accessgetnumpadentercp.IconCompatParcelizer);
    }
}
