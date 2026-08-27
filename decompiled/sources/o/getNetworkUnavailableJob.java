package o;

import io.socket.emitter.Emitter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getNetworkUnavailableJob extends Emitter {
    public final Map IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final HashMap MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 PlaybackStateCompat;
    public onRefresh RatingCompat;
    public String RemoteActionCompatParcelizer;
    public final String read;
    public final getMessageImageView serializer;
    public final String write;

    public getNetworkUnavailableJob(initializeRecyclerView initializerecyclerview) {
        super(0);
        this.read = initializerecyclerview.MediaMetadataCompat;
        this.write = initializerecyclerview.MediaBrowserCompatMediaItem;
        this.MediaSessionCompatQueueItem = initializerecyclerview.RatingCompat;
        this.MediaDescriptionCompat = initializerecyclerview.PlaybackStateCompat;
        this.MediaMetadataCompat = initializerecyclerview.MediaSessionCompatResultReceiverWrapper;
        this.MediaBrowserCompatMediaItem = initializerecyclerview.ParcelableVolumeInfo;
        this.MediaSessionCompatResultReceiverWrapper = initializerecyclerview.MediaSessionCompatToken;
        this.PlaybackStateCompat = initializerecyclerview.PlaybackStateCompatCustomAction;
        this.serializer = initializerecyclerview.read;
        this.IconCompatParcelizer = initializerecyclerview.MediaSessionCompatQueueItem;
    }

    public abstract void IconCompatParcelizer(ContentCardsFragmentcontentCardsUpdate5[] contentCardsFragmentcontentCardsUpdate5Arr);

    public abstract void serializer();

    public abstract void write();
}
