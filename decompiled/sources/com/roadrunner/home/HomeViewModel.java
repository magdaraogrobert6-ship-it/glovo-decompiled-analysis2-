package com.roadrunner.home;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Application;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.ViewModel;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.zzw;
import com.huawei.agconnect.config.impl.m;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.navigation.ui.maps.camera.NavigationCamera;
import com.mapbox.navigation.ui.maps.camera.state.NavigationCameraState;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.common.data.model.TrackingEventExtensionsKt;
import com.roadrunner.delivery.ontheway.navigation.presentation.NavigationButtonUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.navigation.CodeScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.QrScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl;
import com.roadrunner.home.nest.NestLoadingServiceImpl;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.liveness.api.recording.CameraImage;
import com.roadrunner.liveness.domain.CreateMultipartForLivenessUploadImpl;
import com.roadrunner.liveness.recording.data.ChallengesRepository;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel$startTimer$1;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.login.presentation.countryselection.CountrySelectionViewModel;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerUiModelImpl;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.settings.SettingsViewModel;
import com.roadrunner.settings.SettingsViewModel$load$1;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.core.model.events.C$b;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import io.sentry.util.UrlUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AdjustDeeplink;
import o.AudioAttributesImplBaseParcelizer;
import o.ComposeAnimationState;
import o.Constraints;
import o.FontScalingLinearDefaultImpls;
import o.IntOffsetCompanion;
import o.ItemTouchHelperAdapter;
import o.LayoutDirection;
import o.PreviewContainer;
import o.PreviewParameter;
import o.RgbCompanionExternalSyntheticLambda0;
import o.RoomOpenHelperDelegate;
import o.ShortNewsContentCardView;
import o.SystemLifecycleSystemLifecycleCallback;
import o.TwoStatePreference;
import o.WrongFragmentContainerViolation;
import o.accessgetSimplecp;
import o.consumeFlingInStretch;
import o.copyiSbpLlY;
import o.createFromParcel;
import o.createOpenHelper;
import o.decode;
import o.displayInAppMessagelambda1;
import o.divGh9hcWk;
import o.expandFieldArray;
import o.fastZipWithNext;
import o.fromCongestionValuenavigation_release;
import o.generatePOSTBodyString;
import o.getConnectivityType;
import o.getContentViewGroupParentLayout;
import o.getInAppMessageViewLifecycleListener;
import o.getMaxDuration;
import o.getPhrasejp8hJ3c;
import o.getQueryExecutor;
import o.getSupportLoaderManager;
import o.getVerticalScrollFactorCompat;
import o.ia;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.internalInitInvalidationTracker;
import o.isAdapterPositionOnScreen;
import o.isContainerdelegate;
import o.isInLayout;
import o.isOpenInternalroom_runtime;
import o.isVerticalSwipeInAllowedDirection;
import o.lerp81ZRxRo;
import o.makeContentView;
import o.maxAllowedForSize;
import o.onAttachFragment;
import o.onContentCardDismissed;
import o.onEnterLayoutOrScroll;
import o.onExitLayoutOrScroll;
import o.onItemDismiss;
import o.onPrimaryNavigationFragmentChanged;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareForActivityTransitionCarryover;
import o.provideInsetsValuescytEWk0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.readDataOrHandleCorruption;
import o.remBjo55l4;
import o.removeGlobalPartnerParameter;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.restoreChildFragmentState;
import o.setBaselineShift0ocSgnM;
import o.setCoppaComplianceInDelay;
import o.setDebugAssertionsEnabled;
import o.setOnEventTrackingSucceededListener;
import o.setOnScrollChangeListener;
import o.setSdkPrefix;
import o.setTransactionSuccessful;
import o.startActivity;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateHasCallbacks;
import o.verifyPlayStorePurchaseI;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeViewModel extends ViewModel {
    private static int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
    private static int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 1;
    public final isAdapterPositionOnScreen ComponentActivity;
    public final transferSessionPackageI IconCompatParcelizer;
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public final getSupportLoaderManager MediaDescriptionCompat;
    public final WrongFragmentContainerViolation MediaMetadataCompat;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public final isAdapterPositionOnScreen MediaSessionCompatResultReceiverWrapper;
    public final CallTracer MediaSessionCompatToken;
    public final setDebugAssertionsEnabled ParcelableVolumeInfo;
    public final ContextScope PlaybackStateCompat;
    public final onAttachFragment PlaybackStateCompatCustomAction;
    public final fastZipWithNext RatingCompat;
    public final startActivity RemoteActionCompatParcelizer;
    public final consumeFlingInStretch ResultReceiver;
    public final isAdapterPositionOnScreen r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final SharedResourcePool r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final onEnterLayoutOrScroll r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final getContentViewGroupParentLayout r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final RecenterMapTriggerImpl r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final restoreChildFragmentState r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final SafeAreaPublisherImpl r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final isAdapterPositionOnScreen read;
    public final isAdapterPositionOnScreen serializer;
    public final NetworkErrorMapperImpl write;

    /* JADX INFO: renamed from: com.roadrunner.home.HomeViewModel$onCleared$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int read = 0;
        private static int serializer = 1;
        public final /* synthetic */ Object IconCompatParcelizer;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.write;
            Object obj2 = this.IconCompatParcelizer;
            int i4 = 17;
            int i5 = 0;
            switch (i3) {
                case 0:
                    return new AnonymousClass1((HomeViewModel) obj2, shortNewsContentCardView, i5);
                case 1:
                    return new AnonymousClass1((NavigationButtonUiModelImpl) obj2, shortNewsContentCardView, 1);
                case 2:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((getPhrasejp8hJ3c) obj2, shortNewsContentCardView, i);
                    int i6 = read + 17;
                    serializer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        int i7 = 78 / 0;
                    }
                    return anonymousClass1;
                case 3:
                    return new AnonymousClass1((BluetoothScanPermissionDialogFragment) obj2, shortNewsContentCardView, 3);
                case 4:
                    return new AnonymousClass1((CustomerUnavailableViewModel) obj2, shortNewsContentCardView, 4);
                case 5:
                    return new AnonymousClass1((CodeScanFragment) obj2, shortNewsContentCardView, 5);
                case 6:
                    return new AnonymousClass1((IntOffsetCompanion) obj2, shortNewsContentCardView, 6);
                case 7:
                    return new AnonymousClass1((PinScreenFragment) obj2, shortNewsContentCardView, 7);
                case 8:
                    return new AnonymousClass1((QrScannerFragment) obj2, shortNewsContentCardView, 8);
                case 9:
                    return new AnonymousClass1((String) obj2, shortNewsContentCardView, 9);
                case 10:
                    return new AnonymousClass1((Constraints) obj2, shortNewsContentCardView, 10);
                case 11:
                    return new AnonymousClass1((m) obj2, shortNewsContentCardView, 11);
                case 12:
                    return new AnonymousClass1((RgbCompanionExternalSyntheticLambda0) obj2, shortNewsContentCardView, 12);
                case 13:
                    return new AnonymousClass1((GoAndStartInformationUiModelImpl) obj2, shortNewsContentCardView, 13);
                case 14:
                    return new AnonymousClass1((readDataOrHandleCorruption) obj2, shortNewsContentCardView, 14);
                case 15:
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1((SignInDataStore) obj2, shortNewsContentCardView, 15);
                    int i8 = serializer + 119;
                    read = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        int i9 = 92 / 0;
                    }
                    return anonymousClass2;
                case 16:
                    return new AnonymousClass1((SignInDataStore) obj2, shortNewsContentCardView, 16);
                case 17:
                    return new AnonymousClass1((getQueryExecutor) obj2, shortNewsContentCardView, i4);
                case 18:
                    return new AnonymousClass1((CreateMultipartForLivenessUploadImpl) obj2, shortNewsContentCardView, 18);
                case 19:
                    return new AnonymousClass1((RecordingViewModel) obj2, shortNewsContentCardView, 19);
                case 20:
                    return new AnonymousClass1((CountrySelectionViewModel) obj2, shortNewsContentCardView, 20);
                case 21:
                    return new AnonymousClass1((GetAuthStateViewModel) obj2, shortNewsContentCardView, 21);
                case 22:
                    return new AnonymousClass1((SignInViewModel) obj2, shortNewsContentCardView, 22);
                case 23:
                    return new AnonymousClass1((BlockRunner) obj2, shortNewsContentCardView, 23);
                case 24:
                    return new AnonymousClass1((ia) obj2, shortNewsContentCardView, 24);
                case 25:
                    return new AnonymousClass1((OverlayVisibilityBannerUiModelImpl) obj2, shortNewsContentCardView, 25);
                case 26:
                    return new AnonymousClass1((removeGlobalPartnerParameter) obj2, shortNewsContentCardView, 26);
                case 27:
                    return new AnonymousClass1((DropShadowEffect) obj2, shortNewsContentCardView, 27);
                case 28:
                    return new AnonymousClass1((SettingsViewModel) obj2, shortNewsContentCardView, 28);
                default:
                    return new AnonymousClass1((ComponentRegistry$Builder) obj2, shortNewsContentCardView, 29);
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = read + 69;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            switch (i4) {
                case 0:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 1:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 2:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 3:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 4:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 5:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 6:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 7:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 8:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 9:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 10:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 11:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 12:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 13:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 14:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 15:
                    ((AnonymousClass1) create((expandFieldArray) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 16:
                    ((AnonymousClass1) create((AudioAttributesImplBaseParcelizer) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 17:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 18:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 19:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 20:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 21:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 22:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 23:
                    Object objInvokeSuspend = ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i5 = read + 105;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return objInvokeSuspend;
                case 24:
                    ((AnonymousClass1) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 25:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 26:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 27:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 28:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i7 = serializer + 61;
                    read = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                default:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            getMaxDuration getmaxduration;
            PreviewContainer previewContainer;
            ComposeAnimationState composeAnimationState;
            List list;
            setSdkPrefix setsdkprefix;
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = this.IconCompatParcelizer;
            int i4 = 0;
            ShortNewsContentCardView shortNewsContentCardView = null;
            switch (i3) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    YieldKt.write(((HomeViewModel) obj3).PlaybackStateCompat, (CancellationException) null);
                    return createfromparcel;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    NavigationButtonUiModelImpl navigationButtonUiModelImpl = (NavigationButtonUiModelImpl) obj3;
                    setBaselineShift0ocSgnM setbaselineshift0ocsgnm = navigationButtonUiModelImpl.MediaDescriptionCompat.RemoteActionCompatParcelizer.serializer;
                    setbaselineshift0ocsgnm.IconCompatParcelizer.logEvent("navigation_error_back_clicked", setbaselineshift0ocsgnm.write.write());
                    navigationButtonUiModelImpl.RatingCompat.IconCompatParcelizer.write(new accessgetSimplecp("navigation_error_back_clicked"));
                    return createfromparcel;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getPhrasejp8hJ3c getphrasejp8hj3c = (getPhrasejp8hJ3c) obj3;
                    getphrasejp8hj3c.RemoteActionCompatParcelizer.logEvent("deliveries_navigation_agent_chat", getphrasejp8hj3c.IconCompatParcelizer.write());
                    return createfromparcel;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    internalInitInvalidationTracker internalinitinvalidationtracker = ((BluetoothScanPermissionDialogFragment) obj3).getSavedStateRegistry;
                    if (internalinitinvalidationtracker == null) {
                        removeNodeAtDepth.serializer("stateHolder");
                        throw null;
                    }
                    int i5 = serializer + 125;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        internalinitinvalidationtracker.write();
                        return createfromparcel;
                    }
                    internalinitinvalidationtracker.write();
                    shortNewsContentCardView.hashCode();
                    throw null;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    CustomerUnavailableViewModel customerUnavailableViewModel = (CustomerUnavailableViewModel) obj3;
                    customerUnavailableViewModel.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jRemoteActionCompatParcelizer = customerUnavailableViewModel.RemoteActionCompatParcelizer() * 1000;
                    MutableStateFlow mutableStateFlow = customerUnavailableViewModel.serializer;
                    do {
                        obj2 = mutableStateFlow.read();
                        getmaxduration = (getMaxDuration) obj2;
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getmaxduration != null ? getMaxDuration.RemoteActionCompatParcelizer(getmaxduration, false, false, new Long(jRemoteActionCompatParcelizer + jElapsedRealtime), new Long(jElapsedRealtime), null, null, 231) : null));
                    return createfromparcel;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    CodeScanViewModel codeScanViewModelSerializer = ((CodeScanFragment) obj3).serializer();
                    CodeScanTaskArgs codeScanTaskArgs = (CodeScanTaskArgs) codeScanViewModelSerializer.read.MediaSessionCompatResultReceiverWrapper();
                    if (codeScanTaskArgs == null) {
                        int i6 = read + 125;
                        serializer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("No arguments passed to CodeScanFragment", Timber.RemoteActionCompatParcelizer);
                        codeScanViewModelSerializer.MediaBrowserCompatMediaItem.serializer(maxAllowedForSize.IconCompatParcelizer);
                        int i8 = read + 25;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                    } else {
                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(codeScanViewModelSerializer), null, null, new QrCodeScanTaskUiModelImpl$1(codeScanViewModelSerializer, codeScanTaskArgs, shortNewsContentCardView, 19), 3);
                    }
                    return createfromparcel;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    IntOffsetCompanion intOffsetCompanion = (IntOffsetCompanion) obj3;
                    Object obj4 = intOffsetCompanion.write.read();
                    copyiSbpLlY copyisbplly = obj4 instanceof copyiSbpLlY ? (copyiSbpLlY) obj4 : null;
                    if (copyisbplly != null) {
                        int i10 = serializer + 109;
                        read = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 != 0) {
                            PreviewContainer previewContainer2 = copyisbplly.RemoteActionCompatParcelizer;
                            shortNewsContentCardView.hashCode();
                            throw null;
                        }
                        previewContainer = copyisbplly.RemoteActionCompatParcelizer;
                    } else {
                        previewContainer = null;
                    }
                    if (previewContainer != null && (composeAnimationState = previewContainer.scanQrCodeButton) != null && (list = composeAnimationState.trackingEvents) != null) {
                        int i11 = read + 91;
                        serializer = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 == 0) {
                            remBjo55l4 rembjo55l4 = intOffsetCompanion.RatingCompat;
                            rembjo55l4.getClass();
                            rembjo55l4.read.read(TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list, Trigger.DELIVERIES_TASK_CLICK));
                            throw null;
                        }
                        remBjo55l4 rembjo55l5 = intOffsetCompanion.RatingCompat;
                        rembjo55l5.getClass();
                        rembjo55l5.read.read(TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list, Trigger.DELIVERIES_TASK_CLICK));
                    }
                    return createfromparcel;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    PinScreenViewModel pinScreenViewModelSerializer = ((PinScreenFragment) obj3).serializer();
                    PinScreenArgs pinScreenArgs = (PinScreenArgs) pinScreenViewModelSerializer.read.MediaSessionCompatResultReceiverWrapper();
                    if (pinScreenArgs == null) {
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("No arguments passed to PinScreenFragment", Timber.RemoteActionCompatParcelizer);
                        pinScreenViewModelSerializer.MediaBrowserCompatMediaItem.serializer(divGh9hcWk.IconCompatParcelizer);
                    } else {
                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(pinScreenViewModelSerializer), null, null, new QrCodeScanTaskUiModelImpl$1(pinScreenViewModelSerializer, pinScreenArgs, shortNewsContentCardView, 22), 3);
                    }
                    return createfromparcel;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    lerp81ZRxRo lerp81zrxroSerializer = ((QrScannerFragment) obj3).serializer();
                    PreviewContainer previewContainerWrite = lerp81zrxroSerializer.write();
                    if (previewContainerWrite != null) {
                        int i12 = read + 9;
                        serializer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            PreviewParameter previewParameter = previewContainerWrite.qrScanScreen;
                            shortNewsContentCardView.hashCode();
                            throw null;
                        }
                        PreviewParameter previewParameter2 = previewContainerWrite.qrScanScreen;
                        if (previewParameter2 != null) {
                            int i13 = serializer + 1;
                            read = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            List list2 = previewParameter2.trackingEvents;
                            if (list2 != null) {
                                remBjo55l4 rembjo55l6 = lerp81zrxroSerializer.write;
                                rembjo55l6.getClass();
                                rembjo55l6.read.read(TrackingEventExtensionsKt.RemoteActionCompatParcelizer(list2, Trigger.SCREEN_OPENED));
                            }
                        }
                    }
                    QrScanTaskArgs qrScanTaskArgs = (QrScanTaskArgs) lerp81zrxroSerializer.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                    if (qrScanTaskArgs == null) {
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("No arguments passed to QrScannerFragment", Timber.RemoteActionCompatParcelizer);
                        lerp81zrxroSerializer.RatingCompat.serializer(FontScalingLinearDefaultImpls.serializer);
                    } else {
                        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(lerp81zrxroSerializer), null, null, new QrCodeScanTaskUiModelImpl$1(lerp81zrxroSerializer, qrScanTaskArgs, shortNewsContentCardView, 23), 3);
                    }
                    return createfromparcel;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    return isverticalswipeinalloweddirection.serializer((String) obj3, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(isverticalswipeinalloweddirection.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(LayoutDirection.class)));
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                    Constraints constraints = (Constraints) obj3;
                    return isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(pauseWebviewIfNecessarylambda10.IconCompatParcelizer(isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer, displayInAppMessagelambda1.IconCompatParcelizer(LayoutDirection.class)), new LayoutDirection(constraints.title, constraints.icon, constraints.tags));
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    AdjustDeeplink adjustDeeplink = (AdjustDeeplink) ((setOnEventTrackingSucceededListener) ((m) obj3).RemoteActionCompatParcelizer).RatingCompat.read();
                    if (adjustDeeplink == null || (setsdkprefix = adjustDeeplink.read) == null) {
                        return null;
                    }
                    return new Long(setsdkprefix.write);
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((RgbCompanionExternalSyntheticLambda0) obj3).write();
                    return createfromparcel;
                case 13:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GoAndStartInformationUiModelImpl goAndStartInformationUiModelImpl = (GoAndStartInformationUiModelImpl) obj3;
                    MutableStateFlow mutableStateFlow2 = goAndStartInformationUiModelImpl.IconCompatParcelizer;
                    setTransactionSuccessful settransactionsuccessful = goAndStartInformationUiModelImpl.MediaMetadataCompat;
                    mutableStateFlow2.IconCompatParcelizer(new makeContentView(new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_disclaimer_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_disclaimer_description), settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_disclaimer_btn_primary), null, settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_disclaimer_btn_secondary), 104, null), settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_disclaimer_checkbox), false));
                    return createfromparcel;
                case 14:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    readDataOrHandleCorruption readdataorhandlecorruption = (readDataOrHandleCorruption) obj3;
                    MutableStateFlow mutableStateFlow3 = readdataorhandlecorruption.read;
                    setTransactionSuccessful settransactionsuccessful2 = readdataorhandlecorruption.IconCompatParcelizer.read;
                    mutableStateFlow3.IconCompatParcelizer(new setOnScrollChangeListener(new generatePOSTBodyString(settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_title), false, settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_realtime_description), null, settransactionsuccessful2.IconCompatParcelizer(R.string.got_it), null, 116, null), SQLite.read(new getVerticalScrollFactorCompat(settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_demand_very_high_title), settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_demand_very_high_description), R.drawable.ic_demand_very_high), new getVerticalScrollFactorCompat(settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_demand_high_title), settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_demand_high_description), R.drawable.ic_demand_high), new getVerticalScrollFactorCompat(settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_demand_moderate_title), settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_demand_moderate_description), R.drawable.ic_demand_moderate), new getVerticalScrollFactorCompat(settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_demand_low_title), settransactionsuccessful2.IconCompatParcelizer(R.string.heatmap_dialog_demand_low_description), R.drawable.ic_demand_low))));
                    return createfromparcel;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    TwoStatePreference twoStatePreference = (TwoStatePreference) ((SignInDataStore) obj3).read;
                    if (twoStatePreference != null) {
                        YieldKt.write(twoStatePreference.serializer, (CancellationException) null);
                    }
                    return createfromparcel;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((NestLoadingServiceImpl) ((SignInDataStore) obj3).RemoteActionCompatParcelizer).read.IconCompatParcelizer(ItemTouchHelperAdapter.serializer);
                    return createfromparcel;
                case 17:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    createOpenHelper createopenhelper = (createOpenHelper) ((getQueryExecutor) obj3).serializer.write();
                    createopenhelper.getClass();
                    Object obj5 = ((TraceTimeMeasurementWithPerformanceKit) createopenhelper.IconCompatParcelizer).read("FoodoraStorageManager.load.".concat("CONFIG_SHARED_PREFS_LAST_LOGIN_EMAIL"), new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(26, createopenhelper));
                    obj5.getClass();
                    return obj5;
                case 18:
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    CreateMultipartForLivenessUploadImpl createMultipartForLivenessUploadImpl = (CreateMultipartForLivenessUploadImpl) obj3;
                    onExitLayoutOrScroll onexitlayoutorscroll = createMultipartForLivenessUploadImpl.read;
                    CameraImage cameraImageRemoteActionCompatParcelizer = createMultipartForLivenessUploadImpl.RemoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer();
                    if (cameraImageRemoteActionCompatParcelizer != null) {
                        return new onItemDismiss(onexitlayoutorscroll.IconCompatParcelizer(cameraImageRemoteActionCompatParcelizer.read));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("camera image object should be not null");
                    return null;
                case 19:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    RecordingViewModel recordingViewModel = (RecordingViewModel) obj3;
                    ChallengesRepository challengesRepository = recordingViewModel.read.serializer;
                    challengesRepository.getClass();
                    challengesRepository.serializer = instance_delegatelambda0.write;
                    AtomicInteger atomicInteger = challengesRepository.IconCompatParcelizer;
                    atomicInteger.set(0);
                    challengesRepository.read.set(0);
                    challengesRepository.write = (RoomOpenHelperDelegate) onContentCardDismissed.read(atomicInteger.get(), challengesRepository.serializer);
                    recordingViewModel.ParcelableVolumeInfo.IconCompatParcelizer(fromCongestionValuenavigation_release.read);
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = recordingViewModel.MediaSessionCompatToken;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    recordingViewModel.MediaSessionCompatToken = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(recordingViewModel), null, null, new RecordingViewModel$startTimer$1(recordingViewModel, shortNewsContentCardView, i), 3);
                    return createfromparcel;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((CountrySelectionViewModel) obj3).RatingCompat.read.IconCompatParcelizer("Select Country", null);
                    return createfromparcel;
                case 21:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((isContainerdelegate) ((GetAuthStateViewModel) obj3).ResultReceiver).write("Identity Verification Canceled during auto login");
                    return createfromparcel;
                case 22:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SignInViewModel signInViewModel = (SignInViewModel) obj3;
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(signInViewModel), null, null, new ReconnectScheduler$schedule$1(signInViewModel, shortNewsContentCardView, 16), 3);
                    signInViewModel.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("Login", null);
                    SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback = signInViewModel.RatingCompat;
                    systemLifecycleSystemLifecycleCallback.MediaDescriptionCompat();
                    systemLifecycleSystemLifecycleCallback.MediaBrowserCompatMediaItem();
                    return createfromparcel;
                case 23:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    verifyPlayStorePurchaseI verifyplaystorepurchasei = (verifyPlayStorePurchaseI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(-383819351, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), 383819352, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) ((transferSessionPackageI) ((BlockRunner) obj3).RatingCompat)});
                    int i15 = serializer + 87;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    return verifyplaystorepurchasei;
                case 24:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ia iaVar = (ia) obj3;
                    iaVar.serializer.IconCompatParcelizer.write(createfromparcel);
                    NavigationCamera navigationCamera = iaVar.MediaBrowserCompatMediaItem;
                    NavigationCameraState navigationCameraState = navigationCamera != null ? navigationCamera.state : null;
                    NavigationCameraState navigationCameraState2 = NavigationCameraState.IDLE;
                    if (navigationCameraState != navigationCameraState2) {
                        int i17 = read + 73;
                        serializer = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            throw null;
                        }
                        if (navigationCamera != null && navigationCamera.state != navigationCameraState2) {
                            BlockRunner blockRunner = navigationCamera.runningAnimation;
                            if (blockRunner != null) {
                                ((AnimatorSet) blockRunner.RatingCompat).cancel();
                                CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) blockRunner.read;
                                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) blockRunner.RemoteActionCompatParcelizer;
                                ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).unregisterAnimators((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length), false);
                            }
                            navigationCamera.runningAnimation = null;
                            navigationCamera.frameTransitionOptions = NavigationCamera.DEFAULT_FRAME_TRANSITION_OPT;
                            navigationCamera.setState(navigationCameraState2);
                        }
                    }
                    return createfromparcel;
                case 25:
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ff$$ExternalSyntheticOutline0.m("screenName", "Searching for deliveries", ((OverlayVisibilityBannerUiModelImpl) obj3).MediaBrowserCompatMediaItem.serializer, "overlay_go_to_settings");
                    return createfromparcel;
                case 26:
                    removeGlobalPartnerParameter removeglobalpartnerparameter = (removeGlobalPartnerParameter) obj3;
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    try {
                        removeglobalpartnerparameter.read.write();
                        break;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Failed to fetch country list for picker", new Object[0]);
                        removeglobalpartnerparameter.MediaBrowserCompatMediaItem.serializer(new setCoppaComplianceInDelay(removeglobalpartnerparameter.MediaSessionCompatToken.read(e2, null, null)));
                    }
                    return createfromparcel;
                case 27:
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((decode) ((DropShadowEffect) obj3).read).IconCompatParcelizer("Rider Safety Permission", null);
                    return createfromparcel;
                case 28:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SettingsViewModel settingsViewModel = (SettingsViewModel) obj3;
                    settingsViewModel.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(settingsViewModel), null, null, new SettingsViewModel$load$1(settingsViewModel, shortNewsContentCardView, i4), 3);
                    C$b c$b = settingsViewModel.RatingCompat;
                    zzw zzwVarRemoteActionCompatParcelizer = ((provideInsetsValuescytEWk0) c$b.serializer).RemoteActionCompatParcelizer();
                    zzwVarRemoteActionCompatParcelizer.getClass();
                    zzwVarRemoteActionCompatParcelizer.addOnSuccessListener(new d0$$ExternalSyntheticLambda0(5, new TncContentKt$$ExternalSyntheticLambda2(20, c$b)));
                    return createfromparcel;
                default:
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Toast.makeText((Application) ((ComponentRegistry$Builder) obj3).write, R.string.error_no_navigation_app, 0).show();
                    return createfromparcel;
            }
        }
    }

    public HomeViewModel(getSupportLoaderManager getsupportloadermanager, onAttachFragment onattachfragment, onEnterLayoutOrScroll onenterlayoutorscroll, setDebugAssertionsEnabled setdebugassertionsenabled, startActivity startactivity, fastZipWithNext fastzipwithnext, restoreChildFragmentState restorechildfragmentstate, CallTracer callTracer, NetworkErrorMapperImpl networkErrorMapperImpl, SharedResourcePool sharedResourcePool, SafeAreaPublisherImpl safeAreaPublisherImpl, RecenterMapTriggerImpl recenterMapTriggerImpl, WrongFragmentContainerViolation wrongFragmentContainerViolation, consumeFlingInStretch consumeflinginstretch, getConnectivityType getconnectivitytype, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout, CreateHomeScope createHomeScope) {
        getsupportloadermanager.getClass();
        onattachfragment.getClass();
        onenterlayoutorscroll.getClass();
        setdebugassertionsenabled.getClass();
        startactivity.getClass();
        fastzipwithnext.getClass();
        restorechildfragmentstate.getClass();
        callTracer.getClass();
        networkErrorMapperImpl.getClass();
        sharedResourcePool.getClass();
        safeAreaPublisherImpl.getClass();
        recenterMapTriggerImpl.getClass();
        wrongFragmentContainerViolation.getClass();
        consumeflinginstretch.getClass();
        getconnectivitytype.getClass();
        transfersessionpackagei.getClass();
        getcontentviewgroupparentlayout.getClass();
        createHomeScope.getClass();
        this.MediaDescriptionCompat = getsupportloadermanager;
        this.PlaybackStateCompatCustomAction = onattachfragment;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = onenterlayoutorscroll;
        this.ParcelableVolumeInfo = setdebugassertionsenabled;
        this.RemoteActionCompatParcelizer = startactivity;
        this.RatingCompat = fastzipwithnext;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = restorechildfragmentstate;
        this.MediaSessionCompatToken = callTracer;
        this.write = networkErrorMapperImpl;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sharedResourcePool;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = safeAreaPublisherImpl;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = recenterMapTriggerImpl;
        this.MediaMetadataCompat = wrongFragmentContainerViolation;
        this.ResultReceiver = consumeflinginstretch;
        this.IconCompatParcelizer = transfersessionpackagei;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = getcontentviewgroupparentlayout;
        ((inCompatibilityMode) ((isOpenInternalroom_runtime) createHomeScope.read)).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.PlaybackStateCompat = YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()).plus(new getInAppMessageViewLifecycleListener("HomeScope")));
        final int i = 0;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.isDetached
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ HomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 83;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                HomeViewModel homeViewModel = this.serializer;
                if (i5 == 0) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) homeViewModel.IconCompatParcelizer;
                    firebaseRemoteConfigImpl.getClass();
                    return Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED));
                }
                if (i5 == 1) {
                    getSupportLoaderManager getsupportloadermanager2 = homeViewModel.MediaDescriptionCompat;
                    ContextScope contextScope = homeViewModel.PlaybackStateCompat;
                    getsupportloadermanager2.getClass();
                    contextScope.getClass();
                    CombinedScopeView combinedScopeView = getsupportloadermanager2.IconCompatParcelizer;
                    combinedScopeView.getClass();
                    Path$Companion path$Companion = new Path$Companion();
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = (GetTargetFragmentRequestCodeUsageViolation) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
                    objWrite2.getClass();
                    return new markFragmentsCreated(path$Companion, getTargetFragmentRequestCodeUsageViolation, (consumeFlingInStretch) objWrite2, (setReenterTransition) ((setVerticalBias) combinedScopeView.write).write(), contextScope);
                }
                if (i5 != 2) {
                    if (i5 == 3) {
                        return homeViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(homeViewModel.PlaybackStateCompat);
                    }
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return ((disableUseBoundsForWidth) homeViewModel.RatingCompat).RemoteActionCompatParcelizer(homeViewModel.PlaybackStateCompat);
                        }
                        startActivity startactivity2 = homeViewModel.RemoteActionCompatParcelizer;
                        ContextScope contextScope2 = homeViewModel.PlaybackStateCompat;
                        startactivity2.getClass();
                        contextScope2.getClass();
                        Object obj = startactivity2.serializer.RemoteActionCompatParcelizer.write;
                        obj.getClass();
                        return new startPostponedEnterTransition((shouldShowRequestPermissionRationale) obj, contextScope2);
                    }
                    setDebugAssertionsEnabled setdebugassertionsenabled2 = homeViewModel.ParcelableVolumeInfo;
                    ContextScope contextScope3 = homeViewModel.PlaybackStateCompat;
                    setdebugassertionsenabled2.getClass();
                    contextScope3.getClass();
                    getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = new getDecoratedBoundsWithMarginsInt((access500) ((clearNestedRecyclerViewIfNotNested) setdebugassertionsenabled2.serializer.serializer).write(), contextScope3);
                    int i6 = IconCompatParcelizer + 49;
                    write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return getdecoratedboundswithmarginsint;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onAttachFragment onattachfragment2 = homeViewModel.PlaybackStateCompatCustomAction;
                ContextScope contextScope4 = homeViewModel.PlaybackStateCompat;
                onattachfragment2.getClass();
                contextScope4.getClass();
                androidx.work.impl.WorkerWrapper.Builder builder = onattachfragment2.read;
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
                objWrite3.getClass();
                performPrepareOptionsMenu performprepareoptionsmenu = (performPrepareOptionsMenu) objWrite3;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
                objWrite4.getClass();
                performPause performpause = (performPause) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
                objWrite5.getClass();
                onContextItemSelected oncontextitemselected = (onContextItemSelected) objWrite5;
                RouterLogger routerLogger = (RouterLogger) ((setVerticalBias) builder.MediaBrowserCompatMediaItem).write();
                onCreateAnimation oncreateanimation = new onCreateAnimation();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
                objWrite6.getClass();
                consumeFlingInStretch consumeflinginstretch2 = (consumeFlingInStretch) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.IconCompatParcelizer).write();
                objWrite7.getClass();
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
                objWrite8.getClass();
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = new HomeBottomSheetUiModelImpl(performprepareoptionsmenu, performpause, oncontextitemselected, routerLogger, oncreateanimation, consumeflinginstretch2, (isStateSaved) objWrite7, (getNoneeUduSuo) objWrite8, contextScope4);
                int i7 = IconCompatParcelizer + 21;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 53 / 0;
                }
                return homeBottomSheetUiModelImpl;
            }
        });
        final int i2 = 3;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 20), 3);
        getconnectivitytype.read();
        final int i3 = 1;
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.isDetached
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ HomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = IconCompatParcelizer + 83;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                HomeViewModel homeViewModel = this.serializer;
                if (i7 == 0) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) homeViewModel.IconCompatParcelizer;
                    firebaseRemoteConfigImpl.getClass();
                    return Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED));
                }
                if (i7 == 1) {
                    getSupportLoaderManager getsupportloadermanager2 = homeViewModel.MediaDescriptionCompat;
                    ContextScope contextScope = homeViewModel.PlaybackStateCompat;
                    getsupportloadermanager2.getClass();
                    contextScope.getClass();
                    CombinedScopeView combinedScopeView = getsupportloadermanager2.IconCompatParcelizer;
                    combinedScopeView.getClass();
                    Path$Companion path$Companion = new Path$Companion();
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = (GetTargetFragmentRequestCodeUsageViolation) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
                    objWrite2.getClass();
                    return new markFragmentsCreated(path$Companion, getTargetFragmentRequestCodeUsageViolation, (consumeFlingInStretch) objWrite2, (setReenterTransition) ((setVerticalBias) combinedScopeView.write).write(), contextScope);
                }
                if (i7 != 2) {
                    if (i7 == 3) {
                        return homeViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(homeViewModel.PlaybackStateCompat);
                    }
                    if (i7 != 4) {
                        if (i7 != 5) {
                            return ((disableUseBoundsForWidth) homeViewModel.RatingCompat).RemoteActionCompatParcelizer(homeViewModel.PlaybackStateCompat);
                        }
                        startActivity startactivity2 = homeViewModel.RemoteActionCompatParcelizer;
                        ContextScope contextScope2 = homeViewModel.PlaybackStateCompat;
                        startactivity2.getClass();
                        contextScope2.getClass();
                        Object obj = startactivity2.serializer.RemoteActionCompatParcelizer.write;
                        obj.getClass();
                        return new startPostponedEnterTransition((shouldShowRequestPermissionRationale) obj, contextScope2);
                    }
                    setDebugAssertionsEnabled setdebugassertionsenabled2 = homeViewModel.ParcelableVolumeInfo;
                    ContextScope contextScope3 = homeViewModel.PlaybackStateCompat;
                    setdebugassertionsenabled2.getClass();
                    contextScope3.getClass();
                    getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = new getDecoratedBoundsWithMarginsInt((access500) ((clearNestedRecyclerViewIfNotNested) setdebugassertionsenabled2.serializer.serializer).write(), contextScope3);
                    int i8 = IconCompatParcelizer + 49;
                    write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        return getdecoratedboundswithmarginsint;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onAttachFragment onattachfragment2 = homeViewModel.PlaybackStateCompatCustomAction;
                ContextScope contextScope4 = homeViewModel.PlaybackStateCompat;
                onattachfragment2.getClass();
                contextScope4.getClass();
                androidx.work.impl.WorkerWrapper.Builder builder = onattachfragment2.read;
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
                objWrite3.getClass();
                performPrepareOptionsMenu performprepareoptionsmenu = (performPrepareOptionsMenu) objWrite3;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
                objWrite4.getClass();
                performPause performpause = (performPause) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
                objWrite5.getClass();
                onContextItemSelected oncontextitemselected = (onContextItemSelected) objWrite5;
                RouterLogger routerLogger = (RouterLogger) ((setVerticalBias) builder.MediaBrowserCompatMediaItem).write();
                onCreateAnimation oncreateanimation = new onCreateAnimation();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
                objWrite6.getClass();
                consumeFlingInStretch consumeflinginstretch2 = (consumeFlingInStretch) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.IconCompatParcelizer).write();
                objWrite7.getClass();
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
                objWrite8.getClass();
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = new HomeBottomSheetUiModelImpl(performprepareoptionsmenu, performpause, oncontextitemselected, routerLogger, oncreateanimation, consumeflinginstretch2, (isStateSaved) objWrite7, (getNoneeUduSuo) objWrite8, contextScope4);
                int i9 = IconCompatParcelizer + 21;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 53 / 0;
                }
                return homeBottomSheetUiModelImpl;
            }
        });
        final int i4 = 2;
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.isDetached
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ HomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = IconCompatParcelizer + 83;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = i4;
                HomeViewModel homeViewModel = this.serializer;
                if (i8 == 0) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) homeViewModel.IconCompatParcelizer;
                    firebaseRemoteConfigImpl.getClass();
                    return Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED));
                }
                if (i8 == 1) {
                    getSupportLoaderManager getsupportloadermanager2 = homeViewModel.MediaDescriptionCompat;
                    ContextScope contextScope = homeViewModel.PlaybackStateCompat;
                    getsupportloadermanager2.getClass();
                    contextScope.getClass();
                    CombinedScopeView combinedScopeView = getsupportloadermanager2.IconCompatParcelizer;
                    combinedScopeView.getClass();
                    Path$Companion path$Companion = new Path$Companion();
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = (GetTargetFragmentRequestCodeUsageViolation) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
                    objWrite2.getClass();
                    return new markFragmentsCreated(path$Companion, getTargetFragmentRequestCodeUsageViolation, (consumeFlingInStretch) objWrite2, (setReenterTransition) ((setVerticalBias) combinedScopeView.write).write(), contextScope);
                }
                if (i8 != 2) {
                    if (i8 == 3) {
                        return homeViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(homeViewModel.PlaybackStateCompat);
                    }
                    if (i8 != 4) {
                        if (i8 != 5) {
                            return ((disableUseBoundsForWidth) homeViewModel.RatingCompat).RemoteActionCompatParcelizer(homeViewModel.PlaybackStateCompat);
                        }
                        startActivity startactivity2 = homeViewModel.RemoteActionCompatParcelizer;
                        ContextScope contextScope2 = homeViewModel.PlaybackStateCompat;
                        startactivity2.getClass();
                        contextScope2.getClass();
                        Object obj = startactivity2.serializer.RemoteActionCompatParcelizer.write;
                        obj.getClass();
                        return new startPostponedEnterTransition((shouldShowRequestPermissionRationale) obj, contextScope2);
                    }
                    setDebugAssertionsEnabled setdebugassertionsenabled2 = homeViewModel.ParcelableVolumeInfo;
                    ContextScope contextScope3 = homeViewModel.PlaybackStateCompat;
                    setdebugassertionsenabled2.getClass();
                    contextScope3.getClass();
                    getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = new getDecoratedBoundsWithMarginsInt((access500) ((clearNestedRecyclerViewIfNotNested) setdebugassertionsenabled2.serializer.serializer).write(), contextScope3);
                    int i9 = IconCompatParcelizer + 49;
                    write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        return getdecoratedboundswithmarginsint;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onAttachFragment onattachfragment2 = homeViewModel.PlaybackStateCompatCustomAction;
                ContextScope contextScope4 = homeViewModel.PlaybackStateCompat;
                onattachfragment2.getClass();
                contextScope4.getClass();
                androidx.work.impl.WorkerWrapper.Builder builder = onattachfragment2.read;
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
                objWrite3.getClass();
                performPrepareOptionsMenu performprepareoptionsmenu = (performPrepareOptionsMenu) objWrite3;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
                objWrite4.getClass();
                performPause performpause = (performPause) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
                objWrite5.getClass();
                onContextItemSelected oncontextitemselected = (onContextItemSelected) objWrite5;
                RouterLogger routerLogger = (RouterLogger) ((setVerticalBias) builder.MediaBrowserCompatMediaItem).write();
                onCreateAnimation oncreateanimation = new onCreateAnimation();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
                objWrite6.getClass();
                consumeFlingInStretch consumeflinginstretch2 = (consumeFlingInStretch) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.IconCompatParcelizer).write();
                objWrite7.getClass();
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
                objWrite8.getClass();
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = new HomeBottomSheetUiModelImpl(performprepareoptionsmenu, performpause, oncontextitemselected, routerLogger, oncreateanimation, consumeflinginstretch2, (isStateSaved) objWrite7, (getNoneeUduSuo) objWrite8, contextScope4);
                int i10 = IconCompatParcelizer + 21;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 53 / 0;
                }
                return homeBottomSheetUiModelImpl;
            }
        });
        this.ComponentActivity = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.isDetached
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ HomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = IconCompatParcelizer + 83;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = i2;
                HomeViewModel homeViewModel = this.serializer;
                if (i8 == 0) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) homeViewModel.IconCompatParcelizer;
                    firebaseRemoteConfigImpl.getClass();
                    return Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED));
                }
                if (i8 == 1) {
                    getSupportLoaderManager getsupportloadermanager2 = homeViewModel.MediaDescriptionCompat;
                    ContextScope contextScope = homeViewModel.PlaybackStateCompat;
                    getsupportloadermanager2.getClass();
                    contextScope.getClass();
                    CombinedScopeView combinedScopeView = getsupportloadermanager2.IconCompatParcelizer;
                    combinedScopeView.getClass();
                    Path$Companion path$Companion = new Path$Companion();
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = (GetTargetFragmentRequestCodeUsageViolation) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
                    objWrite2.getClass();
                    return new markFragmentsCreated(path$Companion, getTargetFragmentRequestCodeUsageViolation, (consumeFlingInStretch) objWrite2, (setReenterTransition) ((setVerticalBias) combinedScopeView.write).write(), contextScope);
                }
                if (i8 != 2) {
                    if (i8 == 3) {
                        return homeViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(homeViewModel.PlaybackStateCompat);
                    }
                    if (i8 != 4) {
                        if (i8 != 5) {
                            return ((disableUseBoundsForWidth) homeViewModel.RatingCompat).RemoteActionCompatParcelizer(homeViewModel.PlaybackStateCompat);
                        }
                        startActivity startactivity2 = homeViewModel.RemoteActionCompatParcelizer;
                        ContextScope contextScope2 = homeViewModel.PlaybackStateCompat;
                        startactivity2.getClass();
                        contextScope2.getClass();
                        Object obj = startactivity2.serializer.RemoteActionCompatParcelizer.write;
                        obj.getClass();
                        return new startPostponedEnterTransition((shouldShowRequestPermissionRationale) obj, contextScope2);
                    }
                    setDebugAssertionsEnabled setdebugassertionsenabled2 = homeViewModel.ParcelableVolumeInfo;
                    ContextScope contextScope3 = homeViewModel.PlaybackStateCompat;
                    setdebugassertionsenabled2.getClass();
                    contextScope3.getClass();
                    getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = new getDecoratedBoundsWithMarginsInt((access500) ((clearNestedRecyclerViewIfNotNested) setdebugassertionsenabled2.serializer.serializer).write(), contextScope3);
                    int i9 = IconCompatParcelizer + 49;
                    write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        return getdecoratedboundswithmarginsint;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onAttachFragment onattachfragment2 = homeViewModel.PlaybackStateCompatCustomAction;
                ContextScope contextScope4 = homeViewModel.PlaybackStateCompat;
                onattachfragment2.getClass();
                contextScope4.getClass();
                androidx.work.impl.WorkerWrapper.Builder builder = onattachfragment2.read;
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
                objWrite3.getClass();
                performPrepareOptionsMenu performprepareoptionsmenu = (performPrepareOptionsMenu) objWrite3;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
                objWrite4.getClass();
                performPause performpause = (performPause) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
                objWrite5.getClass();
                onContextItemSelected oncontextitemselected = (onContextItemSelected) objWrite5;
                RouterLogger routerLogger = (RouterLogger) ((setVerticalBias) builder.MediaBrowserCompatMediaItem).write();
                onCreateAnimation oncreateanimation = new onCreateAnimation();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
                objWrite6.getClass();
                consumeFlingInStretch consumeflinginstretch2 = (consumeFlingInStretch) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.IconCompatParcelizer).write();
                objWrite7.getClass();
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
                objWrite8.getClass();
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = new HomeBottomSheetUiModelImpl(performprepareoptionsmenu, performpause, oncontextitemselected, routerLogger, oncreateanimation, consumeflinginstretch2, (isStateSaved) objWrite7, (getNoneeUduSuo) objWrite8, contextScope4);
                int i10 = IconCompatParcelizer + 21;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 53 / 0;
                }
                return homeBottomSheetUiModelImpl;
            }
        });
        final int i5 = 4;
        this.MediaSessionCompatResultReceiverWrapper = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.isDetached
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ HomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = IconCompatParcelizer + 83;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = i5;
                HomeViewModel homeViewModel = this.serializer;
                if (i9 == 0) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) homeViewModel.IconCompatParcelizer;
                    firebaseRemoteConfigImpl.getClass();
                    return Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED));
                }
                if (i9 == 1) {
                    getSupportLoaderManager getsupportloadermanager2 = homeViewModel.MediaDescriptionCompat;
                    ContextScope contextScope = homeViewModel.PlaybackStateCompat;
                    getsupportloadermanager2.getClass();
                    contextScope.getClass();
                    CombinedScopeView combinedScopeView = getsupportloadermanager2.IconCompatParcelizer;
                    combinedScopeView.getClass();
                    Path$Companion path$Companion = new Path$Companion();
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = (GetTargetFragmentRequestCodeUsageViolation) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
                    objWrite2.getClass();
                    return new markFragmentsCreated(path$Companion, getTargetFragmentRequestCodeUsageViolation, (consumeFlingInStretch) objWrite2, (setReenterTransition) ((setVerticalBias) combinedScopeView.write).write(), contextScope);
                }
                if (i9 != 2) {
                    if (i9 == 3) {
                        return homeViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(homeViewModel.PlaybackStateCompat);
                    }
                    if (i9 != 4) {
                        if (i9 != 5) {
                            return ((disableUseBoundsForWidth) homeViewModel.RatingCompat).RemoteActionCompatParcelizer(homeViewModel.PlaybackStateCompat);
                        }
                        startActivity startactivity2 = homeViewModel.RemoteActionCompatParcelizer;
                        ContextScope contextScope2 = homeViewModel.PlaybackStateCompat;
                        startactivity2.getClass();
                        contextScope2.getClass();
                        Object obj = startactivity2.serializer.RemoteActionCompatParcelizer.write;
                        obj.getClass();
                        return new startPostponedEnterTransition((shouldShowRequestPermissionRationale) obj, contextScope2);
                    }
                    setDebugAssertionsEnabled setdebugassertionsenabled2 = homeViewModel.ParcelableVolumeInfo;
                    ContextScope contextScope3 = homeViewModel.PlaybackStateCompat;
                    setdebugassertionsenabled2.getClass();
                    contextScope3.getClass();
                    getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = new getDecoratedBoundsWithMarginsInt((access500) ((clearNestedRecyclerViewIfNotNested) setdebugassertionsenabled2.serializer.serializer).write(), contextScope3);
                    int i10 = IconCompatParcelizer + 49;
                    write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        return getdecoratedboundswithmarginsint;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onAttachFragment onattachfragment2 = homeViewModel.PlaybackStateCompatCustomAction;
                ContextScope contextScope4 = homeViewModel.PlaybackStateCompat;
                onattachfragment2.getClass();
                contextScope4.getClass();
                androidx.work.impl.WorkerWrapper.Builder builder = onattachfragment2.read;
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
                objWrite3.getClass();
                performPrepareOptionsMenu performprepareoptionsmenu = (performPrepareOptionsMenu) objWrite3;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
                objWrite4.getClass();
                performPause performpause = (performPause) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
                objWrite5.getClass();
                onContextItemSelected oncontextitemselected = (onContextItemSelected) objWrite5;
                RouterLogger routerLogger = (RouterLogger) ((setVerticalBias) builder.MediaBrowserCompatMediaItem).write();
                onCreateAnimation oncreateanimation = new onCreateAnimation();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
                objWrite6.getClass();
                consumeFlingInStretch consumeflinginstretch2 = (consumeFlingInStretch) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.IconCompatParcelizer).write();
                objWrite7.getClass();
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
                objWrite8.getClass();
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = new HomeBottomSheetUiModelImpl(performprepareoptionsmenu, performpause, oncontextitemselected, routerLogger, oncreateanimation, consumeflinginstretch2, (isStateSaved) objWrite7, (getNoneeUduSuo) objWrite8, contextScope4);
                int i11 = IconCompatParcelizer + 21;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 53 / 0;
                }
                return homeBottomSheetUiModelImpl;
            }
        });
        final int i6 = 5;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.isDetached
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ HomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = IconCompatParcelizer + 83;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = i6;
                HomeViewModel homeViewModel = this.serializer;
                if (i10 == 0) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) homeViewModel.IconCompatParcelizer;
                    firebaseRemoteConfigImpl.getClass();
                    return Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED));
                }
                if (i10 == 1) {
                    getSupportLoaderManager getsupportloadermanager2 = homeViewModel.MediaDescriptionCompat;
                    ContextScope contextScope = homeViewModel.PlaybackStateCompat;
                    getsupportloadermanager2.getClass();
                    contextScope.getClass();
                    CombinedScopeView combinedScopeView = getsupportloadermanager2.IconCompatParcelizer;
                    combinedScopeView.getClass();
                    Path$Companion path$Companion = new Path$Companion();
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = (GetTargetFragmentRequestCodeUsageViolation) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
                    objWrite2.getClass();
                    return new markFragmentsCreated(path$Companion, getTargetFragmentRequestCodeUsageViolation, (consumeFlingInStretch) objWrite2, (setReenterTransition) ((setVerticalBias) combinedScopeView.write).write(), contextScope);
                }
                if (i10 != 2) {
                    if (i10 == 3) {
                        return homeViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(homeViewModel.PlaybackStateCompat);
                    }
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return ((disableUseBoundsForWidth) homeViewModel.RatingCompat).RemoteActionCompatParcelizer(homeViewModel.PlaybackStateCompat);
                        }
                        startActivity startactivity2 = homeViewModel.RemoteActionCompatParcelizer;
                        ContextScope contextScope2 = homeViewModel.PlaybackStateCompat;
                        startactivity2.getClass();
                        contextScope2.getClass();
                        Object obj = startactivity2.serializer.RemoteActionCompatParcelizer.write;
                        obj.getClass();
                        return new startPostponedEnterTransition((shouldShowRequestPermissionRationale) obj, contextScope2);
                    }
                    setDebugAssertionsEnabled setdebugassertionsenabled2 = homeViewModel.ParcelableVolumeInfo;
                    ContextScope contextScope3 = homeViewModel.PlaybackStateCompat;
                    setdebugassertionsenabled2.getClass();
                    contextScope3.getClass();
                    getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = new getDecoratedBoundsWithMarginsInt((access500) ((clearNestedRecyclerViewIfNotNested) setdebugassertionsenabled2.serializer.serializer).write(), contextScope3);
                    int i11 = IconCompatParcelizer + 49;
                    write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        return getdecoratedboundswithmarginsint;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onAttachFragment onattachfragment2 = homeViewModel.PlaybackStateCompatCustomAction;
                ContextScope contextScope4 = homeViewModel.PlaybackStateCompat;
                onattachfragment2.getClass();
                contextScope4.getClass();
                androidx.work.impl.WorkerWrapper.Builder builder = onattachfragment2.read;
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
                objWrite3.getClass();
                performPrepareOptionsMenu performprepareoptionsmenu = (performPrepareOptionsMenu) objWrite3;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
                objWrite4.getClass();
                performPause performpause = (performPause) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
                objWrite5.getClass();
                onContextItemSelected oncontextitemselected = (onContextItemSelected) objWrite5;
                RouterLogger routerLogger = (RouterLogger) ((setVerticalBias) builder.MediaBrowserCompatMediaItem).write();
                onCreateAnimation oncreateanimation = new onCreateAnimation();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
                objWrite6.getClass();
                consumeFlingInStretch consumeflinginstretch2 = (consumeFlingInStretch) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.IconCompatParcelizer).write();
                objWrite7.getClass();
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
                objWrite8.getClass();
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = new HomeBottomSheetUiModelImpl(performprepareoptionsmenu, performpause, oncontextitemselected, routerLogger, oncreateanimation, consumeflinginstretch2, (isStateSaved) objWrite7, (getNoneeUduSuo) objWrite8, contextScope4);
                int i12 = IconCompatParcelizer + 21;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    int i13 = 53 / 0;
                }
                return homeBottomSheetUiModelImpl;
            }
        });
        final int i7 = 6;
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.isDetached
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ HomeViewModel serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = IconCompatParcelizer + 83;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                int i11 = i7;
                HomeViewModel homeViewModel = this.serializer;
                if (i11 == 0) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) homeViewModel.IconCompatParcelizer;
                    firebaseRemoteConfigImpl.getClass();
                    return Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ASYNC_HOME_SCOPE_CANCELLATION_ENABLED));
                }
                if (i11 == 1) {
                    getSupportLoaderManager getsupportloadermanager2 = homeViewModel.MediaDescriptionCompat;
                    ContextScope contextScope = homeViewModel.PlaybackStateCompat;
                    getsupportloadermanager2.getClass();
                    contextScope.getClass();
                    CombinedScopeView combinedScopeView = getsupportloadermanager2.IconCompatParcelizer;
                    combinedScopeView.getClass();
                    Path$Companion path$Companion = new Path$Companion();
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = (GetTargetFragmentRequestCodeUsageViolation) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
                    objWrite2.getClass();
                    return new markFragmentsCreated(path$Companion, getTargetFragmentRequestCodeUsageViolation, (consumeFlingInStretch) objWrite2, (setReenterTransition) ((setVerticalBias) combinedScopeView.write).write(), contextScope);
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        return homeViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(homeViewModel.PlaybackStateCompat);
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return ((disableUseBoundsForWidth) homeViewModel.RatingCompat).RemoteActionCompatParcelizer(homeViewModel.PlaybackStateCompat);
                        }
                        startActivity startactivity2 = homeViewModel.RemoteActionCompatParcelizer;
                        ContextScope contextScope2 = homeViewModel.PlaybackStateCompat;
                        startactivity2.getClass();
                        contextScope2.getClass();
                        Object obj = startactivity2.serializer.RemoteActionCompatParcelizer.write;
                        obj.getClass();
                        return new startPostponedEnterTransition((shouldShowRequestPermissionRationale) obj, contextScope2);
                    }
                    setDebugAssertionsEnabled setdebugassertionsenabled2 = homeViewModel.ParcelableVolumeInfo;
                    ContextScope contextScope3 = homeViewModel.PlaybackStateCompat;
                    setdebugassertionsenabled2.getClass();
                    contextScope3.getClass();
                    getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = new getDecoratedBoundsWithMarginsInt((access500) ((clearNestedRecyclerViewIfNotNested) setdebugassertionsenabled2.serializer.serializer).write(), contextScope3);
                    int i12 = IconCompatParcelizer + 49;
                    write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        return getdecoratedboundswithmarginsint;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onAttachFragment onattachfragment2 = homeViewModel.PlaybackStateCompatCustomAction;
                ContextScope contextScope4 = homeViewModel.PlaybackStateCompat;
                onattachfragment2.getClass();
                contextScope4.getClass();
                androidx.work.impl.WorkerWrapper.Builder builder = onattachfragment2.read;
                Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
                objWrite3.getClass();
                performPrepareOptionsMenu performprepareoptionsmenu = (performPrepareOptionsMenu) objWrite3;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
                objWrite4.getClass();
                performPause performpause = (performPause) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
                objWrite5.getClass();
                onContextItemSelected oncontextitemselected = (onContextItemSelected) objWrite5;
                RouterLogger routerLogger = (RouterLogger) ((setVerticalBias) builder.MediaBrowserCompatMediaItem).write();
                onCreateAnimation oncreateanimation = new onCreateAnimation();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
                objWrite6.getClass();
                consumeFlingInStretch consumeflinginstretch2 = (consumeFlingInStretch) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.IconCompatParcelizer).write();
                objWrite7.getClass();
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
                objWrite8.getClass();
                HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = new HomeBottomSheetUiModelImpl(performprepareoptionsmenu, performpause, oncontextitemselected, routerLogger, oncreateanimation, consumeflinginstretch2, (isStateSaved) objWrite7, (getNoneeUduSuo) objWrite8, contextScope4);
                int i13 = IconCompatParcelizer + 21;
                write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    int i14 = 53 / 0;
                }
                return homeBottomSheetUiModelImpl;
            }
        });
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 61;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            ((Boolean) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper()).booleanValue();
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (((Boolean) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        } else {
            YieldKt.write(this.PlaybackStateCompat, (CancellationException) null);
            int i3 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 85;
            r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        consumeFlingInStretch consumeflinginstretch = this.ResultReceiver;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = consumeflinginstretch.MediaBrowserCompatMediaItem;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i5 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 3;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        consumeflinginstretch.MediaBrowserCompatMediaItem = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object onAutoBottomSheetStateChanged(onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged, ShortNewsContentCardView shortNewsContentCardView) {
        isInLayout isinlayout;
        int i = 2 % 2;
        if (!(!(shortNewsContentCardView instanceof isInLayout))) {
            isinlayout = (isInLayout) shortNewsContentCardView;
            int i2 = isinlayout.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                isinlayout.read = i2 - Integer.MIN_VALUE;
            } else {
                isinlayout = new isInLayout(this, shortNewsContentCardView);
            }
        } else {
            isinlayout = new isInLayout(this, shortNewsContentCardView);
        }
        Object obj = isinlayout.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = isinlayout.read;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (onprimarynavigationfragmentchanged != onPrimaryNavigationFragmentChanged.EXPANDED) {
                isinlayout.read = 1;
                if (DelayKt.delay(750L, isinlayout) == coroutineSingletons) {
                    int i4 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 5;
                    r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }
        int i6 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 77;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i8 = r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw + 31;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        updateHasCallbacks updatehascallbacks = updateHasCallbacks.MapVisibleAreaChange;
        RecenterMapTriggerImpl recenterMapTriggerImpl = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        recenterMapTriggerImpl.getClass();
        updatehascallbacks.getClass();
        recenterMapTriggerImpl.RemoteActionCompatParcelizer.onNext(updatehascallbacks);
        return createFromParcel.INSTANCE;
    }
}
