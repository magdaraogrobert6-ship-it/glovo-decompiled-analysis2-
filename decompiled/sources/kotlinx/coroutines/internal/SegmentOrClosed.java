package kotlinx.coroutines.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlinx.coroutines.internal.Segment;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class SegmentOrClosed<S extends Segment<S>> {
    public static final boolean IconCompatParcelizer(Object obj) {
        return obj == ConcurrentLinkedListKt.IconCompatParcelizer;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "SegmentOrClosed(value=null)";
    }

    public static final Segment RemoteActionCompatParcelizer(Object obj) {
        if (obj != ConcurrentLinkedListKt.IconCompatParcelizer) {
            return (Segment) obj;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Does not contain segment");
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SegmentOrClosed)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{null, null}, getCieXyz.write())).booleanValue();
    }
}
