package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class setViewBackground extends DefaultContentCardsActionListener implements RandomAccess, Serializable {
    public int IconCompatParcelizer;
    public final BaseContentCardViewExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public Object[] read;
    public final int serializer;
    public final setViewBackground write;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void read() {
        if (this.RemoteActionCompatParcelizer.serializer) {
            getAlignmentLinesMap.write();
        }
    }

    public final void serializer(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        setViewBackground setviewbackground = this.write;
        if (setviewbackground != null) {
            setviewbackground.serializer(i, i2);
        } else {
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = BaseContentCardViewExternalSyntheticLambda0.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer.serializer(i, i2);
        }
        this.IconCompatParcelizer -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = kotlin.collections.AbstractList.MediaDescriptionCompat;
        int i3 = this.IconCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(i, i2, i3);
        return new setViewBackground(this.read, this.serializer + i, i2 - i, this, this.RemoteActionCompatParcelizer);
    }

    public final void write() {
        if (((AbstractList) this.RemoteActionCompatParcelizer).modCount == ((AbstractList) this).modCount) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    public setViewBackground(Object[] objArr, int i, int i2, setViewBackground setviewbackground, BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0) {
        objArr.getClass();
        baseContentCardViewExternalSyntheticLambda0.getClass();
        this.read = objArr;
        this.serializer = i;
        this.IconCompatParcelizer = i2;
        this.write = setviewbackground;
        this.RemoteActionCompatParcelizer = baseContentCardViewExternalSyntheticLambda0;
        ((AbstractList) this).modCount = ((AbstractList) baseContentCardViewExternalSyntheticLambda0).modCount;
    }

    @Override // o.DefaultContentCardsActionListener
    public final int IconCompatParcelizer() {
        write();
        return this.IconCompatParcelizer;
    }

    @Override // o.DefaultContentCardsActionListener
    public final Object IconCompatParcelizer(int i) {
        read();
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = kotlin.collections.AbstractList.MediaDescriptionCompat;
        int i2 = this.IconCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        return RemoteActionCompatParcelizer(this.serializer + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        read();
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = kotlin.collections.AbstractList.MediaDescriptionCompat;
        int i2 = this.IconCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, i2);
        RemoteActionCompatParcelizer(this.serializer + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        read();
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = kotlin.collections.AbstractList.MediaDescriptionCompat;
        int i2 = this.IconCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, i2);
        int size = collection.size();
        serializer(this.serializer + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        read();
        write();
        serializer(this.serializer, this.IconCompatParcelizer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = kotlin.collections.AbstractList.MediaDescriptionCompat;
        int i2 = this.IconCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        return this.read[this.serializer + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        write();
        Object[] objArr = this.read;
        int i = this.IconCompatParcelizer;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.serializer + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        write();
        return this.IconCompatParcelizer == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        write();
        for (int i = this.IconCompatParcelizer - 1; i >= 0; i--) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read[this.serializer + i], obj}, getCieXyz.write())).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = kotlin.collections.AbstractList.MediaDescriptionCompat;
        int i2 = this.IconCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, i2);
        return new BlockDropShadowNodeobtainPainter1(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        read();
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
        read();
        write();
        return RemoteActionCompatParcelizer(this.serializer, this.IconCompatParcelizer, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        read();
        write();
        return RemoteActionCompatParcelizer(this.serializer, this.IconCompatParcelizer, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        read();
        write();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = kotlin.collections.AbstractList.MediaDescriptionCompat;
        int i2 = this.IconCompatParcelizer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i2);
        Object[] objArr = this.read;
        int i3 = this.serializer + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        write();
        int length = objArr.length;
        int i = this.IconCompatParcelizer;
        Object[] objArr2 = this.read;
        int i2 = this.serializer;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        onContentCardClicked.write(0, i2, i + i2, objArr2, objArr);
        int i3 = this.IconCompatParcelizer;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        write();
        return MathKt.IconCompatParcelizer(this.read, this.serializer, this.IconCompatParcelizer, this);
    }

    public final int RemoteActionCompatParcelizer(int i, int i2, Collection collection, boolean z) {
        int iWrite;
        setViewBackground setviewbackground = this.write;
        if (setviewbackground != null) {
            iWrite = setviewbackground.RemoteActionCompatParcelizer(i, i2, collection, z);
        } else {
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = BaseContentCardViewExternalSyntheticLambda0.IconCompatParcelizer;
            iWrite = this.RemoteActionCompatParcelizer.write(i, i2, collection, z);
        }
        if (iWrite > 0) {
            ((AbstractList) this).modCount++;
        }
        this.IconCompatParcelizer -= iWrite;
        return iWrite;
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        Object objRemoteActionCompatParcelizer;
        ((AbstractList) this).modCount++;
        setViewBackground setviewbackground = this.write;
        if (setviewbackground != null) {
            objRemoteActionCompatParcelizer = setviewbackground.RemoteActionCompatParcelizer(i);
        } else {
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = BaseContentCardViewExternalSyntheticLambda0.IconCompatParcelizer;
            objRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
        }
        this.IconCompatParcelizer--;
        return objRemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(int i, Object obj) {
        ((AbstractList) this).modCount++;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        setViewBackground setviewbackground = this.write;
        if (setviewbackground != null) {
            setviewbackground.RemoteActionCompatParcelizer(i, obj);
        } else {
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda1 = BaseContentCardViewExternalSyntheticLambda0.IconCompatParcelizer;
            baseContentCardViewExternalSyntheticLambda0.serializer(i, obj);
        }
        this.read = baseContentCardViewExternalSyntheticLambda0.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        write();
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            Object[] objArr = {this.read[this.serializer + i], obj};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public final void serializer(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        setViewBackground setviewbackground = this.write;
        if (setviewbackground != null) {
            setviewbackground.serializer(i, collection, i2);
        } else {
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda1 = BaseContentCardViewExternalSyntheticLambda0.IconCompatParcelizer;
            baseContentCardViewExternalSyntheticLambda0.write(i, collection, i2);
        }
        this.read = baseContentCardViewExternalSyntheticLambda0.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        write();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.read;
            int i = this.IconCompatParcelizer;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objArr[this.serializer + i2], list.get(i2)}, getCieXyz.write())).booleanValue()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        read();
        write();
        RemoteActionCompatParcelizer(this.serializer + this.IconCompatParcelizer, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        read();
        write();
        int size = collection.size();
        serializer(this.serializer + this.IconCompatParcelizer, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        write();
        Object[] objArr = this.read;
        int i = this.IconCompatParcelizer;
        int i2 = this.serializer;
        return onContentCardClicked.write(i2, i + i2, objArr);
    }
}
