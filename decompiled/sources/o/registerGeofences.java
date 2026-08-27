package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class registerGeofences extends getLatitudeannotations<recordGeofenceTransition> {
    final /* synthetic */ handleGeofenceEventlambda3 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public registerGeofences(handleGeofenceEventlambda3 handlegeofenceeventlambda3, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "AlarmManager");
        this.IconCompatParcelizer = handlegeofenceeventlambda3;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<recordGeofenceTransition> getlongitudeannotations) {
        List list = getlongitudeannotations.read().write;
        long jWrite = getlongitudeannotations.write();
        handleGeofenceEventlambda3 handlegeofenceeventlambda3 = this.IconCompatParcelizer;
        handleGeofenceEventlambda3.serializer(handlegeofenceeventlambda3, list, jWrite);
        handlegeofenceeventlambda3.write();
    }
}
