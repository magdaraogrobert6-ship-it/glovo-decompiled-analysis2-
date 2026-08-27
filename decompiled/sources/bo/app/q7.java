package bo.app;

import com.braze.Constants;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q7 {
    public static String a(g9 g9Var) throws JSONException {
        g9Var.getClass();
        int i = kc.i;
        n1 n1Var = (n1) g9Var;
        String string = n1Var.b.getString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        string.getClass();
        return n1Var.a + string;
    }
}
