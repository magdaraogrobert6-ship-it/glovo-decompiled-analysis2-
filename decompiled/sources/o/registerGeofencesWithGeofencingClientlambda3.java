package o;

import com.sentiance.sdk.UserLinkerAsync;
import com.sentiance.sdk.authentication.UserCreationType;
import com.sentiance.sdk.util.Optional;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class registerGeofencesWithGeofencingClientlambda3 extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    final /* synthetic */ registerGeofencesWithGeofencingClientlambda31 IconCompatParcelizer;
    final /* synthetic */ registerGeofencesWithGeofencingClient RemoteActionCompatParcelizer;
    final /* synthetic */ UserCreationType serializer;
    final /* synthetic */ UserLinkerAsync write;

    public registerGeofencesWithGeofencingClientlambda3(registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient, UserCreationType userCreationType, registerGeofencesWithGeofencingClientlambda31 registergeofenceswithgeofencingclientlambda31, UserLinkerAsync userLinkerAsync) {
        this.RemoteActionCompatParcelizer = registergeofenceswithgeofencingclient;
        this.serializer = userCreationType;
        this.IconCompatParcelizer = registergeofenceswithgeofencingclientlambda31;
        this.write = userLinkerAsync;
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        boolean zWrite = setshouldpersistwebviewwhenbackgroundingapp.write();
        int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
        String strSerializer = "";
        if (!zWrite) {
            if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
                try {
                    strSerializer = setsmallnotificationiconnameandroid_sdk_base_release.serializer();
                } catch (IOException unused) {
                }
            }
            RemoteActionCompatParcelizer(i, strSerializer);
        } else {
            if (setsmallnotificationiconnameandroid_sdk_base_release == null) {
                RemoteActionCompatParcelizer(i, "");
                return;
            }
            registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient = this.RemoteActionCompatParcelizer;
            Optional optional = registergeofenceswithgeofencingclient.write.read(setsmallnotificationiconnameandroid_sdk_base_release.write(), setCustomUserAttributelambda7.IconCompatParcelizer, true);
            if (optional.read()) {
                registergeofenceswithgeofencingclient.serializer.RemoteActionCompatParcelizer("Couldn't deserialize SdkAuth thrift", new Object[0]);
                RemoteActionCompatParcelizer(i, "Unable to deserialize server response");
            } else {
                registerGeofencesWithGeofencingClient.IconCompatParcelizer(registergeofenceswithgeofencingclient, (setCustomUserAttributelambda7) optional.write(), this.serializer, this.IconCompatParcelizer, this.write);
            }
        }
    }

    private void RemoteActionCompatParcelizer(int i, String str) {
        this.RemoteActionCompatParcelizer.serializer.RemoteActionCompatParcelizer("Error creating user: %d %s", Integer.valueOf(i), str);
        this.IconCompatParcelizer.write(i != 401 ? 2 : 1, "Could not authenticate (" + i + "): " + str);
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.RemoteActionCompatParcelizer.serializer.IconCompatParcelizer(false, iOException, "Error creating user", new Object[0]);
        this.IconCompatParcelizer.write(0, "Could not authenticate");
    }
}
