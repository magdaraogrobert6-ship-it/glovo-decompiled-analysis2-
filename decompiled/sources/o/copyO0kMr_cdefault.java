package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class copyO0kMr_cdefault extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 MediaSessionCompatQueueItem;
    public FlowCollector RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public r8lambdafHcIMtqslO5nN2ofGE631aElY write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyO0kMr_cdefault(HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.MediaSessionCompatQueueItem.emit(null, this);
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.MediaSessionCompatQueueItem.emit(null, this);
        throw null;
    }
}
