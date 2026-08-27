package o;

import java.util.Iterator;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class DepthSortedSetKt implements Iterator {
    public final /* synthetic */ Iterator RemoteActionCompatParcelizer;
    public boolean read = true;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.RemoteActionCompatParcelizer.next();
        this.read = false;
        return next;
    }

    public DepthSortedSetKt(Iterator it) {
        this.RemoteActionCompatParcelizer = it;
    }

    @Override // java.util.Iterator
    public final void remove() {
        TextStreamsKt.RemoteActionCompatParcelizer("no calls to next() since the last call to remove()", !this.read);
        this.RemoteActionCompatParcelizer.remove();
    }
}
