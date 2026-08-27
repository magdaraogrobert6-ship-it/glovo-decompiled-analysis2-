package com.google.android.play.core.review.internal;

import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
final class zzm extends zzj {
    final /* synthetic */ ParentDataModifierDefaultImpls zza;
    final /* synthetic */ zzj zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzt zztVar, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2, zzj zzjVar) {
        super(parentDataModifierDefaultImpls);
        this.zza = parentDataModifierDefaultImpls2;
        this.zzb = zzjVar;
        this.zzc = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        synchronized (this.zzc.zzg) {
            zzt.zzn(this.zzc, this.zza);
            if (this.zzc.zzl.getAndIncrement() > 0) {
                this.zzc.zzc.zzc("Already connected to the service.", new Object[0]);
            }
            zzt.zzp(this.zzc, this.zzb);
        }
    }
}
