package kotlinx.coroutines.internal;

import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createCloseInAppMessageClickListenerlambda0;
import o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public class ScopeCoroutine<T> extends createCloseInAppMessageClickListenerlambda0 implements r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg {
    public final ShortNewsContentCardView IconCompatParcelizer;

    public ScopeCoroutine(ShortNewsContentCardView shortNewsContentCardView, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        super(textAnnouncementContentCardView, true, true);
        this.IconCompatParcelizer = shortNewsContentCardView;
    }

    public void ComponentActivity() {
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean PlaybackStateCompatCustomAction() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void IconCompatParcelizer(Object obj) {
        ShortNewsContentCardView shortNewsContentCardView = this.IconCompatParcelizer;
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        shortNewsContentCardView.resumeWith(Options.Companion.read(iWrite, -1825394297, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{obj}, iWrite3, 1825394297));
    }

    @Override // kotlinx.coroutines.JobSupport
    public void RemoteActionCompatParcelizer(Object obj) {
        ShortNewsContentCardView shortNewsContentCardViewIntercepted = LoadBalancer$Helper.intercepted(this.IconCompatParcelizer);
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        DispatchedContinuationKt.serializer(Options.Companion.read(iWrite, -1825394297, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{obj}, iWrite3, 1825394297), shortNewsContentCardViewIntercepted);
    }

    @Override // o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg
    public final r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg getCallerFrame() {
        ShortNewsContentCardView shortNewsContentCardView = this.IconCompatParcelizer;
        if (shortNewsContentCardView instanceof r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) {
            return (r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) shortNewsContentCardView;
        }
        return null;
    }
}
