package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getSdkVersion extends getLastDeeplink {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final int IconCompatParcelizer;
    public final int read;
    public final setReferrer serializer;

    public getSdkVersion(setReferrer setreferrer, int i, int i2) {
        setreferrer.getClass();
        this.serializer = setreferrer;
        this.IconCompatParcelizer = i;
        this.read = i2;
    }

    public final int hashCode() {
        int iM;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 21;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.serializer.hashCode() << 74, 41);
            i = this.read;
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.serializer.hashCode() * 31, 31);
            i = this.read;
        }
        return Integer.hashCode(i) + iM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 43;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getSdkVersion) {
            getSdkVersion getsdkversion = (getSdkVersion) obj;
            if (this.serializer == getsdkversion.serializer) {
                if (this.IconCompatParcelizer == getsdkversion.IconCompatParcelizer) {
                    if (this.read == getsdkversion.read) {
                        return true;
                    }
                } else {
                    int i5 = i2 + 103;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
            }
        }
        int i7 = i2 + 113;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("MissingPermission(permissionType=");
        sb.append(this.serializer);
        sb.append(", iconDrawableResId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", instructionStringResId=");
        String strM = af$$ExternalSyntheticOutline0.m(this.read, ")", sb);
        int i2 = RemoteActionCompatParcelizer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }
}
