package com.braze.models;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.l;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import o.SweepGradientShader9KIMszodefault;
import o.isCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Banner implements IPutIntoJson<JSONObject>, IPropertiesObject {
    public static final String BANNER_KEY = "banner";
    public static final l Companion = new l();
    public static final String EXPIRATION = "expires_at";
    public static final String HTML = "html";
    public static final String IS_CONTROL = "is_control";
    public static final String IS_TEST_SEND = "is_test_send";
    public static final String PLACEMENT_ID = "placement_id";
    public static final String STABLE_KEY = "stable_key";
    public static final String TRACKING_ID = "id";
    private final long expirationTimestampSeconds;
    private final String html;
    private final boolean isControl;
    private final boolean isTestSend;
    private final String placementId;
    private final JSONObject properties;
    private final String stableKey;
    private final String trackingId;
    private String userId;

    public final long getExpirationTimestampSeconds() {
        return this.expirationTimestampSeconds;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    @Override // com.braze.models.IPropertiesObject
    public JSONObject getProperties() {
        return this.properties;
    }

    public final String getStableKey() {
        return this.stableKey;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isControl() {
        return this.isControl;
    }

    public final boolean isTestSend() {
        return this.isTestSend;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Caught exception creating Banner Json.";
    }

    public final Banner deepcopy$android_sdk_base_release() {
        return new Banner(this.trackingId, this.placementId, this.html, this.isControl, this.expirationTimestampSeconds, this.isTestSend, this.stableKey, getProperties());
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", this.trackingId);
            jSONObject2.put(PLACEMENT_ID, this.placementId);
            jSONObject2.put(HTML, this.html);
            jSONObject2.put("is_control", this.isControl);
            jSONObject2.put(EXPIRATION, this.expirationTimestampSeconds);
            jSONObject2.put("is_test_send", this.isTestSend);
            String str = this.stableKey;
            if (str != null) {
                jSONObject2.put(STABLE_KEY, str);
            }
            jSONObject2.put("properties", getProperties());
            jSONObject.put(BANNER_KEY, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(0), 4, (Object) null);
            return jSONObject;
        }
    }

    public String toString() {
        String str = this.trackingId;
        String str2 = this.placementId;
        String str3 = this.html;
        boolean z = this.isControl;
        long j = this.expirationTimestampSeconds;
        boolean z2 = this.isTestSend;
        String str4 = this.stableKey;
        JSONObject properties = getProperties();
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("\n        Banner{\n        trackingId='", str, "'\n        placementId='", str2, "'\n        html='");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(str3, "'\n        isControl=", "\n        expirationTimestampSeconds=", sbM, z);
        sbM.append(j);
        sbM.append("\n        isTestSend=");
        sbM.append(z2);
        sbM.append("\n        stableKey='");
        sbM.append(str4);
        sbM.append("'\n        properties=");
        sbM.append(properties);
        sbM.append("\n        }\n        ");
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sbM.toString());
    }

    public Banner(String str, String str2, String str3, boolean z, long j, boolean z2, String str4, JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        jSONObject.getClass();
        this.trackingId = str;
        this.placementId = str2;
        this.html = str3;
        this.isControl = z;
        this.expirationTimestampSeconds = j;
        this.isTestSend = z2;
        this.stableKey = str4;
        this.properties = jSONObject;
    }

    public final boolean isExpired() {
        long j = this.expirationTimestampSeconds;
        return j != -1 && j < DateTimeUtils.nowInSeconds();
    }
}
