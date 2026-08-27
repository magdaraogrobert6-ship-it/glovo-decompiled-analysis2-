package o;

import com.google.android.gms.internal.gtm.zzkh;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class getFloatInfinityBaseannotations extends AbstractList implements twoDimensionalFocusSearchsMXa3k8, RandomAccess {
    public final CornerRadius serializer;

    @Override // o.twoDimensionalFocusSearchsMXa3k8
    public final twoDimensionalFocusSearchsMXa3k8 read() {
        return this;
    }

    @Override // o.twoDimensionalFocusSearchsMXa3k8
    public final Object IconCompatParcelizer(int i) {
        return this.serializer.RemoteActionCompatParcelizer.get(i);
    }

    @Override // o.twoDimensionalFocusSearchsMXa3k8
    public final List RemoteActionCompatParcelizer() {
        return Collections.unmodifiableList(this.serializer.RemoteActionCompatParcelizer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.serializer.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer.size();
    }

    @Override // o.twoDimensionalFocusSearchsMXa3k8
    public final void write(moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) {
        throw new UnsupportedOperationException();
    }

    public getFloatInfinityBaseannotations(CornerRadius cornerRadius) {
        this.serializer = cornerRadius;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzkh zzkhVar = new zzkh(1);
        zzkhVar.RemoteActionCompatParcelizer = this.serializer.iterator();
        return zzkhVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        triggerRepaint triggerrepaint = new triggerRepaint(1);
        triggerrepaint.RemoteActionCompatParcelizer = this.serializer.listIterator(i);
        return triggerrepaint;
    }
}
