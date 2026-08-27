package o;

/* JADX INFO: loaded from: classes3.dex */
public final class m1ExternalSyntheticLambda28 extends m1ExternalSyntheticLambda7 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final ArrangementCenter1 read;

    public final ArrangementCenter1 read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ArrangementCenter1 arrangementCenter1 = this.read;
        int i4 = i3 + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return arrangementCenter1;
    }

    public m1ExternalSyntheticLambda28(ArrangementCenter1 arrangementCenter1) {
        this.read = arrangementCenter1;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 35;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Failure(reason=" + this.read + ")";
        int i2 = serializer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj || ((obj instanceof m1ExternalSyntheticLambda28) && !(!this.read.equals(((m1ExternalSyntheticLambda28) obj).read)))) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 19;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
