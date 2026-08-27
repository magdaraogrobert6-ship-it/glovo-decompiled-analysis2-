package com.incognia.internal;

import android.location.Geocoder$GeocodeListener;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import o.isItemDismissable;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class pXU implements Geocoder$GeocodeListener {
    public final /* synthetic */ Rq BGx;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM HQ;
    public final /* synthetic */ i4N mbG;

    public pXU(Rq rq, i4N i4n, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.BGx = rq;
        this.mbG = i4n;
        this.HQ = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void onGeocode(List list) {
        Rq rq = this.BGx;
        rq.mbG.BGx(new OHI$$ExternalSyntheticLambda0(rq, list, this.mbG, this.HQ));
    }

    public final void onError(String str) {
        super.onError(str);
        this.BGx.mbG.BGx(new N6$$ExternalSyntheticLambda0(this.HQ, 22, str));
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str) {
        if (str == null) {
            str = "unknown geocoding error";
        }
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new hPl(str)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final void BGx(Rq rq, List list, i4N i4n, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        rq.BGx(list, i4n, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
