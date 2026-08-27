package o;

import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
public final class logCustomEventlambda10 extends logCustomEventlambda1 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final EquipmentBottomSheetParams write;

    public logCustomEventlambda10(EquipmentBottomSheetParams equipmentBottomSheetParams) {
        this.write = equipmentBottomSheetParams;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = RemoteActionCompatParcelizer + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToEquipmentSelection(equipmentBottomSheetParams=" + this.write + ")";
        int i2 = serializer + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof logCustomEventlambda10) {
                if (!this.write.equals(((logCustomEventlambda10) obj).write)) {
                    return false;
                }
            } else {
                int i5 = i3 + 69;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }
}
