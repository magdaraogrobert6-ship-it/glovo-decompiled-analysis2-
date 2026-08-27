package o;

import fwfd.com.fwfsdk.util.FWFHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaAehyDrn9SAAf5LYIl01vDDsSLM implements migrateTriggersReeligibilityToJsonlambda0 {
    private final String write;

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("file_name", this.write);
        jSONObject.putOpt("os", FWFHelper.fwfDeviceOS);
        return jSONObject.toString();
    }

    public r8lambdaAehyDrn9SAAf5LYIl01vDDsSLM(String str) {
        this.write = str;
    }
}
