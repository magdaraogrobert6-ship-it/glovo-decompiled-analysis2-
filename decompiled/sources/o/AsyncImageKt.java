package o;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImageKt extends AbstractC0193pointerInteropFilter {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final Intent IconCompatParcelizer;

    public AsyncImageKt(Intent intent) {
        this.IconCompatParcelizer = intent;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer.hashCode();
        }
        int i3 = 4 / 0;
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToMap(intent=" + this.IconCompatParcelizer + ")";
        int i2 = read + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj && (!(obj instanceof AsyncImageKt) || !this.IconCompatParcelizer.equals(((AsyncImageKt) obj).IconCompatParcelizer))) {
            return false;
        }
        int i3 = RemoteActionCompatParcelizer + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
        return true;
    }
}
