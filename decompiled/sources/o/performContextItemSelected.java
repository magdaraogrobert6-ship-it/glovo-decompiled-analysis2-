package o;

/* JADX INFO: loaded from: classes3.dex */
public final class performContextItemSelected {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk serializer;

    public performContextItemSelected(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        this.serializer = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int i4 = write + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BottomSheetConfiguration(items=" + this.serializer + ")";
        int i2 = write + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof performContextItemSelected)) {
                int i2 = RemoteActionCompatParcelizer + 15;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((performContextItemSelected) obj).serializer}, getCieXyz.write())).booleanValue()) {
                int i4 = write + 67;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i5 = write + 99;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = write + 39;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
