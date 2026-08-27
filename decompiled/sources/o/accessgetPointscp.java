package o;

import java.util.Map;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetPointscp {
    public final Map read;
    public final String serializer;

    public final int hashCode() {
        return this.read.hashCode() + (this.serializer.hashCode() * 31);
    }

    public accessgetPointscp(String str, Map map) {
        this.serializer = str;
        this.read = DelayKt.write(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetPointscp)) {
            return false;
        }
        accessgetPointscp accessgetpointscp = (accessgetPointscp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, accessgetpointscp.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, accessgetpointscp.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Key(key=" + this.serializer + ", extras=" + this.read + ")";
    }
}
