package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class setUnreadBarVisible implements Comparator {
    public static final setUnreadBarVisible write = new setUnreadBarVisible();

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return setPinnedIconVisible.IconCompatParcelizer;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}
