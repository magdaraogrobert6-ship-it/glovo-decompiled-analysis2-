package o;

/* JADX INFO: loaded from: classes3.dex */
public final class RoomDatabaseperformClear111 extends RoomDatabasecloseBarrier1 {
    private static int serializer = 0;
    private static int write = 1;
    public final RoomOpenHelperDelegate RemoteActionCompatParcelizer;

    public RoomDatabaseperformClear111(RoomOpenHelperDelegate roomOpenHelperDelegate) {
        this.RemoteActionCompatParcelizer = roomOpenHelperDelegate;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = write + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 103;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            return (obj instanceof RoomDatabaseperformClear111) && this.RemoteActionCompatParcelizer == ((RoomDatabaseperformClear111) obj).RemoteActionCompatParcelizer;
        }
        int i5 = i2 + 3;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSuccessChallenge(challengeType=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
