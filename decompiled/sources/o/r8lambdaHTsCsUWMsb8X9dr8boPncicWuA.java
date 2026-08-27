package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaHTsCsUWMsb8X9dr8boPncicWuA extends r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0 {
    public final Object[] IconCompatParcelizer;

    public r8lambdaHTsCsUWMsb8X9dr8boPncicWuA(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.IconCompatParcelizer = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer;
        this.serializer = i + 1;
        return this.IconCompatParcelizer[i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer - 1;
        this.serializer = i;
        return this.IconCompatParcelizer[i];
    }
}
