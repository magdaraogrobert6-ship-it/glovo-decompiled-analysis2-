package com.google.android.play.core.review;

import android.app.PendingIntent;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends ReviewInfo {
    private final PendingIntent zza;
    private final boolean zzb;

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ReviewInfo{pendingIntent=", this.zza.toString(), ", isNoOp="), this.zzb, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewInfo)) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        return this.zza.equals(reviewInfo.zza()) && this.zzb == reviewInfo.zzb();
    }

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null pendingIntent");
            throw null;
        }
        this.zza = pendingIntent;
        this.zzb = z;
    }
}
