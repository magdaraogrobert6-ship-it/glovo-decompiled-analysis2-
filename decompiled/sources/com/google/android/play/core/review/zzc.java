package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends ResultReceiver {
    final /* synthetic */ ParentDataModifierDefaultImpls zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzd zzdVar, Handler handler, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        super(handler);
        this.zza = parentDataModifierDefaultImpls;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.zza.write(null);
    }
}
