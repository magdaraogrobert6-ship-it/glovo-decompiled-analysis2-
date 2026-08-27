package o;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getIcon extends findOverridingAncestorNode implements ListIterator {
    public final /* synthetic */ getBeyondBoundsLayout read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getIcon(getBeyondBoundsLayout getbeyondboundslayout, int i) {
        super(getbeyondboundslayout, ((List) getbeyondboundslayout.RemoteActionCompatParcelizer).listIterator(i));
        this.read = getbeyondboundslayout;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        getBeyondBoundsLayout getbeyondboundslayout = this.read;
        boolean zIsEmpty = getbeyondboundslayout.isEmpty();
        IconCompatParcelizer();
        ((ListIterator) this.IconCompatParcelizer).add(obj);
        if (zIsEmpty) {
            getbeyondboundslayout.IconCompatParcelizer();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        IconCompatParcelizer();
        return ((ListIterator) this.IconCompatParcelizer).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        IconCompatParcelizer();
        return ((ListIterator) this.IconCompatParcelizer).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        IconCompatParcelizer();
        return ((ListIterator) this.IconCompatParcelizer).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        IconCompatParcelizer();
        return ((ListIterator) this.IconCompatParcelizer).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        IconCompatParcelizer();
        ((ListIterator) this.IconCompatParcelizer).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getIcon(getBeyondBoundsLayout getbeyondboundslayout) {
        super(getbeyondboundslayout);
        this.read = getbeyondboundslayout;
    }
}
