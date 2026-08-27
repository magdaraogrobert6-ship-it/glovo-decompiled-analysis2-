package com.roadrunner.delivery.pickupdropoff.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.api.PickupDropOffSingleDeliveryUiModel;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ComposableSingletonsComposeViewAdapter_androidKt;
import o.ComposeViewAdapterfindAndTrackAnimations1;
import o.ShortNewsContentCardView;
import o.TextGeometricTransformKt;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getQueryContext;
import o.isNullGroup;
import o.lerpMdfbLM;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA;

/* JADX INFO: loaded from: classes3.dex */
public final class PickupDropOffSingleDeliveryUiModelImpl implements PickupDropOffSingleDeliveryUiModel {
    private static int PlaybackStateCompatCustomAction = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final ContextScope IconCompatParcelizer;
    public final isNullGroup MediaBrowserCompatMediaItem;
    public final MutableStateFlow MediaDescriptionCompat;
    public final MutableStateFlow MediaMetadataCompat;
    public final ObservePuDoDeliveriesResponseImpl MediaSessionCompatQueueItem;
    public final UpdateStateUseCaseImpl MediaSessionCompatResultReceiverWrapper;
    public final lerpMdfbLM MediaSessionCompatToken;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ParcelableVolumeInfo;
    public final r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA PlaybackStateCompat;
    public final long RatingCompat;
    public final ComposableSingletonsComposeViewAdapter_androidKt RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 1;
        private static int write;
        public int RemoteActionCompatParcelizer;
        public final /* synthetic */ PickupDropOffSingleDeliveryUiModelImpl read;
        public final /* synthetic */ int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.read = pickupDropOffSingleDeliveryUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = write + 85;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.serializer;
            PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl = this.read;
            if (i4 != 0) {
                return new AnonymousClass1(pickupDropOffSingleDeliveryUiModelImpl, shortNewsContentCardView, 1);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pickupDropOffSingleDeliveryUiModelImpl, shortNewsContentCardView, 0);
            int i5 = IconCompatParcelizer + 51;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = write + 63;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            int i3 = this.serializer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i3 != 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = IconCompatParcelizer + 97;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl = this.read;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i2 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.RemoteActionCompatParcelizer;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SharedFlowImpl sharedFlowImpl = pickupDropOffSingleDeliveryUiModelImpl.PlaybackStateCompat.write;
                    DeliveryNotesUiModelImpl.AnonymousClass1 anonymousClass1 = new DeliveryNotesUiModelImpl.AnonymousClass1(pickupDropOffSingleDeliveryUiModelImpl, shortNewsContentCardView, 28);
                    this.RemoteActionCompatParcelizer = 1;
                    if (FlowKt.collectLatest(sharedFlowImpl, anonymousClass1, this) != coroutineSingletons) {
                        return createfromparcel;
                    }
                    int i4 = IconCompatParcelizer + 7;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        int i5 = 97 / 0;
                    }
                    return coroutineSingletons;
                }
                int i6 = IconCompatParcelizer;
                int i7 = i6 + 37;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0 ? i3 != 1 : i3 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = i6 + 83;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.RemoteActionCompatParcelizer;
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                HeatmapDataStore$get$$inlined$map$1 heatmapDataStore$get$$inlined$map$1Write = pickupDropOffSingleDeliveryUiModelImpl.MediaSessionCompatQueueItem.write();
                SwitcherUiModelImpl$1.AnonymousClass1 anonymousClass2 = new SwitcherUiModelImpl$1.AnonymousClass1(pickupDropOffSingleDeliveryUiModelImpl, shortNewsContentCardView, 18);
                this.RemoteActionCompatParcelizer = 1;
                if (FlowKt.collectLatest(heatmapDataStore$get$$inlined$map$1Write, anonymousClass2, this) != coroutineSingletons2) {
                    return createfromparcel;
                }
                int i10 = write + 95;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 87 / 0;
                }
                return coroutineSingletons2;
            }
            int i12 = write + 33;
            int i13 = i12 % Fields.SpotShadowColor;
            IconCompatParcelizer = i13;
            if (i12 % 2 != 0 ? i9 != 1 : i9 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i14 = write + 85;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return null;
            }
            int i16 = i13 + 79;
            write = i16 % Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i17 = 11 / 0;
            return createfromparcel;
        }
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 63;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3;
        int i4 = i2 % 2;
        MutableStateFlow mutableStateFlow = this.MediaDescriptionCompat;
        int i5 = i3 + 21;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public PickupDropOffSingleDeliveryUiModelImpl(ContextScope contextScope, long j, ObservePuDoDeliveriesResponseImpl observePuDoDeliveriesResponseImpl, UpdateStateUseCaseImpl updateStateUseCaseImpl, r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA r8lambdatoejz8ebqikfdbp_lhyd8cduqfa, isNullGroup isnullgroup, lerpMdfbLM lerpmdfblm, ComposableSingletonsComposeViewAdapter_androidKt composableSingletonsComposeViewAdapter_androidKt, getQueryContext getquerycontext) {
        this.IconCompatParcelizer = contextScope;
        this.RatingCompat = j;
        this.MediaSessionCompatQueueItem = observePuDoDeliveriesResponseImpl;
        this.MediaSessionCompatResultReceiverWrapper = updateStateUseCaseImpl;
        this.PlaybackStateCompat = r8lambdatoejz8ebqikfdbp_lhyd8cduqfa;
        this.MediaBrowserCompatMediaItem = isnullgroup;
        this.MediaSessionCompatToken = lerpmdfblm;
        this.RemoteActionCompatParcelizer = composableSingletonsComposeViewAdapter_androidKt;
        this.read = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.write = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public static final Object access$reloadState(PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl, ContinuationImpl continuationImpl) {
        ComposeViewAdapterfindAndTrackAnimations1 composeViewAdapterfindAndTrackAnimations1;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = 7;
        int i4 = PlaybackStateCompatCustomAction + 7;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 % 2 == 0) {
            pickupDropOffSingleDeliveryUiModelImpl.getClass();
            boolean z = continuationImpl instanceof ComposeViewAdapterfindAndTrackAnimations1;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        pickupDropOffSingleDeliveryUiModelImpl.getClass();
        if (continuationImpl instanceof ComposeViewAdapterfindAndTrackAnimations1) {
            composeViewAdapterfindAndTrackAnimations1 = (ComposeViewAdapterfindAndTrackAnimations1) continuationImpl;
            int i5 = composeViewAdapterfindAndTrackAnimations1.read;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 57;
                PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                composeViewAdapterfindAndTrackAnimations1.read = i5 - Integer.MIN_VALUE;
            } else {
                composeViewAdapterfindAndTrackAnimations1 = new ComposeViewAdapterfindAndTrackAnimations1(pickupDropOffSingleDeliveryUiModelImpl, continuationImpl);
            }
        } else {
            composeViewAdapterfindAndTrackAnimations1 = new ComposeViewAdapterfindAndTrackAnimations1(pickupDropOffSingleDeliveryUiModelImpl, continuationImpl);
        }
        Object objFirst = composeViewAdapterfindAndTrackAnimations1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = composeViewAdapterfindAndTrackAnimations1.read;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowWrite = TuplesKt.write(UpdateStateUseCaseImpl.write(pickupDropOffSingleDeliveryUiModelImpl.MediaSessionCompatResultReceiverWrapper));
            SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i, i3, shortNewsContentCardView);
            composeViewAdapterfindAndTrackAnimations1.read = 1;
            objFirst = FlowKt.first(flowWrite, signInDataStore$clear$2, composeViewAdapterfindAndTrackAnimations1);
            if (objFirst == coroutineSingletons) {
                int i9 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 109;
                PlaybackStateCompatCustomAction = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 9 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        }
        getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) objFirst;
        if (getoptimizationlevel instanceof getMaxWidth) {
            pickupDropOffSingleDeliveryUiModelImpl.read.serializer(new TextGeometricTransformKt(((getMaxWidth) getoptimizationlevel).write()));
        }
        return createFromParcel.INSTANCE;
    }
}
