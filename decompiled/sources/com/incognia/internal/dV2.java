package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class dV2 implements yUe, BR {
    public final UsU BGx;
    public final iLf HQ;
    public final ByN N;
    public final V9 hIl;
    public final sjz mbG;
    public final NvL x;
    public static final String fZl = (String) W4i.sur.MediaSessionCompatResultReceiverWrapper();
    public static final String S = (String) W4i.B.MediaSessionCompatResultReceiverWrapper();
    public static final String iaH = (String) W4i.YO.MediaSessionCompatResultReceiverWrapper();
    public JyL hs = VPw.BGx;
    public boolean VV3 = mbG();
    public final fwK A1 = new fwK(GO.BGx, pkS.BGx, iaH);
    public final CJX q = new Tm7$$ExternalSyntheticLambda2(1, this);

    public static ItP fZl() {
        try {
            Integer numHQ = Ay.BGx.HQ(S);
            if (numHQ == null) {
                return null;
            }
            int i = ItP.mbG;
            return DF.BGx(numHQ.intValue());
        } catch (Throwable unused) {
            Ay.BGx.BGx(S);
            return null;
        }
    }

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.hs;
    }

    @Override // com.incognia.internal.BR
    public final void VV3() {
        kV.BGx(this);
    }

    @Override // com.incognia.internal.BR
    public final boolean x() {
        return this.VV3;
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.hs = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(14, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.hs = pbf.BGx;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    public final List q() {
        ArrayList arrayList;
        JSONArray jSONArrayOptJSONArray;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        try {
            fwK fwk = this.A1;
            String strX = Ay.BGx.x(iaH);
            fwk.getClass();
            if (strX == null || (jSONArrayOptJSONArray = new JSONObject(strX).optJSONArray(fwk.HQ)) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(fwk.mbG.invoke(jSONArrayOptJSONArray.getJSONObject(i)));
                }
            }
            return arrayList == null ? instance_delegatelambda0Var : arrayList;
        } catch (Throwable unused) {
            Ay.BGx.BGx(iaH);
            return instance_delegatelambda0Var;
        }
    }

    public dV2(UsU usU, KWh kWh, sjz sjzVar, iLf ilf, ByN byN, NvL nvL, V9 v9) {
        this.BGx = usU;
        this.mbG = sjzVar;
        this.HQ = ilf;
        this.N = byN;
        this.x = nvL;
        this.hIl = v9;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x006b A[LOOP:0: B:13:0x0065->B:15:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    public static final void mbG(dV2 dv2, ItP itP) {
        ArrayList arrayListIconCompatParcelizer;
        int size;
        NvL nvL;
        fwK fwk;
        JSONArray jSONArray;
        Iterator it;
        JSONObject jSONObjectPut;
        String string;
        dv2.getClass();
        ItP itPFZl = fZl();
        itP.getClass();
        if (itPFZl == null) {
            arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) dv2.q());
            arrayListIconCompatParcelizer.add(new Lu(itP.BGx, System.currentTimeMillis(), dv2.N.BGx().BGx()));
            size = arrayListIconCompatParcelizer.size();
            nvL = dv2.x;
            if (size > ((JSONObject) nvL.BGx.get()).optInt(fZl, 10)) {
                arrayListIconCompatParcelizer.remove(0);
            }
            fwk = dv2.A1;
            fwk.getClass();
            jSONArray = new JSONArray();
            it = arrayListIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                jSONArray.put(fwk.BGx.invoke(it.next()));
            }
            jSONObjectPut = new JSONObject().put(fwk.HQ, jSONArray);
            if (jSONObjectPut != null) {
                string = jSONObjectPut.toString();
            } else {
                string = null;
            }
            Ay.BGx.BGx(iaH, string);
        } else {
            Rb rb = Rb.HQ;
            if (itPFZl.equals(rb) || itP.equals(rb)) {
                arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) dv2.q());
                arrayListIconCompatParcelizer.add(new Lu(itP.BGx, System.currentTimeMillis(), dv2.N.BGx().BGx()));
                size = arrayListIconCompatParcelizer.size();
                nvL = dv2.x;
                if (size > ((JSONObject) nvL.BGx.get()).optInt(fZl, 10)) {
                    arrayListIconCompatParcelizer.remove(0);
                }
                fwk = dv2.A1;
                fwk.getClass();
                jSONArray = new JSONArray();
                it = arrayListIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    jSONArray.put(fwk.BGx.invoke(it.next()));
                }
                jSONObjectPut = new JSONObject().put(fwk.HQ, jSONArray);
                if (jSONObjectPut != null) {
                    string = jSONObjectPut.toString();
                } else {
                    string = null;
                }
                Ay.BGx.BGx(iaH, string);
            }
        }
        Ay.BGx.BGx(S, Integer.valueOf(itP.BGx));
    }

    @Override // com.incognia.internal.BR
    public final void A1() {
        O6.BGx(this, new dV2$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // com.incognia.internal.BR
    public final void hs() {
        O6.BGx(this, new dV2$$ExternalSyntheticLambda0(this, 1));
    }

    public static final void BGx(dV2 dv2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!dv2.HQ.BGx("android.permission.READ_PHONE_STATE")) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new LFd(iaH)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(dv2.q()));
        fwK fwk = dv2.A1;
        fwk.getClass();
        JSONObject jSONObjectPut = new JSONObject().put(fwk.HQ, new JSONArray());
        Ay.BGx.BGx(iaH, jSONObjectPut != null ? jSONObjectPut.toString() : null);
    }

    public static final void HQ(dV2 dv2) {
        if (dv2.VV3) {
            dv2.mbG.BGx(dv2.q);
        }
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    @Override // com.incognia.internal.BR
    public final void BGx(boolean z) {
        this.VV3 = z;
    }

    public static final void BGx(dV2 dv2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (dv2.VV3) {
            dv2.mbG.mbG(dv2.q);
        }
        dv2.hs = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public static final void BGx(dV2 dv2, ItP itP) {
        O6.BGx(dv2, new N6$$ExternalSyntheticLambda0(dv2, 20, itP));
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 21, vn8));
    }

    public static final void BGx(dV2 dv2) {
        dv2.mbG.mbG(dv2.q);
    }

    public final void BGx(m4K m4k) {
        if (O6.BGx(this, new dV2$$ExternalSyntheticLambda3(this, m4k, 1))) {
            return;
        }
        m4k.BGx(new isItemDismissable(new vqX(S)));
    }

    public final void BGx(gE gEVar) {
        if (O6.BGx(this, new dV2$$ExternalSyntheticLambda3(this, gEVar, 0))) {
            return;
        }
        gEVar.BGx(new isItemDismissable(new vqX(iaH)));
    }

    @Override // com.incognia.internal.MtT
    public final void BGx(NvL nvL) {
        kV.mbG(this);
    }

    @Override // com.incognia.internal.BR
    public final boolean mbG() {
        return this.hIl.mbG(S) || this.hIl.mbG(iaH);
    }

    public static final void mbG(dV2 dv2) {
        dv2.mbG.BGx(dv2.q);
    }

    public static final void mbG(dV2 dv2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (dv2.HQ.BGx("android.permission.READ_PHONE_STATE")) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(fZl()));
        } else {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new LFd(S)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
