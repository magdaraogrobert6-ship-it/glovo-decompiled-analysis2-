package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getVerticalScrollFactorCompat {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final int IconCompatParcelizer;
    public final String read;
    public final String write;

    public getVerticalScrollFactorCompat(String str, String str2, int i) {
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = i;
    }

    public final int hashCode() {
        int iM;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = Integer.hashCode(this.IconCompatParcelizer) >>> af$$ExternalSyntheticOutline0.m(this.write.hashCode() / 66, 26, this.read);
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.read) + Integer.hashCode(this.IconCompatParcelizer);
        }
        int i3 = RemoteActionCompatParcelizer + 39;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iM;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
            return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", c8$$ExternalSyntheticOutline0.m("DemandInfo(title=", this.write, ", description=", this.read, ", icon="));
        }
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", c8$$ExternalSyntheticOutline0.m("DemandInfo(title=", this.write, ", description=", this.read, ", icon="));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof getVerticalScrollFactorCompat) {
            getVerticalScrollFactorCompat getverticalscrollfactorcompat = (getVerticalScrollFactorCompat) obj;
            if (this.write.equals(getverticalscrollfactorcompat.write)) {
                if (!this.read.equals(getverticalscrollfactorcompat.read)) {
                    int i4 = serializer + 69;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else if (this.IconCompatParcelizer == getverticalscrollfactorcompat.IconCompatParcelizer) {
                    return true;
                }
            }
        }
        int i6 = RemoteActionCompatParcelizer + 43;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
