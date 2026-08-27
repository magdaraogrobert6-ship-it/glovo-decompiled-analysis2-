package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.database.entity.state.Courier$Shift$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.PlatformSpanStyle;
import o.setGraphicModalMaxWidthDp;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getEmojiSupportMatch_3YsG6Y {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final Courier$Shift$Companion Companion = new Object() { // from class: com.roadrunner.database.entity.state.Courier$Shift$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            PlatformSpanStyle platformSpanStyle;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 61;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                platformSpanStyle = PlatformSpanStyle.write;
                int i3 = 47 / 0;
            } else {
                platformSpanStyle = PlatformSpanStyle.write;
            }
            int i4 = serializer + 29;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return platformSpanStyle;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String area;
    public final DateTime endedAt;
    public final Long id;
    public final DateTime startedAt;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.entity.state.Courier$Shift$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(8)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(9)), null, null};
        int i = serializer + 13;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getEmojiSupportMatch_3YsG6Y(int i, DateTime dateTime, DateTime dateTime2, String str, Long l) {
        if ((i & 1) == 0) {
            this.startedAt = null;
        } else {
            this.startedAt = dateTime;
        }
        if ((i & 2) == 0) {
            this.endedAt = null;
        } else {
            this.endedAt = dateTime2;
        }
        if ((i & 4) == 0) {
            int i2 = IconCompatParcelizer + 81;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.area = null;
            int i4 = 2 % 2;
        } else {
            this.area = str;
        }
        if ((i & 8) == 0) {
            this.id = null;
            int i5 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        this.id = l;
        int i7 = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v13 org.joda.time.DateTime) = (r1v4 org.joda.time.DateTime), (r1v15 org.joda.time.DateTime) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        DateTime dateTime;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode4 = 0;
        if (i2 % 2 != 0) {
            dateTime = this.startedAt;
            iHashCode = 1;
            if (dateTime == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = dateTime.hashCode();
            }
        } else {
            dateTime = this.startedAt;
            iHashCode = 0;
            if (dateTime == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = dateTime.hashCode();
            }
        }
        DateTime dateTime2 = this.endedAt;
        if (dateTime2 == null) {
            int i3 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = dateTime2.hashCode();
        }
        String str = this.area;
        if (str == null) {
            int i5 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            iHashCode4 = str.hashCode();
        }
        Long l = this.id;
        if (l != null) {
            iHashCode = l.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Shift(startedAt=" + this.startedAt + ", endedAt=" + this.endedAt + ", area=" + this.area + ", id=" + this.id + ")";
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEmojiSupportMatch_3YsG6Y)) {
            int i4 = i3 + 91;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        getEmojiSupportMatch_3YsG6Y getemojisupportmatch_3ysg6y = (getEmojiSupportMatch_3YsG6Y) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startedAt, getemojisupportmatch_3ysg6y.startedAt}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endedAt, getemojisupportmatch_3ysg6y.endedAt}, getCieXyz.write())).booleanValue()) {
            int i8 = RemoteActionCompatParcelizer + 35;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.area, getemojisupportmatch_3ysg6y.area}, getCieXyz.write())).booleanValue()) {
            int i10 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 42 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, getemojisupportmatch_3ysg6y.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i12 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return true;
    }
}
