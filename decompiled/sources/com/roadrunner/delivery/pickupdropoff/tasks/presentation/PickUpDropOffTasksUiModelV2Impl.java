package com.roadrunner.delivery.pickupdropoff.tasks.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.PickUpDropOffTasksUiModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger.MultipleCodeScanEventLoggerImpl;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState$invoke$1;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.C0195provider;
import o.FontMuC2MFsdefault;
import o.InfiniteTransitionSearchInfo;
import o.InspectableKtExternalSyntheticLambda0;
import o.IntOffsetCompanion;
import o.PreviewContainer;
import o.PreviewLightDark;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.SingleProcessDataStore;
import o.accessgetInfinitycp;
import o.accessgetLOREM_IPSUM_SOURCEp;
import o.accessibleField;
import o.buildCompositionParentHierarchy;
import o.checkArithmeticNB67dxo;
import o.checkArithmeticR2X_6o;
import o.createAnimation;
import o.createFromParcel;
import o.detach;
import o.div0680j_4;
import o.extractFromIndyLambdaFields;
import o.fastFilterNotNull;
import o.getAnimatable;
import o.getCieXyz;
import o.getEnterjXw82LU;
import o.getMaxHeightimpl;
import o.getMaxWidth;
import o.getMaxnOccac;
import o.getOptimizationLevel;
import o.getPositionannotations;
import o.getQueryContext;
import o.interceptFontWeight;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.makeTreedefault;
import o.maxYgX7TsA;
import o.mergeJsonObjects;
import o.notifySubscribe;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda3h6Pkf89VgF8wNC8rAZRByrC7KU;
import o.r8lambda6cOFqnFCSVnq6uI5jphSUi9HNJU;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.remBjo55l4;
import o.removeNodeAtDepth;
import o.sourceInformationContextOf;
import o.uiMode;
import o.wrapper;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class PickUpDropOffTasksUiModelV2Impl implements PickUpDropOffTasksUiModelV2 {
    private static int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 1;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final interceptFontWeight ComponentActivity;
    public final getQueryContext IconCompatParcelizer;
    public final ContextScope MediaBrowserCompatMediaItem;
    public getPositionannotations MediaDescriptionCompat;
    public final fastFilterNotNull MediaMetadataCompat;
    public final long MediaSessionCompatQueueItem;
    public final r8lambda3h6Pkf89VgF8wNC8rAZRByrC7KU MediaSessionCompatResultReceiverWrapper;
    public final StateFlow MediaSessionCompatToken;
    public final GetDeliveryAnalyticsUseCaseImpl ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final StateFlow PlaybackStateCompatCustomAction;
    public final DeliveryConfirmationLoggerImpl RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow ResultReceiver;
    public final isAdapterPositionOnScreen r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final StateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final UpdateStateUseCaseImpl r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final createAnimation r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final detach r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;
        public final /* synthetic */ PickUpDropOffTasksUiModelV2Impl RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.RemoteActionCompatParcelizer = pickUpDropOffTasksUiModelV2Impl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            if (r0 != 1) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            return new com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1(r3, r7, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        
            r0 = new com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1(r3, r7, r2);
            r7 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.IconCompatParcelizer + 47;
            com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.serializer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if (r0 != 1) goto L11;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.ShortNewsContentCardView create(java.lang.Object r6, o.ShortNewsContentCardView r7) {
            /*
                r5 = this;
                r6 = 2
                int r0 = r6 % r6
                int r0 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.IconCompatParcelizer
                int r0 = r0 + 49
                int r1 = r0 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.serializer = r1
                int r0 = r0 % r6
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L1c
                int r0 = r5.write
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl r3 = r5.RemoteActionCompatParcelizer
                r4 = 63
                int r4 = r4 / r1
                if (r0 == 0) goto L39
                if (r0 == r2) goto L2a
                goto L24
            L1c:
                int r0 = r5.write
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl r3 = r5.RemoteActionCompatParcelizer
                if (r0 == 0) goto L39
                if (r0 == r2) goto L2a
            L24:
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1 r0 = new com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1
                r0.<init>(r3, r7, r6)
                return r0
            L2a:
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1 r0 = new com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1
                r0.<init>(r3, r7, r2)
                int r7 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.IconCompatParcelizer
                int r7 = r7 + 47
                int r1 = r7 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.serializer = r1
                int r7 = r7 % r6
                return r0
            L39:
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1 r6 = new com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1
                r6.<init>(r3, r7, r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0067 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0068  */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        
            if (r1 != 1) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        
            r7 = ((com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1) create(r7, r8)).invokeSuspend(r4);
            r8 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.IconCompatParcelizer + 19;
            com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.serializer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        
            if ((r8 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            return ((com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1) create(r7, r8)).invokeSuspend(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        
            if (r1 != 1) goto L11;
         */
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.serializer
                int r1 = r1 + 79
                int r2 = r1 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.IconCompatParcelizer = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L21
                int r1 = r6.write
                o.createFromParcel r4 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
                o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
                r5 = 80
                int r5 = r5 / 0
                if (r1 == 0) goto L52
                if (r1 == r2) goto L47
                goto L2d
            L21:
                int r1 = r6.write
                o.createFromParcel r4 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
                o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
                if (r1 == 0) goto L52
                if (r1 == r2) goto L47
            L2d:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1 r7 = (com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                int r8 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.IconCompatParcelizer
                int r8 = r8 + 19
                int r1 = r8 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.serializer = r1
                int r8 = r8 % r0
                if (r8 == 0) goto L43
                return r7
            L43:
                r3.hashCode()
                throw r3
            L47:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1 r7 = (com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                return r7
            L52:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$1 r7 = (com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                int r8 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.IconCompatParcelizer
                int r8 = r8 + 119
                int r1 = r8 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.serializer = r1
                int r8 = r8 % r0
                if (r8 == 0) goto L68
                return r7
            L68:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            final PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl = this.RemoteActionCompatParcelizer;
            final int i4 = 0;
            ShortNewsContentCardView shortNewsContentCardView = null;
            final int i5 = 1;
            if (i3 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.read;
                if (i6 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    pickUpDropOffTasksUiModelV2Impl.RemoteActionCompatParcelizer(true);
                    pickUpDropOffTasksUiModelV2Impl.serializer.IconCompatParcelizer(Boolean.FALSE);
                    pickUpDropOffTasksUiModelV2Impl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = BuildersKt.RemoteActionCompatParcelizer(pickUpDropOffTasksUiModelV2Impl.MediaBrowserCompatMediaItem, null, null, new AnonymousClass1(pickUpDropOffTasksUiModelV2Impl, shortNewsContentCardView, i5), 3);
                    this.read = 1;
                    if (PickUpDropOffTasksUiModelV2Impl.access$getAnalytics(pickUpDropOffTasksUiModelV2Impl, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i7 = serializer + 15;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        return createfromparcel;
                    }
                    int i8 = 3 / 4;
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 2;
                Object objCollect = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new NestLoadingServiceImpl$special$$inlined$map$1(pickUpDropOffTasksUiModelV2Impl.MediaSessionCompatToken, 25)).collect(new FlowCollector() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$sendEventsWhenDataLoaded$3
                    private static int read = 1;
                    private static int serializer;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView2) {
                        int i9 = 2 % 2;
                        int i10 = read + 19;
                        serializer = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        if (i4 != 0) {
                            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj2;
                            PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl2 = pickUpDropOffTasksUiModelV2Impl;
                            pickUpDropOffTasksUiModelV2Impl2.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                            PickUpDropOffTasksUiModelV2Impl.write(pickUpDropOffTasksUiModelV2Impl2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                            pickUpDropOffTasksUiModelV2Impl2.write.IconCompatParcelizer(Boolean.valueOf(!r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()));
                            pickUpDropOffTasksUiModelV2Impl2.serializer.IconCompatParcelizer(Boolean.FALSE);
                            pickUpDropOffTasksUiModelV2Impl2.RemoteActionCompatParcelizer(false);
                            return createFromParcel.INSTANCE;
                        }
                        ((Boolean) obj2).getClass();
                        PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl3 = pickUpDropOffTasksUiModelV2Impl;
                        getPositionannotations getpositionannotations = pickUpDropOffTasksUiModelV2Impl3.MediaDescriptionCompat;
                        if (getpositionannotations != null) {
                            DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl = pickUpDropOffTasksUiModelV2Impl3.RatingCompat;
                            deliveryConfirmationLoggerImpl.getClass();
                            Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.taskIds, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("isTaskMandatory", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.tasksRequired, ",", null, null, null, 62)));
                            String strSerializer = zzna.serializer(getpositionannotations.deliveryState);
                            Timber.RemoteActionCompatParcelizer.getClass();
                            if (Timber.read.length != 0) {
                                mapRemoteActionCompatParcelizer.toString();
                            }
                            deliveryConfirmationLoggerImpl.write.IconCompatParcelizer(strSerializer, mapRemoteActionCompatParcelizer);
                            r8lambda3h6Pkf89VgF8wNC8rAZRByrC7KU r8lambda3h6pkf89vgf8wnc8razrbyrc7ku = pickUpDropOffTasksUiModelV2Impl3.MediaSessionCompatResultReceiverWrapper;
                            r8lambda3h6pkf89vgf8wnc8razrbyrc7ku.getClass();
                            LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(r8lambda3h6pkf89vgf8wnc8razrbyrc7ku.serializer.write(), onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.taskIds, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("isTaskMandatory", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.tasksRequired, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("screenName", zzna.serializer(getpositionannotations.deliveryState))));
                            if (Timber.read.length != 0) {
                                linkedHashMapRemoteActionCompatParcelizer.toString();
                            }
                            r8lambda3h6pkf89vgf8wnc8razrbyrc7ku.write.logEvent("deliveries_task_view", linkedHashMapRemoteActionCompatParcelizer);
                            interceptFontWeight interceptfontweight = pickUpDropOffTasksUiModelV2Impl3.ComponentActivity;
                            StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = (StateV3AnalyticsProviderImpl) interceptfontweight.read;
                            Map mapSerializer = stateV3AnalyticsProviderImpl.serializer();
                            List list = (List) stateV3AnalyticsProviderImpl.write.read();
                            ArrayList<TrackingEvent> arrayList = new ArrayList();
                            int i11 = serializer + 71;
                            read = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            for (Object obj3 : list) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((TrackingEvent) obj3).name, "ab_test_participated"}, getCieXyz.write())).booleanValue()) {
                                    int i13 = serializer + 99;
                                    read = i13 % Fields.SpotShadowColor;
                                    int i14 = i13 % 2;
                                    arrayList.add(obj3);
                                    int i15 = serializer + 25;
                                    read = i15 % Fields.SpotShadowColor;
                                    int i16 = i15 % 2;
                                }
                            }
                            for (TrackingEvent trackingEvent : arrayList) {
                                interceptfontweight.RemoteActionCompatParcelizer.logEvent(trackingEvent.name, onMove.RemoteActionCompatParcelizer(FontMuC2MFsdefault.RemoteActionCompatParcelizer(trackingEvent.parameters), mapSerializer));
                            }
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, this);
                if (objCollect != coroutineSingletons) {
                    objCollect = createfromparcel;
                }
                if (objCollect != coroutineSingletons) {
                    return createfromparcel;
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.read;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("PickUpDropOffTasksUiModelV2Impl: observeRemoteTasks called", new Object[0]);
                FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((Flow) pickUpDropOffTasksUiModelV2Impl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper(), new GetCashBlockUiState$invoke$1(pickUpDropOffTasksUiModelV2Impl, null));
                FlowCollector flowCollector = new FlowCollector() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl$sendEventsWhenDataLoaded$3
                    private static int read = 1;
                    private static int serializer;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView2) {
                        int i10 = 2 % 2;
                        int i11 = read + 19;
                        serializer = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 != 0) {
                            throw null;
                        }
                        if (i5 != 0) {
                            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj2;
                            PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl2 = pickUpDropOffTasksUiModelV2Impl;
                            pickUpDropOffTasksUiModelV2Impl2.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                            PickUpDropOffTasksUiModelV2Impl.write(pickUpDropOffTasksUiModelV2Impl2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                            pickUpDropOffTasksUiModelV2Impl2.write.IconCompatParcelizer(Boolean.valueOf(!r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()));
                            pickUpDropOffTasksUiModelV2Impl2.serializer.IconCompatParcelizer(Boolean.FALSE);
                            pickUpDropOffTasksUiModelV2Impl2.RemoteActionCompatParcelizer(false);
                            return createFromParcel.INSTANCE;
                        }
                        ((Boolean) obj2).getClass();
                        PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl3 = pickUpDropOffTasksUiModelV2Impl;
                        getPositionannotations getpositionannotations = pickUpDropOffTasksUiModelV2Impl3.MediaDescriptionCompat;
                        if (getpositionannotations != null) {
                            DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl = pickUpDropOffTasksUiModelV2Impl3.RatingCompat;
                            deliveryConfirmationLoggerImpl.getClass();
                            Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.taskIds, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("isTaskMandatory", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.tasksRequired, ",", null, null, null, 62)));
                            String strSerializer = zzna.serializer(getpositionannotations.deliveryState);
                            Timber.RemoteActionCompatParcelizer.getClass();
                            if (Timber.read.length != 0) {
                                mapRemoteActionCompatParcelizer.toString();
                            }
                            deliveryConfirmationLoggerImpl.write.IconCompatParcelizer(strSerializer, mapRemoteActionCompatParcelizer);
                            r8lambda3h6Pkf89VgF8wNC8rAZRByrC7KU r8lambda3h6pkf89vgf8wnc8razrbyrc7ku = pickUpDropOffTasksUiModelV2Impl3.MediaSessionCompatResultReceiverWrapper;
                            r8lambda3h6pkf89vgf8wnc8razrbyrc7ku.getClass();
                            LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(r8lambda3h6pkf89vgf8wnc8razrbyrc7ku.serializer.write(), onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.taskIds, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("isTaskMandatory", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.tasksRequired, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("screenName", zzna.serializer(getpositionannotations.deliveryState))));
                            if (Timber.read.length != 0) {
                                linkedHashMapRemoteActionCompatParcelizer.toString();
                            }
                            r8lambda3h6pkf89vgf8wnc8razrbyrc7ku.write.logEvent("deliveries_task_view", linkedHashMapRemoteActionCompatParcelizer);
                            interceptFontWeight interceptfontweight = pickUpDropOffTasksUiModelV2Impl3.ComponentActivity;
                            StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = (StateV3AnalyticsProviderImpl) interceptfontweight.read;
                            Map mapSerializer = stateV3AnalyticsProviderImpl.serializer();
                            List list = (List) stateV3AnalyticsProviderImpl.write.read();
                            ArrayList<TrackingEvent> arrayList = new ArrayList();
                            int i12 = serializer + 71;
                            read = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            for (Object obj3 : list) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((TrackingEvent) obj3).name, "ab_test_participated"}, getCieXyz.write())).booleanValue()) {
                                    int i14 = serializer + 99;
                                    read = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                    arrayList.add(obj3);
                                    int i16 = serializer + 25;
                                    read = i16 % Fields.SpotShadowColor;
                                    int i17 = i16 % 2;
                                }
                            }
                            for (TrackingEvent trackingEvent : arrayList) {
                                interceptfontweight.RemoteActionCompatParcelizer.logEvent(trackingEvent.name, onMove.RemoteActionCompatParcelizer(FontMuC2MFsdefault.RemoteActionCompatParcelizer(trackingEvent.parameters), mapSerializer));
                            }
                        }
                        return createFromParcel.INSTANCE;
                    }
                };
                this.read = 1;
                if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(flowCollector, this) != coroutineSingletons2) {
                    return createfromparcel;
                }
                int i10 = serializer + 99;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons2;
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = this.read;
            if (i12 != 0) {
                int i13 = serializer + 65;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (i12 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                pickUpDropOffTasksUiModelV2Impl.RemoteActionCompatParcelizer(true);
                Flow flowWrite = TuplesKt.write(UpdateStateUseCaseImpl.write(pickUpDropOffTasksUiModelV2Impl.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i, 13, shortNewsContentCardView);
                this.read = 1;
                obj = FlowKt.first(flowWrite, signInDataStore$clear$2, this);
                if (obj == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
            }
            getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) obj;
            pickUpDropOffTasksUiModelV2Impl.RemoteActionCompatParcelizer(false);
            if (!(getoptimizationlevel instanceof getMaxWidth)) {
                return createfromparcel;
            }
            pickUpDropOffTasksUiModelV2Impl.IconCompatParcelizer.serializer(new InspectableKtExternalSyntheticLambda0(((getMaxWidth) getoptimizationlevel).write()));
            return createfromparcel;
        }
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 119;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaSessionCompatToken;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PickUpDropOffTasksUiModelV2Impl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, r8lambda3h6Pkf89VgF8wNC8rAZRByrC7KU r8lambda3h6pkf89vgf8wnc8razrbyrc7ku, UpdateStateUseCaseImpl updateStateUseCaseImpl, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, getAnimatable getanimatable, getQueryContext getquerycontext, interceptFontWeight interceptfontweight, detach detachVar, createAnimation createanimation) {
        deliveryConfirmationLoggerImpl.getClass();
        r8lambda3h6pkf89vgf8wnc8razrbyrc7ku.getClass();
        updateStateUseCaseImpl.getClass();
        getDeliveryAnalyticsUseCaseImpl.getClass();
        getanimatable.getClass();
        getquerycontext.getClass();
        interceptfontweight.getClass();
        detachVar.getClass();
        createanimation.getClass();
        this.MediaMetadataCompat = fastfilternotnull;
        this.MediaBrowserCompatMediaItem = contextScope;
        this.RatingCompat = deliveryConfirmationLoggerImpl;
        this.MediaSessionCompatResultReceiverWrapper = r8lambda3h6pkf89vgf8wnc8razrbyrc7ku;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = updateStateUseCaseImpl;
        this.ParcelableVolumeInfo = getDeliveryAnalyticsUseCaseImpl;
        this.IconCompatParcelizer = getquerycontext;
        this.ComponentActivity = interceptfontweight;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = detachVar;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = createanimation;
        this.MediaSessionCompatQueueItem = fastfilternotnull.deliveryId;
        this.PlaybackStateCompat = fastfilternotnull.action;
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.RemoteActionCompatParcelizer;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(smallPersistentVector);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.ResultReceiver = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(smallPersistentVector);
        this.read = mutableStateFlow2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableStateFlow2;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(bool);
        this.write = mutableStateFlow3;
        this.MediaSessionCompatToken = mutableStateFlow3;
        MutableStateFlow mutableStateFlow4 = StateFlowKt.read(bool);
        this.serializer = mutableStateFlow4;
        this.PlaybackStateCompatCustomAction = mutableStateFlow4;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new isAdapterPositionOnScreen(new DeviceManager$$ExternalSyntheticLambda1(getanimatable, 15, this));
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, null, 0), 3);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 117;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read(z);
        int i4 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 81;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    public static final Object access$getAnalytics(PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl, ContinuationImpl continuationImpl) {
        maxYgX7TsA maxygx7tsa;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        if (continuationImpl instanceof maxYgX7TsA) {
            maxygx7tsa = (maxYgX7TsA) continuationImpl;
            int i2 = maxygx7tsa.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 71;
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    maxygx7tsa.write = i2 >>> Integer.MIN_VALUE;
                } else {
                    maxygx7tsa.write = i2 - Integer.MIN_VALUE;
                }
            } else {
                maxygx7tsa = new maxYgX7TsA(pickUpDropOffTasksUiModelV2Impl, continuationImpl);
            }
        } else {
            maxygx7tsa = new maxYgX7TsA(pickUpDropOffTasksUiModelV2Impl, continuationImpl);
        }
        Object obj = maxygx7tsa.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = maxygx7tsa.write;
        Object obj2 = null;
        if (i4 != 0) {
            int i5 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 37;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("PickUpDropOffTasksUiModelV2Impl: getAnalytics called", new Object[0]);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = pickUpDropOffTasksUiModelV2Impl.ParcelableVolumeInfo;
            long j = pickUpDropOffTasksUiModelV2Impl.MediaSessionCompatQueueItem;
            String str = pickUpDropOffTasksUiModelV2Impl.PlaybackStateCompat;
            maxygx7tsa.write = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, maxygx7tsa);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            int i7 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 103;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                pickUpDropOffTasksUiModelV2Impl.MediaDescriptionCompat = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
                obj2.hashCode();
                throw null;
            }
            getPositionannotations getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            pickUpDropOffTasksUiModelV2Impl.MediaDescriptionCompat = getpositionannotations;
            if (getpositionannotations == null) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("PickUpDropOffTasksUiModelV2Impl: Analytics bundle is null in confirmation tasks response!", new Object[0]);
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            int i8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 35;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "PickUpDropOffTasksUiModelV2Impl: Analytics failed to load.", new Object[0]);
            } else {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "PickUpDropOffTasksUiModelV2Impl: Analytics failed to load.", new Object[0]);
            }
        }
        return createFromParcel.INSTANCE;
    }

    public static final void write(PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
        uiMode uimode;
        Object intOffsetCompanion;
        Object accessgetinfinitycp;
        int i = 2 % 2;
        MutableStateFlow mutableStateFlow = pickUpDropOffTasksUiModelV2Impl.read;
        detach detachVar = pickUpDropOffTasksUiModelV2Impl.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        fastFilterNotNull fastfilternotnull = pickUpDropOffTasksUiModelV2Impl.MediaMetadataCompat;
        ContextScope contextScope = pickUpDropOffTasksUiModelV2Impl.MediaBrowserCompatMediaItem;
        detachVar.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                mutableStateFlow.IconCompatParcelizer(removeNodeAtDepth.read(arrayList));
                int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 61;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            uiMode uimode2 = (uiMode) it.next();
            try {
                if (uimode2 instanceof accessgetLOREM_IPSUM_SOURCEp) {
                    int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 85;
                    r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    intOffsetCompanion = detachVar.PlaybackStateCompatCustomAction.read(fastfilternotnull, contextScope, ((accessgetLOREM_IPSUM_SOURCEp) uimode2).taskId);
                } else {
                    if (uimode2 instanceof getMaxHeightimpl) {
                        checkArithmeticR2X_6o checkarithmeticr2x_6o = detachVar.MediaSessionCompatToken;
                        String str = ((getMaxHeightimpl) uimode2).taskId;
                        checkarithmeticr2x_6o.getClass();
                        str.getClass();
                        r8lambda6cOFqnFCSVnq6uI5jphSUi9HNJU r8lambda6cofqnfcsvnq6ui5jphsui9hnju = checkarithmeticr2x_6o.RemoteActionCompatParcelizer;
                        Object objWrite = r8lambda6cofqnfcsvnq6ui5jphsui9hnju.read.write();
                        objWrite.getClass();
                        Object objWrite2 = r8lambda6cofqnfcsvnq6ui5jphsui9hnju.RemoteActionCompatParcelizer.write();
                        objWrite2.getClass();
                        accessgetinfinitycp = new checkArithmeticNB67dxo(fastfilternotnull, contextScope, str, (ObserveTaskByTypeAndIdUseCaseImpl) objWrite, (UpdateTaskUseCaseImpl) objWrite2);
                    } else if (uimode2 instanceof InfiniteTransitionSearchInfo) {
                        int i5 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 95;
                        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            detachVar.write.write(fastfilternotnull, contextScope, ((InfiniteTransitionSearchInfo) uimode2).taskId);
                            obj.hashCode();
                            throw null;
                        }
                        intOffsetCompanion = detachVar.write.write(fastfilternotnull, contextScope, ((InfiniteTransitionSearchInfo) uimode2).taskId);
                    } else if (uimode2 instanceof extractFromIndyLambdaFields) {
                        int i6 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 69;
                        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            detachVar.MediaDescriptionCompat.RemoteActionCompatParcelizer(fastfilternotnull, contextScope, ((extractFromIndyLambdaFields) uimode2).taskId);
                            obj.hashCode();
                            throw null;
                        }
                        intOffsetCompanion = detachVar.MediaDescriptionCompat.RemoteActionCompatParcelizer(fastfilternotnull, contextScope, ((extractFromIndyLambdaFields) uimode2).taskId);
                    } else if (uimode2 instanceof PreviewLightDark) {
                        intOffsetCompanion = detachVar.RatingCompat.serializer(fastfilternotnull, contextScope, ((PreviewLightDark) uimode2).taskId);
                    } else if (uimode2 instanceof wrapper) {
                        int i7 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 1;
                        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            detachVar.PlaybackStateCompat.IconCompatParcelizer(fastfilternotnull, contextScope, ((wrapper) uimode2).taskId);
                            obj.hashCode();
                            throw null;
                        }
                        intOffsetCompanion = detachVar.PlaybackStateCompat.IconCompatParcelizer(fastfilternotnull, contextScope, ((wrapper) uimode2).taskId);
                    } else if (uimode2 instanceof makeTreedefault) {
                        intOffsetCompanion = detachVar.IconCompatParcelizer.write(fastfilternotnull, contextScope, ((makeTreedefault) uimode2).taskId);
                    } else if (uimode2 instanceof accessibleField) {
                        accessgetinfinitycp = new notifySubscribe(fastfilternotnull, contextScope, ((accessibleField) uimode2).taskId, (ObserveTaskByTypeAndIdUseCaseImpl) detachVar.serializer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write(), new getQueryContext());
                        int i8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 25;
                        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                    } else if (uimode2 instanceof CashPaymentTaskUiItem) {
                        intOffsetCompanion = detachVar.RemoteActionCompatParcelizer.IconCompatParcelizer(fastfilternotnull, contextScope, ((CashPaymentTaskUiItem) uimode2).taskId);
                    } else if (uimode2 instanceof getEnterjXw82LU) {
                        int i10 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 73;
                        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        intOffsetCompanion = detachVar.read.write(fastfilternotnull, contextScope, ((getEnterjXw82LU) uimode2).taskId);
                    } else if (uimode2 instanceof buildCompositionParentHierarchy) {
                        intOffsetCompanion = null;
                    } else if (uimode2 instanceof C0195provider) {
                        intOffsetCompanion = detachVar.MediaMetadataCompat.write(fastfilternotnull, contextScope, ((C0195provider) uimode2).taskId);
                    } else {
                        if (uimode2 instanceof PreviewContainer) {
                            getMaxnOccac getmaxnoccac = detachVar.MediaBrowserCompatMediaItem;
                            String str2 = ((PreviewContainer) uimode2).taskId;
                            RouterLogger routerLogger = getmaxnoccac.write;
                            uimode = uimode2;
                            try {
                                intOffsetCompanion = new IntOffsetCompanion(fastfilternotnull, contextScope, str2, (remBjo55l4) ((SingleProcessDataStore) routerLogger.read).write(), (ObserveTaskByTypeAndIdUseCaseImpl) ((mergeJsonObjects) routerLogger.serializer).write(), new getQueryContext());
                            } catch (Exception e) {
                                e = e;
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, af$$ExternalSyntheticOutline0.m("SubTasksUiModelsProvider: Failed to create UiModel for taskId: ", uimode.IconCompatParcelizer(), ", taskType: ", uimode.getClass().getSimpleName()), new Object[0]);
                                intOffsetCompanion = null;
                            }
                        } else {
                            uimode = uimode2;
                            if (!(uimode instanceof sourceInformationContextOf)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            div0680j_4 div0680j_4Var = detachVar.MediaSessionCompatQueueItem;
                            String str3 = ((sourceInformationContextOf) uimode).taskId;
                            RouterLogger routerLogger2 = div0680j_4Var.write;
                            accessgetinfinitycp = new accessgetInfinitycp(fastfilternotnull, contextScope, str3, (ObserveTaskByTypeAndIdUseCaseImpl) ((mergeJsonObjects) routerLogger2.read).write(), new getQueryContext(), (MultipleCodeScanEventLoggerImpl) ((SingleProcessDataStore) routerLogger2.serializer).write());
                        }
                        e = e;
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, af$$ExternalSyntheticOutline0.m("SubTasksUiModelsProvider: Failed to create UiModel for taskId: ", uimode.IconCompatParcelizer(), ", taskType: ", uimode.getClass().getSimpleName()), new Object[0]);
                        intOffsetCompanion = null;
                    }
                    intOffsetCompanion = accessgetinfinitycp;
                }
            } catch (Exception e2) {
                e = e2;
                uimode = uimode2;
            }
            if (intOffsetCompanion != null) {
                arrayList.add(intOffsetCompanion);
            }
        }
    }
}
