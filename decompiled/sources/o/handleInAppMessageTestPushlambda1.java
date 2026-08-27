package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import com.roadrunner.startworking.data.stopworking.entity.LocationRequest$Companion;
import kotlinx.serialization.Serializable;
import o.handleInAppMessageTestPushlambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class handleInAppMessageTestPushlambda1 {
    public static final LocationRequest$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.stopworking.entity.LocationRequest$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                handleInAppMessageTestPushlambda0 handleinappmessagetestpushlambda0 = handleInAppMessageTestPushlambda0.IconCompatParcelizer;
                throw null;
            }
            handleInAppMessageTestPushlambda0 handleinappmessagetestpushlambda1 = handleInAppMessageTestPushlambda0.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return handleinappmessagetestpushlambda1;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final float accuracy;
    public final float heading;
    public final double lat;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    public final double f11long;
    public final float speed;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.stopworking.entity.LocationRequest$Companion] */
    static {
        int i = write + 35;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ handleInAppMessageTestPushlambda1(int i, double d, double d2, float f, float f2, float f3) {
        if (31 == (i & 31)) {
            this.lat = d;
            this.f11long = d2;
            this.accuracy = f;
            this.heading = f2;
            this.speed = f3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, handleInAppMessageTestPushlambda0.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.speed) + af$$ExternalSyntheticOutline1.m(this.heading, af$$ExternalSyntheticOutline1.m(this.accuracy, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.f11long, Double.hashCode(this.lat) * 31, 31), 31), 31);
        int i4 = read + 29;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.lat, "LocationRequest(lat=", ", long=");
        sbM.append(this.f11long);
        sbM.append(", accuracy=");
        sbM.append(this.accuracy);
        sbM.append(", heading=");
        sbM.append(this.heading);
        sbM.append(", speed=");
        sbM.append(this.speed);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 123;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 7;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof handleInAppMessageTestPushlambda1)) {
            int i8 = i4 + 125;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 != 0;
        }
        handleInAppMessageTestPushlambda1 handleinappmessagetestpushlambda1 = (handleInAppMessageTestPushlambda1) obj;
        if (Double.compare(this.lat, handleinappmessagetestpushlambda1.lat) != 0) {
            return false;
        }
        if (Double.compare(this.f11long, handleinappmessagetestpushlambda1.f11long) != 0) {
            int i9 = read + 27;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (Float.compare(this.accuracy, handleinappmessagetestpushlambda1.accuracy) != 0) {
            return false;
        }
        if (Float.compare(this.heading, handleinappmessagetestpushlambda1.heading) == 0) {
            return Float.compare(this.speed, handleinappmessagetestpushlambda1.speed) == 0;
        }
        int i11 = read + 5;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
