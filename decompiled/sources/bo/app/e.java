package bo.app;

import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final List a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public e(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((e) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read("AcknowledgedDismissalsReceivedEvent(acknowledgedDismissals=", ")", this.a);
    }
}
