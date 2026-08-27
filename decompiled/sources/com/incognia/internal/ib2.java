package com.incognia.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class ib2 extends BroadcastReceiver {
    public final UsU BGx;
    public final OAq mbG;

    public static final void BGx(ib2 ib2Var) {
        ib2Var.mbG.invoke();
    }

    public static final void mbG(ib2 ib2Var) {
        ib2Var.mbG.invoke();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            final int i = 0;
            if (iHashCode != -1875733435) {
                if (iHashCode == 1878357501 && action.equals("android.net.wifi.SCAN_RESULTS")) {
                    this.BGx.BGx(new y9X(this) { // from class: com.incognia.internal.ib2$$ExternalSyntheticLambda0
                        public final /* synthetic */ ib2 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // com.incognia.internal.y9X
                        public final void run() {
                            int i2 = i;
                            ib2 ib2Var = this.f$0;
                            if (i2 != 0) {
                                ib2.mbG(ib2Var);
                            } else {
                                ib2.BGx(ib2Var);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (action.equals("android.net.wifi.WIFI_STATE_CHANGED") && intent != null) {
                int intExtra = intent.getIntExtra("wifi_state", 0);
                final int i2 = 1;
                if (intExtra == 1) {
                    this.BGx.BGx(new y9X(this) { // from class: com.incognia.internal.ib2$$ExternalSyntheticLambda0
                        public final /* synthetic */ ib2 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // com.incognia.internal.y9X
                        public final void run() {
                            int i3 = i2;
                            ib2 ib2Var = this.f$0;
                            if (i3 != 0) {
                                ib2.mbG(ib2Var);
                            } else {
                                ib2.BGx(ib2Var);
                            }
                        }
                    });
                }
            }
        }
    }

    public ib2(UsU usU, OAq oAq) {
        this.BGx = usU;
        this.mbG = oAq;
    }
}
