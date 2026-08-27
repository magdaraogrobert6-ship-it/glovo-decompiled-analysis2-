package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class isItemDismissable implements Serializable {
    public final Throwable RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public isItemDismissable(Throwable th) {
        th.getClass();
        this.RemoteActionCompatParcelizer = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof isItemDismissable)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((isItemDismissable) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Failure(" + this.RemoteActionCompatParcelizer + ')';
    }
}
