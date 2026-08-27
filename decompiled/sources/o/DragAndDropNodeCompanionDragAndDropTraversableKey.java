package o;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropNodeCompanionDragAndDropTraversableKey extends startDragAndDropTransferd4ec7I {
    public final ContentCardsDividerItemDecoration RemoteActionCompatParcelizer;

    public DragAndDropNodeCompanionDragAndDropTraversableKey(ContentCardsDividerItemDecoration contentCardsDividerItemDecoration) {
        this.RemoteActionCompatParcelizer = contentCardsDividerItemDecoration;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.write;
        this.write = i + 2;
        Object[] objArr = this.read;
        return new getDragAndDropManager(this.RemoteActionCompatParcelizer, objArr[i], objArr[i + 1]);
    }
}
