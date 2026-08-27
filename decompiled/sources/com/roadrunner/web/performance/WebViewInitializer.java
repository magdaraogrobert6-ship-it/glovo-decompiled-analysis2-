package com.roadrunner.web.performance;

import android.app.Application;
import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter$launchJob$1;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.fFk$$ExternalSyntheticLambda0;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.login.presentation.router.RemoteConfigStartupTask;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository$loadConfig$2;
import com.roadrunner.user.properties.data.UserPropertiesRepository;
import io.grpc.LoadBalancer$Helper;
import io.grpc.internal.SharedResourcePool;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.SemanticsInfo;
import o.ShortNewsContentCardView;
import o.accessgetAlpha8cp;
import o.accessgetApparentToRealOffsetnOccac;
import o.createFromParcel;
import o.endFirstSessionDelay;
import o.executeAsOneOrNull;
import o.getAllSemanticsNodesToMap;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.inCompatibilityMode;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.subscribeToChangeUserEventslambda2;
import o.toShortimpl;
import o.transferSessionPackageI;
import o.truncslo4al4;
import o.updateAdidI;
import retrofit2.OkHttpCall$1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewInitializer implements SemanticsInfo {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final AtomicBoolean IconCompatParcelizer;
    public final OkHttpCall$1 MediaBrowserCompatMediaItem;
    public final AtomicBoolean RemoteActionCompatParcelizer;
    public final getAllSemanticsNodesToMap read;
    public final AtomicBoolean serializer;
    public final transferSessionPackageI write;

    /* JADX INFO: renamed from: com.roadrunner.web.performance.WebViewInitializer$init$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int IconCompatParcelizer = 1;
        private static int write;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ Object serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(1, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.serializer = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 123;
            write = i3 % Fields.SpotShadowColor;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = this.RemoteActionCompatParcelizer;
            Object obj2 = this.serializer;
            int i5 = 0;
            if (i4 == 0) {
                return new AnonymousClass2((WebViewInitializer) obj2, shortNewsContentCardView, i5);
            }
            int i6 = 1;
            if (i4 == 1) {
                return new AnonymousClass2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, i6);
            }
            if (i4 == 2) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2((AppEventInfoChangeHandler) obj2, shortNewsContentCardView, i);
                int i7 = write + 27;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return anonymousClass2;
            }
            int i9 = 3;
            if (i4 == 3) {
                AnonymousClass2 anonymousClass3 = new AnonymousClass2((RemoteConfigStartupTask) obj2, shortNewsContentCardView, i9);
                int i10 = IconCompatParcelizer + 99;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    return anonymousClass3;
                }
                throw null;
            }
            int i11 = 4;
            if (i4 == 4) {
                return new AnonymousClass2((endFirstSessionDelay) obj2, shortNewsContentCardView, i11);
            }
            int i12 = 5;
            if (i4 == 5) {
                return new AnonymousClass2((Gen2FunWithFlagsConfigRepository) obj2, shortNewsContentCardView, i12);
            }
            AnonymousClass2 anonymousClass4 = new AnonymousClass2((subscribeToChangeUserEventslambda2) obj2, shortNewsContentCardView, 6);
            int i13 = write + 55;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                int i14 = 98 / 0;
            }
            return anonymousClass4;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 73;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                throw null;
            }
            int i3 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
            if (i3 == 0) {
                return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 == 1) {
                return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 == 2) {
                return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 == 3) {
                return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 == 4) {
                return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 != 5) {
                return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            Object objInvokeSuspend = ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = IconCompatParcelizer + 121;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM5013invokegIAlus;
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = this.serializer;
            boolean z = false;
            ShortNewsContentCardView shortNewsContentCardView = null;
            int i3 = 1;
            if (i2 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.read;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return WebViewInitializer.access$initInternal((WebViewInitializer) obj2, false, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (i2 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.read;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    Object objInvoke = ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(this);
                    return objInvoke == coroutineSingletons2 ? coroutineSingletons2 : objInvoke;
                }
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (i2 == 2) {
                AppEventInfoChangeHandler appEventInfoChangeHandler = (AppEventInfoChangeHandler) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.read;
                if (i6 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SharedResourcePool sharedResourcePool = appEventInfoChangeHandler.IconCompatParcelizer;
                    this.read = 1;
                    obj = sharedResourcePool.invoke(this);
                    if (obj != coroutineSingletons3) {
                    }
                    return coroutineSingletons3;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                executeAsOneOrNull executeasoneornull = (executeAsOneOrNull) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{appEventInfoChangeHandler.MediaDescriptionCompat.getAndSet(executeasoneornull), executeasoneornull}, getCieXyz.write())).booleanValue()) {
                    return createfromparcel;
                }
                CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) appEventInfoChangeHandler.read.MediaSessionCompatResultReceiverWrapper();
                AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$1 = new AsyncImagePainter$launchJob$1(appEventInfoChangeHandler, executeasoneornull, shortNewsContentCardView, 22);
                this.read = 2;
                if (BuildersKt.withContext(coroutineDispatcher, asyncImagePainter$launchJob$1, this) != coroutineSingletons3) {
                    return createfromparcel;
                }
                return coroutineSingletons3;
            }
            if (i2 == 3) {
                RemoteConfigStartupTask remoteConfigStartupTask = (RemoteConfigStartupTask) obj2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.read;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl = remoteConfigStartupTask.RemoteActionCompatParcelizer;
                    this.read = 1;
                    objM5013invokegIAlus = fetchRemoteConfigUseCaseImpl.m5013invokegIAlus(false, this);
                    if (objM5013invokegIAlus == coroutineSingletons4) {
                        int i8 = IconCompatParcelizer + 27;
                        write = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return coroutineSingletons4;
                    }
                } else {
                    if (i7 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i10 = IconCompatParcelizer + 15;
                    write = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objM5013invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
                }
                if (!(objM5013invokegIAlus instanceof isItemDismissable)) {
                    int i11 = IconCompatParcelizer + 29;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    remoteConfigStartupTask.read.IconCompatParcelizer("remote_config_startup_task");
                    remoteConfigStartupTask.write.write();
                }
                return new onItemDismiss(objM5013invokegIAlus);
            }
            int i13 = 4;
            if (i2 == 4) {
                endFirstSessionDelay endfirstsessiondelay = (endFirstSessionDelay) obj2;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.read;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                ShiftZoneMapLayerUiModelImpl$1 shiftZoneMapLayerUiModelImpl$1 = new ShiftZoneMapLayerUiModelImpl$1(endfirstsessiondelay, shortNewsContentCardView, 11);
                this.read = 1;
                Object objWithContext = BuildersKt.withContext(defaultIoScheduler, shiftZoneMapLayerUiModelImpl$1, this);
                return objWithContext == coroutineSingletons5 ? coroutineSingletons5 : objWithContext;
            }
            if (i2 != 5) {
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.read;
                if (i15 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    UserPropertiesRepository userPropertiesRepository = ((subscribeToChangeUserEventslambda2) obj2).write;
                    this.read = 1;
                    obj = userPropertiesRepository.loadUserProperties(this);
                    if (obj == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i15 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                if (obj != null) {
                    int i16 = IconCompatParcelizer + 5;
                    write = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            Gen2FunWithFlagsConfigRepository gen2FunWithFlagsConfigRepository = (Gen2FunWithFlagsConfigRepository) obj2;
            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i18 = this.read;
            if (i18 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                endFirstSessionDelay endfirstsessiondelay2 = gen2FunWithFlagsConfigRepository.write;
                this.read = 1;
                obj = ((TraceTimeMeasurementWithPerformanceKit) endfirstsessiondelay2.IconCompatParcelizer).ofSuspend("fwf_gen2_disk_cache_read", new AnonymousClass2(endfirstsessiondelay2, shortNewsContentCardView, i13), this);
                if (obj != coroutineSingletons7) {
                }
                return coroutineSingletons7;
            }
            int i19 = IconCompatParcelizer;
            int i20 = i19 + 77;
            write = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            if (i18 != 1) {
                int i22 = i19 + 79;
                write = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                if (i18 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i24 = i19 + 25;
                write = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Map map = (Map) obj;
            if (map != null) {
                int i26 = IconCompatParcelizer + 23;
                write = i26 % Fields.SpotShadowColor;
                if (i26 % 2 != 0) {
                    map.isEmpty();
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                if (!map.isEmpty()) {
                    gen2FunWithFlagsConfigRepository.read.putAll(map);
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = gen2FunWithFlagsConfigRepository.MediaSessionCompatQueueItem;
                    DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new Gen2FunWithFlagsConfigRepository$loadConfig$2(gen2FunWithFlagsConfigRepository, shortNewsContentCardView, i3), 2);
                }
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("FwF Gen II: no disk cache, blocking on sync.", new Object[0]);
            this.read = 2;
            if (Gen2FunWithFlagsConfigRepository.access$syncAndPersist(gen2FunWithFlagsConfigRepository, this) != coroutineSingletons7) {
                return createfromparcel;
            }
            return coroutineSingletons7;
        }
    }

    public WebViewInitializer(OkHttpCall$1 okHttpCall$1, getAllSemanticsNodesToMap getallsemanticsnodestomap, transferSessionPackageI transfersessionpackagei) {
        okHttpCall$1.getClass();
        getallsemanticsnodestomap.getClass();
        transfersessionpackagei.getClass();
        this.MediaBrowserCompatMediaItem = okHttpCall$1;
        this.read = getallsemanticsnodestomap;
        this.write = transfersessionpackagei;
        this.serializer = new AtomicBoolean(false);
        this.RemoteActionCompatParcelizer = new AtomicBoolean(false);
        this.IconCompatParcelizer = new AtomicBoolean(false);
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 83;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.write;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_BACKGROUND_WEBVIEW_WARMUP_ENABLED)) {
            Object objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) this.read).ofSuspend("webview_warmup_background", new AnonymousClass2(this, null, 0), shortNewsContentCardView);
            if (objOfSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                int i4 = MediaDescriptionCompat + 105;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objOfSuspend;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0080  */
    /* JADX WARN: Code duplicated, block: B:16:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x008c  */
    public static final Object access$initInternal(WebViewInitializer webViewInitializer, boolean z, SuspendLambda suspendLambda) {
        Object result;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        AtomicBoolean atomicBoolean = webViewInitializer.serializer;
        if (!atomicBoolean.get() && !webViewInitializer.IconCompatParcelizer.get()) {
            if (z) {
                atomicBoolean.set(true);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(suspendLambda));
                cancellableContinuationImpl.read();
                OkHttpCall$1 okHttpCall$1 = webViewInitializer.MediaBrowserCompatMediaItem;
                accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = new accessgetApparentToRealOffsetnOccac(z, webViewInitializer, cancellableContinuationImpl);
                okHttpCall$1.getClass();
                ((inCompatibilityMode) ((isOpenInternalroom_runtime) okHttpCall$1.serializer)).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                fFk$$ExternalSyntheticLambda0 ffk__externalsyntheticlambda0 = new fFk$$ExternalSyntheticLambda0(i2, IntPair.write(DefaultIoScheduler.RemoteActionCompatParcelizer));
                truncslo4al4 truncslo4al4Var = new truncslo4al4(ffk__externalsyntheticlambda0, z);
                Context applicationContext = ((Application) okHttpCall$1.write).getApplicationContext();
                SentryTracer$$ExternalSyntheticLambda1 sentryTracer$$ExternalSyntheticLambda1 = new SentryTracer$$ExternalSyntheticLambda1(5, accessgetapparenttorealoffsetnoccac);
                int i4 = toShortimpl.IconCompatParcelizer;
                ffk__externalsyntheticlambda0.execute(new accessgetAlpha8cp(truncslo4al4Var, sentryTracer$$ExternalSyntheticLambda1, applicationContext, i2));
                result = cancellableContinuationImpl.getResult();
                if (result == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    i = MediaSessionCompatQueueItem + 103;
                    MediaDescriptionCompat = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        return result;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else {
                int i5 = MediaDescriptionCompat + 97;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (!webViewInitializer.RemoteActionCompatParcelizer.get()) {
                    atomicBoolean.set(true);
                    CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(suspendLambda));
                    cancellableContinuationImpl2.read();
                    OkHttpCall$1 okHttpCall$2 = webViewInitializer.MediaBrowserCompatMediaItem;
                    accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac2 = new accessgetApparentToRealOffsetnOccac(z, webViewInitializer, cancellableContinuationImpl2);
                    okHttpCall$2.getClass();
                    ((inCompatibilityMode) ((isOpenInternalroom_runtime) okHttpCall$2.serializer)).getClass();
                    DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    fFk$$ExternalSyntheticLambda0 ffk__externalsyntheticlambda1 = new fFk$$ExternalSyntheticLambda0(i2, IntPair.write(DefaultIoScheduler.RemoteActionCompatParcelizer));
                    truncslo4al4 truncslo4al4Var2 = new truncslo4al4(ffk__externalsyntheticlambda1, z);
                    Context applicationContext2 = ((Application) okHttpCall$2.write).getApplicationContext();
                    SentryTracer$$ExternalSyntheticLambda1 sentryTracer$$ExternalSyntheticLambda2 = new SentryTracer$$ExternalSyntheticLambda1(5, accessgetapparenttorealoffsetnoccac2);
                    int i7 = toShortimpl.IconCompatParcelizer;
                    ffk__externalsyntheticlambda1.execute(new accessgetAlpha8cp(truncslo4al4Var2, sentryTracer$$ExternalSyntheticLambda2, applicationContext2, i2));
                    result = cancellableContinuationImpl2.getResult();
                    if (result == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        i = MediaSessionCompatQueueItem + 103;
                        MediaDescriptionCompat = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            return result;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
            }
        }
        return createFromParcel.INSTANCE;
    }
}
