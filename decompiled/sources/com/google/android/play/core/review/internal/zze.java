package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zze extends zzb implements zzf {
    public static zzf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        if (iInterfaceQueryLocalInterface instanceof zzf) {
            return (zzf) iInterfaceQueryLocalInterface;
        }
        return new zzd(iBinder);
    }
}
