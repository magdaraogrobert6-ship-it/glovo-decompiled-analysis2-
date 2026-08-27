package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.breakrequest.data.entity.BreakRequest$Companion;
import kotlinx.serialization.Serializable;
import o.getPurchaseToken;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getEventToken {
    public static final BreakRequest$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.breakrequest.data.entity.BreakRequest$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 115;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPurchaseToken getpurchasetoken = getPurchaseToken.serializer;
            int i4 = RemoteActionCompatParcelizer + 97;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return getpurchasetoken;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String duration;
    public final String reason;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.breakrequest.data.entity.BreakRequest$Companion] */
    static {
        int i = read + 57;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getEventToken(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.duration = str;
            if ((i & 2) == 0) {
                this.reason = null;
                int i2 = RemoteActionCompatParcelizer + 103;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.reason = str2;
            int i4 = RemoteActionCompatParcelizer + 55;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getPurchaseToken.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BreakRequest(duration=", this.duration, ", reason=", this.reason, ")");
            int i3 = 84 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BreakRequest(duration=", this.duration, ", reason=", this.reason, ")");
        }
        int i4 = RemoteActionCompatParcelizer + 63;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return strWrite;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r1 r3
  0x0038: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.duration.hashCode();
            str = this.reason;
            int i3 = 50 / 0;
            if (str == null) {
                int i4 = write;
                int i5 = i4 + 35;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i4 + 99;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = this.duration.hashCode();
            str = this.reason;
            if (str == null) {
                int i9 = write;
                int i10 = i9 + 35;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                int i12 = i9 + 99;
                RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                iHashCode2 = str.hashCode();
            }
        }
        int i14 = (iHashCode * 31) + iHashCode2;
        int i15 = write + 61;
        RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i16 = i15 % 2;
        return i14;
    }

    public getEventToken(String str) {
        str.getClass();
        this.duration = str;
        this.reason = null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getEventToken) {
            getEventToken geteventtoken = (getEventToken) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.duration, geteventtoken.duration}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reason, geteventtoken.reason}, getCieXyz.write())).booleanValue();
            }
            int i2 = write + 25;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
