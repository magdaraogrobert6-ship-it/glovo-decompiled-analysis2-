package bo.app;

import java.util.Map;
import o.IconCompatParcelizer;
import o.SimpleItemTouchHelperCallback;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v9 {
    public final int a;
    public final Map b;
    public final JSONObject c;

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(Integer.hashCode(this.a) * 31, this.b, 31);
        JSONObject jSONObject = this.c;
        return iRemoteActionCompatParcelizer + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.a + ", responseHeaders=" + this.b + ", jsonResponse=" + this.c + ")";
    }

    public v9(int i, Map map, JSONObject jSONObject) {
        map.getClass();
        this.a = i;
        this.b = map;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        if (this.a != v9Var.a) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, v9Var.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, v9Var.c}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ v9(int i, Map map, int i2) {
        this(i, (i2 & 2) != 0 ? SimpleItemTouchHelperCallback.serializer : map, (JSONObject) null);
    }
}
