package o;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class nextBoundary implements getCharSequence {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final Set RemoteActionCompatParcelizer;
    public final boolean serializer;

    public nextBoundary(Set set, boolean z) {
        this.RemoteActionCompatParcelizer = set;
        this.serializer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.serializer) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = read + 37;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (obj instanceof nextBoundary) {
                nextBoundary nextboundary = (nextBoundary) obj;
                if (!this.RemoteActionCompatParcelizer.equals(nextboundary.RemoteActionCompatParcelizer)) {
                    i = IconCompatParcelizer + 75;
                    read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else if (this.serializer != nextboundary.serializer) {
                    return false;
                }
            } else {
                i = read + 113;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i % 2;
            return false;
        }
        int i4 = read + 11;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DeliveryDisplayed(orderIds=" + this.RemoteActionCompatParcelizer + ", isBackToBackOrder=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
