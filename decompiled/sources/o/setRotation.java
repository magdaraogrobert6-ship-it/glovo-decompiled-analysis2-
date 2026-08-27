package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class setRotation {
    public final long IconCompatParcelizer;
    public final long read;
    public final long serializer;
    public final long write;

    public final int hashCode() {
        return Long.hashCode(this.write) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.read) * 31, 31, this.serializer), 31, this.IconCompatParcelizer);
    }

    public setRotation(long j, long j2, long j3, long j4) {
        this.read = j;
        this.serializer = j2;
        this.IconCompatParcelizer = j3;
        this.write = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRotation)) {
            return false;
        }
        setRotation setrotation = (setRotation) obj;
        return this.read == setrotation.read && this.serializer == setrotation.serializer && this.IconCompatParcelizer == setrotation.IconCompatParcelizer && this.write == setrotation.write;
    }

    public final String toString() {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(this.read, "JankStatsFrameSnapshot(totalFrames=", ", jankFrames=");
        sbM.append(this.serializer);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", frozenFrames=", this.IconCompatParcelizer, ", slowFrames=");
        return c8$$ExternalSyntheticOutline0.m(this.write, ")", sbM);
    }
}
