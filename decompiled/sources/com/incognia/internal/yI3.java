package com.incognia.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yI3 implements yUe {
    public static final String OV7 = (String) W4i.nE.MediaSessionCompatResultReceiverWrapper();
    public final WifiManager A1;
    public final Context BGx;
    public final X6a HQ;
    public final BvF N;
    public final ib2 TfN;
    public boolean VLD;
    public final iLf hIl;
    public final NvL hs;
    public final UsU mbG;
    public final Nr q;
    public final Ymx x;
    public JyL VV3 = VPw.BGx;
    public final kl fZl = new kl();
    public final MD S = new MD();
    public final LinkedHashSet iaH = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.VV3;
    }

    public static final void HQ(yI3 yi3, QGs qGs) {
        yi3.iaH.remove(qGs);
        if (yi3.iaH.isEmpty() && yi3.VLD) {
            yi3.BGx.unregisterReceiver(yi3.TfN);
            yi3.VLD = false;
        }
    }

    public final void VV3() {
        boolean z;
        boolean zOptBoolean = ((JSONObject) this.hs.BGx.get()).optBoolean(OV7, true);
        if (x() && this.x.mbG() && this.N.VV3() && zOptBoolean && !this.VLD) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            CUj.BGx(this.BGx, this.TfN, intentFilter, this.mbG.mbG);
            this.VLD = true;
            return;
        }
        if (!zOptBoolean && (z = this.VLD) && z) {
            this.BGx.unregisterReceiver(this.TfN);
            this.VLD = false;
        }
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.VV3 = pbf.BGx;
    }

    public yI3(Context context, UsU usU, X6a x6a, BvF bvF, Ymx ymx, iLf ilf, NvL nvL, KWh kWh) {
        this.BGx = context;
        this.mbG = usU;
        this.HQ = x6a;
        this.N = bvF;
        this.x = ymx;
        this.hIl = ilf;
        this.hs = nvL;
        this.A1 = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.q = new Nr(kWh);
        this.TfN = new ib2(usU, new OAq(this));
    }

    public final boolean BGx(QGs qGs) {
        if (this.hIl.BGx("android.permission.CHANGE_WIFI_STATE") && this.x.mbG() && this.N.VV3() && x()) {
            NvL nvL = this.hs;
            if (((JSONObject) nvL.BGx.get()).optBoolean(OV7, true)) {
                try {
                    boolean zBGx = O6.BGx(this, new yI3$$ExternalSyntheticLambda0(this, qGs, 1));
                    if (zBGx) {
                        this.A1.startScan();
                    }
                    return zBGx;
                } catch (Throwable th) {
                    this.HQ.BGx(th, false);
                }
            }
        }
        return false;
    }

    public final boolean hs() {
        return this.hIl.BGx("android.permission.ACCESS_WIFI_STATE") && this.A1.isScanAlwaysAvailable();
    }

    public final boolean x() {
        return (this.hIl.BGx("android.permission.ACCESS_WIFI_STATE") && this.A1.isWifiEnabled()) || hs();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    public final ArrayList mbG() {
        Isj isjBGx;
        if (x() && this.x.mbG() && this.N.VV3()) {
            WifiInfo connectionInfo = this.A1.getConnectionInfo();
            if (connectionInfo != null) {
                String bssid = connectionInfo.getBSSID();
                String ssid = connectionInfo.getSSID();
                if ((bssid == null || "00:00:00:00:00:00".equals(bssid)) && (ssid == null || ssid.length() == 0 || "<unknown ssid>".equals(ssid))) {
                    isjBGx = null;
                }
            }
            this.fZl.getClass();
            isjBGx = kl.BGx(connectionInfo);
        } else {
            isjBGx = null;
        }
        if (x() && this.x.mbG() && this.N.VV3()) {
            return this.q.BGx(this.A1.getScanResults(), isjBGx);
        }
        return null;
    }

    public final void HQ(QGs qGs) {
        O6.BGx(this, new yI3$$ExternalSyntheticLambda0(this, qGs, 2));
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.VV3 = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(21, this));
    }

    public static final void BGx(yI3 yi3, QGs qGs) {
        yi3.e.add(qGs);
        if (yi3.iaH.isEmpty()) {
            yi3.VV3();
        }
    }

    public static final void BGx(yI3 yi3) {
        if (!yi3.x() || yi3.iaH.isEmpty()) {
            return;
        }
        yi3.VV3();
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new yDo$$ExternalSyntheticLambda8(this, vn8, 2));
    }

    public static final void BGx(yI3 yi3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        yi3.iaH.clear();
        yi3.e.clear();
        if (yi3.VLD) {
            yi3.BGx.unregisterReceiver(yi3.TfN);
            yi3.VLD = false;
        }
        yi3.VV3 = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.mbG;
    }

    public static final void mbG(yI3 yi3, QGs qGs) {
        if (yi3.iaH.isEmpty()) {
            yi3.VV3();
        }
        yi3.iaH.add(qGs);
    }

    public final void mbG(QGs qGs) {
        O6.BGx(this, new yI3$$ExternalSyntheticLambda0(this, qGs, 0));
    }
}
