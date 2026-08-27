package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonUiModel;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffUiModelImpl;
import com.roadrunner.freelancing.presentation.WorkNowUiModelImpl;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusUiModelImpl;
import com.roadrunner.freelancing.presentation.empty.FreelancingAvailabilityUiModelImpl;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostUiModelImpl;
import com.roadrunner.freelancing.presentation.outsideactivearea.OutsideActiveAreaUiModelImpl;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.helpcenter.floating.lifecycle.HomeHelpCenterLifecycleObserverImpl;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.state.domain.Phase2FallbackReason;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModelImpl;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ColumnAdapter;
import o.EditingBufferCompanion;
import o.EmojiCompatStatusDelegate;
import o.LineBreakStrategyCompanion;
import o.ShortNewsContentCardView;
import o.SuspendingTransacterImpl;
import o.WorkManagerImpl;
import o.Worker;
import o.accessgetParagraphcp;
import o.cancelCompositionui_text;
import o.considerReleasingGlowsOnScroll;
import o.createFromParcel;
import o.dispatchChildDetached;
import o.dispatchLayoutStep2;
import o.executeAsList;
import o.generateActivityResultKey;
import o.getClipToPadding;
import o.getContentViewGroupParentLayout;
import o.getHeadingrAG3T2k;
import o.getScrollState;
import o.isOpenInternalroom_runtime;
import o.isStaleResolvedFont;
import o.notifyItemRemoved;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.resolveLineHeightInPxo2QH7mI;
import o.setSharedElementNames;
import o.transactionWithWrapper;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStateRepositoryImpl implements dispatchChildDetached {
    private static int MediaSessionCompatQueueItem = 0;
    private static int PlaybackStateCompat = 1;
    public final dispatchLayoutStep2 IconCompatParcelizer;
    public final getScrollState MediaBrowserCompatMediaItem;
    public final getContentViewGroupParentLayout MediaDescriptionCompat;
    public final considerReleasingGlowsOnScroll MediaMetadataCompat;
    public final transferSessionPackageI RatingCompat;
    public final SharedFlow RemoteActionCompatParcelizer;
    public final getClipToPadding read;
    public final MutableStateFlow serializer;
    public final r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc write;

    /* JADX INFO: renamed from: com.roadrunner.home.state.data.RiderStateRepositoryImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int serializer = 0;
        private static int write = 1;
        public final /* synthetic */ int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public final /* synthetic */ Object read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.read = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = 25;
            int i4 = write + 25;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i5 = this.IconCompatParcelizer;
            Object obj3 = this.read;
            int i6 = 3;
            int i7 = 0;
            switch (i5) {
                case 0:
                    return new AnonymousClass1((RiderStateRepositoryImpl) obj3, shortNewsContentCardView, i7);
                case 1:
                    return new AnonymousClass1((MidShiftIdVerificationCoordinator) obj3, shortNewsContentCardView, 1);
                case 2:
                    return new AnonymousClass1((cancelCompositionui_text) obj3, shortNewsContentCardView, i);
                case 3:
                    return new AnonymousClass1((EditingBufferCompanion) obj3, shortNewsContentCardView, i6);
                case 4:
                    return new AnonymousClass1((CustomerChatFloatingButtonUiModel) obj3, shortNewsContentCardView, 4);
                case 5:
                    return new AnonymousClass1((EmojiCompatStatusDelegate) obj3, shortNewsContentCardView, 5);
                case 6:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((isStaleResolvedFont) obj3, shortNewsContentCardView, 6);
                    int i8 = write + 3;
                    serializer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return anonymousClass1;
                case 7:
                    return new AnonymousClass1((resolveLineHeightInPxo2QH7mI) obj3, shortNewsContentCardView, 7);
                case 8:
                    return new AnonymousClass1((accessgetParagraphcp) obj3, shortNewsContentCardView, 8);
                case 9:
                    return new AnonymousClass1((getHeadingrAG3T2k) obj3, shortNewsContentCardView, 9);
                case 10:
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1((LineBreakStrategyCompanion) obj3, shortNewsContentCardView, 10);
                    int i10 = serializer + 123;
                    write = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        int i11 = 68 / 0;
                    }
                    return anonymousClass2;
                case 11:
                    return new AnonymousClass1((VerificationStatusLifecycleObserverImpl) obj3, shortNewsContentCardView, 11);
                case 12:
                    return new AnonymousClass1((PickUpDropOffUiModelImpl) obj3, shortNewsContentCardView, 12);
                case 13:
                    return new AnonymousClass1((WorkNowUiModelImpl) obj3, shortNewsContentCardView, 13);
                case 14:
                    return new AnonymousClass1((WorkNowWithBonusUiModelImpl) obj3, shortNewsContentCardView, 14);
                case 15:
                    return new AnonymousClass1((FreelancingAvailabilityUiModelImpl) obj3, shortNewsContentCardView, 15);
                case 16:
                    return new AnonymousClass1((WorkNowWithInfraBoostUiModelImpl) obj3, shortNewsContentCardView, 16);
                case 17:
                    return new AnonymousClass1((OutsideActiveAreaUiModelImpl) obj3, shortNewsContentCardView, 17);
                case 18:
                    return new AnonymousClass1((generateActivityResultKey) obj3, shortNewsContentCardView, 18);
                case 19:
                    return new AnonymousClass1((HomeHelpCenterLifecycleObserverImpl) obj3, shortNewsContentCardView, 19);
                case 20:
                    return new AnonymousClass1((HomeViewModel) obj3, shortNewsContentCardView, 20);
                case 21:
                    return new AnonymousClass1((setSharedElementNames) obj3, shortNewsContentCardView, 21);
                case 22:
                    return new AnonymousClass1((notifyItemRemoved) obj3, shortNewsContentCardView, 22);
                case 23:
                    return new AnonymousClass1((IncogniaManagerImpl) obj3, shortNewsContentCardView, 23);
                case 24:
                    return new AnonymousClass1((InstantShiftsUiModelImpl) obj3, shortNewsContentCardView, 24);
                case 25:
                    return new AnonymousClass1((Worker) obj3, shortNewsContentCardView, i3);
                case 26:
                    return new AnonymousClass1((WorkManagerImpl) obj3, shortNewsContentCardView, 26);
                case 27:
                    return new AnonymousClass1((ColumnAdapter) obj3, shortNewsContentCardView, 27);
                case 28:
                    return new AnonymousClass1((SuspendingTransacterImpl) obj3, shortNewsContentCardView, 28);
                default:
                    return new AnonymousClass1((transactionWithWrapper) obj3, shortNewsContentCardView, 29);
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            switch (i2) {
                case 0:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 1:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 2:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 3:
                    Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    int i3 = write + 77;
                    serializer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        int i4 = 3 / 0;
                    }
                    return objInvokeSuspend;
                case 4:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 5:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 6:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 7:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 8:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 9:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 10:
                    Object objInvokeSuspend2 = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    int i5 = serializer + 9;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return objInvokeSuspend2;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                case 11:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 12:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 13:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 14:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 15:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 16:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 17:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 18:
                    Object objInvokeSuspend3 = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    int i6 = serializer + 73;
                    write = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        int i7 = 78 / 0;
                    }
                    return objInvokeSuspend3;
                case 19:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 20:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 21:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 22:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 23:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 24:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 25:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 26:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 27:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 28:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                default:
                    return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:76:0x0193, code lost:
        
            if (r0 == r2) goto L77;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.state.data.RiderStateRepositoryImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public RiderStateRepositoryImpl(considerReleasingGlowsOnScroll considerreleasingglowsonscroll, transferSessionPackageI transfersessionpackagei, getClipToPadding getcliptopadding, getScrollState getscrollstate, isOpenInternalroom_runtime isopeninternalroom_runtime, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        considerreleasingglowsonscroll.getClass();
        transfersessionpackagei.getClass();
        getcliptopadding.getClass();
        getscrollstate.getClass();
        isopeninternalroom_runtime.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.MediaMetadataCompat = considerreleasingglowsonscroll;
        this.RatingCompat = transfersessionpackagei;
        this.read = getcliptopadding;
        this.MediaBrowserCompatMediaItem = getscrollstate;
        this.MediaDescriptionCompat = getcontentviewgroupparentlayout;
        this.write = DelayKt.serializer(new MapApiError$$ExternalSyntheticLambda1(14));
        this.IconCompatParcelizer = new dispatchLayoutStep2(getscrollstate);
        this.serializer = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = FlowKt.read(FlowKt.serializer(FlowKt.RemoteActionCompatParcelizer(new GetMapScope$invoke$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new HeatmapDataStore$get$$inlined$map$1(((performCustomExitMxy_nc0) considerreleasingglowsonscroll.read.MediaSessionCompatResultReceiverWrapper()).serializer(), considerreleasingglowsonscroll, 28)), this, 1), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer)), getcontentviewgroupparentlayout, SharingStarted.Companion.read(2));
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnonymousClass1(this, null, 0), 3);
    }

    public final Flow read(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        int i = 2 % 2;
        Flow flowSerializer = FlowKt.serializer(new RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1(this.RemoteActionCompatParcelizer, r8lambdaucgighn8fiyv_vccodeafjfpedk, 1));
        int i2 = MediaSessionCompatQueueItem + 109;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return flowSerializer;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 63;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RatingCompat;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.RIDER_HOME_PHASE2_ENABLED) || ((Boolean) this.serializer.read()).booleanValue()) {
            return false;
        }
        int i4 = MediaSessionCompatQueueItem + 5;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void read(Phase2FallbackReason phase2FallbackReason) {
        executeAsList executeaslist;
        String str;
        String str2;
        int i = 2 % 2;
        phase2FallbackReason.getClass();
        this.serializer.IconCompatParcelizer(Boolean.TRUE);
        getScrollState getscrollstate = this.MediaBrowserCompatMediaItem;
        getscrollstate.getClass();
        if (!(!(phase2FallbackReason instanceof Phase2FallbackReason.FailedToParseComponent))) {
            getscrollstate.read(null);
            throw null;
        }
        if (phase2FallbackReason instanceof Phase2FallbackReason.MissingMandatoryComponent) {
            Phase2FallbackReason.MissingMandatoryComponent missingMandatoryComponent = (Phase2FallbackReason.MissingMandatoryComponent) phase2FallbackReason;
            str2 = getscrollstate.read(missingMandatoryComponent.read());
            executeaslist = missingMandatoryComponent.read().read();
            str = "missing_mandatory_component";
        } else {
            if (!phase2FallbackReason.equals(Phase2FallbackReason.RiderStateNullOrEmpty.read)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                int i2 = MediaSessionCompatQueueItem + 35;
                PlaybackStateCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            int i4 = PlaybackStateCompat + 81;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            executeaslist = executeAsList.RXP;
            str = "rider_state_null_or_empty";
            str2 = "rider_state";
        }
        ((SentryCriticalIssueLogger) getscrollstate.IconCompatParcelizer).write("rider_home_phase2_fallback_triggered", executeaslist, String.format("reason: %s, component: %s", Arrays.copyOf(new Object[]{str, str2}, 2)), onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("reason", str), new onViewAttachedToWindowlambda0("component", str2), new onViewAttachedToWindowlambda0("owner", executeaslist.name())));
    }
}
