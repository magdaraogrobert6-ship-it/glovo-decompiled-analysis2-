package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaobiiF3xbQoaO3g1Eh830fbs4wgk extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ SaveHeatmapUrlImpl IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaobiiF3xbQoaO3g1Eh830fbs4wgk(SaveHeatmapUrlImpl saveHeatmapUrlImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = saveHeatmapUrlImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.invoke(this);
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        int i3 = 30 / 0;
        return this.IconCompatParcelizer.invoke(this);
    }
}
