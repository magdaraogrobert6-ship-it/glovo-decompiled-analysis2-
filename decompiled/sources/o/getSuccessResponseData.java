package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getSuccessResponseData {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final List serializer;

    public getSuccessResponseData(List list) {
        this.serializer = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + 626439718;
        int i4 = RemoteActionCompatParcelizer + 7;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return MediaSessionCompatQueueItem.read("GeoJson(type=Polygon, coordinates=", ")", this.serializer);
        }
        MediaSessionCompatQueueItem.read("GeoJson(type=Polygon, coordinates=", ")", this.serializer);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof getSuccessResponseData) && this.serializer.equals(((getSuccessResponseData) obj).serializer)) {
            return true;
        }
        int i4 = read + 57;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return false;
    }
}
