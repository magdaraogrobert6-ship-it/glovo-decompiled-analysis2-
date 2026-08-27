package o;

import android.app.PendingIntent;
import com.google.android.gms.internal.location.zzco;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getMultiplyEK5gGoQ implements GeofencingApi {
    @Override // com.google.android.gms.location.GeofencingApi
    public final accessgetNumPadDirectionDowncp addGeofences(accessgetNumPad6cp accessgetnumpad6cp, List list, PendingIntent pendingIntent) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        getMetaRightEK5gGoQ getmetarightek5ggoq = new getMetaRightEK5gGoQ(accessgetnumpad6cp, builder.build(), pendingIntent);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmetarightek5ggoq);
        return getmetarightek5ggoq;
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final accessgetNumPadDirectionDowncp removeGeofences(accessgetNumPad6cp accessgetnumpad6cp, PendingIntent pendingIntent) {
        zzco zzcoVar = new zzco(accessgetnumpad6cp, pendingIntent, 0);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, zzcoVar);
        return zzcoVar;
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final accessgetNumPadDirectionDowncp removeGeofences(accessgetNumPad6cp accessgetnumpad6cp, List list) {
        zzco zzcoVar = new zzco(accessgetnumpad6cp, list, 1);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, zzcoVar);
        return zzcoVar;
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final accessgetNumPadDirectionDowncp addGeofences(accessgetNumPad6cp accessgetnumpad6cp, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        getMetaRightEK5gGoQ getmetarightek5ggoq = new getMetaRightEK5gGoQ(accessgetnumpad6cp, geofencingRequest, pendingIntent);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmetarightek5ggoq);
        return getmetarightek5ggoq;
    }
}
