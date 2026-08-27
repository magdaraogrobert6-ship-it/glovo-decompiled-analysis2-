package com.qualtrics.digital;

/* JADX INFO: loaded from: classes3.dex */
class CrashReporter {
    public static void logCrash(String str, Throwable th) {
        SiteInterceptService.instance().postErrorLog(str, false, th);
    }

    public static void logCrash(Throwable th) {
        SiteInterceptService.instance().postErrorLog(th);
    }
}
