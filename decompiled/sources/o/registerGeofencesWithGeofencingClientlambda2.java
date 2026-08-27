package o;

import com.sentiance.sdk.UserLinkerCallback;

/* JADX INFO: loaded from: classes3.dex */
final class registerGeofencesWithGeofencingClientlambda2 implements UserLinkerCallback {
    private boolean RemoteActionCompatParcelizer = false;
    final /* synthetic */ registerGeofencesWithGeofencingClientlambda1 serializer;
    private final clearandroid_sdk_base_release write;

    @Override // com.sentiance.sdk.UserLinkerCallback
    public final void onFailure() {
        synchronized (this) {
            if (!this.RemoteActionCompatParcelizer) {
                this.write.RemoteActionCompatParcelizer(new registerGeofencesWithGeofencingClientlambda35(this, 0));
                this.RemoteActionCompatParcelizer = true;
            }
        }
    }

    @Override // com.sentiance.sdk.UserLinkerCallback
    public final void onSuccess() {
        synchronized (this) {
            if (!this.RemoteActionCompatParcelizer) {
                this.write.RemoteActionCompatParcelizer(new registerGeofencesWithGeofencingClientlambda35(this, 1));
                this.RemoteActionCompatParcelizer = true;
            }
        }
    }

    public registerGeofencesWithGeofencingClientlambda2(registerGeofencesWithGeofencingClientlambda1 registergeofenceswithgeofencingclientlambda1, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.serializer = registergeofenceswithgeofencingclientlambda1;
        this.write = readandroid_sdk_base_releaseVar;
    }
}
