package o;

import com.google.android.gms.internal.gtm.zzkh;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class getInverseMatrix3i98HWw extends AbstractList implements decodeFontSynthesisGVVA2EU, RandomAccess {
    public final decodeFontWeight RemoteActionCompatParcelizer;

    @Override // o.decodeFontSynthesisGVVA2EU
    public final decodeFontSynthesisGVVA2EU serializer() {
        return this;
    }

    @Override // o.decodeFontSynthesisGVVA2EU
    public final Object IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.write.get(i);
    }

    @Override // o.decodeFontSynthesisGVVA2EU
    public final List RemoteActionCompatParcelizer() {
        return Collections.unmodifiableList(this.RemoteActionCompatParcelizer.write);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.RemoteActionCompatParcelizer.get(i);
    }

    @Override // o.decodeFontSynthesisGVVA2EU
    public final void read(getClipMetadata getclipmetadata) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer.write.size();
    }

    public getInverseMatrix3i98HWw(decodeFontWeight decodefontweight) {
        this.RemoteActionCompatParcelizer = decodefontweight;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzkh zzkhVar = new zzkh(7);
        zzkhVar.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.iterator();
        return zzkhVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        triggerRepaint triggerrepaint = new triggerRepaint(0);
        triggerrepaint.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.listIterator(i);
        return triggerrepaint;
    }
}
