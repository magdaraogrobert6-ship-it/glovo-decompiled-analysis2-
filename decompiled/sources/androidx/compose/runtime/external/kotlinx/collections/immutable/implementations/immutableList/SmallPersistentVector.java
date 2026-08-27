package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.snapshots.SnapshotStateList$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import o.accessgetOnDropTargetValidatep;
import o.accessgetThisDragAndDropTargetp;
import o.accesssetThisDragAndDropTargetp;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes.dex */
public final class SmallPersistentVector extends accesssetThisDragAndDropTargetp {
    public static final SmallPersistentVector IconCompatParcelizer = new SmallPersistentVector(new Object[0]);
    public final Object[] write;

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.write.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return onContentCardClicked.read(this.write, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return onContentCardClicked.write(this.write, obj);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accessgetThisDragAndDropTargetp serializer() {
        return new accessgetThisDragAndDropTargetp(this, null, this.write, 0);
    }

    public SmallPersistentVector(Object[] objArr) {
        this.write = objArr;
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp IconCompatParcelizer(Collection collection) {
        if (collection.size() + size() > 32) {
            accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetpSerializer = serializer();
            accessgetthisdraganddroptargetpSerializer.addAll(collection);
            return accessgetthisdraganddroptargetpSerializer.write();
        }
        int size = size();
        Object[] objArrCopyOf = Arrays.copyOf(this.write, collection.size() + size);
        int size2 = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size2] = it.next();
            size2++;
        }
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp RemoteActionCompatParcelizer(SnapshotStateList$$ExternalSyntheticLambda0 snapshotStateList$$ExternalSyntheticLambda0) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.write;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (((Boolean) snapshotStateList$$ExternalSyntheticLambda0.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? IconCompatParcelizer : new SmallPersistentVector(onContentCardClicked.write(0, size, objArrCopyOf));
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        SQLite.RemoteActionCompatParcelizer(i, size());
        return this.write[i];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        SQLite.serializer(i, size());
        return new accessgetOnDropTargetValidatep(i, size(), this.write);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp read(int i) {
        SQLite.RemoteActionCompatParcelizer(i, size());
        if (size() == 1) {
            return IconCompatParcelizer;
        }
        int size = size();
        Object[] objArr = this.write;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size - 1);
        onContentCardClicked.write(i, i + 1, size(), objArr, objArrCopyOf);
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp read(int i, Object obj) {
        SQLite.serializer(i, size());
        if (i == size()) {
            return read(obj);
        }
        int size = size();
        Object[] objArr = this.write;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr2);
            onContentCardClicked.write(i + 1, i, size(), objArr, objArr2);
            objArr2[i] = obj;
            return new SmallPersistentVector(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        onContentCardClicked.write(i + 1, i, size() - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new PersistentVector(size() + 1, 0, objArrCopyOf, objArr3);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp write(int i, Object obj) {
        SQLite.RemoteActionCompatParcelizer(i, size());
        Object[] objArr = this.write;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp read(Object obj) {
        int size = size();
        Object[] objArr = this.write;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
            objArrCopyOf[size()] = obj;
            return new SmallPersistentVector(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new PersistentVector(size() + 1, 0, objArr, objArr2);
    }
}
