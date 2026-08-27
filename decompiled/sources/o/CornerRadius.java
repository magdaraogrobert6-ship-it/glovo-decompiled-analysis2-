package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class CornerRadius extends searchChildren4C6V_qg implements twoDimensionalFocusSearchsMXa3k8, RandomAccess {
    public final ArrayList RemoteActionCompatParcelizer;

    public CornerRadius(int i) {
        this(new ArrayList(i));
    }

    @Override // o.twoDimensionalFocusSearchsMXa3k8
    public final Object IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.get(i);
    }

    @Override // o.twoDimensionalFocusSearchsMXa3k8
    public final List RemoteActionCompatParcelizer() {
        return Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        serializer();
        this.RemoteActionCompatParcelizer.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof moveFocusInChildren3ESFkO8)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, topLeft.serializer);
            if (getCenterRightF1C5BW0.read.read(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        }
        moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8 = (moveFocusInChildren3ESFkO8) obj;
        String str2 = movefocusinchildren3esfko8.write() == 0 ? "" : new String(movefocusinchildren3esfko8.serializer, movefocusinchildren3esfko8.RemoteActionCompatParcelizer(), movefocusinchildren3esfko8.write(), topLeft.serializer);
        int iRemoteActionCompatParcelizer = movefocusinchildren3esfko8.RemoteActionCompatParcelizer();
        if (getCenterRightF1C5BW0.read.read(movefocusinchildren3esfko8.serializer, iRemoteActionCompatParcelizer, movefocusinchildren3esfko8.write() + iRemoteActionCompatParcelizer) == 0) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // o.TwoDimensionalFocusSearchKtgenerateAndSearchChildren1
    public final TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 read(int i) {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        if (i < arrayList.size()) {
            DrawableTransformation.write();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new CornerRadius(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        serializer();
        Object obj2 = this.RemoteActionCompatParcelizer.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof moveFocusInChildren3ESFkO8)) {
            return new String((byte[]) obj2, topLeft.serializer);
        }
        moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8 = (moveFocusInChildren3ESFkO8) obj2;
        return movefocusinchildren3esfko8.write() == 0 ? "" : new String(movefocusinchildren3esfko8.serializer, movefocusinchildren3esfko8.RemoteActionCompatParcelizer(), movefocusinchildren3esfko8.write(), topLeft.serializer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer.size();
    }

    @Override // o.searchChildren4C6V_qg, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        serializer();
        if (collection instanceof twoDimensionalFocusSearchsMXa3k8) {
            collection = ((twoDimensionalFocusSearchsMXa3k8) collection).RemoteActionCompatParcelizer();
        }
        boolean zAddAll = this.RemoteActionCompatParcelizer.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // o.searchChildren4C6V_qg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        serializer();
        this.RemoteActionCompatParcelizer.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        serializer();
        Object objRemove = this.RemoteActionCompatParcelizer.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof moveFocusInChildren3ESFkO8)) {
            return new String((byte[]) objRemove, topLeft.serializer);
        }
        moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8 = (moveFocusInChildren3ESFkO8) objRemove;
        return movefocusinchildren3esfko8.write() == 0 ? "" : new String(movefocusinchildren3esfko8.serializer, movefocusinchildren3esfko8.RemoteActionCompatParcelizer(), movefocusinchildren3esfko8.write(), topLeft.serializer);
    }

    static {
        new CornerRadius(10).read = false;
    }

    @Override // o.twoDimensionalFocusSearchsMXa3k8
    public final twoDimensionalFocusSearchsMXa3k8 read() {
        return this.read ? new getFloatInfinityBaseannotations(this) : this;
    }

    public CornerRadius(ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
    }

    @Override // o.twoDimensionalFocusSearchsMXa3k8
    public final void write(moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) {
        serializer();
        this.RemoteActionCompatParcelizer.add(movefocusinchildren3esfko8);
        ((AbstractList) this).modCount++;
    }

    @Override // o.searchChildren4C6V_qg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.RemoteActionCompatParcelizer.size(), collection);
    }
}
