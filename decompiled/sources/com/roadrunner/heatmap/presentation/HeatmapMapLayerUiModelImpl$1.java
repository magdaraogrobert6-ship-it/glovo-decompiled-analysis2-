package com.roadrunner.heatmap.presentation;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.provider.Settings;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.room.Room;
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d4$$ExternalSyntheticLambda2;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.navigator.R;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.delivery.accept.acknowledgment.implementation.DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.accept.backToBackOrder.domain.ObserveBackToBackOrdersStateImpl;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.destinationmarkers.domain.ObserveDestinationMarkers$invoke$1;
import com.roadrunner.delivery.ontheway.observer.OnTheWayLifecycleObserverImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.repository.StateV3DeliveryProvider;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import com.roadrunner.freelancing.domain.HasWorkNowOpportunityImpl$invoke$$inlined$map$1;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.heatmap.domain.GetHeatmapMapLayer$getMapLayer$1;
import com.roadrunner.helpcenter.floating.lifecycle.HomeHelpCenterLifecycleObserverImpl;
import com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.instant.shifts.presentation.GetInstantShiftUiState;
import com.roadrunner.instant.shifts.presentation.GetInstantShiftUiState$invoke$1$1;
import com.roadrunner.logger.logger.perseus.PerseusUserAttributesChangedListener;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository$get$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import io.sentry.metrics.MetricsBatchProcessor;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.reactive.FlowSubscription$consumeFlow$2;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
import o.C0215z;
import o.ConstraintReferenceIncorrectConstraintException;
import o.ContainsAlllambda0;
import o.CorruptionException;
import o.DrawableTransformation;
import o.E;
import o.EmojiCompatStatusDelegate;
import o.FragmentManagerFragmentLifecycleCallbacks;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.LineBreakStrategyCompanion;
import o.SegmentFinder;
import o.SegmentFinder_androidKt;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory28;
import o.TextIndentKt;
import o.TextLayoutInput;
import o.UrlAnnotationSaverlambda0;
import o.Worker;
import o.accessgetEmptycp;
import o.accessgetInstancedelegatecp;
import o.accessgetMiddleEllipsiscp;
import o.accessgetParagraphcp;
import o.accessgetSimplecp;
import o.accessgetStaticcp;
import o.accesshandleUpdate;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.accesstoNestedScrollSource;
import o.createFromParcel;
import o.drawRGB;
import o.getContentViewGroupParentLayout;
import o.getEndOffsetForRectWithinRun;
import o.getFragment;
import o.getHeadingrAG3T2k;
import o.getPostalCodeExtended;
import o.instance_delegatelambda0;
import o.invokeSuspendcomroadrunnercustomerchatusecaseChatAssetDownloadingObserverImplonCreate111;
import o.isRoot;
import o.isStaleResolvedFont;
import o.markFragmentsCreated;
import o.mb;
import o.mg;
import o.notifyItemRemoved;
import o.onContentCardDismissed;
import o.onCreateAnimator;
import o.onFragmentStarted;
import o.onViewCreated;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.readAndInitOrPropagateAndThrowFailure;
import o.removeSingleSubscriptionlambda101;
import o.requireParentFragment;
import o.resolveLineHeightInPxo2QH7mI;
import o.setDimens;
import o.setFillViewport;
import o.setFirstVerticalBias;
import o.setSharedElementNames;
import o.setSpan;
import o.subscribeToBannersErrorslambda0;
import o.supportsColorMatrixQuery;
import o.timesmpE4wyQ;
import o.toColorLong8_81llA;
import o.transactionWithResult;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class HeatmapMapLayerUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeatmapMapLayerUiModelImpl$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeatmapMapLayerUiModelImpl$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        Object obj2 = this.write;
        switch (i3) {
            case 0:
                return new HeatmapMapLayerUiModelImpl$1((RouterLogger) this.RemoteActionCompatParcelizer, (readAndInitOrPropagateAndThrowFailure) obj2, shortNewsContentCardView, 0);
            case 1:
                return new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (UrlAnnotationSaverlambda0) obj2, shortNewsContentCardView, 1);
            case 2:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$1 = new HeatmapMapLayerUiModelImpl$1((ObserveBackToBackOrdersStateImpl) obj2, shortNewsContentCardView, i);
                heatmapMapLayerUiModelImpl$1.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$1;
            case 3:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$2 = new HeatmapMapLayerUiModelImpl$1((getHeadingrAG3T2k) this.RemoteActionCompatParcelizer, (StaticLayoutFactory28) obj2, shortNewsContentCardView, 3);
                int i4 = IconCompatParcelizer + 99;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return heatmapMapLayerUiModelImpl$2;
            case 4:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$3 = new HeatmapMapLayerUiModelImpl$1((getEndOffsetForRectWithinRun) obj2, shortNewsContentCardView, 4);
                heatmapMapLayerUiModelImpl$3.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$3;
            case 5:
                return new HeatmapMapLayerUiModelImpl$1((accessgetMiddleEllipsiscp) this.RemoteActionCompatParcelizer, (SegmentFinder) obj2, shortNewsContentCardView, 5);
            case 6:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$4 = new HeatmapMapLayerUiModelImpl$1((MetricsBatchProcessor) obj2, shortNewsContentCardView, 6);
                heatmapMapLayerUiModelImpl$4.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$4;
            case 7:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$5 = new HeatmapMapLayerUiModelImpl$1((Flow) obj2, shortNewsContentCardView, 7);
                heatmapMapLayerUiModelImpl$5.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$5;
            case 8:
                return new HeatmapMapLayerUiModelImpl$1((WorkerWrapper.Builder) this.RemoteActionCompatParcelizer, (readAndInitOrPropagateAndThrowFailure) obj2, shortNewsContentCardView, 8);
            case 9:
                return new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (EmojiCompatStatusDelegate) obj2, shortNewsContentCardView, 9);
            case 10:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$6 = new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (isStaleResolvedFont) obj2, shortNewsContentCardView, 10);
                int i6 = MediaSessionCompatQueueItem + 41;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return heatmapMapLayerUiModelImpl$6;
            case 11:
                return new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (resolveLineHeightInPxo2QH7mI) obj2, shortNewsContentCardView, 11);
            case 12:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$7 = new HeatmapMapLayerUiModelImpl$1((accessgetParagraphcp) obj2, shortNewsContentCardView, 12);
                heatmapMapLayerUiModelImpl$7.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$7;
            case 13:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$8 = new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (LineBreakStrategyCompanion) obj2, shortNewsContentCardView, 13);
                int i8 = MediaSessionCompatQueueItem + 99;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return heatmapMapLayerUiModelImpl$8;
            case 14:
                return new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (VerificationStatusLifecycleObserverImpl) obj2, shortNewsContentCardView, 14);
            case 15:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$9 = new HeatmapMapLayerUiModelImpl$1((RouterLogger) obj2, shortNewsContentCardView, 15);
                heatmapMapLayerUiModelImpl$9.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$9;
            case 16:
                return new HeatmapMapLayerUiModelImpl$1((ConfirmationRepository) this.RemoteActionCompatParcelizer, (List) obj2, shortNewsContentCardView, 16);
            case 17:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$10 = new HeatmapMapLayerUiModelImpl$1((StateV3DeliveryProvider) obj2, shortNewsContentCardView, 17);
                heatmapMapLayerUiModelImpl$10.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$10;
            case 18:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$11 = new HeatmapMapLayerUiModelImpl$1((RouterLogger) obj2, shortNewsContentCardView, 18);
                heatmapMapLayerUiModelImpl$11.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$11;
            case 19:
                return new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (OnTheWayLifecycleObserverImpl) obj2, shortNewsContentCardView, 19);
            case 20:
                return new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (HomeHelpCenterLifecycleObserverImpl) obj2, shortNewsContentCardView, 20);
            case 21:
                return new HeatmapMapLayerUiModelImpl$1((onViewCreated) this.RemoteActionCompatParcelizer, (HomeBottomSheetUiModelImpl) obj2, shortNewsContentCardView, 21);
            case 22:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$12 = new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (setSharedElementNames) obj2, shortNewsContentCardView, 22);
                int i10 = IconCompatParcelizer + 43;
                MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return heatmapMapLayerUiModelImpl$12;
                }
                throw null;
            case 23:
                return new HeatmapMapLayerUiModelImpl$1((onFragmentStarted) this.RemoteActionCompatParcelizer, (markFragmentsCreated) obj2, shortNewsContentCardView, 23);
            case 24:
                return new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (notifyItemRemoved) obj2, shortNewsContentCardView, 24);
            case 25:
                return new HeatmapMapLayerUiModelImpl$1((IncogniaManagerImpl) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 25);
            case 26:
                HeatmapMapLayerUiModelImpl$1 heatmapMapLayerUiModelImpl$13 = new HeatmapMapLayerUiModelImpl$1((GetInstantShiftUiState) obj2, shortNewsContentCardView, 26);
                heatmapMapLayerUiModelImpl$13.RemoteActionCompatParcelizer = obj;
                return heatmapMapLayerUiModelImpl$13;
            case 27:
                return new HeatmapMapLayerUiModelImpl$1((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer, (Worker) obj2, shortNewsContentCardView, 27);
            case 28:
                return new HeatmapMapLayerUiModelImpl$1((PerseusUserAttributesChangedListener) this.RemoteActionCompatParcelizer, (transactionWithResult) obj2, shortNewsContentCardView, 28);
            default:
                return new HeatmapMapLayerUiModelImpl$1((E) this.RemoteActionCompatParcelizer, (C0215z) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        switch (i3) {
            case 0:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 1:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 2:
                return ((HeatmapMapLayerUiModelImpl$1) create((ContainsAlllambda0) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 3:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 4:
                return ((HeatmapMapLayerUiModelImpl$1) create((drawRGB) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 5:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 6:
                return ((HeatmapMapLayerUiModelImpl$1) create((Set) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 7:
                return ((HeatmapMapLayerUiModelImpl$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 8:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 9:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 10:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 11:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 12:
                return ((HeatmapMapLayerUiModelImpl$1) create((requireParentFragment) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 13:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 14:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 15:
                return ((HeatmapMapLayerUiModelImpl$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 16:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 17:
                return ((HeatmapMapLayerUiModelImpl$1) create((timesmpE4wyQ) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 18:
                return ((HeatmapMapLayerUiModelImpl$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 19:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 20:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 21:
                Object objInvokeSuspend = ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                int i4 = IconCompatParcelizer + 105;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 90 / 0;
                }
                return objInvokeSuspend;
            case 22:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 23:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 24:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 25:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 26:
                return ((HeatmapMapLayerUiModelImpl$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 27:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 28:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            default:
                return ((HeatmapMapLayerUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0576  */
    /* JADX WARN: Code duplicated, block: B:230:0x057a  */
    /* JADX WARN: Instruction removed from duplicated block: B:230:0x057a, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        Object objEmit;
        Object obj2;
        Object objAwait;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.write;
        int i4 = 22;
        int i5 = 6;
        int i6 = 11;
        int i7 = 7;
        int i8 = 3;
        int i9 = 19;
        int i10 = 10;
        int i11 = 21;
        int i12 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i13 = 1;
        switch (i3) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.read;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RouterLogger routerLogger = (RouterLogger) this.RemoteActionCompatParcelizer;
                CorruptionException corruptionException = (CorruptionException) routerLogger.read;
                setFillViewport setfillviewport = corruptionException.write;
                isRoot isroot = corruptionException.RemoteActionCompatParcelizer;
                isroot.getClass();
                HeatmapDataStore$get$$inlined$map$1 heatmapDataStore$get$$inlined$map$1 = new HeatmapDataStore$get$$inlined$map$1(setfillviewport.IconCompatParcelizer.serializer(), isroot, 0);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(heatmapDataStore$get$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
                invokeSuspendcomroadrunnercustomerchatusecaseChatAssetDownloadingObserverImplonCreate111 invokesuspendcomroadrunnercustomerchatusecasechatassetdownloadingobserverimploncreate111 = (invokeSuspendcomroadrunnercustomerchatusecaseChatAssetDownloadingObserverImplonCreate111) routerLogger.serializer;
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowRemoteActionCompatParcelizer, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(invokesuspendcomroadrunnercustomerchatusecasechatassetdownloadingobserverimploncreate111.IconCompatParcelizer.IconCompatParcelizer(), new WorkSpecDaoKt$dedup$$inlined$map$1(i5, new HasWorkNowOpportunityImpl$invoke$$inlined$map$1(invokesuspendcomroadrunnercustomerchatusecasechatassetdownloadingobserverimploncreate111.write.read.write(), i)), new accesshandleUpdate(3, invokesuspendcomroadrunnercustomerchatusecasechatassetdownloadingobserverimploncreate111, invokeSuspendcomroadrunnercustomerchatusecaseChatAssetDownloadingObserverImplonCreate111.class, "shouldFetchHeatmap", "shouldFetchHeatmap(Lcom/roadrunner/rider/state/provider/api/domain/model/RiderStatus;Z)Z", 4, 0)), new GetHeatmapMapLayer$getMapLayer$1(i8, 0, null));
                SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 anonymousClass2 = new SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2(26, (readAndInitOrPropagateAndThrowFailure) obj3);
                this.read = 1;
                return flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(anonymousClass2, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.read;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
                DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1 deliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1 = new DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1((UrlAnnotationSaverlambda0) obj3, null, 0);
                this.read = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp, tocolorlong8_81lla, deliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
            case 2:
                ContainsAlllambda0 containsAlllambda0 = (ContainsAlllambda0) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.read;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!(containsAlllambda0 instanceof TextLayoutInput)) {
                    return createfromparcel;
                }
                BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl = ((ObserveBackToBackOrdersStateImpl) obj3).RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = null;
                this.read = 1;
                return backToBackOrdersDataRepositoryImpl.optOutOfBackToBackOrders(this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.read;
                if (i17 != 0) {
                    if (i17 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutableStateFlow mutableStateFlow = ((getHeadingrAG3T2k) this.RemoteActionCompatParcelizer).read;
                SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 anonymousClass3 = new SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2(12, (StaticLayoutFactory28) obj3);
                this.read = 1;
                if (mutableStateFlow.collect(anonymousClass3, this) == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                DrawableTransformation.read();
                return null;
            case 4:
                getEndOffsetForRectWithinRun getendoffsetforrectwithinrun = (getEndOffsetForRectWithinRun) obj3;
                drawRGB drawrgb = (drawRGB) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.read;
                if (i18 != 0) {
                    int i19 = IconCompatParcelizer + 71;
                    MediaSessionCompatQueueItem = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 != 0 ? i18 != 1 : i18 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                boolean z = drawrgb == drawRGB.ACTIVE;
                getendoffsetforrectwithinrun.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(z));
                if (!z) {
                    getendoffsetforrectwithinrun.write.IconCompatParcelizer(null);
                    return createfromparcel;
                }
                LocalAuthDataSource.AnonymousClass2 anonymousClass4 = new LocalAuthDataSource.AnonymousClass2(getendoffsetforrectwithinrun, null, 18);
                this.RemoteActionCompatParcelizer = null;
                this.read = 1;
                return YieldKt.coroutineScope(anonymousClass4, this) == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.read;
                if (i20 != 0) {
                    if (i20 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessgetMiddleEllipsiscp accessgetmiddleellipsiscp = (accessgetMiddleEllipsiscp) this.RemoteActionCompatParcelizer;
                StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2 = ((StateProviderImpl) ((accesstoNestedScrollSource) accessgetmiddleellipsiscp.serializer)).MediaBrowserCompatMediaItem;
                SegmentFinder_androidKt segmentFinder_androidKt = new SegmentFinder_androidKt((SegmentFinder) obj3, 0);
                this.read = 1;
                Object objCollect = stateProviderImpl$special$$inlined$map$2.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(segmentFinder_androidKt, accessgetmiddleellipsiscp, i11), 20), this);
                if (objCollect != coroutineSingletons6) {
                    objCollect = createfromparcel;
                }
                if (objCollect != coroutineSingletons6) {
                    objCollect = createfromparcel;
                }
                return objCollect == coroutineSingletons6 ? coroutineSingletons6 : createfromparcel;
            case 6:
                Set set = (Set) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.read;
                if (i21 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = null;
                    this.read = 1;
                    return MetricsBatchProcessor.access$checkForAndLogGhostOrder((MetricsBatchProcessor) obj3, set, this) == coroutineSingletons7 ? coroutineSingletons7 : createfromparcel;
                }
                if (i21 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.read;
                if (i22 == 0) {
                    HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass5 = new HeatmapDataStore$get$$inlined$map$1.AnonymousClass2(c8$$ExternalSyntheticOutline0.m3979m(obj), flowCollector);
                    this.RemoteActionCompatParcelizer = null;
                    this.read = 1;
                    return ((Flow) obj3).collect(anonymousClass5, this) == coroutineSingletons8 ? coroutineSingletons8 : createfromparcel;
                }
                if (i22 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i23 = IconCompatParcelizer + 51;
                MediaSessionCompatQueueItem = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.read;
                if (i25 != 0) {
                    if (i25 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i26 = IconCompatParcelizer + 21;
                    MediaSessionCompatQueueItem = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                WorkerWrapper.Builder builder = (WorkerWrapper.Builder) this.RemoteActionCompatParcelizer;
                Flow flowSerializer = FlowKt.serializer(new WorkSpecDaoKt$dedup$$inlined$map$1(i7, new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) ((accessgetEmptycp) builder.write).write)).MediaBrowserCompatMediaItem, 18)));
                MutableStateFlow mutableStateFlow2 = ((getHeadingrAG3T2k) builder.read).read;
                StateFlow stateFlow = ((mg) builder.MediaMetadataCompat).IconCompatParcelizer;
                setSpan setspan = (setSpan) builder.MediaBrowserCompatMediaItem;
                if (setspan.read.serializer()) {
                    int i28 = 20;
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SwitcherUiModelImpl$1.AnonymousClass1(setspan, null, 9), new SignInDataStore$get$$inlined$map$1(FlowKt.serializer(new SignInDataStore$get$$inlined$map$1(FlowKt.IconCompatParcelizer(FlowKt.serializer(new RoomDatabase$createConnectionManager$2(11, setspan), FlowKt.read(new DeliveryNotesUiModelImpl.AnonymousClass1(new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) setspan.MediaSessionCompatQueueItem.write)).MediaBrowserCompatMediaItem, 19), (ShortNewsContentCardView) null, i28))), -1), setspan, i28)), setspan.write, i11));
                } else {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(instance_delegatelambda0.write);
                }
                FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3RemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(flowSerializer, mutableStateFlow2, stateFlow, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, ((mb) builder.IconCompatParcelizer).RemoteActionCompatParcelizer, new ObserveDestinationMarkers$invoke$1(builder, null));
                SingleProcessDataStore$data$1.AnonymousClass1 anonymousClass1 = new SingleProcessDataStore$data$1.AnonymousClass1((readAndInitOrPropagateAndThrowFailure) obj3, null, 8);
                this.read = 1;
                return FlowKt.collectLatest(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3RemoteActionCompatParcelizer, anonymousClass1, this) == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.read;
                if (i29 != 0) {
                    if (i29 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.RESUMED;
                RiderStateRepositoryImpl.AnonymousClass1 anonymousClass6 = new RiderStateRepositoryImpl.AnonymousClass1((EmojiCompatStatusDelegate) obj3, null, 5);
                this.read = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp2, tocolorlong8_81lla2, anonymousClass6, this) == coroutineSingletons10 ? coroutineSingletons10 : createfromparcel;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.read;
                if (i30 != 0) {
                    if (i30 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp3 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                toColorLong8_81llA tocolorlong8_81lla3 = toColorLong8_81llA.RESUMED;
                RiderStateRepositoryImpl.AnonymousClass1 anonymousClass7 = new RiderStateRepositoryImpl.AnonymousClass1((isStaleResolvedFont) obj3, null, i5);
                this.read = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp3, tocolorlong8_81lla3, anonymousClass7, this) == coroutineSingletons11 ? coroutineSingletons11 : createfromparcel;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.read;
                if (i31 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp4 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                    toColorLong8_81llA tocolorlong8_81lla4 = toColorLong8_81llA.RESUMED;
                    RiderStateRepositoryImpl.AnonymousClass1 anonymousClass8 = new RiderStateRepositoryImpl.AnonymousClass1((resolveLineHeightInPxo2QH7mI) obj3, null, i7);
                    this.read = 1;
                    return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp4, tocolorlong8_81lla4, anonymousClass8, this) == coroutineSingletons12 ? coroutineSingletons12 : createfromparcel;
                }
                int i32 = IconCompatParcelizer + 41;
                MediaSessionCompatQueueItem = i32 % Fields.SpotShadowColor;
                if (i32 % 2 != 0 ? i31 != 1 : i31 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            case 12:
                requireParentFragment requireparentfragment = (requireParentFragment) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.read;
                if (i33 != 0) {
                    if (i33 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessgetParagraphcp accessgetparagraphcp = (accessgetParagraphcp) obj3;
                this.RemoteActionCompatParcelizer = null;
                this.read = 1;
                if (requireparentfragment != requireParentFragment.ON_THE_WAY) {
                    int i34 = MediaSessionCompatQueueItem + 67;
                    IconCompatParcelizer = i34 % Fields.SpotShadowColor;
                    if (i34 % 2 != 0) {
                        int i35 = 50 / 0;
                        if (requireparentfragment != requireParentFragment.PICK_UP_DROP_OFF) {
                            if (requireparentfragment != requireParentFragment.ACCEPTING_DELIVERIES) {
                                objEmit = accessgetparagraphcp.IconCompatParcelizer.emit(new accessgetSimplecp("HomeContext_" + requireparentfragment), this);
                                if (objEmit != coroutineSingletons13) {
                                }
                            }
                        }
                    } else if (requireparentfragment != requireParentFragment.PICK_UP_DROP_OFF) {
                        if (requireparentfragment != requireParentFragment.ACCEPTING_DELIVERIES) {
                            objEmit = accessgetparagraphcp.IconCompatParcelizer.emit(new accessgetSimplecp("HomeContext_" + requireparentfragment), this);
                            if (objEmit != coroutineSingletons13) {
                            }
                        }
                    }
                    objEmit = createfromparcel;
                } else {
                    objEmit = createfromparcel;
                }
                return objEmit == coroutineSingletons13 ? coroutineSingletons13 : createfromparcel;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.read;
                if (i36 != 0) {
                    if (i36 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp5 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                toColorLong8_81llA tocolorlong8_81lla5 = toColorLong8_81llA.RESUMED;
                RiderStateRepositoryImpl.AnonymousClass1 anonymousClass9 = new RiderStateRepositoryImpl.AnonymousClass1((LineBreakStrategyCompanion) obj3, null, i10);
                this.read = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp5, tocolorlong8_81lla5, anonymousClass9, this) == coroutineSingletons14 ? coroutineSingletons14 : createfromparcel;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.read;
                if (i37 != 0) {
                    if (i37 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp6 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                toColorLong8_81llA tocolorlong8_81lla6 = toColorLong8_81llA.STARTED;
                RiderStateRepositoryImpl.AnonymousClass1 anonymousClass10 = new RiderStateRepositoryImpl.AnonymousClass1((VerificationStatusLifecycleObserverImpl) obj3, null, i6);
                this.read = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp6, tocolorlong8_81lla6, anonymousClass10, this) == coroutineSingletons15 ? coroutineSingletons15 : createfromparcel;
            case 15:
                RouterLogger routerLogger2 = (RouterLogger) obj3;
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.read;
                if (i38 != 0) {
                    if (i38 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ProducerCoroutine producerCoroutine = (ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
                producerCoroutine.b_(Boolean.valueOf(((TextIndentKt) routerLogger2.serializer).serializer()));
                accessgetStaticcp accessgetstaticcp = new accessgetStaticcp(producerCoroutine, routerLogger2);
                ContentResolver contentResolver = ((subscribeToBannersErrorslambda0) routerLogger2.read).IconCompatParcelizer.getContentResolver();
                contentResolver.registerContentObserver(Settings.Global.getUriFor("auto_time"), false, accessgetstaticcp);
                contentResolver.registerContentObserver(Settings.Global.getUriFor("auto_time_zone"), false, accessgetstaticcp);
                d4$$ExternalSyntheticLambda2 d4__externalsyntheticlambda2 = new d4$$ExternalSyntheticLambda2(routerLogger2, i4, accessgetstaticcp);
                this.RemoteActionCompatParcelizer = null;
                this.read = 1;
                return Room.awaitClose(producerCoroutine, d4__externalsyntheticlambda2, this) == coroutineSingletons16 ? coroutineSingletons16 : createfromparcel;
            case 16:
                List list = (List) obj3;
                ConfirmationRepository confirmationRepository = (ConfirmationRepository) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.read;
                if (i39 != 0) {
                    if (i39 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) confirmationRepository.MediaBrowserCompatMediaItem, updateAdidI.IS_DELIVERY_TASKS_DATA_STORE_CACHING_ENABLED})).booleanValue()) {
                    return Boolean.valueOf(confirmationRepository.write.keySet().retainAll(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(list)));
                }
                AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 = confirmationRepository.serializer;
                this.read = 1;
                List list2 = list;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1.read(((Number) it.next()).longValue()));
                }
                Object objRetainAll = animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1.read.retainAll(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList), this);
                if (objRetainAll != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objRetainAll = createfromparcel;
                }
                return objRetainAll == coroutineSingletons17 ? coroutineSingletons17 : createfromparcel;
            case 17:
                timesmpE4wyQ timesmpe4wyq = (timesmpE4wyQ) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.read;
                if (i40 != 0) {
                    if (i40 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MetricsBatchProcessor metricsBatchProcessor = ((StateV3DeliveryProvider) obj3).write;
                Set set2 = timesmpe4wyq.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = null;
                this.read = 1;
                Object objEmit2 = ((SharedFlowImpl) metricsBatchProcessor.IconCompatParcelizer).emit(set2, this);
                if (objEmit2 != coroutineSingletons18) {
                    objEmit2 = createfromparcel;
                }
                return objEmit2 == coroutineSingletons18 ? coroutineSingletons18 : createfromparcel;
            case 18:
                FlowCollector flowCollector2 = (FlowCollector) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.read;
                if (i41 != 0) {
                    if (i41 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                boolean zResultReceiver = ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) ((RouterLogger) obj3).read)).ResultReceiver();
                this.RemoteActionCompatParcelizer = null;
                this.read = 1;
                return flowCollector2.emit(Boolean.valueOf(zResultReceiver), this) == coroutineSingletons19 ? coroutineSingletons19 : createfromparcel;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = this.read;
                if (i42 != 0) {
                    if (i42 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp7 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                OnTheWayLifecycleObserverImpl onTheWayLifecycleObserverImpl = (OnTheWayLifecycleObserverImpl) obj3;
                setFirstVerticalBias setfirstverticalbias = (setFirstVerticalBias) onTheWayLifecycleObserverImpl.serializer;
                supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp7.getLifecycle();
                toColorLong8_81llA tocolorlong8_81lla7 = toColorLong8_81llA.RESUMED;
                DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer = MainDispatcherLoader.read.IconCompatParcelizer();
                boolean zIsDispatchNeeded = mainCoroutineDispatcherIconCompatParcelizer.isDispatchNeeded(getContext());
                if (!zIsDispatchNeeded) {
                    accessregisterComponentCallback accessregistercomponentcallback = (accessregisterComponentCallback) lifecycle;
                    if (accessregistercomponentcallback.RatingCompat == toColorLong8_81llA.DESTROYED) {
                        throw new LifecycleDestroyedException();
                    }
                    int i43 = IconCompatParcelizer + 125;
                    MediaSessionCompatQueueItem = i43 % Fields.SpotShadowColor;
                    int i44 = i43 % 2;
                    if (accessregistercomponentcallback.RatingCompat.compareTo(tocolorlong8_81lla7) >= 0) {
                        int i45 = IconCompatParcelizer + 11;
                        MediaSessionCompatQueueItem = i45 % Fields.SpotShadowColor;
                        if (i45 % 2 == 0) {
                            if (((SharedPreferences) ((ConstraintReferenceIncorrectConstraintException) setfirstverticalbias).write.MediaSessionCompatResultReceiverWrapper()).getBoolean("dark_mode_discovery_seen_key", true)) {
                                return createfromparcel;
                            }
                        } else if (((SharedPreferences) ((ConstraintReferenceIncorrectConstraintException) setfirstverticalbias).write.MediaSessionCompatResultReceiverWrapper()).getBoolean("dark_mode_discovery_seen_key", false)) {
                            return createfromparcel;
                        }
                        if (!((accessregisterComponentCallback) accessisrendernodecompatiblecp7.getLifecycle()).RatingCompat.isAtLeast(tocolorlong8_81lla7)) {
                            return createfromparcel;
                        }
                        setDimens.read().RemoteActionCompatParcelizer(((MainActivity) onTheWayLifecycleObserverImpl.write).getSupportFragmentManager(), "com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment");
                        ((removeSingleSubscriptionlambda101) onTheWayLifecycleObserverImpl.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer.logEvent("dark_mode_pop_up_displayed", null);
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((ConstraintReferenceIncorrectConstraintException) setfirstverticalbias).write.MediaSessionCompatResultReceiverWrapper()).edit();
                        editorEdit.putBoolean("dark_mode_discovery_seen_key", true);
                        editorEdit.apply();
                        return createfromparcel;
                    }
                }
                LayerUtils$getLayer$source$2 layerUtils$getLayer$source$2 = new LayerUtils$getLayer$source$2(onTheWayLifecycleObserverImpl, 19, accessisrendernodecompatiblecp7);
                this.read = 1;
                return UArraysKt.suspendWithStateAtLeastUnchecked(lifecycle, tocolorlong8_81lla7, zIsDispatchNeeded, mainCoroutineDispatcherIconCompatParcelizer, layerUtils$getLayer$source$2, this) == coroutineSingletons20 ? coroutineSingletons20 : createfromparcel;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i46 = this.read;
                if (i46 != 0) {
                    if (i46 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp8 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                toColorLong8_81llA tocolorlong8_81lla8 = toColorLong8_81llA.RESUMED;
                RiderStateRepositoryImpl.AnonymousClass1 anonymousClass11 = new RiderStateRepositoryImpl.AnonymousClass1((HomeHelpCenterLifecycleObserverImpl) obj3, shortNewsContentCardView, i9);
                this.read = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp8, tocolorlong8_81lla8, anonymousClass11, this) == coroutineSingletons21 ? coroutineSingletons21 : createfromparcel;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i47 = this.read;
                if (i47 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    StateFlow stateFlowIconCompatParcelizer = ((onViewCreated) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
                    onCreateAnimator oncreateanimator = new onCreateAnimator((HomeBottomSheetUiModelImpl) obj3, i8);
                    this.read = 1;
                    if (stateFlowIconCompatParcelizer.collect(oncreateanimator, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i47 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                DrawableTransformation.read();
                return null;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i48 = this.read;
                if (i48 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp9 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                    toColorLong8_81llA tocolorlong8_81lla9 = toColorLong8_81llA.RESUMED;
                    RiderStateRepositoryImpl.AnonymousClass1 anonymousClass12 = new RiderStateRepositoryImpl.AnonymousClass1((setSharedElementNames) obj3, shortNewsContentCardView, i11);
                    this.read = 1;
                    return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp9, tocolorlong8_81lla9, anonymousClass12, this) == coroutineSingletons23 ? coroutineSingletons23 : createfromparcel;
                }
                int i49 = IconCompatParcelizer + 23;
                MediaSessionCompatQueueItem = i49 % Fields.SpotShadowColor;
                if (i49 % 2 != 0 ? i48 != 1 : i48 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            case 23:
                onFragmentStarted onfragmentstarted = (onFragmentStarted) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i50 = this.read;
                if (i50 != 0) {
                    if (i50 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                onfragmentstarted.getClass();
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = onfragmentstarted.write;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 10));
                Iterator<E> it2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((FragmentManagerFragmentLifecycleCallbacks) it2.next()).write);
                }
                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((getFragment) it3.next()).IconCompatParcelizer());
                }
                Flow[] flowArr = (Flow[]) onContentCardDismissed.PlaybackStateCompat(arrayList3).toArray(new Flow[0]);
                HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass13 = new HeatmapDataStore$get$$inlined$map$1.AnonymousClass2((markFragmentsCreated) obj3, 27, onfragmentstarted);
                this.read = 1;
                Object objCombineInternal = CombineKt.combineInternal(this, new getPostalCodeExtended(i, flowArr), new WorkConstraintsTracker$track$$inlined$combine$1$3(i8, i13, shortNewsContentCardView), anonymousClass13, flowArr);
                if (objCombineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objCombineInternal = createfromparcel;
                }
                return objCombineInternal == coroutineSingletons24 ? coroutineSingletons24 : createfromparcel;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i51 = this.read;
                if (i51 != 0) {
                    if (i51 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp10 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                toColorLong8_81llA tocolorlong8_81lla10 = toColorLong8_81llA.RESUMED;
                RiderStateRepositoryImpl.AnonymousClass1 anonymousClass14 = new RiderStateRepositoryImpl.AnonymousClass1((notifyItemRemoved) obj3, shortNewsContentCardView, i4);
                this.read = 1;
                return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp10, tocolorlong8_81lla10, anonymousClass14, this) == coroutineSingletons25 ? coroutineSingletons25 : createfromparcel;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i52 = this.read;
                if (i52 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return ((IncogniaManagerImpl) this.RemoteActionCompatParcelizer).MediaMetadataCompat.checkIfIncogniaEnabledInitIfRequired((String) obj3, this) == coroutineSingletons26 ? coroutineSingletons26 : createfromparcel;
                }
                if (i52 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                GetInstantShiftUiState getInstantShiftUiState = (GetInstantShiftUiState) obj3;
                FlowCollector flowCollector3 = (FlowCollector) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i53 = this.read;
                if (i53 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GetStatusUseCaseImpl getStatusUseCaseImpl = getInstantShiftUiState.read;
                    this.RemoteActionCompatParcelizer = flowCollector3;
                    this.read = 1;
                    obj2 = getStatusUseCaseImpl.read();
                    if (obj2 != coroutineSingletons27) {
                    }
                    return coroutineSingletons27;
                }
                if (i53 != 1) {
                    if (i53 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj2 = obj;
                FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 = FlowKt.read(FlowKt.write(FlowKt.serializer((Flow) obj2), 100L), new OpportunitiesRepository$get$$inlined$map$1(getInstantShiftUiState.MediaSessionCompatQueueItem.read(), i12), getInstantShiftUiState.MediaMetadataCompat.write, new GetInstantShiftUiState$invoke$1$1(getInstantShiftUiState, flowCollector3, null));
                StateProviderImpl$special$$inlined$map$7$2 stateProviderImpl$special$$inlined$map$7$2 = new StateProviderImpl$special$$inlined$map$7$2(flowCollector3, i7);
                this.RemoteActionCompatParcelizer = null;
                this.read = 2;
                if (flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.collect(stateProviderImpl$special$$inlined$map$7$2, this) != coroutineSingletons27) {
                    return createfromparcel;
                }
                return coroutineSingletons27;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i54 = this.read;
                if (i54 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp11 = (accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer;
                    toColorLong8_81llA tocolorlong8_81lla11 = toColorLong8_81llA.RESUMED;
                    RiderStateRepositoryImpl.AnonymousClass1 anonymousClass15 = new RiderStateRepositoryImpl.AnonymousClass1((Worker) obj3, shortNewsContentCardView, 25);
                    this.read = 1;
                    return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp11, tocolorlong8_81lla11, anonymousClass15, this) == coroutineSingletons28 ? coroutineSingletons28 : createfromparcel;
                }
                int i55 = MediaSessionCompatQueueItem + 95;
                IconCompatParcelizer = i55 % Fields.SpotShadowColor;
                int i56 = i55 % 2;
                if (i54 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                PerseusUserAttributesChangedListener perseusUserAttributesChangedListener = (PerseusUserAttributesChangedListener) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i57 = this.read;
                try {
                    if (i57 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        Object objWrite = perseusUserAttributesChangedListener.serializer.write();
                        objWrite.getClass();
                        zzw zzwVarWrite = ((FirebaseInstallations) objWrite).write();
                        zzwVarWrite.getClass();
                        this.read = 1;
                        objAwait = RangesKt.await(zzwVarWrite, this);
                        if (objAwait == coroutineSingletons29) {
                        }
                        return coroutineSingletons29;
                    }
                    if (i57 != 1) {
                        if (i57 == 2) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objAwait = obj;
                    DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.read;
                    SingleProcessDataStore$data$1.AnonymousClass1 anonymousClass16 = new SingleProcessDataStore$data$1.AnonymousClass1((transactionWithResult) obj3, (String) objAwait, shortNewsContentCardView, i9);
                    this.read = 2;
                    if (BuildersKt.withContext(mainCoroutineDispatcher, anonymousClass16, this) != coroutineSingletons29) {
                        return createfromparcel;
                    }
                    return coroutineSingletons29;
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Couldn't fetch firebase installation id", new Object[0]);
                    return createfromparcel;
                }
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i58 = this.read;
                if (i58 != 0) {
                    int i59 = IconCompatParcelizer + 41;
                    MediaSessionCompatQueueItem = i59 % Fields.SpotShadowColor;
                    int i60 = i59 % 2;
                    if (i58 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StateFlow stateFlow2 = ((E) this.RemoteActionCompatParcelizer).read;
                FlowSubscription$consumeFlow$2 flowSubscription$consumeFlow$2 = new FlowSubscription$consumeFlow$2(4, (C0215z) obj3);
                this.read = 1;
                if (stateFlow2.collect(flowSubscription$consumeFlow$2, this) == coroutineSingletons30) {
                    return coroutineSingletons30;
                }
                DrawableTransformation.read();
                return null;
        }
    }
}
