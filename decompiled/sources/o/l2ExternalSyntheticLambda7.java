package o;

import com.mapbox.api.directions.v5.models.RouteOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class l2ExternalSyntheticLambda7 extends lExternalSyntheticLambda2 {
    private static int read = 1;
    private static int write;
    public final RouteOptions IconCompatParcelizer;
    public final String serializer;

    public l2ExternalSyntheticLambda7(RouteOptions routeOptions, String str) {
        routeOptions.getClass();
        this.IconCompatParcelizer = routeOptions;
        this.serializer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 3;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.IconCompatParcelizer.hashCode();
            iHashCode = this.serializer.hashCode();
            i = iHashCode2 - 68;
        } else {
            int iHashCode3 = this.IconCompatParcelizer.hashCode();
            iHashCode = this.serializer.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = write + 61;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Canceled(routeOptions=" + this.IconCompatParcelizer + ", routerOrigin=" + this.serializer + ")";
        int i2 = write + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof l2ExternalSyntheticLambda7)) {
                return false;
            }
            l2ExternalSyntheticLambda7 l2externalsyntheticlambda7 = (l2ExternalSyntheticLambda7) obj;
            Object[] objArr = {this.IconCompatParcelizer, l2externalsyntheticlambda7.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i3 = read + 87;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!this.serializer.equals(l2externalsyntheticlambda7.serializer)) {
                return false;
            }
        }
        int i5 = write + 19;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
