package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobSupport;
import o.ShortNewsContentCardViewViewHolder;
import o.getOpeningAnimation;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class qd {
    public static final String n = BrazeLogger.getBrazeLogTag((Class<?>) qd.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f21o = 3600000;
    public static final long p = 60000;
    public final w5 a;
    public final ld b;
    public final boolean c;
    public final boolean d;
    public final LinkedHashMap e;
    public getOpeningAnimation f;
    public final ReentrantLock g;
    public String h;
    public long i;
    public long j;
    public final AtomicInteger k;
    public final gg l;
    public kb m;

    public final void a(long j, k7 k7Var, rd rdVar) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, k7Var.c(), new k7$$ExternalSyntheticLambda4(j, rdVar), 3, (Object) null);
        if (!a(j)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(9), 7, (Object) null);
            return;
        }
        gg ggVarB = k7Var.b();
        if (ggVarB != null && ggVarB.a(j) < 1.0d) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(10), 7, (Object) null);
            gg ggVarB2 = k7Var.b();
            rdVar.b = (ggVarB2 != null ? ggVarB2.a() : 0L) + j;
            return;
        }
        l9 l9VarA = this.a.a(rdVar.a);
        od odVar = new od(this, rdVar, k7Var);
        rdVar.a(j, sd.IN_FLIGHT);
        gg ggVarB3 = k7Var.b();
        Integer numValueOf = null;
        Integer numValueOf2 = ggVarB3 == null ? null : Integer.valueOf((int) ggVarB3.a(j));
        if (numValueOf2 != null) {
            int iIntValue = numValueOf2.intValue() - 1;
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            numValueOf = Integer.valueOf(iIntValue);
        }
        rdVar.f = numValueOf;
        int iA = ((int) this.l.a(j)) - 1;
        rdVar.e = iA >= 0 ? iA : 0;
        if (a(j, l9VarA, rdVar, odVar)) {
            return;
        }
        a(j, rdVar);
        k7Var.a(j, rdVar);
    }

    public static final String c() {
        return "Skipping request sending due to lacking a global request rate limiting token.";
    }

    public static final String d() {
        return "Skipping request sending due to lacking an endpoint request rate limiting token.";
    }

    public static final String f() {
        return "Got call to shutdown request framework";
    }

    public static final String h() {
        return "Kicking off request framework.";
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(22), 14, (Object) null);
        ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = this.f;
        if (shortNewsContentCardViewViewHolder != null) {
            ((JobSupport) shortNewsContentCardViewViewHolder).write((CancellationException) null);
        }
        lh lhVar = this.a.a;
        r4 r4Var = new r4(lhVar.j, lhVar.b.getBaseUrlForRequests(), new tb(null, null, null));
        this.a.a((l9) r4Var);
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        a(jNowInMillisecondsSystemClock, r4Var, new rd(r4Var, jNowInMillisecondsSystemClock, jNowInMillisecondsSystemClock), new pd());
    }

    public qd(w5 w5Var, ld ldVar, boolean z, boolean z2) {
        w5Var.getClass();
        ldVar.getClass();
        this.a = w5Var;
        this.b = ldVar;
        this.c = z;
        this.d = z2;
        this.e = new LinkedHashMap();
        this.g = new ReentrantLock();
        this.i = -1L;
        this.j = -1L;
        final int i = 0;
        this.k = new AtomicInteger(0);
        this.l = new gg(w5Var.a.j.o(), w5Var.a.j.p(), fg.a(w5Var, "com.braze.requestframework.tokenbucket", ""));
        this.m = kb.GOOD;
        w5Var.a.i.c(u5.class, new IEventSubscriber(this) { // from class: bo.app.qd$$ExternalSyntheticLambda8
            public final /* synthetic */ qd f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                qd qdVar = this.f$0;
                if (i2 != 0) {
                    qd.a(qdVar, (lb) obj);
                } else {
                    qd.a(qdVar, (u5) obj);
                }
            }
        });
        final int i2 = 1;
        w5Var.a.i.c(lb.class, new IEventSubscriber(this) { // from class: bo.app.qd$$ExternalSyntheticLambda8
            public final /* synthetic */ qd f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i3 = i2;
                qd qdVar = this.f$0;
                if (i3 != 0) {
                    qd.a(qdVar, (lb) obj);
                } else {
                    qd.a(qdVar, (u5) obj);
                }
            }
        });
    }

    public final String b(long j) {
        LinkedHashMap linkedHashMap = this.e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((k7) ((Map.Entry) it.next()).getValue());
        }
        String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList, "\n\n", null, null, new k7$$ExternalSyntheticLambda2(j, 4), 30);
        boolean z = this.c;
        String str = this.h;
        long j2 = this.i;
        long j3 = this.j;
        int i = this.k.get();
        gg ggVar = this.l;
        kb kbVar = this.m;
        String strValueOf = String.valueOf(this.a.a.q.d.readData(DataStoreKey.SDK_AUTH, ""));
        StringBuilder sb = new StringBuilder("RequestFramework->\n            |mockAllNetworkRequests=");
        sb.append(z);
        sb.append("\n            |lastSdkAuthFailedToken=");
        sb.append(str);
        sb.append("\n            |lastSdkAuthFailureAt=");
        sb.append(j2 - j);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, "\n            |sdkAuthFailureBackoffUntil=", j3 - j, "\n            |invalidApiKeyErrorCounter=");
        sb.append(i);
        sb.append("\n            |globalRequestRateLimiter=");
        sb.append(ggVar);
        sb.append("\n            |lastNetworkLevel=");
        sb.append(kbVar);
        sb.append("\n            |currentSdkAuthToken=");
        sb.append(strValueOf);
        sb.append("\n            |endpointQueues=\n            | \n            |");
        sb.append(strIconCompatParcelizer);
        sb.append("\n            |  \n            |\n            ");
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString());
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(7), 7, (Object) null);
        a();
    }

    public final void a(long j, k7 k7Var) {
        k7Var.getClass();
        if (j <= k7Var.f) {
            return;
        }
        k7Var.b(j);
        ArrayList arrayList = k7Var.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            rd rdVar = (rd) obj;
            if (rdVar.d.a() && j >= rdVar.b) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            a(j, k7Var, (rd) obj2);
        }
    }

    public static final String b(long j, rd rdVar) {
        return "Running at " + j + " for request " + rdVar.a(j);
    }

    public static final String b(qd qdVar, long j) {
        return qdVar.b(j);
    }

    public static final String b() {
        return "Starting request sweeper job.";
    }

    public static final CharSequence b(long j, k7 k7Var) {
        k7Var.getClass();
        return k7Var.d(j);
    }

    public static final void a(qd qdVar, lb lbVar) {
        lbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o6$$ExternalSyntheticLambda20(lbVar, 1), 14, (Object) null);
        qdVar.m = lbVar.b;
    }

    public static final String a(lb lbVar) {
        return "Got network change event: " + lbVar;
    }

    public static void a(qd qdVar) {
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        ReentrantLock reentrantLock = qdVar.g;
        reentrantLock.lock();
        try {
            if ((!qdVar.d || qdVar.m != kb.NONE) && ((qdVar.h == null || jNowInMillisecondsSystemClock >= qdVar.j || !String.valueOf(qdVar.a.a.q.d.readData(DataStoreKey.SDK_AUTH, "")).equals(qdVar.h)) && qdVar.a(jNowInMillisecondsSystemClock))) {
                Iterator it = qdVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    qdVar.a(jNowInMillisecondsSystemClock, (k7) ((Map.Entry) it.next()).getValue());
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a() {
        getOpeningAnimation getopeninganimation = this.f;
        if (getopeninganimation == null || !getopeninganimation.I_()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(8), 6, (Object) null);
            DeferredCoroutine deferredCoroutineIconCompatParcelizer = BuildersKt.IconCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, CoroutineStart.LAZY, new nd(this, null), 1);
            this.f = deferredCoroutineIconCompatParcelizer;
            deferredCoroutineIconCompatParcelizer.MediaSessionCompatQueueItem();
        }
    }

    public static final void a(qd qdVar, u5 u5Var) {
        u5Var.getClass();
        t5 t5Var = u5Var.a;
        l9 l9Var = u5Var.d;
        ReentrantLock reentrantLock = qdVar.g;
        reentrantLock.lock();
        try {
            if (t5Var == t5.ADD_REQUEST && l9Var != null) {
                qdVar.a(l9Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean a(final long j, l9 l9Var, final rd rdVar, md mdVar) {
        aa aaVar;
        final boolean z = l9Var.c() || this.c;
        if (z) {
            aaVar = this.a.a.z;
        } else {
            aaVar = this.b;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.qd$$ExternalSyntheticLambda0
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return qd.a(z, rdVar, j);
            }
        }, 3, (Object) null);
        aaVar.a(rdVar, mdVar);
        return z;
    }

    public static final String a(boolean z, rd rdVar, long j) {
        return af$$ExternalSyntheticOutline0.m("Running on ", z ? "no-op" : "network", " executor for ", rdVar.a(j));
    }

    public final void a(l9 l9Var) {
        l9Var.getClass();
        k9 k9VarB = l9Var.b();
        k7 w3Var = (k7) this.e.get(k9VarB);
        if (w3Var == null) {
            int iOrdinal = k9VarB.ordinal();
            if (iOrdinal == 0) {
                w3Var = new w3(this.a);
            } else if (iOrdinal == 1) {
                w3Var = new j8(this.a);
            } else if (iOrdinal == 2) {
                w3Var = new l4(this.a);
            } else if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 8:
                        w3Var = new z(this.a);
                        break;
                    case 9:
                        w3Var = new ie(this.a);
                        break;
                    case 10:
                        w3Var = new le(this.a);
                        break;
                    case 11:
                        w3Var = new z5(this.a);
                        break;
                    default:
                        w3Var = new y4(k9VarB, this.a);
                        break;
                }
            } else {
                w3Var = new xf(this.a);
            }
            this.e.put(k9VarB, w3Var);
        }
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        w3Var.a(jNowInMillisecondsSystemClock, l9Var);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new qd$$ExternalSyntheticLambda3(this, jNowInMillisecondsSystemClock, 1), 3, (Object) null);
        a();
    }

    public static final String a(qd qdVar, long j) {
        return qdVar.b(j);
    }

    public final void a(long j, rd rdVar) {
        rdVar.getClass();
        gg ggVar = this.l;
        ggVar.getClass();
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double dA = ggVar.a(jNowInMillisecondsSystemClock);
        ggVar.e = dA;
        eg egVar = ggVar.c;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        egVar.writeData(dataStoreKey, Float.valueOf((float) dA));
        ggVar.d = jNowInMillisecondsSystemClock;
        ggVar.c.writeData(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(jNowInMillisecondsSystemClock));
        double d = ggVar.e;
        if (d >= 1.0d) {
            double d2 = d - 1.0d;
            ggVar.e = d2;
            ggVar.c.writeData(dataStoreKey, Float.valueOf((float) d2));
        }
        if (!a(j)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new k7$$ExternalSyntheticLambda7(rdVar, j, this.l.a(), this, 1), 7, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new qd$$ExternalSyntheticLambda3(this, j, 0), 3, (Object) null);
    }

    public static final String a(rd rdVar, long j, long j2, qd qdVar) {
        String strA = rdVar.a(j);
        String dateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(j + j2, null, null, 3, null);
        gg ggVar = qdVar.l;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Delaying next request after ", strA, j2, " until next token is available in ");
        sbM.append("ms - '");
        sbM.append(dateFromMillis$default);
        sbM.append("'\n");
        sbM.append(ggVar);
        return sbM.toString();
    }

    public final boolean a(long j) {
        return !this.a.a.j.M() || this.l.a(j) >= 1.0d;
    }
}
