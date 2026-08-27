package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class BlockInnerShadowNodeobtainPainter1 implements blur1fqSgw {
    public final DragAndDropNodeacceptDragAndDropTransfer1 RemoteActionCompatParcelizer = new DragAndDropNodeacceptDragAndDropTransfer1(0);

    public final void RemoteActionCompatParcelizer(int i) {
        DragAndDropNodeacceptDragAndDropTransfer1 dragAndDropNodeacceptDragAndDropTransfer1;
        int i2;
        do {
            dragAndDropNodeacceptDragAndDropTransfer1 = this.RemoteActionCompatParcelizer;
            i2 = dragAndDropNodeacceptDragAndDropTransfer1.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!dragAndDropNodeacceptDragAndDropTransfer1.compareAndSet(i2, i2 | i));
    }

    public final boolean write(int i) {
        return (i & this.RemoteActionCompatParcelizer.get()) != 0;
    }
}
