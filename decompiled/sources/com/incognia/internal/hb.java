package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createInAppMessageEventSubscriber;
import o.isItemDismissable;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class hb implements sk {
    public static final String hs = (String) W4i.EeS.MediaSessionCompatResultReceiverWrapper();
    public final PG BGx;
    public final S3c HQ;
    public boolean N;
    public final String hIl;
    public final boolean mbG;
    public final boolean x;

    public static final void HQ(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, hb hbVar) {
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new ib(hbVar.BGx.mbG())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public final boolean mbG(UsU usU, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws JSONException {
        Boolean bool;
        S3c s3c = this.HQ;
        d9 d9VarBGx = s3c.mbG.BGx(s3c.BGx);
        if (d9VarBGx == null || (bool = d9VarBGx.HQ) == null || bool.booleanValue()) {
            return false;
        }
        usU.BGx(new hb$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, 0));
        return true;
    }

    public hb(PG pg, SgE sgE, boolean z) throws JSONException {
        Boolean bool;
        this.BGx = pg;
        this.mbG = z;
        S3c s3c = new S3c(pg.mbG(), sgE.BGx, sgE.mbG);
        this.HQ = s3c;
        d9 d9VarBGx = s3c.mbG.BGx(s3c.BGx);
        this.x = (d9VarBGx == null || (bool = d9VarBGx.x) == null) ? false : bool.booleanValue();
        this.hIl = hs + pg.mbG();
    }

    public final void BGx(UsU usU, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ArrayList arrayList) throws JSONException {
        d9 d9VarBGx;
        Boolean bool;
        Boolean bool2;
        if (BGx(usU, r8lambdaunavo3sxub_pc9xroryotnrlvsm2) || mbG(usU, r8lambdaunavo3sxub_pc9xroryotnrlvsm2) || BGx(usU, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, arrayList)) {
            return;
        }
        this.N = true;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
        createbrazeuserchangeeventsubscriberlambda01.read = -1;
        S3c s3c = this.HQ;
        d9 d9VarBGx2 = s3c.mbG.BGx(s3c.BGx);
        if ((d9VarBGx2 == null || (bool2 = d9VarBGx2.HQ) == null || bool2.booleanValue()) && ((d9VarBGx = s3c.mbG.BGx(s3c.BGx)) == null || (bool = d9VarBGx.hIl) == null || bool.booleanValue())) {
            UsU usU2 = E79.BGx;
            createbrazeuserchangeeventsubscriberlambda01.read = E79.BGx(this.hIl, null);
        }
        this.BGx.BGx(new y0S(usU, this, arrayList, createinappmessageeventsubscriber, r8lambdaunavo3sxub_pc9xroryotnrlvsm), new Ltx(createbrazeuserchangeeventsubscriberlambda01, usU, this, arrayList, createinappmessageeventsubscriber, r8lambdaunavo3sxub_pc9xroryotnrlvsm2));
    }

    public static final void mbG(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, hb hbVar) {
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new Z9T(hbVar.BGx.mbG())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public final boolean BGx(UsU usU, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!this.N) {
            return false;
        }
        usU.BGx(new hb$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, 1));
        return true;
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, hb hbVar) {
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new MTG(hbVar.BGx.mbG())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public final boolean BGx(UsU usU, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ArrayList arrayList) {
        if (this.HQ.BGx(arrayList)) {
            return false;
        }
        usU.BGx(new hb$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, 2));
        return true;
    }
}
