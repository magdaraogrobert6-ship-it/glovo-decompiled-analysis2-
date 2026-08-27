package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreInfoUtil implements resizeToBitmapDimensionslambda0 {
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final List read;

    public StoreInfoUtil(String str, String str2, List list) {
        list.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = list;
        this.IconCompatParcelizer = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + c8$$ExternalSyntheticOutline0.m(this.read, this.RemoteActionCompatParcelizer.hashCode() * 31, 31);
        int i4 = serializer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = serializer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("SettingsInfo(title=", this.RemoteActionCompatParcelizer, ", sections=", this.read, ", buttonTitle="), this.IconCompatParcelizer, ")");
            int i3 = 83 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("SettingsInfo(title=", this.RemoteActionCompatParcelizer, ", sections=", this.read, ", buttonTitle="), this.IconCompatParcelizer, ")");
        }
        int i4 = write + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 87;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof StoreInfoUtil)) {
            return false;
        }
        StoreInfoUtil storeInfoUtil = (StoreInfoUtil) obj;
        if (!this.RemoteActionCompatParcelizer.equals(storeInfoUtil.RemoteActionCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, storeInfoUtil.read}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer.equals(storeInfoUtil.IconCompatParcelizer);
    }
}
