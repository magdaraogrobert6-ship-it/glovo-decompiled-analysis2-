package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class getLayoutIntrinsicsui_text extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public final /* synthetic */ HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public FlowCollector read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLayoutIntrinsicsui_text(HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaMetadataCompat = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.MediaSessionCompatQueueItem = obj;
            this.MediaDescriptionCompat |= Integer.MIN_VALUE;
            return this.MediaMetadataCompat.emit(null, this);
        }
        this.MediaSessionCompatQueueItem = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        int i3 = 3 / 0;
        return this.MediaMetadataCompat.emit(null, this);
    }
}
