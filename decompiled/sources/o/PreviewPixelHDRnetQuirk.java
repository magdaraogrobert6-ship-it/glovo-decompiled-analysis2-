package o;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewPixelHDRnetQuirk {
    public final Object serializer;

    public final int hashCode() {
        return this.serializer.hashCode() ^ 1000003;
    }

    public PreviewPixelHDRnetQuirk(Object obj) {
        this.serializer = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PreviewPixelHDRnetQuirk) && this.serializer == ((PreviewPixelHDRnetQuirk) obj).serializer;
    }

    public final String toString() {
        return "Identifier{value=" + this.serializer + "}";
    }
}
