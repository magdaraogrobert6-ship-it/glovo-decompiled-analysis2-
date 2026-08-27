package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
final class zzf extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ ParentDataModifierDefaultImpls zza;
    final /* synthetic */ zzi zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzi zziVar, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2) {
        super(parentDataModifierDefaultImpls);
        this.zza = parentDataModifierDefaultImpls2;
        this.zzb = zziVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        try {
            com.google.android.play.core.review.internal.zzf zzfVar = (com.google.android.play.core.review.internal.zzf) this.zzb.zza.zze();
            String str = this.zzb.zzc;
            Bundle bundle = new Bundle();
            Map mapZza = zzj.zza();
            bundle.putInt("playcore_version_code", ((Integer) mapZza.get("java")).intValue());
            if (mapZza.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapZza.get("native")).intValue());
            }
            if (mapZza.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapZza.get("unity")).intValue());
            }
            zzi zziVar = this.zzb;
            zzfVar.zzc(str, bundle, new zzh(zziVar, this.zza, zziVar.zzc));
        } catch (RemoteException e) {
            zzi.zzb.zzb(e, "error requesting in-app review for %s", this.zzb.zzc);
            this.zza.IconCompatParcelizer((Exception) new RuntimeException(e));
        }
    }
}
