package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableV2TaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationSearchDecaySearch extends toAnimationGroup {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final accessibleField IconCompatParcelizer;

    static {
        CustomerUnavailableV2TaskUiItem$Companion customerUnavailableV2TaskUiItem$Companion = accessibleField.Companion;
        int i = serializer + 99;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public AnimationSearchDecaySearch(accessibleField accessiblefield) {
        accessiblefield.getClass();
        this.IconCompatParcelizer = accessiblefield;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = read + 99;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomerUnavailableV2Task(customerUnavailableV2TaskUiItem=" + this.IconCompatParcelizer + ")";
        int i2 = write + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnimationSearchDecaySearch) {
            Object[] objArr = {this.IconCompatParcelizer, ((AnimationSearchDecaySearch) obj).IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i2 = read + 1;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = read + 7;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 69;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
