package o;

/* JADX INFO: loaded from: classes3.dex */
public final class instantiateApplication extends checkCompatWrapper {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String read;
    public final int write;

    public instantiateApplication(int i, String str) {
        str.getClass();
        this.write = i;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() / (Integer.hashCode(this.write) - 40);
        }
        return this.read.hashCode() + (Integer.hashCode(this.write) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 3;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (obj instanceof instantiateApplication) {
            instantiateApplication instantiateapplication = (instantiateApplication) obj;
            if (this.write == instantiateapplication.write) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, instantiateapplication.read}, getCieXyz.write())).booleanValue();
            }
            int i3 = serializer + 65;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = serializer + 9;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToBonusCalendar(zoneId=" + this.write + ", zoneName=" + this.read + ")";
        int i2 = IconCompatParcelizer + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
