package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getBackgroundColor {
    private final long IconCompatParcelizer;
    private final long read;

    public final long RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final long serializer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Long.hashCode(this.read) + (Long.hashCode(this.IconCompatParcelizer) * 31);
    }

    public getBackgroundColor(long j, long j2) {
        this.IconCompatParcelizer = j;
        this.read = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBackgroundColor)) {
            return false;
        }
        getBackgroundColor getbackgroundcolor = (getBackgroundColor) obj;
        return this.IconCompatParcelizer == getbackgroundcolor.IconCompatParcelizer && this.read == getbackgroundcolor.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FocusScoreFormulaVariables(phoneUsageDuration=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transportDurationMillis=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.read, ')');
    }
}
