package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw extends r8lambdaHO2CtdbWCctNSeM6cPhf2dek6M0 {
    public Object[] IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public int read;

    public final void read(int i) {
        int i2 = 0;
        while (coil3.util.UtilsKt.RemoteActionCompatParcelizer(this.serializer, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            write(this.serializer, ((this.read - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public r8lambdaNsJHjTXwQfruzZej6O8pQ2689Pw(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        objArr.getClass();
        this.read = i3;
        Object[] objArr2 = new Object[i3];
        this.IconCompatParcelizer = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.RemoteActionCompatParcelizer = r5;
        objArr2[0] = objArr;
        write(i - r5, 1);
    }

    public final Object RemoteActionCompatParcelizer() {
        int i = this.serializer;
        Object obj = this.IconCompatParcelizer[this.read - 1];
        obj.getClass();
        return ((Object[]) obj)[i & 31];
    }

    public final void write(int i, int i2) {
        int i3 = (this.read - i2) * 5;
        while (i2 < this.read) {
            Object[] objArr = this.IconCompatParcelizer;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[coil3.util.UtilsKt.RemoteActionCompatParcelizer(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i = this.serializer + 1;
        this.serializer = i;
        if (i == this.write) {
            this.RemoteActionCompatParcelizer = true;
            return objRemoteActionCompatParcelizer;
        }
        read(0);
        return objRemoteActionCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.serializer--;
        if (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = false;
            return RemoteActionCompatParcelizer();
        }
        read(31);
        return RemoteActionCompatParcelizer();
    }
}
