package o;

/* JADX INFO: loaded from: classes.dex */
public final class FlowRow implements size3ABfNKs {
    public final size3ABfNKs IconCompatParcelizer;
    public final long serializer;

    @Override // o.size3ABfNKs
    public final long RemoteActionCompatParcelizer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4) + this.serializer;
    }

    public final int hashCode() {
        return Long.hashCode(this.serializer) + (this.IconCompatParcelizer.hashCode() * 31);
    }

    @Override // o.size3ABfNKs
    public final boolean l_() {
        return this.IconCompatParcelizer.l_();
    }

    public FlowRow(size3ABfNKs size3abfnks, long j) {
        this.IconCompatParcelizer = size3abfnks;
        this.serializer = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FlowRow)) {
            return false;
        }
        FlowRow flowRow = (FlowRow) obj;
        if (flowRow.serializer == this.serializer) {
            Object[] objArr = {flowRow.IconCompatParcelizer, this.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        long j2 = this.serializer;
        return j < j2 ? transformGestureDetectorKtdetectTransformGestures4 : this.IconCompatParcelizer.read(j - j2, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        long j2 = this.serializer;
        return j < j2 ? transformGestureDetectorKtdetectTransformGestures2 : this.IconCompatParcelizer.serializer(j - j2, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
    }
}
