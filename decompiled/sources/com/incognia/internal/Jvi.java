package com.incognia.internal;

import android.net.NetworkInfo;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Jvi {
    public final iLf BGx;
    public final BvF HQ;
    public final ZE N;
    public final yI3 mbG;
    public final Pxg x;

    public final List BGx(et5 et5Var) {
        boolean zIsConnectedOrConnecting;
        c1 c1Var = new c1(rx9.BGx, this.mbG.x() || this.mbG.hs());
        Ed ed = Ed.BGx;
        BvF bvF = this.HQ;
        c1 c1Var2 = new c1(ed, (this.BGx.BGx("android.permission.ACCESS_FINE_LOCATION") && bvF.mbG("gps")) || ((this.BGx.BGx("android.permission.ACCESS_COARSE_LOCATION") || this.BGx.BGx("android.permission.ACCESS_FINE_LOCATION")) && bvF.mbG("network")));
        LqY lqY = LqY.BGx;
        ZE ze = this.N;
        ze.getClass();
        if (XUh.BGx(XUh.BGx, 24, 0, 2) && ze.A1.get()) {
            zIsConnectedOrConnecting = ze.q;
        } else {
            NetworkInfo activeNetworkInfo = ze.hIl.getActiveNetworkInfo();
            zIsConnectedOrConnecting = activeNetworkInfo != null ? activeNetworkInfo.isConnectedOrConnecting() : false;
        }
        ArrayList arrayList = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new c1[]{c1Var, c1Var2, new c1(lqY, zIsConnectedOrConnecting), new c1(xmL.BGx, this.BGx.BGx("android.permission.ACCESS_COARSE_LOCATION") || this.BGx.BGx("android.permission.ACCESS_FINE_LOCATION")), new c1(D9x.BGx, this.x.HQ.get() != null)}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{et5Var, X9.HQ}, getCieXyz.write())).booleanValue()) {
            arrayList.add(new c1(w53.BGx, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{et5Var, L5i.HQ}, getCieXyz.write())).booleanValue()));
        }
        return arrayList;
    }

    public Jvi(iLf ilf, yI3 yi3, BvF bvF, ZE ze, Pxg pxg) {
        this.BGx = ilf;
        this.mbG = yi3;
        this.HQ = bvF;
        this.N = ze;
        this.x = pxg;
    }
}
