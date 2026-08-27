package com.mapbox.search;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SearchEngineImpl$$ExternalSyntheticLambda0 implements ThreadFactory {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.$r8$classId != 0 ? new Thread(runnable, "Global DataProviderRegistry executor") : new Thread(runnable, "SearchEngine executor");
    }
}
