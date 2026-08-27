package o;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class isFocusCaptured extends AtomicBoolean implements OutcomeReceiver {
    public final CancellableContinuationImpl IconCompatParcelizer;

    public isFocusCaptured(CancellableContinuationImpl cancellableContinuationImpl) {
        super(false);
        this.IconCompatParcelizer = cancellableContinuationImpl;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.IconCompatParcelizer.resumeWith(coil3.ExtrasKt.IconCompatParcelizer(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.IconCompatParcelizer.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
