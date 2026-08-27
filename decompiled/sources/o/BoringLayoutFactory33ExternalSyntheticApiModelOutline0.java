package o;

import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.accept.declinebutton.domain.AcceptOrderClickEventRetriever;
import com.roadrunner.delivery.accept.declinebutton.domain.DeclineOrderClickEventRetriever;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheetViewModel$updateState$1;
import com.roadrunner.delivery.accept.domain.AcceptDeliveriesUseCaseImpl;
import com.roadrunner.delivery.accept.domain.DeclineDeliveriesUseCaseImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import io.grpc.internal.SharedResourcePool;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BoringLayoutFactory33ExternalSyntheticApiModelOutline0 extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompat;
    public final AcceptDeliveriesUseCaseImpl IconCompatParcelizer;
    public final DeliveryAcceptanceLogger MediaBrowserCompatMediaItem;
    public final FontVariationSettingTextUnit MediaDescriptionCompat;
    public final com.huawei.wisesecurity.ucs_credential.g0 MediaMetadataCompat;
    public final SharedResourcePool MediaSessionCompatQueueItem;
    public final BrazeLogger MediaSessionCompatToken;
    public final UpdateStateUseCaseImpl PlaybackStateCompatCustomAction;
    public final DeliveryErrorProviderImpl RatingCompat;
    public final DeclineDeliveriesUseCaseImpl RemoteActionCompatParcelizer;
    public final DeclineOrderClickEventRetriever read;
    public final BackToBackOrdersDataRepositoryImpl serializer;
    public final AcceptOrderClickEventRetriever write;

    public final SharedResourcePool read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat;
        int i3 = i2 + 17;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedResourcePool sharedResourcePool = this.MediaSessionCompatQueueItem;
        int i5 = i2 + 19;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return sharedResourcePool;
        }
        throw null;
    }

    public final BrazeLogger write() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 19;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaSessionCompatToken;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BoringLayoutFactory33ExternalSyntheticApiModelOutline0(SharedResourcePool sharedResourcePool, hasSameLayoutAffectingAttributes hassamelayoutaffectingattributes, AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl, UpdateStateUseCaseImpl updateStateUseCaseImpl, DeclineDeliveriesUseCaseImpl declineDeliveriesUseCaseImpl, FontVariationSettingTextUnit fontVariationSettingTextUnit, DeliveryAcceptanceLogger deliveryAcceptanceLogger, DeclineOrderClickEventRetriever declineOrderClickEventRetriever, AcceptOrderClickEventRetriever acceptOrderClickEventRetriever, com.huawei.wisesecurity.ucs_credential.g0 g0Var, BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl, DeliveryErrorProviderImpl deliveryErrorProviderImpl) {
        sharedResourcePool.getClass();
        hassamelayoutaffectingattributes.getClass();
        acceptDeliveriesUseCaseImpl.getClass();
        updateStateUseCaseImpl.getClass();
        declineDeliveriesUseCaseImpl.getClass();
        fontVariationSettingTextUnit.getClass();
        deliveryAcceptanceLogger.getClass();
        declineOrderClickEventRetriever.getClass();
        acceptOrderClickEventRetriever.getClass();
        g0Var.getClass();
        backToBackOrdersDataRepositoryImpl.getClass();
        deliveryErrorProviderImpl.getClass();
        this.MediaSessionCompatQueueItem = sharedResourcePool;
        this.IconCompatParcelizer = acceptDeliveriesUseCaseImpl;
        this.PlaybackStateCompatCustomAction = updateStateUseCaseImpl;
        this.RemoteActionCompatParcelizer = declineDeliveriesUseCaseImpl;
        this.MediaDescriptionCompat = fontVariationSettingTextUnit;
        this.MediaBrowserCompatMediaItem = deliveryAcceptanceLogger;
        this.read = declineOrderClickEventRetriever;
        this.write = acceptOrderClickEventRetriever;
        this.MediaMetadataCompat = g0Var;
        this.serializer = backToBackOrdersDataRepositoryImpl;
        this.RatingCompat = deliveryErrorProviderImpl;
        this.MediaSessionCompatToken = new BrazeLogger(new clipOutRect(null, null, null, null));
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new BridgeManager$trackEvent$2(hassamelayoutaffectingattributes, this, (ShortNewsContentCardView) null, 17), 3);
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 87;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem.serializer(BoringLayoutFactory33.serializer);
        int i4 = MediaSessionCompatResultReceiverWrapper + 107;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void RemoteActionCompatParcelizer(BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0, boolean z) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 51;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedResourcePool sharedResourcePool = boringLayoutFactory33ExternalSyntheticApiModelOutline0.MediaSessionCompatQueueItem;
        if (z) {
            sharedResourcePool.serializer(clipOutPath.write);
            return;
        }
        sharedResourcePool.serializer(drawTextRun.write);
        int i4 = MediaSessionCompatResultReceiverWrapper + 15;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new LasagnaDeclineBottomSheetViewModel$updateState$1(this, null, 0), 3);
        int i2 = PlaybackStateCompat + 95;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        List list = ((clipOutRect) this.MediaSessionCompatToken.write()).read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (list == null) {
            int i2 = PlaybackStateCompat + 113;
            MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Accept details are unexpectedly null", Timber.RemoteActionCompatParcelizer);
        } else {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new PerseusLogger$w$1(this, list, shortNewsContentCardView, 19), 3);
            int i4 = MediaSessionCompatResultReceiverWrapper + 59;
            PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new LasagnaDeclineBottomSheetViewModel$updateState$1(this, shortNewsContentCardView, 1), 3);
    }

    public final void serializer() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatResultReceiverWrapper + 69;
        PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        FocusTargetInteropElement focusTargetInteropElement = ((clipOutRect) this.MediaSessionCompatToken.write()).RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (focusTargetInteropElement == null) {
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Decline details are unexpectedly null", Timber.RemoteActionCompatParcelizer);
        } else {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new PerseusLogger$w$1(this, focusTargetInteropElement, shortNewsContentCardView, 20), 3);
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new LasagnaDeclineBottomSheetViewModel$updateState$1(this, shortNewsContentCardView, i), 3);
        int i5 = PlaybackStateCompat + 15;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
