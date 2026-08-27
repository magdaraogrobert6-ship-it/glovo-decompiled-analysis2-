package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.data.database.entity.Delivery$Payment$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.z2;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class zExternalSyntheticLambda1 {
    public static final Delivery$Payment$Companion Companion = new Object() { // from class: com.roadrunner.order.history.data.database.entity.Delivery$Payment$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 117;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                z2 z2Var = z2.read;
                obj.hashCode();
                throw null;
            }
            z2 z2Var2 = z2.read;
            int i3 = serializer + 85;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return z2Var2;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final int estimatedTotalLower;
    public final int estimatedTotalUpper;
    public final double onlineTip;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.order.history.data.database.entity.Delivery$Payment$Companion] */
    static {
        int i = read + 93;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ zExternalSyntheticLambda1(int i, double d, int i2, int i3) {
        this.onlineTip = (i & 1) == 0 ? 0.0d : d;
        if ((i & 2) == 0) {
            this.estimatedTotalLower = 0;
        } else {
            this.estimatedTotalLower = i2;
            int i4 = write + 9;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.estimatedTotalUpper = 0;
            return;
        }
        this.estimatedTotalUpper = i3;
        int i7 = write + 111;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = Integer.hashCode(this.estimatedTotalUpper) * af$$ExternalSyntheticOutline0.m(this.estimatedTotalLower, Double.hashCode(this.onlineTip) % 89, 56);
        } else {
            iHashCode = Integer.hashCode(this.estimatedTotalUpper) + af$$ExternalSyntheticOutline0.m(this.estimatedTotalLower, Double.hashCode(this.onlineTip) * 31, 31);
        }
        int i3 = write + 87;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public zExternalSyntheticLambda1(double d, int i, int i2) {
        this.onlineTip = d;
        this.estimatedTotalLower = i;
        this.estimatedTotalUpper = i2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 117;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 111;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof zExternalSyntheticLambda1)) {
            int i7 = i2 + 123;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        zExternalSyntheticLambda1 zexternalsyntheticlambda1 = (zExternalSyntheticLambda1) obj;
        if (Double.compare(this.onlineTip, zexternalsyntheticlambda1.onlineTip) == 0) {
            return this.estimatedTotalLower == zexternalsyntheticlambda1.estimatedTotalLower && this.estimatedTotalUpper == zexternalsyntheticlambda1.estimatedTotalUpper;
        }
        int i9 = serializer + 37;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Payment(onlineTip=" + this.onlineTip + ", estimatedTotalLower=" + this.estimatedTotalLower + ", estimatedTotalUpper=" + this.estimatedTotalUpper + ")";
        int i2 = write + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
