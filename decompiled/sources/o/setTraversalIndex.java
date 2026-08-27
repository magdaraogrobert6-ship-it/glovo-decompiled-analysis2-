package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setTraversalIndex {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final setTextSelectionRangeFDrldGo IconCompatParcelizer;
    public final List read;

    public setTraversalIndex(setTextSelectionRangeFDrldGo settextselectionrangefdrldgo, List list) {
        settextselectionrangefdrldgo.getClass();
        this.IconCompatParcelizer = settextselectionrangefdrldgo;
        this.read = list;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.read.hashCode() / (this.IconCompatParcelizer.hashCode() >> 25);
        } else {
            iHashCode = this.read.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        }
        int i3 = write + 83;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setTraversalIndex) {
            setTraversalIndex settraversalindex = (setTraversalIndex) obj;
            if (this.IconCompatParcelizer != settraversalindex.IconCompatParcelizer) {
                i = RemoteActionCompatParcelizer + 57;
                i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else if (this.read.equals(settraversalindex.read)) {
                return true;
            }
            int i4 = write + 73;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        i = RemoteActionCompatParcelizer + 9;
        i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i2;
        int i6 = i % 2;
        int i7 = write + 73;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ModalityStatus(biometricStatus=" + this.IconCompatParcelizer + ", authModalityType=" + this.read + ")";
        int i2 = write + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
