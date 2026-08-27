package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class initWithContext extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    public initWithContext(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
    }

    public final boolean serializer(String str, r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ r8lambda2qd0wtxyngtmhspveumb06dloaq) {
        setSessionTimeout setsessiontimeout = this.RemoteActionCompatParcelizer.read("sdk/signed-logs-url", new r8lambdaAehyDrn9SAAf5LYIl01vDDsSLM(str));
        if (setsessiontimeout == null) {
            return false;
        }
        this.read.RemoteActionCompatParcelizer(setsessiontimeout).serializer(r8lambda2qd0wtxyngtmhspveumb06dloaq);
        return true;
    }
}
