package com.incognia.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiSsid;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.RegexKt;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Nr {
    public Nr(KWh kWh) {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    public final ArrayList BGx(List list, Isj isj) {
        LCt lCt;
        boolean zBooleanValue;
        boolean z;
        String strBGx;
        Integer numValueOf;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            if (scanResult != null) {
                int i = scanResult.level;
                int i2 = scanResult.frequency;
                long j = scanResult.timestamp / 1000;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if ((isj != 0 ? isj.N : null) == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{isj.N, scanResult.BSSID}, getCieXyz.write())).booleanValue();
                }
                String str = scanResult.capabilities;
                if (str == null) {
                    z = false;
                } else {
                    Pattern patternCompile = Pattern.compile("(WPA)|(WEP)");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(str);
                    matcher.getClass();
                    if (RegexKt.write(matcher, 0, str) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                XUh xUh = XUh.BGx;
                if (XUh.BGx(xUh, 33, 0, 2)) {
                    WifiSsid wifiSsid = scanResult.getWifiSsid();
                    strBGx = wifiSsid != null ? IA.BGx(wifiSsid.toString()) : null;
                } else {
                    strBGx = scanResult.SSID;
                }
                String lowerCase = scanResult.BSSID.toLowerCase(Locale.US);
                int i3 = 2;
                if (XUh.BGx(xUh, 23, 0, 2)) {
                    numValueOf = Integer.valueOf(scanResult.channelWidth);
                    i3 = 2;
                } else {
                    numValueOf = null;
                }
                lCt = new LCt(i, i2, (jCurrentTimeMillis + j) - jElapsedRealtime, zBooleanValue, z, strBGx, lowerCase, numValueOf, XUh.BGx(xUh, 23, 0, i3) ? Boolean.valueOf(scanResult.is80211mcResponder()) : null);
            } else {
                lCt = null;
            }
            ArrayList arrayList2 = arrayList;
            if (lCt != null) {
                arrayList2.add(lCt);
            }
            it = it;
            arrayList = arrayList2;
        }
        return arrayList;
    }
}
