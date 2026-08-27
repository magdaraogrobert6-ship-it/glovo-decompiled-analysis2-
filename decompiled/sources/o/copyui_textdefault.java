package o;

/* JADX INFO: loaded from: classes3.dex */
public final class copyui_textdefault {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final calculateTargetMetrics serializer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.write;
        int i4 = i3 + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final calculateTargetMetrics RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        throw null;
    }

    public copyui_textdefault(String str, calculateTargetMetrics calculatetargetmetrics) {
        str.getClass();
        this.write = str;
        this.serializer = calculatetargetmetrics;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (this.write.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SelectedPaymentOption(selectedPaymentOption=" + this.write + ", selectedBy=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyui_textdefault)) {
            return false;
        }
        copyui_textdefault copyui_textdefaultVar = (copyui_textdefault) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, copyui_textdefaultVar.write}, getCieXyz.write())).booleanValue()) {
            return this.serializer.equals(copyui_textdefaultVar.serializer);
        }
        int i4 = RemoteActionCompatParcelizer + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
