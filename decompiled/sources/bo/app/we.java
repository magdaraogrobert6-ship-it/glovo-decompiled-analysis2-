package bo.app;

import com.braze.support.BrazeLogger;
import io.sentry.util.UrlUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import o.TextAnnouncementContentCardView;
import o.getContentViewGroupParentLayout;
import o.getOnBackInvokedCallback;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class we implements getContentViewGroupParentLayout {
    public static final we a = new we();
    public static z7 b;
    public static final TextAnnouncementContentCardView c;

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        return c;
    }

    static {
        ve veVar = new ve(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        c = new ExecutorCoroutineDispatcherImpl(executorServiceNewSingleThreadExecutor).plus(veVar).plus(UrlUtils.serializer());
    }

    public static final String b() {
        return "Cancelling children of SerialCoroutineScope";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(4), 6, (Object) null);
        JobKt.serializer(c);
    }
}
