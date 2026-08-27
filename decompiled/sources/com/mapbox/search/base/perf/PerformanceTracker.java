package com.mapbox.search.base.perf;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PerformanceTracker {
    public static final CopyOnWriteArraySet performanceObservers = new CopyOnWriteArraySet();

    static {
        new AtomicInteger(0);
    }

    public static void trackPerformanceSync(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        CopyOnWriteArraySet copyOnWriteArraySet = performanceObservers;
        if (copyOnWriteArraySet.isEmpty()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        try {
            long jWrite = BrazeInAppMessageManagerWhenMappings.write();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            DefaultInAppMessageViewWrapper.serializer(jWrite);
            Iterator it2 = copyOnWriteArraySet.iterator();
            if (it2.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it2);
            }
        } catch (Throwable th) {
            Iterator it3 = copyOnWriteArraySet.iterator();
            if (!it3.hasNext()) {
                throw th;
            }
            throw ff$$ExternalSyntheticOutline0.m(it3);
        }
    }
}
