package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonThumbLeftcp extends accessgetChannelDowncp {
    public final byte[] serializer;
    public final byte[] write;

    public final int hashCode() {
        return ((Arrays.hashCode(this.serializer) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.write);
    }

    public accessgetButtonThumbLeftcp(byte[] bArr, byte[] bArr2) {
        this.serializer = bArr;
        this.write = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetChannelDowncp)) {
            return false;
        }
        accessgetChannelDowncp accessgetchanneldowncp = (accessgetChannelDowncp) obj;
        boolean z = accessgetchanneldowncp instanceof accessgetButtonThumbLeftcp;
        accessgetButtonThumbLeftcp accessgetbuttonthumbleftcp = (accessgetButtonThumbLeftcp) accessgetchanneldowncp;
        if (z) {
            bArr = accessgetbuttonthumbleftcp.serializer;
        } else {
            bArr = accessgetbuttonthumbleftcp.serializer;
        }
        if (!Arrays.equals(this.serializer, bArr)) {
            return false;
        }
        if (z) {
            bArr2 = accessgetbuttonthumbleftcp.write;
        } else {
            bArr2 = accessgetbuttonthumbleftcp.write;
        }
        return Arrays.equals(this.write, bArr2);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.serializer) + ", encryptedBlob=" + Arrays.toString(this.write) + "}";
    }
}
