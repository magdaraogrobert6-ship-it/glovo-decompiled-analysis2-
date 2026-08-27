package com.braze.location;

import com.braze.storage.GeofenceDataStoreProvider;
import java.util.List;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GooglePlayLocationUtils$$ExternalSyntheticLambda16 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ GeofenceDataStoreProvider f$1;

    public /* synthetic */ GooglePlayLocationUtils$$ExternalSyntheticLambda16(List list, GeofenceDataStoreProvider geofenceDataStoreProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
        this.f$1 = geofenceDataStoreProvider;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f$1;
        List list = this.f$0;
        Void r4 = (Void) obj;
        return i != 0 ? GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$0(list, geofenceDataStoreProvider, r4) : GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$1(list, geofenceDataStoreProvider, r4);
    }
}
