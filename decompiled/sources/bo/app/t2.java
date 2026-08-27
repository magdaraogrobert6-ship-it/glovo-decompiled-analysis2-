package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class t2 {
    public static final String n = BrazeLogger.getBrazeLogTag((Class<?>) t2.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f24o = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    public static final long p = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    public final Context a;
    public final n7 b;
    public final z7 c;
    public final u9 d;
    public final AlarmManager e;
    public final boolean f;
    public final ReentrantLock g;
    public final String h;
    public final int i;
    public final r2 j;
    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 k;
    public hb l;
    public final LinkedHashMap m;

    public static final String k() {
        return "Getting the stored open session";
    }

    public static final String n() {
        return "Failed to unregister session seal receiver.";
    }

    public static final String q() {
        return "At least one session context is open. Calling startSession.";
    }

    public static final String r() {
        return "No session contexts are open. Calling stopSession.";
    }

    public final boolean g() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            j();
            hb hbVar = this.l;
            boolean z = true;
            if (hbVar == null || hbVar.d) {
                i();
                if (hbVar != null && hbVar.d) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda1(hbVar, 0), 7, (Object) null);
                    this.b.a(hbVar.a.b);
                }
            } else if (hbVar.c != null) {
                hbVar.c = null;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final hf h() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            j();
            hb hbVar = this.l;
            return hbVar != null ? hbVar.a : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i() {
        hb hbVar = new hb();
        this.l = hbVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda0(hbVar, 0), 6, (Object) null);
        this.c.b(new gf(hbVar), gf.class);
        ((z7) this.d).b(new SessionStateChangedEvent(hbVar.a.b, SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009d A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x0024, B:9:0x0034, B:10:0x0036, B:12:0x003a, B:14:0x0050, B:16:0x0054, B:18:0x006b, B:23:0x0083, B:25:0x009d, B:27:0x00a1, B:21:0x0079), top: B:33:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    public final void j() {
        hb hbVar;
        hf hfVar;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.l == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(20), 7, (Object) null);
                ff ffVarC = this.b.c();
                this.l = ffVarC != null ? new hb(ffVarC.a, ffVarC.b, ffVarC.c, ffVarC.d) : null;
            }
            hb hbVar2 = this.l;
            if (hbVar2 != null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda1(hbVar2, 1), 7, (Object) null);
                Double d = hbVar2.c;
                if (d != null && !hbVar2.d) {
                    double d2 = hbVar2.b;
                    double dDoubleValue = d.doubleValue();
                    int i = this.i;
                    boolean z = this.f;
                    long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    long millis = timeUnit.toMillis(i);
                    if (z) {
                        if (timeUnit.toMillis((long) d2) + millis + p <= jNowInMilliseconds) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda1(hbVar2, 2), 6, (Object) null);
                            l();
                            n7 n7Var = this.b;
                            hbVar = this.l;
                            if (hbVar != null) {
                                hfVar = hbVar.a;
                            } else {
                                hfVar = null;
                            }
                            n7Var.a(String.valueOf(hfVar));
                            this.l = null;
                        }
                    } else if (timeUnit.toMillis((long) dDoubleValue) + millis <= jNowInMilliseconds) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda1(hbVar2, 2), 6, (Object) null);
                        l();
                        n7 n7Var2 = this.b;
                        hbVar = this.l;
                        if (hbVar != null) {
                            hfVar = hbVar.a;
                        } else {
                            hfVar = null;
                        }
                        n7Var2.a(String.valueOf(hfVar));
                        this.l = null;
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void o() {
        hb hbVar;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (g() && (hbVar = this.l) != null) {
                this.b.a(hbVar);
            }
            this.k.write(null);
            b();
            this.c.b(kf.a, kf.class);
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda5(2, this), 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void p() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            g();
            hb hbVar = this.l;
            if (hbVar != null) {
                hbVar.c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.b.a(hbVar);
                this.k.write(null);
                this.k = BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new s2(this, null), 3);
                e();
                this.c.b(mf.a, mf.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda0(hbVar, 2), 7, (Object) null);
            }
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(22, this), 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public t2(Context context, n7 n7Var, z7 z7Var, u9 u9Var, AlarmManager alarmManager, int i, boolean z, df dfVar) {
        context.getClass();
        n7Var.getClass();
        z7Var.getClass();
        u9Var.getClass();
        alarmManager.getClass();
        dfVar.getClass();
        this.a = context;
        this.b = n7Var;
        this.c = z7Var;
        this.d = u9Var;
        this.e = alarmManager;
        this.f = z;
        this.g = new ReentrantLock();
        int iV = dfVar.v();
        Integer numValueOf = iV == -1 ? null : Integer.valueOf(iV);
        this.i = numValueOf != null ? Math.max(i, numValueOf.intValue()) : i;
        this.k = JobKt.RemoteActionCompatParcelizer();
        this.m = new LinkedHashMap();
        r2 r2Var = new r2(this);
        this.j = r2Var;
        String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(context.getPackageName(), ".intent.BRAZE_SESSION_SHOULD_SEAL");
        this.h = strRemoteActionCompatParcelizer;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(r2Var, new IntentFilter(strRemoteActionCompatParcelizer), 2);
            } else {
                context.registerReceiver(r2Var, new IntentFilter(strRemoteActionCompatParcelizer));
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda5(3, this), 4, (Object) null);
            this.j = null;
        }
    }

    public final void a(String str, boolean z) {
        str.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        int i = z ? 1 : -1;
        try {
            Object obj = this.m.get(str);
            int iIntValue = 0;
            if (obj == null) {
                obj = 0;
            }
            this.m.put(str, Integer.valueOf(((Number) obj).intValue() + i));
            Collection collectionValues = this.m.values();
            Collection collection = collectionValues;
            collectionValues.getClass();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                iIntValue += ((Number) it.next()).intValue();
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new cd$$ExternalSyntheticLambda0(iIntValue, this), 6, (Object) null);
            if (iIntValue > 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(16), 6, (Object) null);
                o();
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(17), 6, (Object) null);
                p();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(String str) {
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 10), 6, (Object) null);
            a(str, true);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(15), 6, (Object) null);
            a("$/! global session context sentinel", true);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda5(1, this), 6, (Object) null);
    }

    public final void e() {
        hb hbVar = this.l;
        if (hbVar != null) {
            int i = this.i;
            boolean z = this.f;
            long j = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(j);
            if (z) {
                millis = Math.max(p, (timeUnit.toMillis((long) hbVar.b) + millis) - DateTimeUtils.nowInMilliseconds());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda3(millis, 7), 7, (Object) null);
            try {
                Intent intent = new Intent(this.h);
                intent.putExtra("session_id", hbVar.toString());
                this.e.set(1, DateTimeUtils.nowInMilliseconds() + millis, PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(8), 4, (Object) null);
            }
        }
    }

    public final void l() {
        hb hbVar = this.l;
        if (hbVar != null) {
            ReentrantLock reentrantLock = this.g;
            reentrantLock.lock();
            try {
                hbVar.d = true;
                hbVar.c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.b.a(hbVar);
                this.c.b(new jf(hbVar), jf.class);
                ((z7) this.d).b(new SessionStateChangedEvent(hbVar.a.b, SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda0(hbVar, 1), 6, (Object) null);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void m() {
        try {
            r2 r2Var = this.j;
            if (r2Var != null) {
                this.a.unregisterReceiver(r2Var);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(9), 4, (Object) null);
        }
    }

    public static final String d(hb hbVar) {
        return "Session [" + hbVar.a + "] being sealed because its end time is over the grace period. Session: " + hbVar;
    }

    public static final String f(hb hbVar) {
        return "Closed session with id " + hbVar.a;
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(18), 7, (Object) null);
        try {
            Intent intent = new Intent(this.h);
            intent.putExtra("session_id", String.valueOf(this.l));
            this.e.cancel(PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(19), 4, (Object) null);
        }
    }

    public static final String f() {
        return "Failed to create session seal alarm";
    }

    public static final String d(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Attempting to open session with context: ", str);
    }

    public static final String d(t2 t2Var) {
        return "Completed the startSession call. Current session: " + t2Var.h();
    }

    public static final String d() {
        return "Failed to cancel session seal alarm";
    }

    public static final String c(hb hbVar) {
        return "Checking if this session needs to be sealed: " + hbVar.a;
    }

    public static final String c(t2 t2Var) {
        return "Completed the attemptToOpenSession call. Current session: " + t2Var.h();
    }

    public static final String c() {
        return "Cancelling session seal alarm";
    }

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Attempting to close session with context: ", str);
    }

    public static final String b(t2 t2Var) {
        return "Completed the attemptToCloseSession call. Current session: " + t2Var.h();
    }

    public static final String b(hb hbVar) {
        return "New session created with ID: " + hbVar.a;
    }

    public static final String e(t2 t2Var) {
        return "Completed the stopSession call. Current session: " + t2Var.h();
    }

    public static final String e(hb hbVar) {
        return "Sealed session with id " + hbVar.a;
    }

    public static final String a(t2 t2Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to register dynamic receiver for ", t2Var.h);
    }

    public static final String a() {
        return "Opening a session with a global context identifier.";
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 11), 6, (Object) null);
        a(str, false);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t2$$ExternalSyntheticLambda5(0, this), 6, (Object) null);
    }

    public static final String a(hb hbVar) {
        return "Clearing completely dispatched sealed session " + hbVar.a;
    }

    public static final String a(int i, t2 t2Var) {
        return "Session context identifier map updated. sum: " + i + " map: " + t2Var.m;
    }

    public static final String a(long j) {
        return m1$$ExternalSyntheticOutline0.m(j, "Creating a session seal alarm with a delay of ", " ms");
    }
}
