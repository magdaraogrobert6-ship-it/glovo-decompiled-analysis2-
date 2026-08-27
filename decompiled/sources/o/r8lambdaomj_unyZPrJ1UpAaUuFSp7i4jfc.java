package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;

    public r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            int i2 = write + 5;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = IconCompatParcelizer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("SideMenuFloatingLayerItemUiState(tooltipText=", this.RemoteActionCompatParcelizer, ")");
        int i4 = IconCompatParcelizer + 59;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 111;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 93;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i8 = i2 + 107;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
