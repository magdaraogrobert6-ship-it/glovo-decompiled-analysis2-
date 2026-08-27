package com.incognia.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class aZK implements LmG {
    public final String BGx;
    public final List HQ;
    public final long N;
    public final cZ mbG;
    public final QE x;
    public static final String hIl = (String) W4i.Hy.MediaSessionCompatResultReceiverWrapper();
    public static final String hs = (String) W4i.ksw.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.aCm.MediaSessionCompatResultReceiverWrapper();
    public static final String A1 = (String) W4i.WFi.MediaSessionCompatResultReceiverWrapper();

    public final JSONObject BGx() {
        String str = A9G.BGx;
        cZ cZVar = this.mbG;
        JSONObject jSONObject = new JSONObject();
        Object obj = cZVar.BGx;
        if (obj != null) {
            jSONObject.put(A9G.BGx, obj);
        }
        Object obj2 = cZVar.mbG;
        if (obj2 != null) {
            jSONObject.put(A9G.mbG, obj2);
        }
        Integer num = cZVar.HQ;
        if (num != null) {
            jSONObject.put(A9G.HQ, num.intValue());
        }
        Object obj3 = cZVar.N;
        if (obj3 != null) {
            jSONObject.put(A9G.N, obj3);
        }
        Object obj4 = cZVar.x;
        if (obj4 != null) {
            jSONObject.put(A9G.x, obj4);
        }
        Object obj5 = cZVar.hIl;
        if (obj5 != null) {
            jSONObject.put(A9G.hIl, obj5);
        }
        jrj jrjVar = cZVar.hs;
        if (jrjVar != null) {
            String str2 = A9G.hs;
            String str3 = wkN.BGx;
            JSONObject jSONObject2 = new JSONObject();
            if (jrjVar.BGx != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = jrjVar.BGx.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put(wkN.BGx, jSONArray);
            }
            Boolean bool = jrjVar.mbG;
            if (bool != null) {
                jSONObject2.put(wkN.mbG, bool.booleanValue());
            }
            String str4 = jrjVar.HQ;
            if (str4 != null) {
                jSONObject2.put(wkN.HQ, str4);
            }
            String str5 = jrjVar.N;
            if (str5 != null) {
                jSONObject2.put(wkN.N, str5);
            }
            jSONObject.put(str2, jSONObject2);
        }
        Zs zs = cZVar.VV3;
        if (zs != null) {
            String str6 = A9G.VV3;
            String str7 = aEe.BGx;
            JSONObject jSONObject3 = new JSONObject();
            Long l = zs.BGx;
            if (l != null) {
                jSONObject3.put(aEe.BGx, l.longValue());
            }
            Long l2 = zs.mbG;
            if (l2 != null) {
                jSONObject3.put(aEe.mbG, l2.longValue());
            }
            Long l3 = zs.HQ;
            if (l3 != null) {
                jSONObject3.put(aEe.HQ, l3.longValue());
            }
            String str8 = zs.N;
            if (str8 != null) {
                jSONObject3.put(aEe.N, str8);
            }
            jSONObject3.put(aEe.x, zs.x);
            String str9 = zs.hIl;
            if (str9 != null) {
                jSONObject3.put(aEe.hIl, str9);
            }
            if (zs.hs != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = zs.hs.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put((String) it2.next());
                }
                jSONObject3.put(aEe.hs, jSONArray2);
            }
            jSONObject.put(str6, jSONObject3);
        }
        XD xd = cZVar.A1;
        if (xd != null) {
            String str10 = A9G.A1;
            String str11 = Xx.BGx;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(Xx.BGx, xd.BGx);
            jSONObject4.put(Xx.mbG, xd.mbG);
            jSONObject4.put(Xx.HQ, xd.HQ);
            jSONObject4.put(Xx.N, xd.N);
            jSONObject4.put(Xx.x, xd.x);
            jSONObject4.put(Xx.hIl, xd.hIl);
            jSONObject4.put(Xx.hs, xd.hs);
            jSONObject4.put(Xx.VV3, xd.VV3);
            String str12 = xd.A1;
            if (str12 != null) {
                jSONObject4.put(Xx.A1, str12);
            }
            Integer num2 = xd.q;
            if (num2 != null) {
                jSONObject4.put(Xx.q, num2.intValue());
            }
            jSONObject.put(str10, jSONObject4);
        }
        F87 f87 = cZVar.q;
        if (f87 != null) {
            String str13 = A9G.q;
            String str14 = w1J.BGx;
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(w1J.BGx, f87.BGx);
            jSONObject5.put(w1J.mbG, f87.mbG);
            jSONObject.put(str13, jSONObject5);
        }
        Object obj6 = cZVar.fZl;
        if (obj6 != null) {
            jSONObject.put(A9G.fZl, obj6);
        }
        Object obj7 = cZVar.S;
        if (obj7 != null) {
            jSONObject.put(A9G.S, obj7);
        }
        Lw lw = cZVar.iaH;
        if (lw != null) {
            String str15 = A9G.iaH;
            String str16 = p7.BGx;
            JSONObject jSONObject6 = new JSONObject();
            String str17 = lw.BGx;
            if (str17 != null) {
                jSONObject6.put(p7.BGx, str17);
            }
            String str18 = lw.mbG;
            if (str18 != null) {
                jSONObject6.put(p7.mbG, str18);
            }
            String str19 = lw.HQ;
            if (str19 != null) {
                jSONObject6.put(p7.HQ, str19);
            }
            String str20 = lw.N;
            if (str20 != null) {
                jSONObject6.put(p7.N, str20);
            }
            String str21 = lw.x;
            if (str21 != null) {
                jSONObject6.put(p7.x, str21);
            }
            String str22 = lw.hIl;
            if (str22 != null) {
                jSONObject6.put(p7.hIl, str22);
            }
            String str23 = lw.hs;
            if (str23 != null) {
                jSONObject6.put(p7.hs, str23);
            }
            String str24 = lw.VV3;
            if (str24 != null) {
                jSONObject6.put(p7.VV3, str24);
            }
            Integer num3 = lw.A1;
            if (num3 != null) {
                jSONObject6.put(p7.A1, num3.intValue());
            }
            String str25 = lw.q;
            if (str25 != null) {
                jSONObject6.put(p7.q, str25);
            }
            String str26 = lw.fZl;
            if (str26 != null) {
                jSONObject6.put(p7.fZl, str26);
            }
            String str27 = lw.S;
            if (str27 != null) {
                jSONObject6.put(p7.S, str27);
            }
            String str28 = lw.iaH;
            if (str28 != null) {
                jSONObject6.put(p7.iaH, str28);
            }
            String str29 = lw.e;
            if (str29 != null) {
                jSONObject6.put(p7.e, str29);
            }
            JSONArray jSONArray3 = new JSONArray();
            Iterator it3 = lw.VLD.iterator();
            while (it3.hasNext()) {
                jSONArray3.put((String) it3.next());
            }
            jSONObject6.put(p7.VLD, jSONArray3);
            if (lw.TfN != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator it4 = lw.TfN.iterator();
                while (it4.hasNext()) {
                    jSONArray4.put((String) it4.next());
                }
                jSONObject6.put(p7.TfN, jSONArray4);
            }
            if (lw.OV7 != null) {
                JSONArray jSONArray5 = new JSONArray();
                Iterator it5 = lw.OV7.iterator();
                while (it5.hasNext()) {
                    jSONArray5.put((String) it5.next());
                }
                jSONObject6.put(p7.OV7, jSONArray5);
            }
            String str30 = lw.JR;
            if (str30 != null) {
                jSONObject6.put(p7.JR, str30);
            }
            jSONObject6.put(p7.j, lw.j);
            String str31 = lw.n;
            if (str31 != null) {
                jSONObject6.put(p7.n, str31);
            }
            String str32 = lw.vM;
            if (str32 != null) {
                jSONObject6.put(p7.vM, str32);
            }
            jSONObject.put(str15, jSONObject6);
        }
        Fk5 fk5 = cZVar.e;
        if (fk5 != null) {
            String str33 = A9G.e;
            String str34 = wvE.BGx;
            JSONObject jSONObject7 = new JSONObject();
            String str35 = fk5.BGx;
            if (str35 != null) {
                jSONObject7.put(wvE.BGx, str35);
            }
            String str36 = fk5.mbG;
            if (str36 != null) {
                jSONObject7.put(wvE.mbG, str36);
            }
            String str37 = fk5.HQ;
            if (str37 != null) {
                jSONObject7.put(wvE.HQ, str37);
            }
            String str38 = fk5.N;
            if (str38 != null) {
                jSONObject7.put(wvE.N, str38);
            }
            String str39 = fk5.x;
            if (str39 != null) {
                jSONObject7.put(wvE.x, str39);
            }
            String str40 = fk5.hIl;
            if (str40 != null) {
                jSONObject7.put(wvE.hIl, str40);
            }
            String str41 = fk5.hs;
            if (str41 != null) {
                jSONObject7.put(wvE.hs, str41);
            }
            String str42 = fk5.VV3;
            if (str42 != null) {
                jSONObject7.put(wvE.VV3, str42);
            }
            String str43 = fk5.A1;
            if (str43 != null) {
                jSONObject7.put(wvE.A1, str43);
            }
            String str44 = fk5.q;
            if (str44 != null) {
                jSONObject7.put(wvE.q, str44);
            }
            String str45 = fk5.fZl;
            if (str45 != null) {
                jSONObject7.put(wvE.fZl, str45);
            }
            jSONObject.put(str33, jSONObject7);
        }
        Object obj8 = cZVar.VLD;
        if (obj8 != null) {
            jSONObject.put(A9G.VLD, obj8);
        }
        Object obj9 = cZVar.TfN;
        if (obj9 != null) {
            jSONObject.put(A9G.TfN, obj9);
        }
        Lzq lzq = cZVar.OV7;
        if (lzq != null) {
            String str46 = A9G.OV7;
            String str47 = fF0.BGx;
            JSONObject jSONObject8 = new JSONObject();
            zY5 zy5 = lzq.BGx;
            if (zy5 != null) {
                jSONObject8.put(fF0.BGx, osA.BGx(zy5));
            }
            U9 u9 = lzq.mbG;
            if (u9 != null) {
                jSONObject8.put(fF0.mbG, i.BGx(u9));
            }
            jSONObject.put(str46, jSONObject8);
        }
        BRm bRm = cZVar.JR;
        if (bRm != null) {
            String str48 = A9G.JR;
            String str49 = ISl.BGx;
            JSONObject jSONObject9 = new JSONObject();
            zY5 zy6 = bRm.BGx;
            if (zy6 != null) {
                jSONObject9.put(ISl.BGx, osA.BGx(zy6));
            }
            LAd lAd = bRm.mbG;
            if (lAd != null) {
                String str50 = ISl.mbG;
                String str51 = izO.BGx;
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put(izO.BGx, lAd.BGx);
                jSONObject10.put(izO.mbG, lAd.mbG);
                Long l4 = lAd.HQ;
                if (l4 != null) {
                    jSONObject10.put(izO.HQ, l4.longValue());
                }
                jSONObject9.put(str50, jSONObject10);
            }
            jSONObject.put(str48, jSONObject9);
        }
        VXy vXy = cZVar.j;
        if (vXy != null) {
            jSONObject.put(A9G.j, hpb.BGx(vXy));
        }
        wVC wvc = cZVar.n;
        if (wvc != null) {
            jSONObject.put(A9G.n, s3q.BGx(wvc));
        }
        bh bhVar = cZVar.vM;
        if (bhVar != null) {
            jSONObject.put(A9G.vM, az9.BGx(bhVar));
        }
        h4O h4o = cZVar.l5;
        if (h4o != null) {
            jSONObject.put(A9G.l5, kdF.BGx(h4o));
        }
        JnG jnG = cZVar.ss;
        if (jnG != null) {
            jSONObject.put(A9G.ss, dCd.BGx(jnG));
        }
        I4 i4 = cZVar.B;
        if (i4 != null) {
            jSONObject.put(A9G.B, uug.BGx(i4));
        }
        oV6 ov6 = cZVar.YO;
        if (ov6 != null) {
            jSONObject.put(A9G.YO, kI.BGx(ov6));
        }
        HS5 hs5 = cZVar.N6D;
        if (hs5 != null) {
            jSONObject.put(A9G.N6D, ezC.BGx(hs5));
        }
        zdS zds = cZVar.v;
        if (zds != null) {
            jSONObject.put(A9G.v, E1i.BGx(zds));
        }
        QUy qUy = cZVar.Y;
        if (qUy != null) {
            jSONObject.put(A9G.Y, FgX.BGx(qUy));
        }
        hvS hvs = cZVar.Ft;
        if (hvs != null) {
            jSONObject.put(A9G.Ft, rlX.BGx(hvs));
        }
        dvP dvp = cZVar.RIs;
        if (dvp != null) {
            jSONObject.put(A9G.RIs, k06.BGx(dvp));
        }
        fIG fig = cZVar.X4;
        if (fig != null) {
            jSONObject.put(A9G.X4, Ip9.BGx(fig));
        }
        Lie lie = cZVar.kCN;
        if (lie != null) {
            jSONObject.put(A9G.kCN, u7.BGx(lie));
        }
        int i = 0;
        if (cZVar.Yo != null) {
            JSONArray jSONArray6 = new JSONArray();
            ArrayList arrayList = cZVar.Yo;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj10 = arrayList.get(i2);
                i2++;
                jSONArray6.put(UI.BGx((eVn) obj10));
            }
            jSONObject.put(A9G.Yo, jSONArray6);
        }
        nHt nht = cZVar.aly;
        if (nht != null) {
            jSONObject.put(A9G.aly, xM.BGx(nht));
        }
        Long l5 = cZVar.mQ;
        if (l5 != null) {
            jSONObject.put(A9G.mQ, l5.longValue());
        }
        Long l6 = cZVar.h;
        if (l6 != null) {
            jSONObject.put(A9G.h, l6.longValue());
        }
        BO8 bo8 = cZVar.Pm;
        if (bo8 != null) {
            jSONObject.put(A9G.Pm, Fh.BGx(bo8));
        }
        Eq eq = cZVar.PD;
        if (eq != null) {
            jSONObject.put(A9G.PD, daF.BGx(eq));
        }
        Du du = cZVar.OhM;
        if (du != null) {
            jSONObject.put(A9G.OhM, XC.BGx(du));
        }
        if (cZVar.Io != null) {
            JSONArray jSONArray7 = new JSONArray();
            ArrayList arrayList2 = cZVar.Io;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj11 = arrayList2.get(i3);
                i3++;
                jSONArray7.put(MpJ.BGx((phu) obj11));
            }
            jSONObject.put(A9G.Io, jSONArray7);
        }
        vgd vgdVar = cZVar.D;
        if (vgdVar != null) {
            jSONObject.put(A9G.D, AX.BGx(vgdVar));
        }
        J19 j19 = cZVar.YG3;
        if (j19 != null) {
            jSONObject.put(A9G.YG3, n8G.BGx(j19));
        }
        G2U g2u = cZVar.ISd;
        if (g2u != null) {
            jSONObject.put(A9G.ISd, si.BGx(g2u));
        }
        JD jd = cZVar.NKG;
        if (jd != null) {
            String str52 = A9G.NKG;
            String str53 = j.BGx;
            JSONObject jSONObject11 = new JSONObject();
            Long l7 = jd.BGx;
            if (l7 != null) {
                jSONObject11.put(j.BGx, l7.longValue());
            }
            Long l8 = jd.mbG;
            if (l8 != null) {
                jSONObject11.put(j.mbG, l8.longValue());
            }
            jSONObject.put(str52, jSONObject11);
        }
        pu puVar = cZVar.JA;
        if (puVar != null) {
            jSONObject.put(A9G.JA, x0U.BGx(puVar));
        }
        Rn rn = cZVar.Ui;
        if (rn != null) {
            jSONObject.put(A9G.Ui, Rsi.BGx(rn));
        }
        FSN fsn = cZVar.p;
        if (fsn != null) {
            jSONObject.put(A9G.p, t4M.BGx(fsn));
        }
        Object obj12 = cZVar.ILy;
        if (obj12 != null) {
            jSONObject.put(A9G.ILy, obj12);
        }
        Object obj13 = cZVar.sg;
        if (obj13 != null) {
            jSONObject.put(A9G.sg, obj13);
        }
        MQs mQs = cZVar.U;
        if (mQs != null) {
            jSONObject.put(A9G.U, Ju.BGx(mQs));
        }
        tQZ tqz = cZVar.tFd;
        if (tqz != null) {
            jSONObject.put(A9G.tFd, InG.BGx(tqz));
        }
        aUL aul = cZVar.OQ;
        if (aul != null) {
            jSONObject.put(A9G.OQ, EW7.BGx(aul));
        }
        if (cZVar.h0W != null) {
            JSONArray jSONArray8 = new JSONArray();
            ArrayList arrayList3 = cZVar.h0W;
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj14 = arrayList3.get(i5);
                i5++;
                jSONArray8.put(YLZ.BGx((z96) obj14));
            }
            jSONObject.put(A9G.h0W, jSONArray8);
        }
        Object obj15 = cZVar.CTv;
        if (obj15 != null) {
            jSONObject.put(A9G.CTv, obj15);
        }
        Object obj16 = cZVar.D9p;
        if (obj16 != null) {
            jSONObject.put(A9G.D9p, obj16);
        }
        yVB yvb = cZVar.L;
        if (yvb != null) {
            jSONObject.put(A9G.L, INB.BGx(yvb));
        }
        UZn uZn = cZVar.Ap;
        if (uZn != null) {
            jSONObject.put(A9G.Ap, ypn.BGx(uZn));
        }
        Object obj17 = cZVar.Iye;
        if (obj17 != null) {
            jSONObject.put(A9G.Iye, obj17);
        }
        Boolean bool2 = cZVar.gdW;
        if (bool2 != null) {
            jSONObject.put(A9G.gdW, bool2.booleanValue());
        }
        FL fl = cZVar.bt;
        if (fl != null) {
            jSONObject.put(A9G.bt, Opl.BGx(fl));
        }
        p2k p2kVar = cZVar.oH;
        if (p2kVar != null) {
            jSONObject.put(A9G.oH, n4L.BGx(p2kVar));
        }
        SsA ssA = cZVar.Nd;
        if (ssA != null) {
            jSONObject.put(A9G.Nd, CD.BGx(ssA));
        }
        fBS fbs = cZVar.g;
        if (fbs != null) {
            jSONObject.put(A9G.g, G6A.BGx(fbs));
        }
        Boolean bool3 = cZVar.F8P;
        if (bool3 != null) {
            jSONObject.put(A9G.F8P, bool3.booleanValue());
        }
        MRf mRf = cZVar.Xu;
        if (mRf != null) {
            jSONObject.put(A9G.Xu, kyk.BGx(mRf));
        }
        dWj dwj = cZVar.X;
        if (dwj != null) {
            jSONObject.put(A9G.X, LEL.BGx(dwj));
        }
        if (cZVar.pA0 != null) {
            JSONArray jSONArray9 = new JSONArray();
            Iterator it6 = cZVar.pA0.iterator();
            while (it6.hasNext()) {
                jSONArray9.put(f4Y.BGx((LCt) it6.next()));
            }
            jSONObject.put(A9G.pA0, jSONArray9);
        }
        zR zRVar = cZVar.Zj;
        if (zRVar != null) {
            jSONObject.put(A9G.Zj, LwJ.BGx(zRVar));
        }
        VOk vOk = cZVar.lb;
        if (vOk != null) {
            jSONObject.put(A9G.lb, b3B.BGx(vOk));
        }
        Boolean bool4 = cZVar.FM;
        if (bool4 != null) {
            jSONObject.put(A9G.FM, bool4.booleanValue());
        }
        Object obj18 = cZVar.BmG;
        if (obj18 != null) {
            jSONObject.put(A9G.BmG, obj18);
        }
        Object obj19 = cZVar.zbX;
        if (obj19 != null) {
            jSONObject.put(A9G.zbX, obj19);
        }
        Boolean bool5 = cZVar.dGU;
        if (bool5 != null) {
            jSONObject.put(A9G.dGU, bool5.booleanValue());
        }
        Object obj20 = cZVar.Uvi;
        if (obj20 != null) {
            jSONObject.put(A9G.Uvi, obj20);
        }
        Boolean bool6 = cZVar.Fi;
        if (bool6 != null) {
            jSONObject.put(A9G.Fi, bool6.booleanValue());
        }
        Object obj21 = cZVar.HTV;
        if (obj21 != null) {
            jSONObject.put(A9G.HTV, obj21);
        }
        Object obj22 = cZVar.DS;
        if (obj22 != null) {
            jSONObject.put(A9G.DS, obj22);
        }
        Object obj23 = cZVar.A3;
        if (obj23 != null) {
            jSONObject.put(A9G.A3, obj23);
        }
        if (cZVar.w != null) {
            JSONArray jSONArray10 = new JSONArray();
            ArrayList arrayList4 = cZVar.w;
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj24 = arrayList4.get(i6);
                i6++;
                jSONArray10.put((String) obj24);
            }
            jSONObject.put(A9G.w, jSONArray10);
        }
        if (cZVar.Oo != null) {
            JSONArray jSONArray11 = new JSONArray();
            ArrayList arrayList5 = cZVar.Oo;
            int size5 = arrayList5.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj25 = arrayList5.get(i7);
                i7++;
                jSONArray11.put((String) obj25);
            }
            jSONObject.put(A9G.Oo, jSONArray11);
        }
        if (cZVar.u != null) {
            JSONArray jSONArray12 = new JSONArray();
            ArrayList arrayList6 = cZVar.u;
            int size6 = arrayList6.size();
            int i8 = 0;
            while (i8 < size6) {
                Object obj26 = arrayList6.get(i8);
                i8++;
                jSONArray12.put((String) obj26);
            }
            jSONObject.put(A9G.u, jSONArray12);
        }
        if (cZVar.G5 != null) {
            JSONArray jSONArray13 = new JSONArray();
            ArrayList arrayList7 = cZVar.G5;
            int size7 = arrayList7.size();
            int i9 = 0;
            while (i9 < size7) {
                Object obj27 = arrayList7.get(i9);
                i9++;
                jSONArray13.put((String) obj27);
            }
            jSONObject.put(A9G.G5, jSONArray13);
        }
        Object obj28 = cZVar.M;
        if (obj28 != null) {
            jSONObject.put(A9G.M, obj28);
        }
        Integer num4 = cZVar.C;
        if (num4 != null) {
            jSONObject.put(A9G.C, num4.intValue());
        }
        Object obj29 = cZVar.H;
        if (obj29 != null) {
            jSONObject.put(A9G.H, obj29);
        }
        lI5 li5 = cZVar.PKr;
        if (li5 != null) {
            jSONObject.put(A9G.PKr, WM.BGx(li5));
        }
        if (cZVar.Op != null) {
            JSONArray jSONArray14 = new JSONArray();
            Iterator it7 = cZVar.Op.iterator();
            while (it7.hasNext()) {
                jSONArray14.put(FiB.BGx((QMF) it7.next()));
            }
            jSONObject.put(A9G.Op, jSONArray14);
        }
        nz0 nz0Var = cZVar.cT;
        if (nz0Var != null) {
            String str54 = A9G.cT;
            String str55 = eF4.BGx;
            JSONObject jSONObject12 = new JSONObject();
            JSONObject jSONObject13 = new JSONObject();
            for (Map.Entry entry : nz0Var.BGx.entrySet()) {
                jSONObject13.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
            }
            jSONObject12.put(eF4.BGx, jSONObject13);
            jSONObject.put(str54, jSONObject12);
        }
        if (cZVar.Z7 != null) {
            JSONArray jSONArray15 = new JSONArray();
            Iterator it8 = cZVar.Z7.iterator();
            while (it8.hasNext()) {
                jSONArray15.put((String) it8.next());
            }
            jSONObject.put(A9G.Z7, jSONArray15);
        }
        Qa qa = cZVar.Qv;
        if (qa != null) {
            jSONObject.put(A9G.Qv, Db.BGx(qa));
        }
        xus xusVar = cZVar.kv;
        if (xusVar != null) {
            jSONObject.put(A9G.kv, AR8.BGx(xusVar));
        }
        Integer num5 = cZVar.mO;
        if (num5 != null) {
            jSONObject.put(A9G.mO, num5.intValue());
        }
        if (cZVar.PZt != null) {
            JSONArray jSONArray16 = new JSONArray();
            for (Lu lu : cZVar.PZt) {
                String str56 = PCw.BGx;
                JSONObject jSONObject14 = new JSONObject();
                jSONObject14.put(PCw.BGx, lu.BGx);
                jSONObject14.put(PCw.mbG, lu.mbG);
                String str57 = lu.HQ;
                if (str57 != null) {
                    jSONObject14.put(PCw.HQ, str57);
                }
                jSONArray16.put(jSONObject14);
            }
            jSONObject.put(A9G.PZt, jSONArray16);
        }
        if (cZVar.KeX != null) {
            JSONObject jSONObject15 = new JSONObject();
            for (Map.Entry entry2 : cZVar.KeX.entrySet()) {
                jSONObject15.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject.put(A9G.KeX, jSONObject15);
        }
        if (cZVar.T7p != null) {
            JSONArray jSONArray17 = new JSONArray();
            Iterator it9 = cZVar.T7p.iterator();
            while (it9.hasNext()) {
                jSONArray17.put((String) it9.next());
            }
            jSONObject.put(A9G.T7p, jSONArray17);
        }
        gJ0 gj0 = cZVar.wUg;
        if (gj0 != null) {
            jSONObject.put(A9G.wUg, ul.BGx(gj0));
        }
        Boolean bool7 = cZVar.ISI;
        if (bool7 != null) {
            jSONObject.put(A9G.ISI, bool7.booleanValue());
        }
        Object obj30 = cZVar.EpB;
        if (obj30 != null) {
            jSONObject.put(A9G.EpB, obj30);
        }
        Integer num6 = cZVar.d;
        if (num6 != null) {
            jSONObject.put(A9G.d, num6.intValue());
        }
        Object obj31 = cZVar.BWg;
        if (obj31 != null) {
            jSONObject.put(A9G.BWg, obj31);
        }
        Object obj32 = cZVar.YD;
        if (obj32 != null) {
            jSONObject.put(A9G.YD, obj32);
        }
        Object obj33 = cZVar.zS;
        if (obj33 != null) {
            jSONObject.put(A9G.zS, obj33);
        }
        Boolean bool8 = cZVar.pP;
        if (bool8 != null) {
            jSONObject.put(A9G.pP, bool8.booleanValue());
        }
        if (cZVar.y != null) {
            JSONArray jSONArray18 = new JSONArray();
            Iterator it10 = cZVar.y.iterator();
            while (it10.hasNext()) {
                jSONArray18.put(yR.BGx((qc2) it10.next()));
            }
            jSONObject.put(A9G.y, jSONArray18);
        }
        if (cZVar.sh != null) {
            JSONArray jSONArray19 = new JSONArray();
            Iterator it11 = cZVar.sh.iterator();
            while (it11.hasNext()) {
                jSONArray19.put(y3.BGx((ng0) it11.next()));
            }
            jSONObject.put(A9G.sh, jSONArray19);
        }
        Object obj34 = cZVar.QX;
        if (obj34 != null) {
            jSONObject.put(A9G.QX, obj34);
        }
        if (cZVar.ck != null) {
            JSONArray jSONArray20 = new JSONArray();
            Iterator it12 = cZVar.ck.iterator();
            while (it12.hasNext()) {
                jSONArray20.put(ntQ.BGx((Cmt) it12.next()));
            }
            jSONObject.put(A9G.ck, jSONArray20);
        }
        Object obj35 = cZVar.Ys;
        if (obj35 != null) {
            jSONObject.put(A9G.Ys, obj35);
        }
        if (cZVar.CyN != null) {
            JSONArray jSONArray21 = new JSONArray();
            ArrayList arrayList8 = cZVar.CyN;
            int size8 = arrayList8.size();
            while (i < size8) {
                Object obj36 = arrayList8.get(i);
                i++;
                N1 n1 = (N1) obj36;
                String str58 = ca5.BGx;
                JSONObject jSONObject16 = new JSONObject();
                jSONObject16.put(ca5.BGx, n1.BGx);
                jSONObject16.put(ca5.mbG, n1.mbG);
                jSONArray21.put(jSONObject16);
            }
            jSONObject.put(A9G.CyN, jSONArray21);
        }
        Long l9 = cZVar.lB;
        if (l9 != null) {
            jSONObject.put(A9G.lB, l9.longValue());
        }
        Object obj37 = cZVar.a;
        if (obj37 != null) {
            jSONObject.put(A9G.a, obj37);
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        jSONObject.put(hIl, this.BGx);
        String str59 = hs;
        List list = this.HQ;
        k8t k8tVar = k8t.BGx;
        JSONArray jSONArray22 = new JSONArray();
        Iterator it13 = list.iterator();
        while (it13.hasNext()) {
            jSONArray22.put(k8tVar.invoke(it13.next()));
        }
        jSONObject.put(str59, jSONArray22);
        jSONObject.put(VV3, this.N);
        String str60 = A1;
        String str61 = hmS.BGx;
        jSONObject.put(str60, hmS.BGx(this.x));
        return jSONObject;
    }

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        return this.x.hashCode() + NS.BGx(this.N, c8$$ExternalSyntheticOutline0.m(this.HQ, (this.mbG.hashCode() + (iHashCode * 31)) * 31, 31), 31);
    }

    public aZK(String str, cZ cZVar, List list, long j, QE qe) {
        this.BGx = str;
        this.mbG = cZVar;
        this.HQ = list;
        this.N = j;
        this.x = qe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aZK)) {
            return false;
        }
        aZK azk = (aZK) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, azk.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, azk.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, azk.HQ}, getCieXyz.write())).booleanValue() || this.N != azk.N) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, azk.x}, getCieXyz.write())).booleanValue();
    }
}
