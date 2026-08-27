package o;

import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ShadowRenderer extends DelayKt {
    public final boolean RemoteActionCompatParcelizer;

    public final int hashCode() {
        return Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public ShadowRenderer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShadowRenderer) && this.RemoteActionCompatParcelizer == ((ShadowRenderer) obj).RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.serializer("ActivityFirstCreated(isRecreated=", ")", this.RemoteActionCompatParcelizer);
    }
}
