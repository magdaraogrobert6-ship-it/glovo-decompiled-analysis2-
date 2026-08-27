package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class findRelativeAdapterPositionIn extends notifyItemRangeRemoved {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final float RemoteActionCompatParcelizer;

    public findRelativeAdapterPositionIn(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM3679hashCodeimpl = androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.RemoteActionCompatParcelizer);
        int i4 = read + 15;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iM3679hashCodeimpl;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("FixedSizeSpacerViewEntity(size=", androidx.compose.ui.unit.Dp.m3684toStringimpl(this.RemoteActionCompatParcelizer), ")");
        }
        int i3 = 64 / 0;
        return ff$$ExternalSyntheticOutline0.m("FixedSizeSpacerViewEntity(size=", androidx.compose.ui.unit.Dp.m3684toStringimpl(this.RemoteActionCompatParcelizer), ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (obj instanceof findRelativeAdapterPositionIn) {
            if (!androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, ((findRelativeAdapterPositionIn) obj).RemoteActionCompatParcelizer)) {
                return false;
            }
            int i2 = IconCompatParcelizer + 115;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i3 = read + 117;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 103;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
