package o;

/* JADX INFO: loaded from: classes3.dex */
public final class launchAttributionResponseTasks implements launchEventResponseTasks {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final initI IconCompatParcelizer;
    public final String serializer;

    public launchAttributionResponseTasks(String str, initI initi) {
        this.serializer = str;
        this.IconCompatParcelizer = initi;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() * this.serializer.hashCode() * 88;
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        }
        int i3 = read + 71;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 54 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(btnText=" + this.serializer + ", accountCreationType=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (obj instanceof launchAttributionResponseTasks) {
                launchAttributionResponseTasks launchattributionresponsetasks = (launchAttributionResponseTasks) obj;
                if (this.serializer.equals(launchattributionresponsetasks.serializer)) {
                    if (!this.IconCompatParcelizer.equals(launchattributionresponsetasks.IconCompatParcelizer)) {
                        return false;
                    }
                } else {
                    i = read + 19;
                    RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
            } else {
                i = RemoteActionCompatParcelizer + 89;
                read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i % 2;
            return false;
        }
        return true;
    }
}
