package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.LastStop$Location$Companion;
import kotlinx.serialization.Serializable;
import o.onActivityPostCreated;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class onActivityPreCreated {
    public static final LastStop$Location$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.LastStop$Location$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 19;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onActivityPostCreated onactivitypostcreated = onActivityPostCreated.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 123;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return onactivitypostcreated;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final double latitude;
    public final double longitude;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.LastStop$Location$Companion] */
    static {
        int i = write + 113;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final double RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 51;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        double d = this.latitude;
        int i5 = i2 + 61;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return d;
        }
        throw null;
    }

    public final double serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 53;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        double d = this.longitude;
        int i5 = i2 + 97;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d;
    }

    public /* synthetic */ onActivityPreCreated(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, onActivityPostCreated.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Double.hashCode(this.longitude) * (Double.hashCode(this.latitude) % 104);
        } else {
            iHashCode = Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 49;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "Location(latitude=", ", longitude="));
            int i3 = read + 79;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "Location(latitude=", ", longitude="));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public onActivityPreCreated(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof onActivityPreCreated) {
            onActivityPreCreated onactivityprecreated = (onActivityPreCreated) obj;
            if (Double.compare(this.latitude, onactivityprecreated.latitude) != 0 || Double.compare(this.longitude, onactivityprecreated.longitude) != 0) {
                return false;
            }
            int i5 = RemoteActionCompatParcelizer + 43;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i6 = i3 + 33;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 37 / 0;
        }
        return false;
    }
}
