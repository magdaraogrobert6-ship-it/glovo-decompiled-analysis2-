package com.incognia.internal;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class Rq {
    public final Context BGx;
    public final onViewDetachedFromWindowlambda1 HQ = new isAdapterPositionOnScreen(new O1X(this));
    public final qvm N = new qvm();
    public U9 hIl;
    public final UsU mbG;
    public i4N x;

    public static final void BGx(Gbn gbn, Rq rq, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        i4N i4n;
        try {
            double d = gbn.BGx;
            double d2 = gbn.mbG;
            i4N i4n2 = new i4N(d, d2);
            if (rq.hIl != null && (i4n = rq.x) != null) {
                float[] fArr = new float[3];
                Location.distanceBetween(d, d2, i4n.BGx, i4n.mbG, fArr);
                if (fArr[0] < 10.0f) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(rq.hIl));
                    return;
                }
            }
            if (((Geocoder) rq.HQ.MediaSessionCompatResultReceiverWrapper()) == null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new isItemDismissable(new SDj())));
                return;
            }
            if (XUh.BGx(XUh.BGx, 33, 0, 2)) {
                ((Geocoder) rq.HQ.MediaSessionCompatResultReceiverWrapper()).getFromLocation(d, d2, 1, new pXU(rq, i4n2, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
                return;
            }
            List<Address> fromLocation = ((Geocoder) rq.HQ.MediaSessionCompatResultReceiverWrapper()).getFromLocation(d, d2, 1);
            if (fromLocation != null) {
                rq.BGx(fromLocation, i4n2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new isItemDismissable(new hPl("synchronous geocoding error"))));
            }
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "geocoding error";
            }
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new hPl(message)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public Rq(Context context, UsU usU) {
        this.BGx = context;
        this.mbG = usU;
    }

    public final void BGx(Gbn gbn, dO dOVar) {
        this.mbG.BGx(new Rq$$ExternalSyntheticLambda0(gbn, this, dOVar, 0));
    }

    public final void BGx(List list, i4N i4n, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (list.isEmpty()) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new hPl("no available addresses for location")), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        Address address = (Address) list.get(0);
        address.setLatitude(i4n.BGx);
        address.setLongitude(i4n.mbG);
        this.N.getClass();
        U9 u9BGx = qvm.BGx(address);
        this.x = i4n;
        this.hIl = u9BGx;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(u9BGx));
    }
}
