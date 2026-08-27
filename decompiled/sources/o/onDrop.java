package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class onDrop extends accessgetOnStartTransferp {
    public Object[] RemoteActionCompatParcelizer;
    public int read;
    public boolean write;

    public final void read(int i) {
        int i2 = 0;
        while (coil3.util.UtilsKt.read(this.serializer, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            read(this.serializer, ((this.read - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public onDrop(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.read = i3;
        Object[] objArr2 = new Object[i3];
        this.RemoteActionCompatParcelizer = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.write = r5;
        objArr2[0] = objArr;
        read(i - r5, 1);
    }

    public final Object write() {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer[this.read - 1];
        obj.getClass();
        return ((Object[]) obj)[i & 31];
    }

    public final void read(int i, int i2) {
        int i3 = (this.read - i2) * 5;
        while (i2 < this.read) {
            Object[] objArr = this.RemoteActionCompatParcelizer;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[coil3.util.UtilsKt.read(i, i3)];
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
        Object objWrite = write();
        int i = this.serializer + 1;
        this.serializer = i;
        if (i == this.IconCompatParcelizer) {
            this.write = true;
            return objWrite;
        }
        read(0);
        return objWrite;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.serializer--;
        if (this.write) {
            this.write = false;
            return write();
        }
        read(31);
        return write();
    }
}
