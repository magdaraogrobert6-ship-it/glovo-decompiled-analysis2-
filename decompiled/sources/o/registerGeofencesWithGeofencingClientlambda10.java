package o;

import com.sentiance.sdk.Token;
import com.sentiance.sdk.TokenResultCallback;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
final class registerGeofencesWithGeofencingClientlambda10 implements TokenResultCallback {
    final /* synthetic */ registerGeofencesWithGeofencingClientlambda32 IconCompatParcelizer;
    final /* synthetic */ setEmaillambda0 RemoteActionCompatParcelizer;
    final /* synthetic */ registerGeofencesWithGeofencingClient read;
    final /* synthetic */ String write;

    @Override // com.sentiance.sdk.TokenResultCallback
    public final void onSuccess(Token token) {
        registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient = this.read;
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = registergeofenceswithgeofencingclient.IconCompatParcelizer.write();
        boolean zIconCompatParcelizer = optionalWrite.IconCompatParcelizer();
        registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32 = this.IconCompatParcelizer;
        if (!zIconCompatParcelizer) {
            registergeofenceswithgeofencingclientlambda32.serializer(7, "API token is expired");
            return;
        }
        registergeofenceswithgeofencingclient.read(this.write, optionalWrite.write(), registergeofenceswithgeofencingclientlambda32, this.RemoteActionCompatParcelizer);
    }

    public registerGeofencesWithGeofencingClientlambda10(registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient, String str, registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32, setEmaillambda0 setemaillambda0) {
        this.read = registergeofenceswithgeofencingclient;
        this.write = str;
        this.IconCompatParcelizer = registergeofenceswithgeofencingclientlambda32;
        this.RemoteActionCompatParcelizer = setemaillambda0;
    }

    @Override // com.sentiance.sdk.TokenResultCallback
    public final void onFailure() {
        this.IconCompatParcelizer.serializer(7, "API token is expired");
    }
}
