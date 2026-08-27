package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class p8 {
    public final JSONArray a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public p8(JSONArray jSONArray) {
        jSONArray.getClass();
        this.a = jSONArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((p8) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.a + ")";
    }
}
