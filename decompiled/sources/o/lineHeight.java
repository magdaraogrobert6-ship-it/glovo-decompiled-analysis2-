package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class lineHeight extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatToken = 1;
    public FlowCollector IconCompatParcelizer;
    public final /* synthetic */ HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RatingCompat;
    public String RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public LetterSpacingSpanPx write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lineHeight(HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaDescriptionCompat = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 93;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        Object objEmit = this.MediaDescriptionCompat.emit(null, this);
        int i4 = MediaBrowserCompatMediaItem + 121;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
