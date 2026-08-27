package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class markNotTintable {
    public final long IconCompatParcelizer;
    public final AndroidShadowContext_androidKt RemoteActionCompatParcelizer;
    public final Map read;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.IconCompatParcelizer);
        Map map = this.read;
        return this.RemoteActionCompatParcelizer.hashCode() + (((iHashCode * 31) + (map == null ? 0 : map.hashCode())) * 31);
    }

    public markNotTintable(long j, Map map, AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        androidShadowContext_androidKt.getClass();
        this.IconCompatParcelizer = j;
        this.read = map;
        this.RemoteActionCompatParcelizer = androidShadowContext_androidKt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof markNotTintable)) {
            return false;
        }
        markNotTintable marknottintable = (markNotTintable) obj;
        if (this.IconCompatParcelizer != marknottintable.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, marknottintable.read}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == marknottintable.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "MetricMetaData(value=" + this.IconCompatParcelizer + ", metaData=" + this.read + ", unit=" + this.RemoteActionCompatParcelizer + ")";
    }

    public /* synthetic */ markNotTintable(long j, AndroidShadowContext_androidKt androidShadowContext_androidKt, int i) {
        this(j, (Map) null, (i & 4) != 0 ? AndroidShadowContext_androidKt.None : androidShadowContext_androidKt);
    }
}
