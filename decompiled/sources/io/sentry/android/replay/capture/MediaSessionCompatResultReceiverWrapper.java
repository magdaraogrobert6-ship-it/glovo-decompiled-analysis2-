package io.sentry.android.replay.capture;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.executelambda4;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatResultReceiverWrapper extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ParcelableVolumeInfo IconCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaSessionCompatResultReceiverWrapper(ParcelableVolumeInfo parcelableVolumeInfo, int i) {
        super(1);
        this.write = i;
        this.IconCompatParcelizer = parcelableVolumeInfo;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ParcelableVolumeInfo parcelableVolumeInfo = this.IconCompatParcelizer;
        if (i == 0) {
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = (MediaSessionCompatQueueItem) obj;
            mediaSessionCompatQueueItem.getClass();
            if (mediaSessionCompatQueueItem instanceof RatingCompat) {
                ((RatingCompat) mediaSessionCompatQueueItem).RemoteActionCompatParcelizer(parcelableVolumeInfo.ResultReceiver, new executelambda4());
                parcelableVolumeInfo.IconCompatParcelizer(parcelableVolumeInfo.RemoteActionCompatParcelizer() + 1);
            }
            return createfromparcel;
        }
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem2 = (MediaSessionCompatQueueItem) obj;
        mediaSessionCompatQueueItem2.getClass();
        if (mediaSessionCompatQueueItem2 instanceof RatingCompat) {
            RatingCompat ratingCompat = (RatingCompat) mediaSessionCompatQueueItem2;
            ratingCompat.RemoteActionCompatParcelizer(parcelableVolumeInfo.ResultReceiver, new executelambda4());
            parcelableVolumeInfo.IconCompatParcelizer(parcelableVolumeInfo.RemoteActionCompatParcelizer() + 1);
            parcelableVolumeInfo.IconCompatParcelizer(ratingCompat.read.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        }
        return createfromparcel;
    }
}
