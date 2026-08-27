package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class BaseContentCardViewExternalSyntheticLambda0 extends DefaultContentCardsActionListener implements RandomAccess, Serializable {
    public static final BaseContentCardViewExternalSyntheticLambda0 IconCompatParcelizer;
    public Object[] RemoteActionCompatParcelizer;
    public boolean serializer;
    public int write;

    @Override // o.DefaultContentCardsActionListener
    public final int IconCompatParcelizer() {
        return this.write;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.write; i++) {
            Object[] objArr = {this.RemoteActionCompatParcelizer[i], obj};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.write == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.RemoteActionCompatParcelizer;
            int i = this.write;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objArr[i2], list.get(i2)}, getCieXyz.write())).booleanValue()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.write;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.RemoteActionCompatParcelizer;
        int i = this.write;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.write;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, i2);
        return new setOptionalCardImage(this, i);
    }

    public final void serializer(int i, int i2) {
        if (i2 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        Object[] objArr = this.RemoteActionCompatParcelizer;
        onContentCardClicked.write(i, i + i2, this.write, objArr, objArr);
        Object[] objArr2 = this.RemoteActionCompatParcelizer;
        int i3 = this.write;
        MathKt.write(i3 - i2, i3, objArr2);
        this.write -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i3 = this.write;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(i, i2, i3);
        return new setViewBackground(this.RemoteActionCompatParcelizer, i, i2 - i, null, this);
    }

    public final int write(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.RemoteActionCompatParcelizer;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.RemoteActionCompatParcelizer;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        onContentCardClicked.write(i4 + i, i2 + i, this.write, objArr, objArr);
        Object[] objArr3 = this.RemoteActionCompatParcelizer;
        int i7 = this.write;
        MathKt.write(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.write -= i6;
        return i6;
    }

    static {
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(0);
        baseContentCardViewExternalSyntheticLambda0.serializer = true;
        IconCompatParcelizer = baseContentCardViewExternalSyntheticLambda0;
    }

    @Override // o.DefaultContentCardsActionListener
    public final Object IconCompatParcelizer(int i) {
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.write;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        return RemoteActionCompatParcelizer(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.write;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, i2);
        ((java.util.AbstractList) this).modCount++;
        IconCompatParcelizer(i, 1);
        this.RemoteActionCompatParcelizer[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.write;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, i2);
        int size = collection.size();
        write(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        write();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            IconCompatParcelizer(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        write();
        return write(0, this.write, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        write();
        return write(0, this.write, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i2 = this.write;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        Object[] objArr = this.RemoteActionCompatParcelizer;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.write;
        Object[] objArr2 = this.RemoteActionCompatParcelizer;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        onContentCardClicked.write(0, 0, i, objArr2, objArr);
        int i2 = this.write;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return MathKt.IconCompatParcelizer(this.RemoteActionCompatParcelizer, 0, this.write, this);
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        ((java.util.AbstractList) this).modCount++;
        Object[] objArr = this.RemoteActionCompatParcelizer;
        Object obj = objArr[i];
        onContentCardClicked.write(i, i + 1, this.write, objArr, objArr);
        Object[] objArr2 = this.RemoteActionCompatParcelizer;
        int i2 = this.write;
        objArr2.getClass();
        objArr2[i2 - 1] = null;
        this.write--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        write();
        serializer(0, this.write);
    }

    public final void serializer(int i, Object obj) {
        ((java.util.AbstractList) this).modCount++;
        IconCompatParcelizer(i, 1);
        this.RemoteActionCompatParcelizer[i] = obj;
    }

    public final void write(int i, Collection collection, int i2) {
        ((java.util.AbstractList) this).modCount++;
        IconCompatParcelizer(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.RemoteActionCompatParcelizer[i + i3] = it.next();
        }
    }

    public BaseContentCardViewExternalSyntheticLambda0(int i) {
        if (i >= 0) {
            this.RemoteActionCompatParcelizer = new Object[i];
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("capacity must be non-negative.");
            throw null;
        }
    }

    public final void IconCompatParcelizer(int i, int i2) {
        int i3 = this.write + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.RemoteActionCompatParcelizer;
        if (i3 > objArr.length) {
            DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
            int length = objArr.length;
            defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
            int iIconCompatParcelizer = DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(length, i3);
            Object[] objArr2 = this.RemoteActionCompatParcelizer;
            objArr2.getClass();
            this.RemoteActionCompatParcelizer = Arrays.copyOf(objArr2, iIconCompatParcelizer);
        }
        Object[] objArr3 = this.RemoteActionCompatParcelizer;
        onContentCardClicked.write(i + i2, i, this.write, objArr3, objArr3);
        this.write += i2;
    }

    public final void write() {
        if (this.serializer) {
            getAlignmentLinesMap.write();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.write - 1; i >= 0; i--) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer[i], obj}, getCieXyz.write())).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        write();
        int i = this.write;
        ((java.util.AbstractList) this).modCount++;
        IconCompatParcelizer(i, 1);
        this.RemoteActionCompatParcelizer[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        write();
        int size = collection.size();
        write(this.write, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return onContentCardClicked.write(0, this.write, this.RemoteActionCompatParcelizer);
    }
}
