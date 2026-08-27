package o;

import coil3.ComponentRegistry$Builder;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class hg extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ ComponentRegistry$Builder MediaSessionCompatQueueItem;
    public /* synthetic */ Object RatingCompat;
    public List RemoteActionCompatParcelizer;
    public int read;
    public Iterator serializer;
    public List write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(ComponentRegistry$Builder componentRegistry$Builder, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = componentRegistry$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RatingCompat = obj;
            this.read |= Integer.MIN_VALUE;
            return this.MediaSessionCompatQueueItem.updateLayerElements(null, this);
        }
        this.RatingCompat = obj;
        this.read |= Integer.MIN_VALUE;
        int i3 = 44 / 0;
        return this.MediaSessionCompatQueueItem.updateLayerElements(null, this);
    }
}
