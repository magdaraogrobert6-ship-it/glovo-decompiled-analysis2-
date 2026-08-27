package o;

import androidx.compose.runtime.snapshots.SnapshotStateList$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetThisDragAndDropTargetp extends DefaultContentCardsActionListener implements Collection {
    public Object[] IconCompatParcelizer;
    public Object[] MediaDescriptionCompat;
    public Object[] MediaMetadataCompat;
    public accesssetThisDragAndDropTargetp MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public DragAndDropNodeonEnded1 read = new DragAndDropNodeonEnded1();
    public Object[] serializer;
    public int write;

    @Override // o.DefaultContentCardsActionListener
    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final int MediaMetadataCompat() {
        int i = this.write;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    public final int RemoteActionCompatParcelizer() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int serializer() {
        int i = this.write;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] IconCompatParcelizer(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.read;
        return objArr;
    }

    public final Object[] IconCompatParcelizer(Object[] objArr) {
        if (objArr == null) {
            return read();
        }
        if (read(objArr)) {
            return objArr;
        }
        Object[] objArr2 = read();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        onContentCardClicked.IconCompatParcelizer(0, length, 6, objArr, objArr2);
        return objArr2;
    }

    public final Object[] IconCompatParcelizer(Object[] objArr, int i, int i2, setVerticalGravity setverticalgravity) {
        Object[] objArrIconCompatParcelizer;
        int i3 = coil3.util.UtilsKt.read(i2 - 1, i);
        if (i == 5) {
            setverticalgravity.read = objArr[i3];
            objArrIconCompatParcelizer = null;
        } else {
            Object obj = objArr[i3];
            obj.getClass();
            objArrIconCompatParcelizer = IconCompatParcelizer((Object[]) obj, i - 5, i2, setverticalgravity);
        }
        if (objArrIconCompatParcelizer == null && i3 == 0) {
            return null;
        }
        Object[] objArrIconCompatParcelizer2 = IconCompatParcelizer(objArr);
        objArrIconCompatParcelizer2[i3] = objArrIconCompatParcelizer;
        return objArrIconCompatParcelizer2;
    }

    public final int RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, setVerticalGravity setverticalgravity) {
        int iIconCompatParcelizer = IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this.serializer, i, setverticalgravity);
        Object obj = setverticalgravity.read;
        if (iIconCompatParcelizer == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iIconCompatParcelizer, i, (Object) null);
        this.serializer = objArr;
        this.write -= i - iIconCompatParcelizer;
        return iIconCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i;
        int iMediaMetadataCompat = MediaMetadataCompat();
        Object[] objArrSerializer = null;
        setVerticalGravity setverticalgravity = new setVerticalGravity(null);
        boolean z = false;
        if (this.IconCompatParcelizer != null) {
            accessgetOnStartTransferp accessgetonstarttransferpWrite = write(0);
            int i2 = 32;
            int iIconCompatParcelizer = 32;
            while (iIconCompatParcelizer == 32 && accessgetonstarttransferpWrite.hasNext()) {
                iIconCompatParcelizer = IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object[]) accessgetonstarttransferpWrite.next(), 32, setverticalgravity);
            }
            if (iIconCompatParcelizer == 32) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, iMediaMetadataCompat, setverticalgravity);
                if (iRemoteActionCompatParcelizer == 0) {
                    write(this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
                }
                if (iRemoteActionCompatParcelizer != iMediaMetadataCompat) {
                }
            } else {
                int i3 = (accessgetonstarttransferpWrite.serializer - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iRemoteActionCompatParcelizer2 = iIconCompatParcelizer;
                while (accessgetonstarttransferpWrite.hasNext()) {
                    iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object[]) accessgetonstarttransferpWrite.next(), 32, iRemoteActionCompatParcelizer2, setverticalgravity, arrayList2, arrayList);
                    i3 = i3;
                    i2 = i2;
                }
                int i4 = i3;
                int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this.serializer, iMediaMetadataCompat, iRemoteActionCompatParcelizer2, setverticalgravity, arrayList2, arrayList);
                Object obj = setverticalgravity.read;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iRemoteActionCompatParcelizer3, i2, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArr2 = this.IconCompatParcelizer;
                if (zIsEmpty) {
                    objArr2.getClass();
                } else {
                    objArr2 = read(objArr2, i4, this.RemoteActionCompatParcelizer, arrayList.iterator());
                }
                int size = i4 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("invalid size");
                }
                if (size == 0) {
                    this.RemoteActionCompatParcelizer = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.RemoteActionCompatParcelizer;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.RemoteActionCompatParcelizer = i - 5;
                        Object[] objArr3 = objArr2[0];
                        objArr3.getClass();
                        objArr2 = objArr3;
                    }
                    objArrSerializer = serializer(i5, i, objArr2);
                }
                this.IconCompatParcelizer = objArrSerializer;
                this.serializer = objArr;
                this.write = size + iRemoteActionCompatParcelizer3;
            }
            z = true;
        } else if (RemoteActionCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, iMediaMetadataCompat, setverticalgravity) != iMediaMetadataCompat) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] RemoteActionCompatParcelizer(Object[] objArr, int i, Object[][] objArr2) {
        r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(objArr2);
        int i2 = this.RemoteActionCompatParcelizer;
        Object[] objArrIconCompatParcelizer = (i >> 5) < (1 << i2) ? read(objArr, i, i2, r8lambdaorcgh_zecjpqysbjv51vn1ttu44) : IconCompatParcelizer(objArr);
        while (r8lambdaorcgh_zecjpqysbjv51vn1ttu44.hasNext()) {
            this.RemoteActionCompatParcelizer += 5;
            objArrIconCompatParcelizer = IconCompatParcelizer((Object) objArrIconCompatParcelizer);
            int i3 = this.RemoteActionCompatParcelizer;
            read(objArrIconCompatParcelizer, 1 << i3, i3, r8lambdaorcgh_zecjpqysbjv51vn1ttu44);
        }
        return objArrIconCompatParcelizer;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Object[] objArrWrite;
        androidx.sqlite.SQLite.serializer(i, this.write);
        if (i == this.write) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.write - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = collection.size();
            Object[] objArr = this.serializer;
            Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
            onContentCardClicked.write((((size2 + i) - 1) & 31) + 1, i3, MediaMetadataCompat(), objArr, objArrIconCompatParcelizer);
            serializer(objArrIconCompatParcelizer, i3, collection.iterator());
            this.serializer = objArrIconCompatParcelizer;
            this.write = collection.size() + this.write;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iMediaMetadataCompat = MediaMetadataCompat();
        int size3 = collection.size() + this.write;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= serializer()) {
            objArrWrite = read();
            RemoteActionCompatParcelizer(collection, i, this.serializer, iMediaMetadataCompat, objArr2, size, objArrWrite);
        } else {
            Object[] objArr3 = this.serializer;
            if (size3 > iMediaMetadataCompat) {
                int i4 = size3 - iMediaMetadataCompat;
                objArrWrite = write(i4, objArr3);
                IconCompatParcelizer(collection, i, i4, objArr2, size, objArrWrite);
            } else {
                objArrWrite = read();
                int i5 = iMediaMetadataCompat - size3;
                onContentCardClicked.write(0, i5, iMediaMetadataCompat, objArr3, objArrWrite);
                int i6 = 32 - i5;
                Object[] objArrWrite2 = write(i6, this.serializer);
                int i7 = size - 1;
                objArr2[i7] = objArrWrite2;
                IconCompatParcelizer(collection, i, i6, objArr2, i7, objArrWrite2);
            }
        }
        this.IconCompatParcelizer = RemoteActionCompatParcelizer(this.IconCompatParcelizer, i2, objArr2);
        this.serializer = objArrWrite;
        this.write = collection.size() + this.write;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        androidx.sqlite.SQLite.serializer(i, this.write);
        return new hasEligibleDropTarget(this, i);
    }

    public final Object[] read() {
        Object[] objArr = new Object[33];
        objArr[32] = this.read;
        return objArr;
    }

    public final accesssetThisDragAndDropTargetp write() {
        accesssetThisDragAndDropTargetp persistentVector;
        Object[] objArr = this.IconCompatParcelizer;
        if (objArr == this.MediaDescriptionCompat && this.serializer == this.MediaMetadataCompat) {
            persistentVector = this.MediaSessionCompatQueueItem;
        } else {
            this.read = new DragAndDropNodeonEnded1();
            this.MediaDescriptionCompat = objArr;
            Object[] objArr2 = this.serializer;
            this.MediaMetadataCompat = objArr2;
            if (objArr == null) {
                persistentVector = objArr2.length == 0 ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.IconCompatParcelizer : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(Arrays.copyOf(objArr2, this.write));
            } else {
                persistentVector = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(this.write, this.RemoteActionCompatParcelizer, objArr, objArr2);
            }
        }
        this.MediaSessionCompatQueueItem = persistentVector;
        return persistentVector;
    }

    public accessgetThisDragAndDropTargetp(accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp, Object[] objArr, Object[] objArr2, int i) {
        this.MediaSessionCompatQueueItem = accesssetthisdraganddroptargetp;
        this.MediaDescriptionCompat = objArr;
        this.MediaMetadataCompat = objArr2;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = objArr;
        this.serializer = objArr2;
        this.write = accesssetthisdraganddroptargetp.size();
    }

    public final Object write(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.write - i;
        Object[] objArr2 = this.serializer;
        if (i4 == 1) {
            Object obj = objArr2[0];
            write(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr2);
        onContentCardClicked.write(i3, i3 + 1, i4, objArr2, objArrIconCompatParcelizer);
        objArrIconCompatParcelizer[i4 - 1] = null;
        this.IconCompatParcelizer = objArr;
        this.serializer = objArrIconCompatParcelizer;
        this.write = (i + i4) - 1;
        this.RemoteActionCompatParcelizer = i2;
        return obj2;
    }

    public static void serializer(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // o.DefaultContentCardsActionListener
    public final Object IconCompatParcelizer(int i) {
        androidx.sqlite.SQLite.RemoteActionCompatParcelizer(i, IconCompatParcelizer());
        ((AbstractList) this).modCount++;
        int iSerializer = serializer();
        if (i >= iSerializer) {
            return write(this.IconCompatParcelizer, iSerializer, this.RemoteActionCompatParcelizer, i - iSerializer);
        }
        setVerticalGravity setverticalgravity = new setVerticalGravity(this.serializer[0]);
        Object[] objArr = this.IconCompatParcelizer;
        objArr.getClass();
        write(write(objArr, this.RemoteActionCompatParcelizer, i, setverticalgravity), iSerializer, this.RemoteActionCompatParcelizer, 0);
        return setverticalgravity.read;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        androidx.sqlite.SQLite.serializer(i, IconCompatParcelizer());
        if (i == IconCompatParcelizer()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iSerializer = serializer();
        if (i >= iSerializer) {
            write(i - iSerializer, obj, this.IconCompatParcelizer);
            return;
        }
        setVerticalGravity setverticalgravity = new setVerticalGravity(null);
        Object[] objArr = this.IconCompatParcelizer;
        objArr.getClass();
        write(0, setverticalgravity.read, read(objArr, this.RemoteActionCompatParcelizer, i, obj, setverticalgravity));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        androidx.sqlite.SQLite.RemoteActionCompatParcelizer(i, IconCompatParcelizer());
        if (serializer() <= i) {
            objArr = this.serializer;
        } else {
            objArr = this.IconCompatParcelizer;
            objArr.getClass();
            for (int i2 = this.RemoteActionCompatParcelizer; i2 > 0; i2 -= 5) {
                Object obj = objArr[coil3.util.UtilsKt.read(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final void serializer(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.write;
        int i2 = this.RemoteActionCompatParcelizer;
        if ((i >> 5) > (1 << i2)) {
            this.IconCompatParcelizer = serializer(this.RemoteActionCompatParcelizer + 5, IconCompatParcelizer((Object) objArr), objArr2);
            this.serializer = objArr3;
            this.RemoteActionCompatParcelizer += 5;
            this.write++;
            return;
        }
        if (objArr == null) {
            this.IconCompatParcelizer = objArr2;
            this.serializer = objArr3;
            this.write = i + 1;
        } else {
            this.IconCompatParcelizer = serializer(i2, objArr, objArr2);
            this.serializer = objArr3;
            this.write++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        androidx.sqlite.SQLite.RemoteActionCompatParcelizer(i, IconCompatParcelizer());
        if (serializer() > i) {
            setVerticalGravity setverticalgravity = new setVerticalGravity(null);
            Object[] objArr = this.IconCompatParcelizer;
            objArr.getClass();
            this.IconCompatParcelizer = write(objArr, this.RemoteActionCompatParcelizer, i, obj, setverticalgravity);
            return setverticalgravity.read;
        }
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(this.serializer);
        if (objArrIconCompatParcelizer != this.serializer) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrIconCompatParcelizer[i2];
        objArrIconCompatParcelizer[i2] = obj;
        this.serializer = objArrIconCompatParcelizer;
        return obj2;
    }

    public final accessgetOnStartTransferp write(int i) {
        Object[] objArr = this.IconCompatParcelizer;
        if (objArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Invalid root");
            return null;
        }
        int iSerializer = serializer() >> 5;
        androidx.sqlite.SQLite.serializer(i, iSerializer);
        int i2 = this.RemoteActionCompatParcelizer;
        return i2 == 0 ? new accessgetOnDropTargetValidatep(i, objArr) : new onDrop(objArr, i, iSerializer, i2 / 5);
    }

    public final void write(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.IconCompatParcelizer = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.serializer = objArr;
            this.write = i;
            this.RemoteActionCompatParcelizer = i2;
            return;
        }
        setVerticalGravity setverticalgravity = new setVerticalGravity(null);
        objArr.getClass();
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr, i2, i, setverticalgravity);
        objArrIconCompatParcelizer.getClass();
        Object obj = setverticalgravity.read;
        obj.getClass();
        this.serializer = (Object[]) obj;
        this.write = i;
        if (objArrIconCompatParcelizer[1] == null) {
            this.IconCompatParcelizer = (Object[]) objArrIconCompatParcelizer[0];
            this.RemoteActionCompatParcelizer = i2 - 5;
        } else {
            this.IconCompatParcelizer = objArrIconCompatParcelizer;
            this.RemoteActionCompatParcelizer = i2;
        }
    }

    public final void write(int i, Object obj, Object[] objArr) {
        int iMediaMetadataCompat = MediaMetadataCompat();
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(this.serializer);
        Object[] objArr2 = this.serializer;
        if (iMediaMetadataCompat >= 32) {
            Object obj2 = objArr2[31];
            onContentCardClicked.write(i + 1, i, 31, objArr2, objArrIconCompatParcelizer);
            objArrIconCompatParcelizer[i] = obj;
            serializer(objArr, objArrIconCompatParcelizer, IconCompatParcelizer(obj2));
            return;
        }
        onContentCardClicked.write(i + 1, i, iMediaMetadataCompat, objArr2, objArrIconCompatParcelizer);
        objArrIconCompatParcelizer[i] = obj;
        this.IconCompatParcelizer = objArr;
        this.serializer = objArrIconCompatParcelizer;
        this.write++;
    }

    public final Object[] write(Object[] objArr, int i, int i2, Object obj, setVerticalGravity setverticalgravity) {
        int i3 = coil3.util.UtilsKt.read(i2, i);
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
        if (i != 0) {
            Object obj2 = objArrIconCompatParcelizer[i3];
            obj2.getClass();
            objArrIconCompatParcelizer[i3] = write((Object[]) obj2, i - 5, i2, obj, setverticalgravity);
            return objArrIconCompatParcelizer;
        }
        if (objArrIconCompatParcelizer != objArr) {
            ((AbstractList) this).modCount++;
        }
        setverticalgravity.read = objArrIconCompatParcelizer[i3];
        objArrIconCompatParcelizer[i3] = obj;
        return objArrIconCompatParcelizer;
    }

    public final int IconCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object[] objArr, int i, setVerticalGravity setverticalgravity) {
        Object[] objArrIconCompatParcelizer = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrIconCompatParcelizer[i2] = obj;
                i2++;
            }
        }
        setverticalgravity.read = objArrIconCompatParcelizer;
        return i2;
    }

    public final void IconCompatParcelizer(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("root is null");
            return;
        }
        int i4 = i >> 5;
        accessgetOnStartTransferp accessgetonstarttransferpWrite = write(serializer() >> 5);
        int i5 = i3;
        Object[] objArrWrite = objArr2;
        while (accessgetonstarttransferpWrite.serializer - 1 != i4) {
            Object[] objArr3 = (Object[]) accessgetonstarttransferpWrite.previous();
            onContentCardClicked.write(0, 32 - i2, 32, objArr3, objArrWrite);
            objArrWrite = write(i2, objArr3);
            i5--;
            objArr[i5] = objArrWrite;
        }
        Object[] objArr4 = (Object[]) accessgetonstarttransferpWrite.previous();
        int iSerializer = i3 - (((serializer() >> 5) - 1) - i4);
        if (iSerializer < i3) {
            objArr2 = objArr[iSerializer];
            objArr2.getClass();
        }
        RemoteActionCompatParcelizer(collection, i, objArr4, 32, objArr, iSerializer, objArr2);
    }

    public final int RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object[] objArr, int i, int i2, setVerticalGravity setverticalgravity, ArrayList arrayList, ArrayList arrayList2) {
        if (read(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = setverticalgravity.read;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : read();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        setverticalgravity.read = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final Object[] serializer(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = coil3.util.UtilsKt.read(i, i2);
        Object obj = objArr[i3];
        obj.getClass();
        Object objSerializer = serializer(i, i2 - 5, (Object[]) obj);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (read(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] objArr2 = read();
                onContentCardClicked.write(0, 0, i4, objArr, objArr2);
                objArr = objArr2;
            }
        }
        if (objSerializer == objArr[i3]) {
            return objArr;
        }
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
        objArrIconCompatParcelizer[i3] = objSerializer;
        return objArrIconCompatParcelizer;
    }

    public final Object[] serializer(int i, Object[] objArr, Object[] objArr2) {
        int i2 = coil3.util.UtilsKt.read(IconCompatParcelizer() - 1, i);
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
        if (i == 5) {
            objArrIconCompatParcelizer[i2] = objArr2;
            return objArrIconCompatParcelizer;
        }
        objArrIconCompatParcelizer[i2] = serializer(i - 5, (Object[]) objArrIconCompatParcelizer[i2], objArr2);
        return objArrIconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArr4;
        if (i3 < 1) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("requires at least one nullBuffer");
        }
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
        objArr2[0] = objArrIconCompatParcelizer;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            onContentCardClicked.write(size + 1, i4, i2, objArrIconCompatParcelizer, objArr3);
        } else {
            if (i3 == 1) {
                objArr4 = objArrIconCompatParcelizer;
            } else {
                objArr4 = read();
                i3--;
                objArr2[i3] = objArr4;
            }
            int i6 = i2 - (i5 - 31);
            onContentCardClicked.write(0, i6, i2, objArrIconCompatParcelizer, objArr3);
            onContentCardClicked.write(size + 1, i4, i6, objArrIconCompatParcelizer, objArr4);
            objArr3 = objArr4;
        }
        Iterator it = collection.iterator();
        serializer(objArrIconCompatParcelizer, i4, it);
        for (int i7 = 1; i7 < i3; i7++) {
            Object[] objArr5 = read();
            serializer(objArr5, 0, it);
            objArr2[i7] = objArr5;
        }
        serializer(objArr3, 0, it);
    }

    public final boolean read(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.read;
    }

    public final Object[] read(Object[] objArr, int i, int i2, Object obj, setVerticalGravity setverticalgravity) {
        Object obj2;
        int i3 = coil3.util.UtilsKt.read(i2, i);
        if (i == 0) {
            setverticalgravity.read = objArr[31];
            Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
            onContentCardClicked.write(i3 + 1, i3, 31, objArr, objArrIconCompatParcelizer);
            objArrIconCompatParcelizer[i3] = obj;
            return objArrIconCompatParcelizer;
        }
        Object[] objArrIconCompatParcelizer2 = IconCompatParcelizer(objArr);
        int i4 = i - 5;
        Object obj3 = objArrIconCompatParcelizer2[i3];
        obj3.getClass();
        objArrIconCompatParcelizer2[i3] = read((Object[]) obj3, i4, i2, obj, setverticalgravity);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = objArrIconCompatParcelizer2[i3]) == null) {
                break;
            }
            objArrIconCompatParcelizer2[i3] = read((Object[]) obj2, i4, 0, setverticalgravity.read, setverticalgravity);
        }
        return objArrIconCompatParcelizer2;
    }

    public final Object[] read(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("invalid buffersIterator");
        }
        if (i2 < 0) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
        int i3 = coil3.util.UtilsKt.read(i, i2);
        int i4 = i2 - 5;
        objArrIconCompatParcelizer[i3] = read((Object[]) objArrIconCompatParcelizer[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrIconCompatParcelizer[i3] = read((Object[]) objArrIconCompatParcelizer[i3], 0, i4, it);
        }
        return objArrIconCompatParcelizer;
    }

    public final Object[] write(Object[] objArr, int i, int i2, setVerticalGravity setverticalgravity) {
        int i3 = coil3.util.UtilsKt.read(i2, i);
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrIconCompatParcelizer = IconCompatParcelizer(objArr);
            onContentCardClicked.write(i3, i3 + 1, 32, objArr, objArrIconCompatParcelizer);
            objArrIconCompatParcelizer[31] = setverticalgravity.read;
            setverticalgravity.read = obj;
            return objArrIconCompatParcelizer;
        }
        int i4 = objArr[31] == null ? coil3.util.UtilsKt.read(serializer() - 1, i) : 31;
        Object[] objArrIconCompatParcelizer2 = IconCompatParcelizer(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = objArrIconCompatParcelizer2[i4];
                obj2.getClass();
                objArrIconCompatParcelizer2[i4] = write((Object[]) obj2, i5, 0, setverticalgravity);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = objArrIconCompatParcelizer2[i3];
        obj3.getClass();
        objArrIconCompatParcelizer2[i3] = write((Object[]) obj3, i5, i2, setverticalgravity);
        return objArrIconCompatParcelizer2;
    }

    public final Object[] write(int i, Object[] objArr) {
        if (read(objArr)) {
            onContentCardClicked.write(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArr2 = read();
        onContentCardClicked.write(i, 0, 32 - i, objArr, objArr2);
        return objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return RemoteActionCompatParcelizer(new SnapshotStateList$$ExternalSyntheticLambda0(2, collection));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iMediaMetadataCompat = MediaMetadataCompat();
        if (iMediaMetadataCompat < 32) {
            Object[] objArrIconCompatParcelizer = IconCompatParcelizer(this.serializer);
            objArrIconCompatParcelizer[iMediaMetadataCompat] = obj;
            this.serializer = objArrIconCompatParcelizer;
            this.write = IconCompatParcelizer() + 1;
        } else {
            serializer(this.IconCompatParcelizer, this.serializer, IconCompatParcelizer(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iMediaMetadataCompat = MediaMetadataCompat();
        Iterator it = collection.iterator();
        if (32 - iMediaMetadataCompat >= collection.size()) {
            Object[] objArrIconCompatParcelizer = IconCompatParcelizer(this.serializer);
            serializer(objArrIconCompatParcelizer, iMediaMetadataCompat, it);
            this.serializer = objArrIconCompatParcelizer;
            this.write = collection.size() + this.write;
            return true;
        }
        int size = ((collection.size() + iMediaMetadataCompat) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrIconCompatParcelizer2 = IconCompatParcelizer(this.serializer);
        serializer(objArrIconCompatParcelizer2, iMediaMetadataCompat, it);
        objArr[0] = objArrIconCompatParcelizer2;
        for (int i = 1; i < size; i++) {
            Object[] objArr2 = read();
            serializer(objArr2, 0, it);
            objArr[i] = objArr2;
        }
        this.IconCompatParcelizer = RemoteActionCompatParcelizer(this.IconCompatParcelizer, serializer(), objArr);
        Object[] objArr3 = read();
        serializer(objArr3, 0, it);
        this.serializer = objArr3;
        this.write = collection.size() + this.write;
        return true;
    }
}
