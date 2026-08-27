package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class verifyOrientationStatuslambda1 implements Iterator, displayInAppMessagelambda121 {
    public final /* synthetic */ verifyOrientationStatuslambda3 read;
    public final Iterator write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.write.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.read.serializer.invoke(this.write.next());
    }

    public verifyOrientationStatuslambda1(verifyOrientationStatuslambda3 verifyorientationstatuslambda3) {
        this.read = verifyorientationstatuslambda3;
        this.write = verifyorientationstatuslambda3.read.iterator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
