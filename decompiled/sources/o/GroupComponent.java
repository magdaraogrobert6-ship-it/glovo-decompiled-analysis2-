package o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class GroupComponent {
    public final Map RemoteActionCompatParcelizer;
    public final Map write;

    public GroupComponent() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.RemoteActionCompatParcelizer = concurrentHashMap;
        this.write = concurrentHashMap2;
    }

    public final int hashCode() {
        return this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupComponent)) {
            return false;
        }
        GroupComponent groupComponent = (GroupComponent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, groupComponent.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, groupComponent.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "PerformanceMetaData(metrics=" + this.RemoteActionCompatParcelizer + ", attributes=" + this.write + ")";
    }
}
