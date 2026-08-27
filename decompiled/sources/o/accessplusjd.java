package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public final class accessplusjd {
    public static final accessplusjd IconCompatParcelizer = new accessplusjd(DelayKt.write(new LinkedHashMap()));
    public final Map read;

    public final int hashCode() {
        return this.read.hashCode();
    }

    public accessplusjd(Map map) {
        this.read = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessplusjd)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((accessplusjd) obj).read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Extras(data=" + this.read + ")";
    }
}
