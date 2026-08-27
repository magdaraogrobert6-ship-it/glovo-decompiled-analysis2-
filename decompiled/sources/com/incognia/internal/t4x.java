package com.incognia.internal;

import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class t4x extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ BlY BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        this.BGx.invoke(new zR(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4x(BlY blY) {
        super(1);
        this.BGx = blY;
    }
}
