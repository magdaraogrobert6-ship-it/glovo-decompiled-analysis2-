package bo.app;

import com.braze.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class mc extends n1 {
    /* JADX WARN: Illegal instructions before constructor call */
    public mc(String str, long j) throws JSONException {
        str.getClass();
        e8 e8Var = e8.PUSH_DELIVERY_EVENT;
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, str);
        jSONObjectPut.getClass();
        super(e8Var, jSONObjectPut, j, 8);
    }
}
