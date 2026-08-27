package o;

import android.location.Location;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.BoundingBox;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class DataStoreProvidercExternalSyntheticLambda0 extends r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE {
    final /* synthetic */ r8lambdalmSvIZk2OaypKCEb55V0vnTE72k IconCompatParcelizer;
    private final r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI read;
    private final int serializer;
    private final Location write;

    @Override // o.r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE
    public final void RemoteActionCompatParcelizer() {
        BoundingBox.Direction direction = BoundingBox.Direction.SOUTH;
        Location location = this.write;
        int i = this.serializer;
        Location locationRemoteActionCompatParcelizer = BoundingBox.RemoteActionCompatParcelizer(location, i, direction);
        Location locationRemoteActionCompatParcelizer2 = BoundingBox.RemoteActionCompatParcelizer(location, i, BoundingBox.Direction.NORTH);
        Location locationRemoteActionCompatParcelizer3 = BoundingBox.RemoteActionCompatParcelizer(location, i, BoundingBox.Direction.WEST);
        Location locationRemoteActionCompatParcelizer4 = BoundingBox.RemoteActionCompatParcelizer(location, i, BoundingBox.Direction.EAST);
        BoundingBox.write writeVar = new BoundingBox.write();
        writeVar.write(locationRemoteActionCompatParcelizer.getLatitude());
        writeVar.serializer(locationRemoteActionCompatParcelizer2.getLatitude());
        writeVar.IconCompatParcelizer(locationRemoteActionCompatParcelizer3.getLongitude());
        writeVar.read(locationRemoteActionCompatParcelizer4.getLongitude());
        final List<DataStoreProvidern> list = this.IconCompatParcelizer.RatingCompat.read(writeVar.serializer());
        this.read.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new Runnable() { // from class: o.DataStoreProviderd
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.read.write(list);
            }
        });
    }

    @Override // o.r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE
    public final void read() {
        r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI r8lambdad6kv_zcyxwf_mbclqy2czkztbli = this.read;
        r8lambdad6kv_zcyxwf_mbclqy2czkztbli.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(7, r8lambdad6kv_zcyxwf_mbclqy2czkztbli));
    }

    public DataStoreProvidercExternalSyntheticLambda0(r8lambdalmSvIZk2OaypKCEb55V0vnTE72k r8lambdalmsvizk2oaypkceb55v0vnte72k, Location location, int i, r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI r8lambdad6kv_zcyxwf_mbclqy2czkztbli) {
        this.IconCompatParcelizer = r8lambdalmsvizk2oaypkceb55v0vnte72k;
        this.write = location;
        this.serializer = i;
        this.read = r8lambdad6kv_zcyxwf_mbclqy2czkztbli;
    }
}
