package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yXu extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ JHE BGx;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yXu(JHE jhe, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(1);
        this.BGx = jhe;
        this.mbG = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(Object obj, JHE jhe, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            B74 b74 = jhe.hIl;
            if (b74 == null || !b74.mbG.compareAndSet(0, 3)) {
                return;
            }
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(thSerializer), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        List list = (List) obj;
        B74 b75 = jhe.hIl;
        if (b75 == null || !b75.mbG.compareAndSet(0, 3)) {
            return;
        }
        String str = JHE.hs;
        NvL nvL = jhe.BGx;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new PLK(str, list, ((JSONObject) nvL.BGx.get()).optBoolean(JHE.A1, true))));
    }

    public final void BGx(Object obj) {
        JHE jhe = this.BGx;
        jhe.mbG.BGx(new Rq$$ExternalSyntheticLambda0(obj, jhe, this.mbG, 7));
    }
}
