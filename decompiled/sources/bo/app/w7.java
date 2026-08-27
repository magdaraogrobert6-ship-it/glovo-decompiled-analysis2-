package bo.app;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.Banner;
import com.braze.models.BannerPendingDismissal;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt;
import o.accessgetInstancedelegatecp;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setWasCloseMessageCalled;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w7 {
    public final AtomicBoolean A;
    public final AtomicBoolean B;
    public final Context a;
    public final f2 b;
    public final z7 c;
    public final h2 d;
    public final ih e;
    public final f5 f;
    public final vg g;
    public final fa h;
    public final c8 i;
    public final BrazeGeofenceManager j;
    public final u9 k;
    public final BrazeConfigurationProvider l;
    public final d4 m;
    public final re n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final df f27o;
    public final o8 p;
    public final qc q;
    public final g0 r;
    public final AtomicBoolean s;
    public final AtomicBoolean t;
    public og u;
    public final AtomicBoolean v;
    public final AtomicBoolean w;
    public final AtomicBoolean x;
    public final AtomicBoolean y;
    public final AtomicBoolean z;

    public static final String M() {
        return "Requesting Banners refresh on session created event due to configuration.";
    }

    public static final String N() {
        return "Banners already initialized. Not retrieving.";
    }

    public static final String P() {
        return "Requesting Content Card refresh on session created event due to configuration.";
    }

    public static final String Q() {
        return "Content Cards already initialized. Not retrieving.";
    }

    public static final String S() {
        return "Starting DUST subscription due to configuration.";
    }

    public static final String T() {
        return "DUST initial subscription already started. Not starting again.";
    }

    public static final String V() {
        return "Requesting Feature Flags refresh on session created event due to configuration.";
    }

    public static final String W() {
        return "Feature Flags already initialized. Not retrieving.";
    }

    public static final String Y() {
        return "Requesting Push Max request on session created event due to configuration.";
    }

    public static final String Z() {
        return "Push Max already requested for this session. Not requesting again.";
    }

    public static final String b() {
        return "Failed to request a content card refresh.";
    }

    public static final String b0() {
        return "Doing Debugger Handshake.";
    }

    public static final String c() {
        return "Failed to request a feature flag refresh.";
    }

    public static final String c0() {
        return "Debugger Initialization already attempted. Not doing Debugger initialization again.";
    }

    public static final String d() {
        return "Session created event for new session received.";
    }

    public static final String e() {
        return "Requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String e0() {
        return "Performing push delivery event flush";
    }

    public static final String f() {
        return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String g() {
        return "Session start event for new session received.";
    }

    public static final String g0() {
        return "Requesting trigger refresh in next sync";
    }

    public static final String h() {
        return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
    }

    public static final String i() {
        return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
    }

    public static final String j() {
        return "Not automatically requesting Push Max on session created event due to server configuration.";
    }

    public static final String k() {
        return "Not automatically starting DUST subscription on session created event due to server configuration.";
    }

    public static final String l() {
        return "Not automatically requesting Banners refresh on session created event due to server configuration.";
    }

    public static final String m() {
        return "Not automatically starting SDK Debugger on session created event due to server configuration.";
    }

    public static final String n() {
        return "Failed to log the storage exception.";
    }

    public static final String o() {
        return "Requesting trigger update due to trigger-eligible push click event";
    }

    public static final String w() {
        return "Failed to log error.";
    }

    public final void f0() {
        sb sbVar = new sb();
        if (this.d.u.get()) {
            this.s.set(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(21), 7, (Object) null);
            sbVar.b = Boolean.TRUE;
            this.d.a(false);
        }
        Object[] objArr = {sbVar.b, Boolean.TRUE};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            this.d.a(sbVar);
        }
    }

    public w7(Context context, f2 f2Var, z7 z7Var, h2 h2Var, ih ihVar, f5 f5Var, vg vgVar, fa faVar, c8 c8Var, BrazeGeofenceManager brazeGeofenceManager, u9 u9Var, BrazeConfigurationProvider brazeConfigurationProvider, d4 d4Var, re reVar, df dfVar, o8 o8Var, qc qcVar, g0 g0Var) {
        context.getClass();
        f2Var.getClass();
        z7Var.getClass();
        h2Var.getClass();
        ihVar.getClass();
        f5Var.getClass();
        vgVar.getClass();
        faVar.getClass();
        c8Var.getClass();
        brazeGeofenceManager.getClass();
        u9Var.getClass();
        brazeConfigurationProvider.getClass();
        d4Var.getClass();
        reVar.getClass();
        dfVar.getClass();
        o8Var.getClass();
        qcVar.getClass();
        g0Var.getClass();
        this.a = context;
        this.b = f2Var;
        this.c = z7Var;
        this.d = h2Var;
        this.e = ihVar;
        this.f = f5Var;
        this.g = vgVar;
        this.h = faVar;
        this.i = c8Var;
        this.j = brazeGeofenceManager;
        this.k = u9Var;
        this.l = brazeConfigurationProvider;
        this.m = d4Var;
        this.n = reVar;
        this.f27o = dfVar;
        this.p = o8Var;
        this.q = qcVar;
        this.r = g0Var;
        this.s = new AtomicBoolean(false);
        this.t = new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.y = new AtomicBoolean(false);
        this.z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.B = new AtomicBoolean(false);
    }

    public final IEventSubscriber E() {
        return new w7$$ExternalSyntheticLambda0(this, 0);
    }

    public final IEventSubscriber F() {
        return new w7$$ExternalSyntheticLambda0(this, 1);
    }

    public final IEventSubscriber p() {
        return new w7$$ExternalSyntheticLambda0(this, 3);
    }

    public final IEventSubscriber q() {
        return new w7$$ExternalSyntheticLambda0(this, 7);
    }

    public final IEventSubscriber r() {
        return new w7$$ExternalSyntheticLambda0(this, 4);
    }

    public final IEventSubscriber t() {
        return new w7$$ExternalSyntheticLambda0(this, 5);
    }

    public final IEventSubscriber v() {
        return new w7$$ExternalSyntheticLambda0(this, 2);
    }

    public final IEventSubscriber y() {
        return new w7$$ExternalSyntheticLambda0(this, 6);
    }

    public static final void a(w7 w7Var, h0 h0Var) {
        h0Var.getClass();
        g0 g0Var = w7Var.r;
        JSONObject jSONObject = h0Var.a;
        Long l = h0Var.b;
        List<d> list = h0Var.c;
        jSONObject.getClass();
        list.getClass();
        Banner.Companion.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            Banner bannerA = Banner.Companion.a(jSONObject.optJSONObject(itKeys.next()));
            if (bannerA != null) {
                arrayList.add(bannerA);
            }
        }
        ArrayList<Banner> arrayList2 = new ArrayList();
        ArrayList<Banner> arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((Banner) obj).isTestSend()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        for (Banner banner : arrayList2) {
            g0.j.put(banner.getPlacementId(), banner);
        }
        q qVar = g0Var.h;
        List list2 = g0Var.f;
        qVar.getClass();
        list2.getClass();
        Map mapA = qVar.a.a();
        List listB = qVar.a.b();
        listB.getClass();
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (d dVar : list) {
            arrayList4.add(new onViewAttachedToWindowlambda0(dVar.a, Long.valueOf(dVar.b)));
        }
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : listB) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) obj2;
            if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(new onViewAttachedToWindowlambda0(bannerPendingDismissal.getBannerId(), Long.valueOf(bannerPendingDismissal.getDismissalTimeMs())))) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList5.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList5.get(i3);
            i3++;
            String stableKey = ((BannerPendingDismissal) obj3).getStableKey();
            if (stableKey != null) {
                arrayList6.add(stableKey);
            }
        }
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList6);
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list2, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (Object obj4 : list2) {
            linkedHashMap.put(((Banner) obj4).getPlacementId(), obj4);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Banner banner2 : arrayList3) {
            if ((!qVar.a(banner2, l, mapA) && (banner2 = (Banner) linkedHashMap.get(banner2.getPlacementId())) == null) || !qVar.a(banner2, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2) || !qVar.a(banner2)) {
                banner2 = null;
            }
            if (banner2 != null) {
                arrayList7.add(banner2);
            }
        }
        if (l != null) {
            com.braze.storage.a aVar = g0Var.e;
            ArrayList arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(arrayList7, 10));
            int size3 = arrayList7.size();
            while (i < size3) {
                Object obj5 = arrayList7.get(i);
                i++;
                arrayList8.add(((Banner) obj5).getPlacementId());
            }
            long jLongValue = l.longValue();
            aVar.getClass();
            if (!arrayList8.isEmpty()) {
                BuildersKt.serializer(aVar.getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new w(aVar, arrayList8, jLongValue, null));
            }
        }
        g0Var.f = arrayList7;
        g0Var.h();
        g0Var.l();
        List list3 = g0Var.f;
        ArrayList arrayList9 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList9.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
        }
        ((z7) w7Var.k).b(new BannersUpdatedEvent(arrayList9), BannersUpdatedEvent.class);
    }

    public final IEventSubscriber A() {
        return new w7$$ExternalSyntheticLambda0(this, 11);
    }

    public final IEventSubscriber B() {
        return new w7$$ExternalSyntheticLambda0(this, 16);
    }

    public final IEventSubscriber C() {
        return new w7$$ExternalSyntheticLambda0(this, 18);
    }

    public final IEventSubscriber D() {
        return new w7$$ExternalSyntheticLambda0(this, 17);
    }

    public final IEventSubscriber G() {
        return new w7$$ExternalSyntheticLambda0(this, 13);
    }

    public final IEventSubscriber H() {
        return new w7$$ExternalSyntheticLambda0(this, 20);
    }

    public final IEventSubscriber I() {
        return new w7$$ExternalSyntheticLambda0(this, 19);
    }

    public final IEventSubscriber J() {
        return new w7$$ExternalSyntheticLambda0(this, 14);
    }

    public final IEventSubscriber K() {
        return new w7$$ExternalSyntheticLambda0(this, 9);
    }

    public final void L() {
        if (!this.A.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(20), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(19), 7, (Object) null);
            this.r.a();
        }
    }

    public final void O() {
        if (!this.w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(10), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(9), 7, (Object) null);
        h2 h2Var = this.d;
        d4 d4Var = this.m;
        h2Var.a(d4Var.d, d4Var.e, m2.SESSION_START);
    }

    public final void R() {
        if (!this.z.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(8), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(7), 7, (Object) null);
            this.d.t();
        }
    }

    public final void U() {
        if (!this.x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(23), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(22), 7, (Object) null);
        o8 o8Var = this.p;
        m2 m2Var = m2.SESSION_START;
        m2Var.getClass();
        o8Var.d.a(m2Var);
    }

    public final void X() {
        if (!this.y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(12), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(11), 7, (Object) null);
            this.d.w();
        }
    }

    public final void a0() {
        if (!this.B.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(16), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(15), 7, (Object) null);
            this.c.b(new ke(), ke.class);
        }
    }

    public final IEventSubscriber s() {
        return new w7$$ExternalSyntheticLambda0(this, 10);
    }

    public final IEventSubscriber u() {
        return new w7$$ExternalSyntheticLambda0(this, 8);
    }

    public final IEventSubscriber x() {
        return new w7$$ExternalSyntheticLambda0(this, 15);
    }

    public final IEventSubscriber z() {
        return new w7$$ExternalSyntheticLambda0(this, 12);
    }

    public final void d0() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(26), 7, (Object) null);
        this.d.a(0L);
    }

    public static final void a(w7 w7Var, x5 x5Var) {
        og ogVar;
        x5Var.getClass();
        l9 l9Var = x5Var.a;
        d5 d5Var = ((l2) l9Var).j;
        if (d5Var != null) {
            w7Var.f.a((Object) d5Var, false);
        }
        if (l9Var instanceof r4) {
            r4 r4Var = (r4) l9Var;
            if (r4Var.l.b()) {
                if (w7Var.s.compareAndSet(true, false)) {
                    w7Var.g.a((pg) new pb());
                }
                if (w7Var.t.compareAndSet(true, false) && (ogVar = w7Var.u) != null) {
                    w7Var.g.a((pg) new jc(ogVar.a, ogVar.b));
                    w7Var.u = null;
                }
                w7Var.d.a(true);
            }
            ub ubVar = r4Var.n;
            if (ubVar != null) {
                w7Var.e.a((Object) ubVar, false);
                if (ubVar.a.has(DataStoreKey.PUSH_TOKEN.getKey())) {
                    w7Var.e.j();
                    w7Var.f.e();
                }
            }
            o1 o1Var = r4Var.f22o;
            if (o1Var != null) {
                for (g9 g9Var : o1Var.a) {
                    z7 z7Var = w7Var.c;
                    int iSerializer = getQueryParameterslambda2.serializer();
                    z7Var.b(new u5(t5.ADD_BRAZE_EVENTS, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{g9Var}, getQueryParameterslambda2.serializer(), -516583649, iSerializer), null, null, 12), u5.class);
                }
            }
            if (r4Var.l.c != null) {
                w7Var.f27o.P();
            }
        }
        if (l9Var instanceof rc) {
            w7Var.q.b(((rc) l9Var).l);
        }
    }

    public static final void a(w7 w7Var, y5 y5Var) {
        String strRemoteActionCompatParcelizer;
        y5Var.getClass();
        l9 l9Var = y5Var.a;
        d5 d5Var = ((l2) l9Var).j;
        if (d5Var != null) {
            w7Var.f.a((Object) d5Var, true);
        }
        if (l9Var instanceof r4) {
            r4 r4Var = (r4) l9Var;
            ub ubVar = r4Var.n;
            if (ubVar != null) {
                w7Var.e.a((Object) ubVar, true);
            }
            o1 o1Var = r4Var.f22o;
            if (o1Var != null) {
                w7Var.i.a(o1Var.a);
            }
            if (r4Var.l.b()) {
                w7Var.d.a(false);
            }
            EnumSet enumSet = r4Var.p;
            if (enumSet != null) {
                com.braze.storage.o oVar = w7Var.n.a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(com.braze.support.d.a(enumSet));
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        try {
                            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                            isverticalswipeinalloweddirection.getClass();
                            strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                            strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
                        }
                        oVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                    }
                }
            }
            if (r4Var.l.c != null) {
                w7Var.f27o.P();
            }
        }
        if (l9Var instanceof rc) {
            w7Var.q.a(((rc) l9Var).l);
        }
    }

    public static final void a(w7 w7Var, p8 p8Var) {
        p8Var.getClass();
        ((z7) w7Var.k).b(w7Var.p.a(p8Var.a), FeatureFlagsUpdatedEvent.class);
    }

    public static final void a(w7 w7Var, c9 c9Var) {
        c9Var.getClass();
        w7Var.j.registerGeofences(c9Var.a);
    }

    public static final void a(w7 w7Var, ta taVar) {
        taVar.getClass();
        da daVar = taVar.a;
        ga gaVar = taVar.b;
        IInAppMessage iInAppMessage = taVar.c;
        String str = taVar.d;
        synchronized (w7Var.h) {
            if (((zg) w7Var.h).a(gaVar)) {
                ((z7) w7Var.k).b(new InAppMessageEvent(daVar, gaVar, iInAppMessage, str), InAppMessageEvent.class);
                ((zg) w7Var.h).a(gaVar, DateTimeUtils.nowInSeconds());
                w7Var.g.b(DateTimeUtils.nowInSeconds());
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda6(gaVar, 7), 7, (Object) null);
            }
        }
    }

    public static final void a(w7 w7Var, cf cfVar) {
        cfVar.getClass();
        af afVar = cfVar.a;
        w7Var.j.configureFromServerConfig(afVar);
        if (w7Var.v.get()) {
            if (afVar.j) {
                w7Var.O();
            }
            if (afVar.m) {
                w7Var.U();
            }
            if (afVar.f13o) {
                w7Var.X();
            }
            if (afVar.t) {
                w7Var.R();
            }
            if (afVar.G) {
                w7Var.L();
            }
            if (afVar.z) {
                w7Var.a0();
            }
        }
    }

    public static final void a(w7 w7Var, qg qgVar) {
        qgVar.getClass();
        w7Var.g.a((pg) qgVar.a);
    }

    public static final void a(w7 w7Var, bh bhVar) {
        bhVar.getClass();
        w7Var.g.a(bhVar.a, bhVar.b);
    }

    public static final void a(w7 w7Var, dh dhVar) {
        og ogVar;
        dhVar.getClass();
        w7Var.g.a(dhVar.a, dhVar.b, dhVar.c);
        if (w7Var.s.compareAndSet(true, false)) {
            w7Var.g.a((pg) new pb());
        }
        if (!w7Var.t.compareAndSet(true, false) || (ogVar = w7Var.u) == null) {
            return;
        }
        w7Var.g.a((pg) new jc(ogVar.a, ogVar.b));
        w7Var.u = null;
    }

    public static final void a(w7 w7Var, u3 u3Var) {
        u3Var.getClass();
        if (!u3Var.a.j || u3Var.b.j) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(25), 7, (Object) null);
        w7Var.m.a();
    }

    public static final void a(w7 w7Var, gf gfVar) {
        gfVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(8), 7, (Object) null);
        w7Var.w.set(false);
        w7Var.x.set(false);
        w7Var.y.set(false);
        w7Var.z.set(false);
        w7Var.B.set(false);
        w7Var.b.f();
        g9 g9VarA = n1.g.a(gfVar.a.a);
        if (g9VarA != null) {
            ((n1) g9VarA).a(gfVar.a.a);
        }
        if (g9VarA != null) {
            w7Var.d.a(g9VarA);
        }
        w7Var.d.a(true);
        w7Var.e.j();
        w7Var.f.e();
        w7Var.d0();
        if (w7Var.l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(9), 7, (Object) null);
            BrazeInternal.requestGeofenceRefresh(w7Var.a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(10), 7, (Object) null);
        }
        w7Var.p.e.clearData(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP);
        w7Var.r.j();
        w7Var.f0();
    }

    public static final void a(w7 w7Var, kf kfVar) {
        kfVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(11), 7, (Object) null);
        w7Var.v.set(true);
        if (w7Var.f27o.G()) {
            w7Var.O();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(12), 7, (Object) null);
        }
        if (w7Var.f27o.J()) {
            w7Var.U();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(13), 7, (Object) null);
        }
        if (w7Var.f27o.N()) {
            w7Var.X();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(14), 7, (Object) null);
        }
        if (w7Var.f27o.H()) {
            w7Var.R();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(15), 7, (Object) null);
        }
        if (w7Var.f27o.d()) {
            w7Var.L();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(16), 7, (Object) null);
        }
        if (w7Var.f27o.O()) {
            w7Var.a0();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) w7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(6), 7, (Object) null);
        }
    }

    public static final void a(w7 w7Var, gb gbVar) {
        gbVar.getClass();
        w7Var.d.a(true);
        w7Var.f0();
    }

    public static final void a(w7 w7Var, jf jfVar) {
        jfVar.getClass();
        w7Var.getClass();
        ff ffVar = jfVar.a;
        g9 g9VarA = n1.g.a(ffVar.c());
        if (g9VarA != null) {
            ((n1) g9VarA).a(ffVar.a);
            w7Var.d.a(g9VarA);
        }
        Braze.Companion.getInstance(w7Var.a).requestImmediateDataFlush();
        w7Var.d0();
    }

    public static final void a(w7 w7Var, e eVar) {
        eVar.getClass();
        List list = eVar.a;
        g0 g0Var = w7Var.r;
        list.getClass();
        g0Var.g.a(list);
    }

    public static final void a(w7 w7Var, og ogVar) {
        ogVar.getClass();
        w7Var.t.set(true);
        w7Var.u = ogVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) w7Var, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(14), 6, (Object) null);
        h2 h2Var = w7Var.d;
        sb sbVar = new sb();
        sbVar.b = Boolean.TRUE;
        h2Var.a(sbVar);
    }

    public static final String a(ga gaVar) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not publish in-app message with trigger action id: ", ((ah) gaVar).a);
    }

    public static final void a(w7 w7Var, sf sfVar) {
        sfVar.getClass();
        try {
            w7Var.d.a((Throwable) sfVar, false);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) w7Var, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(18), 4, (Object) null);
        }
    }

    public static final void a(w7 w7Var, v3 v3Var) {
        v3Var.getClass();
        try {
            h2 h2Var = w7Var.d;
            d4 d4Var = w7Var.m;
            h2Var.a(d4Var.d, d4Var.e, m2.DUST_INITIATED);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) w7Var, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(13), 4, (Object) null);
        }
    }

    public static final void a(w7 w7Var, i8 i8Var) {
        i8Var.getClass();
        try {
            w7Var.d.a(m2.DUST_INITIATED);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) w7Var, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(17), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Content cards have moved to disabled. Clearing content card data.";
    }

    public final void a(z7 z7Var) {
        z7Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(28, z7Var), 7, (Object) null);
        z7Var.c(x5.class, t());
        z7Var.c(y5.class, u());
        z7Var.c(gf.class, D());
        z7Var.c(kf.class, F());
        z7Var.c(jf.class, E());
        z7Var.c(og.class, H());
        z7Var.c(cf.class, C());
        z7Var.c(Throwable.class, v());
        z7Var.c(sf.class, G());
        z7Var.c(dh.class, K());
        z7Var.c(gb.class, B());
        z7Var.c(c9.class, z());
        z7Var.c(p8.class, y());
        z7Var.c(h0.class, q());
        z7Var.c(e.class, p());
        z7Var.c(qg.class, I());
        z7Var.c(ta.class, A());
        z7Var.c(bh.class, J());
        z7Var.c(v3.class, s());
        z7Var.c(i8.class, x());
        z7Var.c(u3.class, r());
    }

    public static final String a(u9 u9Var) {
        return "Subscribing to events with " + u9Var;
    }

    public static final void a(w7 w7Var, Semaphore semaphore, Throwable th) {
        if (th != null) {
            try {
                w7Var.d.a(th, true);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) w7Var, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(24), 4, (Object) null);
                if (semaphore == null) {
                    return;
                }
            } finally {
                if (semaphore != null) {
                    semaphore.release();
                }
            }
        }
    }
}
