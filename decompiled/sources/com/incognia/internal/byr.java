package com.incognia.internal;

import android.telephony.PhoneStateListener;

/* JADX INFO: loaded from: classes2.dex */
public final class byr extends PhoneStateListener {
    public final /* synthetic */ sjz BGx;

    public byr(sjz sjzVar) {
        this.BGx = sjzVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        this.BGx.BGx(i);
    }
}
