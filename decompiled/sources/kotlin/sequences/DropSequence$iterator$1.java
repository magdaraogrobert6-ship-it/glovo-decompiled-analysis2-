package kotlin.sequences;

import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.record.HistoryRecord;
import java.util.Iterator;
import o.displayInAppMessagelambda121;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaN7z0Ea2bnxePLVipqp_gDhWww;
import o.requestDisplayInAppMessagelambda10;
import o.verifyOrientationStatuslambda2;

/* JADX INFO: loaded from: classes4.dex */
public final class DropSequence$iterator$1 implements Iterator, displayInAppMessagelambda121 {
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final Iterator write;

    public DropSequence$iterator$1(verifyOrientationStatuslambda2 verifyorientationstatuslambda2) {
        this.write = ((Iterable) ((r8lambdaN7z0Ea2bnxePLVipqp_gDhWww) verifyorientationstatuslambda2.write).read).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.RemoteActionCompatParcelizer;
        Iterator it = this.write;
        if (i != 0) {
            if (i != 1) {
                return it.hasNext();
            }
            return this.IconCompatParcelizer > 0 && it.hasNext();
        }
        while (this.IconCompatParcelizer > 0 && it.hasNext()) {
            it.next();
            this.IconCompatParcelizer--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        Iterator it = this.write;
        if (i == 0) {
            while (this.IconCompatParcelizer > 0 && it.hasNext()) {
                it.next();
                this.IconCompatParcelizer--;
            }
            return it.next();
        }
        if (i == 1) {
            int i2 = this.IconCompatParcelizer;
            if (i2 != 0) {
                this.IconCompatParcelizer = i2 - 1;
                return it.next();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i3 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i3 + 1;
        if (i3 < 0) {
            SQLite.serializer();
            throw null;
        }
        HistoryRecord historyRecord = (HistoryRecord) it.next();
        historyRecord.getClass();
        return new onViewAttachedToWindowlambda0(historyRecord, Integer.valueOf(i3));
    }

    public DropSequence$iterator$1(requestDisplayInAppMessagelambda10 requestdisplayinappmessagelambda10, byte b) {
        this.IconCompatParcelizer = requestdisplayinappmessagelambda10.read;
        this.write = requestdisplayinappmessagelambda10.serializer.iterator();
    }

    public DropSequence$iterator$1(requestDisplayInAppMessagelambda10 requestdisplayinappmessagelambda10) {
        this.write = requestdisplayinappmessagelambda10.serializer.iterator();
        this.IconCompatParcelizer = requestdisplayinappmessagelambda10.read;
    }
}
