package o;

import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: o.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0215z implements getFragment {
    private static int RatingCompat = 1;
    private static int serializer;
    public final RecenterMapTriggerImpl IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final dg write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.read;
        int i5 = i3 + 81;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C0215z(RecenterMapTriggerImpl recenterMapTriggerImpl, dg dgVar, E e, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        recenterMapTriggerImpl.getClass();
        dgVar.getClass();
        e.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = recenterMapTriggerImpl;
        this.write = dgVar;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.TRUE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new HeatmapMapLayerUiModelImpl$1(e, this, null, 29), 3);
    }
}
