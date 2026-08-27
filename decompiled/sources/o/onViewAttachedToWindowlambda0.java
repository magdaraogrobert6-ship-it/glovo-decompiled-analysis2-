package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class onViewAttachedToWindowlambda0 implements Serializable {
    public final Object serializer;
    public final Object write;

    public final int hashCode() {
        Object obj = this.serializer;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.write;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public onViewAttachedToWindowlambda0(Object obj, Object obj2) {
        this.serializer = obj;
        this.write = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onViewAttachedToWindowlambda0)) {
            return false;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, onviewattachedtowindowlambda0.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, onviewattachedtowindowlambda0.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.serializer);
        sb.append(", ");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.write, ')');
    }
}
