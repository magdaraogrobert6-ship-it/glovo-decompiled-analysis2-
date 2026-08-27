package o;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class createVectorImageBuilder extends getStrokeLineCapCSYIeUk {
    private static int read = 1;
    private static int write;
    public final Intent RemoteActionCompatParcelizer;

    public createVectorImageBuilder(Intent intent) {
        this.RemoteActionCompatParcelizer = intent;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer.hashCode();
        }
        int i3 = 63 / 0;
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartActivity(intent=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof createVectorImageBuilder) && this.RemoteActionCompatParcelizer.equals(((createVectorImageBuilder) obj).RemoteActionCompatParcelizer)) {
            return true;
        }
        int i3 = read + 63;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
