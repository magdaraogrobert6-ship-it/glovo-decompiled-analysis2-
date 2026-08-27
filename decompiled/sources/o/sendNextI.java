package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.rider.state.refresh.presentation.StateRefreshFloatingItemUiModelImpl;
import io.sentry.CombinedScopeView;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class sendNextI {
    private static int read = 0;
    private static int serializer = 1;
    public final CombinedScopeView RemoteActionCompatParcelizer;

    public sendNextI(CombinedScopeView combinedScopeView) {
        this.RemoteActionCompatParcelizer = combinedScopeView;
    }

    public final StateRefreshFloatingItemUiModelImpl write(StateFlow stateFlow, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int i = 2 % 2;
        stateFlow.getClass();
        getcontentviewgroupparentlayout.getClass();
        CombinedScopeView combinedScopeView = this.RemoteActionCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        addI addi = (addI) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
        objWrite2.getClass();
        StateRefreshFloatingItemUiModelImpl stateRefreshFloatingItemUiModelImpl = new StateRefreshFloatingItemUiModelImpl(addi, (restoreChildFragmentState) objWrite2, (SaveHeatmapUrlImpl) ((publishErrorlambda1) combinedScopeView.write).write(), stateFlow, getcontentviewgroupparentlayout);
        int i2 = serializer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return stateRefreshFloatingItemUiModelImpl;
    }
}
