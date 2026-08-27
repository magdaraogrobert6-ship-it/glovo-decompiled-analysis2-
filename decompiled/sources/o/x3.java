package o;

import io.grpc.CallOptions$Builder;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public final /* synthetic */ CallOptions$Builder MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public Collection read;
    public Iterator serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(CallOptions$Builder callOptions$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = callOptions$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 49;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.MediaMetadataCompat = obj;
            this.RatingCompat |= Integer.MIN_VALUE;
            this.MediaDescriptionCompat.getSubzonePolygons(null, this);
            obj2.hashCode();
            throw null;
        }
        this.MediaMetadataCompat = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        Object subzonePolygons = this.MediaDescriptionCompat.getSubzonePolygons(null, this);
        int i3 = MediaSessionCompatQueueItem + 5;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return subzonePolygons;
    }
}
