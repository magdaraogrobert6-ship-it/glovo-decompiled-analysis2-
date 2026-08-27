package o;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ReversedListReadOnly;

/* JADX INFO: loaded from: classes4.dex */
public final class BaseContentCardView implements ListIterator, displayInAppMessagelambda121 {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ Object read;
    public final ListIterator write;

    public BaseContentCardView(ReversedListReadOnly reversedListReadOnly, int i) {
        this.read = reversedListReadOnly;
        this.write = ((List) reversedListReadOnly.IconCompatParcelizer).listIterator(onContentCardDismissed.serializer(i, reversedListReadOnly));
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.IconCompatParcelizer;
        ListIterator listIterator = this.write;
        Object obj = this.read;
        if (i != 0) {
            iPreviousIndex = listIterator.previousIndex();
            size = ((ReversedListReadOnly) obj).size();
        } else {
            iPreviousIndex = listIterator.previousIndex();
            size = ((bindViewHolderlambda0) obj).size();
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.IconCompatParcelizer;
        ListIterator listIterator = this.write;
        Object obj = this.read;
        if (i != 0) {
            iNextIndex = listIterator.nextIndex();
            size = ((ReversedListReadOnly) obj).size();
        } else {
            iNextIndex = listIterator.nextIndex();
            size = ((bindViewHolderlambda0) obj).size();
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.IconCompatParcelizer != 0 ? this.write.hasPrevious() : this.write.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.IconCompatParcelizer != 0 ? this.write.hasNext() : this.write.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.IconCompatParcelizer != 0 ? this.write.previous() : this.write.previous();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.IconCompatParcelizer != 0 ? this.write.next() : this.write.next();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        if (this.IconCompatParcelizer != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        ListIterator listIterator = this.write;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.IconCompatParcelizer != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        this.write.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.IconCompatParcelizer != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        this.write.set(obj);
    }

    public BaseContentCardView(bindViewHolderlambda0 bindviewholderlambda0, int i) {
        this.read = bindviewholderlambda0;
        this.write = bindviewholderlambda0.serializer.listIterator(onContentCardDismissed.serializer(i, bindviewholderlambda0));
    }
}
