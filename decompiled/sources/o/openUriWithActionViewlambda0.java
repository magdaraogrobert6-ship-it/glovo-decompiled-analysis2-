package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class openUriWithActionViewlambda0 implements Iterator {
    public int IconCompatParcelizer;
    public final /* synthetic */ openUriWithWebViewActivitylambda0 read;
    public boolean serializer;
    public int write = -1;

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        openUriWithWebViewActivitylambda0 openuriwithwebviewactivitylambda0 = this.read;
        int i2 = openuriwithwebviewactivitylambda0.IconCompatParcelizer;
        Object[] objArr = openuriwithwebviewactivitylambda0.RemoteActionCompatParcelizer;
        int i3 = this.write;
        if (i3 == -1) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        int i4 = openuriwithwebviewactivitylambda0.read;
        if (i3 == i4) {
            openuriwithwebviewactivitylambda0.remove();
            this.write = -1;
            return;
        }
        int i5 = i3 + 1;
        if (i4 >= i3 || i5 >= (i = openuriwithwebviewactivitylambda0.write)) {
            while (i5 != openuriwithwebviewactivitylambda0.write) {
                if (i5 >= i2) {
                    objArr[i5 - 1] = objArr[0];
                } else {
                    int i6 = i5 - 1;
                    if (i6 < 0) {
                        i6 = i2 - 1;
                    }
                    objArr[i6] = objArr[i5];
                    i5++;
                    if (i5 >= i2) {
                    }
                }
                i5 = 0;
            }
        } else {
            System.arraycopy(objArr, i5, objArr, i3, i - i5);
        }
        this.write = -1;
        int i7 = openuriwithwebviewactivitylambda0.write - 1;
        if (i7 < 0) {
            i7 = i2 - 1;
        }
        openuriwithwebviewactivitylambda0.write = i7;
        objArr[i7] = null;
        openuriwithwebviewactivitylambda0.serializer = false;
        int i8 = this.IconCompatParcelizer - 1;
        if (i8 < 0) {
            i8 = i2 - 1;
        }
        this.IconCompatParcelizer = i8;
    }

    public openUriWithActionViewlambda0(openUriWithWebViewActivitylambda0 openuriwithwebviewactivitylambda0) {
        this.read = openuriwithwebviewactivitylambda0;
        this.IconCompatParcelizer = openuriwithwebviewactivitylambda0.read;
        this.serializer = openuriwithwebviewactivitylambda0.serializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer || this.IconCompatParcelizer != this.read.write;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.serializer = false;
        int i = this.IconCompatParcelizer;
        this.write = i;
        int i2 = i + 1;
        openUriWithWebViewActivitylambda0 openuriwithwebviewactivitylambda0 = this.read;
        this.IconCompatParcelizer = i2 < openuriwithwebviewactivitylambda0.IconCompatParcelizer ? i2 : 0;
        return openuriwithwebviewactivitylambda0.RemoteActionCompatParcelizer[i];
    }
}
