package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.zzo;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadAddEK5gGoQ extends accessgetScp {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] MediaMetadataCompat() {
        return zzo.zzp;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean ResultReceiver() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle MediaSessionCompatQueueItem() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "activity_recognition");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (iInterfaceQueryLocalInterface instanceof getNumPadDeleteEK5gGoQ) {
            return (getNumPadDeleteEK5gGoQ) iInterfaceQueryLocalInterface;
        }
        return new getNumPadDeleteEK5gGoQ(iBinder);
    }

    public getNumPadAddEK5gGoQ(Context context, Looper looper, int i, MetricsBatchProcessor metricsBatchProcessor, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp, int i2) {
        super(context, looper, i, metricsBatchProcessor, accessgetnumpad4cp, accessgetnumpaddeletecp, i2);
    }
}
