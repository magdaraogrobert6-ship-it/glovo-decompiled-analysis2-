package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda315 extends lambda311 {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final enableBridgeSecurity RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;
    public final String write;

    public lambda315(enableBridgeSecurity enablebridgesecurity, String str, String str2, boolean z) {
        enablebridgesecurity.getClass();
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = enablebridgesecurity;
        this.write = str;
        this.read = str2;
        this.serializer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.serializer) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write), 31, this.read);
        int i4 = IconCompatParcelizer + 21;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof lambda315) {
            lambda315 lambda315Var = (lambda315) obj;
            if (this.RemoteActionCompatParcelizer != lambda315Var.RemoteActionCompatParcelizer) {
                int i2 = MediaDescriptionCompat + 107;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, lambda315Var.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, lambda315Var.read}, getCieXyz.write())).booleanValue() ^ true) && this.serializer == lambda315Var.serializer;
        }
        int i4 = IconCompatParcelizer + 81;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ButtonViewEntity(type=" + this.RemoteActionCompatParcelizer + ", key=" + this.write + ", text=" + this.read + ", isEnabled=" + this.serializer + ")";
        int i2 = MediaDescriptionCompat + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return str;
    }
}
