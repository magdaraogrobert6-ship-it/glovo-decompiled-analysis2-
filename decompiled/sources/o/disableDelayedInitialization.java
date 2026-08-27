package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import com.roadrunner.startworking.data.startworking.StartWorkingRequestLocation$Companion;
import kotlinx.serialization.Serializable;
import o.dismissBannerlambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class disableDelayedInitialization {
    public static final StartWorkingRequestLocation$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.StartWorkingRequestLocation$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 125;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            dismissBannerlambda0 dismissbannerlambda0 = dismissBannerlambda0.serializer;
            int i4 = serializer + 115;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return dismissbannerlambda0;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final float accuracy;
    public final float heading;
    public final double lat;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    public final double f8long;
    public final float speed;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.StartWorkingRequestLocation$Companion] */
    static {
        int i = write + 57;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
    }

    public /* synthetic */ disableDelayedInitialization(int i, double d, double d2, float f, float f2, float f3) {
        if (31 == (i & 31)) {
            this.lat = d;
            this.f8long = d2;
            this.accuracy = f;
            this.heading = f2;
            this.speed = f3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, dismissBannerlambda0.serializer.getDescriptor());
        throw null;
    }

    public disableDelayedInitialization(double d, double d2, float f, float f2, float f3) {
        this.lat = d;
        this.f8long = d2;
        this.accuracy = f;
        this.heading = f2;
        this.speed = f3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.speed) + af$$ExternalSyntheticOutline1.m(this.heading, af$$ExternalSyntheticOutline1.m(this.accuracy, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.f8long, Double.hashCode(this.lat) * 31, 31), 31), 31);
        int i4 = serializer + 7;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.lat, "StartWorkingRequestLocation(lat=", ", long=");
        sbM.append(this.f8long);
        sbM.append(", accuracy=");
        sbM.append(this.accuracy);
        sbM.append(", heading=");
        sbM.append(this.heading);
        sbM.append(", speed=");
        sbM.append(this.speed);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 69;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof disableDelayedInitialization)) {
            return false;
        }
        disableDelayedInitialization disabledelayedinitialization = (disableDelayedInitialization) obj;
        if (Double.compare(this.lat, disabledelayedinitialization.lat) != 0) {
            int i5 = serializer + 31;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (Double.compare(this.f8long, disabledelayedinitialization.f8long) != 0 || Float.compare(this.accuracy, disabledelayedinitialization.accuracy) != 0) {
            return false;
        }
        if (Float.compare(this.heading, disabledelayedinitialization.heading) == 0) {
            return Float.compare(this.speed, disabledelayedinitialization.speed) == 0;
        }
        int i7 = serializer + 45;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
