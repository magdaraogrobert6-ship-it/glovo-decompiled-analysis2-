package bo.app;

import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final JSONObject a;
    public final Long b;
    public final List c;

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Long l = this.b;
        return this.c.hashCode() + (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        JSONObject jSONObject = this.a;
        Long l = this.b;
        List list = this.c;
        StringBuilder sb = new StringBuilder("BannersReceivedEvent(bannersData=");
        sb.append(jSONObject);
        sb.append(", requestTime=");
        sb.append(l);
        sb.append(", acknowledgedDismissals=");
        return MediaSessionCompatQueueItem.read(sb, list, ")");
    }

    public h0(JSONObject jSONObject, Long l, List list) {
        jSONObject.getClass();
        list.getClass();
        this.a = jSONObject;
        this.b = l;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, h0Var.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, h0Var.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, h0Var.c}, getCieXyz.write())).booleanValue();
    }
}
