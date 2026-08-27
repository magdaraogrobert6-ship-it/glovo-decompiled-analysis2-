package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
final class zzh extends zzg {
    public zzh(zzi zziVar, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, String str) {
        super(zziVar, new com.google.android.play.core.review.internal.zzi("OnRequestInstallCallback"), parentDataModifierDefaultImpls);
    }

    @Override // com.google.android.play.core.review.zzg, com.google.android.play.core.review.internal.zzh
    public final void zzb(Bundle bundle) throws RemoteException {
        super.zzb(bundle);
        this.zzb.write(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
