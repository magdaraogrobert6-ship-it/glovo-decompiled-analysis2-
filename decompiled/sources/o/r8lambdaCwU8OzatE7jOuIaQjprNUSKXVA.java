package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA(String str, String str2, String str3) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = str3;
    }

    public final int hashCode() {
        String str;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 121;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int iHashCode = this.write.hashCode();
            str = this.RemoteActionCompatParcelizer;
            i2 = iHashCode % 121;
            i = 23;
        } else {
            int iHashCode2 = this.write.hashCode();
            str = this.RemoteActionCompatParcelizer;
            i = 31;
            i2 = iHashCode2 * 31;
        }
        int iHashCode3 = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(i2, i, str);
        int i5 = serializer + 121;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("SettingsCardTexts(title=", this.write, ", subtitle=", this.RemoteActionCompatParcelizer, ", buttonText="), this.read, ")");
        int i4 = IconCompatParcelizer + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA) {
            r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r8lambdacwu8ozate7jouiaqjprnuskxva = (r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA) obj;
            if (this.write.equals(r8lambdacwu8ozate7jouiaqjprnuskxva.write) && this.RemoteActionCompatParcelizer.equals(r8lambdacwu8ozate7jouiaqjprnuskxva.RemoteActionCompatParcelizer) && this.read.equals(r8lambdacwu8ozate7jouiaqjprnuskxva.read)) {
                return true;
            }
        }
        int i4 = IconCompatParcelizer + 29;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
