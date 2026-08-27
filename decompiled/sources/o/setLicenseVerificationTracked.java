package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setLicenseVerificationTracked {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final boolean IconCompatParcelizer;
    public final boolean write;

    public setLicenseVerificationTracked(boolean z, boolean z2) {
        this.IconCompatParcelizer = z;
        this.write = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.write) >> (Boolean.hashCode(this.IconCompatParcelizer) >> 57);
        }
        return (Boolean.hashCode(this.IconCompatParcelizer) * 31) + Boolean.hashCode(this.write);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 67;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof setLicenseVerificationTracked))) {
            setLicenseVerificationTracked setlicenseverificationtracked = (setLicenseVerificationTracked) obj;
            if (this.IconCompatParcelizer == setlicenseverificationtracked.IconCompatParcelizer) {
                return this.write == setlicenseverificationtracked.write;
            }
            int i6 = i2 + 89;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        int i7 = i4 + 53;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SettingsInfoVisibility(isAutoAcceptVisible=" + this.IconCompatParcelizer + ", isShiftExtensionVisible=" + this.write + ")";
        int i2 = serializer + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
