package o;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class retrieveBrazeGeofencesFromLocalStoragelambda0 implements setPushDuration {
    @Override // o.setPushDuration
    public final <T> T write(Class<T> cls, Class cls2, int i, List<Class> list) {
        if (cls == readString.class) {
            return (T) setPushUniqueId.write(DataStoreProviderga.class, cls2, i, list);
        }
        if (cls == r8lambdaXEYf2Y6iq6qoNF46VmdkEq76k.class) {
            return (T) setPushUniqueId.write(setBrazeGeofenceReEligibilityManager.class, cls2, i, list);
        }
        if (cls == tearDownGeofences.class) {
            return (T) setPushUniqueId.write(unregisterGeofences.class, cls2, i, list);
        }
        if (cls == r8lambda9v2QuFK54eeNQIaiI9IZ0Hd1X3M.class) {
            return (T) setPushUniqueId.write(getGeofencesEnabledFromServerConfiglambda2.class, cls2, i, list);
        }
        return null;
    }
}
