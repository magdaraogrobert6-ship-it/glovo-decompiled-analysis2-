package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class sg {
    public final boolean a(da daVar, ah ahVar, long j, final long j2) {
        long j3;
        daVar.getClass();
        ahVar.getClass();
        if (daVar instanceof dg) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(7), 7, (Object) null);
            return true;
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        wd wdVar = ahVar.b;
        final long j4 = jNowInSeconds + ((long) wdVar.d);
        int i = wdVar.g;
        if (i != -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 5), 7, (Object) null);
            j3 = j + ((long) i);
        } else {
            j3 = j + j2;
        }
        final long j5 = j3;
        if (j4 >= j5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.sg$$ExternalSyntheticLambda2
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return sg.a(j4, j5);
                }
            }, 6, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.sg$$ExternalSyntheticLambda3
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return sg.a(j2, j5, j4);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
    }

    public static final String a(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Using override minimum display interval: ");
    }

    public static final String a(long j, long j2) {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Minimum time interval requirement met for matched trigger. Action display time: ", " . Next viable display time: ");
        sbM.append(j2);
        return sbM.toString();
    }

    public static final String a(long j, long j2, long j3) {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Minimum time interval requirement and triggered action override time interval requirement of ", " not met for matched trigger. Returning null. Next viable display time: ");
        sbM.append(j2);
        sbM.append(". Action display time: ");
        sbM.append(j3);
        return sbM.toString();
    }
}
