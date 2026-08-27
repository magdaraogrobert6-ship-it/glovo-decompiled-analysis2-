package bo.app;

import com.braze.support.BrazeLogger;
import o.isCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class rd {
    public final l9 a;
    public long b;
    public final long c;
    public sd d;
    public int e;
    public Integer f;
    public long g;
    public int h;

    public rd(l9 l9Var, long j, long j2) {
        sd sdVar = sd.PENDING_START;
        l9Var.getClass();
        sdVar.getClass();
        this.a = l9Var;
        this.b = j;
        this.c = j2;
        this.d = sdVar;
        this.e = 0;
        this.f = null;
        this.g = j2;
    }

    public final String a(long j) {
        int iHashCode = this.a.hashCode();
        td tdVarE = ((l2) this.a).e();
        long j2 = this.b;
        long j3 = this.c;
        sd sdVar = this.d;
        long j4 = this.g;
        int i = this.h;
        StringBuilder sb = new StringBuilder("\n            |RequestInfo for ");
        sb.append(iHashCode);
        sb.append(" \n            | at ");
        sb.append(j);
        sb.append("\n            | request.target = ");
        sb.append(tdVarE);
        sb.append("\n            | nextAdvance = ");
        sb.append(j2 - j);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, "\n            | createdAt = ", j3 - j, "\n            | state = ");
        sb.append(sdVar);
        sb.append("\n            | lastStateMovedAt = ");
        sb.append(j4 - j);
        sb.append("\n            | timesMovedToRetry = ");
        sb.append(i);
        sb.append("\n        ");
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString());
    }

    public static final String a(rd rdVar, sd sdVar, long j) {
        return "Moving from " + rdVar.d + " -> " + sdVar + " with time " + j + " for \n" + rdVar.a(j);
    }

    public static final String a(rd rdVar, long j) {
        return "Moving to pending retry.Updated retry count: " + rdVar.h + " for: \n" + rdVar.a(j);
    }

    public final void a(final long j, final sd sdVar) {
        sdVar.getClass();
        if (this.d != sdVar) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.rd$$ExternalSyntheticLambda0
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return rd.a(this.f$0, sdVar, j);
                }
            }, 2, (Object) null);
            this.g = j;
            this.d = sdVar;
            if (sdVar == sd.PENDING_RETRY) {
                this.h++;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new k7$$ExternalSyntheticLambda4(this, j, 3), 2, (Object) null);
            }
        }
    }
}
