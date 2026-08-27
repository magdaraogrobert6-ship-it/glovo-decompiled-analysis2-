package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getChildTransition implements AnimatedContentComposeAnimationCompanion {
    private static int serializer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;

    public getChildTransition(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = write + 89;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("ShowError(message=", this.RemoteActionCompatParcelizer, ")");
        }
        int i3 = 93 / 0;
        return ff$$ExternalSyntheticOutline0.m("ShowError(message=", this.RemoteActionCompatParcelizer, ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 107;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if (!(obj instanceof getChildTransition) || !this.RemoteActionCompatParcelizer.equals(((getChildTransition) obj).RemoteActionCompatParcelizer)) {
            return false;
        }
        int i4 = serializer + 61;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
