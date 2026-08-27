package com.incognia.internal;

import android.net.wifi.WifiInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class kl {
    public static Isj BGx(WifiInfo wifiInfo) {
        return new Isj(wifiInfo.getRssi(), wifiInfo.getLinkSpeed(), IA.BGx(wifiInfo.getSSID()), wifiInfo.getBSSID(), XUh.BGx(XUh.BGx, 21, 0, 2) ? Integer.valueOf(wifiInfo.getFrequency()) : null);
    }
}
