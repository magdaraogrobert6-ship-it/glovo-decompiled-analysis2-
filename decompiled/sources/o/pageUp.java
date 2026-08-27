package o;

import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class pageUp implements getToggleableState {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final Lazy read;

    public pageUp(Lazy lazy) {
        lazy.getClass();
        this.read = lazy;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        if (((pageDowndefault) this.read.write()).RemoteActionCompatParcelizer.serializer.RemoteActionCompatParcelizer() != null) {
            int i2 = IconCompatParcelizer + 123;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = write + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
