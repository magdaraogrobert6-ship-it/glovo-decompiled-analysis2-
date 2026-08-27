package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setMaxWidth {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public setMaxWidth(String str, String str2, String str3, String str4) {
        str2.getClass();
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3;
        this.read = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BrazeCustomAttributes(courierId=", this.IconCompatParcelizer, ", riderCountry=", this.write, ", riderCity="), this.serializer, ", riderLanguage=", this.read, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BrazeCustomAttributes(courierId=", this.IconCompatParcelizer, ", riderCountry=", this.write, ", riderCity="), this.serializer, ", riderLanguage=", this.read, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.write), 31, this.serializer);
        int i4 = RemoteActionCompatParcelizer + 103;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof setMaxWidth)) {
                return false;
            }
            setMaxWidth setmaxwidth = (setMaxWidth) obj;
            if (!this.IconCompatParcelizer.equals(setmaxwidth.IconCompatParcelizer)) {
                return false;
            }
            Object[] objArr = {this.write, setmaxwidth.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || !this.serializer.equals(setmaxwidth.serializer) || !this.read.equals(setmaxwidth.read)) {
                return false;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 45;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
