package com.roadrunner.startworking.oneclick;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import androidx.lifecycle.ViewModel;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.location.core.domain.GetLocationUpdatesUseCaseImpl;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.equipment.StartWorkingNoEquipmentException;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ExtensionWindowAreaStatusRequirements;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.SystemLifecycleSystemLifecycleCallback;
import o.addRearDisplayPresentationStatusListener;
import o.createFromParcel;
import o.decode;
import o.disable;
import o.doesTransientStatePreventRecycling;
import o.endRearDisplaySession;
import o.getBitmapui_graphics;
import o.getContentViewGroupParentLayout;
import o.getQueryContext;
import o.handleInternalBannerRefreshlambda1;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.isEphemeralEventKey;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.lambda38;
import o.lambda39;
import o.logBannerClicklambda0;
import o.logBannerClicklambda1;
import o.logCustomEventlambda0;
import o.logCustomEventlambda12;
import o.logCustomEventlambda13;
import o.logEcommerceEventlambda0;
import o.logEcommerceEventlambda1;
import o.logEcommerceEventlambda11;
import o.logFeatureFlagImpressionlambda1;
import o.logPurchaselambda1;
import o.logPushNotificationOpenedlambda31;
import o.logPushStoryPageClickedlambda1;
import o.onBackInvokedlambda0;
import o.onItemDismiss;
import o.onMove;
import o.onServiceConnected;
import o.onViewAttachedToWindowlambda0;
import o.openSessionlambda2;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setApplicationContext;
import o.setConfigurationProviderandroid_sdk_base_release;
import o.setRegistrationDataProviderandroid_sdk_base_release;
import o.setSupportButtonTintMode;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateAdidI;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class OneClickStartWorkingViewModel extends ViewModel {
    private static int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 1;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final C$b ComponentActivity;
    public final lambda39 IconCompatParcelizer;
    public final N$b MediaBrowserCompatMediaItem;
    public final C$b MediaDescriptionCompat;
    public final doesTransientStatePreventRecycling MediaMetadataCompat;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public final setTransactionSuccessful MediaSessionCompatResultReceiverWrapper;
    public final logPurchaselambda1 MediaSessionCompatToken;
    public final CoroutineLiveData ParcelableVolumeInfo;
    public final getQueryContext PlaybackStateCompat;
    public final NetworkBody PlaybackStateCompatCustomAction;
    public final CallTracer RatingCompat;
    public final logPushStoryPageClickedlambda1 RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen ResultReceiver;
    public final getBitmapui_graphics r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final MutableStateFlow r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final SharedResourcePool r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final MutableStateFlow r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final NetworkErrorMapperImpl read;
    public final isOpenInternalroom_runtime serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int read = 0;
        private static int write = 1;
        public int IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public final /* synthetic */ OneClickStartWorkingViewModel serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(OneClickStartWorkingViewModel oneClickStartWorkingViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.serializer = oneClickStartWorkingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.RemoteActionCompatParcelizer;
            OneClickStartWorkingViewModel oneClickStartWorkingViewModel = this.serializer;
            if (i3 == 0) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, 0);
                int i4 = write + 59;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return anonymousClass1;
            }
            int i6 = 1;
            if (i3 == 1) {
                return new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, i6);
            }
            if (i3 != 2) {
                int i7 = 3;
                if (i3 != 3) {
                    return i3 != 4 ? new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, 5) : new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, 4);
                }
                return new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, i7);
            }
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, i);
            int i8 = write + 67;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = write + 107;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 == 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            if (i4 == 1) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            if (i4 == 2) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            if (i4 == 3) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            if (i4 == 4) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = read + 49;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
        
            if (com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel.access$startWorkingWithLocation(r3, r1, r15, r14) == r11) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        
            if (com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel.access$startWorkingWithLocation(r3, r0, r15, r14) == r11) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 581
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0138  */
    /* JADX WARN: Code duplicated, block: B:17:0x0144  */
    public OneClickStartWorkingViewModel(lambda39 lambda39Var, NetworkBody networkBody, N$b n$b, setTransactionSuccessful settransactionsuccessful, isOpenInternalroom_runtime isopeninternalroom_runtime, transferSessionPackageI transfersessionpackagei, C$b c$b, logPushStoryPageClickedlambda1 logpushstorypageclickedlambda1, NetworkErrorMapperImpl networkErrorMapperImpl, SharedResourcePool sharedResourcePool, logPurchaselambda1 logpurchaselambda1, CallTracer callTracer, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, getQueryContext getquerycontext, C$b c$b2, GetLocationUpdatesUseCaseImpl getLocationUpdatesUseCaseImpl, doesTransientStatePreventRecycling doestransientstatepreventrecycling, getBitmapui_graphics getbitmapui_graphics) {
        int i;
        lambda39Var.getClass();
        networkBody.getClass();
        n$b.getClass();
        settransactionsuccessful.getClass();
        isopeninternalroom_runtime.getClass();
        transfersessionpackagei.getClass();
        c$b.getClass();
        logpushstorypageclickedlambda1.getClass();
        networkErrorMapperImpl.getClass();
        sharedResourcePool.getClass();
        logpurchaselambda1.getClass();
        callTracer.getClass();
        systemLifecycleSystemLifecycleCallback.getClass();
        getquerycontext.getClass();
        c$b2.getClass();
        getLocationUpdatesUseCaseImpl.getClass();
        doestransientstatepreventrecycling.getClass();
        getbitmapui_graphics.getClass();
        this.IconCompatParcelizer = lambda39Var;
        this.PlaybackStateCompatCustomAction = networkBody;
        this.MediaBrowserCompatMediaItem = n$b;
        this.MediaSessionCompatResultReceiverWrapper = settransactionsuccessful;
        this.serializer = isopeninternalroom_runtime;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.ComponentActivity = c$b;
        this.RemoteActionCompatParcelizer = logpushstorypageclickedlambda1;
        this.read = networkErrorMapperImpl;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = sharedResourcePool;
        this.MediaSessionCompatToken = logpurchaselambda1;
        this.RatingCompat = callTracer;
        this.PlaybackStateCompat = getquerycontext;
        this.MediaDescriptionCompat = c$b2;
        this.MediaMetadataCompat = doestransientstatepreventrecycling;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getbitmapui_graphics;
        Boolean bool = (Boolean) getbitmapui_graphics.write("start_working_requested");
        int i2 = 0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        updateAdidI updateadidi = updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED;
        boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateadidi);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new logFeatureFlagImpressionlambda1(new logPushNotificationOpenedlambda31(instance_delegatelambda0Var, instance_delegatelambda0Var, instance_delegatelambda0Var), zBooleanValue, !zIconCompatParcelizer));
        this.write = mutableStateFlow;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = mutableStateFlow;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = StateFlowKt.read(logCustomEventlambda0.write);
        this.ResultReceiver = new isAdapterPositionOnScreen(new RealWebSocket$$ExternalSyntheticLambda0(10, this));
        Flow flowSerializer = getLocationUpdatesUseCaseImpl.serializer(new addRearDisplayPresentationStatusListener(firebaseRemoteConfigImpl.IconCompatParcelizer.write("location_update_interval"), endRearDisplaySession.PRIORITY_HIGH_ACCURACY));
        flowSerializer.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(flowSerializer, shortNewsContentCardView, 26);
        CoroutineLiveData coroutineLiveData = new CoroutineLiveData(0);
        onBackInvokedlambda0 onbackinvokedlambda0 = new onBackInvokedlambda0(null);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(MainDispatcherLoader.read.IconCompatParcelizer().plus(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write).plus(onbackinvokedlambda0));
        CoroutineLiveData$$ExternalSyntheticLambda0 coroutineLiveData$$ExternalSyntheticLambda0 = new CoroutineLiveData$$ExternalSyntheticLambda0(i2, coroutineLiveData);
        BlockRunner blockRunner = new BlockRunner();
        blockRunner.read = coroutineLiveData;
        blockRunner.serializer = blockRunner$maybeRun$1;
        blockRunner.RatingCompat = contextScopeRemoteActionCompatParcelizer;
        blockRunner.write = coroutineLiveData$$ExternalSyntheticLambda0;
        coroutineLiveData.RemoteActionCompatParcelizer = blockRunner;
        int i3 = 2;
        if (flowSerializer instanceof StateFlow) {
            int i4 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 93;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
                if (setSupportButtonTintMode.IconCompatParcelizer().RemoteActionCompatParcelizer()) {
                    coroutineLiveData.RemoteActionCompatParcelizer(((StateFlow) flowSerializer).read());
                } else {
                    coroutineLiveData.serializer(((StateFlow) flowSerializer).read());
                    i = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 13;
                    r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                    }
                }
                int i6 = 2 % 2;
            } else {
                if (setSupportButtonTintMode.IconCompatParcelizer().RemoteActionCompatParcelizer()) {
                    coroutineLiveData.RemoteActionCompatParcelizer(((StateFlow) flowSerializer).read());
                } else {
                    coroutineLiveData.serializer(((StateFlow) flowSerializer).read());
                    i = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 13;
                    r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                    }
                }
                int i7 = 2 % 2;
            }
        }
        this.ParcelableVolumeInfo = coroutineLiveData;
        systemLifecycleSystemLifecycleCallback.RatingCompat();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new AnonymousClass1(this, shortNewsContentCardView, i2), 3);
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateadidi)) {
            read();
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new AnonymousClass1(this, shortNewsContentCardView, i3), 3);
    }

    public final void write() {
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 125;
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer("start_working_requested", Boolean.valueOf(((logFeatureFlagImpressionlambda1) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read()).RemoteActionCompatParcelizer));
            int i3 = 0 / 0;
        } else {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer("start_working_requested", Boolean.valueOf(((logFeatureFlagImpressionlambda1) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read()).RemoteActionCompatParcelizer));
        }
        int i4 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 63;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void read() {
        MutableStateFlow mutableStateFlow;
        Object obj;
        ShortNewsContentCardView shortNewsContentCardView;
        int i;
        int i2 = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.MediaSessionCompatQueueItem;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED)) {
            NetworkBody networkBody = this.PlaybackStateCompatCustomAction;
            boolean zRemoteActionCompatParcelizer = ((disable) networkBody.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
            decode decodeVar = (decode) networkBody.IconCompatParcelizer;
            Map mapSingletonMap = Collections.singletonMap("safety_tracking_permission_granted", String.valueOf(zRemoteActionCompatParcelizer));
            mapSingletonMap.getClass();
            decodeVar.logEvent("start_session_policies_agreed", mapSingletonMap);
        }
        do {
            mutableStateFlow = this.write;
            obj = mutableStateFlow.read();
            shortNewsContentCardView = null;
            i = 5;
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, logFeatureFlagImpressionlambda1.serializer((logFeatureFlagImpressionlambda1) obj, null, true, 5)));
        int i3 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 63;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.MediaSessionCompatToken.serializer();
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (!this.MediaSessionCompatToken.serializer()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new AnonymousClass1(this, shortNewsContentCardView, i), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new TncContentKt$$ExternalSyntheticLambda2(21, this));
            int i4 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 53;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        C$b c$b = this.MediaDescriptionCompat;
        if (((logPurchaselambda1) c$b.write).serializer()) {
            ((setRegistrationDataProviderandroid_sdk_base_release) c$b.IconCompatParcelizer()).read();
            return;
        }
        ((setRegistrationDataProviderandroid_sdk_base_release) c$b.IconCompatParcelizer()).read.serializer(setConfigurationProviderandroid_sdk_base_release.read);
        int i6 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 111;
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 o.transferSessionPackageI) = (r1v4 o.transferSessionPackageI), (r1v11 o.transferSessionPackageI) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00a2, please report this as an issue */
    public static final Object access$observeComponentsIfEquipmentIsSelected(OneClickStartWorkingViewModel oneClickStartWorkingViewModel, ContinuationImpl continuationImpl) throws Throwable {
        transferSessionPackageI transfersessionpackagei;
        logEcommerceEventlambda1 logecommerceeventlambda1;
        int i;
        Object objWithContext;
        CoroutineSingletons coroutineSingletons;
        int i2;
        ShortNewsContentCardView shortNewsContentCardView;
        lambda38 lambda38Var;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        String strSerializer;
        int i3;
        int i4 = 2 % 2;
        int i5 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 111;
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            transfersessionpackagei = oneClickStartWorkingViewModel.MediaSessionCompatQueueItem;
            if (continuationImpl instanceof logEcommerceEventlambda1) {
                logecommerceeventlambda1 = (logEcommerceEventlambda1) continuationImpl;
                i = logecommerceeventlambda1.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    logecommerceeventlambda1.read = i - Integer.MIN_VALUE;
                }
            }
            objWithContext = logecommerceeventlambda1.write;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = logecommerceeventlambda1.read;
            shortNewsContentCardView = null;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                lambda39 lambda39Var = oneClickStartWorkingViewModel.IconCompatParcelizer;
                logecommerceeventlambda1.read = 1;
                ((inCompatibilityMode) lambda39Var.IconCompatParcelizer).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RxConvertKt$asSingle$1(lambda39Var, shortNewsContentCardView, 8), logecommerceeventlambda1);
                if (objWithContext == coroutineSingletons) {
                    int i6 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 95;
                    r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            }
            lambda38Var = (lambda38) objWithContext;
            if (lambda38Var instanceof logBannerClicklambda0) {
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                if (strSerializer == null) {
                    int i8 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 7;
                    r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else if (firebaseRemoteConfigImpl.IconCompatParcelizer.serializer(updateAdidI.IS_START_WORKING_EQUIPMENT_FIX_ENABLED.getFirebaseFlagName(), strSerializer)) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Setting initial equipment selection " + lambda38Var, new Object[0]);
                    oneClickStartWorkingViewModel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(lambda38Var);
                }
                i3 = 3;
                if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED)) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(oneClickStartWorkingViewModel), null, null, new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, i3), 3);
                }
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(oneClickStartWorkingViewModel), null, null, new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, 4), 3);
            } else {
                oneClickStartWorkingViewModel.PlaybackStateCompat.serializer(logBannerClicklambda1.write);
            }
            return createFromParcel.INSTANCE;
        }
        transfersessionpackagei = oneClickStartWorkingViewModel.MediaSessionCompatQueueItem;
        int i10 = 68 / 0;
        if (continuationImpl instanceof logEcommerceEventlambda1) {
            logecommerceeventlambda1 = (logEcommerceEventlambda1) continuationImpl;
            i = logecommerceeventlambda1.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                logecommerceeventlambda1.read = i - Integer.MIN_VALUE;
            }
        }
        objWithContext = logecommerceeventlambda1.write;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = logecommerceeventlambda1.read;
        shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            lambda39 lambda39Var2 = oneClickStartWorkingViewModel.IconCompatParcelizer;
            logecommerceeventlambda1.read = 1;
            ((inCompatibilityMode) lambda39Var2.IconCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RxConvertKt$asSingle$1(lambda39Var2, shortNewsContentCardView, 8), logecommerceeventlambda1);
            if (objWithContext == coroutineSingletons) {
                int i11 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 95;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        lambda38Var = (lambda38) objWithContext;
        if (lambda38Var instanceof logBannerClicklambda0) {
            oneClickStartWorkingViewModel.PlaybackStateCompat.serializer(logBannerClicklambda1.write);
        } else {
            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
            if (strSerializer == null) {
                int i13 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 7;
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else if (firebaseRemoteConfigImpl.IconCompatParcelizer.serializer(updateAdidI.IS_START_WORKING_EQUIPMENT_FIX_ENABLED.getFirebaseFlagName(), strSerializer)) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Setting initial equipment selection " + lambda38Var, new Object[0]);
                oneClickStartWorkingViewModel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(lambda38Var);
            }
            i3 = 3;
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED)) {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(oneClickStartWorkingViewModel), null, null, new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, i3), 3);
            }
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(oneClickStartWorkingViewModel), null, null, new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, 4), 3);
        }
        return createFromParcel.INSTANCE;
        logecommerceeventlambda1 = new logEcommerceEventlambda1(oneClickStartWorkingViewModel, continuationImpl);
        objWithContext = logecommerceeventlambda1.write;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = logecommerceeventlambda1.read;
        shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            lambda39 lambda39Var3 = oneClickStartWorkingViewModel.IconCompatParcelizer;
            logecommerceeventlambda1.read = 1;
            ((inCompatibilityMode) lambda39Var3.IconCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RxConvertKt$asSingle$1(lambda39Var3, shortNewsContentCardView, 8), logecommerceeventlambda1);
            if (objWithContext == coroutineSingletons) {
                int i15 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 95;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        lambda38Var = (lambda38) objWithContext;
        if (lambda38Var instanceof logBannerClicklambda0) {
            oneClickStartWorkingViewModel.PlaybackStateCompat.serializer(logBannerClicklambda1.write);
        } else {
            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
            if (strSerializer == null) {
                int i17 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 7;
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
            } else if (firebaseRemoteConfigImpl.IconCompatParcelizer.serializer(updateAdidI.IS_START_WORKING_EQUIPMENT_FIX_ENABLED.getFirebaseFlagName(), strSerializer)) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Setting initial equipment selection " + lambda38Var, new Object[0]);
                oneClickStartWorkingViewModel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(lambda38Var);
            }
            i3 = 3;
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED)) {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(oneClickStartWorkingViewModel), null, null, new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, i3), 3);
            }
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(oneClickStartWorkingViewModel), null, null, new AnonymousClass1(oneClickStartWorkingViewModel, shortNewsContentCardView, 4), 3);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0115 A[DONT_INVERT, PHI: r8 r13
  0x0115: PHI (r8v20 o.onServiceConnected) = (r8v19 o.onServiceConnected), (r8v29 o.onServiceConnected) binds: [B:50:0x0113, B:47:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r13v3 int) = (r13v2 int), (r13v6 int) binds: [B:50:0x0113, B:47:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x0165  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    public static final Object access$startWorkingWithLocation(OneClickStartWorkingViewModel oneClickStartWorkingViewModel, StartWorkingNavAction startWorkingNavAction, ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements, ContinuationImpl continuationImpl) {
        logEcommerceEventlambda0 logecommerceeventlambda0;
        isEphemeralEventKey isephemeraleventkey;
        onServiceConnected onserviceconnected;
        int i;
        Integer numValueOf;
        handleInternalBannerRefreshlambda1 handleinternalbannerrefreshlambda1;
        Object objM5075invokegIAlus;
        int i2 = 2 % 2;
        NetworkBody networkBody = oneClickStartWorkingViewModel.PlaybackStateCompatCustomAction;
        getQueryContext getquerycontext = oneClickStartWorkingViewModel.PlaybackStateCompat;
        if (continuationImpl instanceof logEcommerceEventlambda0) {
            logecommerceeventlambda0 = (logEcommerceEventlambda0) continuationImpl;
            int i3 = logecommerceeventlambda0.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 93;
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                logecommerceeventlambda0.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
                int i6 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 81;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 2;
                }
            } else {
                logecommerceeventlambda0 = new logEcommerceEventlambda0(oneClickStartWorkingViewModel, continuationImpl);
            }
        } else {
            logecommerceeventlambda0 = new logEcommerceEventlambda0(oneClickStartWorkingViewModel, continuationImpl);
        }
        Object obj = logecommerceeventlambda0.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = logecommerceeventlambda0.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj2 = oneClickStartWorkingViewModel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read();
            logBannerClicklambda0 logbannerclicklambda0 = obj2 instanceof logBannerClicklambda0 ? (logBannerClicklambda0) obj2 : null;
            if (logbannerclicklambda0 == null) {
                Timber.RemoteActionCompatParcelizer.write(new StartWorkingNoEquipmentException("Equipment not selected when start working is clicked " + logbannerclicklambda0, null));
                getquerycontext.serializer(logBannerClicklambda1.write);
                return createfromparcel;
            }
            oneClickStartWorkingViewModel.RemoteActionCompatParcelizer.getClass();
            startWorkingNavAction.getClass();
            extensionWindowAreaStatusRequirements.getClass();
            if (startWorkingNavAction.equals(StartWorkingNavAction.BecomeAvailable.read)) {
                isephemeraleventkey = isEphemeralEventKey.BECOME_AVAILABLE;
            } else if (startWorkingNavAction.equals(StartWorkingNavAction.StartOnDemand.serializer)) {
                int i9 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 115;
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                isephemeraleventkey = isEphemeralEventKey.START_ON_DEMAND;
            } else if (startWorkingNavAction.equals(StartWorkingNavAction.StartExistingShiftInsideStartingArea.serializer) || !(!(startWorkingNavAction instanceof StartWorkingNavAction.StartExistingShift))) {
                isephemeraleventkey = isEphemeralEventKey.START_EXISTING_SHIFT;
            } else if (startWorkingNavAction instanceof StartWorkingNavAction.StartInstantShift) {
                isephemeraleventkey = isEphemeralEventKey.START_UNASSIGNED_SHIFT;
            } else {
                if (!(startWorkingNavAction instanceof StartWorkingNavAction.StartWorkNow)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i11 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 111;
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    onserviceconnected = ((StartWorkingNavAction.StartWorkNow) startWorkingNavAction).RemoteActionCompatParcelizer;
                    i = openSessionlambda2.write[onserviceconnected.ordinal()];
                    if (i == 0) {
                        isephemeraleventkey = isEphemeralEventKey.START_WORK_NOW;
                    } else if (i != 2) {
                        isephemeraleventkey = isEphemeralEventKey.START_WORK_NOW_LOW_FILL;
                    } else {
                        if (i == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid Work Now type: ", onserviceconnected.getValue()));
                            return null;
                        }
                        int i12 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 105;
                        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        isephemeraleventkey = isEphemeralEventKey.GO_AND_START_LOW_FILL;
                    }
                } else {
                    onserviceconnected = ((StartWorkingNavAction.StartWorkNow) startWorkingNavAction).RemoteActionCompatParcelizer;
                    i = openSessionlambda2.write[onserviceconnected.ordinal()];
                    if (i == 1) {
                        isephemeraleventkey = isEphemeralEventKey.START_WORK_NOW;
                    } else if (i != 2) {
                        isephemeraleventkey = isEphemeralEventKey.START_WORK_NOW_LOW_FILL;
                    } else {
                        if (i == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid Work Now type: ", onserviceconnected.getValue()));
                            return null;
                        }
                        int i14 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 105;
                        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        isephemeraleventkey = isEphemeralEventKey.GO_AND_START_LOW_FILL;
                    }
                }
            }
            isEphemeralEventKey isephemeraleventkey2 = isephemeraleventkey;
            int i16 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 43;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                int i17 = 55 / 0;
                if (startWorkingNavAction instanceof StartWorkingNavAction.StartInstantShift) {
                    numValueOf = Integer.valueOf(((StartWorkingNavAction.StartInstantShift) startWorkingNavAction).read);
                } else {
                    numValueOf = null;
                }
            } else if (startWorkingNavAction instanceof StartWorkingNavAction.StartInstantShift) {
                numValueOf = Integer.valueOf(((StartWorkingNavAction.StartInstantShift) startWorkingNavAction).read);
            } else {
                numValueOf = null;
            }
            String str = startWorkingNavAction instanceof StartWorkingNavAction.StartWorkNow ? ((StartWorkingNavAction.StartWorkNow) startWorkingNavAction).write : null;
            isephemeraleventkey2.getClass();
            handleinternalbannerrefreshlambda1 = new handleInternalBannerRefreshlambda1(isephemeraleventkey2, extensionWindowAreaStatusRequirements, numValueOf, str, onMove.RemoteActionCompatParcelizer(SimpleItemTouchHelperCallback.serializer, onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("vehicle", logbannerclicklambda0.serializer), new onViewAttachedToWindowlambda0("bag", logbannerclicklambda0.read))));
            C$b c$b = oneClickStartWorkingViewModel.ComponentActivity;
            logecommerceeventlambda0.IconCompatParcelizer = handleinternalbannerrefreshlambda1;
            logecommerceeventlambda0.RemoteActionCompatParcelizer = 1;
            objM5075invokegIAlus = c$b.m5075invokegIAlus(handleinternalbannerrefreshlambda1, logecommerceeventlambda0);
            if (objM5075invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i18 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 69;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i18 % Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                handleInternalBannerRefreshlambda1 handleinternalbannerrefreshlambda2 = logecommerceeventlambda0.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            handleinternalbannerrefreshlambda1 = logecommerceeventlambda0.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5075invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM5075invokegIAlus instanceof isItemDismissable)) {
            Integer num = handleinternalbannerrefreshlambda1.serializer;
            String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
            networkBody.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (strValueOf != null) {
                linkedHashMap.put("shift_id", strValueOf);
            }
            ((decode) networkBody.IconCompatParcelizer).logEvent("shift_started", linkedHashMap);
            doesTransientStatePreventRecycling doestransientstatepreventrecycling = oneClickStartWorkingViewModel.MediaMetadataCompat;
            Integer num2 = handleinternalbannerrefreshlambda1.serializer;
            String strValueOf2 = num2 != null ? String.valueOf(num2.intValue()) : null;
            if (strValueOf2 == null) {
                strValueOf2 = "";
            }
            doestransientstatepreventrecycling.getClass();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) doestransientstatepreventrecycling.serializer;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_INCOGNIA_SDK_ENABLED)) {
                BuildersKt.RemoteActionCompatParcelizer(doestransientstatepreventrecycling.write, null, null, new GetNestScope$invoke$3(strValueOf2, doestransientstatepreventrecycling, shortNewsContentCardView, 14), 3);
            }
            getquerycontext.serializer(logCustomEventlambda12.RemoteActionCompatParcelizer);
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5075invokegIAlus);
        if (thSerializer != null) {
            int i19 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 125;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            Timber.RemoteActionCompatParcelizer.write(thSerializer);
            String str2 = oneClickStartWorkingViewModel.read.read(thSerializer);
            networkBody.getClass();
            ff$$ExternalSyntheticOutline0.m("error_message", str2, (decode) networkBody.IconCompatParcelizer, "start_working_fail");
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) oneClickStartWorkingViewModel.MediaSessionCompatQueueItem;
            firebaseRemoteConfigImpl2.getClass();
            if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_REFRESH_STATE_ON_START_WORKING_FAILURE_ENABLED)) {
                getquerycontext.serializer(new logCustomEventlambda13(str2));
                return createfromparcel;
            }
            getquerycontext.serializer(new logEcommerceEventlambda11(new setApplicationContext(str2, null, null, 6)));
        }
        return createfromparcel;
    }
}
