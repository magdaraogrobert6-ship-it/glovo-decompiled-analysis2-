package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class setPinnedIconVisible implements Comparator {
    public static final setPinnedIconVisible IconCompatParcelizer = new setPinnedIconVisible();

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return setUnreadBarVisible.write;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable2.compareTo(comparable);
    }
}
