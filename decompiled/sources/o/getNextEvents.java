package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getNextEvents {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String RemoteActionCompatParcelizer;
    public final int serializer;
    public final String write;

    public getNextEvents(int i, String str, String str2) {
        this.serializer = i;
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() % af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.serializer) / 24, 33, this.write);
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.serializer) * 31, 31, this.write);
        }
        int i3 = read + 21;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("Child(icon=", this.serializer, ", title=", this.write, ", value="), this.RemoteActionCompatParcelizer, ")");
            int i3 = read + 95;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("Child(icon=", this.serializer, ", title=", this.write, ", value="), this.RemoteActionCompatParcelizer, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getNextEvents) {
            getNextEvents getnextevents = (getNextEvents) obj;
            return this.serializer == getnextevents.serializer && this.write.equals(getnextevents.write) && this.RemoteActionCompatParcelizer.equals(getnextevents.RemoteActionCompatParcelizer);
        }
        int i5 = i3 + 35;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
