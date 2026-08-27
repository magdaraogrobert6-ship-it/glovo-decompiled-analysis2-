package bo.app;

import com.braze.support.BrazeLogger;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.huawei.hms.push.constant.RemoteMessageConst;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q9 {
    public static final /* synthetic */ q9 a = new q9();

    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to parse json. Returning unknown.\n", jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007f  */
    public final s9 a(JSONObject jSONObject) throws JSONException {
        String strOptString;
        Long lValueOf;
        String strOptString2;
        jSONObject.getClass();
        String string = jSONObject.getString("type");
        r9 r9Var = r9.UNKNOWN;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, "ccr"}, getCieXyz.write())).booleanValue()) {
            return new e6();
        }
        String str = null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, RemoteMessageConst.TTL}, getCieXyz.write())).booleanValue()) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(PushNotificationParserObj.BODY_KEY);
            if (jSONObjectOptJSONObject != null) {
                long jOptLong = jSONObjectOptJSONObject.optLong("t_ms", -1L);
                lValueOf = Long.valueOf(jOptLong);
                if (jOptLong <= 0) {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            if (jSONObjectOptJSONObject != null && (strOptString2 = jSONObjectOptJSONObject.optString("rcs")) != null && strOptString2.length() > 0) {
                str = strOptString2;
            }
            return new x6(lValueOf, str);
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, "ddr"}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, "ffr"}, getCieXyz.write())).booleanValue()) {
                return new g6();
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, "cir"}, getCieXyz.write())).booleanValue()) {
                return new d6();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new eh$$ExternalSyntheticLambda0(jSONObject, 1), 7, (Object) null);
            return new y6();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(PushNotificationParserObj.BODY_KEY);
        long jOptLong2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optLong("r_ms", 500L) : 500L;
        if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("e")) != null && strOptString.length() > 0) {
            str = strOptString;
        }
        return new f6(jOptLong2, str);
    }
}
