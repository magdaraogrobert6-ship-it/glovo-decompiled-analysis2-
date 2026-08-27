package o;

/* JADX INFO: loaded from: classes4.dex */
public final class isItemViewSwipeEnabled {
    public final int IconCompatParcelizer;
    public final Object read;

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.IconCompatParcelizer);
        Object obj = this.read;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public isItemViewSwipeEnabled(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isItemViewSwipeEnabled)) {
            return false;
        }
        isItemViewSwipeEnabled isitemviewswipeenabled = (isItemViewSwipeEnabled) obj;
        if (this.IconCompatParcelizer != isitemviewswipeenabled.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, isitemviewswipeenabled.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", value=");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.read, ')');
    }
}
