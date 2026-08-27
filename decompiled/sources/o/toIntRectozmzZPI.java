package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class toIntRectozmzZPI {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final List RemoteActionCompatParcelizer;
    public final List serializer;

    public toIntRectozmzZPI(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.serializer = list;
        this.RemoteActionCompatParcelizer = list2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() % (this.serializer.hashCode() / 69);
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        }
        int i3 = write + 53;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CameraOverlayV2State(instructions=" + this.serializer + ", tags=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof toIntRectozmzZPI))) {
            toIntRectozmzZPI tointrectozmzzpi = (toIntRectozmzZPI) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, tointrectozmzzpi.serializer}, getCieXyz.write())).booleanValue()) {
                int i5 = write + 27;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i5 % 2 != 0;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, tointrectozmzzpi.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i6 = IconCompatParcelizer + 53;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i7 = i3 + 61;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }
}
