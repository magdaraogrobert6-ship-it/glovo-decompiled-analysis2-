package com.incognia.internal;

import android.telephony.TelephonyCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class aYh extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    public final FYw BGx;

    public aYh(FYw fYw) {
        this.BGx = fYw;
    }

    public final void onCallStateChanged(int i) {
        this.BGx.invoke(Integer.valueOf(i));
    }
}
