package o;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class BeyondBoundsLayoutKtModifierLocalBeyondBoundsLayout1 extends getLefthoxUOeE implements ListIterator {
    public final /* synthetic */ getBeyondBoundsLayout RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeyondBoundsLayoutKtModifierLocalBeyondBoundsLayout1(getBeyondBoundsLayout getbeyondboundslayout, int i) {
        super(getbeyondboundslayout, ((List) getbeyondboundslayout.RemoteActionCompatParcelizer).listIterator(i));
        this.RemoteActionCompatParcelizer = getbeyondboundslayout;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        getBeyondBoundsLayout getbeyondboundslayout = this.RemoteActionCompatParcelizer;
        boolean zIsEmpty = getbeyondboundslayout.isEmpty();
        RemoteActionCompatParcelizer();
        ((ListIterator) this.serializer).add(obj);
        ((getLambda641200809ui) getbeyondboundslayout.MediaDescriptionCompat).read++;
        if (zIsEmpty) {
            getbeyondboundslayout.IconCompatParcelizer();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        RemoteActionCompatParcelizer();
        return ((ListIterator) this.serializer).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        RemoteActionCompatParcelizer();
        return ((ListIterator) this.serializer).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        RemoteActionCompatParcelizer();
        return ((ListIterator) this.serializer).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        RemoteActionCompatParcelizer();
        return ((ListIterator) this.serializer).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        RemoteActionCompatParcelizer();
        ((ListIterator) this.serializer).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeyondBoundsLayoutKtModifierLocalBeyondBoundsLayout1(getBeyondBoundsLayout getbeyondboundslayout) {
        super(getbeyondboundslayout);
        this.RemoteActionCompatParcelizer = getbeyondboundslayout;
    }
}
