package bo.app;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class wa extends ch {
    public final InAppMessageBase g;
    public final JSONObject h;
    public final i9 i;

    @Override // bo.app.ah, com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObjectForJsonPut = super.forJsonPut();
            if (jSONObjectForJsonPut != null) {
                InAppMessageBase inAppMessageBase = this.g;
                jSONObjectForJsonPut.put(RemoteMessageConst.DATA, inAppMessageBase != null ? inAppMessageBase.forJsonPut() : null);
                jSONObjectForJsonPut.put("type", "inapp");
                return jSONObjectForJsonPut;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String b(wa waVar) {
        return d$$ExternalSyntheticOutline0.m(waVar.b.d, "Attempting to publish in-app message after delay of ", " seconds.");
    }

    @Override // bo.app.ga
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        InAppMessageBase inAppMessageBase = this.g;
        List<String> remoteAssetPathsForPrefetch = inAppMessageBase != null ? inAppMessageBase.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(1), 7, (Object) null);
            return arrayList;
        }
        InAppMessageBase inAppMessageBase2 = this.g;
        MessageType messageType = inAppMessageBase2 != null ? inAppMessageBase2.getMessageType() : null;
        int i = messageType == null ? -1 : va.a[messageType.ordinal()];
        if (i == 1) {
            arrayList.add(new fd(gd.ZIP, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i == 2 || i == 3 || i == 4) {
            arrayList.add(new fd(gd.IMAGE, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda0(this, 1), 6, (Object) null);
            return arrayList;
        }
        Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
        while (it.hasNext()) {
            arrayList.add(new fd(gd.FILE, it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(JSONObject jSONObject, i9 i9Var) throws JSONException {
        super(jSONObject);
        jSONObject.getClass();
        i9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 9), 6, (Object) null);
        JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.DATA);
        this.i = i9Var;
        this.h = jSONObject2;
        jSONObject2.getClass();
        InAppMessageBase inAppMessageBaseA = com.braze.support.i.a(jSONObject2, i9Var);
        this.g = inAppMessageBaseA;
        if (inAppMessageBaseA != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(2), 6, (Object) null);
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse in-app message triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject)));
        throw null;
    }

    public static final String c(da daVar) {
        return "Cannot perform triggered action for " + daVar + " due to in-app message json being null";
    }

    public static final String d(da daVar) {
        return "Cannot perform triggered action for " + daVar + " due to deserialized in-app message being null";
    }

    public static final String b() {
        return "In-app message has no remote assets for prefetch. Returning empty list.";
    }

    public static final String c() {
        return "Failed to parse in-app message triggered action.";
    }

    public static final String d() {
        return "Caught exception while performing triggered action.";
    }

    public static final String a(wa waVar) {
        InAppMessageBase inAppMessageBase = waVar.g;
        return "Failed to return remote paths to assets for type: " + (inAppMessageBase != null ? inAppMessageBase.getMessageType() : null);
    }

    public static final String a(JSONObject jSONObject) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Attempting to parse in-app message triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    @Override // bo.app.ga
    public final void a(Context context, z7 z7Var, da daVar, long j) {
        context.getClass();
        z7Var.getClass();
        daVar.getClass();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda0(this, 0), 7, (Object) null);
            JSONObject jSONObject = this.h;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new vg$$ExternalSyntheticLambda7(daVar, 3), 6, (Object) null);
                return;
            }
            InAppMessageBase inAppMessageBaseA = com.braze.support.i.a(jSONObject, this.i);
            String strA = daVar.a();
            int i = dg.e;
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{strA, "test"}, iWrite3)).booleanValue()) {
                if (inAppMessageBaseA != null) {
                    inAppMessageBaseA.setTestSend(true);
                }
                this.h.put("is_test_send", true);
            }
            if (inAppMessageBaseA == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new vg$$ExternalSyntheticLambda7(daVar, 4), 6, (Object) null);
                return;
            }
            inAppMessageBaseA.setLocalPrefetchedAssetPaths(onMove.serializer(this.f));
            inAppMessageBaseA.setExpirationTimestamp(j);
            z7Var.b(new ta(daVar, this, inAppMessageBaseA, ((h2) this.i).b), ta.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(0), 4, (Object) null);
        }
    }
}
