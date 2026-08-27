package o;

import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.exception.NativeExceptionHandler;
import com.sentiance.sdk.payload.batching.PayloadBatcher;
import com.sentiance.sdk.payload.creation.DetectionIdManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class getPublicNotificationExtras {
    private static getPublicNotificationExtras serializer;
    private HashSet IconCompatParcelizer;

    public static getPublicNotificationExtras b() {
        getPublicNotificationExtras getpublicnotificationextras;
        synchronized (getPublicNotificationExtras.class) {
            if (serializer == null) {
                getPublicNotificationExtras getpublicnotificationextras2 = new getPublicNotificationExtras();
                getpublicnotificationextras2.IconCompatParcelizer = new HashSet();
                serializer = getpublicnotificationextras2;
            }
            getpublicnotificationextras = serializer;
        }
        return getpublicnotificationextras;
    }

    public final void read() {
        this.IconCompatParcelizer.clear();
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList(this.IconCompatParcelizer);
        arrayList.addAll(Arrays.asList(handleGeofenceEventlambda3.class, requestSingleLocationUpdatelambda6.class, r8lambdaw447glWJfoun4bg91upXnaDQEZs.class, ConfigurationManager.class, requestSingleLocationUpdateFromGooglePlaylambda30.class, retrieveRegisteredGeofencesFromLocalStoragelambda0.class, r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.class, configureFromServerConfiglambda2.class, forJsonPutlambda1.class, getDismissalTimeMs.class, getCooldownEnterSeconds.class, component4android_sdk_base_release.class, NativeExceptionHandler.class, getUseWebView.class, setContentText.class, setActionId.class, RecommendedEvent.class, addNotificationActionslambda1.class, PayloadBatcher.class, DetectionIdManager.class, setDeleteIntentlambda0.class, setTitleIfPresent.class, wakeScreenIfAppropriatelambda3.class, handleAdmRegistrationEventIfEnabledlambda0.class, BannersDataStoreProviderCompanionExternalSyntheticLambda3.class, migrateTriggersStorageToJsonlambda4.class, migrateTriggersStorageToJsonlambda21.class));
        return arrayList;
    }

    public final void write(Class<? extends r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q> cls) {
        this.IconCompatParcelizer.add(cls);
    }
}
