package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AnchoredDragFinishedSignal implements Map.Entry, displayInAppMessagelambda121 {
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ AnchoredDragFinishedSignal(Object obj, int i, Object obj2) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }
        if (i != 2) {
            return super.hashCode();
        }
        int iHashCode2 = obj != null ? obj.hashCode() : 0;
        Object value2 = getValue();
        return iHashCode2 ^ (value2 != null ? value2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        int i = this.write;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i != 1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        int i = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
            if (entry == null) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{entry.getKey(), obj2}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{entry.getValue(), getValue()}, getCieXyz.write())).booleanValue();
            }
            return false;
        }
        if (i != 2) {
            return super.equals(obj);
        }
        entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        if (entry == null) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{entry.getKey(), obj2}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{entry.getValue(), getValue()}, getCieXyz.write())).booleanValue();
        }
        return false;
    }

    public String toString() {
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
        if (i != 2) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? this.RemoteActionCompatParcelizer : this.RemoteActionCompatParcelizer;
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? this.read : this.read;
        }
        return this.read;
    }
}
