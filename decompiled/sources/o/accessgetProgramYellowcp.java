package o;

import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.net.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetProgramYellowcp extends accessgetOcp {
    public final /* synthetic */ android.app.Dialog serializer;
    public final /* synthetic */ zza write;

    @Override // o.accessgetOcp
    public final void serializer() {
        zap zapVar = (zap) this.write.read;
        zapVar.MediaBrowserCompatMediaItem.set(null);
        zapVar.MediaBrowserCompatMediaItem();
        android.app.Dialog dialog = this.serializer;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public accessgetProgramYellowcp(zza zzaVar, android.app.Dialog dialog) {
        this.serializer = dialog;
        this.write = zzaVar;
    }
}
