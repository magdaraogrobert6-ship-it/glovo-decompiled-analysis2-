package o;

/* JADX INFO: loaded from: classes.dex */
public final class sizeInqDBjuR0 {
    public final TransformGestureDetectorKtdetectTransformGestures2 IconCompatParcelizer;
    public final fling serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return Integer.hashCode(0) + ((this.serializer.hashCode() + (iHashCode * 31)) * 31);
    }

    public sizeInqDBjuR0(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, fling flingVar) {
        this.IconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2;
        this.serializer = flingVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sizeInqDBjuR0)) {
            return false;
        }
        sizeInqDBjuR0 sizeinqdbjur0 = (sizeInqDBjuR0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, sizeinqdbjur0.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, sizeinqdbjur0.serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.IconCompatParcelizer + ", easing=" + this.serializer + ", arcMode=ArcMode(value=0))";
    }
}
