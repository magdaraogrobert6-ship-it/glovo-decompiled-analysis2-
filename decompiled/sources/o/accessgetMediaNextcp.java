package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMediaNextcp implements accessgetFivecp {
    public final /* synthetic */ int IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;

    public /* synthetic */ accessgetMediaNextcp(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return new accessgetMcp((Context) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), "com.google.android.datatransport.events", Integer.valueOf(accessgetMcp.RemoteActionCompatParcelizer).intValue());
        }
        String packageName = ((Context) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
