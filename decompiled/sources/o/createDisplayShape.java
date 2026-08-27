package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class createDisplayShape extends ContinuationImpl {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public getNotificationChannels IconCompatParcelizer;
    public Collection MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public Iterator MediaSessionCompatQueueItem;
    public final /* synthetic */ androidx.work.impl.WorkerWrapper.Builder MediaSessionCompatResultReceiverWrapper;
    public Collection RatingCompat;
    public int RemoteActionCompatParcelizer;
    public List read;
    public int serializer;
    public Integer write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createDisplayShape(androidx.work.impl.WorkerWrapper.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatResultReceiverWrapper = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAccess$produceMapLayer;
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 73;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.MediaDescriptionCompat = obj;
            this.MediaMetadataCompat |= Integer.MIN_VALUE;
            objAccess$produceMapLayer = androidx.work.impl.WorkerWrapper.Builder.access$produceMapLayer(this.MediaSessionCompatResultReceiverWrapper, null, null, null, this);
            int i3 = 49 / 0;
        } else {
            this.MediaDescriptionCompat = obj;
            this.MediaMetadataCompat |= Integer.MIN_VALUE;
            objAccess$produceMapLayer = androidx.work.impl.WorkerWrapper.Builder.access$produceMapLayer(this.MediaSessionCompatResultReceiverWrapper, null, null, null, this);
        }
        int i4 = ParcelableVolumeInfo + 17;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$produceMapLayer;
        }
        obj2.hashCode();
        throw null;
    }
}
