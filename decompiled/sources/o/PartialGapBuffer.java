package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class PartialGapBuffer {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final OffsetMappingCompanionIdentity1 RemoteActionCompatParcelizer;
    public final int read;
    public final boolean write;

    public PartialGapBuffer(int i, boolean z, OffsetMappingCompanionIdentity1 offsetMappingCompanionIdentity1) {
        this.read = i;
        this.write = z;
        this.RemoteActionCompatParcelizer = offsetMappingCompanionIdentity1;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.read) * 31, 31, this.write);
        int i4 = IconCompatParcelizer + 17;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof PartialGapBuffer)) {
                return false;
            }
            PartialGapBuffer partialGapBuffer = (PartialGapBuffer) obj;
            if (this.read == partialGapBuffer.read) {
                if (this.write != partialGapBuffer.write || !this.RemoteActionCompatParcelizer.equals(partialGapBuffer.RemoteActionCompatParcelizer)) {
                    return false;
                }
            } else {
                int i5 = i3 + 35;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RemoteVote(count=" + this.read + ", pressed=" + this.write + ", voteRequest=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return str;
    }
}
