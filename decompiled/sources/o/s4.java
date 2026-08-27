package o;

import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public final class s4 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Integer RemoteActionCompatParcelizer;
    public final String read;
    public final TagColorToken serializer;

    public s4(String str, Integer num, TagColorToken tagColorToken) {
        str.getClass();
        tagColorToken.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = num;
        this.serializer = tagColorToken;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.read.hashCode();
        Integer num = this.RemoteActionCompatParcelizer;
        if (num == null) {
            int i4 = IconCompatParcelizer + 39;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        return this.serializer.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            int i2 = IconCompatParcelizer + 25;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        s4 s4Var = (s4) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, s4Var.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, s4Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i4 = write + 53;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.serializer != s4Var.serializer) {
            int i6 = IconCompatParcelizer + 13;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = write + 123;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AddressBadge(text=" + this.read + ", icon=" + this.RemoteActionCompatParcelizer + ", style=" + this.serializer + ")";
        int i2 = write + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
