package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class CoordinatorLayoutSavedState extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ SaveHeatmapUrlImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayoutSavedState(SaveHeatmapUrlImpl saveHeatmapUrlImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = saveHeatmapUrlImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object user = this.serializer.getUser(this);
        int i4 = RemoteActionCompatParcelizer + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return user;
    }
}
