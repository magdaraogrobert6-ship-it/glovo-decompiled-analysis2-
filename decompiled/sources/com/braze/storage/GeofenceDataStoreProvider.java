package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.w8;
import bo.app.x8;
import bo.app.y8;
import bo.app.z8;
import com.braze.enums.DataStoreKey;
import o.ShortNewsContentCardView;
import o.forEachItemAfter;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.onContentCardClicked;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class GeofenceDataStoreProvider extends DataStoreProvider {
    public static final w8 Companion = new w8();
    public static final String GEOFENCES_DATA_STORE_STORAGE = "com.braze.geofences";
    public static final String GEOFENCE_GLOBAL_ELIGIBILITY_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.eligibility.global";
    public static final String GEOFENCE_INDIVIDUAL_ELIGIBILITY_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.eligibility.individual";
    public static final String GEOFENCE_STORAGE_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.storage";
    public static final String REGISTERED_GEOFENCE_SHARED_PREFS_LOCATION = "com.appboy.support.geofences";
    private final String apiKey;

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getDataStore$migrateIndividualReeligibilityMapToJson(w8 w8Var, getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations, ShortNewsContentCardView shortNewsContentCardView) {
        return w8Var.a(getsystemdefinedlcbbffg, getnoactivechildannotations);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceDataStoreProvider(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.apiKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateGeofencesListToJson(w8 w8Var, getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations, ShortNewsContentCardView shortNewsContentCardView) {
        w8Var.getClass();
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        return w8Var.a(getsystemdefinedlcbbffg, getnoactivechildannotations, DataStoreKey.GEOFENCES.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateRegisteredGeofencesListToJson(w8 w8Var, getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations, ShortNewsContentCardView shortNewsContentCardView) {
        w8Var.getClass();
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        return w8Var.a(getsystemdefinedlcbbffg, getnoactivechildannotations, DataStoreKey.REGISTERED_GEOFENCES.getKey());
    }

    @Override // com.braze.storage.DataStoreProvider
    public performCustomExitMxy_nc0 getDataStore() {
        SharedPreferencesMigration sharedPreferencesMigrationIconCompatParcelizer = forEachItemAfter.IconCompatParcelizer(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.appboy.managers.geofences.eligibility.global.", this.apiKey), onContentCardClicked.MediaSessionCompatQueueItem(new String[]{DataStoreKey.GLOBAL_LAST_REPORT.getKey(), DataStoreKey.GLOBAL_LAST_REQUEST.getKey()}));
        Context context = getContext();
        String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.appboy.managers.geofences.eligibility.individual.", this.apiKey);
        w8 w8Var = Companion;
        return createOrGetDataStore(SQLite.read(sharedPreferencesMigrationIconCompatParcelizer, new SharedPreferencesMigration(context, strSerializer, (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new x8(w8Var), 12), new SharedPreferencesMigration(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.appboy.managers.geofences.storage.", this.apiKey), (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new y8(w8Var), 12), new SharedPreferencesMigration(getContext(), REGISTERED_GEOFENCE_SHARED_PREFS_LOCATION, (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new z8(w8Var), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.geofences.", this.apiKey);
    }
}
