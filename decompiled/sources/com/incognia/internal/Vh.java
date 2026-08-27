package com.incognia.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class Vh extends BroadcastReceiver {
    public final UsU BGx;
    public final g8M mbG;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == -1172645946 && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            final boolean booleanExtra = intent != null ? intent.getBooleanExtra("noConnectivity", false) : false;
            this.BGx.BGx(new y9X() { // from class: com.incognia.internal.Vh$$ExternalSyntheticLambda0
                @Override // com.incognia.internal.y9X
                public final void run() {
                    Vh.BGx(this.f$0, booleanExtra);
                }
            });
        }
    }

    public Vh(UsU usU, g8M g8m) {
        this.BGx = usU;
        this.mbG = g8m;
    }

    public static final void BGx(Vh vh, boolean z) {
        vh.mbG.invoke(Boolean.valueOf(!z));
    }
}
