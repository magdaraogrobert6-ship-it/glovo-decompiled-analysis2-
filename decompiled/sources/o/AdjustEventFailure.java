package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import io.reactivex.Completable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustEventFailure extends androidx.compose.animation.core.TransitionState {
    private static int read = 0;
    private static int write = 1;
    public final SaveHeatmapUrlImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdjustEventFailure(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, SaveHeatmapUrlImpl saveHeatmapUrlImpl) {
        super(((com.data.util.AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        saveHeatmapUrlImpl.getClass();
        this.serializer = saveHeatmapUrlImpl;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Completable RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        String str = (String) obj;
        str.getClass();
        getEventToken geteventtoken = new getEventToken(str);
        SaveHeatmapUrlImpl saveHeatmapUrlImpl = this.serializer;
        saveHeatmapUrlImpl.getClass();
        Completable completableSerializer = ((getProductId) saveHeatmapUrlImpl.serializer).serializer(geteventtoken);
        int i2 = read + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return completableSerializer;
    }
}
