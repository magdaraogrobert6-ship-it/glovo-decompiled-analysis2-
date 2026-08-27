package bo.app;

import com.braze.Constants;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public static final g9 a(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        bigDecimal.getClass();
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        jSONObject.put(Constants.BRAZE_PUSH_PRIORITY_KEY, scale.doubleValue());
        jSONObject.put("q", i);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObject.put("pr", brazeProperties.forJsonPut());
        }
        return new n1(e8.PURCHASE, jSONObject, 0.0d, 12);
    }

    public static final g9 d(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", str);
        if (str2 != null && str2.length() > 0) {
            jSONObjectPut.put("bid", str2);
        }
        e8 e8Var = e8.BANNER_CLICK_EVENT;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 f(String str, String str2) throws JSONException {
        hf hfVar;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("name");
        d8 d8Var = e8.b;
        string.getClass();
        d8Var.getClass();
        Object obj = e8.c.get(string);
        if (obj == null) {
            obj = e8.UNKNOWN;
        }
        e8 e8Var = (e8) obj;
        JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.DATA);
        double d = jSONObject.getDouble(CrashHianalyticsData.TIME);
        String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
        String optionalString2 = JsonUtils.getOptionalString(jSONObject, "session_id");
        jSONObject2.getClass();
        e8Var.getClass();
        str2.getClass();
        n1 n1Var = new n1(e8Var, jSONObject2, d, str2);
        n1Var.e.setValue(n1Var, n1.h[0], optionalString);
        if (optionalString2 != null) {
            UUID uuidFromString = UUID.fromString(optionalString2);
            uuidFromString.getClass();
            hfVar = new hf(uuidFromString);
        } else {
            hfVar = null;
        }
        n1Var.a(hfVar);
        return n1Var;
    }

    public static final g9 h(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("geo_id", str).put("event_type", str2);
        e8 e8Var = e8.GEOFENCE;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 j(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new n1(e8.CONTENT_CARDS_DISMISS, jSONObject, 0.0d, 12);
    }

    public static final g9 l(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new n1(e8.CONTENT_CARDS_IMPRESSION, jSONObject, 0.0d, 12);
    }

    public static final g9 n(String str, String str2) {
        return new n1(e8.INAPP_MESSAGE_IMPRESSION, n1.g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final g9 p(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, str).put(Constants.BRAZE_PUSH_CONTENT_KEY, str2);
        e8 e8Var = e8.PUSH_STORY_PAGE_CLICK;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 r(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", str2);
        e8 e8Var = e8.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 t(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CONTENT_KEY, str).put("l", str2);
        e8 e8Var = e8.USER_ALIAS;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public final g9 e(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 7));
    }

    public final g9 g(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 10));
    }

    public final g9 i(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 14));
    }

    public final g9 o(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 8));
    }

    public final g9 q(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 9));
    }

    public final g9 s(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 11));
    }

    public static final g9 b(Throwable th, hf hfVar, boolean z) throws JSONException {
        String str;
        String name = th.getClass().getName();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (hfVar != null) {
            str = "session_id: " + hfVar;
        } else {
            str = null;
        }
        n1.g.getClass();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        string.getClass();
        String strWrite = hideCurrentlyDisplayingInAppMessage.write(5000, string);
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("\n                original_sdk_version: 42.3.1\n                exception_class: ", iAvailableProcessors, name, "\n                available_cpus: ", "\n                ");
        sbM.append(str);
        sbM.append("\n                ");
        sbM.append(strWrite);
        sbM.append("\n                ");
        JSONObject jSONObjectPut = new JSONObject().put("e", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sbM.toString()));
        if (!z) {
            jSONObjectPut.put("nop", true);
        }
        e8 e8Var = e8.INTERNAL_ERROR;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public final g9 c(String str) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda2(str, 10));
    }

    public final g9 k(String str) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda2(str, 12));
    }

    public final g9 m(String str, String str2) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 15));
    }

    public final g9 c(String str, String str2) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 13));
    }

    public final g9 k(String str, String str2) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 12));
    }

    public final g9 m(String str) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda2(str, 9));
    }

    public final g9 e(String str) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda2(str, 13));
    }

    public final g9 g(String str) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda2(str, 7));
    }

    public final g9 i(String str) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda2(str, 8));
    }

    public final g9 o(String str) {
        return a(new ig$$ExternalSyntheticLambda2(str, 14));
    }

    public static final g9 n(String str) {
        return new n1(e8.INAPP_MESSAGE_CLICK, n1.g.a(str, (String) null, (String) null), 0.0d, 12);
    }

    public static final g9 j(String str, String str2) {
        return new n1(e8.INAPP_MESSAGE_BUTTON_CLICK, n1.g.a(str, str2, (String) null), 0.0d, 12);
    }

    public static final g9 l(String str, String str2) {
        return new n1(e8.INAPP_MESSAGE_CONTROL_IMPRESSION, n1.g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final g9 h(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new n1(e8.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject, 0.0d, 12);
    }

    public static final g9 p(String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str);
        e8 e8Var = e8.LOCATION_CUSTOM_ATTRIBUTE_REMOVE;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 d(String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("ids", JsonUtils.constructJsonArray(new String[]{str}));
        e8 e8Var = e8.BANNER_IMPRESSION_EVENT;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public final g9 a(final String str, final String str2, final BigDecimal bigDecimal, final int i, final BrazeProperties brazeProperties) {
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        return a(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.m1$$ExternalSyntheticLambda22
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return m1.a(brazeProperties, str, str2, bigDecimal, i);
            }
        });
    }

    public final g9 a(String str, BrazeProperties brazeProperties) {
        str.getClass();
        return a(new m1$$ExternalSyntheticLambda20(str, brazeProperties, 0));
    }

    public final g9 a(IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        return a(new f2$$ExternalSyntheticLambda1(iBrazeLocation, 1));
    }

    public final g9 a(Throwable th, hf hfVar, boolean z) {
        th.getClass();
        return a(new m1$$ExternalSyntheticLambda28(th, hfVar, z, 0));
    }

    public final g9 a(FeatureFlag featureFlag) {
        featureFlag.getClass();
        return a(new m1$$ExternalSyntheticLambda25(featureFlag, 0));
    }

    public final g9 a(String str) {
        str.getClass();
        return a(new ig$$ExternalSyntheticLambda2(str, 11));
    }

    public final g9 a(String str, int i) {
        str.getClass();
        return a(new m1$$ExternalSyntheticLambda18(str, i, 0));
    }

    public final g9 a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new ig$$ExternalSyntheticLambda1(str, str2, 6));
    }

    public final g9 a(String str, String[] strArr) {
        str.getClass();
        return a(new n$$ExternalSyntheticLambda2(str, 7, strArr));
    }

    public final g9 a(hf hfVar) {
        hfVar.getClass();
        return a(new h$$ExternalSyntheticLambda0(16, hfVar));
    }

    public final g9 a(long j) {
        return a(new b2$$ExternalSyntheticLambda3(j, 5));
    }

    public final g9 a(String str, double d, double d2) {
        str.getClass();
        return a(new m1$$ExternalSyntheticLambda16(d, d2, 0, str));
    }

    public final g9 a(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        return a(new m1$$ExternalSyntheticLambda7(jSONObject, str, 0));
    }

    public final g9 a(String str, vf vfVar) {
        str.getClass();
        vfVar.getClass();
        return a(new n$$ExternalSyntheticLambda2(str, 8, vfVar));
    }

    public final JSONObject a(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("bid", str2);
        }
        if (str3 != null) {
            jSONObject.put(InAppMessageBase.MESSAGE_EXTRAS, str3);
            return jSONObject;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(27), 6, (Object) null);
        return jSONObject;
    }

    public static final String a() {
        return "Message extras are null, not adding to event";
    }

    public final g9 a(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        try {
            return (g9) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(26), 4, (Object) null);
            return null;
        }
    }

    public static final g9 f(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new n1(e8.CONTENT_CARDS_CLICK, jSONObject, 0.0d, 12);
    }

    public static final g9 b(IBrazeLocation iBrazeLocation) {
        return new n1(e8.LOCATION_RECORDED, iBrazeLocation.forJsonPut(), 0.0d, 12);
    }

    public static final g9 b(String str, BrazeProperties brazeProperties) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, str);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObjectPut.put(Constants.BRAZE_PUSH_PRIORITY_KEY, brazeProperties.forJsonPut());
        }
        e8 e8Var = e8.CUSTOM_EVENT;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 b(FeatureFlag featureFlag) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("fid", featureFlag.getId()).put(FeatureFlag.TRACKING_STRING, featureFlag.getTrackingString$android_sdk_base_release());
        e8 e8Var = e8.FEATURE_FLAG_IMPRESSION_EVENT;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 b(String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", str);
        e8 e8Var = e8.BANNER_DISMISS_EVENT;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 b(String str, int i) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", i);
        e8 e8Var = e8.INCREMENT;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 b(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", str2);
        e8 e8Var = e8.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 b(String str, String[] strArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        if (strArr == null) {
            jSONObject.put("value", JSONObject.NULL);
        } else {
            jSONObject.put("value", JsonUtils.constructJsonArray(strArr));
        }
        return new n1(e8.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject, 0.0d, 12);
    }

    public static final g9 b(hf hfVar) {
        n1 n1Var = new n1(e8.SESSION_START, (JSONObject) null, 0.0d, 14);
        n1Var.a(hfVar);
        return n1Var;
    }

    public static final g9 b(long j) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, j);
        e8 e8Var = e8.SESSION_END;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 b(String str, double d, double d2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("latitude", d).put("longitude", d2);
        e8 e8Var = e8.LOCATION_CUSTOM_ATTRIBUTE_ADD;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 b(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", jSONObject);
        e8 e8Var = e8.NESTED_CUSTOM_ATTRIBUTE_MERGE;
        jSONObjectPut.getClass();
        return new n1(e8Var, jSONObjectPut, 0.0d, 12);
    }

    public static final g9 b(String str, vf vfVar) throws JSONException {
        String str2;
        JSONObject jSONObjectPut = new JSONObject().put("group_id", str);
        int iOrdinal = vfVar.ordinal();
        if (iOrdinal == 0) {
            str2 = "subscribed";
        } else if (iOrdinal == 1) {
            str2 = "unsubscribed";
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("status", str2);
        e8 e8Var = e8.SUBSCRIPTION_GROUP_UPDATE;
        jSONObjectPut2.getClass();
        return new n1(e8Var, jSONObjectPut2, 0.0d, 12);
    }

    public static final String b() {
        return "Failed to create event";
    }
}
