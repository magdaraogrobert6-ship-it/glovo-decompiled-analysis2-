package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getNeedsLetterSpacingSpan extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public accessgetGocp IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ SaveHeatmapUrlImpl read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNeedsLetterSpacingSpan(SaveHeatmapUrlImpl saveHeatmapUrlImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = saveHeatmapUrlImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 49;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.read.invoke(null, this);
        int i4 = serializer + 89;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
