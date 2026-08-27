package com.mapbox.common;

import android.os.Trace;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTracing {
    public static final MapboxTracing INSTANCE = new MapboxTracing();
    public static final String MAPBOX_TRACE_ID = "mbx";
    private static boolean platformTracingEnabled;

    private MapboxTracing() {
    }

    public final void disableAll() {
        platformTracingEnabled = false;
        Tracing.setTracingBackendType(TracingBackendType.NOOP);
    }

    public final void enableAll() {
        platformTracingEnabled = true;
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enablePlatform() {
        platformTracingEnabled = true;
    }

    public final boolean getPlatformTracingEnabled() {
        return platformTracingEnabled;
    }

    public final void enableCore() {
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final <T> T traceSync(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        if (!getPlatformTracingEnabled()) {
            return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
        }
        Trace.beginSection("mbx: " + ((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()));
        try {
            return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public final <T> T traceSync(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (getPlatformTracingEnabled()) {
            Trace.beginSection("mbx: ".concat(str));
            try {
                return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            } finally {
                Trace.endSection();
            }
        }
        return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }
}
