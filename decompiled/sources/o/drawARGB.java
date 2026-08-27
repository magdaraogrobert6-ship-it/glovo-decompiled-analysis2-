package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.accept.laststop.api.data.models.RecentLastStop$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class drawARGB {
    public static final RecentLastStop$Companion Companion = new RecentLastStop$Companion();
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String address;
    public final int hitCount;
    public final long lastUpdatedAt;
    public final double lat;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    public final double f9long;

    static {
        int i = read + 7;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ drawARGB(int i, String str, double d, double d2, int i2, long j) {
        if (31 == (i & 31)) {
            this.address = str;
            this.lat = d;
            this.f9long = d2;
            this.hitCount = i2;
            this.lastUpdatedAt = j;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, drawBitmapMesh.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public drawARGB(String str, double d, double d2, int i, long j) {
        str.getClass();
        this.address = str;
        this.lat = d;
        this.f9long = d2;
        this.hitCount = i;
        this.lastUpdatedAt = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.lastUpdatedAt) + af$$ExternalSyntheticOutline0.m(this.hitCount, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.f9long, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.lat, this.address.hashCode() * 31, 31), 31), 31);
        int i4 = write + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 21;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof drawARGB)) {
            return false;
        }
        drawARGB drawargb = (drawARGB) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, drawargb.address}, getCieXyz.write())).booleanValue()) {
            int i4 = write + 17;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (Double.compare(this.lat, drawargb.lat) != 0) {
            int i5 = write + 1;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (Double.compare(this.f9long, drawargb.f9long) != 0) {
            int i7 = IconCompatParcelizer + 81;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (this.hitCount == drawargb.hitCount) {
            return this.lastUpdatedAt == drawargb.lastUpdatedAt;
        }
        int i9 = write + 71;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RecentLastStop(address=" + this.address + ", lat=" + this.lat + ", long=" + this.f9long + ", hitCount=" + this.hitCount + ", lastUpdatedAt=" + this.lastUpdatedAt + ")";
        int i2 = IconCompatParcelizer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
