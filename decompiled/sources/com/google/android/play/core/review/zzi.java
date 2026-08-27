package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.review.internal.zzt;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint
public final class zzi {
    private static final com.google.android.play.core.review.internal.zzi zzb = new com.google.android.play.core.review.internal.zzi("ReviewService");
    zzt zza;
    private final String zzc;

    public final Task zza() {
        String str = this.zzc;
        com.google.android.play.core.review.internal.zzi zziVar = zzb;
        zziVar.zzc("requestInAppReview (%s)", str);
        if (this.zza != null) {
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
            this.zza.zzs(new zzf(this, parentDataModifierDefaultImpls, parentDataModifierDefaultImpls), parentDataModifierDefaultImpls);
            return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        }
        zziVar.zza("Play Store app is either not installed or not the official version", new Object[0]);
        Object[] objArr = {new ReviewException(-1)};
        return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.play.core.review.zze] */
    public zzi(Context context) {
        this.zzc = context.getPackageName();
        if (com.google.android.play.core.review.internal.zzw.zza(context)) {
            this.zza = new zzt(context, zzb, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: com.google.android.play.core.review.zze
            }, null);
        }
    }
}
