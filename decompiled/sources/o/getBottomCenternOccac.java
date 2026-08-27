package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class getBottomCenternOccac implements getSizeYbymL2gannotations {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final wrapper read;

    static {
        SignatureTaskUiItem$Companion signatureTaskUiItem$Companion = wrapper.Companion;
        int i = write + 31;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public getBottomCenternOccac(wrapper wrapperVar) {
        wrapperVar.getClass();
        this.read = wrapperVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 69;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenSignature(item=" + this.read + ")";
        int i2 = serializer + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof getBottomCenternOccac))) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((getBottomCenternOccac) obj).read}, getCieXyz.write())).booleanValue();
        }
        int i2 = serializer + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return false;
    }
}
