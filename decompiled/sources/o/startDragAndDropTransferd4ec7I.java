package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class startDragAndDropTransferd4ec7I implements Iterator, displayInAppMessagelambda121 {
    public Object[] read = requestDragAndDropTransferk4lQ0M.IconCompatParcelizer.read;
    public int serializer;
    public int write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.write < this.serializer;
    }

    public final void write(int i, int i2, Object[] objArr) {
        this.read = objArr;
        this.serializer = i;
        this.write = i2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
