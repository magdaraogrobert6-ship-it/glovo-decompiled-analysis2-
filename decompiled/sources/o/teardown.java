package o;

/* JADX INFO: loaded from: classes3.dex */
public final class teardown extends setAskingAttribution {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final ActivityHandler44 RemoteActionCompatParcelizer;

    public teardown(ActivityHandler44 activityHandler44) {
        this.RemoteActionCompatParcelizer = activityHandler44;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i3 = IconCompatParcelizer + 111;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToNextScreen(argument=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 63;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof teardown)) {
                int i4 = i2 + 109;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!this.RemoteActionCompatParcelizer.equals(((teardown) obj).RemoteActionCompatParcelizer)) {
                return false;
            }
        }
        return true;
    }
}
