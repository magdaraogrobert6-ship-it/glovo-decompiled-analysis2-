package o;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class LineBreakStrategyCompanion implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final copy8_81llAdefault IconCompatParcelizer;
    public final accessgetParagraphcp RemoteActionCompatParcelizer;
    public final getHeadingrAG3T2k read;
    public final InitializeAppStartupItemsImpl write;

    public LineBreakStrategyCompanion(getHeadingrAG3T2k getheadingrag3t2k, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, copy8_81llAdefault copy8_81lladefault, accessgetParagraphcp accessgetparagraphcp) {
        this.read = getheadingrag3t2k;
        this.write = initializeAppStartupItemsImpl;
        this.IconCompatParcelizer = copy8_81lladefault;
        this.RemoteActionCompatParcelizer = accessgetparagraphcp;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, null, 13), 3);
        int i2 = serializer + 101;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
