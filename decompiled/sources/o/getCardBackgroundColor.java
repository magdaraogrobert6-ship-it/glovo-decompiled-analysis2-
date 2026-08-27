package o;

/* JADX INFO: loaded from: classes.dex */
public final class getCardBackgroundColor {
    public final setMaxCardElevation read;
    public final setMaxCardElevation serializer;

    public final int hashCode() {
        return ((this.read.hashCode() ^ 1000003) * 1000003) ^ this.serializer.hashCode();
    }

    public getCardBackgroundColor(setMaxCardElevation setmaxcardelevation, setMaxCardElevation setmaxcardelevation2) {
        this.read = setmaxcardelevation;
        this.serializer = setmaxcardelevation2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getCardBackgroundColor)) {
            return false;
        }
        getCardBackgroundColor getcardbackgroundcolor = (getCardBackgroundColor) obj;
        return this.read.equals(getcardbackgroundcolor.read) && this.serializer.equals(getcardbackgroundcolor.serializer);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.read + ", secondaryOutConfig=" + this.serializer + "}";
    }
}
