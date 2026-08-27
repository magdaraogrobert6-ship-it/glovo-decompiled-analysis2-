package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getMotionEvent extends HoverIconModifierNodefindOverridingAncestorNode1 implements List, RandomAccess {
    public static final HoverIconModifierNodefindDescendantNodeWithCursorInBounds1 RemoteActionCompatParcelizer = new HoverIconModifierNodefindDescendantNodeWithCursorInBounds1(MatrixPositionCalculator.IconCompatParcelizer, 0);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (FeatureFlagProvider.write(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                HoverIconModifierNodefindDescendantNodeWithCursorInBounds1 hoverIconModifierNodefindDescendantNodeWithCursorInBounds1ListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (hoverIconModifierNodefindDescendantNodeWithCursorInBounds1ListIterator.hasNext()) {
                    if (it.hasNext() && FeatureFlagProvider.write(hoverIconModifierNodefindDescendantNodeWithCursorInBounds1ListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public getMotionEvent subList(int i, int i2) {
        TuplesKt.RemoteActionCompatParcelizer(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? MatrixPositionCalculator.IconCompatParcelizer : new HoverIconModifierNodedisplayIconIfDescendantsDoNotHavePriority1(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final HoverIconModifierNodefindDescendantNodeWithCursorInBounds1 listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? RemoteActionCompatParcelizer : new HoverIconModifierNodefindDescendantNodeWithCursorInBounds1(this, i);
        }
        DrawableTransformation.read(TuplesKt.read(i, size, "index"));
        return null;
    }

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public int IconCompatParcelizer(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }
}
