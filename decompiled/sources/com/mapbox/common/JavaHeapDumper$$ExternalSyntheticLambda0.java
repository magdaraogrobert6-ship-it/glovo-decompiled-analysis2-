package com.mapbox.common;

import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class JavaHeapDumper$$ExternalSyntheticLambda0 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ JavaHeapDumper$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.$r8$classId == 0) {
            JavaHeapDumper.enable$lambda$1(thread, th);
            return;
        }
        WrappedCompositionsetContent1211.read("ExecutorUtil", "thread name:" + thread.getName() + ", uncaughtException.");
    }
}
