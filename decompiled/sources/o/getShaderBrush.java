package o;

import com.roadrunner.delivery.ontheway.tripplanner.actions.api.navigator.ActionsParams;

/* JADX INFO: loaded from: classes3.dex */
public final class getShaderBrush {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final ActionsParams read;

    public getShaderBrush(ActionsParams actionsParams) {
        this.read = actionsParams;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read.hashCode();
            throw null;
        }
        int iHashCode = this.read.hashCode();
        int i3 = write + 85;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToActions(actionsParams=" + this.read + ")";
        int i2 = write + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getShaderBrush)) {
            int i4 = i3 + 31;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 % 4;
            }
        } else if (this.read.equals(((getShaderBrush) obj).read)) {
            return true;
        }
        int i6 = write + 111;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
