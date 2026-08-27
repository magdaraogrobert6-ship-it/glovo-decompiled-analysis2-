package com.google.android.play.core.review.internal;

import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzj implements Runnable {
    private final ParentDataModifierDefaultImpls zza;

    public abstract void zza();

    public final ParentDataModifierDefaultImpls zzb() {
        return this.zza;
    }

    public zzj() {
        this.zza = null;
    }

    public final void zzc(Exception exc) {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.zza;
        if (parentDataModifierDefaultImpls != null) {
            parentDataModifierDefaultImpls.IconCompatParcelizer(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            zzc(e);
        }
    }

    public zzj(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.zza = parentDataModifierDefaultImpls;
    }
}
