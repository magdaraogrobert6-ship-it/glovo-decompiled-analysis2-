package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes2.dex */
public final class obtainMatrixsQKQjiQ extends ContinuationImpl {
    public HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 IconCompatParcelizer;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 RatingCompat;
    public int RemoteActionCompatParcelizer;
    public String read;
    public FlowCollector serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obtainMatrixsQKQjiQ(HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RatingCompat = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaMetadataCompat = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.RatingCompat.emit(null, this);
    }
}
