package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.common.PackageConstants;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    public static String a(Context context) {
        if (a(context, "com.huawei.hwid")) {
            return "com.huawei.hwid";
        }
        if (a(context, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) {
            return PackageConstants.SERVICES_PACKAGE_ALL_SCENE;
        }
        return a(context, "com.huawei.hwid.tv") ? "com.huawei.hwid.tv" : "com.huawei.hwid";
    }

    public static PackageInfo b(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, Fields.SpotShadowColor);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = "getPackageInfo NameNotFoundException";
                Log.w("ApkUtil", str2);
            } catch (Exception unused2) {
                str2 = "getPackageInfo Exception";
                Log.w("ApkUtil", str2);
            }
        }
        return null;
    }

    public static String c(Context context, String str) {
        byte[] bArrD = d(context, str);
        if (bArrD == null || bArrD.length == 0) {
            return null;
        }
        return g.a(i.a(bArrD));
    }

    private static byte[] d(Context context, String str) {
        String strConcat;
        PackageInfo packageInfo;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr.length > 0) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(signatureArr[0].toByteArray());
                        try {
                            byte[] encoded = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream2).getEncoded();
                            j.a(byteArrayInputStream2);
                            return encoded;
                        } catch (RuntimeException e) {
                            e = e;
                            byteArrayInputStream = byteArrayInputStream2;
                            strConcat = "getPackageSignatureBytes RuntimeException:".concat(e.getClass().getSimpleName());
                            Log.e("ApkUtil", strConcat);
                            j.a(byteArrayInputStream);
                            return new byte[0];
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream = byteArrayInputStream2;
                            strConcat = "getPackageSignatureBytes Exception:".concat(th.getClass().getSimpleName());
                            Log.e("ApkUtil", strConcat);
                            j.a(byteArrayInputStream);
                            return new byte[0];
                        }
                    }
                }
            } catch (Throwable th2) {
                j.a(byteArrayInputStream);
                throw th2;
            }
        } catch (RuntimeException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
        j.a(byteArrayInputStream);
        return new byte[0];
    }

    public static boolean a(Context context, String str) {
        return b(context, str) != null;
    }
}
