package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetPcp extends BroadcastReceiver {
    public Context read;
    public final accessgetOcp write;

    public final void IconCompatParcelizer(Context context) {
        this.read = context;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            Context context = this.read;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.read = null;
        }
    }

    public accessgetPcp(accessgetOcp accessgetocp) {
        this.write = accessgetocp;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.write.serializer();
            RemoteActionCompatParcelizer();
        }
    }
}
