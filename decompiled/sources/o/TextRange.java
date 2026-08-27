package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class TextRange {
    private static int read = 1;
    private static int write;
    public final float IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String serializer;

    public TextRange(float f, String str, boolean z) {
        this.IconCompatParcelizer = f;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) % af$$ExternalSyntheticOutline0.m(Float.hashCode(this.IconCompatParcelizer) << 65, 52, this.serializer);
        } else {
            iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(Float.hashCode(this.IconCompatParcelizer) * 31, 31, this.serializer);
        }
        int i3 = write + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CountdownUiState(progress=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", message=");
        sb.append(this.serializer);
        sb.append(", showTimer=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = write + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 95;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof TextRange) {
            TextRange textRange = (TextRange) obj;
            return Float.compare(this.IconCompatParcelizer, textRange.IconCompatParcelizer) == 0 && this.serializer.equals(textRange.serializer) && this.RemoteActionCompatParcelizer == textRange.RemoteActionCompatParcelizer;
        }
        int i4 = write + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
