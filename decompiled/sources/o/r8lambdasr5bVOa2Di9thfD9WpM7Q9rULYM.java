package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM implements r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc {
    private static int serializer = 0;
    private static int write = 1;
    public final String read;

    public r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM(String str) {
        str.getClass();
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read.hashCode();
        }
        int i3 = 46 / 0;
        return this.read.hashCode();
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = write + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m("GreetingUiState(greeting=", this.read, ")");
            int i3 = 70 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("GreetingUiState(greeting=", this.read, ")");
        }
        int i4 = write + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM))) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM) obj).read}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = serializer + 73;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = write + 63;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 64 / 0;
            }
            return false;
        }
        int i6 = serializer + 73;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
