package kotlinx.coroutines.internal;

import o.ImageOnlyContentCardViewViewHolder;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadLocalKey implements ImageOnlyContentCardViewViewHolder {
    public final ThreadLocal RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public ThreadLocalKey(ThreadLocal threadLocal) {
        this.RemoteActionCompatParcelizer = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreadLocalKey)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((ThreadLocalKey) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.RemoteActionCompatParcelizer + ')';
    }
}
