package o;

import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class attachAllAnimationslambda04 extends androidx.lifecycle.ViewModel {
    private static int serializer = 0;
    private static int write = 1;
    public final SharedResourcePool IconCompatParcelizer;

    public final SharedResourcePool RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer;
        }
        throw null;
    }

    public attachAllAnimationslambda04(SharedResourcePool sharedResourcePool) {
        sharedResourcePool.getClass();
        this.IconCompatParcelizer = sharedResourcePool;
    }

    public final void read() {
        int i = 2 % 2;
        int i2 = serializer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.serializer(infiniteTransitionSearch.serializer);
        } else {
            this.IconCompatParcelizer.serializer(infiniteTransitionSearch.serializer);
            int i3 = 77 / 0;
        }
    }
}
