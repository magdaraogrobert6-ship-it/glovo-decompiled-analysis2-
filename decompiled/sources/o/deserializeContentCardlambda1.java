package o;

/* JADX INFO: loaded from: classes3.dex */
public final class deserializeContentCardlambda1 extends deserializeContentCardlambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;

    public deserializeContentCardlambda1(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.IconCompatParcelizer = str;
    }

    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 61;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.IconCompatParcelizer;
            int i4 = 83 / 0;
        } else {
            str = this.IconCompatParcelizer;
        }
        int i5 = i2 + 105;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Integer.hashCode(1) - ((ddefault.IconCompatParcelizer.hashCode() / (this.IconCompatParcelizer.hashCode() << 66)) - 68);
        } else {
            iHashCode = Integer.hashCode(0) + ((ddefault.IconCompatParcelizer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31)) * 31);
        }
        int i3 = serializer + 19;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof deserializeContentCardlambda1) {
            if (!this.IconCompatParcelizer.equals(((deserializeContentCardlambda1) obj).IconCompatParcelizer)) {
                return false;
            }
            ddefault ddefaultVar = ddefault.serializer;
            return true;
        }
        int i4 = i3 + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        int i5 = 5 / 5;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowError(message=" + this.IconCompatParcelizer + ", type=" + ddefault.IconCompatParcelizer + ", length=0)";
        int i2 = serializer + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
