package bo.app;

import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class o6 {
    public static final long i = 3000;
    public final df a;
    public final z7 b;
    public final w6 c;
    public final f8 d;
    public final com.braze.storage.d e;
    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 f;
    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 g;
    public int h;

    public static final String d() {
        return "Cancelling ending of DUST subscription on delay and resuming stream";
    }

    public static final String e() {
        return "Ending DUST subscription on a delay";
    }

    public static final String f() {
        return "Received dust config. Starting/resuming a new subscription";
    }

    public static final String h() {
        return "Connection attempt succeeded. Resetting attempts to 0";
    }

    public static final String j() {
        return "Max reconnect attempts (10) exceeded after 401. Not requesting a new DUST config.";
    }

    public static final String k() {
        return "Evicting cached DUST auth after 401 and requesting a new config.";
    }

    public static final String l() {
        return "Max reconnect attempts reached. Not starting DUST subscription.";
    }

    public o6(Context context, String str, String str2, df dfVar, z7 z7Var, w6 w6Var, f8 f8Var) {
        context.getClass();
        str2.getClass();
        dfVar.getClass();
        z7Var.getClass();
        w6Var.getClass();
        f8Var.getClass();
        this.a = dfVar;
        this.b = z7Var;
        this.c = w6Var;
        this.d = f8Var;
        this.e = new com.braze.storage.d(context, str, str2);
        final int i2 = 0;
        z7Var.c(kf.class, new IEventSubscriber(this) { // from class: bo.app.o6$$ExternalSyntheticLambda4
            public final /* synthetic */ o6 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i3 = i2;
                o6 o6Var = this.f$0;
                if (i3 == 0) {
                    o6.a(o6Var, (kf) obj);
                    return;
                }
                if (i3 == 1) {
                    o6.a(o6Var, (mf) obj);
                } else if (i3 != 2) {
                    o6.a(o6Var, (a6) obj);
                } else {
                    o6.a(o6Var, (lb) obj);
                }
            }
        });
        final int i3 = 1;
        z7Var.c(mf.class, new IEventSubscriber(this) { // from class: bo.app.o6$$ExternalSyntheticLambda4
            public final /* synthetic */ o6 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i4 = i3;
                o6 o6Var = this.f$0;
                if (i4 == 0) {
                    o6.a(o6Var, (kf) obj);
                    return;
                }
                if (i4 == 1) {
                    o6.a(o6Var, (mf) obj);
                } else if (i4 != 2) {
                    o6.a(o6Var, (a6) obj);
                } else {
                    o6.a(o6Var, (lb) obj);
                }
            }
        });
        final int i4 = 2;
        z7Var.c(lb.class, new IEventSubscriber(this) { // from class: bo.app.o6$$ExternalSyntheticLambda4
            public final /* synthetic */ o6 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i5 = i4;
                o6 o6Var = this.f$0;
                if (i5 == 0) {
                    o6.a(o6Var, (kf) obj);
                    return;
                }
                if (i5 == 1) {
                    o6.a(o6Var, (mf) obj);
                } else if (i5 != 2) {
                    o6.a(o6Var, (a6) obj);
                } else {
                    o6.a(o6Var, (lb) obj);
                }
            }
        });
        final int i5 = 3;
        z7Var.c(a6.class, new IEventSubscriber(this) { // from class: bo.app.o6$$ExternalSyntheticLambda4
            public final /* synthetic */ o6 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i6 = i5;
                o6 o6Var = this.f$0;
                if (i6 == 0) {
                    o6.a(o6Var, (kf) obj);
                    return;
                }
                if (i6 == 1) {
                    o6.a(o6Var, (mf) obj);
                } else if (i6 != 2) {
                    o6.a(o6Var, (a6) obj);
                } else {
                    o6.a(o6Var, (lb) obj);
                }
            }
        });
    }

    public static final String c(Integer num) {
        return "Not scheduling dust reconnect for non-retriable response code: " + num;
    }

    public final void a(boolean z) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.g;
        String str = null;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        if (this.h > 10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(1), 7, (Object) null);
            return;
        }
        String string = this.e.readString(DataStoreKey.MITE_KEY, "");
        if (string == null || string.length() == 0) {
            string = null;
        }
        String string2 = this.e.readString(DataStoreKey.DUST_HOST, "");
        if (string2 == null || string2.length() == 0) {
            string2 = null;
        }
        String string3 = this.e.readString(DataStoreKey.DUST_AUTH, "");
        if (string3 == null || string3.length() == 0) {
            string3 = null;
        }
        String string4 = this.e.readString(DataStoreKey.DUST_RCS, "");
        if (string4 != null && string4.length() != 0) {
            str = string4;
        }
        if (string == null || string2 == null || string3 == null || !this.a.H()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o2$$ExternalSyntheticLambda3(string, string2, string3, this), 7, (Object) null);
            return;
        }
        String strA = i6.a(string2, string, string3, str, this.h);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o6$$ExternalSyntheticLambda15(string, strA, z), 7, (Object) null);
        this.c.a(strA, new l6(this), new m6(this), new n6(this), z);
    }

    public final void b(long j) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.g;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i2$$ExternalSyntheticLambda3(j, 1), 6, (Object) null);
        this.g = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(j), null, new k6(this, j, null), 2, null);
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(29), 7, (Object) null);
        this.h = 0;
        this.d.f = 0;
    }

    public final void i() {
        if (this.h > 10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(6), 6, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(8), 7, (Object) null);
        this.e.writeData(DataStoreKey.DUST_AUTH, "");
        this.e.writeData(DataStoreKey.DUST_AUTH_EXPIRATION_SECONDS, -1L);
        this.b.b(new b6(), b6.class);
    }

    public static final String c(long j) {
        return m1$$ExternalSyntheticOutline0.m(j, "Scheduling stream reconnection in ", " ms");
    }

    public static final String c() {
        return "Saving rcs value from TTL message";
    }

    public static final String b(s9 s9Var) {
        return "Ingesting DUST message of type " + s9Var.a() + "\n" + s9Var;
    }

    public static final String b() {
        return "Ending DUST subscription";
    }

    public static final String b(Integer num) {
        return "Received " + num + " from DUST stream. Requesting a new DUST config.";
    }

    public final void a(x6 x6Var) {
        if (x6Var == null) {
            return;
        }
        String str = x6Var.b;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(2), 7, (Object) null);
            this.e.writeData(DataStoreKey.DUST_RCS, str);
        }
        Long l = x6Var.a;
        if (l != null) {
            long jLongValue = l.longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i2$$ExternalSyntheticLambda3(jLongValue, 2), 7, (Object) null);
            b(jLongValue);
        }
    }

    public static final String a(a6 a6Var) {
        String str = a6Var.a;
        String str2 = a6Var.b;
        Long l = a6Var.d;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Setting dust config: mite=", str, ", host=", str2, ", expirationSeconds=");
        sbM.append(l);
        return sbM.toString();
    }

    public static final void a(o6 o6Var, kf kfVar) {
        kfVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(3), 7, (Object) null);
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = o6Var.f;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        o6Var.a(true);
    }

    public static final void a(o6 o6Var, mf mfVar) {
        mfVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(9), 7, (Object) null);
        o6Var.f = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(i), null, new h6(o6Var, null), 2, null);
    }

    public static final void a(o6 o6Var, lb lbVar) {
        lbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o6$$ExternalSyntheticLambda20(lbVar, 0), 7, (Object) null);
        kb kbVar = lbVar.b;
        kb kbVar2 = kb.NONE;
        if (kbVar == kbVar2) {
            o6Var.a();
        } else if (lbVar.a == kbVar2) {
            o6Var.a(true);
        }
    }

    public static final String a(lb lbVar) {
        return "Got network change event: " + lbVar;
    }

    public static final void a(o6 o6Var, a6 a6Var) {
        a6Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) o6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(10), 7, (Object) null);
        com.braze.storage.d dVar = o6Var.e;
        DataStoreKey dataStoreKey = DataStoreKey.MITE_KEY;
        String string = dVar.readString(dataStoreKey, "");
        if (string == null || string.length() == 0) {
            string = null;
        }
        String str = string;
        BrazeLogger.brazelog$default(brazeLogger, (Object) o6Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(17, a6Var), 7, (Object) null);
        String str2 = a6Var.a;
        if (str2 != null) {
            o6Var.e.writeData(dataStoreKey, str2);
        }
        String str3 = a6Var.b;
        if (str3 != null) {
            o6Var.e.writeData(DataStoreKey.DUST_HOST, str3);
        }
        String str4 = a6Var.c;
        if (str4 != null) {
            o6Var.e.writeData(DataStoreKey.DUST_AUTH, str4);
        }
        Long l = a6Var.d;
        if (l != null) {
            o6Var.e.writeData(DataStoreKey.DUST_AUTH_EXPIRATION_SECONDS, l);
        }
        Object[] objArr = {str, a6Var.a};
        o6Var.a(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue());
    }

    public final void a(f6 f6Var) {
        if (f6Var == null) {
            return;
        }
        String str = f6Var.b;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 16), 6, (Object) null);
        }
        this.c.b();
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.g;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        long j = f6Var.a;
        f8 f8Var = this.d;
        this.g = BrazeCoroutineScope.launchDelayed$default(brazeCoroutineScope, Long.valueOf(j + ((long) f8Var.a(f8Var.b))), null, new j6(this, null), 2, null);
    }

    public static final String a(String str, String str2, String str3, o6 o6Var) {
        boolean z = str3 != null;
        boolean zH = o6Var.a.H();
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Cannot start dust subscription: mite=", str, ", host=", str2, ", auth=");
        sbM.append(z);
        sbM.append(", enabled=");
        sbM.append(zH);
        return sbM.toString();
    }

    public static final String a(boolean z, String str, String str2) {
        return "Starting (resume = " + z + ") DUST subscription for mite: " + str + " to url: " + str2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(7), 7, (Object) null);
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.g;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.g = null;
        this.c.b();
    }

    public final void a(s9 s9Var) {
        s9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(19, s9Var), 7, (Object) null);
        r9 r9VarA = s9Var.a();
        int iOrdinal = r9VarA.ordinal();
        if (iOrdinal == 1) {
            z7 z7Var = this.b;
            m2 m2Var = m2.SESSION_START;
            z7Var.b(new v3(), v3.class);
            return;
        }
        if (iOrdinal == 2) {
            a(s9Var instanceof x6 ? (x6) s9Var : null);
            return;
        }
        if (iOrdinal == 3) {
            a(s9Var instanceof f6 ? (f6) s9Var : null);
            return;
        }
        if (iOrdinal == 4) {
            z7 z7Var2 = this.b;
            m2 m2Var2 = m2.SESSION_START;
            z7Var2.b(new i8(), i8.class);
        } else if (iOrdinal != 5) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(20, r9VarA), 6, (Object) null);
        } else {
            this.c.c();
        }
    }

    public static final String a(r9 r9Var) {
        return "Lacked logic to ingest message! Type: " + r9Var;
    }

    public static final String a(long j) {
        return m1$$ExternalSyntheticOutline0.m(j, "Scheduling reconnection in ", "ms");
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Received disconnect and retry request. Reason: ", str);
    }

    public final void a(Integer num) {
        this.h++;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(this, 10, num), 7, (Object) null);
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.g;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        if (num != null && num.intValue() == 401) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o6$$ExternalSyntheticLambda9(num, 0), 7, (Object) null);
            i();
            return;
        }
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = w6.f;
        if (num != null && ensuresubscribedtoinappmessageeventslambda7.serializer(num.intValue())) {
            f8 f8Var = this.d;
            b(f8Var.a(f8Var.b));
        } else {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = w6.e;
            if (num != null) {
                ensuresubscribedtoinappmessageeventslambda8.getClass();
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o6$$ExternalSyntheticLambda9(num, 1), 7, (Object) null);
        }
    }

    public static final String a(o6 o6Var, Integer num) {
        return "Connection attempt failed. Attempts now at: " + o6Var.h + ". Response code: " + num;
    }
}
