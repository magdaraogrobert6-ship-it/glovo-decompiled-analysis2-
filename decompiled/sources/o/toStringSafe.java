package o;

/* JADX INFO: loaded from: classes4.dex */
public final class toStringSafe {
    public final Integer serializer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public final int hashCode() {
        return this.write.hashCode() + (this.serializer.hashCode() * 31);
    }

    public toStringSafe(Integer num, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.serializer = num;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toStringSafe)) {
            return false;
        }
        toStringSafe tostringsafe = (toStringSafe) obj;
        return this.serializer.equals(tostringsafe.serializer) && this.write.equals(tostringsafe.write);
    }

    public final String toString() {
        return "ImageButtonViewEntity(image=" + this.serializer + ", action=" + this.write + ")";
    }
}
