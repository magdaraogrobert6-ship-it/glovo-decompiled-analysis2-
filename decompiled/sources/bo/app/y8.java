package bo.app;

import com.braze.storage.GeofenceDataStoreProvider;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.ShortNewsContentCardView;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y8 extends AdaptedFunctionReference implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return GeofenceDataStoreProvider.getDataStore$migrateGeofencesListToJson((w8) this.MediaSessionCompatQueueItem, (getSystemDefinedLCbbffg) obj, (getNoActiveChildannotations) obj2, (ShortNewsContentCardView) obj3);
    }

    public y8(w8 w8Var) {
        super(3, 4, w8.class, w8Var, "migrateGeofencesListToJson", "migrateGeofencesListToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }
}
