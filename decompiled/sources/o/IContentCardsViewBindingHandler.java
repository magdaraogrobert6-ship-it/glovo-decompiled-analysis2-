package o;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractCollection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IContentCardsViewBindingHandler extends AbstractCollection implements Set {
    public static final IContentCardsActionListener MediaMetadataCompat = new IContentCardsActionListener();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        MediaMetadataCompat.getClass();
        Iterator<E> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        MediaMetadataCompat.getClass();
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }
}
