package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class xg {
    public static final xg a = new xg();
    public static final String b = BrazeLogger.getBrazeLogTag((Class<?>) xg.class);

    public static final String c(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Encountered exception processing templated message: ", jSONObject);
    }

    public static final String d(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to deserialize triggered action Json: ", jSONObject);
    }

    public final ch b(JSONObject jSONObject, h2 h2Var) {
        jSONObject.getClass();
        h2Var.getClass();
        try {
            String string = jSONObject.getString("type");
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{string, "inapp"}, iWrite3)).booleanValue()) {
                return new wa(jSONObject, h2Var);
            }
            int iWrite4 = getCieXyz.write();
            int iWrite5 = getCieXyz.write();
            int iWrite6 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{string, "templated_iam"}, iWrite6)).booleanValue()) {
                return new bg(jSONObject, h2Var);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(string, 7), 6, (Object) null);
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 10), 8, (Object) null);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(7), 12, (Object) null);
            } else {
                String string = jSONObjectOptJSONObject.getString("type");
                if (string != null) {
                    switch (string) {
                        case "purchase_property":
                            arrayList.add(new gc(jSONObjectOptJSONObject));
                            break;
                        case "open":
                            arrayList.add(new ob());
                            break;
                        case "test":
                            arrayList.add(new cg());
                            break;
                        case "custom_event_property":
                            arrayList.add(new h4(jSONObjectOptJSONObject));
                            break;
                        case "custom_event":
                            arrayList.add(new f4(jSONObjectOptJSONObject));
                            break;
                        case "iam_click":
                            arrayList.add(new ma(jSONObjectOptJSONObject));
                            break;
                        case "purchase":
                            arrayList.add(new ec(jSONObjectOptJSONObject));
                            break;
                        case "push_click":
                            arrayList.add(new ic(jSONObjectOptJSONObject));
                            break;
                        default:
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(string, 8), 12, (Object) null);
                            break;
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(string, 8), 12, (Object) null);
                }
            }
        }
        return arrayList;
    }

    public static final String c() {
        return "Triggered actions Json array was null. Not de-serializing triggered actions.";
    }

    public static final String c(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Received unknown trigger type: ", str);
    }

    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Reuse-by-id trigger entry missing required id field: ", jSONObject);
    }

    public static final String b() {
        return "Received null or blank trigger condition Json. Not parsing.";
    }

    public static final String b(String str) {
        return ff$$ExternalSyntheticOutline0.m("Received triggered condition Json with unknown type: ", str, ". Not parsing.");
    }

    public static final String a() {
        return "Templated message Json was null. Not de-serializing templated message.";
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Received templated message Json with unknown type: ", str, ". Not parsing.");
    }

    public final wb a(JSONArray jSONArray, h2 h2Var) {
        h2Var.getClass();
        if (jSONArray == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(18), 14, (Object) null);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new xg$$ExternalSyntheticLambda9(i, 0), 12, (Object) null);
            } else {
                String strA = a(jSONObjectOptJSONObject);
                if (strA != null) {
                    arrayList2.add(strA);
                } else {
                    ch chVarB = b(jSONObjectOptJSONObject, h2Var);
                    if (chVarB != null) {
                        arrayList.add(chVarB);
                    }
                }
            }
        }
        return new wb(arrayList, arrayList2);
    }

    public static final String a(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Skipping null or non-object trigger entry at index ", ".");
    }

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("use_response_on_device", false)) {
            return null;
        }
        String strOptString = jSONObject.optString("id");
        strOptString.getClass();
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        if (strOptString != null) {
            return strOptString;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 11), 12, (Object) null);
        return null;
    }

    public static InAppMessageBase a(JSONObject jSONObject, h2 h2Var) {
        h2Var.getClass();
        try {
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(17), 14, (Object) null);
                return null;
            }
            String string = jSONObject.getString("type");
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{string, "inapp"}, iWrite3)).booleanValue()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.DATA);
                if (jSONObject2 == null) {
                    return null;
                }
                return com.braze.support.i.a(jSONObject2, h2Var);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(string, 18), 12, (Object) null);
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new eh$$ExternalSyntheticLambda0(jSONObject, 6), 8, (Object) null);
            return null;
        }
    }
}
