package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaM0iQdkzzA5f2EfspnKZe612jafc extends r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0 {
    public final r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw IconCompatParcelizer;
    public final Object[] RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaM0iQdkzzA5f2EfspnKZe612jafc(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        objArr.getClass();
        objArr2.getClass();
        this.RemoteActionCompatParcelizer = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.IconCompatParcelizer = new r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw r8lambdansjhjtxwqfruzzej6o8pq2689pw = this.IconCompatParcelizer;
        if (r8lambdansjhjtxwqfruzzej6o8pq2689pw.hasNext()) {
            this.serializer++;
            return r8lambdansjhjtxwqfruzzej6o8pq2689pw.next();
        }
        int i = this.serializer;
        this.serializer = i + 1;
        return this.RemoteActionCompatParcelizer[i - r8lambdansjhjtxwqfruzzej6o8pq2689pw.write];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer;
        r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw r8lambdansjhjtxwqfruzzej6o8pq2689pw = this.IconCompatParcelizer;
        int i2 = r8lambdansjhjtxwqfruzzej6o8pq2689pw.write;
        if (i <= i2) {
            this.serializer = i - 1;
            return r8lambdansjhjtxwqfruzzej6o8pq2689pw.previous();
        }
        int i3 = i - 1;
        this.serializer = i3;
        return this.RemoteActionCompatParcelizer[i3 - i2];
    }
}
