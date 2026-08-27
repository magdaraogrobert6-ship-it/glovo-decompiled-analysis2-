package com.incognia.internal;

import androidx.compose.ui.graphics.Fields;
import java.util.List;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q5P {
    public final OI BGx;
    public final rtZ HQ;
    public final VOk mbG;

    public q5P(OI oi, VOk vOk, rtZ rtz) {
        this.BGx = oi;
        this.mbG = vOk;
        this.HQ = rtz;
    }

    public final cKI BGx(Wea wea) {
        double d;
        double d2;
        int i = this.mbG.hIl;
        JSONObject jSONObject = (JSONObject) this.HQ.invoke(wea);
        int length = jSONObject.toString().length();
        double d3 = length;
        if (length <= 300) {
            d = 3.0d;
        } else if (length <= 600) {
            d = 2.0d;
        } else if (length <= 1300) {
            d = 1.4d;
        } else {
            d = length <= 2000 ? 1.15d : 1.0d;
        }
        if (((int) (d3 * d)) <= i) {
            return new cKI(jSONObject, bOD.mbG, length, null);
        }
        OI oi = this.BGx;
        String strBGx = oi.BGx(wea.BGx);
        String strMbG = OI.mbG(wea.mbG);
        String strBGx2 = oi.BGx(wea.HQ);
        String strMbG2 = OI.mbG(wea.N);
        String strBGx3 = oi.BGx(wea.x);
        Long l = wea.hIl;
        String strBGx4 = oi.BGx(wea.hs);
        Boolean bool = wea.VV3;
        Integer num = wea.A1;
        Integer num2 = wea.q;
        Double d4 = wea.fZl;
        Integer num3 = wea.S;
        String strBGx5 = oi.BGx(wea.iaH);
        String strBGx6 = oi.BGx(wea.e);
        String strBGx7 = oi.BGx(wea.VLD);
        String strBGx8 = oi.BGx(wea.TfN);
        String strBGx9 = oi.BGx(wea.OV7);
        String strMbG3 = OI.mbG(wea.j);
        Long l2 = wea.n;
        Long l3 = wea.vM;
        Boolean bool2 = wea.l5;
        Boolean bool3 = wea.ss;
        String strBGx10 = oi.BGx(wea.B);
        String strBGx11 = oi.BGx(wea.YO);
        List listBGx = oi.BGx(wea.N6D, a0K.A1);
        List listBGx2 = oi.BGx(wea.v, wg.TfN);
        Long l4 = wea.Y;
        Float f = wea.Ft;
        Double d5 = wea.RIs;
        Double d6 = wea.X4;
        Boolean bool4 = wea.kCN;
        Boolean bool5 = wea.Yo;
        String strBGx12 = oi.BGx(wea.aly);
        Long l5 = wea.mQ;
        String strBGx13 = oi.BGx(wea.h);
        Boolean bool6 = wea.Pm;
        String strMbG4 = OI.mbG(wea.PD);
        String strBGx14 = oi.BGx(wea.OhM);
        Integer num4 = wea.Io;
        Long l6 = wea.D;
        Long l7 = wea.YG3;
        String strBGx15 = oi.BGx(wea.ISd);
        String strBGx16 = oi.BGx(wea.NKG);
        Integer num5 = wea.JA;
        String strBGx17 = oi.BGx(wea.Ui);
        String strBGx18 = oi.BGx(wea.p);
        Long l8 = wea.ILy;
        String strBGx19 = oi.BGx(wea.sg);
        String strBGx20 = oi.BGx(wea.U);
        List list = wea.tFd;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        List listBGx3 = oi.BGx(list, instance_delegatelambda0Var);
        String strBGx21 = oi.BGx(wea.OQ);
        List listBGx4 = oi.BGx(wea.h0W, a0K.VV3);
        List listBGx5 = oi.BGx(wea.CTv, wg.VLD);
        List listBGx6 = oi.BGx(wea.D9p, wg.e);
        Integer num6 = wea.L;
        Long l9 = wea.Ap;
        Boolean bool7 = wea.Iye;
        List listBGx7 = oi.BGx(wea.gdW, instance_delegatelambda0Var);
        List listBGx8 = oi.BGx(wea.bt, instance_delegatelambda0Var);
        List listBGx9 = oi.BGx(wea.oH, instance_delegatelambda0Var);
        List listBGx10 = oi.BGx(wea.Nd, onContentCardDismissed.IconCompatParcelizer(D4B.VLD, D4B.e));
        List listBGx11 = oi.BGx(wea.g, D4B.j);
        List listBGx12 = oi.BGx(wea.F8P, Upo.hIl);
        List listBGx13 = oi.BGx(wea.Xu, wg.JR);
        String strBGx22 = oi.BGx(wea.X);
        Long l10 = wea.pA0;
        Long l11 = wea.Zj;
        JSONObject jSONObject2 = (JSONObject) this.HQ.invoke(new Wea(strBGx, strMbG, strBGx2, strMbG2, strBGx3, l, strBGx4, bool, num, num2, d4, num3, strBGx5, strBGx6, strBGx7, strBGx8, strBGx9, strMbG3, l2, l3, bool2, bool3, strBGx10, strBGx11, listBGx, listBGx2, l4, f, d5, d6, bool4, bool5, strBGx12, l5, strBGx13, bool6, strMbG4, strBGx14, num4, l6, l7, strBGx15, strBGx16, num5, strBGx17, strBGx18, l8, strBGx19, strBGx20, listBGx3, strBGx21, listBGx4, listBGx5, listBGx6, num6, l9, bool7, listBGx7, listBGx8, listBGx9, listBGx10, listBGx11, listBGx12, listBGx13, strBGx22, l10, l11, wea.lb, Fields.RenderEffect, 0, 0));
        int length2 = jSONObject2.toString().length();
        double d7 = length2;
        if (length2 <= 300) {
            d2 = 3.0d;
        } else if (length2 <= 600) {
            d2 = 2.0d;
        } else if (length2 <= 1300) {
            d2 = 1.4d;
        } else {
            d2 = length2 <= 2000 ? 1.15d : 1.0d;
        }
        if (((int) (d7 * d2)) <= i) {
            return new cKI(jSONObject2, kTY.mbG, length2, Integer.valueOf(length));
        }
        JSONObject jSONObject3 = (JSONObject) this.HQ.invoke(new Wea(null, strMbG, null, strMbG2, null, null, null, null, null, null, null, null, null, null, null, null, null, strMbG3, null, l3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strMbG4, null, num4, l6, null, null, null, null, null, null, null, strBGx19, strBGx20, null, null, null, null, null, num6, null, null, null, null, null, null, null, null, null, strBGx22, l10, l11, null, -1310731, -8585633, 17));
        return new cKI(jSONObject3, y0e.mbG, jSONObject3.toString().length(), Integer.valueOf(length));
    }
}
