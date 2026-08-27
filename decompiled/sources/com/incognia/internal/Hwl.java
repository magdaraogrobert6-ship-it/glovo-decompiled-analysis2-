package com.incognia.internal;

import android.util.Log;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class Hwl {
    public final mc A1 = new mc();
    public final utV BGx;
    public final AbD HQ;
    public final bE N;
    public final mGJ S;
    public final GXa VLD;
    public final cY VV3;
    public final BYG e;
    public final lwp fZl;
    public final ui8 hIl;
    public final wH hs;
    public final gPk iaH;
    public final Pxg mbG;
    public final yo q;
    public final pPr x;

    public final void BGx(MLu mLu, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (this.VV3.BGx()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            this.BGx.BGx(new ZmT(mLu));
        } else if (IU.BGx.get()) {
            Log.w("Incognia", (String) W4i.cF5.MediaSessionCompatResultReceiverWrapper());
        }
    }

    public Hwl(utV utv, Pxg pxg, AbD abD, bE bEVar, pPr ppr, ui8 ui8Var, wH wHVar, cY cYVar) {
        this.BGx = utv;
        this.mbG = pxg;
        this.HQ = abD;
        this.N = bEVar;
        this.x = ppr;
        this.hIl = ui8Var;
        this.hs = wHVar;
        this.VV3 = cYVar;
        yo yoVar = new yo();
        this.q = yoVar;
        this.fZl = new lwp();
        this.S = new mGJ(yoVar);
        this.iaH = new gPk();
        this.e = new BYG();
        this.VLD = new GXa();
    }
}
