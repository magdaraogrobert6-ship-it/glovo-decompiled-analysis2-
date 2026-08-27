package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class gE extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ FC BGx;
    public final /* synthetic */ Ltx mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gE(FC fc, Ltx ltx) {
        super(1);
        this.BGx = fc;
        this.mbG = ltx;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, FC fc) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(thSerializer), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new d1((String) fc.HQ.MediaSessionCompatResultReceiverWrapper(), (List) obj)));
        }
    }

    public final void BGx(Object obj) {
        FC fc = this.BGx;
        fc.BGx.BGx(new ZM$$ExternalSyntheticLambda1(obj, this.mbG, fc, 2));
    }
}
