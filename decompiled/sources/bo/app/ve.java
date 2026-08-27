package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.TextAnnouncementContentCardView;
import o.getOnBackInvokedCallback;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class ve extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public ve(getOnBackInvokedCallback getonbackinvokedcallback) {
        super(getonbackinvokedcallback);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) we.a, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ue(th), 4, (Object) null);
            z7 z7Var = we.b;
            if (z7Var != null) {
                z7Var.b(th, Throwable.class);
            }
        } catch (Exception unused) {
        }
    }
}
