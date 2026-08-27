package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidVertexMode_androidKt implements Iterator, displayInAppMessagelambda121 {
    public final /* synthetic */ androidx.recyclerview.widget.ChildHelper RemoteActionCompatParcelizer;
    public int read = -1;
    public boolean write;

    public AndroidVertexMode_androidKt(androidx.recyclerview.widget.ChildHelper childHelper) {
        this.RemoteActionCompatParcelizer = childHelper;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.read + 1 < ((accessprocessDragStart) this.RemoteActionCompatParcelizer.write).write();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You must call next() before you can remove an element");
            return;
        }
        accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) this.RemoteActionCompatParcelizer.write;
        ((opN5in7k0) accessprocessdragstart.read(this.read)).MediaDescriptionCompat = null;
        int i = this.read;
        Object[] objArr = accessprocessdragstart.read;
        Object obj = objArr[i];
        Object obj2 = isInterested.IconCompatParcelizer;
        if (obj != obj2) {
            objArr[i] = obj2;
            accessprocessdragstart.write = true;
        }
        this.read = i - 1;
        this.write = false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.write = true;
        accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) this.RemoteActionCompatParcelizer.write;
        int i = this.read + 1;
        this.read = i;
        return (opN5in7k0) accessprocessdragstart.read(i);
    }
}
