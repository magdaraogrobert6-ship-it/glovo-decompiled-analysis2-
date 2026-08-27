package o;

import com.sentiance.sdk.pendingoperation.PendingOperation;

/* JADX INFO: loaded from: classes3.dex */
public class BrazeNotificationUtilsExternalSyntheticLambda14<Result, Error> extends PendingOperation<Result, Error> {
    public final void serializer(Error error) {
        synchronized (this) {
            completeOperationWithError(error);
        }
    }

    public final void write(Result result) {
        synchronized (this) {
            completeOperationWithResult(result);
        }
    }

    public final void read() {
        this.mInvokeListenersOnlyIfSdkIsInitialized = false;
    }
}
