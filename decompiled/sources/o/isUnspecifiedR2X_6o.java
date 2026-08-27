package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class isUnspecifiedR2X_6o {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public final setFitInsetsSides IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final List read;
    public final AndroidPopup_androidKtPopup41 write;

    public isUnspecifiedR2X_6o(AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41, setFitInsetsSides setfitinsetssides, ArrayList arrayList, List list) {
        this.write = androidPopup_androidKtPopup41;
        this.IconCompatParcelizer = setfitinsetssides;
        this.read = arrayList;
        this.RemoteActionCompatParcelizer = list;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        AndroidPopup_androidKtPopup41 androidPopup_androidKtPopup41 = this.write;
        if (androidPopup_androidKtPopup41 == null) {
            int i2 = serializer + 81;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = androidPopup_androidKtPopup41.hashCode();
        }
        setFitInsetsSides setfitinsetssides = this.IconCompatParcelizer;
        int iHashCode3 = setfitinsetssides == null ? 0 : setfitinsetssides.hashCode();
        List list = this.read;
        if (list == null) {
            int i3 = serializer + 9;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
        }
        List list2 = this.RemoteActionCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StateV3Delivery(data=" + this.write + ", metadata=" + this.IconCompatParcelizer + ", externalComponents=" + this.read + ", hosts=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 31;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isUnspecifiedR2X_6o)) {
            return false;
        }
        isUnspecifiedR2X_6o isunspecifiedr2x_6o = (isUnspecifiedR2X_6o) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, isunspecifiedr2x_6o.write}, getCieXyz.write())).booleanValue()) {
            int i3 = MediaMetadataCompat + 67;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, isunspecifiedr2x_6o.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i5 = serializer + 39;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, isunspecifiedr2x_6o.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, isunspecifiedr2x_6o.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = serializer + 13;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
