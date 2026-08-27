package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.database.entity.Coordinate$Companion;
import kotlinx.serialization.Serializable;
import o.PlaceholderVerticalAlignCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getTextBottomJ6kI3mc {
    public static final Coordinate$Companion Companion = new Object() { // from class: com.roadrunner.database.entity.Coordinate$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 117;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PlaceholderVerticalAlignCompanion placeholderVerticalAlignCompanion = PlaceholderVerticalAlignCompanion.serializer;
            int i4 = IconCompatParcelizer + 9;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return placeholderVerticalAlignCompanion;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final double lat;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    public final double f10long;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.entity.Coordinate$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 95;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
    }

    public /* synthetic */ getTextBottomJ6kI3mc(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.lat = d;
            this.f10long = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PlaceholderVerticalAlignCompanion.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Double.hashCode(this.f10long) - (Double.hashCode(this.lat) >> 53);
        }
        return Double.hashCode(this.f10long) + (Double.hashCode(this.lat) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
            return ff$$ExternalSyntheticOutline0.m(this.f10long, ")", af$$ExternalSyntheticOutline0.m(this.lat, "Coordinate(lat=", ", long="));
        }
        return ff$$ExternalSyntheticOutline0.m(this.f10long, ")", af$$ExternalSyntheticOutline0.m(this.lat, "Coordinate(lat=", ", long="));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTextBottomJ6kI3mc)) {
            int i2 = write + 15;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        getTextBottomJ6kI3mc gettextbottomj6ki3mc = (getTextBottomJ6kI3mc) obj;
        if (Double.compare(this.lat, gettextbottomj6ki3mc.lat) != 0) {
            int i3 = write + 63;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        if (Double.compare(this.f10long, gettextbottomj6ki3mc.f10long) != 0) {
            return false;
        }
        int i4 = IconCompatParcelizer + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
