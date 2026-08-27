package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class f8ExternalSyntheticLambda2 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final int IconCompatParcelizer;
    public final int read;

    public f8ExternalSyntheticLambda2(int i, int i2) {
        this.IconCompatParcelizer = i;
        this.read = i2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.read, "ClusteredMarkerColors(circleColor=", ", textColor=", ")");
            int i3 = serializer + 103;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            throw null;
        }
        af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.read, "ClusteredMarkerColors(circleColor=", ", textColor=", ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Integer.hashCode(this.read) << (Integer.hashCode(this.IconCompatParcelizer) - 57);
        }
        return (Integer.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.read);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 61;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof f8ExternalSyntheticLambda2) {
            f8ExternalSyntheticLambda2 f8externalsyntheticlambda2 = (f8ExternalSyntheticLambda2) obj;
            return this.IconCompatParcelizer == f8externalsyntheticlambda2.IconCompatParcelizer && this.read == f8externalsyntheticlambda2.read;
        }
        int i4 = i2 + 63;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 33;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
