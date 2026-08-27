package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class startBackgroundTimerI {
    private static int read = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;

    public startBackgroundTimerI(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final int hashCode() {
        int iM;
        String str;
        int i = 2 % 2;
        int i2 = read + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() % 6, 119, this.IconCompatParcelizer);
            str = this.RemoteActionCompatParcelizer;
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer);
            str = this.RemoteActionCompatParcelizer;
        }
        return str.hashCode() + iM;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DeliveryItemViewEntity(name=", this.serializer, ", formattedPrice=", this.IconCompatParcelizer, ", formattedQuantity="), this.RemoteActionCompatParcelizer, ")");
        int i4 = read + 79;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 111;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof startBackgroundTimerI) {
            startBackgroundTimerI startbackgroundtimeri = (startBackgroundTimerI) obj;
            Object[] objArr = {this.serializer, startbackgroundtimeri.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer.equals(startbackgroundtimeri.IconCompatParcelizer)) {
                Object[] objArr2 = {this.RemoteActionCompatParcelizer, startbackgroundtimeri.RemoteActionCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        } else {
            int i5 = i2 + 79;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        int i7 = write + 69;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
