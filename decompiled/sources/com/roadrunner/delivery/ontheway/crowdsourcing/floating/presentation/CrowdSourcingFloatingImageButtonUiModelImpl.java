package com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.room.RoomDatabase;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.navigator.R;
import com.mapbox.navigator.RoutesDataNative;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.overlay.domain.ObserveAcceptOverlayVisibility$invoke$1;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.data.CrowdSourcingFloatingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.upload.usecases.ObserveUploadCompletionUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$combine$1$3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.DefaultContentCardView;
import o.ImeOptionsCompanion;
import o.InputMethodManagerImplimm2;
import o.NullableInputConnectionWrapper;
import o.NullableInputConnectionWrapperApi21;
import o.ShortNewsContentCardView;
import o.accessgetSentencescp;
import o.accessgetWordscp;
import o.clearMetaKeyStates;
import o.copyYTHSh70;
import o.copyYTHSh70default;
import o.copyuxg59PA;
import o.copywBHncE4;
import o.copywBHncE4default;
import o.createFromParcel;
import o.deleteSurroundingTextInCodePoints;
import o.getAutoCorrect;
import o.getCapitalizationIUNYP9k;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getDoneeUduSuo;
import o.getHintLocales;
import o.getImeActioneUduSuo;
import o.getKeyboardTypePjHm6EE;
import o.getPreviouseUduSuo;
import o.getQueryContext;
import o.getSingleLine;
import o.getUnspecifiedPjHm6EE;
import o.getUnspecifiedeUduSuo;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.isResumed;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.updateSelection;

/* JADX INFO: loaded from: classes3.dex */
public final class CrowdSourcingFloatingImageButtonUiModelImpl implements copywBHncE4default {
    private static int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;
    public final n0 ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final ContextScope MediaBrowserCompatMediaItem;
    public final isResumed MediaDescriptionCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaMetadataCompat;
    public final getDoneeUduSuo MediaSessionCompatQueueItem;
    public final CrowdSourcingFloatingImageRepositoryImpl MediaSessionCompatResultReceiverWrapper;
    public final StateFlow MediaSessionCompatToken;
    public final isOpenInternalroom_runtime ParcelableVolumeInfo;
    public final p0 PlaybackStateCompat;
    public final GetCrowdSourcingEntryPointScreenImpl PlaybackStateCompatCustomAction;
    public final IsFixableByRetry RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final deleteSurroundingTextInCodePoints ResultReceiver;
    public final ObserveUploadCompletionUseCase r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final g0 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final StateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final UpdateStateUseCaseImpl r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final StateFlow r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final MutableStateFlow read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ CrowdSourcingFloatingImageButtonUiModelImpl serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.serializer = crowdSourcingFloatingImageButtonUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 15;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.RemoteActionCompatParcelizer;
            CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl = this.serializer;
            if (i4 == 0) {
                return new AnonymousClass1(crowdSourcingFloatingImageButtonUiModelImpl, shortNewsContentCardView, 0);
            }
            int i5 = 1;
            if (i4 == 1) {
                return new AnonymousClass1(crowdSourcingFloatingImageButtonUiModelImpl, shortNewsContentCardView, i5);
            }
            if (i4 == 2) {
                return new AnonymousClass1(crowdSourcingFloatingImageButtonUiModelImpl, shortNewsContentCardView, i);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(crowdSourcingFloatingImageButtonUiModelImpl, shortNewsContentCardView, 3);
            int i6 = IconCompatParcelizer + 99;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = write + 67;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                throw null;
            }
            int i3 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i3 == 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 == 1) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 != 2) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = write + 99;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objWrite;
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl = this.serializer;
            int i4 = 3;
            int i5 = 5;
            int i6 = 0;
            int i7 = 1;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i3 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.read;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                deleteSurroundingTextInCodePoints deletesurroundingtextincodepoints = crowdSourcingFloatingImageButtonUiModelImpl.ResultReceiver;
                ChannelFlowTransformLatest channelFlowTransformLatestRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new DiskLruCache$launchCleanup$1(crowdSourcingFloatingImageButtonUiModelImpl, shortNewsContentCardView, 27), FlowKt.serializer(new ObserveDivider$invoke$$inlined$map$1(FlowKt.RemoteActionCompatParcelizer(FlowKt.serializer(new ObserveImageSharingUiState$invoke$$inlined$map$1(deletesurroundingtextincodepoints.read.serializer(), i6)), new SettingsViewModel$special$$inlined$combine$1$3(shortNewsContentCardView, deletesurroundingtextincodepoints, i5)), 8))), new SettingsViewModel$special$$inlined$combine$1$3(shortNewsContentCardView, crowdSourcingFloatingImageButtonUiModelImpl, i4));
                getUnspecifiedPjHm6EE getunspecifiedpjhm6ee = new getUnspecifiedPjHm6EE(crowdSourcingFloatingImageButtonUiModelImpl, i6);
                this.read = 1;
                return channelFlowTransformLatestRemoteActionCompatParcelizer.collect(getunspecifiedpjhm6ee, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i3 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.read;
                if (i9 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    deleteSurroundingTextInCodePoints deletesurroundingtextincodepoints2 = crowdSourcingFloatingImageButtonUiModelImpl.ResultReceiver;
                    Flow flowSerializer = FlowKt.serializer(new DefaultContentCardView(i), new ObserveDivider$invoke$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.RemoteActionCompatParcelizer(FlowKt.serializer(new ObserveImageSharingUiState$invoke$$inlined$map$1(deletesurroundingtextincodepoints2.read.serializer(), i6)), new SettingsViewModel$special$$inlined$combine$1$3(shortNewsContentCardView, deletesurroundingtextincodepoints2, i5)), crowdSourcingFloatingImageButtonUiModelImpl.write, new ObserveAcceptOverlayVisibility$invoke$1(crowdSourcingFloatingImageButtonUiModelImpl, shortNewsContentCardView, i4)), 9));
                    LocalAuthDataSource.AnonymousClass2 anonymousClass2 = new LocalAuthDataSource.AnonymousClass2(crowdSourcingFloatingImageButtonUiModelImpl, shortNewsContentCardView, 24);
                    this.read = 1;
                    return FlowKt.collectLatest(flowSerializer, anonymousClass2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                }
                if (i9 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = IconCompatParcelizer + 91;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            if (i3 == 2) {
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.read;
                if (i12 != 0) {
                    int i13 = IconCompatParcelizer + 45;
                    write = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    if (i12 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1Serializer = FlowKt.serializer(crowdSourcingFloatingImageButtonUiModelImpl.MediaDescriptionCompat.IconCompatParcelizer, 16L);
                getUnspecifiedPjHm6EE getunspecifiedpjhm6ee2 = new getUnspecifiedPjHm6EE(crowdSourcingFloatingImageButtonUiModelImpl, i7);
                this.read = 1;
                if (flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1Serializer.collect(getunspecifiedpjhm6ee2, this) != coroutineSingletons3) {
                    return createfromparcel;
                }
                int i15 = IconCompatParcelizer + 79;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    int i16 = 77 / 0;
                }
                return coroutineSingletons3;
            }
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i17 = this.read;
            if (i17 != 0) {
                int i18 = write + 101;
                int i19 = i18 % Fields.SpotShadowColor;
                IconCompatParcelizer = i19;
                int i20 = i18 % 2;
                if (i17 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i21 = i19 + 121;
                write = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
            }
            MutableStateFlow mutableStateFlow = crowdSourcingFloatingImageButtonUiModelImpl.IconCompatParcelizer;
            do {
                obj2 = mutableStateFlow.read();
                objWrite = (copyYTHSh70default) obj2;
                copyuxg59PA copyuxg59pa = objWrite instanceof copyuxg59PA ? (copyuxg59PA) objWrite : null;
                if (copyuxg59pa == null) {
                    int i23 = IconCompatParcelizer;
                    int i24 = i23 + 57;
                    write = i24 % Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    int i26 = i23 + 99;
                    write = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                } else {
                    objWrite = copyuxg59PA.write(copyuxg59pa, false, false, 127);
                }
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, objWrite));
            return createfromparcel;
        }
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i);
        int i9 = (~(i7 | i4)) | i8 | (~(i | i4));
        int i10 = (~(i7 | (~i4))) | i8;
        int i11 = (~(i4 | i2)) | (~((~i) | i2));
        int i12 = i2 + i + i6 + (929125522 * i5) + (1849324972 * i3);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i2) + 1146290176 + ((-1462591364) * i) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i6) + ((-291241984) * i5) + (1012400128 * i3) + ((-1810169856) * i13);
        int i15 = ((i2 * (-2058557531)) - 518432259) + (i * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i6 * (-2058558961)) + (i5 * 548722830) + (i3 * 1549712660) + (i13 * (-2087387136));
        return i14 + ((i15 * i15) * (-343605248)) != 1 ? IconCompatParcelizer(objArr) : write(objArr);
    }

    public CrowdSourcingFloatingImageButtonUiModelImpl(transferSessionPackageI transfersessionpackagei, getQueryContext getquerycontext, isResumed isresumed, CrowdSourcingFloatingImageRepositoryImpl crowdSourcingFloatingImageRepositoryImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, deleteSurroundingTextInCodePoints deletesurroundingtextincodepoints, GetCrowdSourcingEntryPointScreenImpl getCrowdSourcingEntryPointScreenImpl, n0 n0Var, IsFixableByRetry isFixableByRetry, ObserveUploadCompletionUseCase observeUploadCompletionUseCase, UpdateStateUseCaseImpl updateStateUseCaseImpl, g0 g0Var, p0 p0Var, getDoneeUduSuo getdoneeudusuo, ContextScope contextScope) {
        transfersessionpackagei.getClass();
        getquerycontext.getClass();
        isresumed.getClass();
        crowdSourcingFloatingImageRepositoryImpl.getClass();
        isopeninternalroom_runtime.getClass();
        deletesurroundingtextincodepoints.getClass();
        getCrowdSourcingEntryPointScreenImpl.getClass();
        n0Var.getClass();
        isFixableByRetry.getClass();
        observeUploadCompletionUseCase.getClass();
        updateStateUseCaseImpl.getClass();
        g0Var.getClass();
        p0Var.getClass();
        getdoneeudusuo.getClass();
        this.serializer = getquerycontext;
        this.MediaDescriptionCompat = isresumed;
        this.MediaSessionCompatResultReceiverWrapper = crowdSourcingFloatingImageRepositoryImpl;
        this.ParcelableVolumeInfo = isopeninternalroom_runtime;
        this.ResultReceiver = deletesurroundingtextincodepoints;
        this.PlaybackStateCompatCustomAction = getCrowdSourcingEntryPointScreenImpl;
        this.ComponentActivity = n0Var;
        this.RatingCompat = isFixableByRetry;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = observeUploadCompletionUseCase;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = updateStateUseCaseImpl;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = g0Var;
        this.PlaybackStateCompat = p0Var;
        this.MediaSessionCompatQueueItem = getdoneeudusuo;
        this.MediaBrowserCompatMediaItem = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getSingleLine.read);
        this.IconCompatParcelizer = mutableStateFlow;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow2;
        this.MediaSessionCompatToken = mutableStateFlow2;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(Float.valueOf(1.0f));
        this.RemoteActionCompatParcelizer = mutableStateFlow3;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableStateFlow3;
        this.write = StateFlowKt.read(NullableInputConnectionWrapperApi21.RemoteActionCompatParcelizer);
        Object[] objArr = {(FirebaseRemoteConfigImpl) transfersessionpackagei, updateAdidI.IS_CROWD_SOURCING_ENABLED};
        int iSerializer = R.serializer();
        int i = 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), iSerializer, objArr)).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, i), 3);
            int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 35;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        int i5 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 83;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaSessionCompatToken;
        int i5 = i3 + 115;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    @Override // o.copywBHncE4default
    public final StateFlow RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int i3 = i2 + 5;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i5 = i2 + 31;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return stateFlow;
    }

    @Override // o.copywBHncE4default
    public final getQueryContext read() {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 97;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        int i3 = 96 / 0;
        return this.serializer;
    }

    @Override // o.copywBHncE4default
    public final StateFlow write() {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 45;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i5 = i3 + 103;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    @Override // o.copywBHncE4default
    public final void IconCompatParcelizer(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 63;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem.read(getUnspecifiedeUduSuo.FRONTEND_SUCCESS);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getClass();
        g0.write(fragmentActivity);
        int i4 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 21;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.copywBHncE4default
    public final void IconCompatParcelizer(copyYTHSh70 copyythsh70) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        Object objRemoteActionCompatParcelizer;
        copyYTHSh70 copyythsh71;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.IconCompatParcelizer;
            obj = mutableStateFlow.read();
            objRemoteActionCompatParcelizer = (copyYTHSh70default) obj;
            if (objRemoteActionCompatParcelizer instanceof copyYTHSh70) {
                copyythsh71 = (copyYTHSh70) objRemoteActionCompatParcelizer;
                int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 49;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            } else {
                copyythsh71 = null;
            }
            if (copyythsh71 == null) {
                int i4 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 103;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 98 / 0;
                }
            } else {
                Object[] objArr = {copyythsh70.RemoteActionCompatParcelizer(), copyythsh71.RemoteActionCompatParcelizer()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    objRemoteActionCompatParcelizer = copyythsh71.RemoteActionCompatParcelizer(true);
                } else {
                    int i6 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 47;
                    r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, objRemoteActionCompatParcelizer));
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl = (CrowdSourcingFloatingImageButtonUiModelImpl) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 103;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        copyYTHSh70default copyythsh70default = (copyYTHSh70default) crowdSourcingFloatingImageButtonUiModelImpl.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!(copyythsh70default instanceof copyYTHSh70)) {
            return null;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = crowdSourcingFloatingImageButtonUiModelImpl.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 69;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i6 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 9;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        ((inCompatibilityMode) crowdSourcingFloatingImageButtonUiModelImpl.ParcelableVolumeInfo).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        crowdSourcingFloatingImageButtonUiModelImpl.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = BuildersKt.RemoteActionCompatParcelizer(crowdSourcingFloatingImageButtonUiModelImpl.MediaBrowserCompatMediaItem, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new BridgeManager$trackEvent$2(crowdSourcingFloatingImageButtonUiModelImpl, (copyYTHSh70) copyythsh70default, shortNewsContentCardView, 29), 2);
        int i8 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 109;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return null;
    }

    @Override // o.copywBHncE4default
    public final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 35;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % Fields.SpotShadowColor;
        getHintLocales gethintlocales = null;
        if (i2 % 2 == 0) {
            boolean z = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read() instanceof getHintLocales;
            gethintlocales.hashCode();
            throw null;
        }
        Object obj = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read();
        if (!(obj instanceof getHintLocales)) {
            int i3 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 7;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            gethintlocales = (getHintLocales) obj;
        }
        if (gethintlocales == null) {
            int i5 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 5;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            this.write.IconCompatParcelizer(NullableInputConnectionWrapper.serializer);
            this.IconCompatParcelizer.IconCompatParcelizer(new getHintLocales(new getAutoCorrect(com.logistics.rider.glovo.R.string.crowdsourcing_image_floating_pray, copywBHncE4.Success), gethintlocales.IconCompatParcelizer(), ImeOptionsCompanion.serializer, false, true, false));
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl = (CrowdSourcingFloatingImageButtonUiModelImpl) objArr[0];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        InputMethodManagerImplimm2 inputMethodManagerImplimm2 = (InputMethodManagerImplimm2) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        inputMethodManagerImplimm2.getClass();
        str.getClass();
        if (inputMethodManagerImplimm2.equals(updateSelection.RemoteActionCompatParcelizer)) {
            int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 45;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                crowdSourcingFloatingImageButtonUiModelImpl.RatingCompat.getClass();
                IsFixableByRetry.read(fragmentActivity, str, "content_sharing_submitted_from_floating_button");
                int i3 = 99 / 0;
            } else {
                crowdSourcingFloatingImageButtonUiModelImpl.RatingCompat.getClass();
                IsFixableByRetry.read(fragmentActivity, str, "content_sharing_submitted_from_floating_button");
            }
            return null;
        }
        if (inputMethodManagerImplimm2.equals(accessgetWordscp.IconCompatParcelizer)) {
            crowdSourcingFloatingImageButtonUiModelImpl.PlaybackStateCompat.getClass();
            p0.read(fragmentActivity);
            return null;
        }
        if (!inputMethodManagerImplimm2.equals(accessgetSentencescp.write)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        crowdSourcingFloatingImageButtonUiModelImpl.ComponentActivity.getClass();
        n0.IconCompatParcelizer(fragmentActivity, str);
        int i4 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 109;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    @Override // o.copywBHncE4default
    public final void serializer() {
        copyYTHSh70 copyythsh70;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 5;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object obj = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read();
        if (obj instanceof copyYTHSh70) {
            copyythsh70 = (copyYTHSh70) obj;
        } else {
            int i5 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 1;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            copyythsh70 = null;
        }
        if (copyythsh70 == null) {
            return;
        }
        boolean z2 = copyythsh70 instanceof copyuxg59PA;
        if (z2) {
            int i7 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 11;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                ((copyuxg59PA) copyythsh70).read();
                throw null;
            }
            i = ((copyuxg59PA) copyythsh70).read();
        } else {
            if (!(copyythsh70 instanceof getHintLocales)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            int i8 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 7;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = 0;
        }
        this.MediaSessionCompatQueueItem.serializer(i);
        if (z2) {
            z = true;
        } else {
            if (!(copyythsh70 instanceof getHintLocales)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            int i10 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 29;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = false;
        }
        BuildersKt.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, null, null, new RoomDatabase.AnonymousClass1(this, z, copyythsh70, null, 5), 3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x012c A[RETURN] */
    public static final Object access$saveTooltipShownRecord(CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl, copyYTHSh70 copyythsh70, ContinuationImpl continuationImpl) {
        clearMetaKeyStates clearmetakeystates;
        getPreviouseUduSuo getpreviouseudusuo;
        getPreviouseUduSuo getpreviouseudusuo2;
        int i = 2 % 2;
        CrowdSourcingFloatingImageRepositoryImpl crowdSourcingFloatingImageRepositoryImpl = crowdSourcingFloatingImageButtonUiModelImpl.MediaSessionCompatResultReceiverWrapper;
        if (continuationImpl instanceof clearMetaKeyStates) {
            clearmetakeystates = (clearMetaKeyStates) continuationImpl;
            int i2 = clearmetakeystates.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 57;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    clearmetakeystates.IconCompatParcelizer = i2 >>> Integer.MIN_VALUE;
                } else {
                    clearmetakeystates.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                }
            } else {
                clearmetakeystates = new clearMetaKeyStates(crowdSourcingFloatingImageButtonUiModelImpl, continuationImpl);
            }
        } else {
            clearmetakeystates = new clearMetaKeyStates(crowdSourcingFloatingImageButtonUiModelImpl, continuationImpl);
        }
        Object obj = clearmetakeystates.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = clearmetakeystates.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 != 0) {
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getpreviouseudusuo = getPreviouseUduSuo.ADD_PHOTOS;
                clearmetakeystates.IconCompatParcelizer = 2;
                if (crowdSourcingFloatingImageRepositoryImpl.incrementTooltipShownCounts(getpreviouseudusuo, clearmetakeystates) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return createfromparcel;
            }
            if (i4 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getpreviouseudusuo2 = getPreviouseUduSuo.PHOTOS_AVAILABLE;
            clearmetakeystates.IconCompatParcelizer = 4;
            if (crowdSourcingFloatingImageRepositoryImpl.incrementTooltipShownCounts(getpreviouseudusuo2, clearmetakeystates) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getImeActioneUduSuo getimeactioneudusuoRemoteActionCompatParcelizer = copyythsh70.RemoteActionCompatParcelizer();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getimeactioneudusuoRemoteActionCompatParcelizer, getCapitalizationIUNYP9k.serializer}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getimeactioneudusuoRemoteActionCompatParcelizer, getKeyboardTypePjHm6EE.read}, getCieXyz.write())).booleanValue()) {
                getPreviouseUduSuo getpreviouseudusuo3 = getPreviouseUduSuo.PHOTOS_AVAILABLE;
                String strIconCompatParcelizer = copyythsh70.IconCompatParcelizer();
                clearmetakeystates.IconCompatParcelizer = 3;
                if (crowdSourcingFloatingImageRepositoryImpl.setTooltipLastShownAddress(getpreviouseudusuo3, strIconCompatParcelizer, clearmetakeystates) != coroutineSingletons) {
                    getpreviouseudusuo2 = getPreviouseUduSuo.PHOTOS_AVAILABLE;
                    clearmetakeystates.IconCompatParcelizer = 4;
                    if (crowdSourcingFloatingImageRepositoryImpl.incrementTooltipShownCounts(getpreviouseudusuo2, clearmetakeystates) == coroutineSingletons) {
                    }
                }
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getimeactioneudusuoRemoteActionCompatParcelizer, ImeOptionsCompanion.serializer}, getCieXyz.write())).booleanValue()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
            }
            return createfromparcel;
        }
        int i5 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 81;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getPreviouseUduSuo getpreviouseudusuo4 = getPreviouseUduSuo.ADD_PHOTOS;
            String strIconCompatParcelizer2 = copyythsh70.IconCompatParcelizer();
            clearmetakeystates.IconCompatParcelizer = 0;
            if (crowdSourcingFloatingImageRepositoryImpl.setTooltipLastShownAddress(getpreviouseudusuo4, strIconCompatParcelizer2, clearmetakeystates) != coroutineSingletons) {
                getpreviouseudusuo = getPreviouseUduSuo.ADD_PHOTOS;
                clearmetakeystates.IconCompatParcelizer = 2;
                if (crowdSourcingFloatingImageRepositoryImpl.incrementTooltipShownCounts(getpreviouseudusuo, clearmetakeystates) == coroutineSingletons) {
                    return createfromparcel;
                }
            }
        } else {
            getPreviouseUduSuo getpreviouseudusuo5 = getPreviouseUduSuo.ADD_PHOTOS;
            String strIconCompatParcelizer3 = copyythsh70.IconCompatParcelizer();
            clearmetakeystates.IconCompatParcelizer = 1;
            if (crowdSourcingFloatingImageRepositoryImpl.setTooltipLastShownAddress(getpreviouseudusuo5, strIconCompatParcelizer3, clearmetakeystates) != coroutineSingletons) {
                getpreviouseudusuo = getPreviouseUduSuo.ADD_PHOTOS;
                clearmetakeystates.IconCompatParcelizer = 2;
                if (crowdSourcingFloatingImageRepositoryImpl.incrementTooltipShownCounts(getpreviouseudusuo, clearmetakeystates) == coroutineSingletons) {
                    return createfromparcel;
                }
            }
        }
        return coroutineSingletons;
    }

    @Override // o.copywBHncE4default
    public final void IconCompatParcelizer(FragmentActivity fragmentActivity, InputMethodManagerImplimm2 inputMethodManagerImplimm2, String str) {
        int i = RoutesDataNative.RoutesDataPeerCleaner.read();
        int i2 = RoutesDataNative.RoutesDataPeerCleaner.read();
        int i3 = RoutesDataNative.RoutesDataPeerCleaner.read();
        read(-1344353779, 1344353779, RoutesDataNative.RoutesDataPeerCleaner.read(), new Object[]{this, fragmentActivity, inputMethodManagerImplimm2, str}, i, i3, i2);
    }

    @Override // o.copywBHncE4default
    public final void RatingCompat() {
        int i = RoutesDataNative.RoutesDataPeerCleaner.read();
        int i2 = RoutesDataNative.RoutesDataPeerCleaner.read();
        int i3 = RoutesDataNative.RoutesDataPeerCleaner.read();
        read(853279904, -853279903, RoutesDataNative.RoutesDataPeerCleaner.read(), new Object[]{this}, i, i3, i2);
    }
}
