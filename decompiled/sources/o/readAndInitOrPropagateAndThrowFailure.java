package o;

import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import io.sentry.CombinedScopeView;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class readAndInitOrPropagateAndThrowFailure implements ec {
    private static int RatingCompat = 1;
    private static int write;
    public final Object IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final /* synthetic */ int serializer = 1;

    public readAndInitOrPropagateAndThrowFailure(CombinedScopeView combinedScopeView, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = combinedScopeView;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 22), 3);
    }

    @Override // o.ec
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 5;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.serializer;
        if (i4 == 0) {
            return this.read;
        }
        if (i4 == 1) {
            return this.read;
        }
        StateFlow stateFlow = this.read;
        int i5 = i2 + 31;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public readAndInitOrPropagateAndThrowFailure(RouterLogger routerLogger, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new HeatmapMapLayerUiModelImpl$1(routerLogger, this, null, 0), 3);
    }

    public readAndInitOrPropagateAndThrowFailure(androidx.work.impl.WorkerWrapper.Builder builder, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new HeatmapMapLayerUiModelImpl$1(builder, this, null, 8), 3);
    }
}
