package com.incognia.internal;

import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.util.ArrayList;
import java.util.Map;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class qQ implements yUe {
    public final NvL BGx;
    public final utV HQ;
    public final SVJ hIl;
    public final SVJ hs;
    public final UsU mbG;
    public static final String VV3 = (String) W4i.bq.MediaSessionCompatResultReceiverWrapper();
    public static final long A1 = 28800000;
    public static final long q = CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL;
    public static final String fZl = (String) W4i.z.MediaSessionCompatResultReceiverWrapper();
    public static final String S = (String) W4i.iG.MediaSessionCompatResultReceiverWrapper();
    public static final String iaH = (String) W4i.gB0.MediaSessionCompatResultReceiverWrapper();
    public JyL N = VPw.BGx;
    public final Map x = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0(S, new ArrayList()), new onViewAttachedToWindowlambda0(iaH, new ArrayList()));

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.N;
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        this.N = c39.BGx;
        vn8.invoke();
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.N = Yp.BGx;
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.N = pbf.BGx;
        this.HQ.BGx(xUW.class, this.hIl);
        this.HQ.BGx(A2B.class, this.hs);
        NvL nvL = this.BGx;
        long jOptLong = ((JSONObject) nvL.BGx.get()).optLong(VV3, A1);
        UsU usU = bWV.BGx;
        bWV.BGx(new FsT(S, jOptLong));
        bWV.BGx(new FsT(iaH, q));
    }

    public qQ(NvL nvL, UsU usU, utV utv) {
        this.BGx = nvL;
        this.mbG = usU;
        this.HQ = utv;
        String str = fZl;
        this.hIl = new SVJ(str, usU, new T4(this));
        this.hs = new SVJ(str, usU, new V8F(this));
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.mbG;
    }
}
