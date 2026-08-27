package com.incognia.internal;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class B5 implements yUe {
    public static final long q = 86400000;
    public boolean A1;
    public final jgb BGx;
    public final NvL HQ;
    public final UsU N;
    public final SVJ VV3;
    public final List hIl;
    public JyL hs = VPw.BGx;
    public final mn mbG;
    public final utV x;
    public static final String fZl = (String) W4i.Kt3.MediaSessionCompatResultReceiverWrapper();
    public static final String S = (String) W4i.Sfz.MediaSessionCompatResultReceiverWrapper();

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.hs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void BGx(B5 b5, jP7 jp7) {
        JSONObject jSONObject;
        Long l;
        Boolean bool;
        Boolean bool2;
        Long l2;
        b5.BGx.getClass();
        wf wfVarBGx = jgb.BGx();
        JSONObject jSONObject2 = jp7.BGx;
        Object objValueOf = null;
        if (jSONObject2 != null) {
            jSONObject = jSONObject2;
        } else if (wfVarBGx != null) {
            jSONObject2 = wfVarBGx.BGx;
            jSONObject = jSONObject2;
        } else {
            jSONObject = null;
        }
        Long lValueOf = jp7.mbG;
        if (lValueOf == null) {
            lValueOf = wfVarBGx != null ? Long.valueOf(wfVarBGx.HQ) : null;
        }
        Long l3 = jp7.HQ;
        if (l3 == null) {
            l = wfVarBGx != null ? wfVarBGx.N : null;
        } else {
            l = l3;
        }
        if (l3 != null) {
            try {
                long jSubtractExact = StrictMath.subtractExact(System.currentTimeMillis(), jp7.HQ.longValue());
                bool = Boolean.FALSE;
                objValueOf = Long.valueOf(jSubtractExact);
            } catch (ArithmeticException unused) {
                bool = Boolean.TRUE;
            }
            bool2 = bool;
            l2 = objValueOf;
        } else {
            Long l4 = wfVarBGx != null ? wfVarBGx.x : null;
            bool2 = wfVarBGx != null ? wfVarBGx.hIl : null;
            l2 = l4;
        }
        if (jSONObject != null && lValueOf != null) {
            jgb jgbVar = b5.BGx;
            wf wfVar = new wf(jSONObject, SystemClock.elapsedRealtime(), lValueOf.longValue(), l, l2, bool2);
            jgbVar.getClass();
            Ay.mbG.BGx(jgb.BGx, wfVar, V9H.BGx);
        }
        JSONObject jSONObject3 = jp7.BGx;
        if (jSONObject3 != null) {
            b5.HQ.BGx.set(jSONObject3);
            Iterator it = b5.hIl.iterator();
            while (it.hasNext()) {
                ((MtT) it.next()).BGx(b5.HQ);
            }
        }
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.hs = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(1, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.hs = pbf.BGx;
        this.x.BGx(xUW.class, this.VV3);
        UsU usU = bWV.BGx;
        bWV.BGx(new FsT(S, q));
    }

    public B5(jgb jgbVar, mn mnVar, NvL nvL, UsU usU, KWh kWh, utV utv, List list) {
        this.BGx = jgbVar;
        this.mbG = mnVar;
        this.HQ = nvL;
        this.N = usU;
        this.x = utv;
        this.hIl = list;
        this.VV3 = new SVJ(fZl, usU, new CvW(this));
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        this.hs = c39.BGx;
        vn8.invoke();
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.N;
    }

    public static final void BGx(B5 b5) {
        b5.BGx.getClass();
        wf wfVarBGx = jgb.BGx();
        if (wfVarBGx != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = wfVarBGx.mbG;
            if (jElapsedRealtime - j < q && jElapsedRealtime >= j) {
                return;
            }
        }
        if (b5.A1) {
            return;
        }
        b5.A1 = true;
        mn mnVar = b5.mbG;
        b5.BGx.getClass();
        mnVar.BGx(jgb.BGx(), new nKs(b5, null), new SVT(b5, null));
    }
}
