package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class CodedInputStreamArrayDecoder {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final int write;

    public CodedInputStreamArrayDecoder(int i) {
        this.write = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i2 % 2 != 0 ? Integer.hashCode(this.write) % 1920097856 : Integer.hashCode(this.write) - 1920097856;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(this.write, "HelpCenterEvent(name=help_center_client_error, type=", ")");
        int i4 = RemoteActionCompatParcelizer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 7;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            return (obj instanceof CodedInputStreamArrayDecoder) && this.write == ((CodedInputStreamArrayDecoder) obj).write;
        }
        int i4 = i2 + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
