package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.database.entity.CoordinateEntity$Companion;
import kotlinx.serialization.Serializable;
import o.onAttributionChanged;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class OnAttributionChangedListener {
    public static final CoordinateEntity$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.database.entity.CoordinateEntity$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 25;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onAttributionChanged onattributionchanged = onAttributionChanged.serializer;
            int i4 = IconCompatParcelizer + 21;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return onattributionchanged;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final double lat;
    public final double lng;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.database.entity.CoordinateEntity$Companion] */
    static {
        int i = read + 79;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final double IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        double d = this.lng;
        int i5 = i3 + 99;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.lat;
        }
        throw null;
    }

    public /* synthetic */ OnAttributionChangedListener(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.lat = d;
            this.lng = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, onAttributionChanged.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.lng) + (Double.hashCode(this.lat) * 31);
        int i4 = serializer + 5;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(this.lng, ")", af$$ExternalSyntheticOutline0.m(this.lat, "CoordinateEntity(lat=", ", lng="));
        }
        ff$$ExternalSyntheticOutline0.m(this.lng, ")", af$$ExternalSyntheticOutline0.m(this.lat, "CoordinateEntity(lat=", ", lng="));
        throw null;
    }

    public OnAttributionChangedListener(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 125;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof OnAttributionChangedListener)) {
            return false;
        }
        OnAttributionChangedListener onAttributionChangedListener = (OnAttributionChangedListener) obj;
        if (Double.compare(this.lat, onAttributionChangedListener.lat) != 0) {
            return false;
        }
        if (Double.compare(this.lng, onAttributionChangedListener.lng) == 0) {
            return true;
        }
        int i4 = IconCompatParcelizer + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
