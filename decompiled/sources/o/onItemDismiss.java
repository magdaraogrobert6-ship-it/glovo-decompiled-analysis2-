package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class onItemDismiss implements Serializable {
    public final Object IconCompatParcelizer;

    public final String toString() {
        return write(this.IconCompatParcelizer);
    }

    public /* synthetic */ onItemDismiss(Object obj) {
        this.IconCompatParcelizer = obj;
    }

    public static final Throwable serializer(Object obj) {
        if (obj instanceof isItemDismissable) {
            return ((isItemDismissable) obj).RemoteActionCompatParcelizer;
        }
        return null;
    }

    public static String write(Object obj) {
        if (obj instanceof isItemDismissable) {
            return ((isItemDismissable) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onItemDismiss)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((onItemDismiss) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Object obj = this.IconCompatParcelizer;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
