package bo.app;

import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.getContentCardsActionListener;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetAfterInAppMessageCloselambda2;
import o.verifyOrientationStatuslambda1;
import o.verifyOrientationStatuslambda3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class af {
    public String A;
    public Long B;
    public long C;
    public long D;
    public long E;
    public Map F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public long a;
    public Set b;
    public Set c;
    public Set d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13o;
    public long p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public long v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("banners");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.G = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
                int i = jSONObjectOptJSONObject.getInt("max_placements");
                this.H = i;
                if (this.G && i <= 0) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new af$$ExternalSyntheticLambda3(this, 0), 7, (Object) null);
                    this.G = false;
                    this.H = 0;
                }
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(14), 4, (Object) null);
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("dismissals_cache_size", 200);
            this.I = iOptInt > 0 ? iOptInt : 200;
        }
    }

    public final void b(JSONObject jSONObject) {
        boolean z;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content_cards");
        if (jSONObjectOptJSONObject != null) {
            try {
                z = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(16), 4, (Object) null);
                z = false;
            }
            this.j = z;
        }
    }

    public final void c(JSONObject jSONObject) {
        boolean z;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dust");
        if (jSONObjectOptJSONObject != null) {
            try {
                z = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(11), 4, (Object) null);
                z = false;
            }
            this.t = z;
            this.u = jSONObjectOptJSONObject.optBoolean("should_block_cc_refresh", false);
        }
    }

    public final void d(JSONObject jSONObject) {
        boolean z;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (jSONObjectOptJSONObject != null) {
            try {
                z = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(18), 4, (Object) null);
                z = false;
            }
            this.l = z;
        }
    }

    public final void e(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("feature_flags");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.m = jSONObjectOptJSONObject.optBoolean(FeatureFlag.ENABLED);
                this.n = jSONObjectOptJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(17), 4, (Object) null);
                this.m = false;
            }
        }
    }

    public final void f(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("geofences");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.e = jSONObjectOptJSONObject.getInt("min_time_since_last_request");
                this.f = jSONObjectOptJSONObject.getInt("min_time_since_last_report");
                this.i = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
                this.h = true;
                this.g = jSONObjectOptJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(10), 4, (Object) null);
                this.e = -1;
                this.f = -1;
                this.g = -1;
                this.i = false;
                this.h = false;
            }
        }
    }

    public final void g(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("endpoint_overrides");
        if (jSONObjectOptJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                j9 j9Var = k9.b;
                next.getClass();
                j9Var.getClass();
                k9 k9Var = (k9) k9.c.get(next);
                if (k9Var != null) {
                    JSONObject jSONObject2 = jSONObjectOptJSONObject.getJSONObject(next);
                    int i = jSONObject2.getInt("capacity");
                    int i2 = jSONObject2.getInt("refill_rate");
                    if (i > 0 && i2 > 0) {
                        linkedHashMap.put(k9Var, new xe(i, i2));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            this.F = linkedHashMap;
        }
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a);
        Set set = this.b;
        int iHashCode2 = set == null ? 0 : set.hashCode();
        Set set2 = this.c;
        int iHashCode3 = set2 == null ? 0 : set2.hashCode();
        Set set3 = this.d;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.y, af$$ExternalSyntheticOutline0.m(this.x, af$$ExternalSyntheticOutline0.m(this.w, d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.s, af$$ExternalSyntheticOutline0.m(this.r, d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.n, d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.g, af$$ExternalSyntheticOutline0.m(this.f, af$$ExternalSyntheticOutline0.m(this.e, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (set3 == null ? 0 : set3.hashCode())) * 31, 31), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31, this.f13o), 31, this.p), 31, this.q), 31), 31), 31, this.t), 31, this.u), 31, this.v), 31), 31), 31), 31, this.z);
        String str = this.A;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Long l = this.B;
        int iM2 = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((((iM + iHashCode4) * 31) + (l == null ? 0 : l.hashCode())) * 31, 31, this.C), 31, this.D), 31, this.E);
        Map map = this.F;
        return Integer.hashCode(this.J) + af$$ExternalSyntheticOutline0.m(this.I, af$$ExternalSyntheticOutline0.m(this.H, d$$ExternalSyntheticOutline0.m((iM2 + (map != null ? map.hashCode() : 0)) * 31, 31, this.G), 31), 31);
    }

    public final void i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("push_max");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f13o = jSONObjectOptJSONObject.optBoolean(FeatureFlag.ENABLED);
                this.p = jSONObjectOptJSONObject.optLong("redeliver_buffer", ConstantsKt.DEFAULT_PROFILE_TTL);
                this.v = jSONObjectOptJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(13), 4, (Object) null);
                this.f13o = false;
                this.p = 0L;
                this.v = -1L;
            }
        }
    }

    public final String toString() {
        long j = this.a;
        Set set = this.b;
        Set set2 = this.c;
        Set set3 = this.d;
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        long j2 = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        int i4 = this.n;
        boolean z6 = this.f13o;
        long j3 = this.p;
        boolean z7 = this.q;
        int i5 = this.r;
        int i6 = this.s;
        boolean z8 = this.t;
        boolean z9 = this.u;
        long j4 = this.v;
        int i7 = this.w;
        int i8 = this.x;
        int i9 = this.y;
        boolean z10 = this.z;
        String str = this.A;
        Long l = this.B;
        long j5 = this.C;
        long j6 = this.D;
        long j7 = this.E;
        Map map = this.F;
        boolean z11 = this.G;
        int i10 = this.H;
        int i11 = this.I;
        int i12 = this.J;
        StringBuilder sb = new StringBuilder("ServerConfig(configTime=");
        sb.append(j);
        sb.append(", blocklistedEvents=");
        sb.append(set);
        sb.append(", blocklistedAttributes=");
        sb.append(set2);
        sb.append(", blocklistedPurchases=");
        sb.append(set3);
        c8$$ExternalSyntheticOutline0.m(i, i2, ", minTimeSinceLastRequest=", ", minTimeSinceLastReport=", sb);
        sb.append(", maxNumToRegister=");
        sb.append(i3);
        sb.append(", geofencesEnabledSet=");
        sb.append(z);
        sb.append(", geofencesEnabled=");
        sb.append(z2);
        sb.append(", isContentCardsFeatureEnabled=");
        sb.append(z3);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, ", messagingSessionTimeout=", j2, ", ephemeralEventsEnabled=");
        af$$ExternalSyntheticOutline0.m(sb, z4, ", featureFlagsEnabled=", z5, ", featureFlagsRefreshRateLimit=");
        sb.append(i4);
        sb.append(", pushMaxEnabled=");
        sb.append(z6);
        sb.append(", pushMaxRedeliverBuffer=");
        sb.append(j3);
        sb.append(", globalRequestRateLimitEnabled=");
        sb.append(z7);
        c8$$ExternalSyntheticOutline0.m(i5, i6, ", globalRequestRateLimitBucketRefillRate=", ", globalRequestRateLimitBucketCapacity=", sb);
        sb.append(", isDustFeatureEnabled=");
        sb.append(z8);
        sb.append(", dustShouldBlockCcRefresh=");
        sb.append(z9);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, ", pushMaxRedeliverDedupeBuffer=", j4, ", defaultBackoffMinSleepMs=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i7, i8, ", defaultBackoffMaxSleepMs=", ", defaultBackoffScaleFactor=", sb);
        sb.append(i9);
        sb.append(", sdkDebuggerEnabled=");
        sb.append(z10);
        sb.append(", sdkDebuggerAuthCode=");
        sb.append(str);
        sb.append(", sdkDebuggerExpirationTime=");
        sb.append(l);
        sb.append(", sdkDebuggerFlushIntervalBytes=");
        sb.append(j5);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, ", sdkDebuggerFlushIntervalSeconds=", j6, ", sdkDebuggerMaxPayloadBytes=");
        sb.append(j7);
        sb.append(", globalRequestRateLimitOverrides=");
        sb.append(map);
        sb.append(", bannersEnabled=");
        sb.append(z11);
        sb.append(", maxBannerPlacements=");
        sb.append(i10);
        c8$$ExternalSyntheticOutline0.m(i11, i12, ", dismissalsCacheSize=", ", minimumSessionTimeoutSeconds=", sb);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public af(JSONObject jSONObject) {
        this();
        jSONObject.getClass();
        this.a = jSONObject.optLong(CrashHianalyticsData.TIME, 0L);
        this.k = jSONObject.optLong("messaging_session_timeout", -1L);
        this.J = jSONObject.optInt("minimum_session_timeout", -1);
        this.b = a(jSONObject, "events_blacklist");
        this.c = a(jSONObject, "attributes_blacklist");
        this.d = a(jSONObject, "purchases_blacklist");
        b(jSONObject);
        f(jSONObject);
        d(jSONObject);
        e(jSONObject);
        i(jSONObject);
        h(jSONObject);
        c(jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("request_backoff");
        if (jSONObjectOptJSONObject != null) {
            this.w = jSONObjectOptJSONObject.optInt("min_sleep_duration_ms", this.w);
            this.x = jSONObjectOptJSONObject.optInt("max_sleep_duration_ms", this.x);
            this.y = jSONObjectOptJSONObject.optInt("scale_factor", this.y);
        }
        j(jSONObject);
        a(jSONObject);
    }

    public static final String k(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("sdkDebuggerObject contains invalid values. Disabling SDK debugging. ", jSONObject);
    }

    public final void h(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
            if (jSONObjectOptJSONObject != null) {
                if (!jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED)) {
                    this.q = false;
                    return;
                }
                int i = jSONObjectOptJSONObject.getInt("refill_rate");
                int i2 = jSONObjectOptJSONObject.getInt("capacity");
                if (i2 < 10) {
                    this.q = false;
                } else {
                    if (i <= 0) {
                        return;
                    }
                    this.q = true;
                    this.s = i2;
                    this.r = i;
                    g(jSONObjectOptJSONObject);
                }
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(12), 4, (Object) null);
            this.q = false;
            this.F = null;
        }
    }

    public final void j(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sdk_debugger");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        try {
            ce ceVarA = ge.k.a(jSONObjectOptJSONObject, false);
            if (ceVarA.a) {
                this.z = true;
                this.A = ceVarA.c;
                Long l = ceVarA.b;
                if (l != null) {
                    this.B = Long.valueOf(l.longValue());
                }
                this.C = ceVarA.d;
                this.D = ceVarA.e;
                this.E = ceVarA.f;
            }
            String str = this.A;
            if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) && this.C > 0 && this.D > 0 && this.E > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObjectOptJSONObject, 1), 7, (Object) null);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(15), 4, (Object) null);
        }
        this.z = false;
        this.A = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if (this.a != afVar.a) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, afVar.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, afVar.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, afVar.d}, getCieXyz.write())).booleanValue() || this.e != afVar.e || this.f != afVar.f || this.g != afVar.g || this.h != afVar.h || this.i != afVar.i || this.j != afVar.j || this.k != afVar.k || this.l != afVar.l || this.m != afVar.m || this.n != afVar.n || this.f13o != afVar.f13o || this.p != afVar.p || this.q != afVar.q || this.r != afVar.r || this.s != afVar.s || this.t != afVar.t || this.u != afVar.u || this.v != afVar.v || this.w != afVar.w || this.x != afVar.x || this.y != afVar.y || this.z != afVar.z) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A, afVar.A}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.B, afVar.B}, getCieXyz.write())).booleanValue() || this.C != afVar.C || this.D != afVar.D || this.E != afVar.E) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.F, afVar.F}, getCieXyz.write())).booleanValue() && this.G == afVar.G && this.H == afVar.H && this.I == afVar.I && this.J == afVar.J;
    }

    public static final String b() {
        return "Error getting required content cards fields. Using defaults.";
    }

    public static final String d() {
        return "Error getting required ephemeral events fields. Using defaults.";
    }

    public static final String c() {
        return "Error getting required DUST enabled field. Using default of false.";
    }

    public static final String e() {
        return "Error getting required feature flag fields. Disabling feature flags.";
    }

    public static final String i() {
        return "Error getting required SDK debugging fields. Disabling SDK debugging.";
    }

    public static final String f() {
        return "Error getting required geofence fields. Using defaults.";
    }

    public static final String h() {
        return "Error getting required push max fields. Disabling push max.";
    }

    public static final String a(af afVar) {
        return d$$ExternalSyntheticOutline0.m(afVar.H, "Banners enabled but maxBannerPlacement is ", ". Not enabling banners.");
    }

    public static final String a() {
        return "Error getting required banner configuration fields. Disabling banners.";
    }

    public static HashSet a(JSONObject jSONObject, String str) {
        Iterator verifyorientationstatuslambda1;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                verifyorientationstatuslambda1 = getContentCardsActionListener.IconCompatParcelizer;
            } else {
                Object[] objArr = {0, Integer.valueOf(jSONArrayOptJSONArray.length())};
                int iWrite = BackspaceCommand.write();
                verifyorientationstatuslambda1 = new verifyOrientationStatuslambda1(new verifyOrientationStatuslambda3(resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite)), new ye(jSONArrayOptJSONArray)), new ze(jSONArrayOptJSONArray)));
            }
            while (verifyorientationstatuslambda1.hasNext()) {
                hashSet.add((String) verifyorientationstatuslambda1.next());
            }
        }
        return hashSet;
    }

    public static final String g() {
        return "Caught error parsing global rate limit config.";
    }

    public af() {
        int i = df.f;
        int i2 = df.g;
        this.a = 0L;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = -1L;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.f13o = false;
        this.p = ConstantsKt.DEFAULT_PROFILE_TTL;
        this.q = true;
        this.r = 30;
        this.s = 30;
        this.t = false;
        this.u = false;
        this.v = -1L;
        this.w = i;
        this.x = i2;
        this.y = 3;
        this.z = false;
        this.A = null;
        this.B = null;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = null;
        this.G = false;
        this.H = 0;
        this.I = 200;
        this.J = -1;
    }
}
