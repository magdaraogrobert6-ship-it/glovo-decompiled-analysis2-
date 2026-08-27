package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class requestRelayoutdefault extends markDetachedFromParentLookaheadPassui {
    public final String IconCompatParcelizer;
    public final long read;
    public final long serializer;
    public final String write;

    public requestRelayoutdefault(long j, long j2, String str, String str2) {
        this.read = j;
        this.serializer = j2;
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof markDetachedFromParentLookaheadPassui)) {
            return false;
        }
        requestRelayoutdefault requestrelayoutdefault = (requestRelayoutdefault) ((markDetachedFromParentLookaheadPassui) obj);
        if (this.read != requestrelayoutdefault.read || this.serializer != requestrelayoutdefault.serializer || !this.write.equals(requestrelayoutdefault.write)) {
            return false;
        }
        String str = requestrelayoutdefault.IconCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.read);
        sb.append(", size=");
        sb.append(this.serializer);
        sb.append(", name=");
        sb.append(this.write);
        sb.append(", uuid=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, "}");
    }

    public final int hashCode() {
        long j = this.read;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.serializer;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode = this.write.hashCode();
        String str = this.IconCompatParcelizer;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ iHashCode) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }
}
