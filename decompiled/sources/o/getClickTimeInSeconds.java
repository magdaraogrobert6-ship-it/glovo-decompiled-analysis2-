package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getClickTimeInSeconds {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public getClickTimeInSeconds(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = write + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PassErrorUiContent(title=", this.RemoteActionCompatParcelizer, ", description=", this.IconCompatParcelizer, ", buttonText="), this.read, ")");
            int i3 = 27 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PassErrorUiContent(title=", this.RemoteActionCompatParcelizer, ", description=", this.IconCompatParcelizer, ", buttonText="), this.read, ")");
        }
        int i4 = write + 15;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer);
        String str = this.read;
        if (str == null) {
            int i3 = serializer + 75;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i5 = serializer + 89;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 51;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getClickTimeInSeconds)) {
            return false;
        }
        getClickTimeInSeconds getclicktimeinseconds = (getClickTimeInSeconds) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getclicktimeinseconds.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getclicktimeinseconds.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getclicktimeinseconds.read}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = serializer + 61;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
