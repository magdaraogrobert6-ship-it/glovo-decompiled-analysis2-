package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaM5AFp_9ANgJYA3xS2lkS8pKRSU extends r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0 {
    public final Object IconCompatParcelizer;

    public r8lambdaM5AFp_9ANgJYA3xS2lkS8pKRSU(int i, Object obj) {
        super(i, 1);
        this.IconCompatParcelizer = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.serializer++;
            return this.IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.serializer--;
            return this.IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }
}
