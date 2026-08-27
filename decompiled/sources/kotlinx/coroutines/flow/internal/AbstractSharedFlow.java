package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {
    public int MediaSessionCompatQueueItem;
    public int ParcelableVolumeInfo;
    public AbstractSharedFlowSlot[] PlaybackStateCompat;
    public SubscriptionCountStateFlow RatingCompat;

    public final AbstractSharedFlowSlot MediaMetadataCompat() {
        AbstractSharedFlowSlot abstractSharedFlowSlotRemoteActionCompatParcelizer;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            AbstractSharedFlowSlot[] abstractSharedFlowSlotArrRatingCompat = this.PlaybackStateCompat;
            if (abstractSharedFlowSlotArrRatingCompat == null) {
                abstractSharedFlowSlotArrRatingCompat = RatingCompat();
                this.PlaybackStateCompat = abstractSharedFlowSlotArrRatingCompat;
            } else if (this.MediaSessionCompatQueueItem >= abstractSharedFlowSlotArrRatingCompat.length) {
                Object[] objArrCopyOf = Arrays.copyOf(abstractSharedFlowSlotArrRatingCompat, abstractSharedFlowSlotArrRatingCompat.length * 2);
                this.PlaybackStateCompat = (AbstractSharedFlowSlot[]) objArrCopyOf;
                abstractSharedFlowSlotArrRatingCompat = (AbstractSharedFlowSlot[]) objArrCopyOf;
            }
            int i = this.ParcelableVolumeInfo;
            do {
                abstractSharedFlowSlotRemoteActionCompatParcelizer = abstractSharedFlowSlotArrRatingCompat[i];
                if (abstractSharedFlowSlotRemoteActionCompatParcelizer == null) {
                    abstractSharedFlowSlotRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                    abstractSharedFlowSlotArrRatingCompat[i] = abstractSharedFlowSlotRemoteActionCompatParcelizer;
                }
                i++;
                if (i >= abstractSharedFlowSlotArrRatingCompat.length) {
                    i = 0;
                }
            } while (!abstractSharedFlowSlotRemoteActionCompatParcelizer.read(this));
            this.ParcelableVolumeInfo = i;
            this.MediaSessionCompatQueueItem++;
            subscriptionCountStateFlow = this.RatingCompat;
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.read(1);
        }
        return abstractSharedFlowSlotRemoteActionCompatParcelizer;
    }

    public abstract AbstractSharedFlowSlot[] RatingCompat();

    public abstract AbstractSharedFlowSlot RemoteActionCompatParcelizer();

    public final void RemoteActionCompatParcelizer(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i;
        ShortNewsContentCardView[] shortNewsContentCardViewArrSerializer;
        synchronized (this) {
            int i2 = this.MediaSessionCompatQueueItem - 1;
            this.MediaSessionCompatQueueItem = i2;
            subscriptionCountStateFlow = this.RatingCompat;
            if (i2 == 0) {
                this.ParcelableVolumeInfo = 0;
            }
            abstractSharedFlowSlot.getClass();
            shortNewsContentCardViewArrSerializer = abstractSharedFlowSlot.serializer(this);
        }
        for (ShortNewsContentCardView shortNewsContentCardView : shortNewsContentCardViewArrSerializer) {
            if (shortNewsContentCardView != null) {
                shortNewsContentCardView.resumeWith(createFromParcel.INSTANCE);
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.read(-1);
        }
    }

    public final StateFlow serializer() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this.RatingCompat;
            if (subscriptionCountStateFlow == null) {
                int i = this.MediaSessionCompatQueueItem;
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(1, Integer.MAX_VALUE, IInAppMessageViewWrapper.DROP_OLDEST);
                subscriptionCountStateFlow.write(Integer.valueOf(i));
                this.RatingCompat = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }
}
