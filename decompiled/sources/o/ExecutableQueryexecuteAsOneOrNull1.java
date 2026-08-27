package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecutableQueryexecuteAsOneOrNull1 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public ExecutableQueryexecuteAsOneOrNull1(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.read = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = write + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = af$$ExternalSyntheticOutline0.m(this.serializer, "-", this.read);
        int i4 = IconCompatParcelizer + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return strM;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("UserIdentityProperties(employeeId=REDACTED, countryCode=", this.serializer, ", deviceId=REDACTED)");
        int i4 = IconCompatParcelizer + 37;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() % af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 9, 94, this.serializer);
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.serializer);
        }
        int i3 = IconCompatParcelizer + 77;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExecutableQueryexecuteAsOneOrNull1) {
            ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1 = (ExecutableQueryexecuteAsOneOrNull1) obj;
            if (!this.read.equals(executableQueryexecuteAsOneOrNull1.read)) {
                int i3 = write + 79;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return false;
                }
                int i4 = 4 / 4;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, executableQueryexecuteAsOneOrNull1.serializer}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, executableQueryexecuteAsOneOrNull1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            i = IconCompatParcelizer + 15;
        } else {
            i = IconCompatParcelizer + 3;
        }
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i % 2;
        return false;
    }
}
