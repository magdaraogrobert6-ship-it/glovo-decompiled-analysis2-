package bo.app;

import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class s5 {
    public final u5 a(hf hfVar) {
        if (hfVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(29), 7, (Object) null);
        }
        return new u5(t5.FLUSH_PENDING_BRAZE_EVENTS, null, hfVar, null, 10);
    }

    public static final String a() {
        return "There should be a session ID here";
    }
}
