package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getSnapshotObserver extends hitNearFh5PU_I {
    public final fromParentRect serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public getSnapshotObserver(fromParentRect fromparentrect) {
        fromparentrect.getClass();
        this.serializer = fromparentrect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSnapshotObserver)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((getSnapshotObserver) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "TargetWrapper(target=" + this.serializer + ')';
    }
}
