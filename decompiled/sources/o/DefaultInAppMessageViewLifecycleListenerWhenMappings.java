package o;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageViewLifecycleListenerWhenMappings implements Map.Entry, displayInAppMessagelambda121 {
    public final Object read;
    public final Object write;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.write;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.read;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.write;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.read;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public DefaultInAppMessageViewLifecycleListenerWhenMappings(Object obj, Object obj2) {
        this.write = obj;
        this.read = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultInAppMessageViewLifecycleListenerWhenMappings)) {
            return false;
        }
        DefaultInAppMessageViewLifecycleListenerWhenMappings defaultInAppMessageViewLifecycleListenerWhenMappings = (DefaultInAppMessageViewLifecycleListenerWhenMappings) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, defaultInAppMessageViewLifecycleListenerWhenMappings.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, defaultInAppMessageViewLifecycleListenerWhenMappings.read}, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapEntry(key=");
        sb.append(this.write);
        sb.append(", value=");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.read, ')');
    }
}
