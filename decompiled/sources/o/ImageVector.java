package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageVector {
    public long IconCompatParcelizer;
    public long read;
    public long serializer;
    public long write;

    public final int hashCode() {
        return Long.hashCode(this.serializer) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.IconCompatParcelizer) * 31, 31, this.read), 31, this.write);
    }

    public final String toString() {
        long j = this.IconCompatParcelizer;
        long j2 = this.read;
        long j3 = this.write;
        long j4 = this.serializer;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "ScreenMetrics(totalFrames=", ", jankFrames=");
        sbM.append(j2);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", frozenFrames=", j3, ", slowFrames=");
        return c8$$ExternalSyntheticOutline0.m(j4, ")", sbM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return this.IconCompatParcelizer == imageVector.IconCompatParcelizer && this.read == imageVector.read && this.write == imageVector.write && this.serializer == imageVector.serializer;
    }
}
