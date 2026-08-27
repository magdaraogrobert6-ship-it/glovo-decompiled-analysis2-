package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.database.converters.RoomShift$Companion;
import kotlinx.serialization.Serializable;
import o.copyK8Q__8default;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class Placeholder {
    public static final RoomShift$Companion Companion = new Object() { // from class: com.roadrunner.database.converters.RoomShift$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            copyK8Q__8default copyk8q__8default;
            int i = 2 % 2;
            int i2 = serializer + 21;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                copyk8q__8default = copyK8Q__8default.read;
                int i3 = 66 / 0;
            } else {
                copyk8q__8default = copyK8Q__8default.read;
            }
            int i4 = RemoteActionCompatParcelizer + 93;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return copyk8q__8default;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final String area;
    public final Long endedAt;
    public final Long id;
    public final Long startedAt;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.converters.RoomShift$Companion] */
    static {
        int i = write + 15;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Placeholder(int i, Long l, Long l2, String str, Long l3) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.startedAt = null;
            int i2 = 2 % 2;
        } else {
            this.startedAt = l;
        }
        if ((i & 2) == 0) {
            this.endedAt = null;
        } else {
            this.endedAt = l2;
        }
        int i3 = 2 % 2;
        if ((i & 4) == 0) {
            int i4 = read + 101;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.area = null;
                int i5 = 41 / 0;
            } else {
                this.area = null;
            }
        } else {
            this.area = str;
            int i6 = RemoteActionCompatParcelizer + 107;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = 2 % 2;
        if ((i & 8) != 0) {
            this.id = l3;
            return;
        }
        int i9 = read + 5;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            this.id = null;
        } else {
            this.id = null;
            obj.hashCode();
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Long l = this.startedAt;
        int iHashCode3 = 0;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Long l2 = this.endedAt;
        if (l2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = l2.hashCode();
            int i2 = read + 113;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        String str = this.area;
        if (str == null) {
            int i4 = read + 47;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        Long l3 = this.id;
        if (l3 == null) {
            int i5 = read + 97;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            iHashCode3 = l3.hashCode();
        }
        return (((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RoomShift(startedAt=" + this.startedAt + ", endedAt=" + this.endedAt + ", area=" + this.area + ", id=" + this.id + ")";
        int i2 = read + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startedAt, placeholder.startedAt}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endedAt, placeholder.endedAt}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.area, placeholder.area}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, placeholder.id}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i2 = RemoteActionCompatParcelizer + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
