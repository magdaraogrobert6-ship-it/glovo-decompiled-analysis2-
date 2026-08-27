package o;

import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;

/* JADX INFO: loaded from: classes3.dex */
public final class hasAnimations implements setClockui_tooling {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final FullscreenItemUi read;

    public hasAnimations(FullscreenItemUi fullscreenItemUi) {
        this.read = fullscreenItemUi;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = IconCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FullScreenDetails(fullscreenItem=" + this.read + ")";
        int i2 = write + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 27;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 19 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasAnimations)) {
            int i5 = i2 + 95;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (this.read.equals(((hasAnimations) obj).read)) {
            return true;
        }
        return false;
    }
}
