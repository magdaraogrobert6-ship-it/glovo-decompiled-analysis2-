package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$Address$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setOnRequesterReady;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class BringIntoViewNoderequester1 {
    public static final StateV3$AcceptData$Address$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Address$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 21;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setOnRequesterReady setonrequesterready = setOnRequesterReady.IconCompatParcelizer;
            int i4 = serializer + 125;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
            return setonrequesterready;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final double latitude;
    public final double longitude;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Address$Companion] */
    static {
        int i = write + 83;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final double RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 81;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        double d = this.latitude;
        int i5 = i2 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return d;
        }
        throw null;
    }

    public final double write() {
        int i = 2 % 2;
        int i2 = read + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        double d = this.longitude;
        int i5 = i3 + 37;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ BringIntoViewNoderequester1(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setOnRequesterReady.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        int i4 = IconCompatParcelizer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "Address(latitude=", ", longitude="));
        int i4 = IconCompatParcelizer + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BringIntoViewNoderequester1)) {
            int i4 = i2 + 121;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        BringIntoViewNoderequester1 bringIntoViewNoderequester1 = (BringIntoViewNoderequester1) obj;
        if (Double.compare(this.latitude, bringIntoViewNoderequester1.latitude) != 0) {
            int i6 = read + 33;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        if (Double.compare(this.longitude, bringIntoViewNoderequester1.longitude) == 0) {
            return true;
        }
        int i7 = IconCompatParcelizer + 61;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
