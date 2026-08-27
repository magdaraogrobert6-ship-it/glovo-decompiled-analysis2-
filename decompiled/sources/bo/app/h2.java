package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.sqlite.SQLite;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda2;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements i9 {
    public static final String[] v = {"android.os.deadsystemexception"};
    public final Context a;
    public final String b;
    public final t2 c;
    public final z7 d;
    public final BrazeConfigurationProvider e;
    public final df f;
    public final c8 g;
    public final i2 h;
    public final qe i;
    public final zc j;
    public final qc k;
    public final vc l;
    public final a5 m;
    public final o6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f18o;
    public final AtomicInteger p;
    public final ReentrantLock q;
    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 r;
    public final u7 s;
    public volatile String t;
    public final AtomicBoolean u;

    public static final String c(h2 h2Var) {
        return "SDK delayed initialization mode: " + h2Var.m.c() + " and GDPR disabled mode: " + h2Var.i.a() + ". Not closing session.";
    }

    public static final String e(h2 h2Var) {
        return "SDK delayed initialization mode: " + h2Var.m.c() + " and GDPR disabled mode: " + h2Var.i.a() + ". Not opening session.";
    }

    public static final String f(h2 h2Var) {
        return "SDK delayed initialization mode: " + h2Var.m.c() + " and GDPR disabled mode: " + h2Var.i.a() + ". Not opening session.";
    }

    public static final String h() {
        return "Failed to log error.";
    }

    public static final String i() {
        return "Publishing an internal push body clicked event for any awaiting triggers.";
    }

    public static final String j() {
        return "Adding push click to dispatcher pending list";
    }

    public static final String k() {
        return "Session in background, data syncing event on delay";
    }

    public static final String l() {
        return "Logging push max campaign";
    }

    public static final String n() {
        return "Flushing Push Delivery Events now";
    }

    public static final String o() {
        return "Attempted to flush Push Delivery events, but no events are available";
    }

    public static final String p() {
        return "Posting geofence report for geofence event.";
    }

    public static final String q() {
        return "Posting banners refresh request.";
    }

    public static final String r() {
        return "Posting feature flags refresh request.";
    }

    public static final String s() {
        return "Disallowing Content Cards sync due to Content Cards not being enabled.";
    }

    public static final String u() {
        return "Requesting DUST config";
    }

    public static final String v() {
        return "Posting geofence request for location.";
    }

    public static final String x() {
        return "Sending Push Max data";
    }

    public static final String y() {
        return "Posting SDK Debugger Logs request.";
    }

    public final boolean a(g9 g9Var) {
        boolean z;
        e8 e8Var;
        g9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda4(g9Var, 1), 6, (Object) null);
        int i = 2;
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(this, i, g9Var), 6, (Object) null);
            return false;
        }
        if (!this.s.a(g9Var)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda4(g9Var, 2), 6, (Object) null);
            return false;
        }
        t2 t2Var = this.c;
        ReentrantLock reentrantLock = t2Var.g;
        reentrantLock.lock();
        try {
            hb hbVar = t2Var.l;
            boolean z2 = hbVar != null && hbVar.d;
            reentrantLock.unlock();
            if (z2 || this.c.h() == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda4(g9Var, 3), 7, (Object) null);
                z = true;
            } else {
                ((n1) g9Var).a(this.c.h());
                z = false;
            }
            if (this.b.length() == 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda4(g9Var, 4), 7, (Object) null);
            } else {
                n1 n1Var = (n1) g9Var;
                n1Var.e.setValue(n1Var, n1.h[0], this.b);
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda4(g9Var, 5), 6, (Object) null);
            n1 n1Var2 = (n1) g9Var;
            e8 e8Var2 = n1Var2.a;
            e8 e8Var3 = e8.PUSH_CLICKED;
            if (e8Var2 == e8Var3) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(18), 7, (Object) null);
                kc kcVar = (kc) g9Var;
                String strOptString = kcVar.b.optString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, "");
                z7 z7Var = this.d;
                strOptString.getClass();
                z7Var.b(new og(strOptString, kcVar), og.class);
            }
            if (n1Var2.a != e8.INTERNAL_ERROR || !n1Var2.b.optBoolean("nop", false)) {
                this.g.a(g9Var);
            }
            if (z && ((e8Var = n1Var2.a) != e8.PUSH_ACTION_BUTTON_CLICKED ? e8Var == e8Var3 || e8Var == e8.PUSH_STORY_PAGE_CLICK : (!((hc) g9Var).i))) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(19), 7, (Object) null);
                this.d.b(new u5(t5.ADD_PENDING_BRAZE_EVENT, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{g9Var}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), null, null, 12), u5.class);
            } else {
                this.d.b(new u5(t5.ADD_BRAZE_EVENTS, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{g9Var}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), null, null, 12), u5.class);
            }
            if (n1Var2.a == e8.SESSION_START) {
                z7 z7Var2 = this.d;
                s5 s5Var = u5.e;
                za zaVar = n1Var2.f;
                registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2 = n1.h[1];
                zaVar.getClass();
                registerinappmessagemanagerlambda2.getClass();
                z7Var2.b(s5Var.a((hf) zaVar.a), u5.class);
            }
            if (!z) {
                return true;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(20), 6, (Object) null);
            this.r.write(null);
            this.r = BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new g2(this, null), 3);
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d() {
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda12(this, 1), 6, (Object) null);
        } else {
            this.c.l();
        }
    }

    public final void m() {
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda12(this, 2), 6, (Object) null);
        } else {
            this.c.c((String) null);
        }
    }

    public final void t() {
        if (this.f.H()) {
            Long l = null;
            Long l2 = this.n.e.readLong(DataStoreKey.DUST_AUTH_EXPIRATION_SECONDS, null);
            if (l2 != null && l2.longValue() > 0) {
                l = l2;
            }
            if (l != null && l.longValue() > DateTimeUtils.nowInSeconds()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda1(this, 0), 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(14), 6, (Object) null);
                a(new c6(this.f, this.e.getBaseUrlForRequests(), this.b));
            }
        }
    }

    public final void w() {
        List listPlaybackStateCompat;
        if (this.f.N()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(22), 7, (Object) null);
            df dfVar = this.f;
            String baseUrlForRequests = this.e.getBaseUrlForRequests();
            String str = this.b;
            zc zcVar = this.j;
            Object data = zcVar.b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            data.getClass();
            long jLongValue = ((Long) data).longValue();
            long jW = zcVar.a.w();
            List listA = zcVar.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (((xc) obj).b > jLongValue - jW) {
                    arrayList.add(obj);
                }
            }
            List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(arrayList);
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listPlaybackStateCompat2, 10));
            Iterator it = listPlaybackStateCompat2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((xc) it.next()).a);
            }
            Object data2 = this.j.b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            data2.getClass();
            long jLongValue2 = ((Long) data2).longValue();
            vc vcVar = this.l;
            long jX = this.f.x();
            if (jX <= 0) {
                listPlaybackStateCompat = instance_delegatelambda0.write;
            } else {
                long jNowInSeconds = DateTimeUtils.nowInSeconds();
                Map mapA = vcVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapA.entrySet()) {
                    if (((Number) entry.getValue()).longValue() >= jNowInSeconds - jX) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(linkedHashMap.keySet());
            }
            a(new bd(dfVar, baseUrlForRequests, str, arrayList2, jLongValue2, listPlaybackStateCompat));
        }
    }

    public h2(Context context, String str, String str2, t2 t2Var, z7 z7Var, BrazeConfigurationProvider brazeConfigurationProvider, df dfVar, c8 c8Var, i2 i2Var, qe qeVar, zc zcVar, qc qcVar, vc vcVar, a5 a5Var, o6 o6Var) {
        context.getClass();
        str2.getClass();
        t2Var.getClass();
        z7Var.getClass();
        brazeConfigurationProvider.getClass();
        dfVar.getClass();
        c8Var.getClass();
        i2Var.getClass();
        qeVar.getClass();
        zcVar.getClass();
        qcVar.getClass();
        vcVar.getClass();
        a5Var.getClass();
        o6Var.getClass();
        this.a = context;
        this.b = str;
        this.c = t2Var;
        this.d = z7Var;
        this.e = brazeConfigurationProvider;
        this.f = dfVar;
        this.g = c8Var;
        this.h = i2Var;
        this.i = qeVar;
        this.j = zcVar;
        this.k = qcVar;
        this.l = vcVar;
        this.m = a5Var;
        this.n = o6Var;
        final int i = 0;
        this.f18o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new ReentrantLock();
        this.r = JobKt.RemoteActionCompatParcelizer();
        this.s = new u7(context, str, str2);
        this.t = "";
        this.u = new AtomicBoolean(false);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(15), 6, (Object) null);
        z7Var.c(xd.class, new IEventSubscriber(this) { // from class: bo.app.h2$$ExternalSyntheticLambda8
            public final /* synthetic */ h2 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                h2 h2Var = this.f$0;
                if (i2 == 0) {
                    h2.a(h2Var, (xd) obj);
                    return;
                }
                if (i2 == 1) {
                    h2.a(h2Var, (oe) obj);
                } else if (i2 != 2) {
                    h2.a(h2Var, (ke) obj);
                } else {
                    h2.a(h2Var, (b6) obj);
                }
            }
        });
        final int i2 = 3;
        z7Var.c(ke.class, new IEventSubscriber(this) { // from class: bo.app.h2$$ExternalSyntheticLambda8
            public final /* synthetic */ h2 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i3 = i2;
                h2 h2Var = this.f$0;
                if (i3 == 0) {
                    h2.a(h2Var, (xd) obj);
                    return;
                }
                if (i3 == 1) {
                    h2.a(h2Var, (oe) obj);
                } else if (i3 != 2) {
                    h2.a(h2Var, (ke) obj);
                } else {
                    h2.a(h2Var, (b6) obj);
                }
            }
        });
        final int i3 = 1;
        z7Var.c(oe.class, new IEventSubscriber(this) { // from class: bo.app.h2$$ExternalSyntheticLambda8
            public final /* synthetic */ h2 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i4 = i3;
                h2 h2Var = this.f$0;
                if (i4 == 0) {
                    h2.a(h2Var, (xd) obj);
                    return;
                }
                if (i4 == 1) {
                    h2.a(h2Var, (oe) obj);
                } else if (i4 != 2) {
                    h2.a(h2Var, (ke) obj);
                } else {
                    h2.a(h2Var, (b6) obj);
                }
            }
        });
        final int i4 = 2;
        z7Var.c(b6.class, new IEventSubscriber(this) { // from class: bo.app.h2$$ExternalSyntheticLambda8
            public final /* synthetic */ h2 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i5 = i4;
                h2 h2Var = this.f$0;
                if (i5 == 0) {
                    h2.a(h2Var, (xd) obj);
                    return;
                }
                if (i5 == 1) {
                    h2.a(h2Var, (oe) obj);
                } else if (i5 != 2) {
                    h2.a(h2Var, (ke) obj);
                } else {
                    h2.a(h2Var, (b6) obj);
                }
            }
        });
    }

    public final void b(f fVar) {
        fVar.getClass();
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda1(this, 2), 6, (Object) null);
        } else {
            this.c.c(fVar.a.toString());
            this.h.b();
        }
    }

    public final void g(g9 g9Var) {
        g9Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(7), 7, (Object) null);
        n1 n1Var = (n1) g9Var;
        n1Var.e.setValue(n1Var, n1.h[0], this.b);
        a(new b9(this.f, this.e.getBaseUrlForRequests(), n1Var));
    }

    public static final String c(g9 g9Var) {
        return "Not processing event after validation failed: " + g9Var;
    }

    public static final String e() {
        return "BrazeManager got SdkDebuggerInitializationRequestedEvent";
    }

    public static final String f() {
        return "Braze SDK Debugger logs being sent";
    }

    public static final String e(g9 g9Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Not adding user id to event: ", JsonUtils.getPrettyPrintedString(((n1) g9Var).forJsonPut()));
    }

    public static final String f(g9 g9Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Attempting to log event: ", JsonUtils.getPrettyPrintedString(((n1) g9Var).forJsonPut()));
    }

    public final void c(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(12), 7, (Object) null);
        this.j.a(str);
    }

    public static final String d(h2 h2Var) {
        return "SDK delayed initialization mode: " + h2Var.m.c() + " and GDPR disabled mode: " + h2Var.i.a() + ". Not force closing session.";
    }

    public static final String c() {
        return "Requesting SDK Debugger Handshake";
    }

    public static final String d(g9 g9Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Not adding session id to event: ", JsonUtils.getPrettyPrintedString(((n1) g9Var).forJsonPut()));
    }

    public static final String g() {
        return "BrazeManager got DustConfigRefreshRequestedEvent, requesting new config";
    }

    public static final String g(h2 h2Var) {
        Long l = null;
        Long l2 = h2Var.n.e.readLong(DataStoreKey.DUST_AUTH_EXPIRATION_SECONDS, null);
        if (l2 != null && l2.longValue() > 0) {
            l = l2;
        }
        return m1$$ExternalSyntheticOutline0.m((l != null ? l.longValue() : 0L) - DateTimeUtils.nowInSeconds(), "Skipping DUST config request: cached auth is still valid for ", "s.");
    }

    public static final String b(g9 g9Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("BrazeManager logEvent called for: ", JsonUtils.getPrettyPrintedString(((n1) g9Var).forJsonPut()));
    }

    public static final String b(h2 h2Var) {
        return "SDK delayed initialization mode: " + h2Var.m.c() + " and GDPR disabled mode: " + h2Var.i.a() + ". Not adding request to dispatch.";
    }

    public static final String b(Throwable th) {
        return "Not logging duplicate error: " + th;
    }

    public static final String b(long j) {
        return m1$$ExternalSyntheticOutline0.m(j, "Scheduling Push Delivery Events Flush in ", " ms");
    }

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Logging push delivery event for campaign id: ", str);
    }

    public final void b() {
        if (this.f.O()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(17), 6, (Object) null);
            a(new je(this.f, this.e.getBaseUrlForRequests(), this.b));
        }
    }

    public static final void a(h2 h2Var, xd xdVar) {
        xdVar.getClass();
        throw null;
    }

    public static final void a(h2 h2Var, ke keVar) {
        keVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h2Var, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(14), 6, (Object) null);
        h2Var.b();
    }

    public static final void a(h2 h2Var, oe oeVar) {
        oeVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h2Var, BrazeLogger.Priority.D, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(9), 2, (Object) null);
        h2Var.a(oeVar.a);
    }

    public static final void a(h2 h2Var, b6 b6Var) {
        b6Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h2Var, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(23), 6, (Object) null);
        h2Var.t();
    }

    public final void a(boolean z) {
        this.u.set(z);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda12(this, 0), 6, (Object) null);
    }

    public static final String a(h2 h2Var) {
        return "Updated shouldRequestTriggersInNextRequest to: " + h2Var.u;
    }

    public final void a(f fVar) {
        fVar.getClass();
        if (!this.i.a() && !this.m.c()) {
            this.h.e();
            t2 t2Var = this.c;
            String string = fVar.a.toString();
            string.getClass();
            t2Var.a(string);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda1(this, 1), 6, (Object) null);
    }

    public static final String a() {
        return "BrazeManager init called";
    }

    public static final String a(h2 h2Var, g9 g9Var) {
        return "SDK delayed initialization mode: " + h2Var.m.c() + " and GDPR disabled mode: " + h2Var.i.a() + ". Not logging event: " + g9Var;
    }

    public final void a(sb sbVar) {
        sbVar.getClass();
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0A = this.f.a();
        if (onviewattachedtowindowlambda0A != null) {
            sbVar.c = new rb(((Number) onviewattachedtowindowlambda0A.serializer).longValue(), ((Boolean) onviewattachedtowindowlambda0A.write).booleanValue());
        }
        if (this.u.get()) {
            sbVar.b = Boolean.TRUE;
        }
        sbVar.a = this.b;
        a(new r4(this.f, this.e.getBaseUrlForRequests(), new tb(sbVar.a, sbVar.b, sbVar.c)));
        this.u.set(false);
    }

    public final void a(IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(13), 7, (Object) null);
        g9 g9VarA = n1.g.a(iBrazeLocation);
        if (g9VarA != null) {
            n1 n1Var = (n1) g9VarA;
            n1Var.e.setValue(n1Var, n1.h[0], this.b);
            a(new a9(this.f, this.e.getBaseUrlForRequests(), g9VarA, this.b));
        }
    }

    public final void a(m2 m2Var) {
        m2Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(11), 7, (Object) null);
        a(new s8(this.f, this.e.getBaseUrlForRequests(), this.b, m2Var));
    }

    public final void a(ArrayList arrayList, List list) {
        arrayList.getClass();
        list.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(8), 7, (Object) null);
        a(new k0(arrayList, list, this.f, this.e.getBaseUrlForRequests(), this.b));
    }

    public final void a(l2 l2Var) {
        l2Var.getClass();
        if (!this.i.a() && !this.m.c()) {
            l2Var.b = this.b;
            this.d.b(new u5(t5.ADD_REQUEST, null, null, l2Var, 6), u5.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda1(this, 3), 6, (Object) null);
        }
    }

    public final void a(long j, long j2, m2 m2Var) {
        m2Var.getClass();
        if (!this.f.G()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(13), 6, (Object) null);
        } else {
            a(new e4(this.f, this.e.getBaseUrlForRequests(), j, j2, this.b, m2Var));
        }
    }

    public final boolean a(Throwable th) {
        ReentrantLock reentrantLock = this.q;
        reentrantLock.lock();
        try {
            this.f18o.getAndIncrement();
            Object[] objArr = {this.t, th.getMessage()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.p.get() > 3 && this.f18o.get() < 25) {
                return true;
            }
            Object[] objArr2 = {this.t, th.getMessage()};
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue();
            AtomicInteger atomicInteger = this.p;
            if (zBooleanValue) {
                atomicInteger.getAndIncrement();
            } else {
                atomicInteger.set(0);
            }
            if (this.f18o.get() >= 25) {
                this.f18o.set(0);
            }
            this.t = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(21), 2, (Object) null);
        a(new ne(this.f, this.e.getBaseUrlForRequests(), this.b, arrayList));
    }

    public final void a(Throwable th, boolean z) {
        g9 g9VarA;
        th.getClass();
        try {
            if (a(th)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h2$$ExternalSyntheticLambda18(0, th), 6, (Object) null);
                return;
            }
            String string = th.toString();
            String str = v[0];
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) lowerCase, (CharSequence) str, false) || (g9VarA = n1.g.a(th, this.c.h(), z)) == null) {
                return;
            }
            a(g9VarA);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(10), 4, (Object) null);
        }
    }

    public final void a(long j) {
        Object systemService = this.a.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
        intent.setAction(BrazeFlushPushDeliveryReceiver.FLUSH_BRAZE_PUSH_DELIVERIES_ACTION);
        int i = 0;
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        if (j <= 0) {
            alarmManager.cancel(broadcast);
            qc qcVar = this.k;
            qcVar.getClass();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = qcVar.a;
            reentrantLock.lock();
            try {
                ArrayList arrayList2 = qcVar.b;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    mc mcVar = (mc) obj;
                    if (arrayList.size() >= 32) {
                        break;
                    } else {
                        arrayList.add(mcVar);
                    }
                }
                qcVar.b.removeAll(arrayList);
                reentrantLock.unlock();
                if (!arrayList.isEmpty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(15), 7, (Object) null);
                    a(new rc(this.f, this.e.getBaseUrlForRequests(), this.b, arrayList));
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(16), 7, (Object) null);
                    return;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda3(j, 3), 7, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j, broadcast);
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 27), 7, (Object) null);
        this.k.a(str);
    }
}
