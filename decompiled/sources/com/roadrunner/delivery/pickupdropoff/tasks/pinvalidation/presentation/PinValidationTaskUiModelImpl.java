package com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation;

import android.os.SystemClock;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.domain.Pbkdf2PinHashDerivation$deriveHash$2;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.logger.PinValidationEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.C0212wallpaper;
import o.ComposeAnimationState;
import o.Device;
import o.Devices;
import o.PointerInteropFilterpointerInputFilter1stopDispatching1;
import o.PreviewLightDark;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.apiLevel;
import o.createAnimation;
import o.createFromParcel;
import o.executeAsList;
import o.fastFilterNotNull;
import o.findParameters;
import o.getPositionannotations;
import o.getSizeannotations;
import o.getWEAR_OS_LARGE_ROUNDannotations;
import o.getWEAR_OS_RECTannotations;
import o.isFinite0680j_4annotations;
import o.isItemDismissable;
import o.isSpecifiedEaSLcWc;
import o.isSpecifiedjoFl9I;
import o.isSpecifiedjoFl9Iannotations;
import o.isUnspecified0680j_4annotations;
import o.isUnspecifiedEaSLcWc;
import o.isUnspecifiedEaSLcWcannotations;
import o.isUnspecifiedjoFl9I;
import o.minHeightOffsets;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.safeSetClipToOutline;
import o.setCarryoverInAppMessage;
import o.setUdmandroid_sdk_base_release;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class PinValidationTaskUiModelImpl implements minHeightOffsets {
    private static int ComponentActivity = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final ContextScope IconCompatParcelizer;
    public final isUnspecifiedEaSLcWc MediaBrowserCompatMediaItem;
    public Long MediaDescriptionCompat;
    public final GetDeliveryAnalyticsUseCaseImpl MediaMetadataCompat;
    public final long MediaSessionCompatQueueItem;
    public final createAnimation MediaSessionCompatResultReceiverWrapper;
    public final setUdmandroid_sdk_base_release MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public final PinValidationEventLoggerImpl PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final fastFilterNotNull RemoteActionCompatParcelizer;
    public final UpdateTaskUseCaseImpl r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final DeliveryConfirmationLoggerImpl read;
    public getPositionannotations serializer;
    public final MutableStateFlow write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ComponentActivity;
        int i3 = i2 + 1;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.PlaybackStateCompatCustomAction;
        int i4 = i2 + 31;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public PinValidationTaskUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, isUnspecifiedEaSLcWc isunspecifiedeaslcwc, createAnimation createanimation, PinValidationEventLoggerImpl pinValidationEventLoggerImpl, setUdmandroid_sdk_base_release setudmandroid_sdk_base_release, g0 g0Var) {
        str.getClass();
        this.RemoteActionCompatParcelizer = fastfilternotnull;
        this.IconCompatParcelizer = contextScope;
        this.PlaybackStateCompatCustomAction = str;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = updateTaskUseCaseImpl;
        this.MediaMetadataCompat = getDeliveryAnalyticsUseCaseImpl;
        this.read = deliveryConfirmationLoggerImpl;
        this.MediaBrowserCompatMediaItem = isunspecifiedeaslcwc;
        this.MediaSessionCompatResultReceiverWrapper = createanimation;
        this.PlaybackStateCompat = pinValidationEventLoggerImpl;
        this.MediaSessionCompatToken = setudmandroid_sdk_base_release;
        this.MediaSessionCompatQueueItem = fastfilternotnull.deliveryId;
        this.RatingCompat = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getSizeannotations.serializer);
        this.write = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, shortNewsContentCardView, 20), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 22), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object access$loadAnalytics(PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl, ContinuationImpl continuationImpl) {
        isUnspecified0680j_4annotations isunspecified0680j_4annotations;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        pinValidationTaskUiModelImpl.getClass();
        if (continuationImpl instanceof isUnspecified0680j_4annotations) {
            isunspecified0680j_4annotations = (isUnspecified0680j_4annotations) continuationImpl;
            int i2 = isunspecified0680j_4annotations.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                isunspecified0680j_4annotations.write = i2 - Integer.MIN_VALUE;
            } else {
                isunspecified0680j_4annotations = new isUnspecified0680j_4annotations(pinValidationTaskUiModelImpl, continuationImpl);
            }
        } else {
            isunspecified0680j_4annotations = new isUnspecified0680j_4annotations(pinValidationTaskUiModelImpl, continuationImpl);
        }
        Object obj = isunspecified0680j_4annotations.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = isunspecified0680j_4annotations.write;
        if (i3 != 0) {
            int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 49;
            ComponentActivity = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i5 = ComponentActivity + 33;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = pinValidationTaskUiModelImpl.MediaMetadataCompat;
            long j = pinValidationTaskUiModelImpl.MediaSessionCompatQueueItem;
            String str = pinValidationTaskUiModelImpl.RatingCompat;
            isunspecified0680j_4annotations.write = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, isunspecified0680j_4annotations);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            getPositionannotations getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            pinValidationTaskUiModelImpl.serializer = getpositionannotations;
            if (getpositionannotations == null) {
                int i7 = ComponentActivity + 65;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("PinValidationTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "PinValidationTaskUiModelImpl: Analytics failed to load.", new Object[0]);
            int i9 = ComponentActivity + 33;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    public final PreviewLightDark RemoteActionCompatParcelizer(PreviewLightDark previewLightDark, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z, PointerInteropFilterpointerInputFilter1stopDispatching1 pointerInteropFilterpointerInputFilter1stopDispatching1) {
        boolean z2;
        getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations;
        PointerInteropFilterpointerInputFilter1stopDispatching1 pointerInteropFilterpointerInputFilter1stopDispatching2;
        String strWrite;
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 13;
        ComponentActivity = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            apiLevel apilevel = previewLightDark.offlineValidation;
            obj.hashCode();
            throw null;
        }
        apiLevel apilevel2 = previewLightDark.offlineValidation;
        if (apilevel2 == null) {
            PreviewLightDark previewLightDark2 = PreviewLightDark.read(previewLightDark, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, null, null, null, 2015);
            int i3 = ComponentActivity + 103;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return previewLightDark2;
        }
        C0212wallpaper c0212wallpaper = apilevel2.pinAttempts;
        int i5 = apilevel2.currentAttemptCount + 1;
        if (i5 >= c0212wallpaper.maxAttempts) {
            int i6 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 113;
            ComponentActivity = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        apiLevel apilevelIconCompatParcelizer = apiLevel.IconCompatParcelizer(apilevel2, null, i5, z, 255);
        if (z) {
            int i8 = ComponentActivity + 59;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            getwear_os_large_roundannotations = Device.INSTANCE;
        } else if (z2) {
            int i10 = ComponentActivity + 51;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ComposeAnimationState composeAnimationState = c0212wallpaper.errorMessage.button;
            if (!((composeAnimationState != null ? composeAnimationState.actionData : null) instanceof findParameters)) {
                ((SentryCriticalIssueLogger) this.MediaSessionCompatToken.read).write("pin_validation_max_attempts_action_missing", executeAsList.PUDO, "Missing too many attempts button action when the user exceeds the allowed number of attempts", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("root_error_class", "PinValidationCriticalIssueLogger"), new onViewAttachedToWindowlambda0("attempt_count", String.valueOf(i5))));
            }
            getwear_os_large_roundannotations = Devices.INSTANCE;
        } else {
            getwear_os_large_roundannotations = getWEAR_OS_RECTannotations.INSTANCE;
        }
        List list = apilevel2.trackingEvents;
        if (z || !z2) {
            pointerInteropFilterpointerInputFilter1stopDispatching2 = pointerInteropFilterpointerInputFilter1stopDispatching1;
        } else {
            int i12 = ComponentActivity + 25;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                isSpecifiedjoFl9Iannotations isspecifiedjofl9iannotations = isSpecifiedjoFl9Iannotations.write;
                obj.hashCode();
                throw null;
            }
            pointerInteropFilterpointerInputFilter1stopDispatching2 = isSpecifiedjoFl9Iannotations.write;
        }
        Long l = this.MediaDescriptionCompat;
        Integer numValueOf = l != null ? Integer.valueOf((int) (SystemClock.elapsedRealtime() - l.longValue())) : null;
        PinValidationEventLoggerImpl pinValidationEventLoggerImpl = this.PlaybackStateCompat;
        if (z) {
            list.getClass();
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            safesetcliptooutline.put("attempt_count", Integer.valueOf(i5));
            if (numValueOf != null) {
                int i13 = ComponentActivity + 19;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    safesetcliptooutline.put("entry_duration", Integer.valueOf(numValueOf.intValue()));
                    throw null;
                }
                safesetcliptooutline.put("entry_duration", Integer.valueOf(numValueOf.intValue()));
            }
            pinValidationEventLoggerImpl.read(list, Trigger.PIN_OFFLINE_SUCCESS, safesetcliptooutline.IconCompatParcelizer());
        } else {
            if (pointerInteropFilterpointerInputFilter1stopDispatching2 == null || (strWrite = pointerInteropFilterpointerInputFilter1stopDispatching2.write()) == null) {
                strWrite = SystemUtils.UNKNOWN;
            }
            list.getClass();
            safeSetClipToOutline safesetcliptooutline2 = new safeSetClipToOutline();
            safesetcliptooutline2.put("attempt_count", Integer.valueOf(i5));
            if (numValueOf != null) {
                int i14 = ComponentActivity + 65;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                safesetcliptooutline2.put("entry_duration", Integer.valueOf(numValueOf.intValue()));
            }
            safesetcliptooutline2.put("failure_reason", strWrite);
            pinValidationEventLoggerImpl.read(list, Trigger.PIN_OFFLINE_FAILURE, safesetcliptooutline2.IconCompatParcelizer());
        }
        this.MediaDescriptionCompat = null;
        return PreviewLightDark.read(previewLightDark, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, null, apilevelIconCompatParcelizer, getwear_os_large_roundannotations, 479);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7 A[Catch: Exception -> 0x00ec, PinHashDerivationError -> 0x00ee, all -> 0x00f0, TryCatch #1 {all -> 0x00f0, blocks: (B:17:0x004e, B:35:0x00cd, B:37:0x00d7, B:39:0x00db, B:50:0x00f5, B:53:0x00fd, B:56:0x010a, B:29:0x0087, B:31:0x00a6), top: B:61:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    public static final Object access$validatePinOffline(PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl, PreviewLightDark previewLightDark, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, ContinuationImpl continuationImpl) {
        isUnspecifiedEaSLcWcannotations isunspecifiedeaslcwcannotations;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2;
        apiLevel apilevel;
        String message;
        PreviewLightDark previewLightDarkRemoteActionCompatParcelizer;
        boolean zSerializer;
        isFinite0680j_4annotations isfinite0680j_4annotations;
        PreviewLightDark previewLightDark2 = previewLightDark;
        int i = 2 % 2;
        setUdmandroid_sdk_base_release setudmandroid_sdk_base_release = pinValidationTaskUiModelImpl.MediaSessionCompatToken;
        createAnimation createanimation = pinValidationTaskUiModelImpl.MediaSessionCompatResultReceiverWrapper;
        if (continuationImpl instanceof isUnspecifiedEaSLcWcannotations) {
            isunspecifiedeaslcwcannotations = (isUnspecifiedEaSLcWcannotations) continuationImpl;
            int i2 = isunspecifiedeaslcwcannotations.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 49;
                ComponentActivity = i3 % Fields.SpotShadowColor;
                isunspecifiedeaslcwcannotations.serializer = i3 % 2 != 0 ? i2 % Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                isunspecifiedeaslcwcannotations = new isUnspecifiedEaSLcWcannotations(pinValidationTaskUiModelImpl, continuationImpl);
            }
        } else {
            isunspecifiedeaslcwcannotations = new isUnspecifiedEaSLcWcannotations(pinValidationTaskUiModelImpl, continuationImpl);
        }
        Object obj = isunspecifiedeaslcwcannotations.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = isunspecifiedeaslcwcannotations.serializer;
        try {
            if (i4 != 0) {
                int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 99;
                ComponentActivity = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                apiLevel apilevel2 = isunspecifiedeaslcwcannotations.IconCompatParcelizer;
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3 = isunspecifiedeaslcwcannotations.write;
                PreviewLightDark previewLightDark3 = isunspecifiedeaslcwcannotations.read;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3;
                    apilevel = apilevel2;
                    previewLightDark2 = previewLightDark3;
                    zSerializer = setCarryoverInAppMessage.serializer((String) obj, apilevel.pinHash, true);
                    if (zSerializer) {
                        isfinite0680j_4annotations = null;
                    } else {
                        isfinite0680j_4annotations = isFinite0680j_4annotations.serializer;
                    }
                    PreviewLightDark previewLightDarkRemoteActionCompatParcelizer2 = pinValidationTaskUiModelImpl.RemoteActionCompatParcelizer(previewLightDark2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, zSerializer, isfinite0680j_4annotations);
                    createanimation.read(false);
                    int i7 = ComponentActivity + 97;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return previewLightDarkRemoteActionCompatParcelizer2;
                } catch (PinHashDerivationError e) {
                    e = e;
                    previewLightDark2 = previewLightDark3;
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3;
                    setudmandroid_sdk_base_release.serializer(e.write());
                    previewLightDarkRemoteActionCompatParcelizer = pinValidationTaskUiModelImpl.RemoteActionCompatParcelizer(previewLightDark2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, false, new isSpecifiedjoFl9I(e));
                    createanimation.read(false);
                    return previewLightDarkRemoteActionCompatParcelizer;
                } catch (Exception e2) {
                    e = e2;
                    previewLightDark2 = previewLightDark3;
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3;
                    message = e.getMessage();
                    if (message == null) {
                        message = "PinValidationTaskUiModelImpl: Unexpected error during PIN validation";
                    }
                    setudmandroid_sdk_base_release.serializer(message);
                    previewLightDarkRemoteActionCompatParcelizer = pinValidationTaskUiModelImpl.RemoteActionCompatParcelizer(previewLightDark2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, false, isSpecifiedEaSLcWc.write);
                    createanimation.read(false);
                    return previewLightDarkRemoteActionCompatParcelizer;
                }
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            apiLevel apilevel3 = previewLightDark2.offlineValidation;
            if (apilevel3 == null) {
                int i9 = ComponentActivity + 55;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return PreviewLightDark.read(previewLightDark, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, null, null, null, 2015);
            }
            try {
                createanimation.read(true);
                String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk), "", null, null, null, 62);
                isUnspecifiedEaSLcWc isunspecifiedeaslcwc = pinValidationTaskUiModelImpl.MediaBrowserCompatMediaItem;
                String str = apilevel3.pinSecret;
                int i11 = apilevel3.iterations;
                int i12 = apilevel3.outputLength;
                isunspecifiedeaslcwcannotations.read = previewLightDark2;
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
                try {
                    isunspecifiedeaslcwcannotations.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2;
                    isunspecifiedeaslcwcannotations.IconCompatParcelizer = apilevel3;
                    isunspecifiedeaslcwcannotations.serializer = 1;
                    Object objWithContext = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new Pbkdf2PinHashDerivation$deriveHash$2(strIconCompatParcelizer, str, i11, i12, (isUnspecifiedjoFl9I) isunspecifiedeaslcwc, null), isunspecifiedeaslcwcannotations);
                    if (objWithContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    apilevel = apilevel3;
                    obj = objWithContext;
                    zSerializer = setCarryoverInAppMessage.serializer((String) obj, apilevel.pinHash, true);
                    if (zSerializer) {
                        isfinite0680j_4annotations = isFinite0680j_4annotations.serializer;
                    } else {
                        isfinite0680j_4annotations = null;
                    }
                    PreviewLightDark previewLightDarkRemoteActionCompatParcelizer3 = pinValidationTaskUiModelImpl.RemoteActionCompatParcelizer(previewLightDark2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, zSerializer, isfinite0680j_4annotations);
                    createanimation.read(false);
                    int i13 = ComponentActivity + 97;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return previewLightDarkRemoteActionCompatParcelizer3;
                } catch (PinHashDerivationError e3) {
                    e = e3;
                    setudmandroid_sdk_base_release.serializer(e.write());
                    previewLightDarkRemoteActionCompatParcelizer = pinValidationTaskUiModelImpl.RemoteActionCompatParcelizer(previewLightDark2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, false, new isSpecifiedjoFl9I(e));
                    createanimation.read(false);
                    return previewLightDarkRemoteActionCompatParcelizer;
                } catch (Exception e4) {
                    e = e4;
                    message = e.getMessage();
                    if (message == null) {
                        message = "PinValidationTaskUiModelImpl: Unexpected error during PIN validation";
                    }
                    setudmandroid_sdk_base_release.serializer(message);
                    previewLightDarkRemoteActionCompatParcelizer = pinValidationTaskUiModelImpl.RemoteActionCompatParcelizer(previewLightDark2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, false, isSpecifiedEaSLcWc.write);
                    createanimation.read(false);
                    return previewLightDarkRemoteActionCompatParcelizer;
                }
            } catch (PinHashDerivationError e5) {
                e = e5;
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
                setudmandroid_sdk_base_release.serializer(e.write());
                previewLightDarkRemoteActionCompatParcelizer = pinValidationTaskUiModelImpl.RemoteActionCompatParcelizer(previewLightDark2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, false, new isSpecifiedjoFl9I(e));
                createanimation.read(false);
                return previewLightDarkRemoteActionCompatParcelizer;
            } catch (Exception e6) {
                e = e6;
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
                message = e.getMessage();
                if (message == null) {
                    message = "PinValidationTaskUiModelImpl: Unexpected error during PIN validation";
                }
                setudmandroid_sdk_base_release.serializer(message);
                previewLightDarkRemoteActionCompatParcelizer = pinValidationTaskUiModelImpl.RemoteActionCompatParcelizer(previewLightDark2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, false, isSpecifiedEaSLcWc.write);
                createanimation.read(false);
                return previewLightDarkRemoteActionCompatParcelizer;
            }
            createanimation.read(false);
            return previewLightDarkRemoteActionCompatParcelizer;
        } catch (Throwable th) {
            createanimation.read(false);
            throw th;
        }
    }
}
