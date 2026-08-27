package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class C {
    public final SaveHeatmapUrlImpl IconCompatParcelizer;
    public final E MediaDescriptionCompat;
    public final getContentViewGroupParentLayout MediaSessionCompatQueueItem;
    public final SharedFlowImpl RatingCompat;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public long read;
    public f5ExternalSyntheticLambda4 serializer;
    public f5ExternalSyntheticLambda4 write;

    public C(E e, SaveHeatmapUrlImpl saveHeatmapUrlImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        e.getClass();
        saveHeatmapUrlImpl.getClass();
        isopeninternalroom_runtime.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.MediaDescriptionCompat = e;
        this.IconCompatParcelizer = saveHeatmapUrlImpl;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        this.MediaSessionCompatQueueItem = getcontentviewgroupparentlayout;
        this.RatingCompat = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_LATEST, 1);
        f8 f8Var = D.RemoteActionCompatParcelizer;
        g6 g6Var = D.IconCompatParcelizer;
        this.write = new f5ExternalSyntheticLambda4(14.0d, f8Var, g6Var);
        this.serializer = new f5ExternalSyntheticLambda4(14.0d, f8Var, g6Var);
    }
}
