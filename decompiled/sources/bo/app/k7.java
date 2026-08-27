package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public abstract class k7 {
    public static final String j = BrazeLogger.getBrazeLogTag((Class<?>) k7.class);
    public final k9 a;
    public final w5 b;
    public long c;
    public long d;
    public final ArrayList e;
    public long f;
    public final long g;
    public final f8 h;
    public gg i;

    public abstract void a(long j2);

    public boolean c() {
        return false;
    }

    public final void a(long j2, rd rdVar) {
        rdVar.getClass();
        gg ggVarB = b();
        if (ggVarB == null) {
            return;
        }
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double dA = ggVarB.a(jNowInMillisecondsSystemClock);
        ggVarB.e = dA;
        eg egVar = ggVarB.c;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        egVar.writeData(dataStoreKey, Float.valueOf((float) dA));
        ggVarB.d = jNowInMillisecondsSystemClock;
        ggVarB.c.writeData(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(jNowInMillisecondsSystemClock));
        double d = ggVarB.e;
        if (d >= 1.0d) {
            double d2 = d - 1.0d;
            ggVarB.e = d2;
            ggVarB.c.writeData(dataStoreKey, Float.valueOf((float) d2));
        }
        gg ggVarB2 = b();
        if (ggVarB2 != null && ggVarB2.a(j2) < 1.0d) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new k7$$ExternalSyntheticLambda7(rdVar, j2, ggVarB.a(), ggVarB, 0), 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new k7$$ExternalSyntheticLambda1(this, j2, 2), 7, (Object) null);
    }

    public k7(k9 k9Var, w5 w5Var) {
        k9Var.getClass();
        w5Var.getClass();
        this.a = k9Var;
        this.b = w5Var;
        this.e = new ArrayList();
        int iOrdinal = k9Var.ordinal();
        this.g = iOrdinal != 0 ? iOrdinal != 2 ? 0L : 75L : 25L;
        this.h = new f8(w5Var.a.j.j(), f8.g, w5Var.a.j.k(), w5Var.a.j.l());
    }

    public final void b(final long j2) {
        final int i;
        a(j2);
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((rd) obj).d == sd.BATCHED) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                int i3 = ((rd) it.next()).h;
                loop1: while (true) {
                    i = i3;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop1;
                        }
                        i3 = ((rd) it.next()).h;
                        if (i < i3) {
                        }
                    }
                }
                ArrayList arrayList3 = this.e;
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    if (((rd) obj2).d.a()) {
                        arrayList4.add(obj2);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    final rd rdVar = (rd) arrayList4.get(i5);
                    rdVar.h = i;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.k7$$ExternalSyntheticLambda3
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            return k7.a(rdVar, j2, i);
                        }
                    }, 3, (Object) null);
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = this.e;
        ArrayList arrayList7 = new ArrayList();
        int size4 = arrayList6.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj3 = arrayList6.get(i6);
            i6++;
            sd sdVar = ((rd) obj3).d;
            if (sdVar == sd.BATCHED || sdVar == sd.COMPLETE) {
                arrayList7.add(obj3);
            }
        }
        arrayList5.addAll(arrayList7);
        ArrayList arrayList8 = this.e;
        ArrayList arrayList9 = new ArrayList();
        int size5 = arrayList8.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj4 = arrayList8.get(i7);
            i7++;
            rd rdVar2 = (rd) obj4;
            if (rdVar2.h >= 15 && rdVar2.d.a()) {
                arrayList9.add(obj4);
            }
        }
        arrayList5.addAll(arrayList9);
        int size6 = arrayList5.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj5 = arrayList5.get(i8);
            i8++;
            rd rdVar3 = (rd) obj5;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, c(), (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new k7$$ExternalSyntheticLambda4(rdVar3, j2, 0), 6, (Object) null);
            rdVar3.a.b(this.b.a.i);
        }
        this.e.removeAll(arrayList5);
    }

    public final void c(long j2) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((rd) obj).d.a()) {
                arrayList2.add(obj);
            }
        }
        List listSerializer = onContentCardDismissed.serializer(arrayList2, new j7());
        if (listSerializer.size() >= 2) {
            int size2 = listSerializer.size();
            for (int i2 = 1; i2 < size2; i2++) {
                rd rdVar = (rd) listSerializer.get(i2);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, c(), (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(17, rdVar), 6, (Object) null);
                rdVar.a(j2, sd.BATCHED);
            }
        }
    }

    public final String d(long j2) {
        String string;
        String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(this.e, "\n\n", null, null, new k7$$ExternalSyntheticLambda2(j2, 0), 30);
        k9 k9Var = this.a;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.f;
        long j6 = this.g;
        gg ggVar = this.i;
        if (ggVar == null || (string = ggVar.toString()) == null) {
            string = "unset";
        }
        StringBuilder sb = new StringBuilder("\n            |EndpointQueue: ");
        sb.append(k9Var);
        sb.append("\n            |   lastFailureAt = ");
        sb.append(j3 - j2);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, "\n            |   lastSuccessAt = ", j4 - j2, "\n            |   failureBackoffUntil = ");
        sb.append(j5 - j2);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, "\n            |   pendingWaitDuration = ", j6, "\n            |   endpointRateLimiter = ");
        sb.append(string);
        sb.append("\n            |   requestInfoQueue: \n            |");
        sb.append(strIconCompatParcelizer);
        sb.append("\n            ");
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString());
    }

    public static final String c(k7 k7Var, long j2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("New state after request error ", k7Var.d(j2));
    }

    public static final String d(k7 k7Var, long j2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("New state after request success\n", k7Var.d(j2));
    }

    public final void a(long j2, l9 l9Var) {
        l9Var.getClass();
        l9Var.a(this.b.a.i);
        this.e.add(new rd(l9Var, j2 + this.g, j2));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new k7$$ExternalSyntheticLambda1(this, j2, 1), 3, (Object) null);
    }

    public f8 a() {
        return this.h;
    }

    public static final String a(k7 k7Var, long j2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Added request now to queue ", k7Var.d(j2));
    }

    public static final String a(rd rdVar, long j2, int i) {
        return "Set retry count for " + rdVar.a(j2) + " to " + i;
    }

    public static final String a(rd rdVar, long j2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Marking request as framework complete \n", rdVar.a(j2));
    }

    public static final String a(rd rdVar, long j2, long j3, gg ggVar) {
        String strA = rdVar.a(j2);
        String dateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(j2 + j3, null, null, 3, null);
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Delaying next request after '", strA, j3, "' until next token is available in ");
        sbM.append("ms - '");
        sbM.append(dateFromMillis$default);
        sbM.append("'\n");
        sbM.append(ggVar);
        return sbM.toString();
    }

    public static final String a(rd rdVar) {
        return "About to batch request " + rdVar;
    }

    public void a(long j2, rd rdVar, j jVar) {
        rdVar.getClass();
        jVar.getClass();
        vb vbVar = jVar instanceof vb ? (vb) jVar : null;
        ba baVar = vbVar != null ? vbVar.d : null;
        Long l = jVar.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        this.c = j2;
        if (!(baVar instanceof yd)) {
            f8 f8VarA = a();
            this.f = jLongValue + j2 + ((long) f8VarA.a(f8VarA.b));
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, c(), (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new k7$$ExternalSyntheticLambda9(j2, 0, this), 6, (Object) null);
    }

    public void a(long j2, rd rdVar, vb vbVar) {
        rdVar.getClass();
        vbVar.getClass();
        a().f = 0;
        this.d = j2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, c(), (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new k7$$ExternalSyntheticLambda1(this, j2, 0), 6, (Object) null);
    }

    public final gg b() {
        Map mapY;
        df dfVar = this.b.a.j;
        ReentrantLock reentrantLock = dfVar.c;
        reentrantLock.lock();
        try {
            af afVar = dfVar.e;
            if (afVar == null || (mapY = afVar.F) == null) {
                mapY = dfVar.y();
            }
            reentrantLock.unlock();
            xe xeVar = (xe) mapY.get(this.a);
            if (xeVar == null) {
                this.i = null;
                return null;
            }
            gg ggVar = this.i;
            int i = xeVar.b;
            int i2 = xeVar.a;
            if (ggVar == null) {
                ggVar = new gg(i2, i, fg.a(this.b, "com.braze.endpointqueue.tokenbucket", String.valueOf(this.a.a.hashCode())));
            } else {
                ggVar.a(i2, i);
            }
            this.i = ggVar;
            return ggVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(k7 k7Var, long j2) {
        return k7Var.d(j2);
    }

    public static final CharSequence b(long j2, rd rdVar) {
        rdVar.getClass();
        return rdVar.a(j2);
    }
}
