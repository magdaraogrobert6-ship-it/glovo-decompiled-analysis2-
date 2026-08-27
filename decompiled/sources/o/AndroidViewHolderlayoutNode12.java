package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.Location$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderlayoutNode13;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidViewHolderlayoutNode12 {
    public static final Location$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Location$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            AndroidViewHolderlayoutNode13 androidViewHolderlayoutNode13;
            int i = 2 % 2;
            int i2 = read + 27;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                androidViewHolderlayoutNode13 = AndroidViewHolderlayoutNode13.IconCompatParcelizer;
                int i3 = 60 / 0;
            } else {
                androidViewHolderlayoutNode13 = AndroidViewHolderlayoutNode13.IconCompatParcelizer;
            }
            int i4 = RemoteActionCompatParcelizer + 95;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return androidViewHolderlayoutNode13;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String caption;
    public final double latitude;
    public final double longitude;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Location$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final double RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        double d = this.latitude;
        int i5 = i3 + 53;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d;
    }

    public final double read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 91;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        double d = this.longitude;
        int i5 = i2 + 21;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d;
    }

    public /* synthetic */ AndroidViewHolderlayoutNode12(double d, double d2, int i, String str) {
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
            if ((i & 4) == 0) {
                this.caption = null;
                int i2 = read + 101;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 62 / 0;
                    return;
                }
                return;
            }
            this.caption = str;
            int i4 = write + 9;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidViewHolderlayoutNode13.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r1 r2
  0x0047: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r2v9 java.lang.String) = (r2v2 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iRemoteActionCompatParcelizer;
        String str;
        int i;
        int i2;
        int iHashCode;
        int i3 = 2 % 2;
        int i4 = read + 51;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 34, 93);
            str = this.caption;
            if (str == null) {
                i = write + 97;
                read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                iHashCode = 1 ^ i2;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
            str = this.caption;
            if (str == null) {
                i = write + 97;
                read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                iHashCode = 1 ^ i2;
            } else {
                iHashCode = str.hashCode();
            }
        }
        return iRemoteActionCompatParcelizer + iHashCode;
    }

    public AndroidViewHolderlayoutNode12(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
        this.caption = null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.latitude, "Location(latitude=", ", longitude=");
        sbM.append(this.longitude);
        sbM.append(", caption=");
        sbM.append(this.caption);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 61;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidViewHolderlayoutNode12)) {
            int i2 = write + 59;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12 = (AndroidViewHolderlayoutNode12) obj;
        if (Double.compare(this.latitude, androidViewHolderlayoutNode12.latitude) != 0) {
            int i4 = write + 109;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (Double.compare(this.longitude, androidViewHolderlayoutNode12.longitude) != 0) {
            int i6 = read + 93;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.caption, androidViewHolderlayoutNode12.caption}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i7 = write + 67;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
