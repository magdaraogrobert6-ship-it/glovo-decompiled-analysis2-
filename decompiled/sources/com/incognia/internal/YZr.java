package com.incognia.internal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.Signature;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.isItemDismissable;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class YZr {
    public static final String q = (String) W4i.sMC.MediaSessionCompatResultReceiverWrapper();
    public final String A1;
    public final Hh BGx;
    public final boolean HQ;
    public Signature VV3;
    public dCe hIl;
    public Rn hs;
    public final PackageManager mbG;
    public final QP N = new QP();
    public final fJ x = new fJ();

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    public final dCe mbG() {
        dCe dce;
        String string;
        dCe dceBGx;
        synchronized (this) {
            try {
                if (this.hIl == null) {
                    x4 x4Var = x4.BGx;
                    int iBGx = fYB.BGx.BGx();
                    boolean zBGx = this.BGx.BGx(x4Var);
                    String str = this.A1;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str}, getCieXyz.write())).booleanValue() || this.HQ) {
                        PackageInfo packageInfoBGx = J3.BGx(this.mbG, str, iBGx | 4224);
                        if (!zBGx || packageInfoBGx == null) {
                            string = null;
                        } else {
                            try {
                                ApplicationInfo applicationInfo = packageInfoBGx.applicationInfo;
                                if (applicationInfo != null) {
                                    string = this.mbG.getApplicationLabel(applicationInfo).toString();
                                } else {
                                    string = null;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        if (packageInfoBGx != null) {
                            this.N.getClass();
                            dceBGx = QP.BGx(packageInfoBGx, string);
                        }
                        this.hIl = dceBGx;
                    }
                    dceBGx = null;
                    this.hIl = dceBGx;
                }
                dce = this.hIl;
            } catch (Throwable unused2) {
                return null;
            }
        }
        return dce;
    }

    public YZr(Context context, VOk vOk, Hh hh) {
        this.BGx = hh;
        this.mbG = context.getPackageManager();
        this.HQ = vOk.N;
        this.A1 = context.getPackageName();
    }

    public final Boolean BGx(byte[] bArr) {
        Object isitemdismissable;
        if (!XUh.BGx(XUh.BGx, 28, 0, 2)) {
            return null;
        }
        try {
            isitemdismissable = Boolean.valueOf(this.mbG.hasSigningCertificate(this.A1, bArr, 0));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        return (Boolean) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
    }

    public final Rn HQ(String str) throws PackageManager.NameNotFoundException {
        boolean zBGx = XUh.BGx(XUh.BGx, 30, 0, 2);
        PackageManager packageManager = this.mbG;
        if (zBGx) {
            InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(str);
            this.x.getClass();
            return fJ.BGx(installSourceInfo);
        }
        String installerPackageName = packageManager.getInstallerPackageName(str);
        this.x.getClass();
        return new Rn(null, installerPackageName, null, null);
    }

    public final Integer BGx() {
        if (!XUh.BGx(XUh.BGx, 21, 0, 2)) {
            return null;
        }
        try {
            String[] strArr = this.mbG.getApplicationInfo(this.A1, 0).splitSourceDirs;
            return Integer.valueOf(strArr != null ? strArr.length : 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean BGx(String str) {
        try {
            return Boolean.valueOf(this.mbG.hasSystemFeature(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void BGx(final EK9 ek9) {
        try {
            if (XUh.BGx(XUh.BGx, 31, 0, 2)) {
                this.mbG.requestChecksums(this.A1, false, 1, PackageManager.TRUST_NONE, new PackageManager.OnChecksumsReadyListener() { // from class: com.incognia.internal.YZr$$ExternalSyntheticLambda2
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        YZr.BGx(ek9, list);
                    }
                });
            } else {
                ek9.BGx(null);
            }
        } catch (Throwable unused) {
            ek9.BGx(null);
        }
    }

    public static final void BGx(EK9 ek9, List list) {
        String strHQ;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApkChecksum apkChecksumM = MapboxMap$$ExternalSyntheticLambda0.m(it.next());
            if (apkChecksumM.getType() == 1) {
                strHQ = yEy.HQ(2, apkChecksumM.getValue());
                ek9.BGx(strHQ);
            }
        }
        strHQ = null;
        ek9.BGx(strHQ);
    }

    public final Boolean mbG(String str) {
        try {
            PermissionInfo permissionInfo = this.mbG.getPermissionInfo(str, Fields.SpotShadowColor);
            boolean z = false;
            if (XUh.BGx(XUh.BGx, 28, 0, 2)) {
                if (permissionInfo.getProtection() == 1) {
                    z = true;
                }
            } else if ((permissionInfo.protectionLevel & 15) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }
}
