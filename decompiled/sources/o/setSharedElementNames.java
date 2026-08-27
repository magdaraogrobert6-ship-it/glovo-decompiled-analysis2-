package o;

import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setSharedElementNames implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final androidx.work.impl.WorkerWrapper.Builder RemoteActionCompatParcelizer;

    public setSharedElementNames(androidx.work.impl.WorkerWrapper.Builder builder) {
        this.RemoteActionCompatParcelizer = builder;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, null, 22), 3);
        int i2 = serializer + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
