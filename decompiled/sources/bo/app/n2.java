package bo.app;

import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2 {
    public static void a(Object obj, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        try {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, obj, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n2$$ExternalSyntheticLambda0(0, obj), 4, (Object) null);
        }
    }

    public static final String a(Object obj) {
        return m1$$ExternalSyntheticOutline0.m(obj, "Encountered exception while parsing server response for ");
    }
}
