package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.api.internal.zabk;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes4.dex */
public final class getAssistEK5gGoQ extends accessgetScp {
    public final accessgetMusiccp write;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle MediaSessionCompatQueueItem() {
        accessgetMusiccp accessgetmusiccp = this.write;
        accessgetmusiccp.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", accessgetmusiccp.serializer);
        bundle.putString("log_session_id", accessgetmusiccp.IconCompatParcelizer);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (iInterfaceQueryLocalInterface instanceof getAtEK5gGoQ) {
            return (getAtEK5gGoQ) iInterfaceQueryLocalInterface;
        }
        return new getAtEK5gGoQ(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public getAssistEK5gGoQ(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, accessgetMusiccp accessgetmusiccp, zabk zabkVar, zabk zabkVar2) {
        super(context, looper, 68, metricsBatchProcessor, zabkVar, zabkVar2, 0);
        accessgetmusiccp = accessgetmusiccp == null ? accessgetMusiccp.read : accessgetmusiccp;
        colorResource colorresource = new colorResource(21, false);
        colorresource.IconCompatParcelizer = Boolean.FALSE;
        colorresource.IconCompatParcelizer = Boolean.valueOf(accessgetmusiccp.serializer);
        colorresource.write = accessgetmusiccp.IconCompatParcelizer;
        byte[] bArr = new byte[16];
        getAltRightEK5gGoQ.read.nextBytes(bArr);
        colorresource.write = Base64.encodeToString(bArr, 11);
        this.write = new accessgetMusiccp(colorresource);
    }
}
