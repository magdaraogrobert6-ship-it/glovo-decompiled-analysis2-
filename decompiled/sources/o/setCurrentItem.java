package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setCurrentItem {
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public setCurrentItem(String str, String str2, String str3) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.read);
        int i4 = write + 119;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ReviewViewState(title=", this.IconCompatParcelizer, ", description=", this.read, ", btnText="), this.RemoteActionCompatParcelizer, ")");
        int i4 = serializer + 27;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 113;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof setCurrentItem) {
            setCurrentItem setcurrentitem = (setCurrentItem) obj;
            if (this.IconCompatParcelizer.equals(setcurrentitem.IconCompatParcelizer) && this.read.equals(setcurrentitem.read) && this.RemoteActionCompatParcelizer.equals(setcurrentitem.RemoteActionCompatParcelizer)) {
                return true;
            }
        }
        int i4 = serializer + 113;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
