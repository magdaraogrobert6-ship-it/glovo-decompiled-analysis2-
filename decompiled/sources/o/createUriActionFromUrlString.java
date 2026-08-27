package o;

/* JADX INFO: loaded from: classes3.dex */
public final class createUriActionFromUrlString implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Long read;

    public final int hashCode() {
        return (this.read.hashCode() ^ 16777619) * (-2128831035);
    }

    public createUriActionFromUrlString(BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8) {
        this.read = brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer;
    }

    public final String toString() {
        return "OffTheGridEnd{stop=" + this.read + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof createUriActionFromUrlString)) {
            return false;
        }
        Object obj2 = ((createUriActionFromUrlString) obj).read;
        Long l = this.read;
        return l == obj2 || l.equals(obj2);
    }
}
