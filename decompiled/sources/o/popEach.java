package o;

import java.util.Iterator;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class popEach {
    public static DepthSortedSetKtDepthComparator1 IconCompatParcelizer(Object obj) {
        return new DepthSortedSetKtDepthComparator1(obj);
    }

    public static boolean write(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !TuplesKt.RemoteActionCompatParcelizer(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
