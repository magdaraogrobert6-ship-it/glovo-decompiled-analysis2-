package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final long read;

    public r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA(long j, String str) {
        str.getClass();
        this.read = j;
        this.IconCompatParcelizer = str;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = m1$$ExternalSyntheticOutline0.m(this.read, "Params(deliveryId=", ", customerPhone=REDACTED)");
        int i4 = RemoteActionCompatParcelizer + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() >>> (Long.hashCode(this.read) / 94);
        } else {
            iHashCode = (Long.hashCode(this.read) * 31) + this.IconCompatParcelizer.hashCode();
        }
        int i3 = RemoteActionCompatParcelizer + 93;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 69;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA)) {
            int i4 = serializer + 115;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA r8lambdapwu9vt7rpjzci3849jlov6vnoha = (r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA) obj;
        if (this.read != r8lambdapwu9vt7rpjzci3849jlov6vnoha.read) {
            return false;
        }
        Object[] objArr = {this.IconCompatParcelizer, r8lambdapwu9vt7rpjzci3849jlov6vnoha.IconCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = serializer + 27;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 67;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
