package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class obtainCompositeBrush {
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final int write;

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.write;
    }

    public final int hashCode() {
        return Integer.hashCode(this.write) + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer.hashCode() * 31, 31);
    }

    public obtainCompositeBrush(String str, int i, int i2) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
        this.write = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obtainCompositeBrush)) {
            return false;
        }
        obtainCompositeBrush obtaincompositebrush = (obtainCompositeBrush) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, obtaincompositebrush.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == obtaincompositebrush.IconCompatParcelizer && this.write == obtaincompositebrush.write;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(this.write, ")", m1$$ExternalSyntheticOutline0.m("OverallRateLimitPayload(triggeringTraceName=", this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, ", observedCount=", ", suppressedSinceLastReport="));
    }
}
