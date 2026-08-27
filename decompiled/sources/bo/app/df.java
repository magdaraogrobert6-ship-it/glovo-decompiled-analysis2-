package bo.app;

import android.content.Context;
import com.braze.Constants;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import o.ItemTouchHelperAdapter;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.setWasCloseMessageCalled;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class df {
    public static final int f = 10000;
    public static final int g = 300000;
    public final z7 a;
    public final com.braze.storage.p b;
    public final ReentrantLock c;
    public final setCustomInAppMessageAnimationFactorylambda0 d;
    public af e;

    public static final String Q() {
        return "Attempting to unlock server config info";
    }

    public static final String R() {
        return "Unlocking config info lock.";
    }

    public static final String S() {
        return "Tried to unlock server config info when not locked.";
    }

    public static final String T() {
        return "Could not persist server config to DataStore.";
    }

    public static final String U() {
        return "Could not persist server config to DataStore.";
    }

    public static final String V() {
        return "Server config is older than previous config time. Not sending out ConfigChangeEvent.";
    }

    public static final String c() {
        return "Not allowing server config info unlock. Returning null.";
    }

    public static final String h() {
        return "Experienced exception retrieving blocklisted strings from local storage. Returning empty set.";
    }

    public static final String z() {
        return "Failed to parse endpoint override from storage";
    }

    public final String A() {
        String string;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar == null || (string = afVar.A) == null) {
                string = this.b.readString(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE, null);
            }
            return string;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long B() {
        long jLongValue;
        Long l;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar == null || (l = afVar.B) == null) {
                Long l2 = this.b.readLong(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME, -1L);
                jLongValue = l2 != null ? l2.longValue() : -1L;
            } else {
                jLongValue = l.longValue();
            }
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long C() {
        long jLongValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                jLongValue = afVar.C;
            } else {
                Long l = this.b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, 0L);
                jLongValue = l != null ? l.longValue() : 0L;
            }
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long D() {
        long jLongValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                jLongValue = afVar.D;
            } else {
                Long l = this.b.readLong(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, 0L);
                jLongValue = l != null ? l.longValue() : 0L;
            }
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long E() {
        long jLongValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                jLongValue = afVar.E;
            } else {
                Long l = this.b.readLong(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES, 0L);
                jLongValue = l != null ? l.longValue() : 0L;
            }
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean F() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.u;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean G() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.j;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.CONTENT_CARDS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean H() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.t;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.DUST_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean I() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.l;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.EPHEMERAL_EVENTS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean J() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.m;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.FEATURE_FLAGS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean K() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.i;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.GEOFENCES_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean L() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.h;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.GEOFENCES_ENABLED_SET, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean M() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.q;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED, Boolean.TRUE);
                zBooleanValue = bool != null ? bool.booleanValue() : true;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean N() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.f13o;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.PUSH_MAX_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean O() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.z;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.SDK_DEBUGGER_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void P() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(6), 6, (Object) null);
        if (this.d.read()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(7), 7, (Object) null);
            try {
                this.d.write(null);
            } catch (IllegalStateException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(8), 4, (Object) null);
            }
        }
    }

    public final boolean d() {
        boolean zBooleanValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                zBooleanValue = afVar.G;
            } else {
                Boolean bool = this.b.readBoolean(DataStoreKey.BANNERS_ENABLED, Boolean.FALSE);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            return zBooleanValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set e() {
        Set setA;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar == null || (setA = afVar.c) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_ATTRIBUTES);
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set f() {
        Set setA;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar == null || (setA = afVar.b) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_EVENTS);
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set g() {
        Set setA;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar == null || (setA = afVar.d) == null) {
                setA = a(DataStoreKey.BLOCKLISTED_PURCHASES);
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long i() {
        long jLongValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                jLongValue = afVar.a;
            } else {
                Long l = this.b.readLong(DataStoreKey.CONFIG_TIME, 0L);
                jLongValue = l != null ? l.longValue() : 0L;
            }
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int j() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.x;
            } else {
                com.braze.storage.p pVar = this.b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS;
                int i = g;
                Integer num = pVar.readInt(dataStoreKey, Integer.valueOf(i));
                iIntValue = num != null ? num.intValue() : i;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int k() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.w;
            } else {
                com.braze.storage.p pVar = this.b;
                DataStoreKey dataStoreKey = DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS;
                int i = f;
                Integer num = pVar.readInt(dataStoreKey, Integer.valueOf(i));
                iIntValue = num != null ? num.intValue() : i;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int l() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.y;
            } else {
                Integer num = this.b.readInt(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, 3);
                iIntValue = num != null ? num.intValue() : 3;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int m() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.I;
            } else {
                Integer num = this.b.readInt(DataStoreKey.BANNERS_DISMISSALS_CACHE_SIZE, 200);
                iIntValue = num != null ? num.intValue() : 200;
            }
            return iIntValue > 0 ? iIntValue : 200;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int n() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.n;
            } else {
                Integer num = this.b.readInt(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, 5);
                iIntValue = num != null ? num.intValue() : 5;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int o() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.s;
            } else {
                Integer num = this.b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, 30);
                iIntValue = num != null ? num.intValue() : 30;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int p() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.r;
            } else {
                Integer num = this.b.readInt(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, 30);
                iIntValue = num != null ? num.intValue() : 30;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int q() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.H;
            } else {
                Integer num = this.b.readInt(DataStoreKey.MAX_BANNER_PLACEMENTS, 0);
                iIntValue = num != null ? num.intValue() : 0;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int r() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.g;
            } else {
                Integer num = this.b.readInt(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER, -1);
                iIntValue = num != null ? num.intValue() : -1;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long s() {
        long jLongValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                jLongValue = afVar.k;
            } else {
                Long l = this.b.readLong(DataStoreKey.MESSAGING_SESSION_TIMEOUT, -1L);
                jLongValue = l != null ? l.longValue() : -1L;
            }
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int t() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.f;
            } else {
                Integer num = this.b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REPORT, -1);
                iIntValue = num != null ? num.intValue() : -1;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int u() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.e;
            } else {
                Integer num = this.b.readInt(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST, -1);
                iIntValue = num != null ? num.intValue() : -1;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int v() {
        int iIntValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                iIntValue = afVar.J;
            } else {
                Integer num = this.b.readInt(DataStoreKey.MINIMUM_SESSION_TIMEOUT, -1);
                iIntValue = num != null ? num.intValue() : -1;
            }
            return iIntValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long w() {
        long jLongValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                jLongValue = afVar.p;
            } else {
                Long l = this.b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER, Long.valueOf(ConstantsKt.DEFAULT_PROFILE_TTL));
                jLongValue = l != null ? l.longValue() : 86400L;
            }
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long x() {
        long jLongValue;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                jLongValue = afVar.v;
            } else {
                Long l = this.b.readLong(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER, -1L);
                jLongValue = l != null ? l.longValue() : -1L;
            }
            return jLongValue;
        } finally {
            reentrantLock.unlock();
        }
    }

    public df(Context context, String str, z7 z7Var) {
        context.getClass();
        str.getClass();
        z7Var.getClass();
        this.a = z7Var;
        com.braze.storage.p pVar = new com.braze.storage.p(context, str);
        this.b = pVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        DataStoreKey dataStoreKey = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        String string = pVar.readString(dataStoreKey, "");
        if (!Constants.BRAZE_SDK_VERSION.equals(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(string, 2), 6, (Object) null);
            pVar.writeData(DataStoreKey.CONFIG_TIME, 0L);
            pVar.writeData(dataStoreKey, Constants.BRAZE_SDK_VERSION);
        }
        af afVar = new af();
        afVar.c = e();
        afVar.b = f();
        afVar.d = g();
        afVar.a = i();
        afVar.k = s();
        afVar.J = v();
        afVar.e = u();
        afVar.f = t();
        afVar.g = r();
        afVar.i = K();
        afVar.h = L();
        afVar.j = G();
        afVar.l = I();
        afVar.m = J();
        afVar.n = n();
        afVar.f13o = N();
        afVar.p = w();
        afVar.t = H();
        afVar.u = F();
        afVar.q = M();
        afVar.r = p();
        afVar.s = o();
        afVar.v = x();
        afVar.y = l();
        afVar.w = k();
        afVar.x = j();
        afVar.z = O();
        afVar.A = A();
        afVar.C = C();
        afVar.D = D();
        afVar.E = E();
        afVar.B = Long.valueOf(B());
        reentrantLock.lock();
        try {
            af afVar2 = this.e;
            Map mapY = (afVar2 == null || (mapY = afVar2.F) == null) ? y() : mapY;
            reentrantLock.unlock();
            afVar.F = mapY;
            afVar.G = d();
            afVar.H = q();
            afVar.I = m();
            reentrantLock.lock();
            try {
                this.e = afVar;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(af afVar) {
        return "Finishing updating server config to " + afVar;
    }

    public final void a(af afVar) {
        String strRemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer2;
        afVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar2 = this.e;
            this.e = afVar;
            reentrantLock.unlock();
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set set = afVar.b;
                String strRemoteActionCompatParcelizer3 = "{}";
                if (set != null) {
                    String key = DataStoreKey.BLOCKLISTED_EVENTS.getKey();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(set);
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        isverticalswipeinalloweddirection.getClass();
                        strRemoteActionCompatParcelizer2 = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        strRemoteActionCompatParcelizer2 = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
                    }
                    linkedHashMap.put(key, strRemoteActionCompatParcelizer2);
                }
                Set set2 = afVar.c;
                if (set2 != null) {
                    String key2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES.getKey();
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(set2);
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                        isverticalswipeinalloweddirection2.getClass();
                        strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat2);
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat2 instanceof Map) && (listPlaybackStateCompat2 instanceof List)) ? "[]" : "{}";
                    }
                    linkedHashMap.put(key2, strRemoteActionCompatParcelizer);
                }
                Set set3 = afVar.d;
                if (set3 != null) {
                    String key3 = DataStoreKey.BLOCKLISTED_PURCHASES.getKey();
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    List listPlaybackStateCompat3 = onContentCardDismissed.PlaybackStateCompat(set3);
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection3 = resetTransientState.read;
                        isverticalswipeinalloweddirection3.getClass();
                        strRemoteActionCompatParcelizer3 = isverticalswipeinalloweddirection3.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat3);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        if (!(listPlaybackStateCompat3 instanceof Map) && (listPlaybackStateCompat3 instanceof List)) {
                            strRemoteActionCompatParcelizer3 = "[]";
                        }
                    }
                    linkedHashMap.put(key3, strRemoteActionCompatParcelizer3);
                }
                Map map = afVar.F;
                if (map != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        k9 k9Var = (k9) entry.getKey();
                        xe xeVar = (xe) entry.getValue();
                        jSONObject.put(k9Var.name(), new JSONObject().put("refill", xeVar.b).put("capacity", xeVar.a));
                    }
                    linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), jSONObject.toString());
                }
                linkedHashMap.put(DataStoreKey.CONFIG_TIME.getKey(), Long.valueOf(afVar.a));
                linkedHashMap.put(DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), Boolean.valueOf(afVar.l));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), Boolean.valueOf(afVar.h));
                linkedHashMap.put(DataStoreKey.GEOFENCES_ENABLED.getKey(), Boolean.valueOf(afVar.i));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), Integer.valueOf(afVar.e));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), Integer.valueOf(afVar.f));
                linkedHashMap.put(DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), Integer.valueOf(afVar.g));
                linkedHashMap.put(DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), Long.valueOf(afVar.k));
                linkedHashMap.put(DataStoreKey.MINIMUM_SESSION_TIMEOUT.getKey(), Integer.valueOf(afVar.J));
                linkedHashMap.put(DataStoreKey.DUST_ENABLED.getKey(), Boolean.valueOf(afVar.t));
                linkedHashMap.put(DataStoreKey.DUST_SHOULD_BLOCK_CC_REFRESH.getKey(), Boolean.valueOf(afVar.u));
                linkedHashMap.put(DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), Boolean.valueOf(afVar.j));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), Boolean.valueOf(afVar.m));
                linkedHashMap.put(DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), Integer.valueOf(afVar.n));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_ENABLED.getKey(), Boolean.valueOf(afVar.f13o));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), Long.valueOf(afVar.p));
                linkedHashMap.put(DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), Long.valueOf(afVar.v));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), Boolean.valueOf(afVar.q));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), Integer.valueOf(afVar.s));
                linkedHashMap.put(DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), Integer.valueOf(afVar.r));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), Integer.valueOf(afVar.w));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), Integer.valueOf(afVar.x));
                linkedHashMap.put(DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), Integer.valueOf(afVar.y));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(afVar.z));
                Long l = afVar.B;
                if (l != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l.longValue()));
                }
                String str = afVar.A;
                if (str != null) {
                    linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str);
                }
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(afVar.C));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(afVar.D));
                linkedHashMap.put(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(afVar.E));
                linkedHashMap.put(DataStoreKey.BANNERS_ENABLED.getKey(), Boolean.valueOf(afVar.G));
                linkedHashMap.put(DataStoreKey.MAX_BANNER_PLACEMENTS.getKey(), Integer.valueOf(afVar.H));
                linkedHashMap.put(DataStoreKey.BANNERS_DISMISSALS_CACHE_SIZE.getKey(), Integer.valueOf(afVar.I));
                this.b.batchUpdate(linkedHashMap, ItemTouchHelperAdapter.serializer);
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(11), 4, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new af$$ExternalSyntheticLambda3(afVar, 1), 6, (Object) null);
            if (afVar2 != null) {
                if (afVar.a > afVar2.a) {
                    this.a.b(new u3(afVar2, afVar), u3.class);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(4), 7, (Object) null);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final LinkedHashMap y() {
        String str = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String string = this.b.readString(DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, "");
            if (string != null) {
                str = string;
            }
            if (str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    j9 j9Var = k9.b;
                    next.getClass();
                    k9 k9VarA = j9Var.a(next);
                    if (k9VarA != null) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        linkedHashMap.put(k9VarA, new xe(jSONObject2.getInt("capacity"), jSONObject2.getInt("refill")));
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(4), 4, (Object) null);
            return linkedHashMap;
        }
    }

    public static final String b() {
        return "Attempting to acquire server config lock";
    }

    public static final String a(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Detected SDK update from '", str, "' -> '", str2, "'. Clearing config update time.");
    }

    public final void a(ce ceVar) {
        ceVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            af afVar = this.e;
            if (afVar != null) {
                afVar.z = ceVar.a;
            }
            if (afVar != null) {
                afVar.C = ceVar.d;
            }
            if (afVar != null) {
                afVar.D = ceVar.e;
            }
            if (afVar != null) {
                afVar.E = ceVar.f;
            }
            String str = ceVar.c;
            if (str != null && afVar != null) {
                afVar.A = str;
            }
            Long l = ceVar.b;
            if (l != null) {
                long jLongValue = l.longValue();
                af afVar2 = this.e;
                if (afVar2 != null) {
                    afVar2.B = Long.valueOf(jLongValue);
                }
            }
            reentrantLock.unlock();
            try {
                af afVar3 = this.e;
                if (afVar3 != null) {
                    LinkedHashMap linkedHashMapIconCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0(DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), Boolean.valueOf(afVar3.z)), new onViewAttachedToWindowlambda0(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), Long.valueOf(afVar3.C)), new onViewAttachedToWindowlambda0(DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), Long.valueOf(afVar3.D)), new onViewAttachedToWindowlambda0(DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), Long.valueOf(afVar3.E)));
                    Long l2 = afVar3.B;
                    if (l2 != null) {
                        linkedHashMapIconCompatParcelizer.put(DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), Long.valueOf(l2.longValue()));
                    }
                    String str2 = afVar3.A;
                    if (str2 != null) {
                        linkedHashMapIconCompatParcelizer.put(DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), str2);
                    }
                    this.b.batchUpdate(linkedHashMapIconCompatParcelizer, ItemTouchHelperAdapter.serializer);
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(5), 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(10, this), 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(df dfVar) {
        return "Finishing updating server config to " + dfVar.e;
    }

    public final onViewAttachedToWindowlambda0 a() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(9), 6, (Object) null);
        if (!this.d.write()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(10), 6, (Object) null);
            return null;
        }
        return new onViewAttachedToWindowlambda0(Long.valueOf(i()), Boolean.valueOf(i() <= 0));
    }

    public final HashSet a(DataStoreKey dataStoreKey) {
        ArrayList arrayList;
        try {
            com.braze.storage.p pVar = this.b;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
                arrayList = new ArrayList();
            } else {
                try {
                    Object data = pVar.readData(dataStoreKey, "");
                    data.getClass();
                    String str = (String) data;
                    if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                        arrayList = new ArrayList();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                        List list = instance_delegatelambda0.write;
                        if (!zSerializer) {
                            Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                                try {
                                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                    isverticalswipeinalloweddirection.getClass();
                                    list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                                } catch (Exception e) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
                                }
                            }
                        }
                        arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                    }
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                    arrayList = new ArrayList();
                }
            }
            return onContentCardDismissed.write(arrayList);
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(5), 4, (Object) null);
            return new HashSet();
        }
    }
}
