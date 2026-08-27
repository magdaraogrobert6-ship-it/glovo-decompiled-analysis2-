package o;

import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.freelancing.domain.HasWorkNowOpportunityImpl$invoke$$inlined$map$1;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class requireActivity implements requestPermissions {
    public final SharedFlow RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout write;

    public requireActivity(IconCompat iconCompat, GetCourierStatusUseCaseImpl getCourierStatusUseCaseImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, CachedDeliveryRepository cachedDeliveryRepository, getContentViewGroupParentLayout getcontentviewgroupparentlayout, getRangeForRect getrangeforrect) {
        this.write = getcontentviewgroupparentlayout;
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2RemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(getCourierStatusUseCaseImpl.write(), cachedDeliveryRepository.write(), new HasWorkNowOpportunityImpl$invoke$$inlined$map$1(iconCompat.IconCompatParcelizer.IconCompatParcelizer(), 0), getrangeforrect.read(), new requireFragmentManager(5, 4, requireActivity.class, this, "mapToHomeContext", "mapToHomeContext(Lcom/roadrunner/rider/state/api/status/CourierStatusData;Lcom/roadrunner/delivery/repository/api/DeliveryInformation;ZLcom/roadrunner/delivery/accept/laststop/api/domain/LastStopState;)Lcom/roadrunner/home/context/HomeContext;"));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = FlowKt.read(FlowKt.serializer(FlowKt.RemoteActionCompatParcelizer(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2RemoteActionCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer)), getcontentviewgroupparentlayout, SharingStarted.Companion.read(2));
    }
}
