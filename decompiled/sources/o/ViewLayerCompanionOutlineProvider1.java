package o;

import com.huawei.hmf.tasks.CancellationToken;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewLayerCompanionOutlineProvider1 {
    public final ViewLayerUniqueDrawingIdApi29 RemoteActionCompatParcelizer = new ViewLayerUniqueDrawingIdApi29();

    public final void IconCompatParcelizer(Object obj) {
        this.RemoteActionCompatParcelizer.read(obj);
    }

    public final void read(Exception exc) {
        this.RemoteActionCompatParcelizer.serializer(exc);
    }

    public ViewLayerCompanionOutlineProvider1(CancellationToken cancellationToken) {
        cancellationToken.register(new isAutomaticGeofenceRequestsEnabled(1, this));
    }

    public ViewLayerCompanionOutlineProvider1() {
    }
}
