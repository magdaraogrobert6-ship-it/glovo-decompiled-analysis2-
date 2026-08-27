package com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.domain.util.IsFixableByRetry;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createTransitionInfolambda2;
import o.createTransitionInfolambda5;
import o.fastFilterNotNull;
import o.getPositionannotations;
import o.getQueryContext;
import o.isItemDismissable;
import o.minHeightOffsets;
import o.onItemDismiss;
import o.stopInstancelambda11;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DatePickerTaskUiModelImpl implements minHeightOffsets {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public getPositionannotations IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final DeliveryConfirmationLoggerImpl MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final UpdateTaskUseCaseImpl MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public final GetDeliveryAnalyticsUseCaseImpl RatingCompat;
    public final fastFilterNotNull RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final ContextScope serializer;
    public final getQueryContext write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 17;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        throw null;
    }

    public DatePickerTaskUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, stopInstancelambda11 stopinstancelambda11, IsFixableByRetry isFixableByRetry, p0 p0Var, getQueryContext getquerycontext) {
        str.getClass();
        this.RemoteActionCompatParcelizer = fastfilternotnull;
        this.serializer = contextScope;
        this.MediaBrowserCompatMediaItem = str;
        this.MediaSessionCompatToken = updateTaskUseCaseImpl;
        this.RatingCompat = getDeliveryAnalyticsUseCaseImpl;
        this.MediaMetadataCompat = deliveryConfirmationLoggerImpl;
        this.write = getquerycontext;
        this.MediaDescriptionCompat = fastfilternotnull.deliveryId;
        this.MediaSessionCompatQueueItem = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(createTransitionInfolambda2.IconCompatParcelizer);
        this.read = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, shortNewsContentCardView, 16), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 21), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public static final Object access$loadAnalytics(DatePickerTaskUiModelImpl datePickerTaskUiModelImpl, ContinuationImpl continuationImpl) {
        createTransitionInfolambda5 createtransitioninfolambda5;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        if (!(continuationImpl instanceof createTransitionInfolambda5)) {
            createtransitioninfolambda5 = new createTransitionInfolambda5(datePickerTaskUiModelImpl, continuationImpl);
        } else {
            int i2 = PlaybackStateCompatCustomAction + 23;
            MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            createtransitioninfolambda5 = (createTransitionInfolambda5) continuationImpl;
            int i4 = createtransitioninfolambda5.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = PlaybackStateCompatCustomAction + 65;
                MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    createtransitioninfolambda5.serializer = i4 << Integer.MIN_VALUE;
                } else {
                    createtransitioninfolambda5.serializer = i4 - Integer.MIN_VALUE;
                }
            } else {
                createtransitioninfolambda5 = new createTransitionInfolambda5(datePickerTaskUiModelImpl, continuationImpl);
            }
        }
        Object obj = createtransitioninfolambda5.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = createtransitioninfolambda5.serializer;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = datePickerTaskUiModelImpl.RatingCompat;
            long j = datePickerTaskUiModelImpl.MediaDescriptionCompat;
            String str = datePickerTaskUiModelImpl.MediaSessionCompatQueueItem;
            createtransitioninfolambda5.serializer = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, createtransitioninfolambda5);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = PlaybackStateCompatCustomAction + 55;
            MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            getPositionannotations getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            datePickerTaskUiModelImpl.IconCompatParcelizer = getpositionannotations;
            if (getpositionannotations == null) {
                int i9 = MediaSessionCompatResultReceiverWrapper + 63;
                PlaybackStateCompatCustomAction = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("DatePickerTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "DatePickerTaskUiModelImpl: Analytics failed to load.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }
}
