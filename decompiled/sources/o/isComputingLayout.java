package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.home.CreateHomeScope;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class isComputingLayout implements offsetPositionRecordsForRemove {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow write;

    @Override // o.offsetPositionRecordsForRemove
    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 57;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        StateFlow stateFlow = this.IconCompatParcelizer;
        int i4 = i2 + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return stateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public isComputingLayout(CreateHomeScope createHomeScope, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        MutableStateFlow mutableStateFlow = StateFlowKt.read(instance_delegatelambda0.write);
        this.write = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new HeatmapDataStore$set$2(createHomeScope, getcontentviewgroupparentlayout, this, (ShortNewsContentCardView) null, 5), 3);
    }
}
