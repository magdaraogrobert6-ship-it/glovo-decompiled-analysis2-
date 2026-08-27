package o;

/* JADX INFO: loaded from: classes3.dex */
public final class InputState_androidKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;

    public InputState_androidKt(String str, String str2) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BlockUserOption(label=", this.serializer, ", sublabel=", this.RemoteActionCompatParcelizer, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BlockUserOption(label=", this.serializer, ", sublabel=", this.RemoteActionCompatParcelizer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.serializer.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            int i2 = write + 3;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = write + 29;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 63;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (!(!(obj instanceof InputState_androidKt))) {
                InputState_androidKt inputState_androidKt = (InputState_androidKt) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, inputState_androidKt.serializer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, inputState_androidKt.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i6 = IconCompatParcelizer + 107;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i6 % 2 == 0;
            }
            int i7 = i2 + 59;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i4 + 7;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
