package o;

import androidx.compose.runtime.snapshots.SnapshotStateList$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 extends DefaultContentCardsActionListener implements Collection {
    public Object[] IconCompatParcelizer;
    public Object[] MediaBrowserCompatMediaItem;
    public accessisMainThread RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ write;

    @Override // o.DefaultContentCardsActionListener
    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final int MediaBrowserCompatMediaItem() {
        int i = this.read;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int serializer() {
        int i = this.read;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final int write() {
        return ((AbstractList) this).modCount;
    }

    public final int IconCompatParcelizer(SnapshotStateList$$ExternalSyntheticLambda0 snapshotStateList$$ExternalSyntheticLambda0, int i, setVerticalGravity setverticalgravity) {
        int iSerializer = serializer(snapshotStateList$$ExternalSyntheticLambda0, this.MediaBrowserCompatMediaItem, i, setverticalgravity);
        if (iSerializer == i) {
            return i;
        }
        Object objRemoteActionCompatParcelizer = setverticalgravity.RemoteActionCompatParcelizer();
        objRemoteActionCompatParcelizer.getClass();
        Object[] objArr = (Object[]) objRemoteActionCompatParcelizer;
        Arrays.fill(objArr, iSerializer, i, (Object) null);
        RemoteActionCompatParcelizer(objArr);
        this.read -= i - iSerializer;
        return iSerializer;
    }

    public final Object[] RemoteActionCompatParcelizer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.RemoteActionCompatParcelizer;
        return objArr;
    }

    public final Object[] RemoteActionCompatParcelizer(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.RemoteActionCompatParcelizer;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        coil3.ExtrasKt.RemoteActionCompatParcelizer(i, this.read);
        return new r8lambdaPlccRZq9cp6b7Y9IHZu8w6Bc8w(this, i);
    }

    public final Object[] serializer(Object[] objArr) {
        if (objArr == null) {
            return RemoteActionCompatParcelizer();
        }
        if (write(objArr)) {
            return objArr;
        }
        Object[] objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        onContentCardClicked.IconCompatParcelizer(0, length, 6, objArr, objArrRemoteActionCompatParcelizer);
        return objArrRemoteActionCompatParcelizer;
    }

    public final Object[] serializer(Object[] objArr, int i, Object[][] objArr2) {
        r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(objArr2);
        int i2 = this.serializer;
        Object[] objArrSerializer = (i >> 5) < (1 << i2) ? serializer(objArr, i, i2, r8lambdaorcgh_zecjpqysbjv51vn1ttu44) : serializer(objArr);
        while (r8lambdaorcgh_zecjpqysbjv51vn1ttu44.hasNext()) {
            this.serializer += 5;
            objArrSerializer = RemoteActionCompatParcelizer((Object) objArrSerializer);
            int i3 = this.serializer;
            serializer(objArrSerializer, 1 << i3, i3, r8lambdaorcgh_zecjpqysbjv51vn1ttu44);
        }
        return objArrSerializer;
    }

    public final Object[] write(Object[] objArr, int i, int i2, setVerticalGravity setverticalgravity) {
        Object[] objArrWrite;
        int iRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(i2 - 1, i);
        if (i == 5) {
            setverticalgravity.write(objArr[iRemoteActionCompatParcelizer]);
            objArrWrite = null;
        } else {
            Object obj = objArr[iRemoteActionCompatParcelizer];
            obj.getClass();
            objArrWrite = write((Object[]) obj, i - 5, i2, setverticalgravity);
        }
        if (objArrWrite == null && iRemoteActionCompatParcelizer == 0) {
            return null;
        }
        Object[] objArrSerializer = serializer(objArr);
        objArrSerializer[iRemoteActionCompatParcelizer] = objArrWrite;
        return objArrSerializer;
    }

    public r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.serializer = i;
        this.write = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
        this.RemoteActionCompatParcelizer = new accessisMainThread();
        this.IconCompatParcelizer = objArr;
        this.MediaBrowserCompatMediaItem = objArr2;
        this.read = r8lambdaiidsddyirtymdul5lt6pmt2zysq.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Object[] objArrRemoteActionCompatParcelizer;
        collection.getClass();
        coil3.ExtrasKt.RemoteActionCompatParcelizer(i, this.read);
        if (i == this.read) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.read - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = collection.size();
            Object[] objArr = this.MediaBrowserCompatMediaItem;
            Object[] objArrSerializer = serializer(objArr);
            onContentCardClicked.write((((size2 + i) - 1) & 31) + 1, i3, MediaBrowserCompatMediaItem(), objArr, objArrSerializer);
            serializer(objArrSerializer, i3, collection.iterator());
            RemoteActionCompatParcelizer(objArrSerializer);
            this.read = collection.size() + this.read;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        int size3 = collection.size() + this.read;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= serializer()) {
            objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            read(collection, i, this.MediaBrowserCompatMediaItem, iMediaBrowserCompatMediaItem, objArr2, size, objArrRemoteActionCompatParcelizer);
        } else {
            Object[] objArr3 = this.MediaBrowserCompatMediaItem;
            if (size3 > iMediaBrowserCompatMediaItem) {
                int i4 = size3 - iMediaBrowserCompatMediaItem;
                objArrRemoteActionCompatParcelizer = IconCompatParcelizer(i4, objArr3);
                write(collection, i, i4, objArr2, size, objArrRemoteActionCompatParcelizer);
            } else {
                objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                int i5 = iMediaBrowserCompatMediaItem - size3;
                onContentCardClicked.write(0, i5, iMediaBrowserCompatMediaItem, objArr3, objArrRemoteActionCompatParcelizer);
                int i6 = 32 - i5;
                Object[] objArrIconCompatParcelizer = IconCompatParcelizer(i6, this.MediaBrowserCompatMediaItem);
                int i7 = size - 1;
                objArr2[i7] = objArrIconCompatParcelizer;
                write(collection, i, i6, objArr2, i7, objArrIconCompatParcelizer);
            }
        }
        IconCompatParcelizer(serializer(this.IconCompatParcelizer, i2, objArr2));
        RemoteActionCompatParcelizer(objArrRemoteActionCompatParcelizer);
        this.read = collection.size() + this.read;
        return true;
    }

    public final void read(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrRemoteActionCompatParcelizer;
        if (i3 >= 1) {
            Object[] objArrSerializer = serializer(objArr);
            objArr2[0] = objArrSerializer;
            int i4 = i & 31;
            int size = ((collection.size() + i) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                onContentCardClicked.write(size + 1, i4, i2, objArrSerializer, objArr3);
            } else {
                if (i3 == 1) {
                    objArrRemoteActionCompatParcelizer = objArrSerializer;
                } else {
                    objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                    i3--;
                    objArr2[i3] = objArrRemoteActionCompatParcelizer;
                }
                int i6 = i2 - (i5 - 31);
                onContentCardClicked.write(0, i6, i2, objArrSerializer, objArr3);
                onContentCardClicked.write(size + 1, i4, i6, objArrSerializer, objArrRemoteActionCompatParcelizer);
                objArr3 = objArrRemoteActionCompatParcelizer;
            }
            Iterator it = collection.iterator();
            serializer(objArrSerializer, i4, it);
            for (int i7 = 1; i7 < i3; i7++) {
                Object[] objArrRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
                serializer(objArrRemoteActionCompatParcelizer2, 0, it);
                objArr2[i7] = objArrRemoteActionCompatParcelizer2;
            }
            serializer(objArr3, 0, it);
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        collection.getClass();
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        SnapshotStateList$$ExternalSyntheticLambda0 snapshotStateList$$ExternalSyntheticLambda0 = new SnapshotStateList$$ExternalSyntheticLambda0(3, collection);
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        Object[] objArrIconCompatParcelizer = null;
        setVerticalGravity setverticalgravity = new setVerticalGravity(null);
        if (this.IconCompatParcelizer != null) {
            r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0 r8lambdaho2ctdbwcctnsem6cphf2dek6m0 = read(0);
            int i2 = 32;
            int iSerializer = 32;
            while (iSerializer == 32 && r8lambdaho2ctdbwcctnsem6cphf2dek6m0.hasNext()) {
                iSerializer = serializer(snapshotStateList$$ExternalSyntheticLambda0, (Object[]) r8lambdaho2ctdbwcctnsem6cphf2dek6m0.next(), 32, setverticalgravity);
            }
            if (iSerializer == 32) {
                int iIconCompatParcelizer = IconCompatParcelizer(snapshotStateList$$ExternalSyntheticLambda0, iMediaBrowserCompatMediaItem, setverticalgravity);
                if (iIconCompatParcelizer == 0) {
                    RemoteActionCompatParcelizer(this.read, this.serializer, this.IconCompatParcelizer);
                }
                if (iIconCompatParcelizer != iMediaBrowserCompatMediaItem) {
                }
            } else {
                int i3 = (r8lambdaho2ctdbwcctnsem6cphf2dek6m0.serializer - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iRemoteActionCompatParcelizer = iSerializer;
                while (r8lambdaho2ctdbwcctnsem6cphf2dek6m0.hasNext()) {
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(snapshotStateList$$ExternalSyntheticLambda0, (Object[]) r8lambdaho2ctdbwcctnsem6cphf2dek6m0.next(), 32, iRemoteActionCompatParcelizer, setverticalgravity, arrayList2, arrayList);
                    i2 = i2;
                    i3 = i3;
                }
                int i4 = i3;
                int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(snapshotStateList$$ExternalSyntheticLambda0, this.MediaBrowserCompatMediaItem, iMediaBrowserCompatMediaItem, iRemoteActionCompatParcelizer, setverticalgravity, arrayList2, arrayList);
                Object objRemoteActionCompatParcelizer = setverticalgravity.RemoteActionCompatParcelizer();
                objRemoteActionCompatParcelizer.getClass();
                Object[] objArr = (Object[]) objRemoteActionCompatParcelizer;
                Arrays.fill(objArr, iRemoteActionCompatParcelizer2, i2, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrSerializer = this.IconCompatParcelizer;
                if (zIsEmpty) {
                    objArrSerializer.getClass();
                } else {
                    objArrSerializer = serializer(objArrSerializer, i4, this.serializer, arrayList.iterator());
                }
                int size = i4 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                    return false;
                }
                if (size == 0) {
                    this.serializer = 0;
                } else {
                    char c = 0;
                    int i5 = size - 1;
                    while (true) {
                        i = this.serializer;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.serializer = i - 5;
                        Object[] objArr2 = objArrSerializer[c];
                        objArr2.getClass();
                        objArrSerializer = objArr2;
                        c = 0;
                    }
                    objArrIconCompatParcelizer = IconCompatParcelizer(i5, i, objArrSerializer);
                }
                IconCompatParcelizer(objArrIconCompatParcelizer);
                RemoteActionCompatParcelizer(objArr);
                this.read = size + iRemoteActionCompatParcelizer2;
            }
            z = true;
        } else if (IconCompatParcelizer(snapshotStateList$$ExternalSyntheticLambda0, iMediaBrowserCompatMediaItem, setverticalgravity) != iMediaBrowserCompatMediaItem) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object serializer(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.read - i;
        Object[] objArr2 = this.MediaBrowserCompatMediaItem;
        if (i4 == 1) {
            Object obj = objArr2[0];
            RemoteActionCompatParcelizer(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrSerializer = serializer(objArr2);
        onContentCardClicked.write(i3, i3 + 1, i4, objArr2, objArrSerializer);
        objArrSerializer[i4 - 1] = null;
        IconCompatParcelizer(objArr);
        RemoteActionCompatParcelizer(objArrSerializer);
        this.read = (i + i4) - 1;
        this.serializer = i2;
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
        coil3.ExtrasKt.serializer(i, IconCompatParcelizer());
        ((AbstractList) this).modCount++;
        int iSerializer = serializer();
        if (i >= iSerializer) {
            return serializer(this.IconCompatParcelizer, iSerializer, this.serializer, i - iSerializer);
        }
        setVerticalGravity setverticalgravity = new setVerticalGravity(this.MediaBrowserCompatMediaItem[0]);
        Object[] objArr = this.IconCompatParcelizer;
        objArr.getClass();
        serializer(IconCompatParcelizer(objArr, this.serializer, i, setverticalgravity), iSerializer, this.serializer, 0);
        return setverticalgravity.RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            IconCompatParcelizer((Object[]) null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            RemoteActionCompatParcelizer(objArr);
            this.read = i;
            this.serializer = i2;
            return;
        }
        setVerticalGravity setverticalgravity = new setVerticalGravity(null);
        objArr.getClass();
        Object[] objArrWrite = write(objArr, i2, i, setverticalgravity);
        objArrWrite.getClass();
        Object objRemoteActionCompatParcelizer = setverticalgravity.RemoteActionCompatParcelizer();
        objRemoteActionCompatParcelizer.getClass();
        RemoteActionCompatParcelizer((Object[]) objRemoteActionCompatParcelizer);
        this.read = i;
        if (objArrWrite[1] == null) {
            IconCompatParcelizer((Object[]) objArrWrite[0]);
            this.serializer = i2 - 5;
        } else {
            IconCompatParcelizer(objArrWrite);
            this.serializer = i2;
        }
    }

    public final Object[] RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, Object obj, setVerticalGravity setverticalgravity) {
        int iRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(i2, i);
        Object[] objArrSerializer = serializer(objArr);
        if (i != 0) {
            Object obj2 = objArrSerializer[iRemoteActionCompatParcelizer];
            obj2.getClass();
            objArrSerializer[iRemoteActionCompatParcelizer] = RemoteActionCompatParcelizer((Object[]) obj2, i - 5, i2, obj, setverticalgravity);
            return objArrSerializer;
        }
        if (objArrSerializer != objArr) {
            ((AbstractList) this).modCount++;
        }
        setverticalgravity.write(objArrSerializer[iRemoteActionCompatParcelizer]);
        objArrSerializer[iRemoteActionCompatParcelizer] = obj;
        return objArrSerializer;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        coil3.ExtrasKt.RemoteActionCompatParcelizer(i, IconCompatParcelizer());
        if (i == IconCompatParcelizer()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iSerializer = serializer();
        if (i >= iSerializer) {
            serializer(i - iSerializer, obj, this.IconCompatParcelizer);
            return;
        }
        setVerticalGravity setverticalgravity = new setVerticalGravity(null);
        Object[] objArr = this.IconCompatParcelizer;
        objArr.getClass();
        serializer(0, setverticalgravity.RemoteActionCompatParcelizer(), read(objArr, this.serializer, i, obj, setverticalgravity));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        coil3.ExtrasKt.serializer(i, IconCompatParcelizer());
        if (serializer() <= i) {
            objArr = this.MediaBrowserCompatMediaItem;
        } else {
            objArr = this.IconCompatParcelizer;
            objArr.getClass();
            for (int i2 = this.serializer; i2 > 0; i2 -= 5) {
                Object obj = objArr[coil3.util.UtilsKt.RemoteActionCompatParcelizer(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0 read(int i) {
        if (this.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
            return null;
        }
        int iSerializer = serializer() >> 5;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(i, iSerializer);
        int i2 = this.serializer;
        Object[] objArr = this.IconCompatParcelizer;
        if (i2 == 0) {
            objArr.getClass();
            return new r8lambdaM5AFp_9ANgJYA3xS2lkS8pKRSU(i, objArr);
        }
        objArr.getClass();
        return new r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw(objArr, i, iSerializer, i2 / 5);
    }

    public final r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ read() {
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ persistentVector = this.write;
        if (persistentVector == null) {
            Object[] objArr = this.IconCompatParcelizer;
            Object[] objArr2 = this.MediaBrowserCompatMediaItem;
            this.RemoteActionCompatParcelizer = new accessisMainThread();
            if (objArr == null) {
                persistentVector = objArr2.length == 0 ? kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.RemoteActionCompatParcelizer : new kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(Arrays.copyOf(objArr2, this.read));
            } else {
                persistentVector = new kotlinx.collections.immutable.implementations.immutableList.PersistentVector(this.read, this.serializer, objArr, objArr2);
            }
            this.write = persistentVector;
        }
        return persistentVector;
    }

    public final void serializer(int i, Object obj, Object[] objArr) {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        Object[] objArrSerializer = serializer(this.MediaBrowserCompatMediaItem);
        Object[] objArr2 = this.MediaBrowserCompatMediaItem;
        if (iMediaBrowserCompatMediaItem >= 32) {
            Object obj2 = objArr2[31];
            onContentCardClicked.write(i + 1, i, 31, objArr2, objArrSerializer);
            objArrSerializer[i] = obj;
            write(objArr, objArrSerializer, RemoteActionCompatParcelizer(obj2));
            return;
        }
        onContentCardClicked.write(i + 1, i, iMediaBrowserCompatMediaItem, objArr2, objArrSerializer);
        objArrSerializer[i] = obj;
        IconCompatParcelizer(objArr);
        RemoteActionCompatParcelizer(objArrSerializer);
        this.read++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        coil3.ExtrasKt.serializer(i, IconCompatParcelizer());
        if (serializer() > i) {
            setVerticalGravity setverticalgravity = new setVerticalGravity(null);
            Object[] objArr = this.IconCompatParcelizer;
            objArr.getClass();
            IconCompatParcelizer(RemoteActionCompatParcelizer(objArr, this.serializer, i, obj, setverticalgravity));
            return setverticalgravity.RemoteActionCompatParcelizer();
        }
        Object[] objArrSerializer = serializer(this.MediaBrowserCompatMediaItem);
        if (objArrSerializer != this.MediaBrowserCompatMediaItem) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrSerializer[i2];
        objArrSerializer[i2] = obj;
        RemoteActionCompatParcelizer(objArrSerializer);
        return obj2;
    }

    public final void write(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.read;
        int i2 = this.serializer;
        if ((i >> 5) > (1 << i2)) {
            IconCompatParcelizer(serializer(this.serializer + 5, RemoteActionCompatParcelizer((Object) objArr), objArr2));
            RemoteActionCompatParcelizer(objArr3);
            this.serializer += 5;
            this.read++;
            return;
        }
        if (objArr == null) {
            IconCompatParcelizer(objArr2);
            RemoteActionCompatParcelizer(objArr3);
            this.read++;
        } else {
            IconCompatParcelizer(serializer(i2, objArr, objArr2));
            RemoteActionCompatParcelizer(objArr3);
            this.read++;
        }
    }

    public final void IconCompatParcelizer(Object[] objArr) {
        if (objArr != this.IconCompatParcelizer) {
            this.write = null;
            this.IconCompatParcelizer = objArr;
        }
    }

    public final void RemoteActionCompatParcelizer(Object[] objArr) {
        if (objArr != this.MediaBrowserCompatMediaItem) {
            this.write = null;
            this.MediaBrowserCompatMediaItem = objArr;
        }
    }

    public final Object[] IconCompatParcelizer(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(i, i2);
        Object obj = objArr[iRemoteActionCompatParcelizer];
        obj.getClass();
        Object objIconCompatParcelizer = IconCompatParcelizer(i, i2 - 5, (Object[]) obj);
        if (iRemoteActionCompatParcelizer < 31) {
            int i3 = iRemoteActionCompatParcelizer + 1;
            if (objArr[i3] != null) {
                if (write(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                onContentCardClicked.write(0, 0, i3, objArr, objArrRemoteActionCompatParcelizer);
                objArr = objArrRemoteActionCompatParcelizer;
            }
        }
        if (objIconCompatParcelizer == objArr[iRemoteActionCompatParcelizer]) {
            return objArr;
        }
        Object[] objArrSerializer = serializer(objArr);
        objArrSerializer[iRemoteActionCompatParcelizer] = objIconCompatParcelizer;
        return objArrSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int RemoteActionCompatParcelizer(SnapshotStateList$$ExternalSyntheticLambda0 snapshotStateList$$ExternalSyntheticLambda0, Object[] objArr, int i, int i2, setVerticalGravity setverticalgravity, ArrayList arrayList, ArrayList arrayList2) {
        if (write(objArr)) {
            arrayList.add(objArr);
        }
        Object objRemoteActionCompatParcelizer = setverticalgravity.RemoteActionCompatParcelizer();
        objRemoteActionCompatParcelizer.getClass();
        Object[] objArr2 = (Object[]) objRemoteActionCompatParcelizer;
        Object[] objArrRemoteActionCompatParcelizer = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) snapshotStateList$$ExternalSyntheticLambda0.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrRemoteActionCompatParcelizer = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : RemoteActionCompatParcelizer();
                    i2 = 0;
                }
                objArrRemoteActionCompatParcelizer[i2] = obj;
                i2++;
            }
        }
        setverticalgravity.write(objArrRemoteActionCompatParcelizer);
        if (objArr2 != setverticalgravity.RemoteActionCompatParcelizer()) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final Object[] serializer(int i, Object[] objArr, Object[] objArr2) {
        int iRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(IconCompatParcelizer() - 1, i);
        Object[] objArrSerializer = serializer(objArr);
        if (i == 5) {
            objArrSerializer[iRemoteActionCompatParcelizer] = objArr2;
            return objArrSerializer;
        }
        objArrSerializer[iRemoteActionCompatParcelizer] = serializer(i - 5, (Object[]) objArrSerializer[iRemoteActionCompatParcelizer], objArr2);
        return objArrSerializer;
    }

    public final void write(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0 r8lambdaho2ctdbwcctnsem6cphf2dek6m0 = read(serializer() >> 5);
        int i5 = i3;
        Object[] objArrIconCompatParcelizer = objArr2;
        while (r8lambdaho2ctdbwcctnsem6cphf2dek6m0.serializer - 1 != i4) {
            Object[] objArr3 = (Object[]) r8lambdaho2ctdbwcctnsem6cphf2dek6m0.previous();
            onContentCardClicked.write(0, 32 - i2, 32, objArr3, objArrIconCompatParcelizer);
            objArrIconCompatParcelizer = IconCompatParcelizer(i2, objArr3);
            i5--;
            objArr[i5] = objArrIconCompatParcelizer;
        }
        Object[] objArr4 = (Object[]) r8lambdaho2ctdbwcctnsem6cphf2dek6m0.previous();
        int iSerializer = i3 - (((serializer() >> 5) - 1) - i4);
        if (iSerializer < i3) {
            objArr2 = objArr[iSerializer];
            objArr2.getClass();
        }
        read(collection, i, objArr4, 32, objArr, iSerializer, objArr2);
    }

    public final Object[] serializer(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            return null;
        }
        if (i2 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrSerializer = serializer(objArr);
        int iRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(i, i2);
        int i3 = i2 - 5;
        objArrSerializer[iRemoteActionCompatParcelizer] = serializer((Object[]) objArrSerializer[iRemoteActionCompatParcelizer], i, i3, it);
        while (true) {
            iRemoteActionCompatParcelizer++;
            if (iRemoteActionCompatParcelizer >= 32 || !it.hasNext()) {
                break;
            }
            objArrSerializer[iRemoteActionCompatParcelizer] = serializer((Object[]) objArrSerializer[iRemoteActionCompatParcelizer], 0, i3, it);
        }
        return objArrSerializer;
    }

    public final boolean write(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.RemoteActionCompatParcelizer;
    }

    public final Object[] IconCompatParcelizer(Object[] objArr, int i, int i2, setVerticalGravity setverticalgravity) {
        int iRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(i2, i);
        if (i == 0) {
            Object obj = objArr[iRemoteActionCompatParcelizer];
            Object[] objArrSerializer = serializer(objArr);
            onContentCardClicked.write(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer + 1, 32, objArr, objArrSerializer);
            objArrSerializer[31] = setverticalgravity.RemoteActionCompatParcelizer();
            setverticalgravity.write(obj);
            return objArrSerializer;
        }
        int iRemoteActionCompatParcelizer2 = objArr[31] == null ? coil3.util.UtilsKt.RemoteActionCompatParcelizer(serializer() - 1, i) : 31;
        Object[] objArrSerializer2 = serializer(objArr);
        int i3 = i - 5;
        int i4 = iRemoteActionCompatParcelizer + 1;
        if (i4 <= iRemoteActionCompatParcelizer2) {
            while (true) {
                Object obj2 = objArrSerializer2[iRemoteActionCompatParcelizer2];
                obj2.getClass();
                objArrSerializer2[iRemoteActionCompatParcelizer2] = IconCompatParcelizer((Object[]) obj2, i3, 0, setverticalgravity);
                if (iRemoteActionCompatParcelizer2 == i4) {
                    break;
                }
                iRemoteActionCompatParcelizer2--;
            }
        }
        Object obj3 = objArrSerializer2[iRemoteActionCompatParcelizer];
        obj3.getClass();
        objArrSerializer2[iRemoteActionCompatParcelizer] = IconCompatParcelizer((Object[]) obj3, i3, i2, setverticalgravity);
        return objArrSerializer2;
    }

    public final Object[] read(Object[] objArr, int i, int i2, Object obj, setVerticalGravity setverticalgravity) {
        Object obj2;
        int iRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(i2, i);
        if (i == 0) {
            setverticalgravity.write(objArr[31]);
            Object[] objArrSerializer = serializer(objArr);
            onContentCardClicked.write(iRemoteActionCompatParcelizer + 1, iRemoteActionCompatParcelizer, 31, objArr, objArrSerializer);
            objArrSerializer[iRemoteActionCompatParcelizer] = obj;
            return objArrSerializer;
        }
        Object[] objArrSerializer2 = serializer(objArr);
        int i3 = i - 5;
        Object obj3 = objArrSerializer2[iRemoteActionCompatParcelizer];
        obj3.getClass();
        objArrSerializer2[iRemoteActionCompatParcelizer] = read((Object[]) obj3, i3, i2, obj, setverticalgravity);
        while (true) {
            iRemoteActionCompatParcelizer++;
            if (iRemoteActionCompatParcelizer >= 32 || (obj2 = objArrSerializer2[iRemoteActionCompatParcelizer]) == null) {
                break;
            }
            objArrSerializer2[iRemoteActionCompatParcelizer] = read((Object[]) obj2, i3, 0, setverticalgravity.RemoteActionCompatParcelizer(), setverticalgravity);
        }
        return objArrSerializer2;
    }

    public final Object[] IconCompatParcelizer(int i, Object[] objArr) {
        if (write(objArr)) {
            onContentCardClicked.write(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        onContentCardClicked.write(i, 0, 32 - i, objArr, objArrRemoteActionCompatParcelizer);
        return objArrRemoteActionCompatParcelizer;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (iMediaBrowserCompatMediaItem < 32) {
            Object[] objArrSerializer = serializer(this.MediaBrowserCompatMediaItem);
            objArrSerializer[iMediaBrowserCompatMediaItem] = obj;
            RemoteActionCompatParcelizer(objArrSerializer);
            this.read = IconCompatParcelizer() + 1;
        } else {
            write(this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, RemoteActionCompatParcelizer(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        Iterator it = collection.iterator();
        if (32 - iMediaBrowserCompatMediaItem >= collection.size()) {
            Object[] objArrSerializer = serializer(this.MediaBrowserCompatMediaItem);
            serializer(objArrSerializer, iMediaBrowserCompatMediaItem, it);
            RemoteActionCompatParcelizer(objArrSerializer);
            this.read = collection.size() + this.read;
            return true;
        }
        int size = ((collection.size() + iMediaBrowserCompatMediaItem) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrSerializer2 = serializer(this.MediaBrowserCompatMediaItem);
        serializer(objArrSerializer2, iMediaBrowserCompatMediaItem, it);
        objArr[0] = objArrSerializer2;
        for (int i = 1; i < size; i++) {
            Object[] objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            serializer(objArrRemoteActionCompatParcelizer, 0, it);
            objArr[i] = objArrRemoteActionCompatParcelizer;
        }
        IconCompatParcelizer(serializer(this.IconCompatParcelizer, serializer(), objArr));
        Object[] objArrRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        serializer(objArrRemoteActionCompatParcelizer2, 0, it);
        RemoteActionCompatParcelizer(objArrRemoteActionCompatParcelizer2);
        this.read = collection.size() + this.read;
        return true;
    }

    public final int serializer(SnapshotStateList$$ExternalSyntheticLambda0 snapshotStateList$$ExternalSyntheticLambda0, Object[] objArr, int i, setVerticalGravity setverticalgravity) {
        Object[] objArrSerializer = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) snapshotStateList$$ExternalSyntheticLambda0.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrSerializer = serializer(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrSerializer[i2] = obj;
                i2++;
            }
        }
        setverticalgravity.write(objArrSerializer);
        return i2;
    }
}
