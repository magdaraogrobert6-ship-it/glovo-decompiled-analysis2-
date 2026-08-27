package bo.app;

import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class j9 {
    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("No RequestEndpointDestination found for name: ", str);
    }

    public final k9 a(String str) {
        str.getClass();
        try {
            return k9.valueOf(str);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 7), 4, (Object) null);
            return null;
        }
    }
}
