package o;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropNodeCompanion extends startDragAndDropTransferd4ec7I {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            int i2 = this.write;
            this.write = i2 + 2;
            return this.read[i2];
        }
        if (i != 1) {
            int i3 = this.write;
            this.write = i3 + 2;
            return this.read[i3 + 1];
        }
        int i4 = this.write;
        this.write = i4 + 2;
        Object[] objArr = this.read;
        return new AnchoredDragFinishedSignal(objArr[i4], 1, objArr[i4 + 1]);
    }
}
