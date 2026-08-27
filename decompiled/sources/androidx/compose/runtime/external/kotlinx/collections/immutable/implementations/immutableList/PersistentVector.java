package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.snapshots.SnapshotStateList$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import coil3.util.UtilsKt;
import java.util.Arrays;
import java.util.ListIterator;
import o.accessgetThisDragAndDropTargetp;
import o.accesssetLastChildDragAndDropModifierNodep;
import o.accesssetThisDragAndDropTargetp;
import o.getContentCaptureSessionuiannotations;
import o.onContentCardClicked;
import o.setVerticalGravity;

/* JADX INFO: loaded from: classes.dex */
public final class PersistentVector extends accesssetThisDragAndDropTargetp {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final Object[] read;
    public final Object[] serializer;

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return (size() - 1) & (-32);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp RemoteActionCompatParcelizer(SnapshotStateList$$ExternalSyntheticLambda0 snapshotStateList$$ExternalSyntheticLambda0) {
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetp = new accessgetThisDragAndDropTargetp(this, this.read, this.serializer, this.IconCompatParcelizer);
        accessgetthisdraganddroptargetp.RemoteActionCompatParcelizer(snapshotStateList$$ExternalSyntheticLambda0);
        return accessgetthisdraganddroptargetp.write();
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accessgetThisDragAndDropTargetp serializer() {
        return new accessgetThisDragAndDropTargetp(this, this.read, this.serializer, this.IconCompatParcelizer);
    }

    public PersistentVector(int i, int i2, Object[] objArr, Object[] objArr2) {
        this.read = objArr;
        this.serializer = objArr2;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        if (size() <= 32) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        SQLite.RemoteActionCompatParcelizer(i, size());
        if (read() <= i) {
            objArr = this.serializer;
        } else {
            objArr = this.read;
            for (int i2 = this.IconCompatParcelizer; i2 > 0; i2 -= 5) {
                Object obj = objArr[UtilsKt.read(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        SQLite.serializer(i, size());
        return new accesssetLastChildDragAndDropModifierNodep(i, size(), (this.IconCompatParcelizer / 5) + 1, this.read, this.serializer);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp read(int i) {
        SQLite.RemoteActionCompatParcelizer(i, size());
        int i2 = read();
        int i3 = this.IconCompatParcelizer;
        Object[] objArr = this.read;
        return i >= i2 ? RemoteActionCompatParcelizer(objArr, i2, i3, i - i2) : RemoteActionCompatParcelizer(read(objArr, i3, i, new setVerticalGravity(this.serializer[0])), i2, i3, 0);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp read(int i, Object obj) {
        SQLite.serializer(i, size());
        if (i == size()) {
            return read(obj);
        }
        int i2 = read();
        Object[] objArr = this.read;
        if (i >= i2) {
            return serializer(i - i2, obj, objArr);
        }
        setVerticalGravity setverticalgravity = new setVerticalGravity(null);
        return serializer(0, setverticalgravity.read, RemoteActionCompatParcelizer(objArr, this.IconCompatParcelizer, i, obj, setverticalgravity));
    }

    public final PersistentVector serializer(int i, Object obj, Object[] objArr) {
        int size = size() - read();
        Object[] objArr2 = this.serializer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            onContentCardClicked.write(i + 1, i, size, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new PersistentVector(size() + 1, this.IconCompatParcelizer, objArr, objArrCopyOf);
        }
        Object obj2 = objArr2[31];
        onContentCardClicked.write(i + 1, i, size - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return read(objArr, objArrCopyOf, objArr3);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp write(int i, Object obj) {
        SQLite.RemoteActionCompatParcelizer(i, size());
        int i2 = read();
        Object[] objArr = this.read;
        Object[] objArr2 = this.serializer;
        int i3 = this.IconCompatParcelizer;
        if (i2 > i) {
            return new PersistentVector(size(), i3, read(i3, i, obj, objArr), objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new PersistentVector(size(), i3, objArr, objArrCopyOf);
    }

    public static Object[] read(int i, int i2, Object obj, Object[] objArr) {
        int i3 = UtilsKt.read(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[i3];
        obj2.getClass();
        objArrCopyOf[i3] = read(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    public final Object[] IconCompatParcelizer(int i, Object[] objArr, Object[] objArr2) {
        int i2 = UtilsKt.read(size() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[i2] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[i2] = IconCompatParcelizer(i - 5, (Object[]) objArrCopyOf[i2], objArr2);
        return objArrCopyOf;
    }

    public final PersistentVector read(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size();
        int i = this.IconCompatParcelizer;
        if ((size >> 5) <= (1 << i)) {
            return new PersistentVector(size() + 1, i, IconCompatParcelizer(i, objArr, objArr2), objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new PersistentVector(size() + 1, i2, IconCompatParcelizer(i2, objArr4, objArr2), objArr3);
    }

    public static Object[] serializer(Object[] objArr, int i, int i2, setVerticalGravity setverticalgravity) {
        Object[] objArrSerializer;
        int i3 = UtilsKt.read(i2, i);
        if (i == 5) {
            setverticalgravity.read = objArr[i3];
            objArrSerializer = null;
        } else {
            Object obj = objArr[i3];
            obj.getClass();
            objArrSerializer = serializer((Object[]) obj, i - 5, i2, setverticalgravity);
        }
        if (objArrSerializer == null && i3 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[i3] = objArrSerializer;
        return objArrCopyOf;
    }

    public static Object[] RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, Object obj, setVerticalGravity setverticalgravity) {
        int i3 = UtilsKt.read(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = i3 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            onContentCardClicked.write(i3 + 1, i3, 31, objArr, objArrCopyOf);
            setverticalgravity.read = objArr[31];
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        obj2.getClass();
        objArrCopyOf2[i3] = RemoteActionCompatParcelizer((Object[]) obj2, i4, i2, obj, setverticalgravity);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                break;
            }
            Object obj3 = objArr[i3];
            obj3.getClass();
            objArrCopyOf2[i3] = RemoteActionCompatParcelizer((Object[]) obj3, i4, 0, setverticalgravity.read, setverticalgravity);
        }
        return objArrCopyOf2;
    }

    public final Object[] read(Object[] objArr, int i, int i2, setVerticalGravity setverticalgravity) {
        int i3 = UtilsKt.read(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = i3 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            onContentCardClicked.write(i3, i3 + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = setverticalgravity.read;
            setverticalgravity.read = objArr[i3];
            return objArrCopyOf;
        }
        int i4 = objArr[31] == null ? UtilsKt.read(read() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = objArrCopyOf2[i4];
                obj.getClass();
                objArrCopyOf2[i4] = read((Object[]) obj, i5, 0, setverticalgravity);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = objArrCopyOf2[i3];
        obj2.getClass();
        objArrCopyOf2[i3] = read((Object[]) obj2, i5, i2, setverticalgravity);
        return objArrCopyOf2;
    }

    public final accesssetThisDragAndDropTargetp RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.serializer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                onContentCardClicked.write(i3, i3 + 1, size, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i4] = null;
            return new PersistentVector((i + size) - 1, i2, objArr, objArrCopyOf);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new SmallPersistentVector(objArr);
        }
        setVerticalGravity setverticalgravity = new setVerticalGravity(null);
        Object[] objArrSerializer = serializer(objArr, i2, i - 1, setverticalgravity);
        objArrSerializer.getClass();
        Object obj = setverticalgravity.read;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrSerializer[1] != null) {
            return new PersistentVector(i, i2, objArrSerializer, objArr3);
        }
        Object obj2 = objArrSerializer[0];
        obj2.getClass();
        return new PersistentVector(i, i2 - 5, (Object[]) obj2, objArr3);
    }

    @Override // o.accesssetThisDragAndDropTargetp
    public final accesssetThisDragAndDropTargetp read(Object obj) {
        int size = size() - read();
        Object[] objArr = this.read;
        Object[] objArr2 = this.serializer;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[size] = obj;
            return new PersistentVector(size() + 1, this.IconCompatParcelizer, objArr, objArrCopyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return read(objArr, objArr2, objArr3);
    }
}
