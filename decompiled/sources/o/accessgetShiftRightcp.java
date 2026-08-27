package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.base.zad;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetShiftRightcp extends accessgetScp {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] MediaMetadataCompat() {
        return zad.write;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean PlaybackStateCompat() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 253600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        if (iInterfaceQueryLocalInterface instanceof accessgetSixcp) {
            return (accessgetSixcp) iInterfaceQueryLocalInterface;
        }
        return new accessgetSixcp(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
    }

    public accessgetShiftRightcp(Context context, Looper looper, int i, MetricsBatchProcessor metricsBatchProcessor, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp, int i2) {
        super(context, looper, i, metricsBatchProcessor, accessgetnumpad4cp, accessgetnumpaddeletecp, i2);
    }
}
