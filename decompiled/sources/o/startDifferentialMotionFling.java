package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class startDifferentialMotionFling extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ SaveHeatmapUrlImpl read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public startDifferentialMotionFling(SaveHeatmapUrlImpl saveHeatmapUrlImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = saveHeatmapUrlImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.read.invoke(this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.read.invoke(this);
        int i3 = serializer + 75;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvoke;
    }
}
