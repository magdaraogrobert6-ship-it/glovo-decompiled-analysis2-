package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzt;
import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
class zzg extends com.google.android.play.core.review.internal.zzg {
    final com.google.android.play.core.review.internal.zzi zza;
    final ParentDataModifierDefaultImpls zzb;
    final /* synthetic */ zzi zzc;

    public zzg(zzi zziVar, com.google.android.play.core.review.internal.zzi zziVar2, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.zzc = zziVar;
        this.zza = zziVar2;
        this.zzb = parentDataModifierDefaultImpls;
    }

    @Override // com.google.android.play.core.review.internal.zzh
    public void zzb(Bundle bundle) throws RemoteException {
        zzt zztVar = this.zzc.zza;
        if (zztVar != null) {
            zztVar.zzu(this.zzb);
        }
        this.zza.zzc("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
