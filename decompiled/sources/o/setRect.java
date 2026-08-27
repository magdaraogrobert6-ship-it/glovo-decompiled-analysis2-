package o;

import com.huawei.hms.location.entity.activity.ActivityTransitionRequest;
import com.huawei.location.activity.RiemannSoftArService;
import com.huawei.location.base.activity.ISoftARManager;
import com.huawei.location.base.activity.callback.ARCallback;
import com.huawei.location.base.activity.callback.ATCallback;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class setRect implements ISoftARManager {
    public static volatile setRect IconCompatParcelizer;
    public static final byte[] RemoteActionCompatParcelizer = new byte[0];
    public RiemannSoftArService read;

    @Override // com.huawei.location.base.activity.ISoftARManager
    public final void removeActivityTransitionUpdates(ATCallback aTCallback) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SoftARManagerImpl", "removeActivityTransitionUpdates");
        try {
            this.read.removeActivityTransitionUpdates(aTCallback, null);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.serializer("SoftARManagerImpl", "removeAT exception");
        }
    }

    @Override // com.huawei.location.base.activity.ISoftARManager
    public final void removeActivityUpdates(ARCallback aRCallback) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SoftARManagerImpl", "removeActivityUpdates");
        try {
            this.read.removeActivityUpdates(aRCallback, null);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.serializer("SoftARManagerImpl", "removeAR exception");
        }
    }

    @Override // com.huawei.location.base.activity.ISoftARManager
    public final void requestActivityTransitionUpdates(List list, ATCallback aTCallback) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SoftARManagerImpl", "requestActivityTransitionUpdates");
        ActivityTransitionRequest activityTransitionRequest = new ActivityTransitionRequest();
        activityTransitionRequest.setTransitions(list);
        try {
            this.read.requestActivityTransitionUpdates(activityTransitionRequest, aTCallback, null);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.serializer("SoftARManagerImpl", "requestAT exception");
        }
    }

    @Override // com.huawei.location.base.activity.ISoftARManager
    public final void requestActivityUpdates(long j, ARCallback aRCallback) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SoftARManagerImpl", "requestActivityUpdates");
        if (j <= 0) {
            j = 30000;
        }
        try {
            this.read.requestActivityUpdates(j, aRCallback, null);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.serializer("SoftARManagerImpl", "requestAR exception");
        }
    }
}
