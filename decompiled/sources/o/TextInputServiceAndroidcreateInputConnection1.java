package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputServiceAndroidcreateInputConnection1 extends TextInputServiceAndroidbaseInputConnection2 {
    private static int read = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public TextInputServiceAndroidcreateInputConnection1(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OpenDeliveryNotesWeb(url=", this.RemoteActionCompatParcelizer, ", title=", this.IconCompatParcelizer, ", tag=special_instructions)");
        int i4 = write + 69;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((this.IconCompatParcelizer.hashCode() / (this.RemoteActionCompatParcelizer.hashCode() << 120)) - 75) >>> 1372160875;
        }
        return 1372160875 + ((this.IconCompatParcelizer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof TextInputServiceAndroidcreateInputConnection1)) {
                return false;
            }
            TextInputServiceAndroidcreateInputConnection1 textInputServiceAndroidcreateInputConnection1 = (TextInputServiceAndroidcreateInputConnection1) obj;
            Object[] objArr = {this.RemoteActionCompatParcelizer, textInputServiceAndroidcreateInputConnection1.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.IconCompatParcelizer, textInputServiceAndroidcreateInputConnection1.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        int i4 = write + 37;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
