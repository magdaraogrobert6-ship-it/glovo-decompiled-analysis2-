package com.incognia.internal;

import android.location.Location;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class yw extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ C2w BGx;
    public final /* synthetic */ THn mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(C2w c2w, THn tHn) {
        super(1);
        this.BGx = c2w;
        this.mbG = tHn;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx((Location) obj);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(Location location, THn tHn, C2w c2w) {
        if (location == null) {
            tHn.BGx(null);
        } else {
            tHn.BGx(c2w.A1.BGx(new onViewAttachedToWindowlambda0(location, c2w.hs.BGx(location))));
        }
    }

    public final void BGx(Location location) {
        C2w c2w = this.BGx;
        O6.BGx(c2w, new Rq$$ExternalSyntheticLambda0(location, this.mbG, c2w, 8));
    }
}
