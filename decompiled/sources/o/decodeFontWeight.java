package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class decodeFontWeight extends transformMatrixToWindowEL8BTi8 implements decodeFontSynthesisGVVA2EU, RandomAccess {
    public final List write;

    public decodeFontWeight() {
        super(false);
        this.write = Collections.EMPTY_LIST;
    }

    static {
        new decodeFontWeight();
    }

    @Override // o.decodeFontSynthesisGVVA2EU
    public final Object IconCompatParcelizer(int i) {
        return this.write.get(i);
    }

    @Override // o.decodeFontSynthesisGVVA2EU
    public final List RemoteActionCompatParcelizer() {
        return Collections.unmodifiableList(this.write);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        read();
        this.write.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.write;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof getClipMetadata) {
            getClipMetadata getclipmetadata = (getClipMetadata) obj;
            String strMediaMetadataCompat = getclipmetadata.MediaMetadataCompat();
            if (getclipmetadata.read()) {
                list.set(i, strMediaMetadataCompat);
            }
            return strMediaMetadataCompat;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, CompositionLocalsKtLocalWindowInfo1.serializer);
        if (IndirectPointerNavigationGestureDetector.write.read(bArr, 0, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // o.decodeString
    public final decodeString read(int i) {
        List list = this.write;
        if (i < list.size()) {
            DrawableTransformation.write();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new decodeFontWeight(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        read();
        Object obj2 = this.write.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof getClipMetadata ? ((getClipMetadata) obj2).MediaMetadataCompat() : new String((byte[]) obj2, CompositionLocalsKtLocalWindowInfo1.serializer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write.size();
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        read();
        if (collection instanceof decodeFontSynthesisGVVA2EU) {
            collection = ((decodeFontSynthesisGVVA2EU) collection).RemoteActionCompatParcelizer();
        }
        boolean zAddAll = this.write.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        read();
        this.write.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        read();
        Object objRemove = this.write.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof getClipMetadata ? ((getClipMetadata) objRemove).MediaMetadataCompat() : new String((byte[]) objRemove, CompositionLocalsKtLocalWindowInfo1.serializer);
    }

    @Override // o.decodeFontSynthesisGVVA2EU
    public final decodeFontSynthesisGVVA2EU serializer() {
        return this.RemoteActionCompatParcelizer ? new getInverseMatrix3i98HWw(this) : this;
    }

    public decodeFontWeight(ArrayList arrayList) {
        super(true);
        this.write = arrayList;
    }

    public decodeFontWeight(int i) {
        this(new ArrayList(i));
    }

    @Override // o.decodeFontSynthesisGVVA2EU
    public final void read(getClipMetadata getclipmetadata) {
        read();
        this.write.add(getclipmetadata);
        ((AbstractList) this).modCount++;
    }

    @Override // o.transformMatrixToWindowEL8BTi8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.write.size(), collection);
    }
}
