package o;

import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ implements r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0 {
    private static int read = 1;
    private static int write;
    public final RealWebSocket$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public final generatePOSTBodyString serializer;

    public r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ(generatePOSTBodyString generatepostbodystring, RealWebSocket$$ExternalSyntheticLambda0 realWebSocket$$ExternalSyntheticLambda0) {
        this.serializer = generatepostbodystring;
        this.RemoteActionCompatParcelizer = realWebSocket$$ExternalSyntheticLambda0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = read + 49;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ) {
            r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ r8lambdaynjzcggnv711y3apcxbclx9buiq = (r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ) obj;
            if (!this.serializer.equals(r8lambdaynjzcggnv711y3apcxbclx9buiq.serializer) || this.RemoteActionCompatParcelizer != r8lambdaynjzcggnv711y3apcxbclx9buiq.RemoteActionCompatParcelizer) {
                return false;
            }
            int i3 = read + 55;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TurnOnNavigationDialog(dialogEntity=" + this.serializer + ", onNavigationEnabled=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
