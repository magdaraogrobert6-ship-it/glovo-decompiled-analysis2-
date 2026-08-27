package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class touchBoundsInRoot {
    public final setWrappedui read;
    public final long serializer;

    public final int hashCode() {
        long j = this.serializer;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.read.hashCode();
    }

    public touchBoundsInRoot(long j, setWrappedui setwrappedui) {
        this.serializer = j;
        if (setwrappedui != null) {
            this.read = setwrappedui;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null offset");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof touchBoundsInRoot)) {
            return false;
        }
        touchBoundsInRoot touchboundsinroot = (touchBoundsInRoot) obj;
        return this.serializer == touchboundsinroot.serializer && this.read.equals(touchboundsinroot.read);
    }

    public final String toString() {
        return "IndexState{sequenceNumber=" + this.serializer + ", offset=" + this.read + "}";
    }
}
