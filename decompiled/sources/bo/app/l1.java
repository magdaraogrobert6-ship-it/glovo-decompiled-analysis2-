package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.TextAnnouncementContentCardView;
import o.getOnBackInvokedCallback;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public l1(getOnBackInvokedCallback getonbackinvokedcallback) {
        super(getonbackinvokedcallback);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) throws Throwable {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new j1(th), 4, (Object) null);
        if (brazeCoroutineScope.getShouldReRaiseExceptions$android_sdk_base_release()) {
            throw th;
        }
    }
}
