package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.base.zas;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvContentsMenucp extends accessgetScp {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] MediaMetadataCompat() {
        return zas.serializer;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean PlaybackStateCompat() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (iInterfaceQueryLocalInterface instanceof accessgetTvAudioDescriptionMixingVolumeDowncp) {
            return (accessgetTvAudioDescriptionMixingVolumeDowncp) iInterfaceQueryLocalInterface;
        }
        return new accessgetTvAudioDescriptionMixingVolumeDowncp(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public accessgetTvContentsMenucp(Context context, Looper looper, int i, MetricsBatchProcessor metricsBatchProcessor, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp, int i2) {
        super(context, looper, i, metricsBatchProcessor, accessgetnumpad4cp, accessgetnumpaddeletecp, i2);
    }
}
