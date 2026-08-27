package o;

/* JADX INFO: loaded from: classes3.dex */
public final class sendLicenseVerificationData implements removeGlobalPartnerParametersI {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final ActivityHandler44 write;

    public sendLicenseVerificationData(ActivityHandler44 activityHandler44) {
        this.write = activityHandler44;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GoToNextScreen(argument=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof sendLicenseVerificationData) {
                if (!this.write.equals(((sendLicenseVerificationData) obj).write)) {
                    return false;
                }
            } else {
                int i2 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = IconCompatParcelizer + 67;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
