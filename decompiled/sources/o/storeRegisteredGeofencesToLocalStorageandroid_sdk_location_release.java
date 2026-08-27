package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class storeRegisteredGeofencesToLocalStorageandroid_sdk_location_release extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ requestSingleLocationUpdateFromGooglePlaylambda30 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public storeRegisteredGeofencesToLocalStorageandroid_sdk_location_release(requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "ConfigurationUpdater");
        this.read = requestsinglelocationupdatefromgoogleplaylambda30;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (controlMessage == ControlMessage.CONFIG_UPDATE_REQUEST) {
            this.read.RemoteActionCompatParcelizer();
        }
    }
}
