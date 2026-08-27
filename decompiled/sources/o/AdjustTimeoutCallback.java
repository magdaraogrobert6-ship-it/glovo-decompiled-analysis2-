package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustTimeoutCallback extends getThirdPartySharingSettingsJson {
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;

    public AdjustTimeoutCallback(boolean z, String str) {
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() << (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 102);
        } else {
            iHashCode = (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + this.IconCompatParcelizer.hashCode();
        }
        int i3 = serializer + 35;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 87;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            if (!(obj instanceof AdjustTimeoutCallback)) {
                return false;
            }
            AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj;
            if (this.RemoteActionCompatParcelizer != adjustTimeoutCallback.RemoteActionCompatParcelizer || !this.IconCompatParcelizer.equals(adjustTimeoutCallback.IconCompatParcelizer)) {
                return false;
            }
        }
        int i4 = write + 103;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Displayable(isPaused=" + this.RemoteActionCompatParcelizer + ", buttonText=" + this.IconCompatParcelizer + ")";
        int i2 = write + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
