package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class onChanged implements Iterator, displayInAppMessagelambda121 {
    public int IconCompatParcelizer;
    public boolean serializer = true;
    public final startDragAndDropTransferd4ec7I[] write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer;
    }

    public final int RemoteActionCompatParcelizer(int i) {
        startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr = this.write;
        startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i = startdraganddroptransferd4ec7iArr[i];
        int i2 = startdraganddroptransferd4ec7i.write;
        if (i2 < startdraganddroptransferd4ec7i.serializer) {
            return i;
        }
        Object[] objArr = startdraganddroptransferd4ec7i.read;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m = (requestDragAndDropTransferk4lQ0M) obj;
        if (i == 6) {
            startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i2 = startdraganddroptransferd4ec7iArr[i + 1];
            Object[] objArr2 = requestdraganddroptransferk4lq0m.read;
            startdraganddroptransferd4ec7i2.write(objArr2.length, 0, objArr2);
        } else {
            startdraganddroptransferd4ec7iArr[i + 1].write(Integer.bitCount(requestdraganddroptransferk4lq0m.serializer) * 2, 0, requestdraganddroptransferk4lq0m.read);
        }
        return RemoteActionCompatParcelizer(i + 1);
    }

    public final void write() {
        int i = this.IconCompatParcelizer;
        startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr = this.write;
        startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i = startdraganddroptransferd4ec7iArr[i];
        if (startdraganddroptransferd4ec7i.write < startdraganddroptransferd4ec7i.serializer) {
            return;
        }
        while (-1 < i) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (iRemoteActionCompatParcelizer == -1) {
                startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i2 = startdraganddroptransferd4ec7iArr[i];
                int i2 = startdraganddroptransferd4ec7i2.write;
                Object[] objArr = startdraganddroptransferd4ec7i2.read;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    startdraganddroptransferd4ec7i2.write = i2 + 1;
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
                }
            }
            if (iRemoteActionCompatParcelizer != -1) {
                this.IconCompatParcelizer = iRemoteActionCompatParcelizer;
                return;
            }
            if (i > 0) {
                startDragAndDropTransferd4ec7I startdraganddroptransferd4ec7i3 = startdraganddroptransferd4ec7iArr[i - 1];
                int i3 = startdraganddroptransferd4ec7i3.write;
                int length2 = startdraganddroptransferd4ec7i3.read.length;
                startdraganddroptransferd4ec7i3.write = i3 + 1;
            }
            startdraganddroptransferd4ec7iArr[i].write(0, 0, requestDragAndDropTransferk4lQ0M.IconCompatParcelizer.read);
            i--;
        }
        this.serializer = false;
    }

    public onChanged(requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m, startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr) {
        this.write = startdraganddroptransferd4ec7iArr;
        startdraganddroptransferd4ec7iArr[0].write(Integer.bitCount(requestdraganddroptransferk4lq0m.serializer) * 2, 0, requestdraganddroptransferk4lq0m.read);
        this.IconCompatParcelizer = 0;
        write();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        Object next = this.write[this.IconCompatParcelizer].next();
        write();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
