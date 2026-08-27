package o;

import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetParagraphcp {
    public final SharedFlowImpl IconCompatParcelizer;
    public final requestPermissions read;
    public final SharedFlowImpl serializer;

    public accessgetParagraphcp(requestPermissions requestpermissions, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.read = requestpermissions;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.serializer = sharedFlowImplRemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 8), 3);
    }
}
