package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes3.dex */
public final class fd extends LoadBalancer$Helper {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final double IconCompatParcelizer;
    public final double RemoteActionCompatParcelizer;

    public fd(double d, double d2) {
        this.RemoteActionCompatParcelizer = d;
        this.IconCompatParcelizer = d2;
    }

    public /* synthetic */ fd() {
        this(3.0d, 1.5d);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.IconCompatParcelizer) + (Double.hashCode(this.RemoteActionCompatParcelizer) * 31);
        int i4 = MediaSessionCompatQueueItem + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "Dashed(dashLength=", ", gapLength="));
        int i4 = MediaSessionCompatQueueItem + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 115;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this != obj) {
            if (obj instanceof fd) {
                fd fdVar = (fd) obj;
                return Double.compare(this.RemoteActionCompatParcelizer, fdVar.RemoteActionCompatParcelizer) == 0 && Double.compare(this.IconCompatParcelizer, fdVar.IconCompatParcelizer) == 0;
            }
            int i5 = i2 + 115;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i4 + 71;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i4 + 83;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 60 / 0;
        }
        return true;
    }
}
