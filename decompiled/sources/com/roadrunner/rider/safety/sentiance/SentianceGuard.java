package com.roadrunner.rider.safety.sentiance;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxMapRecorder$$ExternalSyntheticLambda0;
import com.roadrunner.rider.safety.authentication.domain.GetSentianceAuthCodeUseCase;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt$CashBlock$1$1;
import com.sentiance.sdk.DetectionStatus;
import com.sentiance.sdk.EnableDetectionsError;
import com.sentiance.sdk.EnableDetectionsResult;
import com.sentiance.sdk.InitState;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.pendingoperation.PendingOperation;
import io.grpc.LoadBalancer$Helper;
import io.sentry.util.network.NetworkBody;
import java.util.Calendar;
import java.util.Date;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getFirstErrorCode;
import o.isAdapterPositionOnScreen;
import o.isAppSetIdReadingEnabled;
import o.isPreinstallTrackingEnabled;
import o.isSendingInBackgroundEnabled;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setDefaultTracker;
import o.setExternalDeviceId;
import o.setOnEventTrackingFailedListener;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SentianceGuard {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final setOnEventTrackingFailedListener MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final isPreinstallTrackingEnabled MediaMetadataCompat;
    public final getFirstErrorCode RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;
    public final GetSentianceAuthCodeUseCase serializer;
    public final NetworkBody write;

    public SentianceGuard(setOnEventTrackingFailedListener setoneventtrackingfailedlistener, isPreinstallTrackingEnabled ispreinstalltrackingenabled, GetSentianceAuthCodeUseCase getSentianceAuthCodeUseCase, getFirstErrorCode getfirsterrorcode, transferSessionPackageI transfersessionpackagei, NetworkBody networkBody) {
        setoneventtrackingfailedlistener.getClass();
        ispreinstalltrackingenabled.getClass();
        getSentianceAuthCodeUseCase.getClass();
        getfirsterrorcode.getClass();
        transfersessionpackagei.getClass();
        networkBody.getClass();
        this.MediaBrowserCompatMediaItem = setoneventtrackingfailedlistener;
        this.MediaMetadataCompat = ispreinstalltrackingenabled;
        this.serializer = getSentianceAuthCodeUseCase;
        this.RemoteActionCompatParcelizer = getfirsterrorcode;
        this.read = transfersessionpackagei;
        this.write = networkBody;
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new isAppSetIdReadingEnabled(this, 0));
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new isAppSetIdReadingEnabled(this, 1));
    }

    public final Sentiance IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Sentiance sentiance = (Sentiance) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
        int i4 = MediaSessionCompatQueueItem + 13;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return sentiance;
        }
        throw null;
    }

    public final boolean read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            IconCompatParcelizer().getInitState();
            InitState initState = InitState.INITIALIZED;
            throw null;
        }
        if (IconCompatParcelizer().getInitState() != InitState.INITIALIZED) {
            return false;
        }
        int i3 = MediaSessionCompatQueueItem + 57;
        RatingCompat = i3 % Fields.SpotShadowColor;
        return i3 % 2 != 0;
    }

    public final void IconCompatParcelizer(String str, Throwable th) {
        String strConcat;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 35;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            read();
            throw null;
        }
        if (read()) {
            strConcat = str + " SdkStatus: " + IconCompatParcelizer().getSdkStatus();
            int i3 = RatingCompat + 77;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            strConcat = str.concat(" SdkStatus: Not initialized yet.");
        }
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.IconCompatParcelizer(strConcat, new Object[0]);
        forest.write(new RiderSafetyException(strConcat, th));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r10 == r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkAndCreateSentianceUser(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.safety.sentiance.SentianceGuard.checkAndCreateSentianceUser(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:59:0x016e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x017c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0182  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f  */
    public final Object startTrip(Date date, CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$1, ContinuationImpl continuationImpl) {
        isSendingInBackgroundEnabled issendinginbackgroundenabled;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int i;
        int i2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        int i3;
        Object orThrow;
        int i4 = 2 % 2;
        int i5 = RatingCompat + 61;
        int i6 = i5 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            boolean z = continuationImpl instanceof isSendingInBackgroundEnabled;
            throw null;
        }
        if (continuationImpl instanceof isSendingInBackgroundEnabled) {
            int i7 = i6 + 57;
            RatingCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = ((isSendingInBackgroundEnabled) continuationImpl).write;
                throw null;
            }
            issendinginbackgroundenabled = (isSendingInBackgroundEnabled) continuationImpl;
            int i9 = issendinginbackgroundenabled.write;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                issendinginbackgroundenabled.write = i9 - Integer.MIN_VALUE;
            } else {
                issendinginbackgroundenabled = new isSendingInBackgroundEnabled(this, continuationImpl);
            }
        } else {
            issendinginbackgroundenabled = new isSendingInBackgroundEnabled(this, continuationImpl);
        }
        Object objCheckAndCreateSentianceUser = issendinginbackgroundenabled.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = issendinginbackgroundenabled.write;
        getFirstErrorCode getfirsterrorcode = this.RemoteActionCompatParcelizer;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objCheckAndCreateSentianceUser);
            getfirsterrorcode.read("start_trip");
            issendinginbackgroundenabled.RemoteActionCompatParcelizer = date;
            issendinginbackgroundenabled.serializer = cashBlockKt$CashBlock$1$1;
            issendinginbackgroundenabled.write = 1;
            objCheckAndCreateSentianceUser = checkAndCreateSentianceUser(issendinginbackgroundenabled);
            if (objCheckAndCreateSentianceUser != obj2) {
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = cashBlockKt$CashBlock$1$1;
            return obj2;
        }
        int i11 = MediaSessionCompatQueueItem + 87;
        int i12 = i11 % Fields.SpotShadowColor;
        RatingCompat = i12;
        if (i11 % 2 != 0 ? i10 == 1 : i10 == 1) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = issendinginbackgroundenabled.serializer;
            date = issendinginbackgroundenabled.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objCheckAndCreateSentianceUser);
            int i13 = RatingCompat + 29;
            MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        } else {
            if (i10 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i15 = i12 + 29;
            MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                int i16 = issendinginbackgroundenabled.read;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = issendinginbackgroundenabled.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objCheckAndCreateSentianceUser);
                throw null;
            }
            i = issendinginbackgroundenabled.read;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = issendinginbackgroundenabled.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objCheckAndCreateSentianceUser);
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k4;
        }
        if (!((Boolean) objCheckAndCreateSentianceUser).booleanValue()) {
            i2 = MediaSessionCompatQueueItem + 43;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return Boolean.FALSE;
            }
            Boolean bool = Boolean.FALSE;
            obj.hashCode();
            throw null;
        }
        MapboxMapRecorder$$ExternalSyntheticLambda0 mapboxMapRecorder$$ExternalSyntheticLambda0 = new MapboxMapRecorder$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        NetworkBody networkBody = this.write;
        networkBody.getClass();
        networkBody.RemoteActionCompatParcelizer = mapboxMapRecorder$$ExternalSyntheticLambda0;
        IconCompatParcelizer().setSdkStatusUpdateListener(networkBody);
        getfirsterrorcode.getClass();
        getfirsterrorcode.RemoteActionCompatParcelizer("rider_safety_auto_detections_enabled", null);
        if (i == 0) {
            getfirsterrorcode.write("rider_safety_trip_started", null);
        }
        return Boolean.TRUE;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = cashBlockKt$CashBlock$1$1;
        if (!((Boolean) objCheckAndCreateSentianceUser).booleanValue()) {
            return Boolean.FALSE;
        }
        DetectionStatus detectionStatus = IconCompatParcelizer().getDetectionStatus();
        DetectionStatus detectionStatus2 = DetectionStatus.ENABLED_AND_DETECTING;
        int i17 = 3;
        if (detectionStatus == detectionStatus2) {
            int i18 = RatingCompat + 49;
            MediaSessionCompatQueueItem = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                int i19 = 3 % 3;
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        issendinginbackgroundenabled.RemoteActionCompatParcelizer = null;
        issendinginbackgroundenabled.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        issendinginbackgroundenabled.read = i3;
        issendinginbackgroundenabled.write = 2;
        if (IconCompatParcelizer().getDetectionStatus() == detectionStatus2) {
            int i20 = RatingCompat + 91;
            MediaSessionCompatQueueItem = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            orThrow = Boolean.TRUE;
        } else {
            SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(issendinginbackgroundenabled), CoroutineSingletons.UNDECIDED);
            getfirsterrorcode.read("enable_detections");
            Sentiance sentianceIconCompatParcelizer = IconCompatParcelizer();
            if (!((Boolean) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Sentiance timeout fix is disabled, defaulting to 1-hour timeout", new Object[0]);
                Calendar calendar = Calendar.getInstance();
                calendar.add(11, 1);
                date = calendar.getTime();
                date.getClass();
            } else if (date == null) {
                Timber.RemoteActionCompatParcelizer.write(new IllegalStateException("Current shift end time is null, defaulting to 1-hour timeout"));
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(11, 1);
                date = calendar2.getTime();
                date.getClass();
            }
            PendingOperation<EnableDetectionsResult, EnableDetectionsError> pendingOperationEnableDetections = sentianceIconCompatParcelizer.enableDetections(date);
            pendingOperationEnableDetections.getClass();
            pendingOperationEnableDetections.addOnSuccessListener(new setDefaultTracker(this, safeContinuation, i17)).addOnFailureListener(new setExternalDeviceId(this, safeContinuation, i17));
            orThrow = safeContinuation.getOrThrow();
        }
        if (orThrow != obj2) {
            int i22 = i3;
            objCheckAndCreateSentianceUser = orThrow;
            i = i22;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            if (!((Boolean) objCheckAndCreateSentianceUser).booleanValue()) {
                i2 = MediaSessionCompatQueueItem + 43;
                RatingCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return Boolean.FALSE;
                }
                Boolean bool2 = Boolean.FALSE;
                obj.hashCode();
                throw null;
            }
            MapboxMapRecorder$$ExternalSyntheticLambda0 mapboxMapRecorder$$ExternalSyntheticLambda1 = new MapboxMapRecorder$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            NetworkBody networkBody2 = this.write;
            networkBody2.getClass();
            networkBody2.RemoteActionCompatParcelizer = mapboxMapRecorder$$ExternalSyntheticLambda1;
            IconCompatParcelizer().setSdkStatusUpdateListener(networkBody2);
            getfirsterrorcode.getClass();
            getfirsterrorcode.RemoteActionCompatParcelizer("rider_safety_auto_detections_enabled", null);
            if (i == 0) {
                getfirsterrorcode.write("rider_safety_trip_started", null);
            }
            return Boolean.TRUE;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = cashBlockKt$CashBlock$1$1;
        return obj2;
    }
}
