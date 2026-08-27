package com.incognia.internal;

import android.os.Build;
import androidx.sqlite.SQLite;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.util.List;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes2.dex */
public final class XUh {
    public static final XUh BGx = new XUh();
    public static final String mbG = Build.BOARD;
    public static final String HQ = Build.BOOTLOADER;
    public static final String N = Build.BRAND;
    public static final String x = Build.DEVICE;
    public static final String hIl = Build.FINGERPRINT;
    public static final String hs = Build.HARDWARE;
    public static final String VV3 = Build.HOST;
    public static final String A1 = Build.ID;
    public static final String q = Build.MANUFACTURER;
    public static final String fZl = Build.MODEL;
    public static final int S = Build.VERSION.SDK_INT;
    public static final String iaH = Build.VERSION.INCREMENTAL;
    public static final String e = FWFHelper.fwfDeviceOS;
    public static final String VLD = Build.PRODUCT;
    public static final String TfN = Build.getRadioVersion();
    public static final String OV7 = Build.TAGS;
    public static final long JR = Build.TIME;
    public static final String j = Build.USER;
    public static final String n = Build.DISPLAY;

    public final String HQ() {
        if (BGx(this, 31, 0, 2)) {
            return Build.SOC_MANUFACTURER;
        }
        return null;
    }

    public final String N() {
        if (BGx(this, 31, 0, 2)) {
            return Build.SOC_MODEL;
        }
        return null;
    }

    public final List hIl() {
        if (BGx(this, 21, 0, 2)) {
            return onContentCardClicked.read(Build.SUPPORTED_64_BIT_ABIS);
        }
        return null;
    }

    public final List hs() {
        if (BGx(this, 21, 0, 2)) {
            return onContentCardClicked.read(Build.SUPPORTED_ABIS);
        }
        return SQLite.read(Build.CPU_ABI, Build.CPU_ABI2);
    }

    public final String mbG() {
        if (BGx(this, 0, 25, 1)) {
            return Build.SERIAL;
        }
        return null;
    }

    public final List x() {
        if (BGx(this, 21, 0, 2)) {
            return onContentCardClicked.read(Build.SUPPORTED_32_BIT_ABIS);
        }
        return null;
    }

    public static boolean BGx(XUh xUh, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        xUh.getClass();
        int i4 = S;
        return i <= i4 && i4 <= i2;
    }

    public final Integer BGx() {
        if (BGx(this, 31, 0, 2)) {
            return Integer.valueOf(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
        }
        return null;
    }
}
