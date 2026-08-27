package o;

import com.roadrunner.auth.domain.state.GetUserAuthStateImpl;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class launchDeeplinkMain {
    public final GetRiderStatusImpl IconCompatParcelizer;
    public final GetUserAuthStateImpl read;
    public final GetAppStateImpl write;
    public final Set serializer = onContentCardClicked.MediaSessionCompatQueueItem(new isTrackingEnabled[]{isTrackingEnabled.AVAILABLE, isTrackingEnabled.ENDING, isTrackingEnabled.READY, isTrackingEnabled.WORKING});
    public final Flow RemoteActionCompatParcelizer = FlowKt.read(new ReconnectScheduler$schedule$1(this, null, 26));

    public launchDeeplinkMain(GetUserAuthStateImpl getUserAuthStateImpl, GetRiderStatusImpl getRiderStatusImpl, GetAppStateImpl getAppStateImpl) {
        this.read = getUserAuthStateImpl;
        this.IconCompatParcelizer = getRiderStatusImpl;
        this.write = getAppStateImpl;
    }
}
