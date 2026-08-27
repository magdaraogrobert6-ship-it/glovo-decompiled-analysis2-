package o;

import com.sentiance.protobuf.ByteString;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class getInAppMessage extends InAppMessageEvent implements SessionStateChangedEventChangeType, RandomAccess {
    public final List serializer;

    public getInAppMessage() {
        super(false);
        this.serializer = Collections.EMPTY_LIST;
    }

    static {
        new getInAppMessage();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        read();
        this.serializer.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.serializer;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strWrite = byteString.write();
            if (byteString.IconCompatParcelizer()) {
                list.set(i, strWrite);
            }
            return strWrite;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, isFromOfflineStorage.read);
        if (getErrorReason.read.serializer(bArr, 0, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // o.onSuccess
    public final onSuccess read(int i) {
        List list = this.serializer;
        if (i < list.size()) {
            DrawableTransformation.write();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new getInAppMessage(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        read();
        Object obj2 = this.serializer.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof ByteString ? ((ByteString) obj2).write() : new String((byte[]) obj2, isFromOfflineStorage.read);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer.size();
    }

    @Override // o.SessionStateChangedEventChangeType
    public final List write() {
        return Collections.unmodifiableList(this.serializer);
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        read();
        if (collection instanceof SessionStateChangedEventChangeType) {
            collection = ((SessionStateChangedEventChangeType) collection).write();
        }
        boolean zAddAll = this.serializer.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        read();
        this.serializer.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        Object objRemove = this.serializer.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof ByteString ? ((ByteString) objRemove).write() : new String((byte[]) objRemove, isFromOfflineStorage.read);
    }

    @Override // o.SessionStateChangedEventChangeType
    public final SessionStateChangedEventChangeType IconCompatParcelizer() {
        return this.read ? new NoMatchingTriggerEvent(this) : this;
    }

    public getInAppMessage(ArrayList arrayList) {
        super(true);
        this.serializer = arrayList;
    }

    public getInAppMessage(int i) {
        this(new ArrayList(i));
    }

    @Override // o.SessionStateChangedEventChangeType
    public final Object IconCompatParcelizer(int i) {
        return this.serializer.get(i);
    }

    @Override // o.SessionStateChangedEventChangeType
    public final void IconCompatParcelizer(ByteString byteString) {
        read();
        this.serializer.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // o.InAppMessageEvent, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.serializer.size(), collection);
    }
}
