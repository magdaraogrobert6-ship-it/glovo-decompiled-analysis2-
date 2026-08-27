package o;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class Api28Impl extends ComposeClickableSpan {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final Intent serializer;

    public Api28Impl(Intent intent) {
        intent.getClass();
        this.serializer = intent;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer.hashCode();
        }
        int i3 = 45 / 0;
        return this.serializer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenExternalNavigation(intent=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 51;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof Api28Impl)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((Api28Impl) obj).serializer}, getCieXyz.write())).booleanValue()) {
            int i4 = write + 105;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = RemoteActionCompatParcelizer + 33;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
