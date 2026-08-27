package o;

/* JADX INFO: loaded from: classes3.dex */
public final class execSessionSuccessCallbackCommand {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public execSessionSuccessCallbackCommand(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = serializer + 123;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ButtonViewEntity(label=" + this.RemoteActionCompatParcelizer + ", onClicked=" + this.write + ")";
        int i2 = IconCompatParcelizer + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 69;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (obj instanceof execSessionSuccessCallbackCommand) {
                execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand = (execSessionSuccessCallbackCommand) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, execsessionsuccesscallbackcommand.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, execsessionsuccesscallbackcommand.write}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i6 = IconCompatParcelizer + 115;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
                int i8 = IconCompatParcelizer + 37;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = i4 + 63;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i10 % 2 != 0;
        }
        int i11 = i2 + 73;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return true;
    }
}
