package com.incognia.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import o.accessgetInstancedelegatecp;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ZE implements yUe {
    public static final String S = (String) W4i.nE.MediaSessionCompatResultReceiverWrapper();
    public final Context BGx;
    public final NvL HQ;
    public final Vh VV3;
    public final ConnectivityManager hIl;
    public as hs;
    public final UsU mbG;
    public boolean q;
    public final o N = new o();
    public final LinkedHashSet x = new LinkedHashSet();
    public final AtomicBoolean A1 = new AtomicBoolean(false);
    public JyL fZl = VPw.BGx;

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.fZl;
    }

    public final Boolean hs() {
        try {
            if (XUh.BGx(XUh.BGx, 23, 0, 2)) {
                NetworkCapabilities networkCapabilities = this.hIl.getNetworkCapabilities(this.hIl.getActiveNetwork());
                if (networkCapabilities != null) {
                    return Boolean.valueOf(networkCapabilities.hasTransport(4));
                }
                return null;
            }
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = list.get(i);
                i++;
                if (((NetworkInterface) obj).isUp()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                arrayList2.add(((NetworkInterface) obj2).getName());
            }
            return Boolean.valueOf(arrayList2.contains("tun0") || arrayList2.contains("ppp0"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final xus mbG() {
        try {
            if (!XUh.BGx(XUh.BGx, 21, 0, 2)) {
                return null;
            }
            ConnectivityManager connectivityManager = this.hIl;
            LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
            if (linkProperties != null) {
                return this.N.BGx(linkProperties);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void BGx(ZE ze) {
        if (ze.A1.get()) {
            return;
        }
        XUh xUh = XUh.BGx;
        if (XUh.BGx(xUh, 24, 0, 2)) {
            as asVar = new as(ze);
            ze.hs = asVar;
            try {
                ze.hIl.registerDefaultNetworkCallback(asVar);
                ze.A1.compareAndSet(false, true);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        NvL nvL = ze.HQ;
        if (((JSONObject) nvL.BGx.get()).optBoolean(S, true)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            CUj.BGx(ze.BGx, ze.VV3, intentFilter, ze.mbG.mbG);
            ze.A1.compareAndSet(false, true);
            return;
        }
        if (ze.A1.get()) {
            if (XUh.BGx(xUh, 24, 0, 2)) {
                ConnectivityManager connectivityManager = ze.hIl;
                as asVar2 = ze.hs;
                if (asVar2 == null) {
                    asVar2 = null;
                }
                connectivityManager.unregisterNetworkCallback(asVar2);
            } else {
                ze.BGx.unregisterReceiver(ze.VV3);
            }
            ze.A1.compareAndSet(true, false);
        }
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.fZl = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(11, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.fZl = pbf.BGx;
    }

    public final vgd x() {
        NetworkInfo activeNetworkInfo = this.hIl.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return null;
        }
        return new vgd(String.valueOf(activeNetworkInfo.getType()), activeNetworkInfo.getType() == 0 ? String.valueOf(activeNetworkInfo.getSubtype()) : null);
    }

    public ZE(Context context, UsU usU, NvL nvL) {
        this.BGx = context;
        this.mbG = usU;
        this.HQ = nvL;
        this.hIl = (ConnectivityManager) context.getSystemService("connectivity");
        this.VV3 = new Vh(usU, new g8M(this));
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 16, vn8));
    }

    public static final void BGx(ZE ze, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        ze.x.clear();
        if (ze.A1.get()) {
            if (XUh.BGx(XUh.BGx, 24, 0, 2)) {
                ConnectivityManager connectivityManager = ze.hIl;
                as asVar = ze.hs;
                if (asVar == null) {
                    asVar = null;
                }
                connectivityManager.unregisterNetworkCallback(asVar);
            } else {
                ze.BGx.unregisterReceiver(ze.VV3);
            }
            ze.A1.compareAndSet(true, false);
        }
        ze.fZl = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.mbG;
    }
}
