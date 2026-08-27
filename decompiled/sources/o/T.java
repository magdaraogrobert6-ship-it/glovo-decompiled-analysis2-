package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class T {
    public f5ExternalSyntheticLambda4 IconCompatParcelizer;
    public final RecenterMapTriggerImpl MediaBrowserCompatMediaItem;
    public final SharedFlowImpl MediaDescriptionCompat;
    public final io.sentry.util.MediaBrowserCompatMediaItem RemoteActionCompatParcelizer;
    public final isOpenInternalroom_runtime read;
    public f5ExternalSyntheticLambda4 serializer;
    public final SaveHeatmapUrlImpl write;

    public T(SaveHeatmapUrlImpl saveHeatmapUrlImpl, io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, RecenterMapTriggerImpl recenterMapTriggerImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        saveHeatmapUrlImpl.getClass();
        mediaBrowserCompatMediaItem.getClass();
        recenterMapTriggerImpl.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = saveHeatmapUrlImpl;
        this.RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = recenterMapTriggerImpl;
        this.read = isopeninternalroom_runtime;
        this.MediaDescriptionCompat = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        f8 f8Var = U.read;
        g6 g6Var = U.IconCompatParcelizer;
        this.serializer = new f5ExternalSyntheticLambda4(14.0d, f8Var, g6Var);
        this.IconCompatParcelizer = new f5ExternalSyntheticLambda4(14.0d, f8Var, g6Var);
    }
}
