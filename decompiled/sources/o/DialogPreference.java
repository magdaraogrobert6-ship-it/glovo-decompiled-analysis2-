package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogPreference {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String IconCompatParcelizer;
    public final String serializer;
    public final format write;

    public DialogPreference(String str, String str2, format formatVar) {
        str.getClass();
        str2.getClass();
        formatVar.getClass();
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.write = formatVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer);
        int i4 = RemoteActionCompatParcelizer + 111;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Action(text=", this.serializer, ", url=", this.IconCompatParcelizer, ", navigationType=");
            sbM.append(this.write);
            sbM.append(")");
            String string = sbM.toString();
            int i3 = 86 / 0;
            return string;
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("Action(text=", this.serializer, ", url=", this.IconCompatParcelizer, ", navigationType=");
        sbM2.append(this.write);
        sbM2.append(")");
        return sbM2.toString();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof DialogPreference) {
                DialogPreference dialogPreference = (DialogPreference) obj;
                Object[] objArr = {this.serializer, dialogPreference.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr2 = {this.IconCompatParcelizer, dialogPreference.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    if (this.write == dialogPreference.write) {
                        return true;
                    }
                    int i2 = RemoteActionCompatParcelizer + 105;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = RemoteActionCompatParcelizer + 3;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = RemoteActionCompatParcelizer + 15;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = RemoteActionCompatParcelizer + 63;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
