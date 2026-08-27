package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class writeToParcel implements Iterator, displayInAppMessagelambda121 {
    public Object read;
    public int serializer;

    public abstract void read();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.serializer;
        if (i == 1) {
            this.serializer = 0;
            return this.read;
        }
        if (i != 2) {
            this.serializer = 3;
            read();
            if (this.serializer == 1) {
                this.serializer = 0;
                return this.read;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.serializer;
        if (i == 0) {
            this.serializer = 3;
            read();
            return this.serializer == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("hasNext called when the iterator is in the FAILED state.");
        return false;
    }
}
