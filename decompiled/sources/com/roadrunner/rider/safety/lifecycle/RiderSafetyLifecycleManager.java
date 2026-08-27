package com.roadrunner.rider.safety.lifecycle;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.safety.authentication.domain.IsSafetyTrackingAllowedUseCase;
import com.roadrunner.rider.safety.sentiance.SentianceGuard;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.sentiance.sdk.pendingoperation.OnFailureListener;
import com.sentiance.sdk.pendingoperation.OnSuccessListener;
import com.sentiance.sdk.reset.ResetError;
import com.sentiance.sdk.reset.ResetResult;
import dagger.Lazy;
import io.grpc.LoadBalancer$Helper;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.SemanticsPropertiesContentDescription1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getCallbackId;
import o.getContentViewGroupParentLayout;
import o.getFirstErrorCode;
import o.getInstallBeginTimeInSeconds;
import o.getIsClick;
import o.getPurchaseVerificationCallback;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.isTrackingEnabled;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.setClickTimeInSeconds;
import o.setDefaultTracker;
import o.setExternalDeviceId;
import o.setOnDeferredDeeplinkResponseListener;
import o.setSubsessionInterval;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyLifecycleManager implements getInstallBeginTimeInSeconds {
    private static int ComponentActivity = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean IconCompatParcelizer;
    public final getFirstErrorCode MediaBrowserCompatMediaItem;
    public final getIsClick MediaDescriptionCompat;
    public final IsSafetyTrackingAllowedUseCase MediaMetadataCompat;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public final setOnDeferredDeeplinkResponseListener MediaSessionCompatResultReceiverWrapper;
    public final Lazy MediaSessionCompatToken;
    public final getPurchaseVerificationCallback ParcelableVolumeInfo;
    public final getContentViewGroupParentLayout PlaybackStateCompat;
    public final setSubsessionInterval PlaybackStateCompatCustomAction;
    public final SemanticsPropertiesContentDescription1 RatingCompat;
    public final GetCourierStatusUseCaseImpl RemoteActionCompatParcelizer;
    public final getAllSemanticsNodesToMap ResultReceiver;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU read;
    public final GetAppStateImpl serializer;
    public final isOpenInternalroom_runtime write;

    public RiderSafetyLifecycleManager(getPurchaseVerificationCallback getpurchaseverificationcallback, GetCourierStatusUseCaseImpl getCourierStatusUseCaseImpl, setOnDeferredDeeplinkResponseListener setondeferreddeeplinkresponselistener, setSubsessionInterval setsubsessioninterval, Lazy lazy, isOpenInternalroom_runtime isopeninternalroom_runtime, getContentViewGroupParentLayout getcontentviewgroupparentlayout, IsSafetyTrackingAllowedUseCase isSafetyTrackingAllowedUseCase, getIsClick getisclick, SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1, transferSessionPackageI transfersessionpackagei, getAllSemanticsNodesToMap getallsemanticsnodestomap, GetAppStateImpl getAppStateImpl, getFirstErrorCode getfirsterrorcode) {
        getpurchaseverificationcallback.getClass();
        getCourierStatusUseCaseImpl.getClass();
        setondeferreddeeplinkresponselistener.getClass();
        setsubsessioninterval.getClass();
        lazy.getClass();
        isopeninternalroom_runtime.getClass();
        getcontentviewgroupparentlayout.getClass();
        isSafetyTrackingAllowedUseCase.getClass();
        getisclick.getClass();
        semanticsPropertiesContentDescription1.getClass();
        transfersessionpackagei.getClass();
        getallsemanticsnodestomap.getClass();
        getAppStateImpl.getClass();
        getfirsterrorcode.getClass();
        this.ParcelableVolumeInfo = getpurchaseverificationcallback;
        this.RemoteActionCompatParcelizer = getCourierStatusUseCaseImpl;
        this.MediaSessionCompatResultReceiverWrapper = setondeferreddeeplinkresponselistener;
        this.PlaybackStateCompatCustomAction = setsubsessioninterval;
        this.MediaSessionCompatToken = lazy;
        this.write = isopeninternalroom_runtime;
        this.PlaybackStateCompat = getcontentviewgroupparentlayout;
        this.MediaMetadataCompat = isSafetyTrackingAllowedUseCase;
        this.MediaDescriptionCompat = getisclick;
        this.RatingCompat = semanticsPropertiesContentDescription1;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.ResultReceiver = getallsemanticsnodestomap;
        this.serializer = getAppStateImpl;
        this.MediaBrowserCompatMediaItem = getfirsterrorcode;
    }

    public final void IconCompatParcelizer() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 27;
        ComponentActivity = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.read;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i4 = ComponentActivity + 67;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        ((inCompatibilityMode) this.write).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.read = BuildersKt.RemoteActionCompatParcelizer(this.PlaybackStateCompat, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new RiderSafetyLifecycleManager$initializeInternal$1(this, shortNewsContentCardView, i), 2);
        int i6 = ComponentActivity + 123;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
    }

    public final void read() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 29;
        ComponentActivity = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            SentianceGuard sentianceGuard = (SentianceGuard) this.MediaSessionCompatToken.write();
            sentianceGuard.read();
            getFirstErrorCode getfirsterrorcode = sentianceGuard.RemoteActionCompatParcelizer;
            throw null;
        }
        final SentianceGuard sentianceGuard2 = (SentianceGuard) this.MediaSessionCompatToken.write();
        boolean z = sentianceGuard2.read();
        getFirstErrorCode getfirsterrorcode2 = sentianceGuard2.RemoteActionCompatParcelizer;
        if (z) {
            getfirsterrorcode2.read("reset");
            sentianceGuard2.IconCompatParcelizer().reset().addOnSuccessListener(new OnSuccessListener() { // from class: o.isCoppaComplianceEnabled
                private static int IconCompatParcelizer = 1;
                private static int write;

                @Override // com.sentiance.sdk.pendingoperation.OnSuccessListener
                public final void onSuccess(Object obj) {
                    int i3 = 2 % 2;
                    int i4 = write + 101;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    ((ResetResult) obj).getClass();
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Sentiance reset is successful", new Object[0]);
                    sentianceGuard2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("reset");
                    int i6 = write + 79;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: o.isPlayStoreKidsComplianceEnabled
                private static int serializer = 1;
                private static int write;

                @Override // com.sentiance.sdk.pendingoperation.OnFailureListener
                public final void onFailure(Object obj) {
                    int i3 = 2 % 2;
                    ResetError resetError = (ResetError) obj;
                    resetError.getClass();
                    String strName = resetError.getReason().name();
                    SentianceGuard sentianceGuard3 = sentianceGuard2;
                    sentianceGuard3.RemoteActionCompatParcelizer.serializer("reset");
                    sentianceGuard3.IconCompatParcelizer("Sentiance reset failed: " + strName, null);
                    int i4 = write + 21;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        int i5 = 36 / 0;
                    }
                }
            }).getClass();
            int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 97;
            ComponentActivity = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            getfirsterrorcode2.read("reset_skipped");
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Sentiance reset skipped: Sentiance is not initialized", new Object[0]);
        }
        getIsClick getisclick = this.MediaDescriptionCompat;
        getisclick.RemoteActionCompatParcelizer = false;
        getisclick.IconCompatParcelizer = 0L;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 121;
        ComponentActivity = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.IconCompatParcelizer && this.ParcelableVolumeInfo.read()) {
            int i3 = ComponentActivity + 13;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.MediaSessionCompatQueueItem;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_BACKGROUND_INIT_ENABLED)) {
                ((inCompatibilityMode) this.write).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(this.PlaybackStateCompat, MainDispatcherLoader.read, null, new RiderSafetyLifecycleManager$initializeInternal$1(this, shortNewsContentCardView, 0), 2);
                return;
            }
            boolean zBooleanValue = ((Boolean) ((TraceTimeMeasurementWithPerformanceKit) this.ResultReceiver).read("rider_safety_init_internal", new NetworkingCoreModule$$ExternalSyntheticLambda2(28, this))).booleanValue();
            this.IconCompatParcelizer = zBooleanValue;
            if (zBooleanValue) {
                int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 5;
                ComponentActivity = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                IconCompatParcelizer();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r10 == r2) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startTrip(o.getCallbackId r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager.ComponentActivity = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto La9
            boolean r1 = r10 instanceof o.setCallbackParameters
            if (r1 == 0) goto L29
            int r2 = r2 + 39
            int r1 = r2 % 128
            com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r1
            int r2 = r2 % r0
            r1 = r10
            o.setCallbackParameters r1 = (o.setCallbackParameters) r1
            int r2 = r1.write
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L29
            int r2 = r2 + r4
            r1.write = r2
            goto L2e
        L29:
            o.setCallbackParameters r1 = new o.setCallbackParameters
            r1.<init>(r8, r10)
        L2e:
            java.lang.Object r10 = r1.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.write
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            r6 = 1
            if (r4 == 0) goto L4f
            if (r4 == r6) goto L49
            if (r4 != r0) goto L43
            o.getCallbackId r9 = r1.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L82
        L43:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r3
        L49:
            o.getCallbackId r9 = r1.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L61
        L4f:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r1.read = r9
            r1.write = r6
            o.SemanticsPropertiesContentDescription1 r10 = r8.RatingCompat
            com.roadrunner.auth.domain.token.IsUserSignedInImpl r10 = (com.roadrunner.auth.domain.token.IsUserSignedInImpl) r10
            java.lang.Object r10 = r10.invoke(r1)
            if (r10 != r2) goto L61
            goto L81
        L61:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L6a
            goto La8
        L6a:
            com.roadrunner.auth.data.AuthRepository$logoutUser$2 r10 = new com.roadrunner.auth.data.AuthRepository$logoutUser$2
            r4 = 29
            r10.<init>(r8, r3, r4)
            r1.read = r9
            r1.write = r0
            o.getAllSemanticsNodesToMap r4 = r8.ResultReceiver
            com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit r4 = (com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit) r4
            java.lang.String r7 = "rider_safety_start_trip"
            java.lang.Object r10 = r4.ofSuspend(r7, r10, r1)
            if (r10 != r2) goto L82
        L81:
            return r2
        L82:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r10 = r10 ^ r6
            if (r10 == 0) goto L8c
            goto La8
        L8c:
            int r10 = com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager.ComponentActivity
            int r10 = r10 + 77
            int r1 = r10 % 128
            com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r1
            int r10 = r10 % r0
            o.transferSessionPackageI r10 = r8.MediaSessionCompatQueueItem
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r10 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r10
            boolean r10 = r10.PlaybackStateCompat()
            if (r10 != 0) goto La8
            if (r9 == 0) goto La3
            java.util.Calendar r3 = r9.read
        La3:
            o.setSubsessionInterval r9 = r8.PlaybackStateCompatCustomAction
            r9.write(r3)
        La8:
            return r5
        La9:
            boolean r9 = r10 instanceof o.setCallbackParameters
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager.startTrip(o.getCallbackId, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static final Object access$invalidateTripStatus(RiderSafetyLifecycleManager riderSafetyLifecycleManager, getCallbackId getcallbackid, ShortNewsContentCardView shortNewsContentCardView) {
        setClickTimeInSeconds setclicktimeinseconds;
        int i;
        Object objInvoke;
        Object obj;
        int i2;
        Object obj2;
        Object obj3;
        setOnDeferredDeeplinkResponseListener setondeferreddeeplinkresponselistener;
        isTrackingEnabled istrackingenabled;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        Object orThrow;
        getCallbackId getcallbackid2;
        long jWrite;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2;
        Object objStartTrip;
        int i3;
        getCallbackId getcallbackid3 = getcallbackid;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 117;
        int i7 = i6 % Fields.SpotShadowColor;
        ComponentActivity = i7;
        boolean zContains = false;
        if (i6 % 2 != 0) {
            if (shortNewsContentCardView instanceof setClickTimeInSeconds) {
                int i8 = i7 + 63;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                setclicktimeinseconds = (setClickTimeInSeconds) shortNewsContentCardView;
                i = setclicktimeinseconds.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i10 = ComponentActivity + 123;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    setclicktimeinseconds.write = i - Integer.MIN_VALUE;
                }
            }
            objInvoke = setclicktimeinseconds.serializer;
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = setclicktimeinseconds.write;
            obj2 = createFromParcel.INSTANCE;
            obj3 = null;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                getFirstErrorCode getfirsterrorcode = riderSafetyLifecycleManager.MediaBrowserCompatMediaItem;
                getfirsterrorcode.getClass();
                Map mapSingletonMap = Collections.singletonMap("courier_status", String.valueOf(getcallbackid));
                mapSingletonMap.getClass();
                getfirsterrorcode.RemoteActionCompatParcelizer("rider_safety_courier_status_changed", mapSingletonMap);
                setondeferreddeeplinkresponselistener = riderSafetyLifecycleManager.MediaSessionCompatResultReceiverWrapper;
                if (getcallbackid3 != null) {
                    int i12 = ComponentActivity + 55;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    istrackingenabled = getcallbackid3.IconCompatParcelizer;
                } else {
                    istrackingenabled = null;
                }
                if (setondeferreddeeplinkresponselistener.read.read()) {
                    zContains = setondeferreddeeplinkresponselistener.serializer.contains(istrackingenabled);
                }
                if (!(!zContains)) {
                    IsSafetyTrackingAllowedUseCase isSafetyTrackingAllowedUseCase = riderSafetyLifecycleManager.MediaMetadataCompat;
                    setclicktimeinseconds.RemoteActionCompatParcelizer = getcallbackid3;
                    setclicktimeinseconds.write = 1;
                    objInvoke = isSafetyTrackingAllowedUseCase.invoke(setclicktimeinseconds);
                    if (objInvoke != obj) {
                    }
                } else {
                    setclicktimeinseconds.RemoteActionCompatParcelizer = null;
                    setclicktimeinseconds.write = 3;
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                    SentianceGuard sentianceGuard = (SentianceGuard) riderSafetyLifecycleManager.MediaSessionCompatToken.write();
                    sentianceGuard.getClass();
                    SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(setclicktimeinseconds), CoroutineSingletons.UNDECIDED);
                    sentianceGuard.RemoteActionCompatParcelizer.read("disable_detections");
                    sentianceGuard.IconCompatParcelizer().disableDetections().addOnSuccessListener(new setDefaultTracker(sentianceGuard, safeContinuation, i4)).addOnFailureListener(new setExternalDeviceId(sentianceGuard, safeContinuation, i4));
                    orThrow = safeContinuation.getOrThrow();
                    if (orThrow != obj) {
                        orThrow = obj2;
                    }
                    if (orThrow != obj) {
                        orThrow = obj2;
                    }
                    if (orThrow != obj) {
                        return obj2;
                    }
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    return obj2;
                }
                int i14 = ComponentActivity + 23;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (i2 == 3) {
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                i3 = ComponentActivity + 7;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return null;
                }
                obj3.hashCode();
                throw null;
            }
            getcallbackid3 = setclicktimeinseconds.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            getcallbackid2 = getcallbackid3;
            if (((Boolean) objInvoke).booleanValue()) {
                int i16 = ComponentActivity + 85;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                setclicktimeinseconds.RemoteActionCompatParcelizer = null;
                setclicktimeinseconds.write = 2;
                jWrite = ((FirebaseRemoteConfigImpl) riderSafetyLifecycleManager.MediaSessionCompatQueueItem).IconCompatParcelizer.write("rider_safety_start_trip_delay_in_seconds");
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (jWrite <= 0) {
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                    }
                    riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                    objStartTrip = riderSafetyLifecycleManager.startTrip(getcallbackid2, setclicktimeinseconds);
                    if (objStartTrip != obj) {
                    }
                    if (objStartTrip == obj) {
                        return obj;
                    }
                    return obj2;
                }
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                }
                riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = BuildersKt.RemoteActionCompatParcelizer(riderSafetyLifecycleManager.PlaybackStateCompat, null, null, new NafathTimerManager$observeCountdown$1(jWrite * 1000, riderSafetyLifecycleManager, getcallbackid2, (ShortNewsContentCardView) null, 12), 3);
                objStartTrip = obj2;
                if (objStartTrip == obj) {
                    return obj;
                }
                return obj2;
            }
            setclicktimeinseconds.RemoteActionCompatParcelizer = null;
            setclicktimeinseconds.write = 3;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
            SentianceGuard sentianceGuard2 = (SentianceGuard) riderSafetyLifecycleManager.MediaSessionCompatToken.write();
            sentianceGuard2.getClass();
            SafeContinuation safeContinuation2 = new SafeContinuation(LoadBalancer$Helper.intercepted(setclicktimeinseconds), CoroutineSingletons.UNDECIDED);
            sentianceGuard2.RemoteActionCompatParcelizer.read("disable_detections");
            sentianceGuard2.IconCompatParcelizer().disableDetections().addOnSuccessListener(new setDefaultTracker(sentianceGuard2, safeContinuation2, i4)).addOnFailureListener(new setExternalDeviceId(sentianceGuard2, safeContinuation2, i4));
            orThrow = safeContinuation2.getOrThrow();
            if (orThrow != obj) {
                orThrow = obj2;
            }
            if (orThrow != obj) {
                orThrow = obj2;
            }
            if (orThrow != obj) {
                return obj;
            }
            return obj2;
        }
        int i18 = 62 / 0;
        if (shortNewsContentCardView instanceof setClickTimeInSeconds) {
            int i19 = i7 + 63;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            setclicktimeinseconds = (setClickTimeInSeconds) shortNewsContentCardView;
            i = setclicktimeinseconds.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i110 = ComponentActivity + 123;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
                setclicktimeinseconds.write = i - Integer.MIN_VALUE;
            }
        }
        objInvoke = setclicktimeinseconds.serializer;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = setclicktimeinseconds.write;
        obj2 = createFromParcel.INSTANCE;
        obj3 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            getFirstErrorCode getfirsterrorcode2 = riderSafetyLifecycleManager.MediaBrowserCompatMediaItem;
            getfirsterrorcode2.getClass();
            Map mapSingletonMap2 = Collections.singletonMap("courier_status", String.valueOf(getcallbackid));
            mapSingletonMap2.getClass();
            getfirsterrorcode2.RemoteActionCompatParcelizer("rider_safety_courier_status_changed", mapSingletonMap2);
            setondeferreddeeplinkresponselistener = riderSafetyLifecycleManager.MediaSessionCompatResultReceiverWrapper;
            if (getcallbackid3 != null) {
                int i112 = ComponentActivity + 55;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i112 % Fields.SpotShadowColor;
                int i113 = i112 % 2;
                istrackingenabled = getcallbackid3.IconCompatParcelizer;
            } else {
                istrackingenabled = null;
            }
            if (setondeferreddeeplinkresponselistener.read.read() && istrackingenabled != null && setondeferreddeeplinkresponselistener.write.RemoteActionCompatParcelizer()) {
                zContains = setondeferreddeeplinkresponselistener.serializer.contains(istrackingenabled);
            }
            if (!(!zContains)) {
                IsSafetyTrackingAllowedUseCase isSafetyTrackingAllowedUseCase2 = riderSafetyLifecycleManager.MediaMetadataCompat;
                setclicktimeinseconds.RemoteActionCompatParcelizer = getcallbackid3;
                setclicktimeinseconds.write = 1;
                objInvoke = isSafetyTrackingAllowedUseCase2.invoke(setclicktimeinseconds);
                if (objInvoke != obj) {
                }
            } else {
                setclicktimeinseconds.RemoteActionCompatParcelizer = null;
                setclicktimeinseconds.write = 3;
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                SentianceGuard sentianceGuard3 = (SentianceGuard) riderSafetyLifecycleManager.MediaSessionCompatToken.write();
                sentianceGuard3.getClass();
                SafeContinuation safeContinuation3 = new SafeContinuation(LoadBalancer$Helper.intercepted(setclicktimeinseconds), CoroutineSingletons.UNDECIDED);
                sentianceGuard3.RemoteActionCompatParcelizer.read("disable_detections");
                sentianceGuard3.IconCompatParcelizer().disableDetections().addOnSuccessListener(new setDefaultTracker(sentianceGuard3, safeContinuation3, i4)).addOnFailureListener(new setExternalDeviceId(sentianceGuard3, safeContinuation3, i4));
                orThrow = safeContinuation3.getOrThrow();
                if (orThrow != obj) {
                    orThrow = obj2;
                }
                if (orThrow != obj) {
                    orThrow = obj2;
                }
                if (orThrow != obj) {
                    return obj2;
                }
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return obj2;
            }
            int i114 = ComponentActivity + 23;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i114 % Fields.SpotShadowColor;
            int i115 = i114 % 2;
            if (i2 == 3) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return obj2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            i3 = ComponentActivity + 7;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return null;
            }
            obj3.hashCode();
            throw null;
        }
        getcallbackid3 = setclicktimeinseconds.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        getcallbackid2 = getcallbackid3;
        if (((Boolean) objInvoke).booleanValue()) {
            int i116 = ComponentActivity + 85;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i116 % Fields.SpotShadowColor;
            int i117 = i116 % 2;
            setclicktimeinseconds.RemoteActionCompatParcelizer = null;
            setclicktimeinseconds.write = 2;
            jWrite = ((FirebaseRemoteConfigImpl) riderSafetyLifecycleManager.MediaSessionCompatQueueItem).IconCompatParcelizer.write("rider_safety_start_trip_delay_in_seconds");
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (jWrite <= 0) {
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                }
                riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                objStartTrip = riderSafetyLifecycleManager.startTrip(getcallbackid2, setclicktimeinseconds);
                if (objStartTrip != obj) {
                }
                if (objStartTrip == obj) {
                    return obj;
                }
                return obj2;
            }
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
            }
            riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = BuildersKt.RemoteActionCompatParcelizer(riderSafetyLifecycleManager.PlaybackStateCompat, null, null, new NafathTimerManager$observeCountdown$1(jWrite * 1000, riderSafetyLifecycleManager, getcallbackid2, (ShortNewsContentCardView) null, 12), 3);
            objStartTrip = obj2;
            if (objStartTrip == obj) {
                return obj;
            }
            return obj2;
        }
        setclicktimeinseconds.RemoteActionCompatParcelizer = null;
        setclicktimeinseconds.write = 3;
        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        SentianceGuard sentianceGuard4 = (SentianceGuard) riderSafetyLifecycleManager.MediaSessionCompatToken.write();
        sentianceGuard4.getClass();
        SafeContinuation safeContinuation4 = new SafeContinuation(LoadBalancer$Helper.intercepted(setclicktimeinseconds), CoroutineSingletons.UNDECIDED);
        sentianceGuard4.RemoteActionCompatParcelizer.read("disable_detections");
        sentianceGuard4.IconCompatParcelizer().disableDetections().addOnSuccessListener(new setDefaultTracker(sentianceGuard4, safeContinuation4, i4)).addOnFailureListener(new setExternalDeviceId(sentianceGuard4, safeContinuation4, i4));
        orThrow = safeContinuation4.getOrThrow();
        if (orThrow != obj) {
            orThrow = obj2;
        }
        if (orThrow != obj) {
            orThrow = obj2;
        }
        if (orThrow != obj) {
            return obj;
        }
        return obj2;
        setclicktimeinseconds = new setClickTimeInSeconds(riderSafetyLifecycleManager, shortNewsContentCardView);
        objInvoke = setclicktimeinseconds.serializer;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = setclicktimeinseconds.write;
        obj2 = createFromParcel.INSTANCE;
        obj3 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            getFirstErrorCode getfirsterrorcode3 = riderSafetyLifecycleManager.MediaBrowserCompatMediaItem;
            getfirsterrorcode3.getClass();
            Map mapSingletonMap3 = Collections.singletonMap("courier_status", String.valueOf(getcallbackid));
            mapSingletonMap3.getClass();
            getfirsterrorcode3.RemoteActionCompatParcelizer("rider_safety_courier_status_changed", mapSingletonMap3);
            setondeferreddeeplinkresponselistener = riderSafetyLifecycleManager.MediaSessionCompatResultReceiverWrapper;
            if (getcallbackid3 != null) {
                int i118 = ComponentActivity + 55;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i118 % Fields.SpotShadowColor;
                int i119 = i118 % 2;
                istrackingenabled = getcallbackid3.IconCompatParcelizer;
            } else {
                istrackingenabled = null;
            }
            if (setondeferreddeeplinkresponselistener.read.read()) {
                zContains = setondeferreddeeplinkresponselistener.serializer.contains(istrackingenabled);
            }
            if (!(!zContains)) {
                IsSafetyTrackingAllowedUseCase isSafetyTrackingAllowedUseCase3 = riderSafetyLifecycleManager.MediaMetadataCompat;
                setclicktimeinseconds.RemoteActionCompatParcelizer = getcallbackid3;
                setclicktimeinseconds.write = 1;
                objInvoke = isSafetyTrackingAllowedUseCase3.invoke(setclicktimeinseconds);
                if (objInvoke != obj) {
                }
            } else {
                setclicktimeinseconds.RemoteActionCompatParcelizer = null;
                setclicktimeinseconds.write = 3;
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                SentianceGuard sentianceGuard5 = (SentianceGuard) riderSafetyLifecycleManager.MediaSessionCompatToken.write();
                sentianceGuard5.getClass();
                SafeContinuation safeContinuation5 = new SafeContinuation(LoadBalancer$Helper.intercepted(setclicktimeinseconds), CoroutineSingletons.UNDECIDED);
                sentianceGuard5.RemoteActionCompatParcelizer.read("disable_detections");
                sentianceGuard5.IconCompatParcelizer().disableDetections().addOnSuccessListener(new setDefaultTracker(sentianceGuard5, safeContinuation5, i4)).addOnFailureListener(new setExternalDeviceId(sentianceGuard5, safeContinuation5, i4));
                orThrow = safeContinuation5.getOrThrow();
                if (orThrow != obj) {
                    orThrow = obj2;
                }
                if (orThrow != obj) {
                    orThrow = obj2;
                }
                if (orThrow != obj) {
                    return obj2;
                }
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return obj2;
            }
            int i1110 = ComponentActivity + 23;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i1110 % Fields.SpotShadowColor;
            int i1111 = i1110 % 2;
            if (i2 == 3) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return obj2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            i3 = ComponentActivity + 7;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return null;
            }
            obj3.hashCode();
            throw null;
        }
        getcallbackid3 = setclicktimeinseconds.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        getcallbackid2 = getcallbackid3;
        if (((Boolean) objInvoke).booleanValue()) {
            int i1112 = ComponentActivity + 85;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i1112 % Fields.SpotShadowColor;
            int i1113 = i1112 % 2;
            setclicktimeinseconds.RemoteActionCompatParcelizer = null;
            setclicktimeinseconds.write = 2;
            jWrite = ((FirebaseRemoteConfigImpl) riderSafetyLifecycleManager.MediaSessionCompatQueueItem).IconCompatParcelizer.write("rider_safety_start_trip_delay_in_seconds");
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (jWrite <= 0) {
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                }
                riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                objStartTrip = riderSafetyLifecycleManager.startTrip(getcallbackid2, setclicktimeinseconds);
                if (objStartTrip != obj) {
                }
                if (objStartTrip == obj) {
                    return obj;
                }
                return obj2;
            }
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
            }
            riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = BuildersKt.RemoteActionCompatParcelizer(riderSafetyLifecycleManager.PlaybackStateCompat, null, null, new NafathTimerManager$observeCountdown$1(jWrite * 1000, riderSafetyLifecycleManager, getcallbackid2, (ShortNewsContentCardView) null, 12), 3);
            objStartTrip = obj2;
            if (objStartTrip == obj) {
                return obj;
            }
            return obj2;
        }
        setclicktimeinseconds.RemoteActionCompatParcelizer = null;
        setclicktimeinseconds.write = 3;
        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        riderSafetyLifecycleManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        SentianceGuard sentianceGuard6 = (SentianceGuard) riderSafetyLifecycleManager.MediaSessionCompatToken.write();
        sentianceGuard6.getClass();
        SafeContinuation safeContinuation6 = new SafeContinuation(LoadBalancer$Helper.intercepted(setclicktimeinseconds), CoroutineSingletons.UNDECIDED);
        sentianceGuard6.RemoteActionCompatParcelizer.read("disable_detections");
        sentianceGuard6.IconCompatParcelizer().disableDetections().addOnSuccessListener(new setDefaultTracker(sentianceGuard6, safeContinuation6, i4)).addOnFailureListener(new setExternalDeviceId(sentianceGuard6, safeContinuation6, i4));
        orThrow = safeContinuation6.getOrThrow();
        if (orThrow != obj) {
            orThrow = obj2;
        }
        if (orThrow != obj) {
            orThrow = obj2;
        }
        if (orThrow != obj) {
            return obj;
        }
        return obj2;
    }
}
