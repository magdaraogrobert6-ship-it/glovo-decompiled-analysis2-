package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setColorScheme {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final int RemoteActionCompatParcelizer;
    public final RoomOpenHelperDelegate read;
    public final int serializer;

    public setColorScheme(RoomOpenHelperDelegate roomOpenHelperDelegate, int i, int i2) {
        roomOpenHelperDelegate.getClass();
        this.read = roomOpenHelperDelegate;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.serializer) + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.read.hashCode() * 31, 31);
        int i4 = IconCompatParcelizer + 37;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof setColorScheme)) {
                return false;
            }
            setColorScheme setcolorscheme = (setColorScheme) obj;
            if (this.read == setcolorscheme.read) {
                if (this.RemoteActionCompatParcelizer != setcolorscheme.RemoteActionCompatParcelizer) {
                    int i2 = IconCompatParcelizer + 31;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (this.serializer != setcolorscheme.serializer) {
                    int i4 = IconCompatParcelizer + 67;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = write + 35;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i7 = IconCompatParcelizer + 91;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = write + 105;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ChallengeInfo(challenge=");
        sb.append(this.read);
        sb.append(", index=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", challengeListCount=");
        String strM = af$$ExternalSyntheticOutline0.m(this.serializer, ")", sb);
        int i2 = write + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }
}
