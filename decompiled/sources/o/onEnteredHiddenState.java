package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class onEnteredHiddenState {
    private static int read = 1;
    private static int serializer;
    public final isUpdated IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final int write;

    public final isUpdated serializer() {
        int i = 2 % 2;
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        isUpdated isupdated = this.IconCompatParcelizer;
        int i5 = i3 + 115;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return isupdated;
    }

    public onEnteredHiddenState(int i, String str, isUpdated isupdated) {
        str.getClass();
        this.write = i;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = isupdated;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.write) * 31, 31, this.RemoteActionCompatParcelizer);
        int i4 = serializer + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Zone(id=", this.write, ", name=", this.RemoteActionCompatParcelizer, ", startingPoint=");
            sbM.append(this.IconCompatParcelizer);
            sbM.append(")");
            String string = sbM.toString();
            int i3 = serializer + 61;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
            }
            return string;
        }
        StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m("Zone(id=", this.write, ", name=", this.RemoteActionCompatParcelizer, ", startingPoint=");
        sbM2.append(this.IconCompatParcelizer);
        sbM2.append(")");
        sbM2.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof onEnteredHiddenState)) {
                return false;
            }
            onEnteredHiddenState onenteredhiddenstate = (onEnteredHiddenState) obj;
            if (this.write != onenteredhiddenstate.write) {
                int i4 = i3 + 29;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return false;
                }
                int i5 = 5 % 5;
                return false;
            }
            Object[] objArr = {this.RemoteActionCompatParcelizer, onenteredhiddenstate.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i6 = read + 43;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (!this.IconCompatParcelizer.equals(onenteredhiddenstate.IconCompatParcelizer)) {
                return false;
            }
        }
        return true;
    }
}
