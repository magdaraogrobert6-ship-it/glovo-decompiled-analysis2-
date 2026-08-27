package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ancestorToLocal extends accesssetLastLayerDrawingWasSkippedp {
    public final accessgetPointerInputSourcecp IconCompatParcelizer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public ancestorToLocal(accessgetPointerInputSourcecp accessgetpointerinputsourcecp) {
        this.IconCompatParcelizer = accessgetpointerinputsourcecp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ancestorToLocal) && this.IconCompatParcelizer.equals(((ancestorToLocal) obj).IconCompatParcelizer);
    }

    @Override // o.accesssetLastLayerDrawingWasSkippedp
    public final String toString() {
        return "QueryWrapper(query=" + this.IconCompatParcelizer + ')';
    }
}
