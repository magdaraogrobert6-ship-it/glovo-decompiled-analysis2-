package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class i2 {
    public final z7 a;
    public final df b;
    public final fb c;
    public boolean d;

    public static final String c() {
        return "Publishing new messaging session event.";
    }

    public static final String d() {
        return "Messaging session not started.";
    }

    public final boolean a() {
        final long jS = this.b.s();
        if (jS == -1 || this.d) {
            return false;
        }
        Long l = this.c.readLong(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, -1L);
        final long jLongValue = l != null ? l.longValue() : -1L;
        final long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.i2$$ExternalSyntheticLambda2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return i2.a(jS, jNowInSeconds, jLongValue);
            }
        }, 7, (Object) null);
        return jLongValue + jS < jNowInSeconds;
    }

    public i2(Context context, z7 z7Var, df dfVar) {
        context.getClass();
        z7Var.getClass();
        dfVar.getClass();
        this.a = z7Var;
        this.b = dfVar;
        this.c = new fb(context);
    }

    public final void e() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i2$$ExternalSyntheticLambda3(jNowInSeconds, 0), 7, (Object) null);
        this.c.writeData(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, Long.valueOf(jNowInSeconds));
        this.d = false;
    }

    public final void b() {
        if (!a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(20), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(19), 7, (Object) null);
        this.a.b(gb.a, gb.class);
        this.d = true;
    }

    public static final String a(long j, long j2, long j3) {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Messaging session timeout: ", ", current diff: ");
        sbM.append(j2 - j3);
        return sbM.toString();
    }

    public static final String a(long j) {
        return af$$ExternalSyntheticOutline0.m(j, "Messaging session stopped. Adding new messaging session timestamp: ");
    }
}
