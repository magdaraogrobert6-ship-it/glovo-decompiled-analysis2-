package o;

import com.deliveryhero.perseus.data.remote.PerseusHitsRemoteDataStoreImpl;
import com.deliveryhero.perseus.data.remote.api.model.HitsRequest;
import com.deliveryhero.perseus.data.remote.api.model.HitsResponse;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class verticalLineTo extends ContinuationImpl {
    public int IconCompatParcelizer;
    public Collection MediaBrowserCompatMediaItem;
    public HitsResponse MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public createInAppMessageEventSubscriber MediaSessionCompatQueueItem;
    public /* synthetic */ Object MediaSessionCompatToken;
    public final /* synthetic */ PerseusHitsRemoteDataStoreImpl ParcelableVolumeInfo;
    public Iterator RatingCompat;
    public int RemoteActionCompatParcelizer;
    public Collection read;
    public createInAppMessageEventSubscriber serializer;
    public HitsRequest write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public verticalLineTo(PerseusHitsRemoteDataStoreImpl perseusHitsRemoteDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.ParcelableVolumeInfo = perseusHitsRemoteDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatToken = obj;
        this.MediaMetadataCompat |= Integer.MIN_VALUE;
        return this.ParcelableVolumeInfo.sendEventsHits(null, this);
    }
}
