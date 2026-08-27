package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetAbovecp extends BeyondBoundsLayoutBeyondBoundsScope {
    public final transient ContentScaleKt read;
    public final transient accessgetBeforecp write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.read.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.read.getClass();
        return 1;
    }

    @Override // o.setMeasurementApproachInProgress
    public final int write(Object[] objArr) {
        return this.write.write(objArr);
    }

    public accessgetAbovecp(ContentScaleKt contentScaleKt, accessgetBeforecp accessgetbeforecp) {
        this.read = contentScaleKt;
        this.write = accessgetbeforecp;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.write.listIterator(0);
    }
}
