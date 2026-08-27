package com.incognia.internal;

import android.content.pm.InstallSourceInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class fJ {
    public static Rn BGx(InstallSourceInfo installSourceInfo) {
        XUh xUh = XUh.BGx;
        return new Rn(XUh.BGx(xUh, 33, 0, 2) ? Integer.valueOf(installSourceInfo.getPackageSource()) : null, installSourceInfo.getInstallingPackageName(), installSourceInfo.getInitiatingPackageName(), XUh.BGx(xUh, 34, 0, 2) ? installSourceInfo.getUpdateOwnerPackageName() : null);
    }
}
