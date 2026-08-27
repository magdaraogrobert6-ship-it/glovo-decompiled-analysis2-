package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class removeInvalidPointerIdsAndChanges extends HistoricalChange {
    public final transient addHitPathQJqDSyo read;
    public final transient removePointerInputModifierNode write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.read.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.read.RatingCompat;
    }

    @Override // o.getDownChange
    public final int write(Object[] objArr) {
        return this.write.write(objArr);
    }

    public removeInvalidPointerIdsAndChanges(addHitPathQJqDSyo addhitpathqjqdsyo, removePointerInputModifierNode removepointerinputmodifiernode) {
        this.read = addhitpathqjqdsyo;
        this.write = removepointerinputmodifiernode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.write.listIterator(0);
    }
}
