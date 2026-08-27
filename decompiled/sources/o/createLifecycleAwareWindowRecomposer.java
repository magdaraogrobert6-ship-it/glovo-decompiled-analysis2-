package o;

import android.location.Location;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.ut;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class createLifecycleAwareWindowRecomposer {
    public final /* synthetic */ i$d.a RemoteActionCompatParcelizer;

    public final void write(Location location) {
        for (accessreadAnimationScale accessreadanimationscale : (CopyOnWriteArrayList) ((ut) this.RemoteActionCompatParcelizer.read).MediaBrowserCompatMediaItem) {
            accessreadanimationscale.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - accessreadanimationscale.RemoteActionCompatParcelizer) >= accessreadanimationscale.serializer) {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                accessgetAnimationScaleFlowFor accessgetanimationscaleflowfor = new accessgetAnimationScaleFlowFor(latitude, longitude);
                float[] fArr = new float[1];
                Location.distanceBetween(accessreadanimationscale.write.read, longitude, latitude, longitude, fArr);
                if (fArr[0] >= accessreadanimationscale.IconCompatParcelizer) {
                    accessreadanimationscale.RemoteActionCompatParcelizer = jCurrentTimeMillis;
                    accessreadanimationscale.write = accessgetanimationscaleflowfor;
                    accessreadanimationscale.read.onLocationChanged(location);
                }
            }
            WrappedCompositionsetContent1211.read();
        }
    }

    public createLifecycleAwareWindowRecomposer(i$d.a aVar) {
        this.RemoteActionCompatParcelizer = aVar;
    }
}
