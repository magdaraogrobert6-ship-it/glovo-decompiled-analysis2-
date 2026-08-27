package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class open extends ScopeCoroutine {
    public static final /* synthetic */ AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(open.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void RemoteActionCompatParcelizer(Object obj) {
        IconCompatParcelizer(obj);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void IconCompatParcelizer(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = write;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Already resumed");
                    return;
                }
                ShortNewsContentCardView shortNewsContentCardViewIntercepted = LoadBalancer$Helper.intercepted(this.IconCompatParcelizer);
                int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                DispatchedContinuationKt.serializer(Options.Companion.read(iWrite, -1825394297, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{obj}, iWrite3, 1825394297), shortNewsContentCardViewIntercepted);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    public open(ShortNewsContentCardView shortNewsContentCardView, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        super(shortNewsContentCardView, textAnnouncementContentCardView);
    }
}
