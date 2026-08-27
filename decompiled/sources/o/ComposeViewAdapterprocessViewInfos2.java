package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeViewAdapterprocessViewInfos2 {
    private static int serializer = 1;
    private static int write;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk read;

    public ComposeViewAdapterprocessViewInfos2(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        this.read = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Tabs(tabs=" + this.read + ")";
        int i2 = serializer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 109;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ComposeViewAdapterprocessViewInfos2)) {
            return false;
        }
        Object[] objArr = {this.read, ((ComposeViewAdapterprocessViewInfos2) obj).read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = write + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
