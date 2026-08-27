package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class addAnimationslambda100 extends AnimationSearchExternalSyntheticLambda2 {
    private static int serializer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;

    public addAnimationslambda100(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = serializer + 101;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("ShowError(error=", this.RemoteActionCompatParcelizer, ")");
        int i4 = write + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj || ((obj instanceof addAnimationslambda100) && this.RemoteActionCompatParcelizer.equals(((addAnimationslambda100) obj).RemoteActionCompatParcelizer))) {
            int i2 = serializer + 33;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i3 = write + 111;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
