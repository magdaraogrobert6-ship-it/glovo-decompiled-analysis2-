package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getLambda558638247ui_tooling implements lambda_2086912010lambda0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String serializer;

    public getLambda558638247ui_tooling(String str) {
        str.getClass();
        this.serializer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode();
            int i3 = 76 / 0;
        } else {
            iHashCode = this.serializer.hashCode();
        }
        int i4 = write + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("ShowErrorSnackbar(errorMessage=", this.serializer, ")");
        }
        int i3 = 11 / 0;
        return ff$$ExternalSyntheticOutline0.m("ShowErrorSnackbar(errorMessage=", this.serializer, ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof getLambda558638247ui_tooling))) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((getLambda558638247ui_tooling) obj).serializer}, getCieXyz.write())).booleanValue()) {
                int i2 = write + 73;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = write + 69;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IconCompatParcelizer + 101;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
