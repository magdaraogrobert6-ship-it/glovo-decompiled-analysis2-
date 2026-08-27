package com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.navigator.R;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.data.CrowdSourcingFloatingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.upload.usecases.ObserveUploadCompletionUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$combine$1$3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.GapBufferKt;
import o.InputMethodManagerImplimm2;
import o.ShortNewsContentCardView;
import o.accessgetSentencescp;
import o.accessgetWordscp;
import o.closeConnection;
import o.copyYTHSh70;
import o.copyYTHSh70default;
import o.copyuxg59PA;
import o.copywBHncE4default;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getDoneeUduSuo;
import o.getHintLocales;
import o.getQueryContext;
import o.getSingleLine;
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
public final class CrowdSourcingFloatingImageCameraOnlyUiModelImpl implements copywBHncE4default {
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
    private static int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 1;
    public final StateFlow ComponentActivity;
    public final getQueryContext IconCompatParcelizer;
    public final getDoneeUduSuo MediaBrowserCompatMediaItem;
    public final ContextScope MediaDescriptionCompat;
    public final IsFixableByRetry MediaMetadataCompat;
    public final CrowdSourcingFloatingImageRepositoryImpl MediaSessionCompatQueueItem;
    public final ObserveUploadCompletionUseCase MediaSessionCompatResultReceiverWrapper;
    public final StateFlow MediaSessionCompatToken;
    public final g0 ParcelableVolumeInfo;
    public final isOpenInternalroom_runtime PlaybackStateCompat;
    public final GetCrowdSourcingEntryPointScreenImpl PlaybackStateCompatCustomAction;
    public final CrowdSourcingImageRepositoryImpl RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ResultReceiver;
    public final n0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final StateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final isResumed read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int serializer = 0;
        private static int write = 1;
        public final /* synthetic */ CrowdSourcingFloatingImageCameraOnlyUiModelImpl IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public int read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = crowdSourcingFloatingImageCameraOnlyUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = write + 119;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.RemoteActionCompatParcelizer;
            CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl = this.IconCompatParcelizer;
            if (i5 == 0) {
                return new AnonymousClass1(crowdSourcingFloatingImageCameraOnlyUiModelImpl, shortNewsContentCardView, 0);
            }
            int i6 = 1;
            if (i5 != 1) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(crowdSourcingFloatingImageCameraOnlyUiModelImpl, shortNewsContentCardView, i);
                int i7 = serializer + 95;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return anonymousClass1;
            }
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(crowdSourcingFloatingImageCameraOnlyUiModelImpl, shortNewsContentCardView, i6);
            int i9 = write + 111;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = write + 91;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 == 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            if (i4 != 1) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = write + 123;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = serializer + 93;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl = this.IconCompatParcelizer;
            int i6 = 25;
            int i7 = 9;
            ShortNewsContentCardView shortNewsContentCardView = null;
            int i8 = 1;
            if (i5 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                SignInDataStore$get$$inlined$map$1 signInDataStore$get$$inlined$map$1 = new SignInDataStore$get$$inlined$map$1(FlowKt.serializer(new ObserveImageSharingUiState$invoke$$inlined$map$1(crowdSourcingFloatingImageCameraOnlyUiModelImpl.RatingCompat.serializer(), i)), crowdSourcingFloatingImageCameraOnlyUiModelImpl, i7);
                LocalAuthDataSource.AnonymousClass2 anonymousClass2 = new LocalAuthDataSource.AnonymousClass2(crowdSourcingFloatingImageCameraOnlyUiModelImpl, shortNewsContentCardView, i6);
                this.read = 1;
                return FlowKt.collectLatest(signInDataStore$get$$inlined$map$1, anonymousClass2, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i5 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.read;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ChannelFlowTransformLatest channelFlowTransformLatestRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(FlowKt.serializer(new ObserveDivider$invoke$$inlined$map$1(new SignInDataStore$get$$inlined$map$1(FlowKt.serializer(new ObserveImageSharingUiState$invoke$$inlined$map$1(crowdSourcingFloatingImageCameraOnlyUiModelImpl.RatingCompat.serializer(), i)), crowdSourcingFloatingImageCameraOnlyUiModelImpl, i7), 10)), new SettingsViewModel$special$$inlined$combine$1$3(shortNewsContentCardView, crowdSourcingFloatingImageCameraOnlyUiModelImpl, 4));
                closeConnection closeconnection = new closeConnection(crowdSourcingFloatingImageCameraOnlyUiModelImpl, 0);
                this.read = 1;
                if (channelFlowTransformLatestRemoteActionCompatParcelizer.collect(closeconnection, this) != coroutineSingletons2) {
                    return createfromparcel;
                }
                int i11 = write + 25;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return coroutineSingletons2;
                }
                throw null;
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = this.read;
            if (i12 != 0) {
                int i13 = serializer + 109;
                write = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0 ? i12 != 1 : i12 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1Serializer = FlowKt.serializer(crowdSourcingFloatingImageCameraOnlyUiModelImpl.read.IconCompatParcelizer, 16L);
            closeConnection closeconnection2 = new closeConnection(crowdSourcingFloatingImageCameraOnlyUiModelImpl, i8);
            this.read = 1;
            if (flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1Serializer.collect(closeconnection2, this) != coroutineSingletons3) {
                return createfromparcel;
            }
            int i14 = write + 51;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            return coroutineSingletons3;
        }
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i4;
        int i10 = i3 | i7;
        int i11 = (~(i3 | i4)) | (~(i7 | (~i4) | i8)) | (~(i4 | i6));
        int i12 = i4 + i6 + i2 + (764943627 * i5) + (189947931 * i);
        int i13 = i12 * i12;
        int i14 = ((i4 * (-973936384)) - 801505280) + ((-973936384) * i6) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i2) + ((-1475084288) * i5) + ((-1479278592) * i) + ((-626393088) * i13);
        int i15 = (i4 * 1860537600) + 224780607 + (i6 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i2 * 1860538117) + (i5 * (-1861700041)) + (i * (-831392377)) + (i13 * 995229696);
        if (i14 + (i15 * i15 * 1053163520) != 1) {
            return write(objArr);
        }
        int i16 = 2 % 2;
        int i17 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 9;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return null;
    }

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaSessionCompatToken;
        int i5 = i3 + 67;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    @Override // o.copywBHncE4default
    public final StateFlow RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 95;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.ComponentActivity;
        int i5 = i3 + 97;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    @Override // o.copywBHncE4default
    public final getQueryContext read() {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 19;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getQueryContext getquerycontext = this.IconCompatParcelizer;
        int i4 = i3 + 35;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getquerycontext;
        }
        throw null;
    }

    @Override // o.copywBHncE4default
    public final StateFlow write() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 89;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CrowdSourcingFloatingImageCameraOnlyUiModelImpl(transferSessionPackageI transfersessionpackagei, getQueryContext getquerycontext, isResumed isresumed, CrowdSourcingImageRepositoryImpl crowdSourcingImageRepositoryImpl, CrowdSourcingFloatingImageRepositoryImpl crowdSourcingFloatingImageRepositoryImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, GetCrowdSourcingEntryPointScreenImpl getCrowdSourcingEntryPointScreenImpl, n0 n0Var, IsFixableByRetry isFixableByRetry, g0 g0Var, getDoneeUduSuo getdoneeudusuo, ObserveUploadCompletionUseCase observeUploadCompletionUseCase, ContextScope contextScope) {
        transfersessionpackagei.getClass();
        getquerycontext.getClass();
        isresumed.getClass();
        crowdSourcingImageRepositoryImpl.getClass();
        crowdSourcingFloatingImageRepositoryImpl.getClass();
        isopeninternalroom_runtime.getClass();
        getCrowdSourcingEntryPointScreenImpl.getClass();
        n0Var.getClass();
        isFixableByRetry.getClass();
        g0Var.getClass();
        getdoneeudusuo.getClass();
        observeUploadCompletionUseCase.getClass();
        this.IconCompatParcelizer = getquerycontext;
        this.read = isresumed;
        this.RatingCompat = crowdSourcingImageRepositoryImpl;
        this.MediaSessionCompatQueueItem = crowdSourcingFloatingImageRepositoryImpl;
        this.PlaybackStateCompat = isopeninternalroom_runtime;
        this.PlaybackStateCompatCustomAction = getCrowdSourcingEntryPointScreenImpl;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = n0Var;
        this.MediaMetadataCompat = isFixableByRetry;
        this.ParcelableVolumeInfo = g0Var;
        this.MediaBrowserCompatMediaItem = getdoneeudusuo;
        this.MediaSessionCompatResultReceiverWrapper = observeUploadCompletionUseCase;
        this.MediaDescriptionCompat = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getSingleLine.read);
        this.write = mutableStateFlow;
        this.ComponentActivity = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow2;
        this.MediaSessionCompatToken = mutableStateFlow2;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(Float.valueOf(1.0f));
        this.RemoteActionCompatParcelizer = mutableStateFlow3;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableStateFlow3;
        Object[] objArr = {(FirebaseRemoteConfigImpl) transfersessionpackagei, updateAdidI.IS_CROWD_SOURCING_ENABLED};
        int iSerializer = R.serializer();
        int i = 2;
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), iSerializer, objArr)).booleanValue()) {
            ShortNewsContentCardView shortNewsContentCardView = null;
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, i), 3);
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 75;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        int i5 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 91;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // o.copywBHncE4default
    public final void IconCompatParcelizer(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 113;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaBrowserCompatMediaItem.read(getUnspecifiedeUduSuo.FRONTEND_SUCCESS);
        this.ParcelableVolumeInfo.getClass();
        g0.write(fragmentActivity);
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 57;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.copywBHncE4default
    public final void IconCompatParcelizer(copyYTHSh70 copyythsh70) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        Object objRemoteActionCompatParcelizer;
        copyYTHSh70 copyythsh71;
        int i;
        int i2 = 2 % 2;
        do {
            mutableStateFlow = this.write;
            obj = mutableStateFlow.read();
            objRemoteActionCompatParcelizer = (copyYTHSh70default) obj;
            if (objRemoteActionCompatParcelizer instanceof copyYTHSh70) {
                int i3 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 93;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                copyythsh71 = (copyYTHSh70) objRemoteActionCompatParcelizer;
            } else {
                copyythsh71 = null;
            }
            if (copyythsh71 == null) {
                i = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 101;
            } else {
                Object[] objArr = {copyythsh70.RemoteActionCompatParcelizer(), copyythsh71.RemoteActionCompatParcelizer()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    objRemoteActionCompatParcelizer = copyythsh71.RemoteActionCompatParcelizer(true);
                    i = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 119;
                }
            }
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i % Fields.SpotShadowColor;
            int i5 = i % 2;
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, objRemoteActionCompatParcelizer));
    }

    @Override // o.copywBHncE4default
    public final void RatingCompat() {
        int i = 2 % 2;
        copyYTHSh70default copyythsh70default = (copyYTHSh70default) this.ComponentActivity.read();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!(copyythsh70default instanceof copyYTHSh70)) {
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 117;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.ResultReceiver;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        ((inCompatibilityMode) this.PlaybackStateCompat).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.ResultReceiver = BuildersKt.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1(this, (copyYTHSh70) copyythsh70default, shortNewsContentCardView, 1), 2);
        int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 9;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl = (CrowdSourcingFloatingImageCameraOnlyUiModelImpl) objArr[0];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        InputMethodManagerImplimm2 inputMethodManagerImplimm2 = (InputMethodManagerImplimm2) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        int i2 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 21;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        inputMethodManagerImplimm2.getClass();
        str.getClass();
        if (inputMethodManagerImplimm2.equals(updateSelection.RemoteActionCompatParcelizer)) {
            int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 79;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            crowdSourcingFloatingImageCameraOnlyUiModelImpl.MediaMetadataCompat.getClass();
            IsFixableByRetry.read(fragmentActivity, str, "content_sharing_submitted_from_floating_button");
            return null;
        }
        if (!inputMethodManagerImplimm2.equals(accessgetWordscp.IconCompatParcelizer)) {
            if (inputMethodManagerImplimm2.equals(accessgetSentencescp.write)) {
                crowdSourcingFloatingImageCameraOnlyUiModelImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                n0.IconCompatParcelizer(fragmentActivity, str);
                int i6 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 1;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 70 / 0;
                }
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        return null;
    }

    @Override // o.copywBHncE4default
    public final void serializer() {
        int i;
        int i2 = 2 % 2;
        int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 13;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object obj = this.ComponentActivity.read();
        ShortNewsContentCardView shortNewsContentCardView = null;
        copyYTHSh70 copyythsh70 = obj instanceof copyYTHSh70 ? (copyYTHSh70) obj : null;
        if (copyythsh70 == null) {
            return;
        }
        int i5 = 0;
        if (copyythsh70 instanceof copyuxg59PA) {
            int i6 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 113;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = ((copyuxg59PA) copyythsh70).MediaBrowserCompatMediaItem;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            i = ((copyuxg59PA) copyythsh70).MediaBrowserCompatMediaItem;
        } else {
            if (!(copyythsh70 instanceof getHintLocales)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            int i8 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 71;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = 0;
        }
        this.MediaBrowserCompatMediaItem.serializer(i);
        BuildersKt.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, null, null, new CrowdSourcingFloatingImageCameraOnlyUiModelImpl$onClick$1(this, copyythsh70, shortNewsContentCardView, i5), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r3.incrementTooltipShownCounts(r0, r4) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$saveTooltipShownRecord(com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl r16, o.copyYTHSh70 r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl.access$saveTooltipShownRecord(com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl, o.copyYTHSh70, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (r1 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (r1 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r16 = r1;
        r1 = r0;
        r0 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$isTooltipAvailable(com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl r17, java.lang.String r18, o.getPreviouseUduSuo r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl.access$isTooltipAvailable(com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl, java.lang.String, o.getPreviouseUduSuo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // o.copywBHncE4default
    public final void IconCompatParcelizer(FragmentActivity fragmentActivity, InputMethodManagerImplimm2 inputMethodManagerImplimm2, String str) {
        int iSerializer = GapBufferKt.serializer();
        RemoteActionCompatParcelizer(new Object[]{this, fragmentActivity, inputMethodManagerImplimm2, str}, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer, 1925656231, GapBufferKt.serializer(), -1925656231);
    }

    @Override // o.copywBHncE4default
    public final void MediaBrowserCompatMediaItem() {
        int iSerializer = GapBufferKt.serializer();
        RemoteActionCompatParcelizer(new Object[]{this}, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer, 1606087669, GapBufferKt.serializer(), -1606087668);
    }
}
