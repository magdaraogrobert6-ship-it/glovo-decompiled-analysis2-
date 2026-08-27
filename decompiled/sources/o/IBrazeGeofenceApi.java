package o;

import android.location.Location;
import com.sentiance.sdk.crashdetection.api.CrashDetectionApi;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class IBrazeGeofenceApi extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ Location IconCompatParcelizer;
    final /* synthetic */ getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    final /* synthetic */ CrashDetectionApi read;
    final /* synthetic */ GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IBrazeGeofenceApi(CrashDetectionApi crashDetectionApi, clearAllData clearalldata, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3 googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3, Location location) {
        super(clearalldata, "CrashDetectionApi");
        this.read = crashDetectionApi;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.serializer = googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3;
        this.IconCompatParcelizer = location;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        this.RemoteActionCompatParcelizer.read(this);
        Location lastLocationFromEventStore = obj != null ? (Location) obj : this.read.getLastLocationFromEventStore();
        if (lastLocationFromEventStore == null) {
            lastLocationFromEventStore = this.IconCompatParcelizer;
        }
        GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1 googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1 = (GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1) this.serializer;
        CrashDetectionApi.lambda$invokeDummyVehicleCrash$3(googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1.RemoteActionCompatParcelizer, googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1.write, lastLocationFromEventStore);
    }
}
