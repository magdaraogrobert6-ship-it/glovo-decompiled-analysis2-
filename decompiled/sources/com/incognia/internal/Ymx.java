package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.support.api.location.common.LocationConstant;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Ymx {
    public static final String x = (String) W4i.p1R.MediaSessionCompatResultReceiverWrapper();
    public final NvL BGx;
    public final iLf HQ;
    public final ByN N;
    public final YZr mbG;

    public final boolean BGx() {
        boolean zContains;
        t1p t1pVarBGx = this.N.BGx();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t1pVarBGx, qf.BGx}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t1pVarBGx, tr.BGx}, getCieXyz.write())).booleanValue()) {
                iLf ilf = this.HQ;
                return ilf.BGx("android.permission.ACCESS_FINE_LOCATION") || ilf.BGx("android.permission.ACCESS_COARSE_LOCATION");
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        if (!((JSONObject) this.BGx.BGx.get()).optBoolean(x, true) && XUh.BGx(XUh.BGx, 29, 0, 2)) {
            iLf ilf2 = this.HQ;
            return ilf2.BGx("android.permission.ACCESS_FINE_LOCATION") || ilf2.BGx("android.permission.ACCESS_COARSE_LOCATION");
        }
        iLf ilf3 = this.HQ;
        if (ilf3.BGx("android.permission.ACCESS_FINE_LOCATION") || ilf3.BGx("android.permission.ACCESS_COARSE_LOCATION")) {
            iLf ilf4 = this.HQ;
            dCe dceMbG = this.mbG.mbG();
            List list = dceMbG != null ? dceMbG.VV3 : null;
            ilf4.getClass();
            if (XUh.BGx(XUh.BGx, 29, 0, 2)) {
                zContains = ilf4.BGx(LocationConstant.BACKGROUND_PERMISSION);
            } else if (list != null) {
                zContains = list.contains(LocationConstant.BACKGROUND_PERMISSION);
            }
            if (zContains) {
                return true;
            }
        }
        return false;
    }

    public final boolean mbG() {
        boolean zContains;
        t1p t1pVarBGx = this.N.BGx();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t1pVarBGx, qf.BGx}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t1pVarBGx, tr.BGx}, getCieXyz.write())).booleanValue()) {
                return this.HQ.BGx("android.permission.ACCESS_FINE_LOCATION");
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        if (!((JSONObject) this.BGx.BGx.get()).optBoolean(x, true) && XUh.BGx(XUh.BGx, 29, 0, 2)) {
            return this.HQ.BGx("android.permission.ACCESS_FINE_LOCATION");
        }
        if (this.HQ.BGx("android.permission.ACCESS_FINE_LOCATION")) {
            iLf ilf = this.HQ;
            dCe dceMbG = this.mbG.mbG();
            List list = dceMbG != null ? dceMbG.VV3 : null;
            ilf.getClass();
            if (XUh.BGx(XUh.BGx, 29, 0, 2)) {
                zContains = ilf.BGx(LocationConstant.BACKGROUND_PERMISSION);
            } else if (list != null) {
                zContains = list.contains(LocationConstant.BACKGROUND_PERMISSION);
            }
            if (zContains) {
                return true;
            }
        }
        return false;
    }

    public Ymx(NvL nvL, YZr yZr, iLf ilf, ByN byN) {
        this.BGx = nvL;
        this.mbG = yZr;
        this.HQ = ilf;
        this.N = byN;
    }
}
