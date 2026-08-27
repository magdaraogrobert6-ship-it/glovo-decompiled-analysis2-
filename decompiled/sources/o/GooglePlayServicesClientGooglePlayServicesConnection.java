package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class GooglePlayServicesClientGooglePlayServicesConnection {
    private static int read = 0;
    private static int write = 1;
    public final ArrayList IconCompatParcelizer;

    public GooglePlayServicesClientGooglePlayServicesConnection(ArrayList arrayList) {
        this.IconCompatParcelizer = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i3 = write + 3;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartingArea(coordinates=" + this.IconCompatParcelizer + ")";
        int i2 = write + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 51;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 107;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof GooglePlayServicesClientGooglePlayServicesConnection) {
            return this.IconCompatParcelizer.equals(((GooglePlayServicesClientGooglePlayServicesConnection) obj).IconCompatParcelizer);
        }
        int i8 = i2 + 105;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
