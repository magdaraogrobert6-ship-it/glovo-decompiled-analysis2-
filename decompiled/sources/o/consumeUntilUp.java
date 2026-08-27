package o;

/* JADX INFO: loaded from: classes.dex */
public final class consumeUntilUp {
    public final Arrangement IconCompatParcelizer;
    public final float serializer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (Float.hashCode(this.serializer) * 31);
    }

    public consumeUntilUp(float f, Arrangement arrangement) {
        this.serializer = f;
        this.IconCompatParcelizer = arrangement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof consumeUntilUp)) {
            return false;
        }
        consumeUntilUp consumeuntilup = (consumeUntilUp) obj;
        if (Float.compare(this.serializer, consumeuntilup.serializer) != 0) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, consumeuntilup.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Fade(alpha=" + this.serializer + ", animationSpec=" + this.IconCompatParcelizer + ')';
    }
}
