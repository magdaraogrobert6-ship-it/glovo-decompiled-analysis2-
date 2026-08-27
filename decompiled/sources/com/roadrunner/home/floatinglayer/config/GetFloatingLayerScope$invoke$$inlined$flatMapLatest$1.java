package com.roadrunner.home.floatinglayer.config;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import com.roadrunner.rider.state.futureshift.presentation.GetFutureShiftUiState;
import com.roadrunner.startingarea.domain.NavigateToStartingArea$invoke$$inlined$flatMapLatest$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.internal.ContextScope;
import o.AdjustEvent;
import o.FragmentManagerSaveBackStackState;
import o.GetRetainInstanceUsageViolation;
import o.GetTargetFragmentRequestCodeUsageViolation;
import o.ShortNewsContentCardView;
import o.accesssetDelayedInitializationProvidercp;
import o.accesssetEndpointProvidercp;
import o.addSerializedCardJsonToStoragelambda10;
import o.checkRevenue;
import o.createFromParcel;
import o.getActionList;
import o.getContentViewGroupParentLayout;
import o.handleUrlOverridelambda1;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Object RatingCompat;
    public /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public Object serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1(ShortNewsContentCardView shortNewsContentCardView, getContentViewGroupParentLayout getcontentviewgroupparentlayout, GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation, StateFlow stateFlow) {
        super(3, shortNewsContentCardView);
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.RatingCompat = getTargetFragmentRequestCodeUsageViolation;
        this.serializer = stateFlow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1(GetFutureShiftUiState getFutureShiftUiState, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.IconCompatParcelizer = getFutureShiftUiState;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.IconCompatParcelizer;
        FlowCollector flowCollector = (FlowCollector) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj3;
        if (i2 != 0) {
            GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1 getFloatingLayerScope$invoke$$inlined$flatMapLatest$1 = new GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1((GetFutureShiftUiState) obj4, shortNewsContentCardView);
            getFloatingLayerScope$invoke$$inlined$flatMapLatest$1.RemoteActionCompatParcelizer = flowCollector;
            getFloatingLayerScope$invoke$$inlined$flatMapLatest$1.write = obj2;
            Object objInvokeSuspend = getFloatingLayerScope$invoke$$inlined$flatMapLatest$1.invokeSuspend(createfromparcel);
            int i3 = MediaSessionCompatQueueItem + 21;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1 getFloatingLayerScope$invoke$$inlined$flatMapLatest$2 = new GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1(shortNewsContentCardView, (getContentViewGroupParentLayout) obj4, (GetTargetFragmentRequestCodeUsageViolation) this.RatingCompat, (StateFlow) this.serializer);
        getFloatingLayerScope$invoke$$inlined$flatMapLatest$2.RemoteActionCompatParcelizer = flowCollector;
        getFloatingLayerScope$invoke$$inlined$flatMapLatest$2.write = obj2;
        Object objInvokeSuspend2 = getFloatingLayerScope$invoke$$inlined$flatMapLatest$2.invokeSuspend(createfromparcel);
        int i5 = MediaDescriptionCompat + 33;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        AdjustEvent adjustEvent;
        Object flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        checkRevenue checkrevenue;
        AdjustEvent adjustEvent2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 91;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = createFromParcel.INSTANCE;
        int i6 = 11;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.MediaBrowserCompatMediaItem;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowCollector flowCollector2 = this.RemoteActionCompatParcelizer;
                FragmentManagerSaveBackStackState fragmentManagerSaveBackStackState = (FragmentManagerSaveBackStackState) this.write;
                ContextScope contextScope = (ContextScope) ExtrasKt.read(702708900, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -702708894, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{(getContentViewGroupParentLayout) obj2});
                GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = ((GetTargetFragmentRequestCodeUsageViolation) this.RatingCompat).IconCompatParcelizer;
                StateFlow stateFlow = (StateFlow) this.serializer;
                fragmentManagerSaveBackStackState.getClass();
                stateFlow.getClass();
                RiderStateRepositoryImpl riderStateRepositoryImpl = (RiderStateRepositoryImpl) getRetainInstanceUsageViolation.ComponentActivity;
                ChannelFlowTransformLatest channelFlowTransformLatestRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(new HeatmapDataStore$get$$inlined$map$1(riderStateRepositoryImpl.serializer, riderStateRepositoryImpl, 29), new GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1(null, getRetainInstanceUsageViolation, fragmentManagerSaveBackStackState, contextScope, stateFlow));
                this.RemoteActionCompatParcelizer = null;
                this.write = null;
                this.MediaBrowserCompatMediaItem = 1;
                FlowKt.IconCompatParcelizer(flowCollector2);
                Object objCollect = channelFlowTransformLatestRemoteActionCompatParcelizer.collect(new HeatmapDataStore$get$$inlined$map$1.AnonymousClass2(flowCollector2, 28, contextScope), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = obj3;
                }
                if (objCollect != coroutineSingletons) {
                    objCollect = obj3;
                }
                if (objCollect == coroutineSingletons) {
                    obj3 = coroutineSingletons;
                }
            } else if (i7 == 1) {
                int i8 = MediaSessionCompatQueueItem + 11;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj3 = null;
            }
            int i10 = MediaSessionCompatQueueItem + 125;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return obj3;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.MediaBrowserCompatMediaItem;
        if (i12 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            flowCollector = this.RemoteActionCompatParcelizer;
            checkRevenue checkrevenue2 = (checkRevenue) this.write;
            OkHttpCall$1 okHttpCall$1 = ((GetFutureShiftUiState) obj2).IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = null;
            this.write = null;
            this.RatingCompat = flowCollector;
            this.serializer = checkrevenue2;
            this.MediaBrowserCompatMediaItem = 1;
            if (!((getActionList) okHttpCall$1.serializer).read() || (adjustEvent2 = checkrevenue2.read) == null) {
                adjustEvent = checkrevenue2.read;
                if (adjustEvent == null && adjustEvent.IconCompatParcelizer) {
                    addSerializedCardJsonToStoragelambda10 addserializedcardjsontostoragelambda10 = (addSerializedCardJsonToStoragelambda10) okHttpCall$1.write;
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = FlowKt.RemoteActionCompatParcelizer(addserializedcardjsontostoragelambda10.serializer.serializer, new NavigateToStartingArea$invoke$$inlined$flatMapLatest$1(shortNewsContentCardView, addserializedcardjsontostoragelambda10, i));
                } else {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(accesssetEndpointProvidercp.serializer);
                }
            } else {
                int i13 = MediaDescriptionCompat + 109;
                MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (adjustEvent2.MediaMetadataCompat) {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(accesssetDelayedInitializationProvidercp.read);
                } else {
                    adjustEvent = checkrevenue2.read;
                    if (adjustEvent == null) {
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(accesssetEndpointProvidercp.serializer);
                    } else {
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(accesssetEndpointProvidercp.serializer);
                    }
                }
            }
            if (flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 != coroutineSingletons2) {
                checkrevenue = checkrevenue2;
            }
            return coroutineSingletons2;
        }
        int i15 = MediaDescriptionCompat + 89;
        MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
        if (i15 % 2 != 0 ? i12 != 1 : i12 != 1) {
            if (i12 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj3;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i16 = MediaSessionCompatQueueItem + 63;
            MediaDescriptionCompat = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            return null;
        }
        checkrevenue = (checkRevenue) this.serializer;
        flowCollector = (FlowCollector) this.RatingCompat;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = obj;
        this.RemoteActionCompatParcelizer = null;
        this.write = null;
        this.RatingCompat = null;
        this.serializer = null;
        this.MediaBrowserCompatMediaItem = 2;
        FlowKt.IconCompatParcelizer(flowCollector);
        Object objCollect2 = ((Flow) flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i6, checkrevenue), this);
        if (objCollect2 != coroutineSingletons2) {
            objCollect2 = obj3;
        }
        if (objCollect2 != coroutineSingletons2) {
            int i18 = MediaSessionCompatQueueItem + 33;
            MediaDescriptionCompat = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            objCollect2 = obj3;
        }
        if (objCollect2 != coroutineSingletons2) {
            return obj3;
        }
        return coroutineSingletons2;
    }
}
