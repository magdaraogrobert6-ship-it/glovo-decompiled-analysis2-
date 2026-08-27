package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class m4K extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ dQ BGx;
    public final /* synthetic */ Ltx mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4K(dQ dQVar, Ltx ltx) {
        super(1);
        this.BGx = dQVar;
        this.mbG = ltx;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, dQ dQVar) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(thSerializer), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        } else {
            ItP itP = (ItP) obj;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new JWV((String) dQVar.HQ.MediaSessionCompatResultReceiverWrapper(), itP != null ? Integer.valueOf(itP.BGx) : null, new MDp(new zn(itP)))));
        }
    }

    public final void BGx(Object obj) {
        dQ dQVar = this.BGx;
        dQVar.BGx.BGx(new ZM$$ExternalSyntheticLambda1(obj, this.mbG, dQVar, 4));
    }
}
