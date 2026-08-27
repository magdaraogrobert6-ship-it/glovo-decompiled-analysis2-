package o;

import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class ComponentRegistryBuilder extends androidx.lifecycle.ViewModel {
    private static int read = 1;
    private static int write;
    public final SharedResourcePool RemoteActionCompatParcelizer;

    public final SharedResourcePool IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 59;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedResourcePool sharedResourcePool = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return sharedResourcePool;
        }
        throw null;
    }

    public ComponentRegistryBuilder(SharedResourcePool sharedResourcePool) {
        sharedResourcePool.getClass();
        this.RemoteActionCompatParcelizer = sharedResourcePool;
    }
}
