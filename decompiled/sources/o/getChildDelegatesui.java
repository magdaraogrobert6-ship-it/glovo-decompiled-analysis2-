package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getChildDelegatesui {
    public final long IconCompatParcelizer;
    public final Map RemoteActionCompatParcelizer;
    public final String read;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer);
    }

    public getChildDelegatesui(String str, long j, Map map) {
        map.getClass();
        this.read = str;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getChildDelegatesui)) {
            return false;
        }
        getChildDelegatesui getchilddelegatesui = (getChildDelegatesui) obj;
        if (!this.read.equals(getchilddelegatesui.read) || this.IconCompatParcelizer != getchilddelegatesui.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getchilddelegatesui.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMetadata(sessionId=");
        sb.append(this.read);
        sb.append(", timestamp=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", additionalCustomKeys=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
