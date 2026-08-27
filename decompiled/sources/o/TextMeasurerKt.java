package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextMeasurerKt {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public TextMeasurerKt(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        this.write = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = read + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OverlayHeaderConfiguration(items=" + this.write + ")";
        int i2 = read + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof TextMeasurerKt)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((TextMeasurerKt) obj).write}, getCieXyz.write())).booleanValue();
        }
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 101;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
