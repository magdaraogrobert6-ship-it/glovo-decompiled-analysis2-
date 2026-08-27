package o;

import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkManagerImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final StateFlow IconCompatParcelizer;
    public final GetRiderStatusImpl RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout read;
    public final MutableStateFlow serializer;
    public final transferSessionPackageI write;

    public WorkManagerImpl(GetRiderStatusImpl getRiderStatusImpl, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = getRiderStatusImpl;
        this.write = transfersessionpackagei;
        this.read = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 26), 3);
    }

    public final void IconCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.IconCompatParcelizer(Boolean.valueOf(z));
        int i4 = MediaSessionCompatQueueItem + 117;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
