package bo.app;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlinx.coroutines.BuildersKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class q4 {
    public static final String m = BrazeLogger.getBrazeLogTag((Class<?>) q4.class);
    public final Context a;
    public final z7 b;
    public final j4 c;
    public final o4 d;
    public final m4 e;
    public lf f;
    public long g;
    public volatile boolean h;
    public final ConnectivityManager i;
    public kb j;
    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 k;
    public boolean l;

    public final void c() {
        synchronized (this) {
            if (this.h) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(5), 7, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(6), 7, (Object) null);
            if (Build.VERSION.SDK_INT >= 30) {
                ConnectivityManager connectivityManager = this.i;
                m4 m4Var = this.e;
                if (m4Var == null) {
                    removeNodeAtDepth.serializer("connectivityNetworkCallback");
                    throw null;
                }
                connectivityManager.registerDefaultNetworkCallback(m4Var);
                a(this.i.getNetworkCapabilities(this.i.getActiveNetwork()));
            } else {
                this.a.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
            b(this.g);
            this.h = true;
        }
    }

    public final void f() {
        synchronized (this) {
            if (!this.h) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(19), 7, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(20), 7, (Object) null);
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.k;
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
            }
            this.k = null;
            i();
            this.h = false;
        }
    }

    public static final String e() {
        return "Data sync started";
    }

    public static final String g() {
        return "The data sync policy is not running. Ignoring request.";
    }

    public static final String h() {
        return "Data sync stopped";
    }

    public static final String j() {
        return "Failed to unregister Connectivity callback";
    }

    public final void b() {
        long j;
        int intValue;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q4$$ExternalSyntheticLambda6(this, 0), 6, (Object) null);
        long j2 = this.g;
        if (this.f == lf.NO_SESSION || this.l) {
            this.g = -1L;
        } else {
            int iOrdinal = this.j.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    j4 j4Var = this.c;
                    j4Var.getClass();
                    i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = j4Var.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                } else if (iOrdinal == 2) {
                    j4 j4Var2 = this.c;
                    j4Var2.getClass();
                    i1 i1Var2 = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = j4Var2.getIntValue("com_braze_data_flush_interval_good_network", 30);
                } else {
                    if (iOrdinal != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    j4 j4Var3 = this.c;
                    j4Var3.getClass();
                    i1 i1Var3 = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
                    intValue = j4Var3.getIntValue("com_braze_data_flush_interval_great_network", 10);
                }
                j = ((long) intValue) * 1000;
            } else {
                j = -1;
            }
            this.g = j;
            if (j != -1 && j < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q4$$ExternalSyntheticLambda6(this, 2), 6, (Object) null);
                this.g = 1000L;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q4$$ExternalSyntheticLambda6(this, 3), 6, (Object) null);
        if (j2 != this.g) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q4$$ExternalSyntheticLambda9(j2, this, 0), 7, (Object) null);
            b(this.g);
        }
    }

    public q4(Context context, z7 z7Var, j4 j4Var) {
        context.getClass();
        z7Var.getClass();
        j4Var.getClass();
        this.a = context;
        this.b = z7Var;
        this.c = j4Var;
        this.f = lf.NO_SESSION;
        this.g = -1L;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.i = (ConnectivityManager) systemService;
        this.j = kb.GOOD;
        if (Build.VERSION.SDK_INT >= 30) {
            this.e = new m4(this);
        } else {
            this.d = new o4(this);
        }
        a(z7Var);
    }

    public static final String d(q4 q4Var) {
        return af$$ExternalSyntheticOutline0.m(q4Var.g, "currentIntervalMs: ");
    }

    public final void i() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                this.a.unregisterReceiver(this.d);
                return;
            }
            ConnectivityManager connectivityManager = this.i;
            m4 m4Var = this.e;
            if (m4Var != null) {
                connectivityManager.unregisterNetworkCallback(m4Var);
            } else {
                removeNodeAtDepth.serializer("connectivityNetworkCallback");
                throw null;
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(18), 4, (Object) null);
        }
    }

    public static final String d() {
        return "The data sync policy is already running. Ignoring request.";
    }

    public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 a(long j) {
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q4$$ExternalSyntheticLambda9(j, this, 1), 6, (Object) null);
            return BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new p4(this, j, null), 3);
        }
        Braze.Companion.getInstance(this.a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q4$$ExternalSyntheticLambda6(this, 1), 7, (Object) null);
        return null;
    }

    public static final String a(long j, q4 q4Var) {
        return c8$$ExternalSyntheticOutline0.m(q4Var.g, " ms", c8$$ExternalSyntheticOutline0.m(j, "Kicking off the Sync Job. initialDelaysMs: ", ": currentIntervalMs "));
    }

    public static final String a(q4 q4Var) {
        return m1$$ExternalSyntheticOutline0.m(q4Var.g, "Data flush interval is ", " ms. Not scheduling a proceeding data flush.");
    }

    public final void a(z7 z7Var, Exception exc) {
        try {
            z7Var.b(exc, Throwable.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(21), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to log throwable.";
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        kb kbVar = this.j;
        kb kbVarA = com.braze.support.b.a(networkCapabilities);
        this.j = kbVarA;
        if (kbVar != kbVarA) {
            this.b.b(new lb(kbVar, kbVarA), lb.class);
        }
        b();
    }

    public final void a(z7 z7Var) {
        z7Var.getClass();
        final int i = 0;
        z7Var.c(kf.class, new IEventSubscriber(this) { // from class: bo.app.q4$$ExternalSyntheticLambda1
            public final /* synthetic */ q4 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                q4 q4Var = this.f$0;
                if (i2 != 0) {
                    q4.a(q4Var, (mf) obj);
                } else {
                    q4.a(q4Var, (kf) obj);
                }
            }
        });
        final int i2 = 1;
        z7Var.c(mf.class, new IEventSubscriber(this) { // from class: bo.app.q4$$ExternalSyntheticLambda1
            public final /* synthetic */ q4 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i3 = i2;
                q4 q4Var = this.f$0;
                if (i3 != 0) {
                    q4.a(q4Var, (mf) obj);
                } else {
                    q4.a(q4Var, (kf) obj);
                }
            }
        });
    }

    public static final void a(q4 q4Var, kf kfVar) {
        kfVar.getClass();
        q4Var.f = lf.OPEN_SESSION;
        q4Var.b();
    }

    public static final void a(q4 q4Var, mf mfVar) {
        mfVar.getClass();
        q4Var.f = lf.NO_SESSION;
        q4Var.b();
    }

    public static final String c(long j) {
        return m1$$ExternalSyntheticOutline0.m(j, "Posting new sync runnable with delay ", " ms");
    }

    public static final String c(q4 q4Var) {
        return m1$$ExternalSyntheticOutline0.m(q4Var.g, "Flush interval was too low (", "), moving to minimum of 1000 ms");
    }

    public final void b(long j) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.k;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.k = null;
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i2$$ExternalSyntheticLambda3(j, 3), 7, (Object) null);
            this.k = a(j);
        }
    }

    public static final String b(q4 q4Var) {
        return "recalculateDispatchState called with session state: " + q4Var.f + " lastNetworkLevel: " + q4Var.j;
    }

    public static final String b(long j, q4 q4Var) {
        long j2 = q4Var.g;
        kb kbVar = q4Var.j;
        lf lfVar = q4Var.f;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Data flush interval has changed from ", " ms to ");
        sbM.append(j2);
        sbM.append(" ms after connectivity state change to: ");
        sbM.append(kbVar);
        sbM.append(" and session state: ");
        sbM.append(lfVar);
        return sbM.toString();
    }
}
