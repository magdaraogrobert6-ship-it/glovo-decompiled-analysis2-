package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.locks.ReentrantLock;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class od implements md {
    public final /* synthetic */ qd a;
    public final /* synthetic */ rd b;
    public final /* synthetic */ k7 c;

    public od(qd qdVar, rd rdVar, k7 k7Var) {
        this.a = qdVar;
        this.b = rdVar;
        this.c = k7Var;
    }

    @Override // bo.app.md
    public final void a(j jVar) {
        jVar.getClass();
        qd qdVar = this.a;
        ReentrantLock reentrantLock = qdVar.g;
        rd rdVar = this.b;
        k7 k7Var = this.c;
        reentrantLock.lock();
        try {
            long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            vb vbVar = jVar instanceof vb ? (vb) jVar : null;
            ba baVar = vbVar != null ? vbVar.d : null;
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, qd.n, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q$$ExternalSyntheticLambda1(rdVar, jNowInMillisecondsSystemClock, baVar, 1), 14, (Object) null);
            rdVar.a(jNowInMillisecondsSystemClock, sd.PENDING_RETRY);
            k7Var.a(jNowInMillisecondsSystemClock, rdVar, jVar);
            if (baVar instanceof yd) {
                qdVar.i = jNowInMillisecondsSystemClock;
                qdVar.h = ((l2) ((yd) baVar).a).k;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q$$ExternalSyntheticLambda1(qdVar, rdVar, jNowInMillisecondsSystemClock, 2), 7, (Object) null);
                qdVar.j = jNowInMillisecondsSystemClock + qd.f21o;
            }
            if (baVar instanceof ab) {
                qdVar.k.incrementAndGet();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(18, qdVar), 7, (Object) null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(qd qdVar) {
        return c8$$ExternalSyntheticOutline0.m(qdVar.k.get(), "Incremented invalidApiKeyErrorCounter to ");
    }

    @Override // bo.app.md
    public final void a(vb vbVar) {
        vbVar.getClass();
        ReentrantLock reentrantLock = this.a.g;
        rd rdVar = this.b;
        k7 k7Var = this.c;
        reentrantLock.lock();
        try {
            long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, qd.n, (BrazeLogger.Priority) null, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new k7$$ExternalSyntheticLambda4(rdVar, jNowInMillisecondsSystemClock, 1), 6, (Object) null);
            rdVar.a(jNowInMillisecondsSystemClock, sd.COMPLETE);
            k7Var.a(jNowInMillisecondsSystemClock, rdVar, vbVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(rd rdVar, long j) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Request success received for ", rdVar.a(j));
    }

    public static final String a(qd qdVar, rd rdVar, long j) {
        return af$$ExternalSyntheticOutline0.m("Got failed token ", qdVar.h, " for\n ", rdVar.a(j));
    }

    public static final String a(rd rdVar, long j, ba baVar) {
        return "Request failure received " + rdVar.a(j) + " \n" + baVar;
    }
}
