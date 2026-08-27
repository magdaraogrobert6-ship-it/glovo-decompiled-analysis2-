package o;

import com.sentiance.sdk.TransmittableDataType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class GooglePlayLocationUtilsExternalSyntheticLambda16 extends migrateTriggersReeligibilityToJsonlambda1<Set<TransmittableDataType>> {
    final /* synthetic */ retrieveRegisteredGeofencesFromLocalStoragelambda0 read;

    public GooglePlayLocationUtilsExternalSyntheticLambda16(retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0) {
        this.read = retrieveregisteredgeofencesfromlocalstoragelambda0;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final Set<TransmittableDataType> RemoteActionCompatParcelizer() {
        HashSet hashSet = new HashSet();
        Set<String> setSingleton = Collections.singleton(TransmittableDataType.ALL.name());
        retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0 = this.read;
        for (String str : retrieveregisteredgeofencesfromlocalstoragelambda0.read.write("sentiance-transmittable-data-types", setSingleton)) {
            try {
                hashSet.add(TransmittableDataType.valueOf(str));
            } catch (IllegalArgumentException e) {
                retrieveregisteredgeofencesfromlocalstoragelambda0.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to get enum for value: %s", str);
            }
        }
        return hashSet;
    }
}
