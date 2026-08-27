package o;

import com.roadrunner.rider.state.RiderStateRepositoryImpl$1;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnEventTrackingSucceededListener {
    public final GetShiftInfoImpl IconCompatParcelizer;
    public final StateFlow MediaMetadataCompat;
    public final StateFlow RatingCompat;
    public final GetRiderStateImpl RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final getContentViewGroupParentLayout write;

    public setOnEventTrackingSucceededListener(GetRiderStateImpl getRiderStateImpl, GetShiftInfoImpl getShiftInfoImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = getRiderStateImpl;
        this.IconCompatParcelizer = getShiftInfoImpl;
        this.write = getcontentviewgroupparentlayout;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.serializer = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(null);
        this.read = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStateRepositoryImpl$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStateRepositoryImpl$1(this, shortNewsContentCardView, 1), 3);
    }
}
