package bo.app;

import com.braze.Constants;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hc extends n1 {
    public static final /* synthetic */ int j = 0;
    public final boolean i;

    public hc(JSONObject jSONObject, String str) {
        super(e8.PUSH_ACTION_BUTTON_CLICKED, jSONObject, 0.0d, 12);
        Object[] objArr = {str, Constants.BRAZE_PUSH_ACTION_TYPE_NONE};
        this.i = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
