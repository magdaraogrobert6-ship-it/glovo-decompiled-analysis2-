package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ensureSubscribedToInAppMessageEventslambda1 implements Iterator, displayInAppMessagelambda121 {
    public final int IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final int read;
    public int serializer;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.serializer;
        if (i != this.IconCompatParcelizer) {
            this.serializer = this.read + i;
        } else {
            if (!this.RemoteActionCompatParcelizer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            this.RemoteActionCompatParcelizer = false;
        }
        return Character.valueOf((char) i);
    }

    public ensureSubscribedToInAppMessageEventslambda1(char c, char c2, int i) {
        this.read = i;
        this.IconCompatParcelizer = c2;
        boolean z = i <= 0 ? removeNodeAtDepth.serializer(c, c2) >= 0 : removeNodeAtDepth.serializer(c, c2) <= 0;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
