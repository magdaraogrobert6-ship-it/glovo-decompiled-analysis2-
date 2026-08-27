package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class requestSingleUpdateFromLocationManager extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    public requestSingleUpdateFromLocationManager(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
    }

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 serializer() {
        setSessionTimeout setsessiontimeoutIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer("sdk/on-demand-logs/unfulfilled-requests");
        if (setsessiontimeoutIconCompatParcelizer == null) {
            return null;
        }
        return this.read.RemoteActionCompatParcelizer(setsessiontimeoutIconCompatParcelizer);
    }

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 RemoteActionCompatParcelizer(r8lambdaBwHsy7Qo6OwJ1PFjcbN2fatjzM r8lambdabwhsy7qo6owj1pfjcbn2fatjzm) {
        setSessionTimeout setsessiontimeout = this.RemoteActionCompatParcelizer.read("sdk/on-demand-logs/fulfill-request", r8lambdabwhsy7qo6owj1pfjcbn2fatjzm);
        if (setsessiontimeout == null) {
            return null;
        }
        return this.read.RemoteActionCompatParcelizer(setsessiontimeout);
    }
}
