package o;

import coil3.ImageLoader$Builder;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.SentryUUID;
import java.util.concurrent.Executor;
import kotlin.TuplesKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class graphicsLayerpANQ8Wgdefault {
    public final getClipannotations IconCompatParcelizer;
    public final Executor MediaBrowserCompatMediaItem;
    public final coil3.memory.MemoryCacheService MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final TextAnnouncementContentCardView MediaSessionCompatResultReceiverWrapper;
    public final TuplesKt ParcelableVolumeInfo;
    public final getClipannotations PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final getClipannotations RemoteActionCompatParcelizer;
    public final Executor read;
    public final int serializer;
    public final boolean write;

    public graphicsLayerpANQ8Wgdefault(ImageLoader$Builder imageLoader$Builder) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) imageLoader$Builder.IconCompatParcelizer;
        Executor executorWrite = (Executor) imageLoader$Builder.RemoteActionCompatParcelizer;
        if (executorWrite == null) {
            executorWrite = null;
            if (textAnnouncementContentCardView != null) {
                CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) textAnnouncementContentCardView.get(ShortNewsContentCardViewCompanion.serializer);
                coroutineDispatcher = coroutineDispatcher instanceof CoroutineDispatcher ? coroutineDispatcher : null;
                if (coroutineDispatcher != null) {
                    executorWrite = coil3.util.IntPair.write(coroutineDispatcher);
                }
            }
            if (executorWrite == null) {
                executorWrite = SentryUUID.read(false);
            }
        }
        this.read = executorWrite;
        if (textAnnouncementContentCardView == null) {
            if (((Executor) imageLoader$Builder.RemoteActionCompatParcelizer) != null) {
                textAnnouncementContentCardView = (CoroutineDispatcher) coil3.util.IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{executorWrite}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1915506938);
            } else {
                textAnnouncementContentCardView = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            }
        }
        this.MediaSessionCompatResultReceiverWrapper = textAnnouncementContentCardView;
        Executor executor = (Executor) imageLoader$Builder.serializer;
        this.MediaBrowserCompatMediaItem = executor == null ? SentryUUID.read(true) : executor;
        this.IconCompatParcelizer = new getClipannotations(0);
        TuplesKt tuplesKt = (TuplesKt) imageLoader$Builder.read;
        this.ParcelableVolumeInfo = tuplesKt == null ? accessgetSpotShadowColor0d7_KjUjd.write : tuplesKt;
        this.RemoteActionCompatParcelizer = getClipannotations.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = new coil3.memory.MemoryCacheService(12, false);
        this.MediaMetadataCompat = 4;
        this.RatingCompat = Integer.MAX_VALUE;
        this.MediaSessionCompatQueueItem = 20;
        this.serializer = 8;
        this.write = true;
        this.PlaybackStateCompatCustomAction = new getClipannotations(0);
    }
}
