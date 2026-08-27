package o;

import coil3.ImageLoader$Builder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiParagraphExternalSyntheticLambda0 extends ContinuationImpl {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompat;
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public ComposeUiTextFlags MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ ImageLoader$Builder ParcelableVolumeInfo;
    public /* synthetic */ Object PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public int read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraphExternalSyntheticLambda0(ImageLoader$Builder imageLoader$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.ParcelableVolumeInfo = imageLoader$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 21;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.PlaybackStateCompatCustomAction = obj;
            this.MediaSessionCompatResultReceiverWrapper |= Integer.MIN_VALUE;
            return this.ParcelableVolumeInfo.invoke(null, null, null, null, null, this);
        }
        this.PlaybackStateCompatCustomAction = obj;
        this.MediaSessionCompatResultReceiverWrapper |= Integer.MIN_VALUE;
        this.ParcelableVolumeInfo.invoke(null, null, null, null, null, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
