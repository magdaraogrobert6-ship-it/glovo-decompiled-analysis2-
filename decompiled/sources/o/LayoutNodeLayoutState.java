package o;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeLayoutState extends setGloballyPositionedObservers implements LayoutNodeNoIntrinsicsMeasurePolicy, RandomAccess {
    public final ArrayList RemoteActionCompatParcelizer;

    public LayoutNodeLayoutState(int i) {
        this(new ArrayList(i));
    }

    @Override // o.LayoutNodeNoIntrinsicsMeasurePolicy
    public final Object RemoteActionCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof setOnAttachui)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, getMinimumTouchTargetSizeMYxV2XQ.write);
            if (getNextChildPlaceOrderui.RemoteActionCompatParcelizer.write(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        setOnAttachui setonattachui = (setOnAttachui) obj;
        Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
        if (setonattachui.IconCompatParcelizer() == 0) {
            str = "";
        } else {
            setOnDetachui setondetachui = (setOnDetachui) setonattachui;
            str = new String(setondetachui.RatingCompat, setondetachui.write(), setondetachui.IconCompatParcelizer(), charset);
        }
        setOnDetachui setondetachui2 = (setOnDetachui) setonattachui;
        int iWrite = setondetachui2.write();
        if (getNextChildPlaceOrderui.RemoteActionCompatParcelizer.write(setondetachui2.RatingCompat, iWrite, setondetachui2.IconCompatParcelizer() + iWrite)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // o.LayoutNodeCompanionErrorMeasurePolicy1
    public final LayoutNodeCompanionErrorMeasurePolicy1 read(int i) {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        if (i < arrayList.size()) {
            DrawableTransformation.write();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new LayoutNodeLayoutState(arrayList2);
    }

    @Override // o.LayoutNodeNoIntrinsicsMeasurePolicy
    public final List serializer() {
        return Collections.unmodifiableList(this.RemoteActionCompatParcelizer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        RemoteActionCompatParcelizer();
        Object obj2 = this.RemoteActionCompatParcelizer.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof setOnAttachui)) {
            return new String((byte[]) obj2, getMinimumTouchTargetSizeMYxV2XQ.write);
        }
        setOnAttachui setonattachui = (setOnAttachui) obj2;
        Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
        if (setonattachui.IconCompatParcelizer() == 0) {
            return "";
        }
        setOnDetachui setondetachui = (setOnDetachui) setonattachui;
        return new String(setondetachui.RatingCompat, setondetachui.write(), setondetachui.IconCompatParcelizer(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer.size();
    }

    @Override // o.setGloballyPositionedObservers, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        RemoteActionCompatParcelizer();
        if (collection instanceof LayoutNodeNoIntrinsicsMeasurePolicy) {
            collection = ((LayoutNodeNoIntrinsicsMeasurePolicy) collection).serializer();
        }
        boolean zAddAll = this.RemoteActionCompatParcelizer.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // o.setGloballyPositionedObservers, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.setGloballyPositionedObservers, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        RemoteActionCompatParcelizer();
        Object objRemove = this.RemoteActionCompatParcelizer.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof setOnAttachui)) {
            return new String((byte[]) objRemove, getMinimumTouchTargetSizeMYxV2XQ.write);
        }
        setOnAttachui setonattachui = (setOnAttachui) objRemove;
        Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
        if (setonattachui.IconCompatParcelizer() == 0) {
            return "";
        }
        setOnDetachui setondetachui = (setOnDetachui) setonattachui;
        return new String(setondetachui.RatingCompat, setondetachui.write(), setondetachui.IconCompatParcelizer(), charset);
    }

    static {
        new LayoutNodeLayoutState(10).IconCompatParcelizer = false;
    }

    @Override // o.LayoutNodeNoIntrinsicsMeasurePolicy
    public final LayoutNodeNoIntrinsicsMeasurePolicy write() {
        return this.IconCompatParcelizer ? new getLastConstraintsDWUhwKw(this) : this;
    }

    public LayoutNodeLayoutState(ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
    }

    @Override // o.LayoutNodeNoIntrinsicsMeasurePolicy
    public final void write(setOnAttachui setonattachui) {
        RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.add(setonattachui);
        ((AbstractList) this).modCount++;
    }

    @Override // o.setGloballyPositionedObservers, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.RemoteActionCompatParcelizer.size(), collection);
    }
}
