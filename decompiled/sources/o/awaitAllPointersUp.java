package o;

/* JADX INFO: loaded from: classes.dex */
public final class awaitAllPointersUp {
    public final float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;

    public final int hashCode() {
        return Float.hashCode(this.RemoteActionCompatParcelizer) + (Float.hashCode(this.IconCompatParcelizer) * 31);
    }

    public awaitAllPointersUp(float f, float f2) {
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awaitAllPointersUp)) {
            return false;
        }
        awaitAllPointersUp awaitallpointersup = (awaitAllPointersUp) obj;
        return Float.compare(this.IconCompatParcelizer, awaitallpointersup.IconCompatParcelizer) == 0 && Float.compare(this.RemoteActionCompatParcelizer, awaitallpointersup.RemoteActionCompatParcelizer) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", velocityCoefficient=");
        return MediaSessionCompatQueueItem.serializer(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
