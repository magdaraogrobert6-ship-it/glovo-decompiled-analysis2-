package com.google.android.gms.location;

import android.app.PendingIntent;
import java.util.List;
import o.accessgetNumPad6cp;
import o.accessgetNumPadDirectionDowncp;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface GeofencingApi {
    accessgetNumPadDirectionDowncp addGeofences(accessgetNumPad6cp accessgetnumpad6cp, GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    @Deprecated
    accessgetNumPadDirectionDowncp addGeofences(accessgetNumPad6cp accessgetnumpad6cp, List<Geofence> list, PendingIntent pendingIntent);

    accessgetNumPadDirectionDowncp removeGeofences(accessgetNumPad6cp accessgetnumpad6cp, PendingIntent pendingIntent);

    accessgetNumPadDirectionDowncp removeGeofences(accessgetNumPad6cp accessgetnumpad6cp, List<String> list);
}
