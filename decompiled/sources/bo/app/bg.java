package bo.app;

import android.content.Context;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.requestDisplayInAppMessagelambda7;
import o.resetAfterInAppMessageCloselambda2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bg extends ch {
    public final i9 g;
    public final String h;
    public final ArrayList i;
    public long j;

    @Override // bo.app.ah, com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        try {
            JSONObject jSONObjectForJsonPut = super.forJsonPut();
            if (jSONObjectForJsonPut == null) {
                return null;
            }
            jSONObjectForJsonPut.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.h);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fd fdVar = (fd) obj;
                int iOrdinal = fdVar.a.ordinal();
                if (iOrdinal == 0) {
                    jSONArray2.put(fdVar.b);
                } else if (iOrdinal == 1) {
                    jSONArray.put(fdVar.b);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONArray3.put(fdVar.b);
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            jSONObjectForJsonPut.put(RemoteMessageConst.DATA, jSONObject);
            return jSONObjectForJsonPut;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(27), 4, (Object) null);
            return null;
        }
    }

    public static final String b() {
        return "Could not convert TemplatedTriggeredAction to JSON";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(JSONObject jSONObject, i9 i9Var) throws JSONException {
        super(jSONObject);
        jSONObject.getClass();
        i9Var.getClass();
        this.i = new ArrayList();
        this.j = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 3), 7, (Object) null);
        this.g = i9Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.DATA);
        String string = jSONObject2.getString(InAppMessageBase.TRIGGER_ID);
        string.getClass();
        this.h = string;
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("prefetch_image_urls");
        if (jSONArrayOptJSONArray != null) {
            a(jSONArrayOptJSONArray, gd.IMAGE);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("prefetch_zip_urls");
        if (jSONArrayOptJSONArray2 != null) {
            a(jSONArrayOptJSONArray2, gd.ZIP);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("prefetch_file_urls");
        if (jSONArrayOptJSONArray3 != null) {
            a(jSONArrayOptJSONArray3, gd.FILE);
        }
    }

    public final void a(JSONArray jSONArray, gd gdVar) {
        Object[] objArr = {0, Integer.valueOf(jSONArray.length())};
        int iWrite = BackspaceCommand.write();
        requestDisplayInAppMessagelambda7 requestdisplayinappmessagelambda7 = resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite)), new zf(jSONArray));
        ag agVar = new ag(jSONArray);
        Iterator it = requestdisplayinappmessagelambda7.iterator();
        while (it.hasNext()) {
            this.i.add(new fd(gdVar, (String) agVar.invoke(it.next())));
        }
    }

    @Override // bo.app.ga
    public final ArrayList a() {
        return new ArrayList(this.i);
    }

    public static final String a(JSONObject jSONObject) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Parsing templated triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    @Override // bo.app.ga
    public final void a(Context context, z7 z7Var, da daVar, long j) {
        context.getClass();
        z7Var.getClass();
        daVar.getClass();
        this.j = j;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(7, this), 7, (Object) null);
        h2 h2Var = (h2) this.g;
        h2Var.getClass();
        h2Var.a(new yf(h2Var.f, h2Var.e.getBaseUrlForRequests(), this, daVar, h2Var.b));
    }

    public static final String a(bg bgVar) {
        return d$$ExternalSyntheticOutline0.m(bgVar.b.d, "Posting templating request after delay of ", " seconds.");
    }
}
