package o;

import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final List read;
    public final GeoJsonSource serializer;

    public j0(GeoJsonSource geoJsonSource, List list) {
        this.serializer = geoJsonSource;
        this.read = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 57;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.serializer == j0Var.serializer) {
                if (this.read.equals(j0Var.read)) {
                    return true;
                }
            } else {
                int i6 = i2 + 43;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
        } else {
            int i8 = i4 + 29;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MapboxLayerData(source=" + this.serializer + ", layers=" + this.read + ")";
        int i2 = write + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return str;
    }
}
