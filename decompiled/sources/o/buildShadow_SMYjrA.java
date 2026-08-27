package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class buildShadow_SMYjrA {
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final int serializer;

    public final int read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int serializer() {
        return this.serializer;
    }

    public final String write() {
        return this.read;
    }

    public final int hashCode() {
        return Integer.hashCode(this.serializer) + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.read.hashCode() * 31, 31);
    }

    public buildShadow_SMYjrA(String str, int i, int i2) {
        str.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buildShadow_SMYjrA)) {
            return false;
        }
        buildShadow_SMYjrA buildshadow_smyjra = (buildShadow_SMYjrA) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, buildshadow_smyjra.read}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == buildshadow_smyjra.RemoteActionCompatParcelizer && this.serializer == buildshadow_smyjra.serializer;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(this.serializer, ")", m1$$ExternalSyntheticOutline0.m("PerTraceRateLimitPayload(triggeringTraceName=", this.RemoteActionCompatParcelizer, this.read, ", observedTraceStartsForName=", ", suppressedSinceLastReport="));
    }
}
