package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accesscontentDescriptionFakeNodeId {
    private static int read = 0;
    private static int serializer = 1;
    public final semanticsdefault RemoteActionCompatParcelizer;
    public final String write;

    public accesscontentDescriptionFakeNodeId(semanticsdefault semanticsdefaultVar, String str) {
        semanticsdefaultVar.getClass();
        str.getClass();
        this.RemoteActionCompatParcelizer = semanticsdefaultVar;
        this.write = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.write.hashCode() % (this.RemoteActionCompatParcelizer.hashCode() + 57);
        } else {
            iHashCode = this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        }
        int i3 = read + 25;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 117;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof accesscontentDescriptionFakeNodeId) {
            accesscontentDescriptionFakeNodeId accesscontentdescriptionfakenodeid = (accesscontentDescriptionFakeNodeId) obj;
            if (this.RemoteActionCompatParcelizer != accesscontentdescriptionfakenodeid.RemoteActionCompatParcelizer) {
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, accesscontentdescriptionfakenodeid.write}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i5 = i2 + 51;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 59;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "UrgencyState(urgencyVariant=" + this.RemoteActionCompatParcelizer + ", urgencyText=" + this.write + ")";
        int i2 = read + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
