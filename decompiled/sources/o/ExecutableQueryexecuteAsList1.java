package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecutableQueryexecuteAsList1 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String write;

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i3 + 27;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public ExecutableQueryexecuteAsList1(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("EquipmentInfo(equipmentVehicle=", this.IconCompatParcelizer, ", equipmentBag=", this.write, ")");
            int i3 = read + 17;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("EquipmentInfo(equipmentVehicle=", this.IconCompatParcelizer, ", equipmentBag=", this.write, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.IconCompatParcelizer;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = RemoteActionCompatParcelizer + 49;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str2 = this.write;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 93;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof ExecutableQueryexecuteAsList1)) {
            return false;
        }
        ExecutableQueryexecuteAsList1 executableQueryexecuteAsList1 = (ExecutableQueryexecuteAsList1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, executableQueryexecuteAsList1.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer;
            int i7 = i6 + 65;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 121;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, executableQueryexecuteAsList1.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i10 = RemoteActionCompatParcelizer + 105;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            int i11 = 79 / 0;
        }
        return true;
    }
}
