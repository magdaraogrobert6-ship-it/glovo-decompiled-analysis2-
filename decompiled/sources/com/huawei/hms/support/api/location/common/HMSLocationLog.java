package com.huawei.hms.support.api.location.common;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import o.WrappedCompositionsetContent1211;
import o.accessgetNodeToNodeStatep;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public class HMSLocationLog {
    private static String compositeMessage(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str2);
    }

    private static String compositeTagForHMSLog(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("HwLocation_", str);
    }

    public static void d(String str, String str2, String str3) {
        compositeTagForHMSLog(str);
        compositeMessage(str2, str3);
        WrappedCompositionsetContent1211.read();
    }

    public static void e(String str, String str2, long j, String str3) {
        HMSLog.e(compositeTagForHMSLog(str), j, compositeMessage(str2, str3));
        accessgetNodeToNodeStatep.serializer(str, compositeMessage(str2, str3));
    }

    public static void i(String str, String str2, String str3) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(compositeTagForHMSLog(str), compositeMessage(str2, str3));
    }

    public static void w(String str, String str2, String str3) {
        WrappedCompositionsetContent1211.write(compositeTagForHMSLog(str), compositeMessage(str2, str3));
    }

    public static void e(String str, String str2, long j, String str3, Throwable th) {
        HMSLog.e(compositeTagForHMSLog(str), j, compositeMessage(str2, str3), th);
        accessgetNodeToNodeStatep.serializer(str, compositeMessage(str2, str3));
    }

    public static void e(String str, String str2, String str3) {
        WrappedCompositionsetContent1211.read(compositeTagForHMSLog(str), compositeMessage(str2, str3));
    }

    public static void e(String str, String str2, String str3, Throwable th) {
        WrappedCompositionsetContent1211.write(compositeTagForHMSLog(str), compositeMessage(str2, str3), th);
    }
}
