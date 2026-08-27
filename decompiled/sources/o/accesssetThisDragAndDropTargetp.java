package o;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList$SubList;
import androidx.compose.runtime.snapshots.SnapshotStateList$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractList;

/* JADX INFO: loaded from: classes.dex */
public abstract class accesssetThisDragAndDropTargetp extends AbstractList {
    public abstract accesssetThisDragAndDropTargetp RemoteActionCompatParcelizer(SnapshotStateList$$ExternalSyntheticLambda0 snapshotStateList$$ExternalSyntheticLambda0);

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract accesssetThisDragAndDropTargetp read(int i);

    public abstract accesssetThisDragAndDropTargetp read(int i, Object obj);

    public abstract accesssetThisDragAndDropTargetp read(Object obj);

    public abstract accessgetThisDragAndDropTargetp serializer();

    public abstract accesssetThisDragAndDropTargetp write(int i, Object obj);

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        return new ImmutableList$SubList(this, i, i2);
    }

    public accesssetThisDragAndDropTargetp IconCompatParcelizer(Collection collection) {
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetpSerializer = serializer();
        accessgetthisdraganddroptargetpSerializer.addAll(collection);
        return accessgetthisdraganddroptargetpSerializer.write();
    }
}
