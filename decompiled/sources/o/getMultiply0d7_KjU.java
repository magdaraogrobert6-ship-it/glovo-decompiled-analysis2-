package o;

/* JADX INFO: loaded from: classes.dex */
public final class getMultiply0d7_KjU {
    public final Long read;
    public final String write;

    public final int hashCode() {
        return this.read.hashCode() + (this.write.hashCode() * 31);
    }

    public getMultiply0d7_KjU(String str, Long l) {
        this.write = str;
        this.read = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMultiply0d7_KjU)) {
            return false;
        }
        getMultiply0d7_KjU getmultiply0d7_kju = (getMultiply0d7_KjU) obj;
        return this.write.equals(getmultiply0d7_kju.write) && this.read.equals(getmultiply0d7_kju.read);
    }

    public final String toString() {
        return "Preference(key=" + this.write + ", value=" + this.read + ')';
    }
}
