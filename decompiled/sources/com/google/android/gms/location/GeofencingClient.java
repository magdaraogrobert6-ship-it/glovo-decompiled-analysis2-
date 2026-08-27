package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;
import java.util.List;
import o.accessgetNumPadAddcp;
import o.accessgetNumPadDividecp;

/* JADX INFO: loaded from: classes2.dex */
public interface GeofencingClient extends accessgetNumPadAddcp {
    Task addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    @Override // o.accessgetNumPadAddcp
    /* synthetic */ accessgetNumPadDividecp getApiKey();

    Task removeGeofences(PendingIntent pendingIntent);

    Task removeGeofences(List<String> list);
}
