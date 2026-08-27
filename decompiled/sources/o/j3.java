package o;

import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.roadrunner.map.integration.mapbox.domain.GetLineLayer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public final /* synthetic */ GetLineLayer MediaSessionCompatQueueItem;
    public GeoJsonSource RemoteActionCompatParcelizer;
    public String read;
    public /* synthetic */ Object serializer;
    public fg write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(GetLineLayer getLineLayer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = getLineLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 111;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.MediaSessionCompatQueueItem.invoke(null, this);
            throw null;
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.MediaSessionCompatQueueItem.invoke(null, this);
        int i3 = MediaBrowserCompatMediaItem + 35;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvoke;
    }
}
