package o;

import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import io.sentry.CombinedScopeView;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyItemRemoved implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int read = 0;
    private static int serializer = 1;
    public final CombinedScopeView IconCompatParcelizer;
    public final MainActivity RemoteActionCompatParcelizer;

    public notifyItemRemoved(CombinedScopeView combinedScopeView, MainActivity mainActivity) {
        combinedScopeView.getClass();
        this.IconCompatParcelizer = combinedScopeView;
        this.RemoteActionCompatParcelizer = mainActivity;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, null, 24), 3);
        int i2 = read + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
