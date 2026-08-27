package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeContentCardsManager extends DefaultContentCardsActionListener {
    public static final Object[] write = new Object[0];
    public int RemoteActionCompatParcelizer;
    public Object[] read;
    public int serializer;

    @Override // o.DefaultContentCardsActionListener
    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return IconCompatParcelizer() == 0;
    }

    @Override // o.DefaultContentCardsActionListener
    public final Object IconCompatParcelizer(int i) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.RemoteActionCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        if (i == IconCompatParcelizer() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        MediaBrowserCompatMediaItem();
        int i3 = read(this.serializer + i);
        Object[] objArr = this.read;
        Object obj = objArr[i3];
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = this.serializer;
        if (i < (i4 >> 1)) {
            if (i3 >= i5) {
                onContentCardClicked.write(i5 + 1, i5, i3, objArr, objArr);
            } else {
                onContentCardClicked.write(1, 0, i3, objArr, objArr);
                Object[] objArr2 = this.read;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.serializer;
                onContentCardClicked.write(i6 + 1, i6, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.read;
            int i7 = this.serializer;
            objArr3[i7] = null;
            this.serializer = write(i7);
        } else {
            int i8 = read((IconCompatParcelizer() - 1) + i5);
            Object[] objArr4 = this.read;
            if (i3 <= i8) {
                onContentCardClicked.write(i3, i3 + 1, i8 + 1, objArr4, objArr4);
            } else {
                onContentCardClicked.write(i3, i3 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.read;
                objArr5[objArr5.length - 1] = objArr5[0];
                onContentCardClicked.write(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.read[i8] = null;
        }
        this.RemoteActionCompatParcelizer--;
        return obj;
    }

    public final int RemoteActionCompatParcelizer(int i) {
        return i < 0 ? i + this.read.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.RemoteActionCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, i2);
        if (i == this.RemoteActionCompatParcelizer) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        MediaBrowserCompatMediaItem();
        serializer(this.RemoteActionCompatParcelizer + 1);
        int i3 = read(this.serializer + i);
        int i4 = this.RemoteActionCompatParcelizer;
        if (i < ((i4 + 1) >> 1)) {
            int iMediaBrowserCompatMediaItem = i3 == 0 ? onContentCardClicked.MediaBrowserCompatMediaItem(this.read) : i3 - 1;
            int i5 = this.serializer;
            int iMediaBrowserCompatMediaItem2 = i5 == 0 ? onContentCardClicked.MediaBrowserCompatMediaItem(this.read) : i5 - 1;
            int i6 = this.serializer;
            Object[] objArr = this.read;
            if (iMediaBrowserCompatMediaItem >= i6) {
                objArr[iMediaBrowserCompatMediaItem2] = objArr[i6];
                onContentCardClicked.write(i6, i6 + 1, iMediaBrowserCompatMediaItem + 1, objArr, objArr);
            } else {
                onContentCardClicked.write(i6 - 1, i6, objArr.length, objArr, objArr);
                Object[] objArr2 = this.read;
                objArr2[objArr2.length - 1] = objArr2[0];
                onContentCardClicked.write(0, 1, iMediaBrowserCompatMediaItem + 1, objArr2, objArr2);
            }
            this.read[iMediaBrowserCompatMediaItem] = obj;
            this.serializer = iMediaBrowserCompatMediaItem2;
        } else {
            int i7 = read(i4 + this.serializer);
            Object[] objArr3 = this.read;
            if (i3 < i7) {
                onContentCardClicked.write(i3 + 1, i3, i7, objArr3, objArr3);
            } else {
                onContentCardClicked.write(1, 0, i7, objArr3, objArr3);
                Object[] objArr4 = this.read;
                objArr4[0] = objArr4[objArr4.length - 1];
                onContentCardClicked.write(i3 + 1, i3, objArr4.length - 1, objArr4, objArr4);
            }
            this.read[i3] = obj;
        }
        this.RemoteActionCompatParcelizer++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.RemoteActionCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        return this.read[read(this.serializer + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i2 = read(IconCompatParcelizer() + this.serializer);
        int length = this.serializer;
        if (length < i2) {
            while (length < i2) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read[length]}, getCieXyz.write())).booleanValue()) {
                    i = this.serializer;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.serializer) < i2) {
            return -1;
        }
        int length2 = this.read.length;
        while (length < length2) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read[length]}, getCieXyz.write())).booleanValue()) {
                i = this.serializer;
            } else {
                length++;
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read[i3]}, getCieXyz.write())).booleanValue()) {
                length = i3 + this.read.length;
                i = this.serializer;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iMediaBrowserCompatMediaItem;
        int i;
        int i2 = read(IconCompatParcelizer() + this.serializer);
        int i3 = this.serializer;
        if (i3 < i2) {
            iMediaBrowserCompatMediaItem = i2 - 1;
            if (i3 <= iMediaBrowserCompatMediaItem) {
                while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read[iMediaBrowserCompatMediaItem]}, getCieXyz.write())).booleanValue()) {
                    if (iMediaBrowserCompatMediaItem != i3) {
                        iMediaBrowserCompatMediaItem--;
                    }
                }
                i = this.serializer;
                return iMediaBrowserCompatMediaItem - i;
            }
            return -1;
        }
        if (!isEmpty() && this.serializer >= i2) {
            int i4 = i2 - 1;
            while (true) {
                Object[] objArr = this.read;
                if (-1 >= i4) {
                    iMediaBrowserCompatMediaItem = onContentCardClicked.MediaBrowserCompatMediaItem(objArr);
                    int i5 = this.serializer;
                    if (i5 <= iMediaBrowserCompatMediaItem) {
                        while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read[iMediaBrowserCompatMediaItem]}, getCieXyz.write())).booleanValue()) {
                            if (iMediaBrowserCompatMediaItem != i5) {
                                iMediaBrowserCompatMediaItem--;
                            }
                        }
                        i = this.serializer;
                        break;
                    }
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, objArr[i4]}, getCieXyz.write())).booleanValue()) {
                        iMediaBrowserCompatMediaItem = i4 + this.read.length;
                        i = this.serializer;
                        break;
                    }
                    i4--;
                }
            }
            return iMediaBrowserCompatMediaItem - i;
        }
        return -1;
    }

    public final int read(int i) {
        Object[] objArr = this.read;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i3 = this.RemoteActionCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.RemoteActionCompatParcelizer) {
            clear();
            return;
        }
        if (i4 == 1) {
            IconCompatParcelizer(i);
            return;
        }
        MediaBrowserCompatMediaItem();
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = this.serializer;
        if (i < i5 - i2) {
            int iRemoteActionCompatParcelizer = read((i - 1) + i6);
            int iRemoteActionCompatParcelizer2 = read(this.serializer + (i2 - 1));
            while (i > 0) {
                int i7 = iRemoteActionCompatParcelizer + 1;
                int iMin = Math.min(i, Math.min(i7, iRemoteActionCompatParcelizer2 + 1));
                Object[] objArr = this.read;
                int i8 = iRemoteActionCompatParcelizer2 - iMin;
                int i9 = iRemoteActionCompatParcelizer - iMin;
                onContentCardClicked.write(i8 + 1, i9 + 1, i7, objArr, objArr);
                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i9);
                iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i8);
                i -= iMin;
            }
            int i10 = read(this.serializer + i4);
            read(this.serializer, i10);
            this.serializer = i10;
        } else {
            int i11 = read(i6 + i2);
            int i12 = read(this.serializer + i);
            int i13 = this.RemoteActionCompatParcelizer;
            while (true) {
                i13 -= i2;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.read;
                i2 = Math.min(i13, Math.min(objArr2.length - i11, objArr2.length - i12));
                Object[] objArr3 = this.read;
                int i14 = i11 + i2;
                onContentCardClicked.write(i12, i11, i14, objArr3, objArr3);
                i11 = read(i14);
                i12 = read(i12 + i2);
            }
            int i15 = read(this.RemoteActionCompatParcelizer + this.serializer);
            read(RemoteActionCompatParcelizer(i15 - i4), i15);
        }
        this.RemoteActionCompatParcelizer -= i4;
    }

    public final void serializer(int i) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Deque is too big.");
            return;
        }
        Object[] objArr = this.read;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == write) {
            if (i < 10) {
                i = 10;
            }
            this.read = new Object[i];
            return;
        }
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int length = objArr.length;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        Object[] objArr2 = new Object[DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(length, i)];
        Object[] objArr3 = this.read;
        onContentCardClicked.write(0, this.serializer, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.read;
        int length2 = objArr4.length;
        int i2 = this.serializer;
        onContentCardClicked.write(length2 - i2, 0, i2, objArr4, objArr2);
        this.serializer = 0;
        this.read = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.RemoteActionCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        int i3 = read(this.serializer + i);
        Object[] objArr = this.read;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final int write(int i) {
        if (i == onContentCardClicked.MediaBrowserCompatMediaItem(this.read)) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.RemoteActionCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.RemoteActionCompatParcelizer) {
            return addAll(collection);
        }
        MediaBrowserCompatMediaItem();
        serializer(collection.size() + this.RemoteActionCompatParcelizer);
        int i3 = read(this.RemoteActionCompatParcelizer + this.serializer);
        int i4 = read(this.serializer + i);
        int size = collection.size();
        if (i < ((this.RemoteActionCompatParcelizer + 1) >> 1)) {
            int i5 = this.serializer;
            int length = i5 - size;
            Object[] objArr = this.read;
            if (i4 < i5) {
                onContentCardClicked.write(length, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.read;
                if (size >= i4) {
                    onContentCardClicked.write(objArr2.length - size, 0, i4, objArr2, objArr2);
                } else {
                    onContentCardClicked.write(objArr2.length - size, 0, size, objArr2, objArr2);
                    Object[] objArr3 = this.read;
                    onContentCardClicked.write(0, size, i4, objArr3, objArr3);
                }
            } else if (length >= 0) {
                onContentCardClicked.write(length, i5, i4, objArr, objArr);
            } else {
                length += objArr.length;
                int length2 = objArr.length - length;
                if (length2 >= i4 - i5) {
                    onContentCardClicked.write(length, i5, i4, objArr, objArr);
                } else {
                    onContentCardClicked.write(length, i5, i5 + length2, objArr, objArr);
                    Object[] objArr4 = this.read;
                    onContentCardClicked.write(0, this.serializer + length2, i4, objArr4, objArr4);
                }
            }
            this.serializer = length;
            IconCompatParcelizer(RemoteActionCompatParcelizer(i4 - size), collection);
            return true;
        }
        int i6 = i4 + size;
        Object[] objArr5 = this.read;
        if (i4 < i3) {
            int i7 = size + i3;
            if (i7 <= objArr5.length) {
                onContentCardClicked.write(i6, i4, i3, objArr5, objArr5);
            } else if (i6 >= objArr5.length) {
                onContentCardClicked.write(i6 - objArr5.length, i4, i3, objArr5, objArr5);
            } else {
                int length3 = i3 - (i7 - objArr5.length);
                onContentCardClicked.write(0, length3, i3, objArr5, objArr5);
                Object[] objArr6 = this.read;
                onContentCardClicked.write(i6, i4, length3, objArr6, objArr6);
            }
        } else {
            onContentCardClicked.write(size, 0, i3, objArr5, objArr5);
            Object[] objArr7 = this.read;
            if (i6 >= objArr7.length) {
                onContentCardClicked.write(i6 - objArr7.length, i4, objArr7.length, objArr7, objArr7);
            } else {
                onContentCardClicked.write(0, objArr7.length - size, objArr7.length, objArr7, objArr7);
                Object[] objArr8 = this.read;
                onContentCardClicked.write(i6, i4, objArr8.length - size, objArr8, objArr8);
            }
        }
        IconCompatParcelizer(i4, collection);
        return true;
    }

    public final void addFirst(Object obj) {
        MediaBrowserCompatMediaItem();
        serializer(this.RemoteActionCompatParcelizer + 1);
        int i = this.serializer;
        int iMediaBrowserCompatMediaItem = i == 0 ? onContentCardClicked.MediaBrowserCompatMediaItem(this.read) : i - 1;
        this.serializer = iMediaBrowserCompatMediaItem;
        this.read[iMediaBrowserCompatMediaItem] = obj;
        this.RemoteActionCompatParcelizer++;
    }

    public final void addLast(Object obj) {
        MediaBrowserCompatMediaItem();
        serializer(IconCompatParcelizer() + 1);
        this.read[read(IconCompatParcelizer() + this.serializer)] = obj;
        this.RemoteActionCompatParcelizer = IconCompatParcelizer() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iWrite;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.read.length != 0) {
            int i = read(IconCompatParcelizer() + this.serializer);
            int i2 = this.serializer;
            if (i2 < i) {
                iWrite = i2;
                while (true) {
                    objArr = this.read;
                    if (i2 >= i) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.read[iWrite] = obj;
                        iWrite++;
                    }
                    i2++;
                }
                onContentCardClicked.write(iWrite, i, null, objArr);
            } else {
                int length = this.read.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.read;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.read[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iWrite = read(i3);
                for (int i4 = 0; i4 < i; i4++) {
                    Object[] objArr3 = this.read;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.read[iWrite] = obj3;
                        iWrite = write(iWrite);
                    }
                }
                z = z2;
            }
            if (z) {
                MediaBrowserCompatMediaItem();
                this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iWrite - this.serializer);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iWrite;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.read.length != 0) {
            int i = read(IconCompatParcelizer() + this.serializer);
            int i2 = this.serializer;
            if (i2 < i) {
                iWrite = i2;
                while (true) {
                    objArr = this.read;
                    if (i2 >= i) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        this.read[iWrite] = obj;
                        iWrite++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                onContentCardClicked.write(iWrite, i, null, objArr);
            } else {
                int length = this.read.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.read;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.read[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                iWrite = read(i3);
                for (int i4 = 0; i4 < i; i4++) {
                    Object[] objArr3 = this.read;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.read[iWrite] = obj3;
                        iWrite = write(iWrite);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                MediaBrowserCompatMediaItem();
                this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iWrite - this.serializer);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.RemoteActionCompatParcelizer;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int i2 = read(this.RemoteActionCompatParcelizer + this.serializer);
        int i3 = this.serializer;
        if (i3 < i2) {
            onContentCardClicked.IconCompatParcelizer(i3, i2, 2, this.read, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.read;
            onContentCardClicked.write(0, this.serializer, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.read;
            onContentCardClicked.write(objArr3.length - this.serializer, 0, i2, objArr3, objArr);
        }
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    public final void IconCompatParcelizer(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.read.length;
        while (i < length && it.hasNext()) {
            this.read[i] = it.next();
            i++;
        }
        int i2 = this.serializer;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.read[i3] = it.next();
        }
        this.RemoteActionCompatParcelizer = collection.size() + this.RemoteActionCompatParcelizer;
    }

    public final void MediaBrowserCompatMediaItem() {
        ((java.util.AbstractList) this).modCount++;
    }

    public BrazeContentCardsManager(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = write;
        } else {
            if (i <= 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.read = objArr;
    }

    public final void read(int i, int i2) {
        Object[] objArr = this.read;
        if (i < i2) {
            onContentCardClicked.write(i, i2, null, objArr);
        } else {
            onContentCardClicked.write(i, objArr.length, null, objArr);
            onContentCardClicked.write(0, i2, null, this.read);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            MediaBrowserCompatMediaItem();
            read(this.serializer, read(IconCompatParcelizer() + this.serializer));
        }
        this.serializer = 0;
        this.RemoteActionCompatParcelizer = 0;
    }

    public final Object read() {
        if (!isEmpty()) {
            return this.read[this.serializer];
        }
        DrawableTransformation.write("ArrayDeque is empty.");
        return null;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            DrawableTransformation.write("ArrayDeque is empty.");
            return null;
        }
        MediaBrowserCompatMediaItem();
        Object[] objArr = this.read;
        int i = this.serializer;
        Object obj = objArr[i];
        objArr[i] = null;
        this.serializer = write(i);
        this.RemoteActionCompatParcelizer = IconCompatParcelizer() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            DrawableTransformation.write("ArrayDeque is empty.");
            return null;
        }
        MediaBrowserCompatMediaItem();
        int i = read((size() - 1) + this.serializer);
        Object[] objArr = this.read;
        Object obj = objArr[i];
        objArr[i] = null;
        this.RemoteActionCompatParcelizer = IconCompatParcelizer() - 1;
        return obj;
    }

    public final Object serializer() {
        if (isEmpty()) {
            DrawableTransformation.write("ArrayDeque is empty.");
            return null;
        }
        return this.read[read((size() - 1) + this.serializer)];
    }

    public final Object RatingCompat() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object RemoteActionCompatParcelizer() {
        if (isEmpty()) {
            return null;
        }
        return this.read[read((size() - 1) + this.serializer)];
    }

    public final Object write() {
        if (isEmpty()) {
            return null;
        }
        return this.read[this.serializer];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        IconCompatParcelizer(iIndexOf);
        return true;
    }

    public BrazeContentCardsManager() {
        this.read = write;
    }

    public BrazeContentCardsManager(ArrayList arrayList) {
        Object[] array = arrayList.toArray(new Object[0]);
        this.read = array;
        this.RemoteActionCompatParcelizer = array.length;
        if (array.length == 0) {
            this.read = write;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[IconCompatParcelizer()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        MediaBrowserCompatMediaItem();
        serializer(collection.size() + IconCompatParcelizer());
        IconCompatParcelizer(read(IconCompatParcelizer() + this.serializer), collection);
        return true;
    }
}
