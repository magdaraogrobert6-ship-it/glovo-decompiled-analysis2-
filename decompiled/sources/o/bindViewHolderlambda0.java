package o;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class bindViewHolderlambda0 extends DefaultContentCardsActionListener {
    public final List serializer;

    @Override // o.DefaultContentCardsActionListener
    public final int IconCompatParcelizer() {
        return this.serializer.size();
    }

    @Override // o.DefaultContentCardsActionListener
    public final Object IconCompatParcelizer(int i) {
        return this.serializer.remove(onContentCardDismissed.write(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.serializer.add(onContentCardDismissed.serializer(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.serializer.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.serializer.get(onContentCardDismissed.write(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.serializer.set(onContentCardDismissed.write(i, this), obj);
    }

    public bindViewHolderlambda0(List list) {
        this.serializer = list;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new BaseContentCardView(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new BaseContentCardView(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new BaseContentCardView(this, i);
    }
}
