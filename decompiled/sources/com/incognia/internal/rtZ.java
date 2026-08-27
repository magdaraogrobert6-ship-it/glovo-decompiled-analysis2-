package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class rtZ extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final rtZ BGx = new rtZ();

    public rtZ() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        Wea wea = (Wea) obj;
        String str = Gff.BGx;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = wea.BGx;
        if (obj2 != null) {
            jSONObject.put(Gff.BGx, obj2);
        }
        Object obj3 = wea.mbG;
        if (obj3 != null) {
            jSONObject.put(Gff.mbG, obj3);
        }
        Object obj4 = wea.HQ;
        if (obj4 != null) {
            jSONObject.put(Gff.HQ, obj4);
        }
        Object obj5 = wea.N;
        if (obj5 != null) {
            jSONObject.put(Gff.N, obj5);
        }
        Object obj6 = wea.x;
        if (obj6 != null) {
            jSONObject.put(Gff.x, obj6);
        }
        Long l = wea.hIl;
        if (l != null) {
            jSONObject.put(Gff.hIl, l.longValue());
        }
        Object obj7 = wea.hs;
        if (obj7 != null) {
            jSONObject.put(Gff.hs, obj7);
        }
        Boolean bool = wea.VV3;
        if (bool != null) {
            jSONObject.put(Gff.VV3, bool.booleanValue());
        }
        Integer num = wea.A1;
        if (num != null) {
            jSONObject.put(Gff.A1, num.intValue());
        }
        Integer num2 = wea.q;
        if (num2 != null) {
            jSONObject.put(Gff.q, num2.intValue());
        }
        Double d = wea.fZl;
        if (d != null) {
            jSONObject.put(Gff.fZl, d.doubleValue());
        }
        Integer num3 = wea.S;
        if (num3 != null) {
            jSONObject.put(Gff.S, num3.intValue());
        }
        Object obj8 = wea.iaH;
        if (obj8 != null) {
            jSONObject.put(Gff.iaH, obj8);
        }
        Object obj9 = wea.e;
        if (obj9 != null) {
            jSONObject.put(Gff.e, obj9);
        }
        Object obj10 = wea.VLD;
        if (obj10 != null) {
            jSONObject.put(Gff.VLD, obj10);
        }
        Object obj11 = wea.TfN;
        if (obj11 != null) {
            jSONObject.put(Gff.TfN, obj11);
        }
        Object obj12 = wea.OV7;
        if (obj12 != null) {
            jSONObject.put(Gff.OV7, obj12);
        }
        if (wea.JR != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = wea.JR;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj13 = arrayList.get(i);
                i++;
                N1 n1 = (N1) obj13;
                String str2 = ca5.BGx;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ca5.BGx, n1.BGx);
                jSONObject2.put(ca5.mbG, n1.mbG);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(Gff.JR, jSONArray);
        }
        Object obj14 = wea.j;
        if (obj14 != null) {
            jSONObject.put(Gff.j, obj14);
        }
        Long l2 = wea.n;
        if (l2 != null) {
            jSONObject.put(Gff.n, l2.longValue());
        }
        Long l3 = wea.vM;
        if (l3 != null) {
            jSONObject.put(Gff.vM, l3.longValue());
        }
        Boolean bool2 = wea.l5;
        if (bool2 != null) {
            jSONObject.put(Gff.l5, bool2.booleanValue());
        }
        Boolean bool3 = wea.ss;
        if (bool3 != null) {
            jSONObject.put(Gff.ss, bool3.booleanValue());
        }
        Object obj15 = wea.B;
        if (obj15 != null) {
            jSONObject.put(Gff.B, obj15);
        }
        Object obj16 = wea.YO;
        if (obj16 != null) {
            jSONObject.put(Gff.YO, obj16);
        }
        if (wea.N6D != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = wea.N6D.iterator();
            while (it.hasNext()) {
                jSONArray2.put((String) it.next());
            }
            jSONObject.put(Gff.N6D, jSONArray2);
        }
        if (wea.v != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator it2 = wea.v.iterator();
            while (it2.hasNext()) {
                jSONArray3.put((String) it2.next());
            }
            jSONObject.put(Gff.v, jSONArray3);
        }
        Long l4 = wea.Y;
        if (l4 != null) {
            jSONObject.put(Gff.Y, l4.longValue());
        }
        Object obj17 = wea.Ft;
        if (obj17 != null) {
            jSONObject.put(Gff.Ft, obj17);
        }
        Double d2 = wea.RIs;
        if (d2 != null) {
            jSONObject.put(Gff.RIs, d2.doubleValue());
        }
        Double d3 = wea.X4;
        if (d3 != null) {
            jSONObject.put(Gff.X4, d3.doubleValue());
        }
        Boolean bool4 = wea.kCN;
        if (bool4 != null) {
            jSONObject.put(Gff.kCN, bool4.booleanValue());
        }
        Boolean bool5 = wea.Yo;
        if (bool5 != null) {
            jSONObject.put(Gff.Yo, bool5.booleanValue());
        }
        Object obj18 = wea.aly;
        if (obj18 != null) {
            jSONObject.put(Gff.aly, obj18);
        }
        Long l5 = wea.mQ;
        if (l5 != null) {
            jSONObject.put(Gff.mQ, l5.longValue());
        }
        Object obj19 = wea.h;
        if (obj19 != null) {
            jSONObject.put(Gff.h, obj19);
        }
        Boolean bool6 = wea.Pm;
        if (bool6 != null) {
            jSONObject.put(Gff.Pm, bool6.booleanValue());
        }
        Object obj20 = wea.PD;
        if (obj20 != null) {
            jSONObject.put(Gff.PD, obj20);
        }
        Object obj21 = wea.OhM;
        if (obj21 != null) {
            jSONObject.put(Gff.OhM, obj21);
        }
        Integer num4 = wea.Io;
        if (num4 != null) {
            jSONObject.put(Gff.Io, num4.intValue());
        }
        Long l6 = wea.D;
        if (l6 != null) {
            jSONObject.put(Gff.D, l6.longValue());
        }
        Long l7 = wea.YG3;
        if (l7 != null) {
            jSONObject.put(Gff.YG3, l7.longValue());
        }
        Object obj22 = wea.ISd;
        if (obj22 != null) {
            jSONObject.put(Gff.ISd, obj22);
        }
        Object obj23 = wea.NKG;
        if (obj23 != null) {
            jSONObject.put(Gff.NKG, obj23);
        }
        Integer num5 = wea.JA;
        if (num5 != null) {
            jSONObject.put(Gff.JA, num5.intValue());
        }
        Object obj24 = wea.Ui;
        if (obj24 != null) {
            jSONObject.put(Gff.Ui, obj24);
        }
        Object obj25 = wea.p;
        if (obj25 != null) {
            jSONObject.put(Gff.p, obj25);
        }
        Long l8 = wea.ILy;
        if (l8 != null) {
            jSONObject.put(Gff.ILy, l8.longValue());
        }
        Object obj26 = wea.sg;
        if (obj26 != null) {
            jSONObject.put(Gff.sg, obj26);
        }
        Object obj27 = wea.U;
        if (obj27 != null) {
            jSONObject.put(Gff.U, obj27);
        }
        if (wea.tFd != null) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator it3 = wea.tFd.iterator();
            while (it3.hasNext()) {
                jSONArray4.put((String) it3.next());
            }
            jSONObject.put(Gff.tFd, jSONArray4);
        }
        Object obj28 = wea.OQ;
        if (obj28 != null) {
            jSONObject.put(Gff.OQ, obj28);
        }
        if (wea.h0W != null) {
            JSONArray jSONArray5 = new JSONArray();
            Iterator it4 = wea.h0W.iterator();
            while (it4.hasNext()) {
                jSONArray5.put((String) it4.next());
            }
            jSONObject.put(Gff.h0W, jSONArray5);
        }
        if (wea.CTv != null) {
            JSONArray jSONArray6 = new JSONArray();
            Iterator it5 = wea.CTv.iterator();
            while (it5.hasNext()) {
                jSONArray6.put((String) it5.next());
            }
            jSONObject.put(Gff.CTv, jSONArray6);
        }
        if (wea.D9p != null) {
            JSONArray jSONArray7 = new JSONArray();
            Iterator it6 = wea.D9p.iterator();
            while (it6.hasNext()) {
                jSONArray7.put((String) it6.next());
            }
            jSONObject.put(Gff.D9p, jSONArray7);
        }
        Integer num6 = wea.L;
        if (num6 != null) {
            jSONObject.put(Gff.L, num6.intValue());
        }
        Long l9 = wea.Ap;
        if (l9 != null) {
            jSONObject.put(Gff.Ap, l9.longValue());
        }
        Boolean bool7 = wea.Iye;
        if (bool7 != null) {
            jSONObject.put(Gff.Iye, bool7.booleanValue());
        }
        if (wea.gdW != null) {
            JSONArray jSONArray8 = new JSONArray();
            Iterator it7 = wea.gdW.iterator();
            while (it7.hasNext()) {
                jSONArray8.put((String) it7.next());
            }
            jSONObject.put(Gff.gdW, jSONArray8);
        }
        if (wea.bt != null) {
            JSONArray jSONArray9 = new JSONArray();
            Iterator it8 = wea.bt.iterator();
            while (it8.hasNext()) {
                jSONArray9.put((String) it8.next());
            }
            jSONObject.put(Gff.bt, jSONArray9);
        }
        if (wea.oH != null) {
            JSONArray jSONArray10 = new JSONArray();
            Iterator it9 = wea.oH.iterator();
            while (it9.hasNext()) {
                jSONArray10.put((String) it9.next());
            }
            jSONObject.put(Gff.oH, jSONArray10);
        }
        if (wea.Nd != null) {
            JSONArray jSONArray11 = new JSONArray();
            Iterator it10 = wea.Nd.iterator();
            while (it10.hasNext()) {
                jSONArray11.put((String) it10.next());
            }
            jSONObject.put(Gff.Nd, jSONArray11);
        }
        if (wea.g != null) {
            JSONArray jSONArray12 = new JSONArray();
            Iterator it11 = wea.g.iterator();
            while (it11.hasNext()) {
                jSONArray12.put((String) it11.next());
            }
            jSONObject.put(Gff.g, jSONArray12);
        }
        if (wea.F8P != null) {
            JSONArray jSONArray13 = new JSONArray();
            Iterator it12 = wea.F8P.iterator();
            while (it12.hasNext()) {
                jSONArray13.put((String) it12.next());
            }
            jSONObject.put(Gff.F8P, jSONArray13);
        }
        if (wea.Xu != null) {
            JSONArray jSONArray14 = new JSONArray();
            Iterator it13 = wea.Xu.iterator();
            while (it13.hasNext()) {
                jSONArray14.put((String) it13.next());
            }
            jSONObject.put(Gff.Xu, jSONArray14);
        }
        Object obj29 = wea.X;
        if (obj29 != null) {
            jSONObject.put(Gff.X, obj29);
        }
        Long l10 = wea.pA0;
        if (l10 != null) {
            jSONObject.put(Gff.pA0, l10.longValue());
        }
        Long l11 = wea.Zj;
        if (l11 != null) {
            jSONObject.put(Gff.Zj, l11.longValue());
        }
        Boolean bool8 = wea.lb;
        if (bool8 != null) {
            jSONObject.put(Gff.lb, bool8.booleanValue());
        }
        return jSONObject;
    }
}
