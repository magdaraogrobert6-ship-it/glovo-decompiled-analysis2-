package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getBottomFadingEdgeStrength extends getScrollFeedbackProvider {
    private static int serializer = 0;
    private static int write = 1;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public getBottomFadingEdgeStrength(String str, String str2, boolean z) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = z;
        this.read = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer);
        int i4 = write + 9;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m("Available(description=", this.RemoteActionCompatParcelizer, ", shouldShowTooltip=", ", tooltipText=", this.IconCompatParcelizer), this.read, ")");
            int i3 = write + 49;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m("Available(description=", this.RemoteActionCompatParcelizer, ", shouldShowTooltip=", ", tooltipText=", this.IconCompatParcelizer), this.read, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBottomFadingEdgeStrength)) {
            return false;
        }
        getBottomFadingEdgeStrength getbottomfadingedgestrength = (getBottomFadingEdgeStrength) obj;
        if (!this.RemoteActionCompatParcelizer.equals(getbottomfadingedgestrength.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (this.IconCompatParcelizer == getbottomfadingedgestrength.IconCompatParcelizer) {
            return this.read.equals(getbottomfadingedgestrength.read);
        }
        int i3 = write + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
