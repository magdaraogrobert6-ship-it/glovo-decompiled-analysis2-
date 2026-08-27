package o;

import coil3.RealImageLoader$execute$2$job$1;
import com.roadrunner.auth.domain.state.GetUserAuthStateImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class paintRPmYEkkdefault {
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;

    public paintRPmYEkkdefault(GetUserAuthStateImpl getUserAuthStateImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getUserAuthStateImpl.getClass();
        getcontentviewgroupparentlayout.getClass();
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RealImageLoader$execute$2$job$1(getUserAuthStateImpl, this, (ShortNewsContentCardView) null, 29), 3);
    }
}
