package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class markAsRead {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final hasNotBeenRead serializer;
    public final ArrayList write;

    public markAsRead(hasNotBeenRead hasnotbeenread, ArrayList arrayList) {
        this.serializer = hasnotbeenread;
        this.write = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartTimeOption(start=" + this.serializer + ", endOptions=" + this.write + ")";
        int i2 = read + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof markAsRead)) {
                return false;
            }
            markAsRead markasread = (markAsRead) obj;
            if (this.serializer.equals(markasread.serializer)) {
                if (!this.write.equals(markasread.write)) {
                    return false;
                }
            } else {
                int i4 = RemoteActionCompatParcelizer + 41;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
