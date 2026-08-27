package o;

/* JADX INFO: loaded from: classes3.dex */
public final class performHandwritingGesture {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final boolean IconCompatParcelizer;
    public final boolean read;

    public performHandwritingGesture(boolean z, boolean z2) {
        this.read = z;
        this.IconCompatParcelizer = z2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = Boolean.hashCode(this.IconCompatParcelizer) >>> (Boolean.hashCode(this.read) + 50);
        } else {
            iHashCode = (Boolean.hashCode(this.read) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
        }
        int i3 = RemoteActionCompatParcelizer + 33;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 73;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 3 % 5;
            }
        } else {
            if (!(obj instanceof performHandwritingGesture)) {
                return false;
            }
            performHandwritingGesture performhandwritinggesture = (performHandwritingGesture) obj;
            if (this.read != performhandwritinggesture.read || this.IconCompatParcelizer != performhandwritinggesture.IconCompatParcelizer) {
                return false;
            }
        }
        int i4 = serializer + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ClientImageUpdates(liked=" + this.read + ", disliked=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
