package o;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdahZGhA0UmhfiIXsIUlX7d0MFuDJQ extends PointerInteropFilterDispatchToViewState {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final Intent write;

    public r8lambdahZGhA0UmhfiIXsIUlX7d0MFuDJQ(Intent intent) {
        this.write = intent;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 25;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode();
            int i3 = 0 / 0;
        } else {
            iHashCode = this.write.hashCode();
        }
        int i4 = serializer + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NativeAppOpen(intent=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 117;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            return (obj instanceof r8lambdahZGhA0UmhfiIXsIUlX7d0MFuDJQ) && this.write.equals(((r8lambdahZGhA0UmhfiIXsIUlX7d0MFuDJQ) obj).write);
        }
        int i5 = i2 + 67;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
