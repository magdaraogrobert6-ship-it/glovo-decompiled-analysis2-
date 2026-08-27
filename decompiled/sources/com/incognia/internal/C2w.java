package com.incognia.internal;

import android.content.Context;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.incognia.Incognia$$ExternalSyntheticLambda0;
import o.ParentDataModifier;
import o.getMeasuredSizeYbymL2g;
import o.getOwner;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class C2w implements yUe {
    public static final String e = (String) W4i.n0.MediaSessionCompatResultReceiverWrapper();
    public final xK A1;
    public final Context BGx;
    public final UsU HQ;
    public final X6a N;
    public u4 S;
    public FusedLocationProviderClient fZl;
    public final Ymx hIl;
    public final F5b hs;
    public final NvL mbG;
    public getOwner q;
    public final Tj x;
    public JyL VV3 = VPw.BGx;
    public final onViewDetachedFromWindowlambda1 iaH = new isAdapterPositionOnScreen(new BON(this));

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.VV3;
    }

    public static final void BGx(C2w c2w, THn tHn) {
        Task currentLocation;
        getOwner getowner = new getOwner();
        c2w.q = getowner;
        try {
            FusedLocationProviderClient fusedLocationProviderClient = c2w.fZl;
            if (fusedLocationProviderClient == null) {
                fusedLocationProviderClient = null;
            }
            currentLocation = fusedLocationProviderClient.getCurrentLocation(100, getowner.read());
        } catch (Throwable unused) {
            u4 u4Var = c2w.S;
            if (u4Var == null) {
                u4Var = null;
            }
            getMeasuredSizeYbymL2g getmeasuredsizeybyml2g = c2w.q.read();
            u4Var.getClass();
            try {
                Object objInvoke = u4Var.BGx.getClass().getMethod((String) W4i.QCQ.MediaSessionCompatResultReceiverWrapper(), Integer.TYPE, ParentDataModifier.class).invoke(u4Var.BGx, 100, getmeasuredsizeybyml2g);
                currentLocation = objInvoke instanceof Task ? (Task) objInvoke : null;
            } catch (Throwable unused2) {
            }
        }
        if (currentLocation == null) {
            tHn.BGx(null);
        } else {
            currentLocation.addOnSuccessListener(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(26, new yw(c2w, tHn))).addOnFailureListener(new C2w$$ExternalSyntheticLambda4(c2w, tHn)).addOnCanceledListener(new C2w$$ExternalSyntheticLambda4(c2w, tHn));
        }
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.VV3 = Yp.BGx;
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.VV3 = pbf.BGx;
        if (((Boolean) this.iaH.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
            this.fZl = LocationServices.getFusedLocationProviderClient(this.BGx);
            this.S = new u4(this.BGx);
        }
    }

    public C2w(Context context, NvL nvL, UsU usU, X6a x6a, Tj tj, Ymx ymx, F5b f5b) {
        this.BGx = context;
        this.mbG = nvL;
        this.HQ = usU;
        this.N = x6a;
        this.x = tj;
        this.hIl = ymx;
        this.hs = f5b;
        this.A1 = new xK(ymx);
    }

    public static final void mbG(C2w c2w, THn tHn) {
        O6.BGx(c2w, new Incognia$$ExternalSyntheticLambda0(1, tHn));
    }

    public final boolean BGx(huJ huj) {
        if (((Boolean) this.iaH.MediaSessionCompatResultReceiverWrapper()).booleanValue() && this.fZl != null && this.S != null && ((Boolean) this.x.VV3.MediaSessionCompatResultReceiverWrapper()).booleanValue() && this.hIl.mbG()) {
            return O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 3, huj));
        }
        return false;
    }

    public static final void BGx(C2w c2w, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getOwner getowner;
        if (((Boolean) c2w.iaH.MediaSessionCompatResultReceiverWrapper()).booleanValue() && (getowner = c2w.q) != null) {
            getowner.IconCompatParcelizer();
        }
        c2w.VV3 = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.HQ;
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
    }

    public static final void BGx(C2w c2w, THn tHn, Exception exc) {
        O6.BGx(c2w, new Rq$$ExternalSyntheticLambda0(c2w, exc, tHn, 1));
    }

    public static final void BGx(C2w c2w, Exception exc, THn tHn) {
        int statusCode;
        c2w.getClass();
        ApiException apiException = exc instanceof ApiException ? (ApiException) exc : null;
        if (apiException == null || ((statusCode = apiException.getStatusCode()) != 17 && statusCode != 20 && statusCode != 22)) {
            c2w.N.BGx((Throwable) exc, false);
        }
        tHn.BGx(null);
    }

    public static final void BGx(THn tHn) {
        tHn.BGx(null);
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 2, vn8));
    }
}
