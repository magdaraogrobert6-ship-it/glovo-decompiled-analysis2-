package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import kotlin.LazyKt__LazyJVMKt;
import o.ParentDataModifierDefaultImpls;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint
public final class zzd implements ReviewManager {
    private final zzi zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task requestReviewFlow() {
        return this.zza.zza();
    }

    public zzd(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task launchReviewFlow(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.zzb()) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.zza());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        intent.putExtra("result_receiver", new zzc(this, this.zzb, parentDataModifierDefaultImpls));
        activity.startActivity(intent);
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }
}
