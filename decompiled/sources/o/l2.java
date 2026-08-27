package o;

import com.mapbox.api.directions.v5.models.RouteOptions;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 extends lExternalSyntheticLambda2 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final RouteOptions RemoteActionCompatParcelizer;
    public final List serializer;

    public final List serializer() {
        int i = 2 % 2;
        int i2 = write + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        List list = this.serializer;
        int i5 = i3 + 19;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public l2(List list, RouteOptions routeOptions) {
        routeOptions.getClass();
        this.serializer = list;
        this.RemoteActionCompatParcelizer = routeOptions;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() * (this.serializer.hashCode() + 85);
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        }
        int i3 = write + 85;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Failure(reasons=" + this.serializer + ", routeOptions=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final boolean equals(Object obj) {
        l2 l2Var;
        int i = 2 % 2;
        int i2 = write + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            int i4 = 91 / 0;
            if (this != obj) {
                if (obj instanceof l2) {
                    l2Var = (l2) obj;
                    if (this.serializer.equals(l2Var.serializer)) {
                        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, l2Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                        }
                    }
                } else {
                    int i5 = i3 + 11;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
                return false;
            }
        } else if (this != obj) {
            if (obj instanceof l2) {
                int i7 = i3 + 11;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                l2Var = (l2) obj;
                if (this.serializer.equals(l2Var.serializer)) {
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, l2Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
