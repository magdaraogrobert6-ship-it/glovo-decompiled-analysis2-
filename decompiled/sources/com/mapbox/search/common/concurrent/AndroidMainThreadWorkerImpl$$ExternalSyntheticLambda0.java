package com.mapbox.search.common.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.re2j.Parser;
import java.util.concurrent.Executor;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0 implements Executor {
    public final /* synthetic */ Parser.Pair f$0;

    public /* synthetic */ AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0(Parser.Pair pair) {
        this.f$0 = pair;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            runnable.run();
        } else {
            ((Handler) this.f$0.RemoteActionCompatParcelizer).post(runnable);
        }
    }
}
