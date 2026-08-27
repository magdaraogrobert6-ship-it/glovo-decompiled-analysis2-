package o;

import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaTOIgAPaTrSKFODGuDRy70XAidrI {
    private static int IconCompatParcelizer = 0;
    public static final r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc RemoteActionCompatParcelizer = DelayKt.serializer(new accessgetTextCentercp(10));
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    public static final /* synthetic */ r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteActionCompatParcelizer;
        int i5 = i3 + 87;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda3kmch7yklpui_5smgazrgczhglc;
    }

    static {
        int i = serializer + 79;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
