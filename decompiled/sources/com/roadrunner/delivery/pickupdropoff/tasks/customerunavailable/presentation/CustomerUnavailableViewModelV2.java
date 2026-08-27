package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import android.os.SystemClock;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.incognia.internal.pcn;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.navigator.CustomerUnavailableArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import io.grpc.internal.SharedResourcePool;
import io.reactivex.disposables.CompositeDisposable;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AnimationSearchSearch;
import o.BrazeExternalSyntheticLambda28;
import o.ComposeAnimationState;
import o.CompositionDataTree;
import o.ConstraintsKt;
import o.ShortNewsContentCardView;
import o.UnsupportedSearchInfo;
import o.accessgetInstancedelegatecp;
import o.accessibleField;
import o.asComposePaint;
import o.bitOffsetToIndex;
import o.bitsNeedForSizeUnchecked;
import o.constrainWidthK40F9xA;
import o.createFromParcel;
import o.fixedHeightOenEA2s;
import o.fixedJhjzzOo;
import o.fixedWidthOenEA2s;
import o.getBitmapui_graphics;
import o.getCieXyz;
import o.getNoopState;
import o.getPlatformStyle;
import o.inCompatibilityMode;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.localeSpan;
import o.mapTree;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.restrictConstraintsxF2OJ5Q;
import o.showSystemUi;
import o.toBitmapConfig1JJdX4A;
import o.updateFromAndToStates;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableViewModelV2 extends ViewModel {
    private static int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 1;
    private static int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final SharedResourcePool ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final CustomerChatCommunicatorImpl MediaMetadataCompat;
    public final CompositeDisposable MediaSessionCompatQueueItem;
    public final g0 MediaSessionCompatResultReceiverWrapper;
    public final GetTaskByTypeAndIdUseCaseImpl MediaSessionCompatToken;
    public final InitiateTransferChangeUseCase ParcelableVolumeInfo;
    public final isOpenInternalroom_runtime PlaybackStateCompat;
    public final StateFlow PlaybackStateCompatCustomAction;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RatingCompat;
    public final Clock RemoteActionCompatParcelizer;
    public final NetworkErrorMapperImpl ResultReceiver;
    public final localeSpan r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final SendTestPushUseCase r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final ObservePuDoDeliveriesResponseImpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final m r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final getBitmapui_graphics r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final BrazeExternalSyntheticLambda28 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final StateFlow r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final isAdapterPositionOnScreen r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final UnifiedPhoneCallerImpl r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final UpdateTaskUseCaseImpl r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final isAdapterPositionOnScreen read;
    public final MutableStateFlow serializer;
    public final getPlatformStyle write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i3 | i2)) | (~(i | i2));
        int i10 = ~i;
        int i11 = (~(i10 | i2)) | i3;
        int i12 = (~(i2 | i3 | i)) | (~(i8 | i10));
        int i13 = i3 + i + i5 + ((-373584967) * i6) + ((-1711780345) * i4);
        int i14 = i13 * i13;
        int i15 = (i3 * 1075882953) + 1902575616 + (1075882953 * i) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i5) + ((-375259136) * i6) + ((-1109524480) * i4) + (585564160 * i14);
        int i16 = ((i3 * 235012993) - 778813113) + (i * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i5 * 235013625) + (i6 * 915899377) + (i4 * (-1709701169)) + (i14 * 1974403072);
        return i15 + ((i16 * i16) * (-848756736)) != 1 ? read(objArr) : serializer(objArr);
    }

    public final SharedResourcePool IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        int i3 = i2 + 29;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SharedResourcePool sharedResourcePool = this.ComponentActivity;
        int i4 = i2 + 49;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return sharedResourcePool;
    }

    public CustomerUnavailableViewModelV2(getBitmapui_graphics getbitmapui_graphics, SharedResourcePool sharedResourcePool, GetTaskByTypeAndIdUseCaseImpl getTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, CustomerChatCommunicatorImpl customerChatCommunicatorImpl, UnifiedPhoneCallerImpl unifiedPhoneCallerImpl, SendTestPushUseCase sendTestPushUseCase, m mVar, InitiateTransferChangeUseCase initiateTransferChangeUseCase, isOpenInternalroom_runtime isopeninternalroom_runtime, g0 g0Var, Clock clock, getPlatformStyle getplatformstyle, localeSpan localespan, ObservePuDoDeliveriesResponseImpl observePuDoDeliveriesResponseImpl, NetworkErrorMapperImpl networkErrorMapperImpl, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28) {
        getbitmapui_graphics.getClass();
        sharedResourcePool.getClass();
        getTaskByTypeAndIdUseCaseImpl.getClass();
        updateTaskUseCaseImpl.getClass();
        customerChatCommunicatorImpl.getClass();
        unifiedPhoneCallerImpl.getClass();
        sendTestPushUseCase.getClass();
        mVar.getClass();
        initiateTransferChangeUseCase.getClass();
        isopeninternalroom_runtime.getClass();
        g0Var.getClass();
        clock.getClass();
        getplatformstyle.getClass();
        localespan.getClass();
        observePuDoDeliveriesResponseImpl.getClass();
        networkErrorMapperImpl.getClass();
        brazeExternalSyntheticLambda28.getClass();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = getbitmapui_graphics;
        this.ComponentActivity = sharedResourcePool;
        this.MediaSessionCompatToken = getTaskByTypeAndIdUseCaseImpl;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = updateTaskUseCaseImpl;
        this.MediaMetadataCompat = customerChatCommunicatorImpl;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = unifiedPhoneCallerImpl;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sendTestPushUseCase;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = mVar;
        this.ParcelableVolumeInfo = initiateTransferChangeUseCase;
        this.PlaybackStateCompat = isopeninternalroom_runtime;
        this.MediaSessionCompatResultReceiverWrapper = g0Var;
        this.RemoteActionCompatParcelizer = clock;
        this.write = getplatformstyle;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = localespan;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = observePuDoDeliveriesResponseImpl;
        this.ResultReceiver = networkErrorMapperImpl;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = brazeExternalSyntheticLambda28;
        this.MediaSessionCompatQueueItem = new CompositeDisposable();
        final int i = 0;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$$ExternalSyntheticLambda3
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ CustomerUnavailableViewModelV2 RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 95;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = this.RemoteActionCompatParcelizer;
                if (i5 != 0) {
                    if (i5 != 1) {
                        return i5 != 2 ? ((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer : ((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).write;
                    }
                    return Long.valueOf(((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).serializer);
                }
                Object objWrite = customerUnavailableViewModelV2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write("customer_unavailable");
                Object obj = null;
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("customer unavailable args should never be null");
                    int i6 = read + 71;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return null;
                }
                int i8 = IconCompatParcelizer + 45;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return (CustomerUnavailableArgs) objWrite;
                }
                obj.hashCode();
                throw null;
            }
        });
        final int i2 = 1;
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$$ExternalSyntheticLambda3
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ CustomerUnavailableViewModelV2 RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = IconCompatParcelizer + 95;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = this.RemoteActionCompatParcelizer;
                if (i6 != 0) {
                    if (i6 != 1) {
                        return i6 != 2 ? ((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer : ((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).write;
                    }
                    return Long.valueOf(((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).serializer);
                }
                Object objWrite = customerUnavailableViewModelV2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write("customer_unavailable");
                Object obj = null;
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("customer unavailable args should never be null");
                    int i7 = read + 71;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return null;
                }
                int i9 = IconCompatParcelizer + 45;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return (CustomerUnavailableArgs) objWrite;
                }
                obj.hashCode();
                throw null;
            }
        });
        final int i3 = 2;
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$$ExternalSyntheticLambda3
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ CustomerUnavailableViewModelV2 RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = IconCompatParcelizer + 95;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = this.RemoteActionCompatParcelizer;
                if (i7 != 0) {
                    if (i7 != 1) {
                        return i7 != 2 ? ((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer : ((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).write;
                    }
                    return Long.valueOf(((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).serializer);
                }
                Object objWrite = customerUnavailableViewModelV2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write("customer_unavailable");
                Object obj = null;
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("customer unavailable args should never be null");
                    int i8 = read + 71;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return null;
                }
                int i10 = IconCompatParcelizer + 45;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    return (CustomerUnavailableArgs) objWrite;
                }
                obj.hashCode();
                throw null;
            }
        });
        final int i4 = 3;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2$$ExternalSyntheticLambda3
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ CustomerUnavailableViewModelV2 RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = IconCompatParcelizer + 95;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = i4;
                CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = this.RemoteActionCompatParcelizer;
                if (i8 != 0) {
                    if (i8 != 1) {
                        return i8 != 2 ? ((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer : ((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).write;
                    }
                    return Long.valueOf(((CustomerUnavailableArgs) customerUnavailableViewModelV2.read.MediaSessionCompatResultReceiverWrapper()).serializer);
                }
                Object objWrite = customerUnavailableViewModelV2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write("customer_unavailable");
                Object obj = null;
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("customer unavailable args should never be null");
                    int i9 = read + 71;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return null;
                }
                int i11 = IconCompatParcelizer + 45;
                read = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return (CustomerUnavailableArgs) objWrite;
                }
                obj.hashCode();
                throw null;
            }
        });
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.IconCompatParcelizer = mutableStateFlow;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.TRUE);
        this.serializer = mutableStateFlow2;
        this.PlaybackStateCompatCustomAction = mutableStateFlow2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = (CustomerUnavailableViewModelV2) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 39;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((Number) customerUnavailableViewModelV2.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper()).longValue();
            throw null;
        }
        long jLongValue = ((Number) customerUnavailableViewModelV2.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper()).longValue();
        int i3 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 33;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return Long.valueOf(jLongValue);
        }
        obj.hashCode();
        throw null;
    }

    public static boolean write(long j, Long l) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int i3 = i2 + 107;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (l == null) {
            return false;
        }
        int i5 = i2 + 61;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return j < l.longValue();
        }
        l.longValue();
        throw null;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 61;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem.read();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.RatingCompat;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 115;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void read() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new CustomerUnavailableViewModelV2$onTaskShown$1(this, null, 0), 3);
        int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 67;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final accessibleField serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        ShortNewsContentCardView shortNewsContentCardView;
        accessibleField accessiblefield;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.IconCompatParcelizer;
            obj = mutableStateFlow.read();
            accessibleField accessiblefield2 = (accessibleField) obj;
            shortNewsContentCardView = null;
            if (accessiblefield2 != null) {
                int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 29;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                accessiblefield = (accessibleField) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(accessiblefield2);
            } else {
                accessiblefield = null;
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, accessiblefield));
        if (accessiblefield == null) {
            int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 51;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new CustomerUnavailableViewModelV2$applyAndPersist$1(this, accessiblefield, shortNewsContentCardView, 0), 3);
        int i6 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 85;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return accessiblefield;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        List list;
        Object next;
        CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = (CustomerUnavailableViewModelV2) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        str.getClass();
        accessibleField accessiblefieldSerializer = customerUnavailableViewModelV2.serializer(new SuspendingWorkUseCase$$ExternalSyntheticLambda0(customerUnavailableViewModelV2, 4, str));
        if (accessiblefieldSerializer != null && (list = accessiblefieldSerializer.utccComponents) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 85;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 27;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    boolean z = it.next() instanceof bitOffsetToIndex;
                    throw null;
                }
                Object next2 = it.next();
                if (next2 instanceof bitOffsetToIndex) {
                    arrayList.add(next2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                bitOffsetToIndex bitoffsettoindex = (bitOffsetToIndex) next;
                if (!(!bitoffsettoindex.isEnabled)) {
                    int i5 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 93;
                    r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (bitoffsettoindex.timerText == null) {
                        break;
                    }
                }
            }
            bitOffsetToIndex bitoffsettoindex2 = (bitOffsetToIndex) next;
            if (bitoffsettoindex2 != null) {
                customerUnavailableViewModelV2.read(bitoffsettoindex2);
            }
        }
        return null;
    }

    public final void read(String str, boolean z) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        accessibleField accessiblefieldWrite;
        ConstraintsKt constraintsKt;
        restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        do {
            mutableStateFlow = this.IconCompatParcelizer;
            obj = mutableStateFlow.read();
            accessibleField accessiblefield = (accessibleField) obj;
            accessiblefieldWrite = null;
            if (accessiblefield != null) {
                List<Object> list = accessiblefield.utccComponents;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                int i3 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 31;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 3 % 4;
                }
                for (Object obj2 : list) {
                    if (obj2 instanceof fixedJhjzzOo) {
                        fixedJhjzzOo fixedjhjzzoo = (fixedJhjzzOo) obj2;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fixedjhjzzoo.id, str}, getCieXyz.write())).booleanValue()) {
                            int i5 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 29;
                            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
                            if (i5 % 2 != 0) {
                                constraintsKt = null;
                                restrictconstraintsxf2oj5q = null;
                                z2 = false;
                                i = 19;
                            } else {
                                constraintsKt = null;
                                restrictconstraintsxf2oj5q = null;
                                z2 = false;
                                i = 127;
                            }
                            obj2 = fixedJhjzzOo.read(fixedjhjzzoo, constraintsKt, restrictconstraintsxf2oj5q, z2, z, i);
                        }
                    }
                    arrayList.add(obj2);
                }
                accessiblefieldWrite = accessibleField.write(accessiblefield, arrayList, null, 111);
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, accessiblefieldWrite));
    }

    public final void write(String str, String str2) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        accessibleField accessiblefieldWrite;
        constrainWidthK40F9xA constrainwidthk40f9xa;
        bitsNeedForSizeUnchecked bitsneedforsizeunchecked;
        boolean z;
        int i;
        int i2 = 2 % 2;
        do {
            mutableStateFlow = this.IconCompatParcelizer;
            obj = mutableStateFlow.read();
            accessibleField accessiblefield = (accessibleField) obj;
            accessiblefieldWrite = null;
            if (accessiblefield != null) {
                List<Object> list = accessiblefield.utccComponents;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                for (Object obj2 : list) {
                    int i3 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 95;
                    r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    if (obj2 instanceof bitOffsetToIndex) {
                        bitOffsetToIndex bitoffsettoindex = (bitOffsetToIndex) obj2;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bitoffsettoindex.id, str}, getCieXyz.write())).booleanValue()) {
                            int i5 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 49;
                            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
                            if (i5 % 2 != 0) {
                                constrainwidthk40f9xa = null;
                                bitsneedforsizeunchecked = null;
                                i = 22047;
                                z = false;
                            } else {
                                constrainwidthk40f9xa = null;
                                bitsneedforsizeunchecked = null;
                                z = false;
                                i = 479;
                            }
                            obj2 = bitOffsetToIndex.read(bitoffsettoindex, str2, constrainwidthk40f9xa, bitsneedforsizeunchecked, z, i);
                        }
                    }
                    arrayList.add(obj2);
                    int i6 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 111;
                    r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
                accessiblefieldWrite = accessibleField.write(accessiblefield, arrayList, null, 111);
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, accessiblefieldWrite));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b A[PHI: r0
  0x006b: PHI (r0v20 o.getNoopState) = (r0v19 o.getNoopState), (r0v22 o.getNoopState) binds: [B:22:0x0069, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r0 r1
  0x0024: PHI (r0v5 int) = (r0v4 int), (r0v23 int) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r1v2 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) = (r1v1 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU), (r1v14 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) binds: [B:8:0x0022, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public final void read(bitOffsetToIndex bitoffsettoindex) {
        int i;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        int i2;
        getNoopState getnoopstate;
        int i3 = 2 % 2;
        int i4 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 57;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 % 2 != 0) {
            i = bitoffsettoindex.timerInSeconds;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.RatingCompat;
            int i5 = 75 / 0;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 41;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    throw null;
                }
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
        } else {
            i = bitoffsettoindex.timerInSeconds;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.RatingCompat;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 41;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    throw null;
                }
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
        }
        int i6 = i;
        this.MediaSessionCompatResultReceiverWrapper.getClass();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j = (((long) i6) * 1000) + jElapsedRealtime;
        constrainWidthK40F9xA constrainwidthk40f9xa = (constrainWidthK40F9xA) bitoffsettoindex.availableStates.get(bitsNeedForSizeUnchecked.RUNNING);
        if (constrainwidthk40f9xa != null) {
            int i7 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 63;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getnoopstate = constrainwidthk40f9xa.stateChangeAction;
                int i8 = 22 / 0;
                if (getnoopstate != null) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new QrCodeScanTaskUiModelImpl$1(this, getnoopstate, shortNewsContentCardView, 15), 3);
                }
            } else {
                getnoopstate = constrainwidthk40f9xa.stateChangeAction;
                if (getnoopstate != null) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new QrCodeScanTaskUiModelImpl$1(this, getnoopstate, shortNewsContentCardView, 15), 3);
                }
            }
        }
        serializer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.updateAnimatedVisibilityState
            private static int read = 0;
            private static int serializer = 1;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = read + 105;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                accessibleField accessiblefield = (accessibleField) obj;
                accessiblefield.getClass();
                this.IconCompatParcelizer.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getClass();
                accessibleField accessiblefieldWrite = accessibleField.write(accessiblefield, null, fixedHeightOenEA2s.serializer(accessiblefield.taskState, null, null, Long.valueOf(jElapsedRealtime), Long.valueOf(j), 3), 63);
                int i12 = read + 43;
                serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return accessiblefieldWrite;
            }
        });
        write(bitoffsettoindex.id, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read(i6));
        asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(this);
        ((inCompatibilityMode) this.PlaybackStateCompat).getClass();
        this.RatingCompat = BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, null, new NafathTimerManager$observeCountdown$1(this, j, bitoffsettoindex, (ShortNewsContentCardView) null, 10), 2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public static final Object access$notifyTimerStarted(CustomerUnavailableViewModelV2 customerUnavailableViewModelV2, getNoopState getnoopstate, ContinuationImpl continuationImpl) {
        updateFromAndToStates updatefromandtostates;
        Object objM4929invoke0E7RQCE;
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 77;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof updateFromAndToStates) {
            updatefromandtostates = (updateFromAndToStates) continuationImpl;
            int i4 = updatefromandtostates.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 47;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
                updatefromandtostates.write = i5 % 2 != 0 ? i4 * Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                updatefromandtostates = new updateFromAndToStates(customerUnavailableViewModelV2, continuationImpl);
            }
        } else {
            updatefromandtostates = new updateFromAndToStates(customerUnavailableViewModelV2, continuationImpl);
        }
        Object obj = updatefromandtostates.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = updatefromandtostates.write;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (getnoopstate instanceof UnsupportedSearchInfo) {
                UnsupportedSearchInfo unsupportedSearchInfo = (UnsupportedSearchInfo) getnoopstate;
                AnimationSearchSearch animationSearchSearch = new AnimationSearchSearch(unsupportedSearchInfo.path, unsupportedSearchInfo.data);
                InitiateTransferChangeUseCase initiateTransferChangeUseCase = customerUnavailableViewModelV2.ParcelableVolumeInfo;
                String str = unsupportedSearchInfo.method;
                updatefromandtostates.write = 1;
                objM4929invoke0E7RQCE = initiateTransferChangeUseCase.m4929invoke0E7RQCE(str, animationSearchSearch, updatefromandtostates);
                if (objM4929invoke0E7RQCE == coroutineSingletons) {
                    int i7 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 105;
                    r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return coroutineSingletons;
                }
            } else {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("CustomerUnavailableViewModelV2: Unsupported timer start action: " + getnoopstate, new Object[0]);
            }
            return createFromParcel.INSTANCE;
        }
        int i9 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 67;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0 ? i6 != 1 : i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        objM4929invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        int i10 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 53;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        Throwable thSerializer = onItemDismiss.serializer(objM4929invoke0E7RQCE);
        if (thSerializer != null) {
            int i12 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 25;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "CustomerUnavailableViewModelV2: Failed to notify timer started", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    public final void IconCompatParcelizer(String str) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        accessibleField accessiblefieldWrite;
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 15;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        do {
            mutableStateFlow = this.IconCompatParcelizer;
            obj = mutableStateFlow.read();
            accessibleField accessiblefield = (accessibleField) obj;
            if (accessiblefield != null) {
                m mVar = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                mVar.getClass();
                g0 g0Var = (g0) mVar.read;
                List list = accessiblefield.utccComponents;
                g0Var.getClass();
                list.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                Iterator it = list2.iterator();
                int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 11;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                while (!(!it.hasNext())) {
                    Object obj2 = (fixedWidthOenEA2s) it.next();
                    if (obj2 instanceof fixedJhjzzOo) {
                        fixedJhjzzOo fixedjhjzzoo = (fixedJhjzzOo) obj2;
                        Map map = fixedjhjzzoo.availableStates;
                        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fixedjhjzzoo.id, str}, getCieXyz.write())).booleanValue())) {
                            restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q = restrictConstraintsxF2OJ5Q.FAILED;
                            ConstraintsKt constraintsKt = (ConstraintsKt) map.get(restrictconstraintsxf2oj5q);
                            if (constraintsKt == null) {
                                constraintsKt = (ConstraintsKt) map.get(restrictConstraintsxF2OJ5Q.NOT_INITIATED);
                            }
                            obj2 = fixedJhjzzOo.read(fixedjhjzzoo, constraintsKt, restrictconstraintsxf2oj5q, false, false, 207);
                        }
                    }
                    arrayList.add(obj2);
                }
                accessiblefieldWrite = accessibleField.write(accessiblefield, arrayList, fixedHeightOenEA2s.serializer(accessiblefield.taskState, onMove.serializer(accessiblefield.taskState.componentStatus, new onViewAttachedToWindowlambda0(str, restrictConstraintsxF2OJ5Q.FAILED.getKey())), null, null, null, 14), 47);
                int i6 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 17;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                accessiblefieldWrite = null;
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, accessiblefieldWrite));
    }

    public final void write() {
        Long l;
        getNoopState getnoopstate;
        boolean zWrite;
        ComposeAnimationState composeAnimationState;
        int i = 2 % 2;
        accessibleField accessiblefield = (accessibleField) this.IconCompatParcelizer.read();
        if (accessiblefield == null || (l = accessiblefield.taskState.firstOpenedTimeStamp) == null) {
            return;
        }
        long jLongValue = l.longValue();
        List list = accessiblefield.utccComponents;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (next instanceof fixedJhjzzOo) {
                arrayList.add(next);
            }
        }
        ArrayList<fixedJhjzzOo> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i2 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 91;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (((fixedJhjzzOo) obj).currentStateType != restrictConstraintsxF2OJ5Q.INITIATED) {
                arrayList2.add(obj);
            }
        }
        for (fixedJhjzzOo fixedjhjzzoo : arrayList2) {
            ConstraintsKt constraintsKt = (ConstraintsKt) fixedjhjzzoo.availableStates.get(restrictConstraintsxF2OJ5Q.NOT_INITIATED);
            Object obj2 = null;
            if (constraintsKt == null || (composeAnimationState = constraintsKt.button) == null) {
                getnoopstate = null;
            } else {
                int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 69;
                r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    getNoopState getnoopstate2 = composeAnimationState.actionData;
                    obj2.hashCode();
                    throw null;
                }
                getnoopstate = composeAnimationState.actionData;
            }
            boolean z = getnoopstate instanceof showSystemUi;
            localeSpan localespan = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (z) {
                zWrite = write(jLongValue, (Long) localespan.RemoteActionCompatParcelizer.get(Long.valueOf(((Long) RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{this}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue())));
            } else {
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getnoopstate, CompositionDataTree.INSTANCE}, getCieXyz.write())).booleanValue();
                getPlatformStyle getplatformstyle = this.write;
                if (zBooleanValue) {
                    int i5 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 21;
                    r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    zWrite = write(jLongValue, (Long) getplatformstyle.RemoteActionCompatParcelizer.get(Long.valueOf(((Long) RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{this}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue())));
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getnoopstate, mapTree.INSTANCE}, getCieXyz.write())).booleanValue()) {
                        if (!write(jLongValue, (Long) getplatformstyle.RemoteActionCompatParcelizer.get(Long.valueOf(((Long) RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{this}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue())))) {
                            int i7 = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 31;
                            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i7 % Fields.SpotShadowColor;
                            if (i7 % 2 != 0) {
                                write(jLongValue, (Long) localespan.RemoteActionCompatParcelizer.get(Long.valueOf(((Long) RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{this}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue())));
                                throw null;
                            }
                            if (write(jLongValue, (Long) localespan.RemoteActionCompatParcelizer.get(Long.valueOf(((Long) RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{this}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue())))) {
                            }
                        }
                        RemoteActionCompatParcelizer(227606622, pcn.serializer(), new Object[]{this, fixedjhjzzoo.id}, -227606621, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    } else {
                        continue;
                    }
                }
            }
            if (zWrite) {
                RemoteActionCompatParcelizer(227606622, pcn.serializer(), new Object[]{this, fixedjhjzzoo.id}, -227606621, pcn.serializer(), pcn.serializer(), pcn.serializer());
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        RemoteActionCompatParcelizer(227606622, pcn.serializer(), new Object[]{this, str}, -227606621, pcn.serializer(), pcn.serializer(), pcn.serializer());
    }

    public final long RemoteActionCompatParcelizer() {
        return ((Long) RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{this}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue();
    }
}
