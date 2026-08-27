package o;

import com.google.android.gms.internal.gtm.zzkh;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class getLastConstraintsDWUhwKw extends AbstractList implements LayoutNodeNoIntrinsicsMeasurePolicy, RandomAccess {
    public final LayoutNodeLayoutState serializer;

    @Override // o.LayoutNodeNoIntrinsicsMeasurePolicy
    public final LayoutNodeNoIntrinsicsMeasurePolicy write() {
        return this;
    }

    @Override // o.LayoutNodeNoIntrinsicsMeasurePolicy
    public final Object RemoteActionCompatParcelizer(int i) {
        return this.serializer.RemoteActionCompatParcelizer.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.serializer.get(i);
    }

    @Override // o.LayoutNodeNoIntrinsicsMeasurePolicy
    public final List serializer() {
        return Collections.unmodifiableList(this.serializer.RemoteActionCompatParcelizer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer.size();
    }

    @Override // o.LayoutNodeNoIntrinsicsMeasurePolicy
    public final void write(setOnAttachui setonattachui) {
        throw new UnsupportedOperationException();
    }

    public getLastConstraintsDWUhwKw(LayoutNodeLayoutState layoutNodeLayoutState) {
        this.serializer = layoutNodeLayoutState;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzkh zzkhVar = new zzkh(5);
        zzkhVar.RemoteActionCompatParcelizer = this.serializer.iterator();
        return zzkhVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        triggerRepaint triggerrepaint = new triggerRepaint(2);
        triggerrepaint.RemoteActionCompatParcelizer = this.serializer.listIterator(i);
        return triggerrepaint;
    }
}
