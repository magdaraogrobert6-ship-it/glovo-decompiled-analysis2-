package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetOnDropTargetValidatep extends accessgetOnStartTransferp {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final Object read;

    public accessgetOnDropTargetValidatep(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.read = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i != 0) {
            if (hasNext()) {
                this.serializer++;
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i2 = this.serializer;
        this.serializer = i2 + 1;
        return ((Object[]) obj)[i2];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i != 0) {
            if (hasPrevious()) {
                this.serializer--;
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i2 = this.serializer - 1;
        this.serializer = i2;
        return ((Object[]) obj)[i2];
    }

    public accessgetOnDropTargetValidatep(int i, Object obj) {
        super(i, 1);
        this.read = obj;
    }
}
