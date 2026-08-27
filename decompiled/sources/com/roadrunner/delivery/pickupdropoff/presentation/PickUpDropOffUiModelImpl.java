package com.roadrunner.delivery.pickupdropoff.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.delivery.pickupdropoff.api.PickUpDropOffUiModel;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ComposableSingletonsComposeViewAdapter_androidKt;
import o.ComposeViewAdapterFakeSavedStateRegistryOwner1;
import o.TextGeometricTransformKt;
import o.createFromParcel;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getQueryContext;
import o.isNullGroup;
import o.isStateSaved;
import o.lerpMdfbLM;
import o.performCreate;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg;
import o.r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA;

/* JADX INFO: loaded from: classes3.dex */
public final class PickUpDropOffUiModelImpl implements PickUpDropOffUiModel {
    private static int ComponentActivity = 1;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final MutableStateFlow IconCompatParcelizer;
    public final ComposableSingletonsComposeViewAdapter_androidKt MediaBrowserCompatMediaItem;
    public final ObservePuDoDeliveriesResponseImpl MediaDescriptionCompat;
    public final isNullGroup MediaMetadataCompat;
    public final ContextScope MediaSessionCompatQueueItem;
    public final lerpMdfbLM MediaSessionCompatResultReceiverWrapper;
    public final performCreate MediaSessionCompatToken;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ParcelableVolumeInfo;
    public final MutableStateFlow PlaybackStateCompat;
    public final r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA PlaybackStateCompatCustomAction;
    public final MutableStateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final UpdateStateUseCaseImpl r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getQueryContext read;
    public final isStateSaved serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ComponentActivity + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3;
        int i4 = i2 % 2;
        MutableStateFlow mutableStateFlow = this.RatingCompat;
        int i5 = i3 + 121;
        ComponentActivity = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public PickUpDropOffUiModelImpl(ContextScope contextScope, ObservePuDoDeliveriesResponseImpl observePuDoDeliveriesResponseImpl, UpdateStateUseCaseImpl updateStateUseCaseImpl, r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA r8lambdatoejz8ebqikfdbp_lhyd8cduqfa, isNullGroup isnullgroup, lerpMdfbLM lerpmdfblm, isStateSaved isstatesaved, performCreate performcreate, ComposableSingletonsComposeViewAdapter_androidKt composableSingletonsComposeViewAdapter_androidKt, getQueryContext getquerycontext) {
        this.MediaSessionCompatQueueItem = contextScope;
        this.MediaDescriptionCompat = observePuDoDeliveriesResponseImpl;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = updateStateUseCaseImpl;
        this.PlaybackStateCompatCustomAction = r8lambdatoejz8ebqikfdbp_lhyd8cduqfa;
        this.MediaMetadataCompat = isnullgroup;
        this.MediaSessionCompatResultReceiverWrapper = lerpmdfblm;
        this.serializer = isstatesaved;
        this.MediaSessionCompatToken = performcreate;
        this.MediaBrowserCompatMediaItem = composableSingletonsComposeViewAdapter_androidKt;
        this.read = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(SmallPersistentVector.RemoteActionCompatParcelizer);
        this.write = mutableStateFlow;
        this.PlaybackStateCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg.serializer;
        r8lambdauemxp1whxmekjnoforsh61ohmwg.getClass();
        this.RemoteActionCompatParcelizer = StateFlowKt.read(r8lambdauemxp1whxmekjnoforsh61ohmwg);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 12), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r1 r3
  0x002e: PHI (r1v12 o.ComposeViewAdapterFakeSavedStateRegistryOwner1) = (r1v11 o.ComposeViewAdapterFakeSavedStateRegistryOwner1), (r1v14 o.ComposeViewAdapterFakeSavedStateRegistryOwner1) binds: [B:10:0x002c, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x002e: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:10:0x002c, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public static final Object access$reloadState(PickUpDropOffUiModelImpl pickUpDropOffUiModelImpl, ContinuationImpl continuationImpl) {
        ComposeViewAdapterFakeSavedStateRegistryOwner1 composeViewAdapterFakeSavedStateRegistryOwner1;
        int i;
        int i2 = 2 % 2;
        pickUpDropOffUiModelImpl.getClass();
        if (continuationImpl instanceof ComposeViewAdapterFakeSavedStateRegistryOwner1) {
            int i3 = ComponentActivity + 87;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                composeViewAdapterFakeSavedStateRegistryOwner1 = (ComposeViewAdapterFakeSavedStateRegistryOwner1) continuationImpl;
                i = composeViewAdapterFakeSavedStateRegistryOwner1.RemoteActionCompatParcelizer;
                int i4 = 44 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    composeViewAdapterFakeSavedStateRegistryOwner1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    composeViewAdapterFakeSavedStateRegistryOwner1 = new ComposeViewAdapterFakeSavedStateRegistryOwner1(pickUpDropOffUiModelImpl, continuationImpl);
                }
            } else {
                composeViewAdapterFakeSavedStateRegistryOwner1 = (ComposeViewAdapterFakeSavedStateRegistryOwner1) continuationImpl;
                i = composeViewAdapterFakeSavedStateRegistryOwner1.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    composeViewAdapterFakeSavedStateRegistryOwner1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    composeViewAdapterFakeSavedStateRegistryOwner1 = new ComposeViewAdapterFakeSavedStateRegistryOwner1(pickUpDropOffUiModelImpl, continuationImpl);
                }
            }
        } else {
            composeViewAdapterFakeSavedStateRegistryOwner1 = new ComposeViewAdapterFakeSavedStateRegistryOwner1(pickUpDropOffUiModelImpl, continuationImpl);
        }
        Object objFirst = composeViewAdapterFakeSavedStateRegistryOwner1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = composeViewAdapterFakeSavedStateRegistryOwner1.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = ComponentActivity + 121;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowWrite = TuplesKt.write(UpdateStateUseCaseImpl.write(pickUpDropOffUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY));
            SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(6);
            composeViewAdapterFakeSavedStateRegistryOwner1.RemoteActionCompatParcelizer = 1;
            objFirst = FlowKt.first(flowWrite, signInDataStore$clear$2, composeViewAdapterFakeSavedStateRegistryOwner1);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) objFirst;
        if (getoptimizationlevel instanceof getMaxWidth) {
            pickUpDropOffUiModelImpl.read.serializer(new TextGeometricTransformKt(((getMaxWidth) getoptimizationlevel).write()));
        }
        return createFromParcel.INSTANCE;
    }
}
