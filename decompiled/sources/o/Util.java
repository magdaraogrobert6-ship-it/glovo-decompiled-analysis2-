package o;

import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.support.implementation.RiderSupportRootedCheckImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Util implements ThirdPartySharingResponseData {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;
    public final RiderSupportRootedCheckImpl serializer;
    public final SystemLifecycleSystemLifecycleCallback write;

    public Util(transferSessionPackageI transfersessionpackagei, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, RiderSupportRootedCheckImpl riderSupportRootedCheckImpl) {
        transfersessionpackagei.getClass();
        this.read = transfersessionpackagei;
        this.write = systemLifecycleSystemLifecycleCallback;
        this.serializer = riderSupportRootedCheckImpl;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        Object obj = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 21), 3);
        int i2 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
