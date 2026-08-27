package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasureAndRelayoutIfNeededdefault extends accesssetMeasurePendingp {
    public final String IconCompatParcelizer;
    public final byte[] serializer;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.serializer);
    }

    public remeasureAndRelayoutIfNeededdefault(String str, byte[] bArr) {
        this.IconCompatParcelizer = str;
        this.serializer = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accesssetMeasurePendingp)) {
            return false;
        }
        accesssetMeasurePendingp accesssetmeasurependingp = (accesssetMeasurePendingp) obj;
        remeasureAndRelayoutIfNeededdefault remeasureandrelayoutifneededdefault = (remeasureAndRelayoutIfNeededdefault) accesssetmeasurependingp;
        if (!this.IconCompatParcelizer.equals(remeasureandrelayoutifneededdefault.IconCompatParcelizer)) {
            return false;
        }
        if (accesssetmeasurependingp instanceof remeasureAndRelayoutIfNeededdefault) {
            bArr = remeasureandrelayoutifneededdefault.serializer;
        } else {
            bArr = remeasureandrelayoutifneededdefault.serializer;
        }
        return Arrays.equals(this.serializer, bArr);
    }

    public final String toString() {
        return "File{filename=" + this.IconCompatParcelizer + ", contents=" + Arrays.toString(this.serializer) + "}";
    }
}
