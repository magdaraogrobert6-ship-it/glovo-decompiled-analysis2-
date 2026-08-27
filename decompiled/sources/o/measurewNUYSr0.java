package o;

/* JADX INFO: loaded from: classes3.dex */
public final class measurewNUYSr0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public measurewNUYSr0(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OverlayErrorBannerState(title=", this.RemoteActionCompatParcelizer, ", description=", this.read, ", tag=state_api_error_dialog)");
        int i4 = IconCompatParcelizer + 117;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = ((this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31)) * 31) - 2114376878;
        int i4 = serializer + 79;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof measurewNUYSr0)) {
                return false;
            }
            measurewNUYSr0 measurewnuysr0 = (measurewNUYSr0) obj;
            if (this.RemoteActionCompatParcelizer.equals(measurewnuysr0.RemoteActionCompatParcelizer)) {
                if (!this.read.equals(measurewnuysr0.read)) {
                    return false;
                }
            } else {
                int i4 = serializer + 59;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
