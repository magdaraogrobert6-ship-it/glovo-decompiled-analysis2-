package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
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
import o.fastFilterNotNull;
import o.findAnimations;
import o.getPositionannotations;
import o.getQueryContext;
import o.isItemDismissable;
import o.minHeightOffsets;
import o.notifyUnsubscribe;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableTaskUiModelImpl implements minHeightOffsets {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public getPositionannotations IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final GetDeliveryAnalyticsUseCaseImpl MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final UpdateTaskUseCaseImpl ParcelableVolumeInfo;
    public final StateFlow PlaybackStateCompat;
    public final DeliveryConfirmationLoggerImpl RatingCompat;
    public final ContextScope RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final MutableStateFlow serializer;
    public final fastFilterNotNull write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 21;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.MediaSessionCompatQueueItem;
        int i4 = i3 + 65;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public CustomerUnavailableTaskUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, getQueryContext getquerycontext) {
        str.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        updateTaskUseCaseImpl.getClass();
        getDeliveryAnalyticsUseCaseImpl.getClass();
        deliveryConfirmationLoggerImpl.getClass();
        getquerycontext.getClass();
        this.write = fastfilternotnull;
        this.RemoteActionCompatParcelizer = contextScope;
        this.MediaSessionCompatQueueItem = str;
        this.ParcelableVolumeInfo = updateTaskUseCaseImpl;
        this.MediaMetadataCompat = getDeliveryAnalyticsUseCaseImpl;
        this.RatingCompat = deliveryConfirmationLoggerImpl;
        this.read = getquerycontext;
        this.MediaDescriptionCompat = fastfilternotnull.deliveryId;
        this.MediaBrowserCompatMediaItem = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(findAnimations.read);
        this.serializer = mutableStateFlow;
        this.PlaybackStateCompat = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, shortNewsContentCardView, 9), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 20), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public static final Object access$loadAnalytics(CustomerUnavailableTaskUiModelImpl customerUnavailableTaskUiModelImpl, ContinuationImpl continuationImpl) {
        notifyUnsubscribe notifyunsubscribe;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        if (continuationImpl instanceof notifyUnsubscribe) {
            notifyunsubscribe = (notifyUnsubscribe) continuationImpl;
            int i2 = notifyunsubscribe.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaSessionCompatToken + 15;
                PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                notifyunsubscribe.write = i2 - Integer.MIN_VALUE;
                int i5 = PlaybackStateCompatCustomAction + 97;
                MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                notifyunsubscribe = new notifyUnsubscribe(customerUnavailableTaskUiModelImpl, continuationImpl);
            }
        } else {
            notifyunsubscribe = new notifyUnsubscribe(customerUnavailableTaskUiModelImpl, continuationImpl);
        }
        Object obj = notifyunsubscribe.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = notifyunsubscribe.write;
        Object obj2 = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = customerUnavailableTaskUiModelImpl.MediaMetadataCompat;
            long j = customerUnavailableTaskUiModelImpl.MediaDescriptionCompat;
            String str = customerUnavailableTaskUiModelImpl.MediaBrowserCompatMediaItem;
            notifyunsubscribe.write = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, notifyunsubscribe);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                int i8 = MediaSessionCompatToken + 53;
                PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            int i10 = MediaSessionCompatToken + 51;
            PlaybackStateCompatCustomAction = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                customerUnavailableTaskUiModelImpl.IconCompatParcelizer = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
                obj2.hashCode();
                throw null;
            }
            getPositionannotations getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            customerUnavailableTaskUiModelImpl.IconCompatParcelizer = getpositionannotations;
            if (getpositionannotations == null) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CustomerUnavailableTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
                int i11 = PlaybackStateCompatCustomAction + 57;
                MediaSessionCompatToken = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            int i13 = PlaybackStateCompatCustomAction + 53;
            MediaSessionCompatToken = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "CustomerUnavailableTaskUiModelImpl: Analytics failed to load.", new Object[0]);
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i15 = MediaSessionCompatToken + 89;
        PlaybackStateCompatCustomAction = i15 % Fields.SpotShadowColor;
        if (i15 % 2 != 0) {
            int i16 = 71 / 0;
        }
        return createfromparcel;
    }
}
