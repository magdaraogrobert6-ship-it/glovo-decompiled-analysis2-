package o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewExternalSyntheticLambda3 implements requestClearInvalidObservations {
    public final /* synthetic */ ConfigRealtimeHttpClient RemoteActionCompatParcelizer;

    @Override // o.requestClearInvalidObservations
    public final void RemoteActionCompatParcelizer(removeConnectionToComposeViewContext removeconnectiontocomposeviewcontext) {
    }

    @Override // o.requestClearInvalidObservations
    public final void serializer(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        ConfigRealtimeHttpClient configRealtimeHttpClient = this.RemoteActionCompatParcelizer;
        synchronized (configRealtimeHttpClient) {
            configRealtimeHttpClient.PlaybackStateCompat = true;
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(firebaseRemoteConfigException);
    }

    public AndroidComposeViewExternalSyntheticLambda3(ConfigRealtimeHttpClient configRealtimeHttpClient) {
        this.RemoteActionCompatParcelizer = configRealtimeHttpClient;
    }
}
