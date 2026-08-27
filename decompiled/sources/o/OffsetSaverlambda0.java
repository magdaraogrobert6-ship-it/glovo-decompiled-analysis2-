package o;

import coil3.ComponentRegistry$Builder;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class OffsetSaverlambda0 extends ContinuationImpl {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ ComponentRegistry$Builder MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public Throwable MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public Iterator RemoteActionCompatParcelizer;
    public int read;
    public long serializer;
    public onBackInvoked write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetSaverlambda0(ComponentRegistry$Builder componentRegistry$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = componentRegistry$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 75;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaMetadataCompat = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        Object objInvoke = this.MediaBrowserCompatMediaItem.invoke(0L, this);
        int i4 = PlaybackStateCompatCustomAction + 57;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
