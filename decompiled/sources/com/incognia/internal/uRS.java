package com.incognia.internal;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class uRS {
    public final iLf BGx;
    public final WallpaperManager mbG;

    public uRS(Context context, iLf ilf) {
        this.BGx = ilf;
        this.mbG = WallpaperManager.getInstance(context);
    }

    public final String BGx() {
        String strBGx = null;
        if (XUh.BGx(XUh.BGx, 0, 32, 1) && this.BGx.BGx("android.permission.READ_EXTERNAL_STORAGE")) {
            try {
                Drawable drawable = this.mbG.getDrawable();
                if (drawable != null) {
                    strBGx = xlt.BGx(drawable);
                }
            } catch (Throwable unused) {
            }
            this.mbG.forgetLoadedWallpaper();
        }
        return strBGx;
    }

    public final Integer mbG() {
        if (!XUh.BGx(XUh.BGx, 24, 0, 2)) {
            return null;
        }
        try {
            return Integer.valueOf(this.mbG.getWallpaperId(1));
        } catch (Throwable unused) {
            return null;
        }
    }
}
