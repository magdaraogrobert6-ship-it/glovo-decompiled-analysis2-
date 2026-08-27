package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU {
    private static int read = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.write;
        int i5 = i3 + 29;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 31;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 99;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU(String str, String str2, String str3) {
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer);
        int i4 = serializer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("MessageDialogModel(title=", this.write, ", description=", this.IconCompatParcelizer, ", actionText="), this.RemoteActionCompatParcelizer, ")");
        }
        int i3 = 16 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("MessageDialogModel(title=", this.write, ", description=", this.IconCompatParcelizer, ", actionText="), this.RemoteActionCompatParcelizer, ")");
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU)) {
            return false;
        }
        r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU r8lambda_8tdj25vpd8y8rn041xoxhmn3eu = (r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU) obj;
        if (this.write.equals(r8lambda_8tdj25vpd8y8rn041xoxhmn3eu.write)) {
            if (this.IconCompatParcelizer.equals(r8lambda_8tdj25vpd8y8rn041xoxhmn3eu.IconCompatParcelizer)) {
                return this.RemoteActionCompatParcelizer.equals(r8lambda_8tdj25vpd8y8rn041xoxhmn3eu.RemoteActionCompatParcelizer);
            }
            i = serializer + 61;
        } else {
            i = serializer + 87;
        }
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i % 2;
        return false;
    }
}
