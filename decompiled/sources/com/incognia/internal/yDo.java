package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yDo implements yUe, BR {
    public final yZI A1;
    public final UsU BGx;
    public final X6a HQ;
    public final KWh N;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM S;
    public final V9 VV3;
    public final NvL hIl;
    public final qee hs;
    public final utV mbG;
    public final yI3 x;
    public static final String TfN = (String) W4i.Uvi.MediaSessionCompatResultReceiverWrapper();
    public static final String OV7 = (String) W4i.Vh3.MediaSessionCompatResultReceiverWrapper();
    public static final long JR = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    public JyL q = VPw.BGx;
    public boolean fZl = mbG();
    public final g6v iaH = new bV$$ExternalSyntheticLambda0(this, 2);
    public final QGs e = new QGs() { // from class: com.incognia.internal.yDo$$ExternalSyntheticLambda1
        @Override // com.incognia.internal.QGs
        public final void BGx(List list) {
            yDo.HQ(this.f$0, list);
        }
    };
    public final fwK VLD = new fwK(waX.BGx, sYX.BGx, TfN);

    @Override // com.incognia.internal.BR
    public final void VV3() {
        kV.BGx(this);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    public final ArrayList q() {
        JSONArray jSONArrayOptJSONArray;
        try {
            fwK fwk = this.VLD;
            String strX = Ay.BGx.x(TfN);
            fwk.getClass();
            if (strX == null || (jSONArrayOptJSONArray = new JSONObject(strX).optJSONArray(fwk.HQ)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(fwk.mbG.invoke(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            Ay.BGx.BGx(TfN);
            return null;
        }
    }

    @Override // com.incognia.internal.BR
    public final boolean x() {
        return this.fZl;
    }

    public static final void N(yDo ydo, List list) {
        Object obj;
        if (list == null) {
            ydo.getClass();
            return;
        }
        ArrayList arrayListQ = ydo.q();
        if (ydo.mbG(list)) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = ydo.S;
            Object obj2 = null;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(ydo.q()));
                ydo.S = null;
                return;
            }
            if (((JSONObject) ydo.hIl.BGx.get()).optBoolean(OV7, true)) {
                qee qeeVar = ydo.hs;
                if (arrayListQ != null && !arrayListQ.isEmpty() && !list.isEmpty()) {
                    int size = arrayListQ.size();
                    int i = 0;
                    do {
                        if (i >= size) {
                            obj = null;
                            break;
                        } else {
                            obj = arrayListQ.get(i);
                            i++;
                        }
                    } while (!((LCt) obj).N);
                    LCt lCt = (LCt) obj;
                    for (Object obj3 : list) {
                        if (((LCt) obj3).N) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    LCt lCt2 = (LCt) obj2;
                    if (lCt != null && lCt2 != null) {
                        String str = lCt.hs;
                        String str2 = lCt.hIl;
                        bj7 bj7Var = new bj7(str, str2);
                        bj7 bj7Var2 = new bj7(lCt2.hs, lCt2.hIl);
                        if ((str != null || str2 != null) && bj7Var.equals(bj7Var2)) {
                            return;
                        }
                    }
                    LinkedHashMap linkedHashMapBGx = qeeVar.BGx(arrayListQ);
                    LinkedHashMap linkedHashMapBGx2 = qeeVar.BGx(list);
                    double dMediaSessionCompatToken = onContentCardDismissed.MediaSessionCompatToken(linkedHashMapBGx2.values()) + onContentCardDismissed.MediaSessionCompatToken(linkedHashMapBGx.values());
                    double dMediaSessionCompatToken2 = 0.0d;
                    if (dMediaSessionCompatToken != 0.0d) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMapBGx.entrySet()) {
                            if (linkedHashMapBGx2.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        double dMediaSessionCompatToken3 = onContentCardDismissed.MediaSessionCompatToken(linkedHashMap.values());
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMapBGx2.entrySet()) {
                            if (linkedHashMapBGx.containsKey(entry2.getKey())) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        dMediaSessionCompatToken2 = (onContentCardDismissed.MediaSessionCompatToken(linkedHashMap2.values()) + dMediaSessionCompatToken3) / dMediaSessionCompatToken;
                    }
                    if (dMediaSessionCompatToken2 > 0.15d) {
                        return;
                    }
                }
                ydo.mbG.BGx(new ZmT(QOQ.mbG));
            }
        }
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.q = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(20, this));
    }

    public final void S() {
        try {
            ArrayList arrayListMbG = this.x.mbG();
            if (arrayListMbG != null) {
                mbG(arrayListMbG);
            }
            this.x.mbG(this.e);
        } catch (Throwable th) {
            this.HQ.BGx(th, false);
        }
    }

    public final boolean fZl() {
        try {
            return this.x.BGx(new QGs() { // from class: com.incognia.internal.yDo$$ExternalSyntheticLambda7
                @Override // com.incognia.internal.QGs
                public final void BGx(List list) {
                    yDo.BGx(this.f$0, list);
                }
            });
        } catch (Throwable th) {
            this.HQ.BGx(th, false);
            return false;
        }
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.q = pbf.BGx;
    }

    public yDo(UsU usU, utV utv, X6a x6a, iP iPVar, KWh kWh, yI3 yi3, NvL nvL, qee qeeVar, V9 v9, yZI yzi) {
        this.BGx = usU;
        this.mbG = utv;
        this.HQ = x6a;
        this.N = kWh;
        this.x = yi3;
        this.hIl = nvL;
        this.hs = qeeVar;
        this.VV3 = v9;
        this.A1 = yzi;
    }

    @Override // com.incognia.internal.BR
    public final void A1() {
        O6.BGx(this, new yDo$$ExternalSyntheticLambda2(this, 2));
    }

    @Override // com.incognia.internal.BR
    public final void hs() {
        O6.BGx(this, new yDo$$ExternalSyntheticLambda2(this, 1));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    public final boolean mbG(List list) throws JSONException {
        if (list != null && !BGx(list)) {
            ArrayList arrayListQ = q();
            if (arrayListQ != null && !arrayListQ.isEmpty() && !list.isEmpty() && arrayListQ.size() == list.size()) {
                if (!arrayListQ.isEmpty()) {
                    int size = arrayListQ.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListQ.get(i);
                        i++;
                        if (!list.contains((LCt) obj)) {
                        }
                    }
                }
            }
            fwK fwk = this.VLD;
            fwk.getClass();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(fwk.BGx.invoke(it.next()));
            }
            JSONObject jSONObjectPut = new JSONObject().put(fwk.HQ, jSONArray);
            Ay.BGx.BGx(TfN, jSONObjectPut != null ? jSONObjectPut.toString() : null);
            return true;
        }
        return false;
    }

    public final boolean BGx(List list) {
        Long l;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((LCt) it.next()).HQ);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((LCt) it.next()).HQ);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        if (l == null) {
            return true;
        }
        this.N.getClass();
        return System.currentTimeMillis() - l.longValue() > JR;
    }

    public static final void HQ(yDo ydo, List list) {
        O6.BGx(ydo, new yDo$$ExternalSyntheticLambda3(ydo, list, 0));
    }

    public static final void HQ(yDo ydo) {
        ydo.S();
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    @Override // com.incognia.internal.BR
    public final void BGx(boolean z) {
        this.fZl = z;
    }

    public static final void BGx(yDo ydo, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (ydo.fZl) {
            try {
                ydo.x.HQ(ydo.e);
            } catch (Throwable th) {
                ydo.HQ.BGx(th, false);
            }
        }
        yZI yzi = ydo.A1;
        yzi.HQ.remove(ydo.iaH);
        ydo.q = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public static final void BGx(yDo ydo, boolean z) {
        O6.BGx(ydo, new yDo$$ExternalSyntheticLambda2(ydo, 0));
    }

    public static final void BGx(yDo ydo) {
        ydo.getClass();
        kV.BGx(ydo);
    }

    public final void BGx(yXu yxu) {
        if (O6.BGx(this, new yDo$$ExternalSyntheticLambda8(this, yxu, 0))) {
            return;
        }
        yxu.BGx(new isItemDismissable(new vqX(TfN)));
    }

    public static final void BGx(yDo ydo, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (ydo.q() != null && !ydo.BGx(ydo.q())) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(ydo.q()));
        } else if (!ydo.fZl()) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new FXp(TfN)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        } else {
            ydo.S = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new yDo$$ExternalSyntheticLambda8(this, vn8, 1));
    }

    public static final void BGx(yDo ydo, List list) {
        O6.BGx(ydo, new yDo$$ExternalSyntheticLambda3(ydo, list, 1));
    }

    @Override // com.incognia.internal.MtT
    public final void BGx(NvL nvL) {
        kV.mbG(this);
    }

    public static final void mbG(yDo ydo) {
        ydo.getClass();
        try {
            ydo.x.HQ(ydo.e);
        } catch (Throwable th) {
            ydo.HQ.BGx(th, false);
        }
    }

    public static final void mbG(yDo ydo, List list) {
        ArrayList arrayListQ = ydo.mbG(list) ? ydo.q() : null;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = ydo.S;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(arrayListQ));
        }
        ydo.S = null;
    }

    @Override // com.incognia.internal.BR
    public final boolean mbG() {
        return this.VV3.mbG(TfN) && this.A1.BGx();
    }

    public static final void N(yDo ydo) {
        yZI yzi = ydo.A1;
        yzi.HQ.add(ydo.iaH);
        if (ydo.fZl) {
            ydo.S();
        }
    }

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.q;
    }
}
