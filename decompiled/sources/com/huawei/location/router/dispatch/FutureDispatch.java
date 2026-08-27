package com.huawei.location.router.dispatch;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public class FutureDispatch<V> extends FutureTask<V> {
    private final Callable<V> callable;

    public Callable<V> getCallable() {
        return this.callable;
    }

    public FutureDispatch(Callable<V> callable) {
        super(callable);
        this.callable = callable;
    }
}
