package o;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapView;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class hf implements f2ExternalSyntheticLambda4 {
    public final SharedFlowImpl IconCompatParcelizer;
    public final SharedFlowImpl MediaDescriptionCompat;
    public final isAdapterPositionOnScreen RatingCompat;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public MapView read;
    public final isAdapterPositionOnScreen serializer;
    public Cancelable write;

    public hf() {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = sharedFlowImplRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new hd(this, 0));
        this.RatingCompat = new isAdapterPositionOnScreen(new hd(this, 1));
        this.serializer = new isAdapterPositionOnScreen(new hd(this, 2));
    }
}
