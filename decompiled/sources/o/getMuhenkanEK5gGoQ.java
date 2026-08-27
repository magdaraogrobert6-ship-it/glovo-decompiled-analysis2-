package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.location.zzak;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import com.huawei.location.Vw$Vw;
import com.sentiance.core.model.thrift.E1$b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getMuhenkanEK5gGoQ extends accessgetNumPad7cp implements GeofencingClient {
    public getMuhenkanEK5gGoQ(Activity activity) {
        super(activity, activity, getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task removeGeofences(List list) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        E1$b e1$b = new E1$b();
        e1$b.serializer = list;
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = e1$b;
        taskApiCall$BuilderIconCompatParcelizer.write = 2425;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new Vw$Vw(geofencingRequest, 2, pendingIntent);
        taskApiCall$BuilderIconCompatParcelizer.write = 2424;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    public getMuhenkanEK5gGoQ(Context context) {
        super(context, null, getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task removeGeofences(PendingIntent pendingIntent) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new zzak(4, pendingIntent);
        taskApiCall$BuilderIconCompatParcelizer.write = 2425;
        return read(1, taskApiCall$BuilderIconCompatParcelizer.read());
    }
}
