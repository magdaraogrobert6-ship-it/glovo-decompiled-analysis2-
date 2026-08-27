package o;

import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getLineEllipsisCount extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public double IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ LastStopSelectionCoordinator RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public double write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLineEllipsisCount(LastStopSelectionCoordinator lastStopSelectionCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = lastStopSelectionCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 9;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaMetadataCompat = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        Object objReverseGeocodeCoordinates = this.RatingCompat.reverseGeocodeCoordinates(0.0d, 0.0d, this);
        int i4 = MediaSessionCompatQueueItem + 97;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objReverseGeocodeCoordinates;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
