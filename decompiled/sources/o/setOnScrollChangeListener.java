package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnScrollChangeListener extends setNestedScrollingEnabled {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final List read;
    public final generatePOSTBodyString serializer;

    public setOnScrollChangeListener(generatePOSTBodyString generatepostbodystring, List list) {
        this.serializer = generatepostbodystring;
        this.read = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(entity=" + this.serializer + ", demands=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof setOnScrollChangeListener)) {
                return false;
            }
            setOnScrollChangeListener setonscrollchangelistener = (setOnScrollChangeListener) obj;
            if (!this.serializer.equals(setonscrollchangelistener.serializer) || !this.read.equals(setonscrollchangelistener.read)) {
                return false;
            }
        }
        int i3 = RemoteActionCompatParcelizer + 71;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
