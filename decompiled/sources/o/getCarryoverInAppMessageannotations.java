package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getCarryoverInAppMessageannotations implements Iterator, displayInAppMessagelambda121 {
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public boolean serializer;
    public long write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer;
    }

    public final long read() {
        long j = this.write;
        if (j != this.RemoteActionCompatParcelizer) {
            this.write = this.IconCompatParcelizer + j;
            return j;
        }
        if (this.serializer) {
            this.serializer = false;
            return j;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return 0L;
    }

    public getCarryoverInAppMessageannotations(long j, long j2, long j3) {
        this.IconCompatParcelizer = j3;
        this.RemoteActionCompatParcelizer = j2;
        boolean z = j3 <= 0 ? j >= j2 : j <= j2;
        this.serializer = z;
        this.write = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Long.valueOf(read());
    }
}
