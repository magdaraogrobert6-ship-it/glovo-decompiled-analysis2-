package o;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda7;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import io.sentry.CombinedScopeView;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ColumnAdapter {
    public final CombinedScopeView IconCompatParcelizer;
    public final Flow RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout serializer;
    public final getTouchaOaMEAU write;

    public ColumnAdapter(GetRiderStatusImpl getRiderStatusImpl, getTouchaOaMEAU gettouchaoameau, getContentViewGroupParentLayout getcontentviewgroupparentlayout, CombinedScopeView combinedScopeView) {
        getRiderStatusImpl.getClass();
        gettouchaoameau.getClass();
        getcontentviewgroupparentlayout.getClass();
        combinedScopeView.getClass();
        this.write = gettouchaoameau;
        this.serializer = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = combinedScopeView;
        this.RemoteActionCompatParcelizer = FlowKt.serializer(new SaversKt$$ExternalSyntheticLambda7(4), getRiderStatusImpl.IconCompatParcelizer());
    }
}
