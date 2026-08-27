package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class byte2HexFormatted implements resizeToBitmapDimensionslambda0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final setPurchaseToken RemoteActionCompatParcelizer;
    public final List serializer;

    public byte2HexFormatted(setPurchaseToken setpurchasetoken, List list) {
        list.getClass();
        this.RemoteActionCompatParcelizer = setpurchasetoken;
        this.serializer = list;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        setPurchaseToken setpurchasetoken = this.RemoteActionCompatParcelizer;
        if (setpurchasetoken == null) {
            int i5 = i3 + 73;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 77;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode = 0;
        } else {
            iHashCode = setpurchasetoken.hashCode();
        }
        return this.serializer.hashCode() + (iHashCode * 31);
    }

    public static byte2HexFormatted RemoteActionCompatParcelizer(byte2HexFormatted byte2hexformatted, setPurchaseToken setpurchasetoken, ArrayList arrayList, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 17;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            setpurchasetoken = byte2hexformatted.RemoteActionCompatParcelizer;
            int i5 = i4 + 27;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            int i7 = IconCompatParcelizer + 21;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            list = byte2hexformatted.serializer;
        }
        byte2hexformatted.getClass();
        list.getClass();
        return new byte2HexFormatted(setpurchasetoken, list);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RequestBreakViewState(selectedOption=" + this.RemoteActionCompatParcelizer + ", breakRequestOptions=" + this.serializer + ")";
        int i2 = read + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 61;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof byte2HexFormatted)) {
            return false;
        }
        byte2HexFormatted byte2hexformatted = (byte2HexFormatted) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, byte2hexformatted.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, byte2hexformatted.serializer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = read + 121;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 109;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
