package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.internal.base.zad;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSoftSleepcp extends accessgetScp {
    public final accessgetSevencp write;

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
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle MediaSessionCompatQueueItem() {
        accessgetSevencp accessgetsevencp = this.write;
        accessgetsevencp.getClass();
        Bundle bundle = new Bundle();
        String str = accessgetsevencp.serializer;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (iInterfaceQueryLocalInterface instanceof accessgetSettingscp) {
            return (accessgetSettingscp) iInterfaceQueryLocalInterface;
        }
        return new accessgetSettingscp(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public accessgetSoftSleepcp(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, accessgetSevencp accessgetsevencp, zabk zabkVar, zabk zabkVar2) {
        super(context, looper, 270, metricsBatchProcessor, zabkVar, zabkVar2, 0);
        this.write = accessgetsevencp;
    }
}
