package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getChangingConfigurations extends setTranslateX {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final RoomDatabaseperformClear11 read;
    public final RoomDatabaseExternalSyntheticLambda2 serializer;

    public getChangingConfigurations(RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2) {
        roomDatabaseperformClear11.getClass();
        roomDatabaseExternalSyntheticLambda2.getClass();
        this.read = roomDatabaseperformClear11;
        this.serializer = roomDatabaseExternalSyntheticLambda2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.serializer.hashCode() << (this.read.hashCode() * 27);
        } else {
            iHashCode = (this.read.hashCode() * 31) + this.serializer.hashCode();
        }
        int i3 = write + 75;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 43;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
            return true;
        }
        if (!(obj instanceof getChangingConfigurations)) {
            return false;
        }
        getChangingConfigurations getchangingconfigurations = (getChangingConfigurations) obj;
        if (this.read == getchangingconfigurations.read) {
            return this.serializer == getchangingconfigurations.serializer;
        }
        int i4 = write + 89;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FailLiveness(failReason=" + this.read + ", invocationSite=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
