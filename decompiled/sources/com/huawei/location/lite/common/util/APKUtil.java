package com.huawei.location.lite.common.util;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import com.huawei.secure.android.common.util.SafeString;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import o.WrappedCompositionsetContent1211;
import o.placeAtf8xVGno;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;

/* JADX INFO: loaded from: classes2.dex */
public abstract class APKUtil {
    public static r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY getApkInfo(int i, String str) {
        synchronized (APKUtil.class) {
            r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy = new r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY();
            r8lambdacyuxafptvn7drfel1dgtevxcy.serializer = -1L;
            if (TextUtils.isEmpty(str)) {
                WrappedCompositionsetContent1211.read();
                return r8lambdacyuxafptvn7drfel1dgtevxcy;
            }
            PackageManager packageManager = placeAtf8xVGno.read().getPackageManager();
            try {
                WrappedCompositionsetContent1211.read();
                PackageInfo packageInfo = packageManager.getPackageInfo(str, i);
                if (packageInfo == null) {
                    return r8lambdacyuxafptvn7drfel1dgtevxcy;
                }
                if (i == 1) {
                    r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer = packageInfo.applicationInfo.uid;
                } else if (i == 64) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr != null && signatureArr.length != 0) {
                        Signature signature = signatureArr[0];
                    }
                    r8lambdacyuxafptvn7drfel1dgtevxcy.IconCompatParcelizer = getSignature(signatureArr);
                } else if (i == 16384) {
                    r8lambdacyuxafptvn7drfel1dgtevxcy.read = packageInfo.versionName;
                    r8lambdacyuxafptvn7drfel1dgtevxcy.serializer = packageInfo.getLongVersionCode();
                    r8lambdacyuxafptvn7drfel1dgtevxcy.MediaDescriptionCompat = packageInfo.applicationInfo.targetSdkVersion;
                }
                return r8lambdacyuxafptvn7drfel1dgtevxcy;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                WrappedCompositionsetContent1211.read();
            }
        }
    }

    public static int getUidByPackageName(String str) {
        if (str != null && !str.isEmpty()) {
            return getApkInfo(1, str).RemoteActionCompatParcelizer;
        }
        WrappedCompositionsetContent1211.read();
        return -1;
    }

    public static long getVersionCode(String str) {
        return getApkInfo(Fields.Clip, str).serializer;
    }

    public static String getSignature(Signature[] signatureArr) {
        if (signatureArr != null && signatureArr.length != 0) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA256").digest(signatureArr[0].toByteArray());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(SafeString.substring(Integer.toHexString((b & 255) | Fields.RotationX), 1, 3).toUpperCase(Locale.ROOT));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                WrappedCompositionsetContent1211.read();
                return null;
            }
        }
        WrappedCompositionsetContent1211.read();
        return null;
    }
}
