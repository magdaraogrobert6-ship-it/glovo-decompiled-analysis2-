package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class getAsClause implements OnFailureListener, PinnableContainer, FwFClientExtensionKtgetVariationsevalResults1 {
    public final /* synthetic */ CancellableContinuationImpl read;

    public /* synthetic */ getAsClause(CancellableContinuationImpl cancellableContinuationImpl) {
        this.read = cancellableContinuationImpl;
    }

    @Override // o.FwFClientExtensionKtgetVariationsevalResults1
    public void onResponse(syncCustomerProfile synccustomerprofile, getHoldoutVariationName getholdoutvariationname) {
        boolean z = getholdoutvariationname.rawResponse.isSuccessful;
        CancellableContinuationImpl cancellableContinuationImpl = this.read;
        if (z) {
            cancellableContinuationImpl.resumeWith(getholdoutvariationname.body);
        } else {
            cancellableContinuationImpl.resumeWith(new isItemDismissable(new retrofit2.HttpException(getholdoutvariationname)));
        }
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        Exception exception = task.getException();
        CancellableContinuationImpl cancellableContinuationImpl = this.read;
        if (exception != null) {
            cancellableContinuationImpl.resumeWith(new isItemDismissable(exception));
        } else if (task.isCanceled()) {
            cancellableContinuationImpl.serializer((Throwable) null);
        } else {
            cancellableContinuationImpl.resumeWith(task.getResult());
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        exc.getClass();
        this.read.resumeWith(new isItemDismissable(exc));
    }

    @Override // o.FwFClientExtensionKtgetVariationsevalResults1
    public void onFailure(syncCustomerProfile synccustomerprofile, Throwable th) {
        this.read.resumeWith(new isItemDismissable(th));
    }
}
