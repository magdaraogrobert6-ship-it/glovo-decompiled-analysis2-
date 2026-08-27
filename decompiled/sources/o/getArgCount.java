package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getArgCount extends AndroidPreparedStatement {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public getArgCount(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.serializer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("GoToTwoFa(phoneNumber=REDACTED, flowId=", this.read, ", password=REDACTED)");
        }
        ff$$ExternalSyntheticOutline0.m("GoToTwoFa(phoneNumber=REDACTED, flowId=", this.read, ", password=REDACTED)");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iM;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = this.RemoteActionCompatParcelizer.hashCode() >>> af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() << 122, 55, this.read);
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.read) + this.RemoteActionCompatParcelizer.hashCode();
        }
        int i3 = IconCompatParcelizer + 47;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return iM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write;
            int i3 = i2 + 119;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 67 / 0;
            }
            return true;
        }
        if (!(obj instanceof getArgCount)) {
            return false;
        }
        getArgCount getargcount = (getArgCount) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getargcount.serializer}, getCieXyz.write())).booleanValue()) {
            int i7 = IconCompatParcelizer + 105;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getargcount.read}, getCieXyz.write())).booleanValue()) {
            int i9 = write + 35;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getargcount.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i11 = write + 19;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
