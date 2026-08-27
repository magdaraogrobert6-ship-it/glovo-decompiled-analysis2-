package com.incognia.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import java.security.MessageDigest;
import java.util.List;
import o.onContentCardClicked;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public final class QP {
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public static dCe BGx(PackageInfo packageInfo, String str) {
        List listRatingCompat;
        List list;
        String strHQ;
        String strHQ2;
        Signature signature;
        Signature signature2;
        Signature[] signingCertificateHistory;
        XUh xUh = XUh.BGx;
        long longVersionCode = XUh.BGx(xUh, 28, 0, 2) ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        if (XUh.BGx(xUh, 28, 0, 2)) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null && signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                if (apkContentsSigners != null) {
                    listRatingCompat = onContentCardClicked.RatingCompat(apkContentsSigners);
                    list = listRatingCompat;
                } else {
                    list = null;
                }
            } else if (signingInfo == null || (signingCertificateHistory = signingInfo.getSigningCertificateHistory()) == null) {
                list = null;
            } else {
                listRatingCompat = onContentCardClicked.RatingCompat(signingCertificateHistory);
                list = listRatingCompat;
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                listRatingCompat = onContentCardClicked.RatingCompat(signatureArr);
                list = listRatingCompat;
            } else {
                list = null;
            }
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        long j = packageInfo.lastUpdateTime;
        long j2 = packageInfo.firstInstallTime;
        boolean z = (applicationInfo == null || (applicationInfo.flags & 1) == 0) ? false : true;
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        List listRatingCompat2 = serviceInfoArr != null ? onContentCardClicked.RatingCompat(serviceInfoArr) : null;
        ActivityInfo[] activityInfoArr = packageInfo.receivers;
        List listRatingCompat3 = activityInfoArr != null ? onContentCardClicked.RatingCompat(activityInfoArr) : null;
        String[] strArr = packageInfo.requestedPermissions;
        List listRatingCompat4 = strArr != null ? onContentCardClicked.RatingCompat(strArr) : null;
        Integer numValueOf = applicationInfo != null ? Integer.valueOf(applicationInfo.targetSdkVersion) : null;
        String str2 = packageInfo.packageName;
        String str3 = packageInfo.versionName;
        Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
        String str4 = applicationInfo != null ? applicationInfo.publicSourceDir : null;
        Integer numValueOf2 = applicationInfo != null ? Integer.valueOf(applicationInfo.icon) : null;
        ActivityInfo[] activityInfoArr2 = packageInfo.activities;
        List listRatingCompat5 = activityInfoArr2 != null ? onContentCardClicked.RatingCompat(activityInfoArr2) : null;
        if (list == null || (signature2 = (Signature) onContentCardDismissed.MediaMetadataCompat(list)) == null) {
            strHQ = null;
        } else {
            try {
                byte[] byteArray = signature2.toByteArray();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(byteArray);
                strHQ = yEy.HQ(2, messageDigest.digest());
            } catch (Throwable unused) {
                strHQ = null;
            }
        }
        if (list == null || (signature = (Signature) onContentCardDismissed.MediaMetadataCompat(list)) == null) {
            strHQ2 = null;
        } else {
            try {
                byte[] byteArray2 = signature.toByteArray();
                Lql lql = new Lql();
                lql.BGx(byteArray2);
                strHQ2 = yEy.HQ(2, lql.BGx());
            } catch (Throwable unused2) {
                strHQ2 = null;
            }
        }
        ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
        return new dCe(longVersionCode, j, j2, z, listRatingCompat2, listRatingCompat3, list, listRatingCompat4, numValueOf, str2, str3, bundle, str4, numValueOf2, str, listRatingCompat5, strHQ, strHQ2, applicationInfo2 != null ? Integer.valueOf(applicationInfo2.uid) : null);
    }
}
