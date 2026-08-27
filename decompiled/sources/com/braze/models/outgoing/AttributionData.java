package com.braze.models.outgoing;

import bo.app.k;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AttributionData implements IPutIntoJson<JSONObject> {
    private static final String ADGROUP_KEY = "adgroup";
    private static final String CAMPAIGN_KEY = "campaign";
    private static final String CREATIVE_KEY = "ad";
    public static final k Companion = new k();
    private static final String NETWORK_KEY = "source";
    private final String adGroup;
    private final String campaign;
    private final String creative;
    private final String network;

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.network;
            if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                jSONObject.put(NETWORK_KEY, this.network);
            }
            String str2 = this.campaign;
            if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                jSONObject.put(CAMPAIGN_KEY, this.campaign);
            }
            String str3 = this.adGroup;
            if (str3 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                jSONObject.put(ADGROUP_KEY, this.adGroup);
            }
            String str4 = this.creative;
            if (str4 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                jSONObject.put(CREATIVE_KEY, this.creative);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(3, e), 4, (Object) null);
            return jSONObject;
        }
    }

    public AttributionData(String str, String str2, String str3, String str4) {
        this.network = str;
        this.campaign = str2;
        this.adGroup = str3;
        this.creative = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0(JSONException jSONException) {
        return "Caught exception creating AttributionData Json. " + jSONException;
    }
}
