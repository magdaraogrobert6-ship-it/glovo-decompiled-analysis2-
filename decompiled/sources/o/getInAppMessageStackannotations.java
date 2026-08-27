package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppMessageStackannotations extends getSidePaddingValue {
    public final int IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final int serializer;
    public int write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getSidePaddingValue
    public final int RemoteActionCompatParcelizer() {
        int i = this.write;
        if (i != this.serializer) {
            this.write = this.IconCompatParcelizer + i;
            return i;
        }
        if (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = false;
            return i;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return 0;
    }

    public getInAppMessageStackannotations(int i, int i2, int i3) {
        this.IconCompatParcelizer = i3;
        this.serializer = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.RemoteActionCompatParcelizer = z;
        this.write = z ? i : i2;
    }
}
