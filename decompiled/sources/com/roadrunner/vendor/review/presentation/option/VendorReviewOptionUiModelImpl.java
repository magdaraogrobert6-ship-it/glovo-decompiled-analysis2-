package com.roadrunner.vendor.review.presentation.option;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.vendor.review.data.database.entity.ReviewState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.addSingleSynchronousSubscription;
import o.areCachedContentCardsStale;
import o.deserializeContentCard;
import o.getConfigurationProviderSafeandroid_sdk_base_release;
import o.getDeviceId;
import o.getExternalIEventMessengerandroid_sdk_base_release;
import o.getRegisteredPushToken;
import o.performPushDeliveryFlushandroid_sdk_base_release;
import o.recordGeofenceTransitionandroid_sdk_base_release;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setZIndex;
import o.subscribeToNewInAppMessageslambda1;
import o.subscribeToNoMatchingTriggerForEventlambda0;
import o.subscribeToPushNotificationEventslambda0;
import o.updateAdidI;
import o.verifyProperSdkSetup;
import o.verifyProperSdkSetuplambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class VendorReviewOptionUiModelImpl {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 1;
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release IconCompatParcelizer;
    public final getExternalIEventMessengerandroid_sdk_base_release MediaBrowserCompatMediaItem;
    public final subscribeToNewInAppMessageslambda1 MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final subscribeToPushNotificationEventslambda0 MediaSessionCompatQueueItem;
    public final getRegisteredPushToken RatingCompat;
    public final getConfigurationProviderSafeandroid_sdk_base_release RemoteActionCompatParcelizer;
    public final long read;
    public final ContextScope serializer;
    public final MutableStateFlow write;

    public VendorReviewOptionUiModelImpl(getDeviceId getdeviceid, getConfigurationProviderSafeandroid_sdk_base_release getconfigurationprovidersafeandroid_sdk_base_release, getRegisteredPushToken getregisteredpushtoken, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, getExternalIEventMessengerandroid_sdk_base_release getexternalieventmessengerandroid_sdk_base_release, subscribeToNewInAppMessageslambda1 subscribetonewinappmessageslambda1, long j, subscribeToPushNotificationEventslambda0 subscribetopushnotificationeventslambda0, ContextScope contextScope) {
        getdeviceid.getClass();
        getconfigurationprovidersafeandroid_sdk_base_release.getClass();
        getregisteredpushtoken.getClass();
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        getexternalieventmessengerandroid_sdk_base_release.getClass();
        subscribetonewinappmessageslambda1.getClass();
        subscribetopushnotificationeventslambda0.getClass();
        this.RemoteActionCompatParcelizer = getconfigurationprovidersafeandroid_sdk_base_release;
        this.RatingCompat = getregisteredpushtoken;
        this.IconCompatParcelizer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        this.MediaBrowserCompatMediaItem = getexternalieventmessengerandroid_sdk_base_release;
        this.MediaDescriptionCompat = subscribetonewinappmessageslambda1;
        this.read = j;
        this.MediaSessionCompatQueueItem = subscribetopushnotificationeventslambda0;
        this.serializer = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(verifyProperSdkSetup.write);
        this.write = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) getdeviceid.serializer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_RIDER_REVIEWS_OF_VENDORS_ENABLED)) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new VendorReviewOptionUiModelImpl$onPositiveClick$1(this, null, 1), 3);
            int i = MediaSessionCompatResultReceiverWrapper + 13;
            MediaSessionCompatToken = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = MediaSessionCompatToken + 47;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    public static final Object access$tryLoadingSubmittedState(VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl, ContinuationImpl continuationImpl) {
        performPushDeliveryFlushandroid_sdk_base_release performpushdeliveryflushandroid_sdk_base_release;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        MutableStateFlow mutableStateFlow = vendorReviewOptionUiModelImpl.write;
        if (continuationImpl instanceof performPushDeliveryFlushandroid_sdk_base_release) {
            performpushdeliveryflushandroid_sdk_base_release = (performPushDeliveryFlushandroid_sdk_base_release) continuationImpl;
            int i4 = performpushdeliveryflushandroid_sdk_base_release.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = MediaSessionCompatToken + 69;
                MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                performpushdeliveryflushandroid_sdk_base_release.IconCompatParcelizer = i5 % 2 != 0 ? i4 - Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
                int i6 = MediaSessionCompatResultReceiverWrapper + 45;
                MediaSessionCompatToken = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 4;
                }
            } else {
                performpushdeliveryflushandroid_sdk_base_release = new performPushDeliveryFlushandroid_sdk_base_release(vendorReviewOptionUiModelImpl, continuationImpl);
            }
        } else {
            performpushdeliveryflushandroid_sdk_base_release = new performPushDeliveryFlushandroid_sdk_base_release(vendorReviewOptionUiModelImpl, continuationImpl);
        }
        Object objFirst = performpushdeliveryflushandroid_sdk_base_release.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = performpushdeliveryflushandroid_sdk_base_release.IconCompatParcelizer;
        ReviewState reviewState = null;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = vendorReviewOptionUiModelImpl.IconCompatParcelizer;
            long j = vendorReviewOptionUiModelImpl.read;
            deserializeContentCard deserializecontentcard = (deserializeContentCard) ((addSingleSynchronousSubscription) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).read;
            Flow flowSerializer = FlowKt.serializer(DelayKt.RemoteActionCompatParcelizer(deserializecontentcard.IconCompatParcelizer, false, new String[]{"vendor_review_state"}, new setZIndex(j, i2, deserializecontentcard)));
            performpushdeliveryflushandroid_sdk_base_release.IconCompatParcelizer = 1;
            objFirst = FlowKt.first(flowSerializer, performpushdeliveryflushandroid_sdk_base_release);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        }
        areCachedContentCardsStale arecachedcontentcardsstale = (areCachedContentCardsStale) objFirst;
        if (arecachedcontentcardsstale != null) {
            int i9 = MediaSessionCompatToken + 91;
            MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ReviewState reviewState2 = arecachedcontentcardsstale.read;
                throw null;
            }
            reviewState = arecachedcontentcardsstale.read;
        }
        if (reviewState == null) {
            int i10 = MediaSessionCompatToken + 125;
            MediaSessionCompatResultReceiverWrapper = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i = -1;
        } else {
            i = recordGeofenceTransitionandroid_sdk_base_release.write[reviewState.ordinal()];
        }
        if (i == 1) {
            mutableStateFlow.IconCompatParcelizer(new verifyProperSdkSetuplambda0(subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE));
        } else {
            if (i != 2) {
                return Boolean.FALSE;
            }
            mutableStateFlow.IconCompatParcelizer(new verifyProperSdkSetuplambda0(subscribeToNoMatchingTriggerForEventlambda0.POSITIVE));
        }
        return Boolean.TRUE;
    }
}
