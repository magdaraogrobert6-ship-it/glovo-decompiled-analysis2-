package com.incognia.internal;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.display.DeviceProductInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class flT {
    public final Context BGx;
    public final onViewDetachedFromWindowlambda1 HQ = new isAdapterPositionOnScreen(new p6(this));
    public final WindowManager mbG;

    public final String HQ() {
        Display display;
        DeviceProductInfo deviceProductInfo;
        try {
            if (!XUh.BGx(XUh.BGx, 31, 0, 2) || (display = (Display) this.HQ.MediaSessionCompatResultReceiverWrapper()) == null || (deviceProductInfo = display.getDeviceProductInfo()) == null) {
                return null;
            }
            return deviceProductInfo.getManufacturerPnpId();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String N() {
        Display display;
        DeviceProductInfo deviceProductInfo;
        try {
            if (!XUh.BGx(XUh.BGx, 31, 0, 2) || (display = (Display) this.HQ.MediaSessionCompatResultReceiverWrapper()) == null || (deviceProductInfo = display.getDeviceProductInfo()) == null) {
                return null;
            }
            return deviceProductInfo.getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String mbG() {
        try {
            Display display = (Display) this.HQ.MediaSessionCompatResultReceiverWrapper();
            if (display != null) {
                return display.getName();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Integer BGx() {
        try {
            Resources resources = this.BGx.getResources();
            return Integer.valueOf((resources != null ? resources.getDisplayMetrics() : new DisplayMetrics()).densityDpi);
        } catch (Throwable unused) {
            return null;
        }
    }

    public flT(Context context) {
        this.BGx = context;
        this.mbG = (WindowManager) context.getSystemService("window");
    }

    public final String x() {
        try {
            if (XUh.BGx(XUh.BGx, 30, 0, 2)) {
                WindowMetrics maximumWindowMetrics = this.mbG.getMaximumWindowMetrics();
                StringBuilder sb = new StringBuilder();
                sb.append(maximumWindowMetrics.getBounds().height());
                sb.append('x');
                sb.append(maximumWindowMetrics.getBounds().width());
                return sb.toString();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display display = (Display) this.HQ.MediaSessionCompatResultReceiverWrapper();
            if (display != null) {
                display.getRealMetrics(displayMetrics);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.heightPixels);
            sb2.append('x');
            sb2.append(displayMetrics.widthPixels);
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
