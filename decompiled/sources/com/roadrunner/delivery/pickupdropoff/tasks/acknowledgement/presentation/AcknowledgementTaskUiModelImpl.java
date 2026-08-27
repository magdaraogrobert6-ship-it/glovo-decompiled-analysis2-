package com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.CompositionDataRecordCompanion;
import o.InInspectionModeOnly;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.fastFilterNotNull;
import o.getPositionannotations;
import o.isItemDismissable;
import o.minHeightOffsets;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AcknowledgementTaskUiModelImpl implements minHeightOffsets {
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    public final DeliveryConfirmationLoggerImpl IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final GetDeliveryAnalyticsUseCaseImpl MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final UpdateTaskUseCaseImpl MediaSessionCompatResultReceiverWrapper;
    public final long RatingCompat;
    public final fastFilterNotNull RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final ContextScope serializer;
    public getPositionannotations write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 103;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        String str = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 63;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public AcknowledgementTaskUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl) {
        str.getClass();
        this.RemoteActionCompatParcelizer = fastfilternotnull;
        this.serializer = contextScope;
        this.MediaSessionCompatQueueItem = str;
        this.MediaSessionCompatResultReceiverWrapper = updateTaskUseCaseImpl;
        this.MediaMetadataCompat = getDeliveryAnalyticsUseCaseImpl;
        this.IconCompatParcelizer = deliveryConfirmationLoggerImpl;
        this.RatingCompat = fastfilternotnull.deliveryId;
        this.MediaDescriptionCompat = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(CompositionDataRecordCompanion.IconCompatParcelizer);
        this.read = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(observeTaskByTypeAndIdUseCaseImpl, this, shortNewsContentCardView, 29), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 17), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public static final Object access$loadAnalytics(AcknowledgementTaskUiModelImpl acknowledgementTaskUiModelImpl, ContinuationImpl continuationImpl) {
        InInspectionModeOnly inInspectionModeOnly;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        Object objM4939invoke0E7RQCE;
        int i3;
        Throwable thSerializer;
        getPositionannotations getpositionannotations;
        int i4;
        int i5 = 2 % 2;
        int i6 = MediaSessionCompatToken + 23;
        ParcelableVolumeInfo = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            acknowledgementTaskUiModelImpl.getClass();
            if (continuationImpl instanceof InInspectionModeOnly) {
                inInspectionModeOnly = (InInspectionModeOnly) continuationImpl;
                i = inInspectionModeOnly.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    inInspectionModeOnly.read = i - Integer.MIN_VALUE;
                }
            }
            obj = inInspectionModeOnly.IconCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = inInspectionModeOnly.read;
            if (i2 != 0) {
                i4 = MediaSessionCompatToken + 23;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = acknowledgementTaskUiModelImpl.MediaMetadataCompat;
            long j = acknowledgementTaskUiModelImpl.RatingCompat;
            String str = acknowledgementTaskUiModelImpl.MediaDescriptionCompat;
            inInspectionModeOnly.read = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, inInspectionModeOnly);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                i3 = ParcelableVolumeInfo + 83;
                MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
            if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
                getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
                acknowledgementTaskUiModelImpl.write = getpositionannotations;
                if (getpositionannotations == null) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("AcknowledgementTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
                }
            }
            thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
            if (thSerializer != null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "AcknowledgementTaskUiModelImpl: Analytics failed to load.", new Object[0]);
            }
            return createFromParcel.INSTANCE;
        }
        acknowledgementTaskUiModelImpl.getClass();
        int i7 = 3 / 0;
        if (continuationImpl instanceof InInspectionModeOnly) {
            inInspectionModeOnly = (InInspectionModeOnly) continuationImpl;
            i = inInspectionModeOnly.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                inInspectionModeOnly.read = i - Integer.MIN_VALUE;
            }
        }
        obj = inInspectionModeOnly.IconCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = inInspectionModeOnly.read;
        if (i2 != 0) {
            i4 = MediaSessionCompatToken + 23;
            ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0 ? i2 != 1 : i2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl2 = acknowledgementTaskUiModelImpl.MediaMetadataCompat;
            long j2 = acknowledgementTaskUiModelImpl.RatingCompat;
            String str2 = acknowledgementTaskUiModelImpl.MediaDescriptionCompat;
            inInspectionModeOnly.read = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl2.m4939invoke0E7RQCE(j2, str2, inInspectionModeOnly);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                i3 = ParcelableVolumeInfo + 83;
                MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            acknowledgementTaskUiModelImpl.write = getpositionannotations;
            if (getpositionannotations == null) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("AcknowledgementTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
            }
        }
        thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "AcknowledgementTaskUiModelImpl: Analytics failed to load.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
        inInspectionModeOnly = new InInspectionModeOnly(acknowledgementTaskUiModelImpl, continuationImpl);
        obj = inInspectionModeOnly.IconCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = inInspectionModeOnly.read;
        if (i2 != 0) {
            i4 = MediaSessionCompatToken + 23;
            ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl3 = acknowledgementTaskUiModelImpl.MediaMetadataCompat;
        long j3 = acknowledgementTaskUiModelImpl.RatingCompat;
        String str3 = acknowledgementTaskUiModelImpl.MediaDescriptionCompat;
        inInspectionModeOnly.read = 1;
        objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl3.m4939invoke0E7RQCE(j3, str3, inInspectionModeOnly);
        if (objM4939invoke0E7RQCE == coroutineSingletons) {
            i3 = ParcelableVolumeInfo + 83;
            MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return coroutineSingletons;
            }
            throw null;
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            acknowledgementTaskUiModelImpl.write = getpositionannotations;
            if (getpositionannotations == null) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("AcknowledgementTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
            }
        }
        thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "AcknowledgementTaskUiModelImpl: Analytics failed to load.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }
}
