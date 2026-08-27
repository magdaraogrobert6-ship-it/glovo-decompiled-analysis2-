package o;

import java.time.ZonedDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphStyleSaverlambda1 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final ZonedDateTime IconCompatParcelizer;
    public final long serializer;

    public ParagraphStyleSaverlambda1(ZonedDateTime zonedDateTime, long j) {
        this.IconCompatParcelizer = zonedDateTime;
        this.serializer = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.serializer) + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = write + 49;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CountdownData(expirationTime=" + this.IconCompatParcelizer + ", totalSeconds=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphStyleSaverlambda1) {
            ParagraphStyleSaverlambda1 paragraphStyleSaverlambda1 = (ParagraphStyleSaverlambda1) obj;
            if (!this.IconCompatParcelizer.equals(paragraphStyleSaverlambda1.IconCompatParcelizer)) {
                int i4 = write + 53;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else if (this.serializer == paragraphStyleSaverlambda1.serializer) {
                return true;
            }
        }
        return false;
    }
}
