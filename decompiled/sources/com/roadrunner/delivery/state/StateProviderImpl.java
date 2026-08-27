package com.roadrunner.delivery.state;

import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.map.container.context.GetMapScope$invoke$4;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import dagger.Lazy;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidView;
import o.AndroidViewHolder_androidKtNoOpScrollConnection1;
import o.AndroidView_androidKtAndroidView4;
import o.ShortNewsContentCardView;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.getAllSemanticsNodesToMap;
import o.getContentViewGroupParentLayout;
import o.getNoOpUpdate;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.toComposeOffset;

/* JADX INFO: loaded from: classes3.dex */
public final class StateProviderImpl implements accessrequireViewFactoryHolder, accesstoNestedScrollSource, AndroidView, AndroidViewHolder_androidKtNoOpScrollConnection1, AndroidView_androidKtAndroidView4, getNoOpUpdate, toComposeOffset {
    public final Lazy IconCompatParcelizer;
    public final StateProviderImpl$special$$inlined$map$2 MediaBrowserCompatMediaItem;
    public final StateProviderImpl$special$$inlined$map$4 MediaDescriptionCompat;
    public final getContentViewGroupParentLayout MediaMetadataCompat;
    public final StateProviderImpl$special$$inlined$map$2 MediaSessionCompatQueueItem;
    public final MutableStateFlow PlaybackStateCompatCustomAction;
    public final StateProviderImpl$special$$inlined$map$4 RatingCompat;
    public final StateProviderImpl$special$$inlined$map$4 RemoteActionCompatParcelizer;
    public final StateProviderImpl$special$$inlined$map$4 read;
    public final SharedFlow serializer;
    public final isAdapterPositionOnScreen write = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(20, this));

    public StateProviderImpl(Lazy lazy, StateDataStoreImpl stateDataStoreImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, getAllSemanticsNodesToMap getallsemanticsnodestomap, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.IconCompatParcelizer = lazy;
        this.MediaMetadataCompat = getcontentviewgroupparentlayout;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.PlaybackStateCompatCustomAction = mutableStateFlow;
        int i = 3;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new HeatmapDataStore$get$$inlined$map$1(((performCustomExitMxy_nc0) stateDataStoreImpl.write.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).serializer(), stateDataStoreImpl, 23), mutableStateFlow, new GetRiderStateImpl$invoke$1(i, i, shortNewsContentCardView)), new GetMapScope$invoke$4(i, i, shortNewsContentCardView));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        SharedFlow sharedFlow = FlowKt.read(new HeatmapDataStore$get$$inlined$map$1(FlowKt.RemoteActionCompatParcelizer(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, DefaultIoScheduler.RemoteActionCompatParcelizer), this, 24), getcontentviewgroupparentlayout, SharingStarted.Companion.RemoteActionCompatParcelizer);
        this.serializer = sharedFlow;
        int i2 = 0;
        this.MediaBrowserCompatMediaItem = new StateProviderImpl$special$$inlined$map$2(sharedFlow, i2);
        this.MediaSessionCompatQueueItem = new StateProviderImpl$special$$inlined$map$2(sharedFlow, 29);
        this.RemoteActionCompatParcelizer = new StateProviderImpl$special$$inlined$map$4(sharedFlow, i2);
        this.MediaDescriptionCompat = new StateProviderImpl$special$$inlined$map$4(sharedFlow, 1);
        this.read = new StateProviderImpl$special$$inlined$map$4(sharedFlow, 2);
        this.RatingCompat = new StateProviderImpl$special$$inlined$map$4(sharedFlow, i);
    }
}
