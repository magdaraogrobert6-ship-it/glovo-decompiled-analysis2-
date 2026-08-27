package androidx.compose.ui.util;

import android.os.Build;
import android.os.Trace;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Trace.beginSection(str);
        try {
            return (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final void traceValue(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }
}
