package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class SortedSet<E> extends TreeSet<E> {
    public static final int $stable = 8;

    public SortedSet(Comparator<? super E> comparator) {
        super(comparator);
    }

    public int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return getSize();
    }
}
