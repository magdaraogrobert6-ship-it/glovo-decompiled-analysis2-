package com.incognia.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class BvF implements yUe {
    public static final long S = 300000;
    public final xK A1;
    public final UsU BGx;
    public final Ymx HQ;
    public final NvL N;
    public final LocationManager VV3;
    public final Executor hs;
    public final X6a mbG;
    public final F5b x;
    public static final String iaH = (String) W4i.LT.MediaSessionCompatResultReceiverWrapper();
    public static final String e = (String) W4i.pW.MediaSessionCompatResultReceiverWrapper();
    public JyL hIl = VPw.BGx;
    public final LinkedHashSet q = new LinkedHashSet();
    public final LP0 fZl = new LP0(this);

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.hIl;
    }

    public final void A1() {
        if (mbG("passive")) {
            NvL nvL = this.N;
            long jOptLong = ((JSONObject) nvL.BGx.get()).optLong(iaH, S);
            NvL nvL2 = this.N;
            this.VV3.requestLocationUpdates("passive", jOptLong, (float) ((JSONObject) nvL2.BGx.get()).optDouble(e, 200.0d), this.fZl, this.BGx.mbG.getLooper());
        }
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.hIl = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(2, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.hIl = pbf.BGx;
    }

    public final boolean mbG(String str) {
        if ("passive".equals(str)) {
            return this.HQ.mbG();
        }
        boolean zEquals = "gps".equals(str);
        Ymx ymx = this.HQ;
        if (zEquals) {
            return ymx.mbG() && this.VV3.isProviderEnabled(str);
        }
        return ymx.BGx() && this.VV3.isProviderEnabled(str);
    }

    public BvF(Context context, UsU usU, X6a x6a, Ymx ymx, NvL nvL, F5b f5b) {
        this.BGx = usU;
        this.mbG = x6a;
        this.HQ = ymx;
        this.N = nvL;
        this.x = f5b;
        this.hs = fFk.BGx(usU);
        this.VV3 = (LocationManager) context.getSystemService("location");
        this.A1 = new xK(ymx);
    }

    public final void q() {
        this.VV3.removeTestProvider("gps");
    }

    public final boolean VV3() {
        if (XUh.BGx(XUh.BGx, 28, 0, 2)) {
            return this.VV3.isLocationEnabled();
        }
        return mbG("gps") || mbG("network");
    }

    public final Integer hs() {
        if (XUh.BGx(XUh.BGx, 28, 0, 2)) {
            return Integer.valueOf(this.VV3.getGnssYearOfHardware());
        }
        return null;
    }

    public final String x() {
        if (XUh.BGx(XUh.BGx, 28, 0, 2)) {
            return this.VV3.getGnssHardwareModelName();
        }
        return null;
    }

    public final boolean BGx(String str, huJ huj) {
        int i = 0;
        if (!mbG(str)) {
            return false;
        }
        io2 io2Var = new io2(huj, this);
        boolean zBGx = XUh.BGx(XUh.BGx, 30, 0, 2);
        LocationManager locationManager = this.VV3;
        if (zBGx) {
            locationManager.getCurrentLocation(str, null, this.hs, new BvF$$ExternalSyntheticLambda0(i, io2Var));
            return true;
        }
        locationManager.requestSingleUpdate(str, new FX(io2Var), this.BGx.mbG.getLooper());
        return true;
    }

    public final Gbn BGx(String str) {
        if (!mbG(str)) {
            return null;
        }
        try {
            Location lastKnownLocation = this.VV3.getLastKnownLocation(str);
            rwU rwuBGx = this.x.BGx(lastKnownLocation);
            if (lastKnownLocation != null) {
                return this.A1.BGx(new onViewAttachedToWindowlambda0(lastKnownLocation, rwuBGx));
            }
            return null;
        } catch (Throwable th) {
            this.mbG.BGx(th, false);
            return null;
        }
    }

    public static final void mbG(BvF bvF, THn tHn) {
        bvF.q.remove(tHn);
        if (bvF.q.isEmpty() && bvF.HQ.mbG()) {
            bvF.VV3.removeUpdates(bvF.fZl);
        }
    }

    public final void mbG() {
        this.VV3.addTestProvider("gps", false, false, false, false, true, true, true, 1, 1);
    }

    public final void BGx(EGf eGf) {
        O6.BGx(this, new BvF$$ExternalSyntheticLambda2(this, eGf, 0));
    }

    public final void mbG(EGf eGf) {
        O6.BGx(this, new BvF$$ExternalSyntheticLambda2(this, eGf, 1));
    }

    public static final void BGx(BvF bvF, THn tHn) {
        if (bvF.q.isEmpty()) {
            bvF.A1();
        }
        bvF.q.add(tHn);
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Location location) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(location);
    }

    public static final void BGx(BvF bvF) {
        if (bvF.q.isEmpty() || !bvF.mbG("passive")) {
            return;
        }
        bvF.A1();
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 1, vn8));
    }

    public static final void BGx(BvF bvF, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        bvF.q.clear();
        if (bvF.HQ.mbG()) {
            bvF.VV3.removeUpdates(bvF.fZl);
        }
        bvF.hIl = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }
}
