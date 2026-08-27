package o;

/* JADX INFO: loaded from: classes.dex */
public final class setTranslationY {
    public final long read;
    public final long write;

    public final int hashCode() {
        return Long.hashCode(this.write) + (Long.hashCode(this.read) * 31);
    }

    public setTranslationY(long j, long j2) {
        this.read = j;
        this.write = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb.append(this.read);
        sb.append(", flexIntervalMillis=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.write, '}');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !setTranslationY.class.equals(obj.getClass())) {
            return false;
        }
        setTranslationY settranslationy = (setTranslationY) obj;
        return settranslationy.read == this.read && settranslationy.write == this.write;
    }
}
