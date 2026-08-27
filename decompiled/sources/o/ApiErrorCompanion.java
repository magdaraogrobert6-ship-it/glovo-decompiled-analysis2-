package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ApiErrorCompanion {
    public static final int RemoteActionCompatParcelizer;
    public static final SVGParseException read = new SVGParseException(new byte[0], 0, 0, false, false);
    public static final AtomicReference[] serializer;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        RemoteActionCompatParcelizer = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        serializer = atomicReferenceArr;
    }

    public static final void RemoteActionCompatParcelizer(SVGParseException sVGParseException) {
        sVGParseException.getClass();
        if (sVGParseException.next != null || sVGParseException.prev != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return;
        }
        if (sVGParseException.shared) {
            return;
        }
        AtomicReference atomicReference = serializer[(int) (Thread.currentThread().getId() & (((long) RemoteActionCompatParcelizer) - 1))];
        SVGParseException sVGParseException2 = read;
        SVGParseException sVGParseException3 = (SVGParseException) atomicReference.getAndSet(sVGParseException2);
        if (sVGParseException3 == sVGParseException2) {
            return;
        }
        int i = sVGParseException3 != null ? sVGParseException3.limit : 0;
        if (i >= 65536) {
            atomicReference.set(sVGParseException3);
            return;
        }
        sVGParseException.next = sVGParseException3;
        sVGParseException.pos = 0;
        sVGParseException.limit = i + 8192;
        atomicReference.set(sVGParseException);
    }

    public static final SVGParseException IconCompatParcelizer() {
        AtomicReference atomicReference = serializer[(int) (Thread.currentThread().getId() & (((long) RemoteActionCompatParcelizer) - 1))];
        SVGParseException sVGParseException = read;
        SVGParseException sVGParseException2 = (SVGParseException) atomicReference.getAndSet(sVGParseException);
        if (sVGParseException2 == sVGParseException) {
            return new SVGParseException();
        }
        if (sVGParseException2 == null) {
            atomicReference.set(null);
            return new SVGParseException();
        }
        atomicReference.set(sVGParseException2.next);
        sVGParseException2.next = null;
        sVGParseException2.limit = 0;
        return sVGParseException2;
    }
}
