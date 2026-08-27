package o;

import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setWindowOffsetgyyYBs {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public static final r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc write = DelayKt.serializer(new accessgetTextCentercp(6));

    public static final r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = write;
        int i5 = i2 + 89;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda3kmch7yklpui_5smgazrgczhglc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = serializer + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
