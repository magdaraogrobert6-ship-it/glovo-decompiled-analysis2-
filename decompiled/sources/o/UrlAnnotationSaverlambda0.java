package o;

import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlAnnotationSaverlambda0 implements TextLinkStylesSaverlambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final MetricsBatchProcessor serializer;

    public UrlAnnotationSaverlambda0(MetricsBatchProcessor metricsBatchProcessor, inCompatibilityMode incompatibilitymode) {
        this.serializer = metricsBatchProcessor;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, null, 1), 3);
        int i2 = RemoteActionCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
