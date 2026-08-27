package o;

import com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkerWrapperBuilder {
    public final GetOfflineLocationRequestStateImpl RemoteActionCompatParcelizer;
    public final WorkManagerImpl write;

    public WorkerWrapperBuilder(GetOfflineLocationRequestStateImpl getOfflineLocationRequestStateImpl, WorkManagerImpl workManagerImpl) {
        this.RemoteActionCompatParcelizer = getOfflineLocationRequestStateImpl;
        this.write = workManagerImpl;
    }
}
