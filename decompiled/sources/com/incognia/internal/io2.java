package com.incognia.internal;

import android.location.Location;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class io2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ huJ BGx;
    public final /* synthetic */ BvF mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io2(huJ huj, BvF bvF) {
        super(1);
        this.BGx = huj;
        this.mbG = bvF;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        if (location == null) {
            this.BGx.BGx(null);
        } else {
            this.BGx.BGx(this.mbG.A1.BGx(new onViewAttachedToWindowlambda0(location, this.mbG.x.BGx(location))));
        }
        return createFromParcel.INSTANCE;
    }
}
