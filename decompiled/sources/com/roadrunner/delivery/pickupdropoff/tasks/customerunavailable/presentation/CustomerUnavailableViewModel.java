package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.w$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.UtccTaskStateRepositoryImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.IvrState;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.navigator.CustomerUnavailableArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.ui.common.base.BaseRxViewModel;
import io.grpc.internal.SharedResourcePool;
import java.time.Clock;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.BrazeExternalSyntheticLambda28;
import o.JoinedKey;
import o.ShortNewsContentCardView;
import o.addAnimationslambda100;
import o.boundsOfLayoutNode;
import o.createFromParcel;
import o.getBitmapui_graphics;
import o.getCompared;
import o.getMaxDuration;
import o.getMaxDurationPerIterationMillis;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getPivotOffsetF1C5BW0;
import o.getPlatformStyle;
import o.getPositionannotations;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.localeSpan;
import o.makeTreedefault;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc;
import o.searchAny;
import o.setClockTimes;
import o.toBitmapConfig1JJdX4A;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableViewModel extends BaseRxViewModel {
    private static int addObserverForBackInvoker = 0;
    private static int getOnBackPressedInput = 1;
    public final GetTaskByTypeAndIdUseCaseImpl ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final getPlatformStyle MediaBrowserCompatMediaItem;
    public final InitiateTransferChangeUseCase MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public final Vw$Vw MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final CustomerChatCommunicatorImpl MediaSessionCompatToken;
    public final DeliveryConfirmationLoggerImpl ParcelableVolumeInfo;
    public final isAdapterPositionOnScreen PlaybackStateCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU PlaybackStateCompatCustomAction;
    public final Clock RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen ResultReceiver;
    public final StateFlow _init_lambda1;
    public final UnifiedPhoneCallerImpl _init_lambda2;
    public final BrazeExternalSyntheticLambda28 _init_lambda3;
    public final StateFlow _init_lambda4;
    public final isAdapterPositionOnScreen accessensureViewModelStore;
    public final UpdateTaskUseCaseImpl addObserverForBackInvokerlambda0;
    public final UpdateStateUseCaseImpl createFullyDrawnExecutor;
    public final UtccTaskStateRepositoryImpl defaultViewModelProviderFactory_delegatelambda0;
    public final boolean ensureViewModelStore;
    public final GetDeliveryAnalyticsUseCaseImpl r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final isOpenInternalroom_runtime r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final InitiateTransferChangeUseCase r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final NetworkErrorMapperImpl r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final SharedResourcePool r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final ObservePuDoDeliveriesResponseImpl r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final InitiateTransferChangeUseCase r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final StateFlow r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final g0 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final localeSpan r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final Parser.Pair r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final getBitmapui_graphics r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final SendTestPushUseCase r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public getPositionannotations read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i | i2));
        int i11 = ~(i7 | i9);
        int i12 = i | i11;
        int i13 = (~(i2 | i6)) | i11 | (~(i8 | i6));
        int i14 = i6 + i + i3 + (296844165 * i5) + (1729652556 * i4);
        int i15 = i14 * i14;
        int i16 = ((i6 * 599922083) - 580124672) + (599922083 * i) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i3) + ((-279707648) * i5) + ((-265289728) * i4) + (2117271552 * i15);
        int i17 = (i6 * (-1181628991)) + 1322814002 + (i * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i3 * (-1181629109)) + (i5 * (-698251017)) + (i4 * 1773125444) + (i15 * 938541056);
        int i18 = i16 + (i17 * i17 * (-109772800));
        if (i18 == 1) {
            return serializer(objArr);
        }
        if (i18 == 2) {
            return write(objArr);
        }
        CustomerUnavailableViewModel customerUnavailableViewModel = (CustomerUnavailableViewModel) objArr[0];
        int i19 = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModel), null, null, new CustomerUnavailableViewModel$initState$1(customerUnavailableViewModel, null, 0), 3);
        int i20 = addObserverForBackInvoker + 53;
        getOnBackPressedInput = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
        return null;
    }

    public final SharedResourcePool read() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvoker;
        int i3 = i2 + 37;
        getOnBackPressedInput = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedResourcePool sharedResourcePool = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int i5 = i2 + 95;
        getOnBackPressedInput = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return sharedResourcePool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomerUnavailableViewModel(getBitmapui_graphics getbitmapui_graphics, SharedResourcePool sharedResourcePool, GetTaskByTypeAndIdUseCaseImpl getTaskByTypeAndIdUseCaseImpl, CustomerChatCommunicatorImpl customerChatCommunicatorImpl, UnifiedPhoneCallerImpl unifiedPhoneCallerImpl, Vw$Vw vw$Vw, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, localeSpan localespan, getPlatformStyle getplatformstyle, isOpenInternalroom_runtime isopeninternalroom_runtime, UtccTaskStateRepositoryImpl utccTaskStateRepositoryImpl, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, InitiateTransferChangeUseCase initiateTransferChangeUseCase, InitiateTransferChangeUseCase initiateTransferChangeUseCase2, InitiateTransferChangeUseCase initiateTransferChangeUseCase3, UpdateStateUseCaseImpl updateStateUseCaseImpl, g0 g0Var, Clock clock, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, getMaxDurationPerIterationMillis getmaxdurationperiterationmillis, SendTestPushUseCase sendTestPushUseCase, Parser.Pair pair, ObservePuDoDeliveriesResponseImpl observePuDoDeliveriesResponseImpl, NetworkErrorMapperImpl networkErrorMapperImpl, getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0) {
        super(getpivotoffsetf1c5bw0);
        getbitmapui_graphics.getClass();
        sharedResourcePool.getClass();
        getTaskByTypeAndIdUseCaseImpl.getClass();
        customerChatCommunicatorImpl.getClass();
        unifiedPhoneCallerImpl.getClass();
        vw$Vw.getClass();
        updateTaskUseCaseImpl.getClass();
        deliveryConfirmationLoggerImpl.getClass();
        localespan.getClass();
        getplatformstyle.getClass();
        isopeninternalroom_runtime.getClass();
        utccTaskStateRepositoryImpl.getClass();
        getDeliveryAnalyticsUseCaseImpl.getClass();
        initiateTransferChangeUseCase.getClass();
        initiateTransferChangeUseCase2.getClass();
        initiateTransferChangeUseCase3.getClass();
        updateStateUseCaseImpl.getClass();
        g0Var.getClass();
        clock.getClass();
        brazeExternalSyntheticLambda28.getClass();
        getmaxdurationperiterationmillis.getClass();
        sendTestPushUseCase.getClass();
        pair.getClass();
        observePuDoDeliveriesResponseImpl.getClass();
        networkErrorMapperImpl.getClass();
        getpivotoffsetf1c5bw0.getClass();
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = getbitmapui_graphics;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = sharedResourcePool;
        this.ComponentActivity = getTaskByTypeAndIdUseCaseImpl;
        this.MediaSessionCompatToken = customerChatCommunicatorImpl;
        this._init_lambda2 = unifiedPhoneCallerImpl;
        this.MediaSessionCompatQueueItem = vw$Vw;
        this.addObserverForBackInvokerlambda0 = updateTaskUseCaseImpl;
        this.ParcelableVolumeInfo = deliveryConfirmationLoggerImpl;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = localespan;
        this.MediaBrowserCompatMediaItem = getplatformstyle;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = isopeninternalroom_runtime;
        this.defaultViewModelProviderFactory_delegatelambda0 = utccTaskStateRepositoryImpl;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getDeliveryAnalyticsUseCaseImpl;
        this.MediaDescriptionCompat = initiateTransferChangeUseCase;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = initiateTransferChangeUseCase2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = initiateTransferChangeUseCase3;
        this.createFullyDrawnExecutor = updateStateUseCaseImpl;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = g0Var;
        this.RatingCompat = clock;
        this._init_lambda3 = brazeExternalSyntheticLambda28;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = sendTestPushUseCase;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = pair;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = observePuDoDeliveriesResponseImpl;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = networkErrorMapperImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.write = mutableStateFlow;
        this._init_lambda1 = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.TRUE);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = mutableStateFlow2;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(null);
        this.serializer = mutableStateFlow3;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow3;
        MutableStateFlow mutableStateFlow4 = StateFlowKt.read(null);
        this.IconCompatParcelizer = mutableStateFlow4;
        this._init_lambda4 = mutableStateFlow4;
        boolean zIconCompatParcelizer = false;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ CustomerUnavailableViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = read + 57;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                Object obj = null;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i3 = objArr;
                CustomerUnavailableViewModel customerUnavailableViewModel = this.serializer;
                if (i3 == 0) {
                    Object objWrite = customerUnavailableViewModel.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write("customer_unavailable");
                    if (objWrite == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("customer unavailable args should never be null");
                        return null;
                    }
                    int i4 = read + 113;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return (CustomerUnavailableArgs) objWrite;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (i3 == 1) {
                    Long lValueOf = Long.valueOf(((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).serializer);
                    int i5 = IconCompatParcelizer + 125;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return lValueOf;
                }
                if (i3 != 2) {
                    return ((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer;
                }
                String str = ((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).write;
                int i7 = read + 35;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return str;
            }
        });
        final int i = 1;
        this.PlaybackStateCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ CustomerUnavailableViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = read + 57;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                Object obj = null;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i4 = i;
                CustomerUnavailableViewModel customerUnavailableViewModel = this.serializer;
                if (i4 == 0) {
                    Object objWrite = customerUnavailableViewModel.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write("customer_unavailable");
                    if (objWrite == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("customer unavailable args should never be null");
                        return null;
                    }
                    int i5 = read + 113;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return (CustomerUnavailableArgs) objWrite;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (i4 == 1) {
                    Long lValueOf = Long.valueOf(((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).serializer);
                    int i6 = IconCompatParcelizer + 125;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return lValueOf;
                }
                if (i4 != 2) {
                    return ((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer;
                }
                String str = ((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).write;
                int i8 = read + 35;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return str;
            }
        });
        final int i2 = 2;
        this.ResultReceiver = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ CustomerUnavailableViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 57;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                Object obj = null;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i2;
                CustomerUnavailableViewModel customerUnavailableViewModel = this.serializer;
                if (i5 == 0) {
                    Object objWrite = customerUnavailableViewModel.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write("customer_unavailable");
                    if (objWrite == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("customer unavailable args should never be null");
                        return null;
                    }
                    int i6 = read + 113;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return (CustomerUnavailableArgs) objWrite;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (i5 == 1) {
                    Long lValueOf = Long.valueOf(((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).serializer);
                    int i7 = IconCompatParcelizer + 125;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return lValueOf;
                }
                if (i5 != 2) {
                    return ((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer;
                }
                String str = ((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).write;
                int i9 = read + 35;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return str;
            }
        });
        final int i3 = 3;
        this.accessensureViewModelStore = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ CustomerUnavailableViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = read + 57;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                Object obj = null;
                if (i5 % 2 == 0) {
                    throw null;
                }
                int i6 = i3;
                CustomerUnavailableViewModel customerUnavailableViewModel = this.serializer;
                if (i6 == 0) {
                    Object objWrite = customerUnavailableViewModel.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write("customer_unavailable");
                    if (objWrite == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("customer unavailable args should never be null");
                        return null;
                    }
                    int i7 = read + 113;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        return (CustomerUnavailableArgs) objWrite;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (i6 == 1) {
                    Long lValueOf = Long.valueOf(((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).serializer);
                    int i8 = IconCompatParcelizer + 125;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return lValueOf;
                }
                if (i6 != 2) {
                    return ((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer;
                }
                String str = ((CustomerUnavailableArgs) customerUnavailableViewModel.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).write;
                int i10 = read + 35;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return str;
            }
        });
        FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = ((FirebaseRemoteConfigImpl) getmaxdurationperiterationmillis.serializer).IconCompatParcelizer;
        if (!firebaseRemoteConfigProvider.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_UNAVAILABLE_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
            zIconCompatParcelizer = firebaseRemoteConfigProvider.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_UNAVAILABLE_TAKE_PHOTO_KILLSWITCH_ENABLED.getFirebaseFlagName());
            int i4 = getOnBackPressedInput + 35;
            addObserverForBackInvoker = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.ensureViewModelStore = !zIconCompatParcelizer;
        int i7 = getOnBackPressedInput + 65;
        addObserverForBackInvoker = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    public final long IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = getOnBackPressedInput + 103;
        addObserverForBackInvoker = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((Number) this.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()).longValue();
            throw null;
        }
        long jLongValue = ((Number) this.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper()).longValue();
        int i3 = getOnBackPressedInput + 9;
        addObserverForBackInvoker = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return jLongValue;
        }
        obj.hashCode();
        throw null;
    }

    public static Map write(String str, Map map) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvoker + 9;
        getOnBackPressedInput = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return map;
        }
        Map mapSerializer = onMove.serializer(map, new onViewAttachedToWindowlambda0(str, Boolean.TRUE));
        int i3 = getOnBackPressedInput + 17;
        addObserverForBackInvoker = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return mapSerializer;
    }

    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new CustomerUnavailableViewModel$initState$1(this, shortNewsContentCardView, 5), 3);
        int i2 = getOnBackPressedInput + 59;
        addObserverForBackInvoker = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    public final void MediaMetadataCompat() {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new CustomerUnavailableViewModel$initState$1(this, shortNewsContentCardView, 4), 3);
        int i2 = addObserverForBackInvoker + 97;
        getOnBackPressedInput = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new QrCodeScanTaskUiModelImpl$1(this, null, 14), 3);
        int i2 = getOnBackPressedInput + 113;
        addObserverForBackInvoker = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        String str;
        r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc;
        getCompared getcompared;
        int i = 0;
        CustomerUnavailableViewModel customerUnavailableViewModel = (CustomerUnavailableViewModel) objArr[0];
        int i2 = 2 % 2;
        int i3 = getOnBackPressedInput + 5;
        addObserverForBackInvoker = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        makeTreedefault maketreedefault = (makeTreedefault) customerUnavailableViewModel._init_lambda1.read();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (maketreedefault == null || (r8lambdakx1augmjk4nknxfqvyytyqzkc = maketreedefault.customerData) == null || (getcompared = r8lambdakx1augmjk4nknxfqvyytyqzkc.customerCall) == null) {
            str = null;
        } else {
            int i5 = getOnBackPressedInput + 11;
            addObserverForBackInvoker = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            str = getcompared.MediaSessionCompatQueueItem;
            int i7 = addObserverForBackInvoker + 35;
            getOnBackPressedInput = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModel), null, null, new CustomerUnavailableViewModel$updateCallInitiated$1(customerUnavailableViewModel, str, shortNewsContentCardView, i), 3);
        int i9 = getOnBackPressedInput + 115;
        addObserverForBackInvoker = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c A[PHI: r1
  0x003c: PHI (r1v13 o.JoinedKey) = (r1v12 o.JoinedKey), (r1v14 o.JoinedKey) binds: [B:12:0x003a, B:9:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    public final void PlaybackStateCompatCustomAction() {
        String str;
        JoinedKey joinedKey;
        int i = 2 % 2;
        int i2 = addObserverForBackInvoker + 95;
        getOnBackPressedInput = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        makeTreedefault maketreedefault = (makeTreedefault) this._init_lambda1.read();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (maketreedefault != null) {
            int i4 = addObserverForBackInvoker + 3;
            getOnBackPressedInput = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc = maketreedefault.customerData;
            if (r8lambdakx1augmjk4nknxfqvyytyqzkc != null) {
                int i6 = getOnBackPressedInput + 91;
                addObserverForBackInvoker = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    joinedKey = r8lambdakx1augmjk4nknxfqvyytyqzkc.customerChat;
                    int i7 = 28 / 0;
                    if (joinedKey != null) {
                        str = joinedKey.id;
                    } else {
                        int i8 = getOnBackPressedInput + 63;
                        addObserverForBackInvoker = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        str = null;
                    }
                } else {
                    joinedKey = r8lambdakx1augmjk4nknxfqvyytyqzkc.customerChat;
                    if (joinedKey != null) {
                        str = joinedKey.id;
                    } else {
                        int i10 = getOnBackPressedInput + 63;
                        addObserverForBackInvoker = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        str = null;
                    }
                }
            } else {
                int i12 = getOnBackPressedInput + 63;
                addObserverForBackInvoker = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                str = null;
            }
        } else {
            int i14 = getOnBackPressedInput + 63;
            addObserverForBackInvoker = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            str = null;
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new CustomerUnavailableViewModel$updateCallInitiated$1(this, str, shortNewsContentCardView, 1), 3);
    }

    public final void write(IvrState ivrState, String str) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        getMaxDuration getmaxdurationRemoteActionCompatParcelizer;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.serializer;
            obj = mutableStateFlow.read();
            getMaxDuration getmaxduration = (getMaxDuration) obj;
            if (getmaxduration != null) {
                int i2 = addObserverForBackInvoker + 37;
                getOnBackPressedInput = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                getmaxdurationRemoteActionCompatParcelizer = getMaxDuration.RemoteActionCompatParcelizer(getmaxduration, false, false, null, null, ivrState, write(str, getmaxduration.tasksStatus), 63);
            } else {
                int i4 = getOnBackPressedInput + 1;
                addObserverForBackInvoker = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getmaxdurationRemoteActionCompatParcelizer = null;
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, getmaxdurationRemoteActionCompatParcelizer));
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        Long l;
        CustomerUnavailableViewModel customerUnavailableViewModel = (CustomerUnavailableViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = getOnBackPressedInput + 31;
        addObserverForBackInvoker = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getMaxDuration getmaxduration = (getMaxDuration) customerUnavailableViewModel.MediaSessionCompatResultReceiverWrapper.read();
        if (getmaxduration != null && !getmaxduration.isCallInitiated && (l = getmaxduration.firstOpenedTimeStamp) != null) {
            long jLongValue = l.longValue();
            Long l2 = (Long) customerUnavailableViewModel.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer.get(Long.valueOf(customerUnavailableViewModel.IconCompatParcelizer()));
            if (l2 != null) {
                int i4 = addObserverForBackInvoker + 27;
                getOnBackPressedInput = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (jLongValue < l2.longValue()) {
                    int i6 = addObserverForBackInvoker + 97;
                    getOnBackPressedInput = i6 % Fields.SpotShadowColor;
                    return i6 % 2 == 0 ? true : true;
                }
            }
        }
        return false;
    }

    public final boolean MediaSessionCompatQueueItem() {
        Long l;
        int i = 2 % 2;
        getMaxDuration getmaxduration = (getMaxDuration) this.MediaSessionCompatResultReceiverWrapper.read();
        if (getmaxduration == null || getmaxduration.isChatInitiated || (l = getmaxduration.firstOpenedTimeStamp) == null) {
            return false;
        }
        int i2 = addObserverForBackInvoker + 59;
        getOnBackPressedInput = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jLongValue = l.longValue();
        Long l2 = (Long) this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer.get(Long.valueOf(IconCompatParcelizer()));
        if (l2 == null) {
            return false;
        }
        int i4 = addObserverForBackInvoker + 39;
        getOnBackPressedInput = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (jLongValue >= l2.longValue()) {
            return false;
        }
        int i6 = getOnBackPressedInput + 111;
        addObserverForBackInvoker = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    public static final void IconCompatParcelizer(CustomerUnavailableViewModel customerUnavailableViewModel) {
        String str;
        Iterator it;
        Object next;
        int i = 2;
        int i2 = 2 % 2;
        makeTreedefault maketreedefault = (makeTreedefault) customerUnavailableViewModel._init_lambda1.read();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (maketreedefault != null) {
            int i3 = getOnBackPressedInput + 57;
            addObserverForBackInvoker = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            List list = maketreedefault.components;
            if (list != null) {
                int i5 = getOnBackPressedInput + 27;
                addObserverForBackInvoker = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    it = list.iterator();
                    int i6 = 19 / 0;
                } else {
                    it = list.iterator();
                }
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof boundsOfLayoutNode));
                boundsOfLayoutNode boundsoflayoutnode = (boundsOfLayoutNode) next;
                if (boundsoflayoutnode != null) {
                    int i7 = addObserverForBackInvoker + 73;
                    getOnBackPressedInput = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    str = boundsoflayoutnode.id;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModel), null, null, new CustomerUnavailableViewModel$updateCallInitiated$1(customerUnavailableViewModel, str, shortNewsContentCardView, i), 3);
        int i9 = getOnBackPressedInput + 3;
        addObserverForBackInvoker = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v7 o.makeTreedefault) = (r1v6 o.makeTreedefault), (r1v29 o.makeTreedefault) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r4 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r4 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        r1 = r1 + 93;
        com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.getOnBackPressedInput = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean write() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.getOnBackPressedInput
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.addObserverForBackInvoker = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L1e
            kotlinx.coroutines.flow.MutableStateFlow r1 = r7.write
            java.lang.Object r1 = r1.read()
            o.makeTreedefault r1 = (o.makeTreedefault) r1
            r4 = 58
            int r4 = r4 / r2
            if (r1 == 0) goto L5a
            goto L28
        L1e:
            kotlinx.coroutines.flow.MutableStateFlow r1 = r7.write
            java.lang.Object r1 = r1.read()
            o.makeTreedefault r1 = (o.makeTreedefault) r1
            if (r1 == 0) goto L5a
        L28:
            java.util.List r1 = r1.components
            if (r1 == 0) goto L5a
            int r4 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.addObserverForBackInvoker
            int r4 = r4 + 29
            int r5 = r4 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.getOnBackPressedInput = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L41
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r4 = 27
            int r4 = r4 / r2
            goto L47
        L41:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r1.next()
            boolean r5 = r4 instanceof o.asTree
            if (r5 == 0) goto L47
            goto L57
        L56:
            r4 = r3
        L57:
            o.asTree r4 = (o.asTree) r4
            goto L5b
        L5a:
            r4 = r3
        L5b:
            com.roadrunner.diagnostics.domain.SendTestPushUseCase r1 = r7.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0
            java.lang.Object r1 = r1.serializer
            o.r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI r1 = (o.r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI) r1
            o.transferSessionPackageI r1 = r1.serializer
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r1 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r1
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider r1 = r1.IconCompatParcelizer
            o.updateAdidI r5 = o.updateAdidI.IS_CUSTOMER_UNAVAILABLE_IVR_CALL_KILLSWITCH_ENABLED
            java.lang.String r5 = r5.getFirebaseFlagName()
            boolean r1 = r1.IconCompatParcelizer(r5)
            if (r1 != 0) goto L8f
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.addObserverForBackInvoker
            int r5 = r1 + 41
            int r6 = r5 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.getOnBackPressedInput = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L84
            r5 = 54
            int r5 = r5 / r2
            if (r4 == 0) goto L8f
            goto L86
        L84:
            if (r4 == 0) goto L8f
        L86:
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.getOnBackPressedInput = r2
            int r1 = r1 % r0
            r0 = 1
            return r0
        L8f:
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.addObserverForBackInvoker
            int r1 = r1 + 107
            int r4 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.getOnBackPressedInput = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L9b
            return r2
        L9b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel.write():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    public final int RemoteActionCompatParcelizer() {
        int i;
        boundsOfLayoutNode boundsoflayoutnode;
        Object next;
        int i2 = 2 % 2;
        int i3 = getOnBackPressedInput + 101;
        addObserverForBackInvoker = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean zWrite = write();
        StateFlow stateFlow = this._init_lambda1;
        Integer numValueOf = null;
        if (zWrite) {
            makeTreedefault maketreedefault = (makeTreedefault) stateFlow.read();
            if (maketreedefault != null) {
                int i5 = addObserverForBackInvoker + 47;
                getOnBackPressedInput = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    List list = maketreedefault.components;
                    throw null;
                }
                List list2 = maketreedefault.components;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        int i6 = addObserverForBackInvoker + 113;
                        getOnBackPressedInput = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0) {
                            next = it.next();
                            int i7 = 96 / 0;
                            if (next instanceof boundsOfLayoutNode) {
                                break;
                            }
                        } else {
                            next = it.next();
                            if (next instanceof boundsOfLayoutNode) {
                                break;
                            }
                        }
                    }
                    boundsoflayoutnode = (boundsOfLayoutNode) next;
                } else {
                    i = addObserverForBackInvoker + 117;
                    getOnBackPressedInput = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i8 = 3 / 5;
                    }
                    boundsoflayoutnode = null;
                }
            } else {
                i = addObserverForBackInvoker + 117;
                getOnBackPressedInput = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i9 = 3 / 5;
                }
                boundsoflayoutnode = null;
            }
            if (boundsoflayoutnode != null) {
                int i10 = getOnBackPressedInput + 57;
                addObserverForBackInvoker = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    Integer.valueOf(boundsoflayoutnode.timer);
                    numValueOf.hashCode();
                    throw null;
                }
                numValueOf = Integer.valueOf(boundsoflayoutnode.timer);
            }
        } else {
            makeTreedefault maketreedefault2 = (makeTreedefault) stateFlow.read();
            if (maketreedefault2 != null) {
                int i11 = addObserverForBackInvoker + 63;
                getOnBackPressedInput = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    Integer num = maketreedefault2.timerSeconds;
                    throw null;
                }
                numValueOf = maketreedefault2.timerSeconds;
            }
        }
        if (numValueOf == null) {
            Timber.RemoteActionCompatParcelizer.write(new IllegalStateException(m1$$ExternalSyntheticOutline0.m(stateFlow.read(), "CustomerUnavailableTaskUiItem does not contain timer value: ")));
            return 0;
        }
        int i12 = getOnBackPressedInput + 109;
        addObserverForBackInvoker = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object access$refreshState(CustomerUnavailableViewModel customerUnavailableViewModel, ContinuationImpl continuationImpl) {
        setClockTimes setclocktimes;
        int i = 2;
        int i2 = 2 % 2;
        if (continuationImpl instanceof setClockTimes) {
            setclocktimes = (setClockTimes) continuationImpl;
            int i3 = setclocktimes.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = addObserverForBackInvoker + 21;
                getOnBackPressedInput = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                setclocktimes.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                setclocktimes = new setClockTimes(customerUnavailableViewModel, continuationImpl);
            }
        } else {
            setclocktimes = new setClockTimes(customerUnavailableViewModel, continuationImpl);
        }
        Object objFirst = setclocktimes.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = setclocktimes.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowWrite = TuplesKt.write(UpdateStateUseCaseImpl.write(customerUnavailableViewModel.createFullyDrawnExecutor));
            SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i, 10, shortNewsContentCardView);
            setclocktimes.IconCompatParcelizer = 1;
            objFirst = FlowKt.first(flowWrite, signInDataStore$clear$2, setclocktimes);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = addObserverForBackInvoker + 93;
            getOnBackPressedInput = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        }
        getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) objFirst;
        boolean z = getoptimizationlevel instanceof getMaxWidth;
        SharedResourcePool sharedResourcePool = customerUnavailableViewModel.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (z) {
            sharedResourcePool.serializer(new addAnimationslambda100(((getMaxWidth) getoptimizationlevel).write()));
        } else {
            sharedResourcePool.serializer(searchAny.IconCompatParcelizer);
        }
        return createFromParcel.INSTANCE;
    }

    public final void MediaBrowserCompatMediaItem() {
        RemoteActionCompatParcelizer(new Object[]{this}, 667836831, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -667836829);
    }

    public final boolean RatingCompat() {
        return ((Boolean) RemoteActionCompatParcelizer(new Object[]{this}, 272209305, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -272209304)).booleanValue();
    }

    public final void serializer() {
        RemoteActionCompatParcelizer(new Object[]{this}, -1401701634, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 1401701634);
    }
}
