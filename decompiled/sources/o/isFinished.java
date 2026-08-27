package o;

import com.huawei.hms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class isFinished {
    private static int read = 1;
    private static int write;
    public final LocationRequest IconCompatParcelizer;
    public final onWindowLayoutChanged RemoteActionCompatParcelizer;

    public isFinished(LocationRequest locationRequest, onWindowLayoutChanged onwindowlayoutchanged) {
        this.IconCompatParcelizer = locationRequest;
        this.RemoteActionCompatParcelizer = onwindowlayoutchanged;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = write + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof isFinished) {
                isFinished isfinished = (isFinished) obj;
                if (this.IconCompatParcelizer.equals(isfinished.IconCompatParcelizer)) {
                    if (this.RemoteActionCompatParcelizer == isfinished.RemoteActionCompatParcelizer) {
                        int i2 = write + 41;
                        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return true;
                    }
                    int i4 = read + 79;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 != 0;
                }
            }
            return false;
        }
        int i5 = write + 75;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HmsLocationRequestData(locationRequest=" + this.IconCompatParcelizer + ", callback=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
