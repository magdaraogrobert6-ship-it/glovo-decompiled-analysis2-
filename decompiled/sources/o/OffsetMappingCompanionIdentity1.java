package o;

/* JADX INFO: loaded from: classes3.dex */
public final class OffsetMappingCompanionIdentity1 {
    private static int read = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k write;

    public OffsetMappingCompanionIdentity1(String str, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k) {
        str.getClass();
        r8lambdaerwhggzq_gqgn8cultnvrcshm8k.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.write.content.hashCode() % (this.RemoteActionCompatParcelizer.hashCode() - 21);
        } else {
            iHashCode = this.write.content.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        }
        int i3 = read + 89;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VoteRequest(url=" + this.RemoteActionCompatParcelizer + ", payload=" + this.write + ")";
        int i2 = serializer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 9;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 69;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof OffsetMappingCompanionIdentity1) {
            OffsetMappingCompanionIdentity1 offsetMappingCompanionIdentity1 = (OffsetMappingCompanionIdentity1) obj;
            Object[] objArr = {this.RemoteActionCompatParcelizer, offsetMappingCompanionIdentity1.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i7 = read;
                int i8 = i7 + 11;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = i7 + 65;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 74 / 0;
                }
                return false;
            }
            Object[] objArr2 = {this.write, offsetMappingCompanionIdentity1.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i12 = read + 9;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i13 = i2 + 83;
        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return false;
    }
}
