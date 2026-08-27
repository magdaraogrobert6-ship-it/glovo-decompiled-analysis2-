package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class OnPlacedNode extends accessgetScp {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.oss.licenses.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        if (iInterfaceQueryLocalInterface instanceof OnPlacedModifierDefaultImpls) {
            return (OnPlacedModifierDefaultImpls) iInterfaceQueryLocalInterface;
        }
        return new OnPlacedModifierDefaultImpls(iBinder);
    }

    public OnPlacedNode(Context context, Looper looper, int i, MetricsBatchProcessor metricsBatchProcessor, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp, int i2) {
        super(context, looper, i, metricsBatchProcessor, accessgetnumpad4cp, accessgetnumpaddeletecp, i2);
    }
}
