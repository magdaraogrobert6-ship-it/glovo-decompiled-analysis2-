package com.sentiance.sdk.phone;

import android.telephony.TelephonyCallback;
import o.BrazePushReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class f$b extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    final /* synthetic */ BrazePushReceiver serializer;

    public f$b(BrazePushReceiver brazePushReceiver) {
        this.serializer = brazePushReceiver;
    }

    public final void onCallStateChanged(int i) {
        this.serializer.serializer(i);
    }
}
