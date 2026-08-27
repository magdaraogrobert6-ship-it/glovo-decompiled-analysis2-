package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaYAM2cpr9V1_3EfhFf4ccLsLAnN0 extends PointerInteropFilterDispatchToViewState {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String read;

    public r8lambdaYAM2cpr9V1_3EfhFf4ccLsLAnN0(String str) {
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = RemoteActionCompatParcelizer + 43;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("WebAppOpen(url=", this.read, ")");
        int i4 = RemoteActionCompatParcelizer + 111;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 3;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            int i3 = 3 % 2;
            return true;
        }
        if ((obj instanceof r8lambdaYAM2cpr9V1_3EfhFf4ccLsLAnN0) && this.read.equals(((r8lambdaYAM2cpr9V1_3EfhFf4ccLsLAnN0) obj).read)) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
