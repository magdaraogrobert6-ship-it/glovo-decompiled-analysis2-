package com.roadrunner.home.floatinglayer.config;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appmigration.presentation.AppMigrationBannerUiModelImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.rider.state.breakrequest.domain.SendBreakRequestUseCaseImpl;
import com.roadrunner.rider.state.onpause.domain.EndBreakUseCaseImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.startingarea.domain.NavigateToStartingArea$invoke$$inlined$flatMapLatest$1;
import com.roadrunner.startingarea.presentation.StartingAreaNavigateViewUiModelImpl;
import com.roadrunner.startingarea.presentation.StartingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import o.AdjustEvent;
import o.AttributionHandler5;
import o.AttributionResponseData;
import o.FragmentManagerFragmentLifecycleCallbacks;
import o.FragmentManagerSaveBackStackState;
import o.GestureDetectorCompat;
import o.GetRetainInstanceUsageViolation;
import o.LayoutCompat;
import o.S;
import o.SemanticsNodedefault;
import o.SetRetainInstanceUsageViolation;
import o.SetUserVisibleHintViolation;
import o.ShortNewsContentCardView;
import o.SuperNotCalledException;
import o.accesslayout;
import o.addSerializedCardJsonToStoragelambda10;
import o.applyState;
import o.checkSdkClickResponse;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.eg;
import o.findMinMaxChildLayoutPositions;
import o.forEachRect;
import o.getABI;
import o.getAnimatingAway;
import o.getContentDataType;
import o.getDeviceType;
import o.getLastLineBottomEVpEnUU;
import o.getMTextFieldValueui;
import o.getMinimumlzQqcRY;
import o.getOsName;
import o.getPayload;
import o.getQueryContext;
import o.isOpenInternalroom_runtime;
import o.isSegmentInside;
import o.mergeJsonObjects;
import o.mergedSemanticsConfiguration;
import o.na;
import o.od;
import o.onFragmentStarted;
import o.publishErrorlambda1;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.removeNodeAtDepth;
import o.restoreChildFragmentState;
import o.sendNextI;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public Object IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public int MediaMetadataCompat;
    public final /* synthetic */ Object RatingCompat;
    public Flow RemoteActionCompatParcelizer;
    public Object read;
    public /* synthetic */ FlowCollector serializer;
    public final /* synthetic */ int write = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1(ShortNewsContentCardView shortNewsContentCardView, GetRetainInstanceUsageViolation getRetainInstanceUsageViolation, FragmentManagerSaveBackStackState fragmentManagerSaveBackStackState, ContextScope contextScope, StateFlow stateFlow) {
        super(3, shortNewsContentCardView);
        this.RatingCompat = getRetainInstanceUsageViolation;
        this.read = fragmentManagerSaveBackStackState;
        this.IconCompatParcelizer = contextScope;
        this.RemoteActionCompatParcelizer = stateFlow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1(ShortNewsContentCardView shortNewsContentCardView, StartingAreaNavigateViewUiModelImpl startingAreaNavigateViewUiModelImpl) {
        super(3, shortNewsContentCardView);
        this.RatingCompat = startingAreaNavigateViewUiModelImpl;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj4 = this.RatingCompat;
        FlowCollector flowCollector = (FlowCollector) obj;
        if (i3 != 0) {
            GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1 getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1 = new GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1((ShortNewsContentCardView) obj3, (StartingAreaNavigateViewUiModelImpl) obj4);
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.serializer = flowCollector;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaBrowserCompatMediaItem = obj2;
            return getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.invokeSuspend(createfromparcel2);
        }
        GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1 getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$2 = new GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1((ShortNewsContentCardView) obj3, (GetRetainInstanceUsageViolation) obj4, (FragmentManagerSaveBackStackState) this.read, (ContextScope) this.IconCompatParcelizer, (StateFlow) this.RemoteActionCompatParcelizer);
        getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$2.serializer = flowCollector;
        getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$2.MediaBrowserCompatMediaItem = obj2;
        Object objInvokeSuspend = getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$2.invokeSuspend(createfromparcel2);
        int i4 = MediaDescriptionCompat + 51;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        createFromParcel createfromparcel;
        CoroutineSingletons coroutineSingletons;
        onFragmentStarted onfragmentstarted;
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        FlowCollector flowCollector;
        onFragmentStarted onfragmentstarted2;
        FlowCollector flowCollector2;
        AdjustEvent adjustEvent;
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3;
        Object objRemoteActionCompatParcelizer;
        FlowCollector flowCollector3;
        Flow flow;
        GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1 getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1 = this;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj2 = getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.RatingCompat;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 != 0) {
            StartingAreaNavigateViewUiModelImpl startingAreaNavigateViewUiModelImpl = (StartingAreaNavigateViewUiModelImpl) obj2;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaMetadataCompat;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                flowCollector2 = getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.serializer;
                adjustEvent = (AdjustEvent) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaBrowserCompatMediaItem;
                if (adjustEvent == null || !adjustEvent.IconCompatParcelizer) {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(od.write);
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.serializer = null;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaBrowserCompatMediaItem = null;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.read = null;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.IconCompatParcelizer = null;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.RemoteActionCompatParcelizer = null;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaMetadataCompat = 2;
                    if (FlowKt.emitAll(flowCollector2, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3, getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1) != coroutineSingletons2) {
                        return createfromparcel2;
                    }
                } else {
                    Flow flowSerializer = startingAreaNavigateViewUiModelImpl.read.serializer();
                    addSerializedCardJsonToStoragelambda10 addserializedcardjsontostoragelambda10 = startingAreaNavigateViewUiModelImpl.MediaSessionCompatQueueItem;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.serializer = null;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaBrowserCompatMediaItem = null;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.read = flowCollector2;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.IconCompatParcelizer = adjustEvent;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.RemoteActionCompatParcelizer = flowSerializer;
                    getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaMetadataCompat = 1;
                    objRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(addserializedcardjsontostoragelambda10.serializer.serializer, new NavigateToStartingArea$invoke$$inlined$flatMapLatest$1(shortNewsContentCardView, addserializedcardjsontostoragelambda10, i));
                    if (objRemoteActionCompatParcelizer != coroutineSingletons2) {
                        flowCollector3 = flowCollector2;
                        flow = flowSerializer;
                    }
                }
                return coroutineSingletons2;
            }
            if (i4 != 1) {
                int i5 = MediaDescriptionCompat + 121;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0 ? i4 != 2 : i4 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel2;
            }
            flow = getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.RemoteActionCompatParcelizer;
            adjustEvent = (AdjustEvent) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.IconCompatParcelizer;
            FlowCollector flowCollector4 = (FlowCollector) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            flowCollector3 = flowCollector4;
            objRemoteActionCompatParcelizer = obj;
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, (Flow) objRemoteActionCompatParcelizer, new StartingAreaNavigateViewUiModelImpl$futureShiftFlow$1$1(startingAreaNavigateViewUiModelImpl, adjustEvent, null));
            flowCollector2 = flowCollector3;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.serializer = null;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaBrowserCompatMediaItem = null;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.read = null;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.IconCompatParcelizer = null;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.RemoteActionCompatParcelizer = null;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaMetadataCompat = 2;
            if (FlowKt.emitAll(flowCollector2, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3, getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1) != coroutineSingletons2) {
                return createfromparcel2;
            }
            return coroutineSingletons2;
        }
        final ContextScope contextScope = (ContextScope) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.IconCompatParcelizer;
        final GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = (GetRetainInstanceUsageViolation) obj2;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaMetadataCompat;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FlowCollector flowCollector5 = getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.serializer;
            if (((Boolean) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaBrowserCompatMediaItem).booleanValue()) {
                final Flow flowSerializer2 = FlowKt.serializer(new RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1(((RiderStateRepositoryImpl) getRetainInstanceUsageViolation.ComponentActivity).RemoteActionCompatParcelizer, displayInAppMessagelambda1.serializer(findMinMaxChildLayoutPositions.class), 0));
                final FragmentManagerSaveBackStackState fragmentManagerSaveBackStackState = (FragmentManagerSaveBackStackState) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.read;
                final StateFlow stateFlow = (StateFlow) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.RemoteActionCompatParcelizer;
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow() { // from class: com.roadrunner.home.floatinglayer.config.GetRhFloatingLayerConfiguration$invoke$lambda$0$$inlined$map$1
                    private static int MediaDescriptionCompat = 0;
                    private static int MediaSessionCompatQueueItem = 1;

                    /* JADX INFO: renamed from: com.roadrunner.home.floatinglayer.config.GetRhFloatingLayerConfiguration$invoke$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    public final class AnonymousClass2 implements FlowCollector {
                        private static int MediaDescriptionCompat = 0;
                        private static int MediaMetadataCompat = 1;
                        public final /* synthetic */ FragmentManagerSaveBackStackState IconCompatParcelizer;
                        public final /* synthetic */ GetRetainInstanceUsageViolation RemoteActionCompatParcelizer;
                        public final /* synthetic */ ContextScope read;
                        public final /* synthetic */ StateFlow serializer;
                        public final /* synthetic */ FlowCollector write;

                        public AnonymousClass2(FlowCollector flowCollector, FragmentManagerSaveBackStackState fragmentManagerSaveBackStackState, GetRetainInstanceUsageViolation getRetainInstanceUsageViolation, ContextScope contextScope, StateFlow stateFlow) {
                            this.write = flowCollector;
                            this.IconCompatParcelizer = fragmentManagerSaveBackStackState;
                            this.RemoteActionCompatParcelizer = getRetainInstanceUsageViolation;
                            this.read = contextScope;
                            this.serializer = stateFlow;
                        }

                        /* JADX WARN: Code duplicated, block: B:11:0x0049 A[PHI: r11 r14
  0x0049: PHI (r11v18 o.GetTargetFragmentUsageViolation) = (r11v17 o.GetTargetFragmentUsageViolation), (r11v20 o.GetTargetFragmentUsageViolation) binds: [B:10:0x0047, B:7:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r14v6 int) = (r14v5 int), (r14v8 int) binds: [B:10:0x0047, B:7:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code restructure failed: missing block: B:60:0x037b, code lost:
                        
                            if (r44.write.emit(r2, r11) == r3) goto L64;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:63:0x038d, code lost:
                        
                            if (r44.write.emit(r2, r11) == r3) goto L64;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:64:0x038f, code lost:
                        
                            return r3;
                         */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r45, o.ShortNewsContentCardView r46) {
                            /*
                                Method dump skipped, instruction units count: 915
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.floatinglayer.config.GetRhFloatingLayerConfiguration$invoke$lambda$0$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector6, ShortNewsContentCardView shortNewsContentCardView2) {
                        int i7 = 2 % 2;
                        Object objCollect = flowSerializer2.collect(new AnonymousClass2(flowCollector6, fragmentManagerSaveBackStackState, getRetainInstanceUsageViolation, contextScope, stateFlow), shortNewsContentCardView2);
                        if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            int i8 = MediaSessionCompatQueueItem + 51;
                            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 != 0) {
                                int i9 = 15 / 0;
                            }
                            return objCollect;
                        }
                        createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                        int i10 = MediaSessionCompatQueueItem + 33;
                        MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        return createfromparcel3;
                    }
                };
                createfromparcel = createfromparcel2;
                coroutineSingletons = coroutineSingletons3;
                flowCollector5 = flowCollector5;
                flowCollector = null;
            } else {
                applyState applystate = getRetainInstanceUsageViolation.MediaMetadataCompat;
                eg egVar = applystate.PlaybackStateCompat;
                FragmentManagerSaveBackStackState fragmentManagerSaveBackStackState2 = (FragmentManagerSaveBackStackState) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.read;
                StateFlow stateFlow2 = (StateFlow) getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.RemoteActionCompatParcelizer;
                isSegmentInside issegmentinside = applystate.MediaMetadataCompat;
                accesslayout accesslayoutVar = applystate.write;
                S s = applystate.serializer;
                forEachRect foreachrect = applystate.IconCompatParcelizer;
                getAnimatingAway getanimatingaway = applystate.MediaDescriptionCompat;
                sendNextI sendnexti = applystate.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                fragmentManagerSaveBackStackState2.getClass();
                stateFlow2.getClass();
                int i7 = SuperNotCalledException.read[fragmentManagerSaveBackStackState2.ordinal()];
                if (i7 != 1) {
                    int i8 = MediaSessionCompatQueueItem + 43;
                    createfromparcel = createfromparcel2;
                    int i9 = i8 % Fields.SpotShadowColor;
                    MediaDescriptionCompat = i9;
                    coroutineSingletons = coroutineSingletons3;
                    if (i8 % 2 == 0 ? i7 == 2 : i7 == 4) {
                        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = SetRetainInstanceUsageViolation.TOP;
                        FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation, SetUserVisibleHintViolation.START, sendnexti.write(stateFlow2, contextScope), false);
                        SetUserVisibleHintViolation setUserVisibleHintViolation = SetUserVisibleHintViolation.CENTER;
                        FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks2 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation, setUserVisibleHintViolation, foreachrect.IconCompatParcelizer(contextScope), false);
                        SetUserVisibleHintViolation setUserVisibleHintViolation2 = SetUserVisibleHintViolation.END;
                        FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks3 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation, setUserVisibleHintViolation2, getanimatingaway.write(contextScope), false);
                        FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks4 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation, setUserVisibleHintViolation2, issegmentinside.write(contextScope), false);
                        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation2 = SetRetainInstanceUsageViolation.BOTTOM;
                        onfragmentstarted2 = new onFragmentStarted(removeNodeAtDepth.serializer(fragmentManagerFragmentLifecycleCallbacks, fragmentManagerFragmentLifecycleCallbacks2, fragmentManagerFragmentLifecycleCallbacks3, fragmentManagerFragmentLifecycleCallbacks4, new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation2, setUserVisibleHintViolation2, s.serializer(contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation2, setUserVisibleHintViolation, egVar, false)));
                    } else if (i7 != 3) {
                        int i10 = i9 + 69;
                        MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 != 0 ? i7 == 4 : i7 == 3) {
                            SetRetainInstanceUsageViolation setRetainInstanceUsageViolation3 = SetRetainInstanceUsageViolation.TOP;
                            SetUserVisibleHintViolation setUserVisibleHintViolation3 = SetUserVisibleHintViolation.FILL;
                            Object objWrite = applystate.MediaSessionCompatResultReceiverWrapper.read.read.write();
                            objWrite.getClass();
                            FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks5 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation3, setUserVisibleHintViolation3, new na(contextScope, (ManeuverApi) objWrite), false);
                            SetUserVisibleHintViolation setUserVisibleHintViolation4 = SetUserVisibleHintViolation.START;
                            FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks6 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation3, setUserVisibleHintViolation4, sendnexti.write(stateFlow2, contextScope), false);
                            SetUserVisibleHintViolation setUserVisibleHintViolation5 = SetUserVisibleHintViolation.END;
                            FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks7 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation3, setUserVisibleHintViolation5, getanimatingaway.write(contextScope), false);
                            SetRetainInstanceUsageViolation setRetainInstanceUsageViolation4 = SetRetainInstanceUsageViolation.BOTTOM;
                            FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks8 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation4, setUserVisibleHintViolation4, applystate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(contextScope), false);
                            FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks9 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation4, setUserVisibleHintViolation4, ((getMTextFieldValueui) applystate.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).read(contextScope), false);
                            FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks10 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation4, setUserVisibleHintViolation4, applystate.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write(contextScope), false);
                            SaveHeatmapUrlImpl saveHeatmapUrlImpl = applystate.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read;
                            saveHeatmapUrlImpl.getClass();
                            onfragmentstarted2 = new onFragmentStarted(removeNodeAtDepth.serializer(fragmentManagerFragmentLifecycleCallbacks5, fragmentManagerFragmentLifecycleCallbacks6, fragmentManagerFragmentLifecycleCallbacks7, fragmentManagerFragmentLifecycleCallbacks8, fragmentManagerFragmentLifecycleCallbacks9, fragmentManagerFragmentLifecycleCallbacks10, new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation4, setUserVisibleHintViolation4, new getMinimumlzQqcRY(contextScope, (SendTestPushUseCase) ((LayoutCompat) saveHeatmapUrlImpl.serializer).write()), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation4, SetUserVisibleHintViolation.CENTER, new getLastLineBottomEVpEnUU(contextScope, (SendTestPushUseCase) ((LayoutCompat) applystate.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer.read).write()), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation4, setUserVisibleHintViolation5, applystate.ComponentActivity.serializer(contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation4, setUserVisibleHintViolation5, applystate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read(contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation3, setUserVisibleHintViolation5, accesslayoutVar.IconCompatParcelizer(contextScope), false)));
                        } else {
                            int i11 = i9 + 21;
                            MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                            if (i11 % 2 != 0 ? i7 != 5 : i7 != 5) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            onfragmentstarted = new onFragmentStarted(removeNodeAtDepth.serializer(new FragmentManagerFragmentLifecycleCallbacks(SetRetainInstanceUsageViolation.BOTTOM, SetUserVisibleHintViolation.CENTER, egVar, false), new FragmentManagerFragmentLifecycleCallbacks(SetRetainInstanceUsageViolation.TOP, SetUserVisibleHintViolation.START, applystate.PlaybackStateCompatCustomAction.IconCompatParcelizer(contextScope), false)));
                            flowCollector5 = flowCollector5;
                        }
                    } else {
                        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation5 = SetRetainInstanceUsageViolation.TOP;
                        FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks11 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation5, SetUserVisibleHintViolation.START, sendnexti.write(stateFlow2, contextScope), false);
                        SetUserVisibleHintViolation setUserVisibleHintViolation6 = SetUserVisibleHintViolation.CENTER;
                        FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks12 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation5, setUserVisibleHintViolation6, foreachrect.IconCompatParcelizer(contextScope), false);
                        SetUserVisibleHintViolation setUserVisibleHintViolation7 = SetUserVisibleHintViolation.END;
                        FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks13 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation5, setUserVisibleHintViolation7, issegmentinside.write(contextScope), false);
                        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation6 = SetRetainInstanceUsageViolation.BOTTOM;
                        onfragmentstarted2 = new onFragmentStarted(removeNodeAtDepth.serializer(fragmentManagerFragmentLifecycleCallbacks11, fragmentManagerFragmentLifecycleCallbacks12, fragmentManagerFragmentLifecycleCallbacks13, new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation6, setUserVisibleHintViolation7, s.serializer(contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation6, setUserVisibleHintViolation6, egVar, false)));
                        int i12 = MediaDescriptionCompat + 25;
                        MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                    onfragmentstarted = onfragmentstarted2;
                } else {
                    createfromparcel = createfromparcel2;
                    coroutineSingletons = coroutineSingletons3;
                    flowCollector5 = flowCollector5;
                    SetRetainInstanceUsageViolation setRetainInstanceUsageViolation7 = SetRetainInstanceUsageViolation.TOP;
                    SetUserVisibleHintViolation setUserVisibleHintViolation8 = SetUserVisibleHintViolation.FILL;
                    MetricsBatchProcessor metricsBatchProcessor = applystate.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks14 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation7, setUserVisibleHintViolation8, new AppMigrationBannerUiModelImpl(contextScope, new getQueryContext(), (SemanticsNodedefault) ((mergeJsonObjects) metricsBatchProcessor.RemoteActionCompatParcelizer).write(), (InitializeAppStartupItemsImpl) ((getContentDataType) metricsBatchProcessor.serializer).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) metricsBatchProcessor.write).write(), (mergedSemanticsConfiguration) ((getContentDataType) metricsBatchProcessor.read).write(), (GetRiderStatusImpl) ((mergeJsonObjects) metricsBatchProcessor.MediaSessionCompatQueueItem).write(), (transferSessionPackageI) ((mergeJsonObjects) metricsBatchProcessor.IconCompatParcelizer).write()), true);
                    SetUserVisibleHintViolation setUserVisibleHintViolation9 = SetUserVisibleHintViolation.START;
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks15 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation7, setUserVisibleHintViolation9, applystate.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.write(contextScope), false);
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks16 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation7, setUserVisibleHintViolation9, sendnexti.write(stateFlow2, contextScope), false);
                    SetUserVisibleHintViolation setUserVisibleHintViolation10 = SetUserVisibleHintViolation.CENTER;
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks17 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation7, setUserVisibleHintViolation10, foreachrect.IconCompatParcelizer(contextScope), false);
                    SetUserVisibleHintViolation setUserVisibleHintViolation11 = SetUserVisibleHintViolation.END;
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks18 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation7, setUserVisibleHintViolation11, getanimatingaway.write(contextScope), false);
                    SetRetainInstanceUsageViolation setRetainInstanceUsageViolation8 = SetRetainInstanceUsageViolation.BOTTOM;
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks19 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation11, applystate.ParcelableVolumeInfo.IconCompatParcelizer(contextScope), false);
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks20 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation11, s.serializer(contextScope), false);
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks21 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation8, applystate.read.serializer(contextScope), false);
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks22 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation10, egVar, false);
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks23 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation9, applystate.MediaSessionCompatToken.serializer(contextScope), false);
                    WorkerWrapper.Builder builder = applystate.ResultReceiver.write;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
                    objWrite2.getClass();
                    getDeviceType getdevicetype = (getDeviceType) objWrite2;
                    Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
                    objWrite3.getClass();
                    checkSdkClickResponse checksdkclickresponse = (checkSdkClickResponse) objWrite3;
                    Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
                    objWrite4.getClass();
                    getPayload getpayload = (getPayload) objWrite4;
                    Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaBrowserCompatMediaItem).write();
                    objWrite5.getClass();
                    SendBreakRequestUseCaseImpl sendBreakRequestUseCaseImpl = (SendBreakRequestUseCaseImpl) objWrite5;
                    EndBreakUseCaseImpl endBreakUseCaseImpl = (EndBreakUseCaseImpl) ((publishErrorlambda1) builder.MediaMetadataCompat).write();
                    Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.IconCompatParcelizer).write();
                    objWrite6.getClass();
                    Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
                    objWrite7.getClass();
                    FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks24 = new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation9, new getOsName(getdevicetype, checksdkclickresponse, getpayload, sendBreakRequestUseCaseImpl, endBreakUseCaseImpl, (restoreChildFragmentState) objWrite6, (NetworkErrorMapperImpl) objWrite7, new getQueryContext(), contextScope), false);
                    GestureDetectorCompat gestureDetectorCompat = applystate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer;
                    Object objWrite8 = gestureDetectorCompat.read.write();
                    objWrite8.getClass();
                    AttributionHandler5 attributionHandler5 = (AttributionHandler5) objWrite8;
                    Object objWrite9 = gestureDetectorCompat.RemoteActionCompatParcelizer.write();
                    objWrite9.getClass();
                    checkSdkClickResponse checksdkclickresponse2 = (checkSdkClickResponse) objWrite9;
                    Object objWrite10 = gestureDetectorCompat.IconCompatParcelizer.write();
                    objWrite10.getClass();
                    Object obj3 = gestureDetectorCompat.write.write;
                    obj3.getClass();
                    onfragmentstarted = new onFragmentStarted(removeNodeAtDepth.serializer(fragmentManagerFragmentLifecycleCallbacks14, fragmentManagerFragmentLifecycleCallbacks15, fragmentManagerFragmentLifecycleCallbacks16, fragmentManagerFragmentLifecycleCallbacks17, fragmentManagerFragmentLifecycleCallbacks18, fragmentManagerFragmentLifecycleCallbacks19, fragmentManagerFragmentLifecycleCallbacks20, fragmentManagerFragmentLifecycleCallbacks21, fragmentManagerFragmentLifecycleCallbacks22, fragmentManagerFragmentLifecycleCallbacks23, fragmentManagerFragmentLifecycleCallbacks24, new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation9, new getABI(attributionHandler5, checksdkclickresponse2, (getPayload) objWrite10, (AttributionResponseData) obj3, contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation9, applystate.MediaSessionCompatQueueItem.serializer(contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation8, setUserVisibleHintViolation9, applystate.MediaBrowserCompatMediaItem.write(contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation7, setUserVisibleHintViolation11, applystate.RatingCompat.RemoteActionCompatParcelizer(contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation7, setUserVisibleHintViolation9, accesslayoutVar.IconCompatParcelizer(contextScope), false), new FragmentManagerFragmentLifecycleCallbacks(setRetainInstanceUsageViolation7, setUserVisibleHintViolation9, applystate.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(contextScope), false)));
                    int i14 = MediaSessionCompatQueueItem + 115;
                    MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                }
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(onfragmentstarted);
                flowCollector = null;
                getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1 = this;
            }
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.serializer = flowCollector;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaBrowserCompatMediaItem = flowCollector;
            getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1.MediaMetadataCompat = 1;
            CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
            if (FlowKt.emitAll(flowCollector5, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, getRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1) == coroutineSingletons4) {
                return coroutineSingletons4;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            createfromparcel = createfromparcel2;
        }
        return createfromparcel;
    }
}
