package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HyphensKt extends HyphensCompanion {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final List read;
    public final getSimplefcGXIks serializer;

    public final getSimplefcGXIks read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 125;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getSimplefcGXIks getsimplefcgxiks = this.serializer;
        int i5 = i2 + 43;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return getsimplefcgxiks;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        List list = this.read;
        int i5 = i3 + 75;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public HyphensKt(getSimplefcGXIks getsimplefcgxiks, List list) {
        getsimplefcgxiks.getClass();
        list.getClass();
        this.serializer = getsimplefcgxiks;
        this.read = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() * this.serializer.hashCode() * 27;
        }
        return this.read.hashCode() + (this.serializer.hashCode() * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Preview(routeOptions=" + this.serializer + ", secondaryDestinations=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 31;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 11;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (!(obj instanceof HyphensKt)) {
            return false;
        }
        HyphensKt hyphensKt = (HyphensKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, hyphensKt.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, hyphensKt.read}, getCieXyz.write())).booleanValue();
    }
}
