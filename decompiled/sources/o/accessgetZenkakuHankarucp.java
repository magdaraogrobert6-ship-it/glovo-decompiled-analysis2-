package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetZenkakuHankarucp extends accessgetScp {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] MediaMetadataCompat() {
        return getHomeEK5gGoQannotations.serializer;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean ResultReceiver() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (iInterfaceQueryLocalInterface instanceof getAEK5gGoQ) {
            return (getAEK5gGoQ) iInterfaceQueryLocalInterface;
        }
        return new getAEK5gGoQ(iBinder);
    }

    public accessgetZenkakuHankarucp(Context context, Looper looper, int i, MetricsBatchProcessor metricsBatchProcessor, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp, int i2) {
        super(context, looper, i, metricsBatchProcessor, accessgetnumpad4cp, accessgetnumpaddeletecp, i2);
    }
}
