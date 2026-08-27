package com.roadrunner.nafath;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.gestures.DraggableNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.IntSize;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatUrlDataStoreHelperImpl;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParser;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.internal.RouteProgressData;
import com.mapbox.navigation.core.internal.utils.CoroutineUtils;
import com.mapbox.navigation.core.routerefresh.MapboxHistoryRecorderWrapper;
import com.mapbox.navigation.core.routerefresh.RouteRefresher;
import com.mapbox.navigation.core.routerefresh.RouteRefresherResult;
import com.mapbox.navigation.core.routerefresh.RouteRefresherStatus$Failure;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import com.mapbox.navigator.R;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouteParser;
import com.mapbox.navigator.RouterOrigin;
import com.roadrunner.customerchat.legacy.chatlist.analytics.ChatLogger$log$2;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.CountDownTimer$startSystemClockCountDown$1;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.home.nest.NestViewModel$observeNestScope$1;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import com.roadrunner.vendor.review.data.database.entity.ReviewState;
import com.sentiance.core.model.events.H$b;
import java.time.Clock;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandler261;
import o.AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
import o.AsyncFontListLoaderloadWithTimeoutOrNull2;
import o.LayerSnapshotV21;
import o.Paragraph_EkL_Ydefault;
import o.ShortNewsContentCardView;
import o.TapGestureDetectorKtawaitSecondDown2;
import o.TrackpadScrollingLogic;
import o.ViewLayerVerificationHelper31;
import o.accessdispatchTrackpadScroll;
import o.addSingleSynchronousSubscription;
import o.anglek4lQ0M;
import o.areCachedContentCardsStale;
import o.bitOffsetToIndex;
import o.changeUser;
import o.createFromParcel;
import o.deserializeContentCard;
import o.getCallbackId;
import o.getContentViewGroupParentLayout;
import o.getHasNonTranslationComponents;
import o.getMaxDuration;
import o.inCompatibilityMode;
import o.isInvalidated;
import o.oe;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.resetTransientState;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class NafathTimerManager$observeCountdown$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NafathTimerManager$observeCountdown$1(long j, Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = j;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NafathTimerManager$observeCountdown$1(Object obj, long j, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = j;
        this.read = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NafathTimerManager$observeCountdown$1(Object obj, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.write = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NafathTimerManager$observeCountdown$1(Object obj, Object obj2, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.write = j;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                return ((NafathTimerManager$observeCountdown$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                Object objInvokeSuspend = ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = MediaBrowserCompatMediaItem + 15;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 73 / 0;
                }
                return objInvokeSuspend;
            case 4:
                Object objInvokeSuspend2 = ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i7 = MediaDescriptionCompat + 71;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return objInvokeSuspend2;
            case 5:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                Object objInvokeSuspend3 = ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i9 = MediaBrowserCompatMediaItem + 7;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return objInvokeSuspend3;
            case 9:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((NafathTimerManager$observeCountdown$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        Object obj3 = this.read;
        switch (i3) {
            case 0:
                NafathTimerManager$observeCountdown$1 nafathTimerManager$observeCountdown$1 = new NafathTimerManager$observeCountdown$1((H$b) obj3, this.write, shortNewsContentCardView, 0);
                nafathTimerManager$observeCountdown$1.RemoteActionCompatParcelizer = obj;
                return nafathTimerManager$observeCountdown$1;
            case 1:
                return new NafathTimerManager$observeCountdown$1((TapGestureDetectorKtawaitSecondDown2) this.RemoteActionCompatParcelizer, this.write, (SizeAnimationModifierNode) obj3, shortNewsContentCardView, 1);
            case 2:
                NafathTimerManager$observeCountdown$1 nafathTimerManager$observeCountdown$2 = new NafathTimerManager$observeCountdown$1((DraggableNode) obj3, this.write, shortNewsContentCardView, 2);
                nafathTimerManager$observeCountdown$2.RemoteActionCompatParcelizer = obj;
                return nafathTimerManager$observeCountdown$2;
            case 3:
                return new NafathTimerManager$observeCountdown$1((ChatUrlDataStoreHelperImpl) this.RemoteActionCompatParcelizer, (String) obj3, this.write, shortNewsContentCardView, 3);
            case 4:
                return new NafathTimerManager$observeCountdown$1((ResponseToParse) this.RemoteActionCompatParcelizer, this.write, (NnAndModelsParallelNavigationRoutesParser) obj3, shortNewsContentCardView, 4);
            case 5:
                return new NafathTimerManager$observeCountdown$1((onViewAttachedToWindowlambda0) this.RemoteActionCompatParcelizer, this.write, (RouteRefresher) obj3, shortNewsContentCardView, 5);
            case 6:
                return new NafathTimerManager$observeCountdown$1((getHasNonTranslationComponents) this.RemoteActionCompatParcelizer, (isInvalidated) obj3, this.write, shortNewsContentCardView, 6);
            case 7:
                NafathTimerManager$observeCountdown$1 nafathTimerManager$observeCountdown$3 = new NafathTimerManager$observeCountdown$1((getHasNonTranslationComponents) this.RemoteActionCompatParcelizer, (Paragraph_EkL_Ydefault) obj3, this.write, shortNewsContentCardView, 7);
                int i4 = MediaDescriptionCompat + 21;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return nafathTimerManager$observeCountdown$3;
            case 8:
                return new NafathTimerManager$observeCountdown$1((ConfirmationRepository) this.RemoteActionCompatParcelizer, this.write, (AsyncFontListLoaderloadWithTimeoutOrNull2) obj3, shortNewsContentCardView, 8);
            case 9:
                return new NafathTimerManager$observeCountdown$1((CustomerUnavailableViewModel) this.RemoteActionCompatParcelizer, this.write, (getMaxDuration) obj3, shortNewsContentCardView, 9);
            case 10:
                NafathTimerManager$observeCountdown$1 nafathTimerManager$observeCountdown$4 = new NafathTimerManager$observeCountdown$1((CustomerUnavailableViewModelV2) this.RemoteActionCompatParcelizer, this.write, (bitOffsetToIndex) obj3, shortNewsContentCardView, 10);
                int i6 = MediaDescriptionCompat + 47;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return nafathTimerManager$observeCountdown$4;
                }
                throw null;
            case 11:
                NafathTimerManager$observeCountdown$1 nafathTimerManager$observeCountdown$5 = new NafathTimerManager$observeCountdown$1(this.write, (AtomicBoolean) this.RemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, shortNewsContentCardView, 11);
                int i7 = MediaDescriptionCompat + 5;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return nafathTimerManager$observeCountdown$5;
            case 12:
                return new NafathTimerManager$observeCountdown$1(this.write, (RiderSafetyLifecycleManager) this.RemoteActionCompatParcelizer, (getCallbackId) obj3, shortNewsContentCardView, 12);
            default:
                return new NafathTimerManager$observeCountdown$1((addSingleSynchronousSubscription) this.RemoteActionCompatParcelizer, this.write, (ReviewState) obj3, shortNewsContentCardView, 13);
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$2$1$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object orRecordStartTime;
        Object objIconCompatParcelizer;
        Object routesInParallel;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        long j = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.read;
        int i3 = 6;
        final int i4 = 3;
        Object obj3 = null;
        switch (i2) {
            case 0:
                H$b h$b = (H$b) obj2;
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.serializer;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = flowCollector;
                    this.serializer = 1;
                    orRecordStartTime = h$b.getOrRecordStartTime(j, this);
                    if (orRecordStartTime != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i5 != 1) {
                    if (i5 == 2 || i5 == 3) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                orRecordStartTime = obj;
                long jLongValue = ((Number) orRecordStartTime).longValue();
                long epochSecond = ((Clock) h$b.write).instant().getEpochSecond();
                long j2 = j - epochSecond;
                if (j2 <= 0) {
                    this.RemoteActionCompatParcelizer = null;
                    this.serializer = 2;
                    if (flowCollector.emit(oe.write, this) != coroutineSingletons) {
                        return createfromparcel;
                    }
                } else {
                    Flow flow = FlowKt.read(new NafathTimerManager$start$1(j2, epochSecond - jLongValue, null));
                    this.RemoteActionCompatParcelizer = null;
                    this.serializer = 3;
                    if (FlowKt.emitAll(flowCollector, flow, this) != coroutineSingletons) {
                        return createfromparcel;
                    }
                }
                return coroutineSingletons;
            case 1:
                SizeAnimationModifierNode sizeAnimationModifierNode = (SizeAnimationModifierNode) obj2;
                TapGestureDetectorKtawaitSecondDown2 tapGestureDetectorKtawaitSecondDown2 = (TapGestureDetectorKtawaitSecondDown2) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.serializer;
                if (i6 != 0) {
                    int i7 = MediaDescriptionCompat + 123;
                    MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (i6 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objIconCompatParcelizer = obj;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Animatable animatable = tapGestureDetectorKtawaitSecondDown2.RemoteActionCompatParcelizer;
                    IntSize intSizeM3836boximpl = IntSize.m3836boximpl(j);
                    TrackpadScrollingLogic trackpadScrollingLogic = sizeAnimationModifierNode.write;
                    this.serializer = 1;
                    objIconCompatParcelizer = Animatable.IconCompatParcelizer(animatable, intSizeM3836boximpl, trackpadScrollingLogic, this, 12);
                    if (objIconCompatParcelizer == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                accessdispatchTrackpadScroll accessdispatchtrackpadscroll = ((anglek4lQ0M) objIconCompatParcelizer).read;
                accessdispatchTrackpadScroll accessdispatchtrackpadscroll2 = accessdispatchTrackpadScroll.BoundReached;
                return createfromparcel;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.serializer;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = ((DraggableNode) obj2).IconCompatParcelizer;
                Offset offsetM466boximpl = Offset.m466boximpl(j);
                this.serializer = 1;
                return r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(getcontentviewgroupparentlayout, offsetM466boximpl, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
            case 3:
                ChatUrlDataStoreHelperImpl chatUrlDataStoreHelperImpl = (ChatUrlDataStoreHelperImpl) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.serializer;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) chatUrlDataStoreHelperImpl.write).write();
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) chatUrlDataStoreHelperImpl.IconCompatParcelizer.getValue(chatUrlDataStoreHelperImpl.RemoteActionCompatParcelizer, ChatUrlDataStoreHelperImpl.serializer[0]);
                ChatLogger$log$2 chatLogger$log$2 = new ChatLogger$log$2((String) obj2, layerSnapshotV21Write, this.write, null, 1);
                this.serializer = 1;
                return performcustomexitmxy_nc0.updateData(chatLogger$log$2, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.serializer;
                if (i11 != 0) {
                    int i12 = MediaDescriptionCompat + 63;
                    int i13 = i12 % Fields.SpotShadowColor;
                    MediaBrowserCompatMediaItem = i13;
                    int i14 = i12 % 2;
                    if (i11 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i15 = i13 + 75;
                    MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    routesInParallel = ((onItemDismiss) obj).IconCompatParcelizer;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ResponseToParse responseToParse = (ResponseToParse) this.RemoteActionCompatParcelizer;
                    NnAndModelsParallelNavigationRoutesParser nnAndModelsParallelNavigationRoutesParser = (NnAndModelsParallelNavigationRoutesParser) obj2;
                    CoroutineDispatcher coroutineDispatcher = nnAndModelsParallelNavigationRoutesParser.parsingDispatcher;
                    Time$SystemClockImpl time$SystemClockImpl = nnAndModelsParallelNavigationRoutesParser.time;
                    p0 p0Var = nnAndModelsParallelNavigationRoutesParser.modelParser;
                    Time$SystemClockImpl time$SystemClockImpl2 = nnAndModelsParallelNavigationRoutesParser.logger;
                    MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper = nnAndModelsParallelNavigationRoutesParser.routeParsingTracking;
                    ?? r12 = new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY(i4) { // from class: com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$2$1$1
                        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            RouterOrigin routerOrigin;
                            DataRef dataRef = (DataRef) obj4;
                            String str = (String) obj5;
                            String str2 = (String) obj6;
                            dataRef.getClass();
                            str.getClass();
                            str2.getClass();
                            int iHashCode = str2.hashCode();
                            if (iHashCode == -1958892973) {
                                if (str2.equals("ONLINE")) {
                                    routerOrigin = RouterOrigin.ONLINE;
                                    Expected<String, List<RouteInterface>> directionsResponse = RouteParser.parseDirectionsResponse(dataRef, str, routerOrigin);
                                    directionsResponse.getClass();
                                    return directionsResponse;
                                }
                                throw new IllegalStateException(str2.concat(" origin isn't supported").toString());
                            }
                            if (iHashCode == -1845177127) {
                                if (str2.equals("CUSTOM_EXTERNAL")) {
                                    routerOrigin = RouterOrigin.CUSTOM_EXTERNAL;
                                    Expected<String, List<RouteInterface>> directionsResponse2 = RouteParser.parseDirectionsResponse(dataRef, str, routerOrigin);
                                    directionsResponse2.getClass();
                                    return directionsResponse2;
                                }
                                throw new IllegalStateException(str2.concat(" origin isn't supported").toString());
                            }
                            if (iHashCode == -830629437 && str2.equals("OFFLINE")) {
                                routerOrigin = RouterOrigin.ONBOARD;
                                Expected<String, List<RouteInterface>> directionsResponse3 = RouteParser.parseDirectionsResponse(dataRef, str, routerOrigin);
                                directionsResponse3.getClass();
                                return directionsResponse3;
                            }
                            throw new IllegalStateException(str2.concat(" origin isn't supported").toString());
                        }
                    };
                    this.serializer = 1;
                    routesInParallel = zzlq.parseRoutesInParallel(responseToParse, this.write, coroutineDispatcher, time$SystemClockImpl, p0Var, time$SystemClockImpl2, mapboxHistoryRecorderWrapper, "NN-MODELS-PARALLEL-PARSING", "NnAndModelsParallelNavigationRoutesParser#parseResponse", "SDKRouteParser#parseDirectionsResponse()", r12, this);
                    if (routesInParallel == coroutineSingletons5) {
                        int i17 = MediaDescriptionCompat + 61;
                        MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        return coroutineSingletons5;
                    }
                }
                return new onItemDismiss(routesInParallel);
            case 5:
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.serializer;
                if (i19 != 0) {
                    if (i19 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i20 = MediaBrowserCompatMediaItem + 103;
                    MediaDescriptionCompat = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        int i21 = 5 % 2;
                    }
                    return obj;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RouteProgressData routeProgressData = (RouteProgressData) onviewattachedtowindowlambda0.write;
                RouteRefresherResult routeRefresherResult = new RouteRefresherResult((NavigationRoute) onviewattachedtowindowlambda0.serializer, routeProgressData, RouteRefresherStatus$Failure.INSTANCE);
                PerseusLogger$w$1 perseusLogger$w$1 = new PerseusLogger$w$1(routeProgressData, (RouteRefresher) obj2, onviewattachedtowindowlambda0, null, 8);
                this.serializer = 1;
                Object objWithTimeoutOrDefault = CoroutineUtils.INSTANCE.withTimeoutOrDefault(this.write, routeRefresherResult, perseusLogger$w$1, this);
                if (objWithTimeoutOrDefault != coroutineSingletons6) {
                    return objWithTimeoutOrDefault;
                }
                int i22 = MediaBrowserCompatMediaItem + 15;
                MediaDescriptionCompat = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                return coroutineSingletons6;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.serializer;
                if (i24 != 0) {
                    if (i24 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getHasNonTranslationComponents gethasnontranslationcomponents = (getHasNonTranslationComponents) this.RemoteActionCompatParcelizer;
                this.serializer = 1;
                ((inCompatibilityMode) gethasnontranslationcomponents.read).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ChatLogger$log$2(gethasnontranslationcomponents, (isInvalidated) obj2, this.write, null, 0), this);
                if (objWithContext != coroutineSingletons7) {
                    int i25 = MediaDescriptionCompat + 31;
                    MediaBrowserCompatMediaItem = i25 % Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    objWithContext = createfromparcel;
                }
                if (objWithContext != coroutineSingletons7) {
                    return createfromparcel;
                }
                int i27 = MediaBrowserCompatMediaItem + 121;
                MediaDescriptionCompat = i27 % Fields.SpotShadowColor;
                if (i27 % 2 != 0) {
                    int i28 = 6 / 0;
                }
                return coroutineSingletons7;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.serializer;
                if (i29 != 0) {
                    if (i29 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getHasNonTranslationComponents gethasnontranslationcomponents2 = (getHasNonTranslationComponents) this.RemoteActionCompatParcelizer;
                this.serializer = 1;
                ((inCompatibilityMode) gethasnontranslationcomponents2.read).getClass();
                DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                Object objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ChatLogger$log$2(gethasnontranslationcomponents2, (Paragraph_EkL_Ydefault) obj2, this.write, null, 3), this);
                if (objWithContext2 != coroutineSingletons8) {
                    objWithContext2 = createfromparcel;
                }
                return objWithContext2 == coroutineSingletons8 ? coroutineSingletons8 : createfromparcel;
            case 8:
                AsyncFontListLoaderloadWithTimeoutOrNull2 asyncFontListLoaderloadWithTimeoutOrNull2 = (AsyncFontListLoaderloadWithTimeoutOrNull2) obj2;
                ConfirmationRepository confirmationRepository = (ConfirmationRepository) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.serializer;
                if (i30 != 0) {
                    if (i30 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i31 = MediaBrowserCompatMediaItem + 29;
                    MediaDescriptionCompat = i31 % Fields.SpotShadowColor;
                    if (i31 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    obj3.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object[] objArr = {(FirebaseRemoteConfigImpl) confirmationRepository.MediaBrowserCompatMediaItem, updateAdidI.IS_DELIVERY_TASKS_DATA_STORE_CACHING_ENABLED};
                if (!((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), R.serializer(), objArr)).booleanValue()) {
                    confirmationRepository.write.put(new Long(j), asyncFontListLoaderloadWithTimeoutOrNull2);
                    return createfromparcel;
                }
                AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 = confirmationRepository.serializer;
                this.serializer = 1;
                Object objAdd = animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1.read.add(AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1.read(j), resetTransientState.read.RemoteActionCompatParcelizer(AsyncFontListLoaderloadWithTimeoutOrNull2.Companion.serializer(), asyncFontListLoaderloadWithTimeoutOrNull2), this);
                if (objAdd != coroutineSingletons9) {
                    objAdd = createfromparcel;
                }
                return objAdd == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
            case 9:
                CustomerUnavailableViewModel customerUnavailableViewModel = (CustomerUnavailableViewModel) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.serializer;
                if (i32 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Vw$Vw vw$Vw = customerUnavailableViewModel.MediaSessionCompatQueueItem;
                    vw$Vw.getClass();
                    Flow flowSerializer = FlowKt.serializer((CancellableFlow) FlowKt.read(new CountDownTimer$startSystemClockCountDown$1(j, vw$Vw, null)));
                    NestViewModel$observeNestScope$1.AnonymousClass1 anonymousClass1 = new NestViewModel$observeNestScope$1.AnonymousClass1(i3, customerUnavailableViewModel);
                    this.serializer = 1;
                    if (flowSerializer.collect(anonymousClass1, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i32 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                if (!((getMaxDuration) obj2).isTimerFinished) {
                    return createfromparcel;
                }
                customerUnavailableViewModel.ParcelableVolumeInfo.read(customerUnavailableViewModel.read, (String) customerUnavailableViewModel.accessensureViewModelStore.MediaSessionCompatResultReceiverWrapper());
                return createfromparcel;
            case 10:
                CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = (CustomerUnavailableViewModelV2) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.serializer;
                if (i33 != 0) {
                    if (i33 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Vw$Vw vw$Vw2 = (Vw$Vw) customerUnavailableViewModelV2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer;
                vw$Vw2.getClass();
                Flow flow2 = FlowKt.read(new CountDownTimer$startSystemClockCountDown$1(j, vw$Vw2, null));
                NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1 = new NestViewModel$updateConfiguration$1$1$1$1(customerUnavailableViewModelV2, 7, (bitOffsetToIndex) obj2);
                this.serializer = 1;
                Object objCollect = ((AbstractFlow) flow2).collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(nestViewModel$updateConfiguration$1$1$1$1, 13), this);
                if (objCollect != coroutineSingletons11) {
                    objCollect = createfromparcel;
                }
                return objCollect == coroutineSingletons11 ? coroutineSingletons11 : createfromparcel;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.serializer;
                if (i34 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    if (DelayKt.delay(j, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i34 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                if (!((AtomicBoolean) this.RemoteActionCompatParcelizer).compareAndSet(false, true)) {
                    return createfromparcel;
                }
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(j / 1000, "Timeout=", " secs"), new Object[0]);
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(ActivityHandler261.write);
                return createfromparcel;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.serializer;
                if (i35 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    if (DelayKt.delay(j, this) != coroutineSingletons13) {
                    }
                    return coroutineSingletons13;
                }
                if (i35 != 1) {
                    int i36 = MediaDescriptionCompat + 27;
                    MediaBrowserCompatMediaItem = i36 % Fields.SpotShadowColor;
                    int i37 = i36 % 2;
                    if (i35 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "Rider safety trip is being started after delay: "), new Object[0]);
                this.serializer = 2;
                if (((RiderSafetyLifecycleManager) this.RemoteActionCompatParcelizer).startTrip((getCallbackId) obj2, this) != coroutineSingletons13) {
                    return createfromparcel;
                }
                return coroutineSingletons13;
            default:
                addSingleSynchronousSubscription addsinglesynchronoussubscription = (addSingleSynchronousSubscription) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.serializer;
                if (i38 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    addsinglesynchronoussubscription.getClass();
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(5, -1);
                    deserializeContentCard deserializecontentcard = (deserializeContentCard) addsinglesynchronoussubscription.read;
                    Object objPerformSuspending = TuplesKt.performSuspending(deserializecontentcard.IconCompatParcelizer, false, true, new TncContentKt$$ExternalSyntheticLambda1(deserializecontentcard, 21, calendar), this);
                    if (objPerformSuspending != coroutineSingletons14) {
                        objPerformSuspending = createfromparcel;
                    }
                    if (objPerformSuspending != coroutineSingletons14) {
                        objPerformSuspending = createfromparcel;
                    }
                    if (objPerformSuspending != coroutineSingletons14) {
                    }
                    return coroutineSingletons14;
                }
                if (i38 != 1) {
                    if (i38 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                changeUser changeuser = addsinglesynchronoussubscription.read;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.getClass();
                areCachedContentCardsStale arecachedcontentcardsstale = new areCachedContentCardsStale(j, (ReviewState) obj2, calendar2);
                this.serializer = 2;
                deserializeContentCard deserializecontentcard2 = (deserializeContentCard) changeuser;
                Object objPerformSuspending2 = TuplesKt.performSuspending(deserializecontentcard2.IconCompatParcelizer, false, true, new TncContentKt$$ExternalSyntheticLambda1(deserializecontentcard2, 22, arecachedcontentcardsstale), this);
                if (objPerformSuspending2 != coroutineSingletons14) {
                    objPerformSuspending2 = createfromparcel;
                }
                if (objPerformSuspending2 != coroutineSingletons14) {
                    return createfromparcel;
                }
                return coroutineSingletons14;
        }
    }
}
