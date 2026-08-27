package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xr$$ExternalSyntheticLambda0 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int $r8$classId;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.$r8$classId != 0) {
            pNP.BGx(thread, th);
        } else {
            xr.BGx(thread, th);
        }
    }
}
