package o;

/* JADX INFO: loaded from: classes.dex */
public final class setClip extends setCameraDistance {
    public final accessgetAmbientShadowColor0d7_KjUjd read = accessgetAmbientShadowColor0d7_KjUjd.write;

    public final int hashCode() {
        return this.read.hashCode() - 1876823561;
    }

    public final String toString() {
        return "Success {mOutputData=" + this.read + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || setClip.class != obj.getClass()) {
            return false;
        }
        return this.read.equals(((setClip) obj).read);
    }
}
