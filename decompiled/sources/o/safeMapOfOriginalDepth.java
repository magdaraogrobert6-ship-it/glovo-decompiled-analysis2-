package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class safeMapOfOriginalDepth implements Iterable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Iterable serializer;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.serializer;
        boolean z = iterable instanceof List;
        int i = this.RemoteActionCompatParcelizer;
        if (z) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), i), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        it.getClass();
        TextStreamsKt.read("numberToAdvance must be nonnegative", i >= 0);
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new DepthSortedSetKt(it);
    }

    public safeMapOfOriginalDepth(int i, Collection collection) {
        this.serializer = collection;
        this.RemoteActionCompatParcelizer = i;
    }

    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
