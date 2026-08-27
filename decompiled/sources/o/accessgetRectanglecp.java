package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetRectanglecp {
    public final CacheDrawModifierNodeImpl1 IconCompatParcelizer;
    public final int read;
    public final Integer write;

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.read);
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = this.IconCompatParcelizer;
        int iHashCode2 = cacheDrawModifierNodeImpl1 == null ? 0 : cacheDrawModifierNodeImpl1.hashCode();
        Integer num = this.write;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public accessgetRectanglecp(int i, CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1, Integer num) {
        this.read = i;
        this.IconCompatParcelizer = cacheDrawModifierNodeImpl1;
        this.write = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetRectanglecp)) {
            return false;
        }
        accessgetRectanglecp accessgetrectanglecp = (accessgetRectanglecp) obj;
        if (this.read != accessgetrectanglecp.read) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, accessgetrectanglecp.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, accessgetrectanglecp.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.read + ", sourceInfo=" + this.IconCompatParcelizer + ", groupOffset=" + this.write + ')';
    }
}
