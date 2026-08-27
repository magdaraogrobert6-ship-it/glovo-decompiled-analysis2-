package o;

import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class getLambda1163195098ui_tooling extends androidx.lifecycle.ViewModel {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final SharedResourcePool read;

    public final SharedResourcePool write() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        SharedResourcePool sharedResourcePool = this.read;
        int i5 = i3 + 49;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return sharedResourcePool;
    }

    public getLambda1163195098ui_tooling(SharedResourcePool sharedResourcePool) {
        sharedResourcePool.getClass();
        this.read = sharedResourcePool;
    }
}
