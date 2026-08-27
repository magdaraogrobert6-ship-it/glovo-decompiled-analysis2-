package com.braze.models;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.v1;
import bo.app.w1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.getAppropriateFullView;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.onCloseClicked;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Serializable
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    public static final String ANALYTICS_ENABLED_ENTER = "analytics_enabled_enter";
    public static final String ANALYTICS_ENABLED_EXIT = "analytics_enabled_exit";
    public static final String COOLDOWN_ENTER_SECONDS = "cooldown_enter";
    public static final String COOLDOWN_EXIT_SECONDS = "cooldown_exit";
    public static final w1 Companion = new w1();
    public static final int DEFAULT_NOTIFICATION_RESPONSIVENESS_MS = 30000;
    public static final String ENTER_EVENTS = "enter_events";
    public static final String EXIT_EVENTS = "exit_events";
    public static final String ID = "id";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String NOTIFICATION_RESPONSIVENESS_MS = "notification_responsiveness";
    public static final String RADIUS_METERS = "radius";
    private final boolean analyticsEnabledEnter;
    private final boolean analyticsEnabledExit;
    private final int cooldownEnterSeconds;
    private final int cooldownExitSeconds;
    private double distanceFromGeofenceRefresh;
    private final boolean enterEvents;
    private final boolean exitEvents;
    private final String id;
    private final JSONObject jsonObject;
    private final double latitude;
    private final double longitude;
    private final int notificationResponsivenessMs;
    private final int radiusMeter;

    @getAppropriateFullView(serializer = ANALYTICS_ENABLED_ENTER)
    public static /* synthetic */ void getAnalyticsEnabledEnter$annotations() {
    }

    @getAppropriateFullView(serializer = ANALYTICS_ENABLED_EXIT)
    public static /* synthetic */ void getAnalyticsEnabledExit$annotations() {
    }

    @getAppropriateFullView(serializer = COOLDOWN_ENTER_SECONDS)
    public static /* synthetic */ void getCooldownEnterSeconds$annotations() {
    }

    @getAppropriateFullView(serializer = COOLDOWN_EXIT_SECONDS)
    public static /* synthetic */ void getCooldownExitSeconds$annotations() {
    }

    @getAppropriateFullView(serializer = ENTER_EVENTS)
    public static /* synthetic */ void getEnterEvents$annotations() {
    }

    @getAppropriateFullView(serializer = EXIT_EVENTS)
    public static /* synthetic */ void getExitEvents$annotations() {
    }

    @getAppropriateFullView(serializer = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getJsonObject$annotations() {
    }

    @getAppropriateFullView(serializer = "latitude")
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @getAppropriateFullView(serializer = "longitude")
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @getAppropriateFullView(serializer = NOTIFICATION_RESPONSIVENESS_MS)
    public static /* synthetic */ void getNotificationResponsivenessMs$annotations() {
    }

    @getAppropriateFullView(serializer = RADIUS_METERS)
    public static /* synthetic */ void getRadiusMeter$annotations() {
    }

    public final boolean getAnalyticsEnabledEnter() {
        return this.analyticsEnabledEnter;
    }

    public final boolean getAnalyticsEnabledExit() {
        return this.analyticsEnabledExit;
    }

    public final int getCooldownEnterSeconds() {
        return this.cooldownEnterSeconds;
    }

    public final int getCooldownExitSeconds() {
        return this.cooldownExitSeconds;
    }

    public final double getDistanceFromGeofenceRefresh() {
        return this.distanceFromGeofenceRefresh;
    }

    public final boolean getEnterEvents() {
        return this.enterEvents;
    }

    public final boolean getExitEvents() {
        return this.exitEvents;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getNotificationResponsivenessMs() {
        return this.notificationResponsivenessMs;
    }

    public final int getRadiusMeter() {
        return this.radiusMeter;
    }

    public final double getRadiusMeters() {
        return this.radiusMeter;
    }

    public final void setDistanceFromGeofenceRefresh(double d) {
        this.distanceFromGeofenceRefresh = d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BrazeGeofence(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("id");
        string.getClass();
        this(jSONObject, string, jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude"), jSONObject.getInt(RADIUS_METERS), jSONObject.getInt(COOLDOWN_ENTER_SECONDS), jSONObject.getInt(COOLDOWN_EXIT_SECONDS), jSONObject.getBoolean(ANALYTICS_ENABLED_ENTER), jSONObject.getBoolean(ANALYTICS_ENABLED_EXIT), jSONObject.optBoolean(ENTER_EVENTS, true), jSONObject.optBoolean(EXIT_EVENTS, true), jSONObject.optInt(NOTIFICATION_RESPONSIVENESS_MS, 30000));
    }

    public int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.latitude, af$$ExternalSyntheticOutline0.m(this.jsonObject.hashCode() * 31, 31, this.id), 31), 31);
        int i = this.radiusMeter;
        int i2 = this.cooldownEnterSeconds;
        return Double.hashCode(getRadiusMeters()) + ((d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((((((iRemoteActionCompatParcelizer + i) * 31) + i2) * 31) + this.cooldownExitSeconds) * 31, 31, this.analyticsEnabledEnter), 31, this.analyticsEnabledExit), 31, this.enterEvents), 31, this.exitEvents) + this.notificationResponsivenessMs) * 31);
    }

    public String toString() {
        String str = this.id;
        double d = this.latitude;
        double d2 = this.longitude;
        int i = this.radiusMeter;
        int i2 = this.cooldownEnterSeconds;
        int i3 = this.cooldownExitSeconds;
        boolean z = this.analyticsEnabledEnter;
        boolean z2 = this.analyticsEnabledExit;
        boolean z3 = this.enterEvents;
        boolean z4 = this.exitEvents;
        int i4 = this.notificationResponsivenessMs;
        double d3 = this.distanceFromGeofenceRefresh;
        StringBuilder sb = new StringBuilder("BrazeGeofence{id=");
        sb.append(str);
        sb.append(", \n            |latitude, longitude=(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append("),\n            |radiusMeters=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i, i2, ", \n            |cooldownEnterSeconds=", ", \n            |cooldownExitSeconds=", sb);
        sb.append(i3);
        sb.append(", \n            |analyticsEnabledEnter=");
        sb.append(z);
        sb.append(", \n            |analyticsEnabledExit=");
        af$$ExternalSyntheticOutline0.m(sb, z2, ", \n            |enterEvents=", z3, ", \n            |exitEvents=");
        sb.append(z4);
        sb.append(", \n            |notificationResponsivenessMs=");
        sb.append(i4);
        sb.append(", \n            |distanceFromGeofenceRefresh=");
        sb.append(d3);
        sb.append(" }\n            |\n        ");
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString());
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(BrazeGeofence brazeGeofence, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, brazeGeofence.id);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, brazeGeofence.latitude);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, brazeGeofence.longitude);
        defaultInAppMessageSlideupViewFactory.write(3, brazeGeofence.radiusMeter, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactory.write(4, brazeGeofence.cooldownEnterSeconds, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactory.write(5, brazeGeofence.cooldownExitSeconds, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, brazeGeofence.analyticsEnabledEnter);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, brazeGeofence.analyticsEnabledExit);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, brazeGeofence.enterEvents);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, brazeGeofence.exitEvents);
        defaultInAppMessageSlideupViewFactory.write(10, brazeGeofence.notificationResponsivenessMs, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && Double.compare(brazeGeofence.distanceFromGeofenceRefresh, -1.0d) == 0) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, brazeGeofence.distanceFromGeofenceRefresh);
    }

    @Override // java.lang.Comparable
    public int compareTo(BrazeGeofence brazeGeofence) {
        brazeGeofence.getClass();
        double d = this.distanceFromGeofenceRefresh;
        return (d != -1.0d && d < brazeGeofence.distanceFromGeofenceRefresh) ? -1 : 1;
    }

    public final boolean equivalentServerData(BrazeGeofence brazeGeofence) {
        brazeGeofence.getClass();
        try {
            return equals(brazeGeofence);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        return this.jsonObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BrazeGeofence.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        BrazeGeofence brazeGeofence = (BrazeGeofence) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, brazeGeofence.id}, getCieXyz.write())).booleanValue() && this.latitude == brazeGeofence.latitude && this.longitude == brazeGeofence.longitude && this.radiusMeter == brazeGeofence.radiusMeter && this.cooldownEnterSeconds == brazeGeofence.cooldownEnterSeconds && this.cooldownExitSeconds == brazeGeofence.cooldownExitSeconds && this.analyticsEnabledEnter == brazeGeofence.analyticsEnabledEnter && this.analyticsEnabledExit == brazeGeofence.analyticsEnabledExit && this.enterEvents == brazeGeofence.enterEvents && this.exitEvents == brazeGeofence.exitEvents && this.notificationResponsivenessMs == brazeGeofence.notificationResponsivenessMs;
    }

    public BrazeGeofence(JSONObject jSONObject, String str, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        jSONObject.getClass();
        str.getClass();
        this.jsonObject = jSONObject;
        this.id = str;
        this.latitude = d;
        this.longitude = d2;
        this.radiusMeter = i;
        this.cooldownEnterSeconds = i2;
        this.cooldownExitSeconds = i3;
        this.analyticsEnabledEnter = z;
        this.analyticsEnabledExit = z2;
        this.enterEvents = z3;
        this.exitEvents = z4;
        this.notificationResponsivenessMs = i4;
        this.distanceFromGeofenceRefresh = -1.0d;
    }

    public /* synthetic */ BrazeGeofence(JSONObject jSONObject, String str, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new JSONObject() : jSONObject, str, d, d2, i, i2, i3, z, z2, z3, z4, i4);
    }

    public /* synthetic */ BrazeGeofence(int i, String str, double d, double d2, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, double d3, onCloseClicked oncloseclicked) {
        if (2047 == (i & 2047)) {
            this.jsonObject = new JSONObject();
            this.id = str;
            this.latitude = d;
            this.longitude = d2;
            this.radiusMeter = i2;
            this.cooldownEnterSeconds = i3;
            this.cooldownExitSeconds = i4;
            this.analyticsEnabledEnter = z;
            this.analyticsEnabledExit = z2;
            this.enterEvents = z3;
            this.exitEvents = z4;
            this.notificationResponsivenessMs = i5;
            this.distanceFromGeofenceRefresh = (i & Fields.CameraDistance) == 0 ? -1.0d : d3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2047, v1.a.getDescriptor());
        throw null;
    }
}
