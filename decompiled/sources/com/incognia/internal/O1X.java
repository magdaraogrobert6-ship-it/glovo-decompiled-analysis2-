package com.incognia.internal;

import android.location.Geocoder;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class O1X extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Rq BGx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1X(Rq rq) {
        super(0);
        this.BGx = rq;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        if (Geocoder.isPresent()) {
            return new Geocoder(this.BGx.BGx, Locale.ENGLISH);
        }
        return null;
    }
}
