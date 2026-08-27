package o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import java.util.HashSet;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class addGlobalPartnerParameter implements requestClearInvalidObservations {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ FirebaseRemoteConfigProvider RemoteActionCompatParcelizer;

    public addGlobalPartnerParameter(FirebaseRemoteConfigProvider firebaseRemoteConfigProvider) {
        this.RemoteActionCompatParcelizer = firebaseRemoteConfigProvider;
    }

    @Override // o.requestClearInvalidObservations
    public final void serializer(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
            if (!this.RemoteActionCompatParcelizer.serializer.read("remote_config_real_time_log")) {
                return;
            }
        } else if (!this.RemoteActionCompatParcelizer.serializer.read("remote_config_real_time_log")) {
            return;
        }
        int i4 = write + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(firebaseRemoteConfigException, "Remote Config real time failure when receiving update", new Object[0]);
        } else {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(firebaseRemoteConfigException, "Remote Config real time failure when receiving update", new Object[0]);
        }
    }

    @Override // o.requestClearInvalidObservations
    public final void RemoteActionCompatParcelizer(removeConnectionToComposeViewContext removeconnectiontocomposeviewcontext) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer.serializer.read("remote_config_real_time_log");
            throw null;
        }
        FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = this.RemoteActionCompatParcelizer;
        FirebaseRemoteConfig firebaseRemoteConfig = firebaseRemoteConfigProvider.serializer;
        if (!(!firebaseRemoteConfig.read("remote_config_real_time_log"))) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null, "Remote Config real time update ok", new Object[0]);
            int i3 = IconCompatParcelizer + 69;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        if (((HashSet) removeconnectiontocomposeviewcontext.IconCompatParcelizer()).contains("remote_config_real_time_critical_android")) {
            firebaseRemoteConfig.write().addOnFailureListener(new d0$$ExternalSyntheticLambda0(3, firebaseRemoteConfigProvider)).addOnSuccessListener(new d0$$ExternalSyntheticLambda0(4, new TncContentKt$$ExternalSyntheticLambda2(10, firebaseRemoteConfigProvider))).getClass();
        } else {
            firebaseRemoteConfigProvider.RemoteActionCompatParcelizer(true);
        }
    }
}
