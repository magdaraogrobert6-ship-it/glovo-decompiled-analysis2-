package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.CreateHomeScope;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class isLayoutSuppressed implements onEnterLayoutOrScroll {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final SaveHeatmapUrlImpl read;

    public isLayoutSuppressed(SaveHeatmapUrlImpl saveHeatmapUrlImpl) {
        this.read = saveHeatmapUrlImpl;
    }

    @Override // o.onEnterLayoutOrScroll
    public final offsetPositionRecordsForRemove write(ContextScope contextScope) {
        int i = 2 % 2;
        contextScope.getClass();
        isComputingLayout iscomputinglayout = new isComputingLayout((CreateHomeScope) ((hasNestedScrollingParent) this.read.serializer).write(), contextScope);
        int i2 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return iscomputinglayout;
    }
}
