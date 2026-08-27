package o;

/* JADX INFO: loaded from: classes.dex */
public final class component17NrFUSI {
    public final toCompareValue IconCompatParcelizer;
    public final float read;

    public component17NrFUSI(android.graphics.Rect rect, float f) {
        this.IconCompatParcelizer = new toCompareValue(rect);
        this.read = f;
    }

    public final android.graphics.Rect IconCompatParcelizer() {
        toCompareValue tocomparevalue = this.IconCompatParcelizer;
        tocomparevalue.getClass();
        return new android.graphics.Rect(tocomparevalue.write, tocomparevalue.RemoteActionCompatParcelizer, tocomparevalue.read, tocomparevalue.serializer);
    }

    public final int hashCode() {
        return Float.hashCode(this.read) + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", density=");
        return MediaSessionCompatQueueItem.serializer(sb, this.read, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!component17NrFUSI.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        component17NrFUSI component17nrfusi = (component17NrFUSI) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, component17nrfusi.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.read == component17nrfusi.read;
    }

    public component17NrFUSI(toCompareValue tocomparevalue, float f) {
        this.IconCompatParcelizer = tocomparevalue;
        this.read = f;
    }
}
