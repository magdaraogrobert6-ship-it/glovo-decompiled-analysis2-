package o;

/* JADX INFO: loaded from: classes3.dex */
public final class onEditCommands implements getPlatformImeOptions {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;

    public onEditCommands(String str, String str2) {
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OpenGoogleTranslateWeb(url=", this.serializer, ", title=", this.RemoteActionCompatParcelizer, ", tag=gallery_delivery_notes)");
            int i3 = write + 37;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OpenGoogleTranslateWeb(url=", this.serializer, ", title=", this.RemoteActionCompatParcelizer, ", tag=gallery_delivery_notes)");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = ((this.RemoteActionCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31)) * 31) + 2061512515;
        int i4 = write + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof onEditCommands)) {
                return false;
            }
            onEditCommands oneditcommands = (onEditCommands) obj;
            if (this.serializer.equals(oneditcommands.serializer)) {
                if (!this.RemoteActionCompatParcelizer.equals(oneditcommands.RemoteActionCompatParcelizer)) {
                    return false;
                }
            } else {
                int i2 = IconCompatParcelizer + 17;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = IconCompatParcelizer + 87;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
