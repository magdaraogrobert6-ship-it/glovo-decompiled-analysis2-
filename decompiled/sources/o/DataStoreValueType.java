package o;

import com.sentiance.protobuf.ProtoSyntax;

/* JADX INFO: loaded from: classes3.dex */
public final class DataStoreValueType {
    public final accessgetDiskCacheLockp IconCompatParcelizer;
    public final int read;
    public final String serializer;
    public final Object[] write;

    public DataStoreValueType(accessgetDiskCacheLockp accessgetdiskcachelockp, String str, Object[] objArr) {
        this.IconCompatParcelizer = accessgetdiskcachelockp;
        this.serializer = str;
        this.write = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.read = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.read = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2++;
            }
        }
    }

    public final ProtoSyntax RemoteActionCompatParcelizer() {
        int i = this.read;
        if ((i & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
