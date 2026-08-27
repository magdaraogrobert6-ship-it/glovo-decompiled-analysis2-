package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedrAG3T2kannotations extends getStrictnessusljTpc implements Hyphens {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final getSimplefcGXIks read;
    public final List serializer;

    @Override // o.Hyphens
    public final getSimplefcGXIks read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read;
        }
        throw null;
    }

    public getUnspecifiedrAG3T2kannotations(getSimplefcGXIks getsimplefcgxiks, List list) {
        getsimplefcgxiks.getClass();
        list.getClass();
        this.read = getsimplefcgxiks;
        this.serializer = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (this.read.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 89;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RoutePreview(routeOptions=" + this.read + ", secondaryDestinations=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 1;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getUnspecifiedrAG3T2kannotations)) {
            return false;
        }
        getUnspecifiedrAG3T2kannotations getunspecifiedrag3t2kannotations = (getUnspecifiedrAG3T2kannotations) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getunspecifiedrag3t2kannotations.read}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getunspecifiedrag3t2kannotations.serializer}, getCieXyz.write())).booleanValue();
        }
        int i4 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
