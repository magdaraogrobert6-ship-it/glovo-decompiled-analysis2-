package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class iES extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Oc BGx;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iES(Oc oc, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(1);
        this.BGx = oc;
        this.mbG = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(Object obj, Oc oc, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            B74 b74 = oc.x;
            if (b74 == null || !b74.mbG.compareAndSet(0, 3)) {
                return;
            }
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(thSerializer), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        JD jd = (JD) obj;
        B74 b75 = oc.x;
        if (b75 == null || !b75.mbG.compareAndSet(0, 3)) {
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new Ya((String) oc.N.MediaSessionCompatResultReceiverWrapper(), jd)));
    }

    public final void BGx(Object obj) {
        Oc oc = this.BGx;
        oc.mbG.BGx(new ZM$$ExternalSyntheticLambda1(obj, (PG) oc, this.mbG, 3));
    }
}
