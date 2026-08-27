package o;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_registeredPushToken_lambda0 implements _set_registeredPushToken_lambda10 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String write;

    public _get_registeredPushToken_lambda0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Available(photoId=", this.IconCompatParcelizer, ", icon=", this.write, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Available(photoId=", this.IconCompatParcelizer, ", icon=", this.write, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof _get_registeredPushToken_lambda0) {
            _get_registeredPushToken_lambda0 _get_registeredpushtoken_lambda0 = (_get_registeredPushToken_lambda0) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, _get_registeredpushtoken_lambda0.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, _get_registeredpushtoken_lambda0.write}, getCieXyz.write())).booleanValue();
            }
            int i2 = serializer + 11;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 73;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 13;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
